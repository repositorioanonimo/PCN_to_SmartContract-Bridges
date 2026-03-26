# Technological bridges between PCN and Smart Contracts

This project is a set of tools that act as technological bridges between the business notation **PCN** (Process Chain Network) and **smart contracts**, aiming to bring this technology closer to business professionals. These tools enable the transformation of PCN diagrams into smart contracts written in Solidity and vice versa, both modeled under the MDE (Model-Driven Engineering) paradigm.

The tools are integrated with the following plugins in the Eclipse IDE:
* [**INNoVaServ**](https://github.com/repositorioanonimo/AnonymizedTool): A modeling environment for service design that supports various business notations.

  The PCN model definition provided by this environment includes a package that integrates the **PCN - smart contract bridge** functionality, enabling the generation of smart contracts in the form of SmaC models (*.sce*) from PCN models (*.pcn*).
  
* [**SmaC**](https://github.com/repositorioanonimo/AnonymizedDSL/tree/main): A textual DSL that supports the coding of smart contracts written in Solidity.

  The definition of this DSL includes a package that integrates the **smart contract - PCN bridge** functionality, allowing the generation of PCN models (*.pcn*) from smart contracts in the form of SmaC models (*.sce*) in a specific format.

## PCN - Smart Contract bridge

To transform a PCN model into a smart contract model, simply right-click on the target PCN model in Eclipse's *Package Explorer*, select ***Generate Solidity code***, and fill in the required data to generate the resulting *.sce* file in the *sce-gen* directory.

![PCN - Smart Contract Bridge](https://github.com/repositorioanonimo/PCN_to_SmartContract-Bridges/blob/main/Videos/PCN-SmartContract_Demo.gif)

The tool is implemented in the [***pcn.generator.sce***](https://github.com/repositorioanonimo/PCN_to_SmartContract-Bridges/tree/main/Plugins/es.kybele.elastic.models.pcn/src/pcn/generator/sce) package and follows this architecture:

![PCN - Smart Contract Bridge Architecture](https://github.com/repositorioanonimo/PCN_to_SmartContract-Bridges/blob/main/Images/Oculto_PCN-SmartContract_Arch.PNG)

## SmaC model - PCN bridge

To transform a smart contract (SmaC model) into a PCN model, simply right-click on the target Anonymous model in Eclipse's *Package Explorer* and select ***Generate PCN model*** to generate the resulting *.pcn* file in the *pcn-gen* directory.

![Smart Contract - PCN Bridge](https://github.com/repositorioanonimo/PCN_to_SmartContract-Bridges/blob/main/Videos/SmartContract-PCN_Demo.gif)

The tool is implemented in the [***sce.generator.pcn***](https://github.com/repositorioanonimo/PCN_to_SmartContract-Bridges/tree/main/Plugins/org.xtext.ui/xtend-gen/sce/generator/pcn) package and follows this architecture:

![Smart Contract - PCN Bridge Architecture](https://github.com/repositorioanonimo/PCN_to_SmartContract-Bridges/blob/main/Images/Oculto_SmartContract-PCN_Arch.PNG)

### From process model to SmaC model

The next figure provides a structured and concise overview of the algorithm implemented by the technological bridge, which facilitates the generation of a SC model from a PCN model. The algorithm consists of a set of routines, referred to here as subprocesses.

![Algorithm for SmaC model generation](https://github.com/repositorioanonimo/PCN_to_SmartContract-Bridges/blob/main/Images/GenProcessPCN.PNG)

Before providing a detailed exposition of the process, it is useful to first outline the general overview of the generation method employed. The code generator extracts and processes the resource components of the PCN model, transforming them into Solidity code. To achieve this, the generator interacts with the interface manager when user design decisions are required, while the template manager supplies predefined code templates populated with data processed by the generator. By leveraging these components, the code generator systematically assembles the templates, ultimately producing the final source code file containing the Solidity smart contract. It is important to note that the contract generated through the execution of this algorithm is automatically persisted as an EMF model by the Anonymous DSL framework, as depicted in the upper part of Figure `PCN-SC_Comp`.

The process begins with the extraction of resources from the PCN model. The code generator first retrieves the resource diagram object along with a list of entity objects it contains. Next, the contract class name is generated to match the name of the input model file. The generator then invokes a subprocess responsible for generating the complete code. Once the code is generated, it is written into an empty file, finalizing the contract generation and completing the process. This subprocess is explained below, along with the rest of subprocess it bundles.

- **Code:** This subprocess originates from the main process with the objective of generating and returning the complete Solidity code in the form of a template. To achieve this, it utilizes the diagram object, the list of entity objects, and the contract class name. First, each entity is assigned an identifier, and from each entity, the step objects are extracted and also assigned identifiers. Both entities and steps are then stored in separate maps, using their respective identifiers as keys.

  Next, the generator invokes two additional subprocesses: one responsible for obtaining the template that represents the entities in Solidity and another for obtaining the template that represents the steps. These subprocesses, referred to as Entities and General Steps, are explained below. The templates generated by each subprocess are then sent, along with the contract class name, to the interface manager. The interface manager integrates these elements with the base template shown in Figure `SC_base`, enabling the generation and return of the final Solidity code.

- **Entities:** This subprocess is responsible for generating and returning the template containing the declaration lines with Ethereum addresses representing the PCN entities. To achieve this, it processes the list of entities. If at least one entity is present, the list is sent to the interface manager, which launches an interface for the user to associate an Ethereum address with each entity.

  Once the list of entity-associated Ethereum addresses is obtained—whether empty or populated—it is sent, along with the entity list, to the template manager. The template manager then constructs the declaration line for each entity, as illustrated in Figure `SC_entity`, and returns them as a unified template. Finally, the generated entities template is sent back to the *Code subprocess* that requested it.

- **General steps:** This subprocess, also derived from the *Code subprocess*, is responsible for generating the template that contains all the functions of the smart contract representing the PCN steps. It begins by creating a list to store the step templates. Then, for each entity, it retrieves the step objects from each domain region within that entity.

  For each step object, another subprocess (explained below) is invoked to generate the specific template for that step, which is then added to the list. Once all step templates have been generated, the list—whether empty or populated—is sent to the template manager, which consolidates them into a single template integrating all step functions. The final template is then returned to the *Code subprocess*.

- **Specific Step:** This subprocess is responsible for generating the template that defines and implements a specific step function. It receives input from the higher-level subprocess, including the identifier of the entity to which the step belongs, the step object itself, a string identifying the domain region within its entity, and an identifier indicating its position within that region.

  First, the subprocess retrieves the template containing the dependencies and the template representing the tags in Solidity for the step function. Both of these are obtained through lower-level subprocesses, which will be discussed later. Next, the step body template is generated—this is a unique code fragment within the function that varies depending on the step type. To accomplish this, the string identifier of the step type is extracted, and the template manager is called to generate the corresponding step body template.

  For steps that involve waiting, such as the *Wait Step* and the *Do & Wait Step*, an additional action is performed before calling the template manager. The interface manager is invoked to prompt the user to input the desired wait time for the step. This value, along with the necessary data, is then sent to the template manager to generate the appropriate step body template.

  Once the templates representing the dependencies and tags of the step have been obtained, along with the step body template, they are sent to the template manager, which finalizes the complete implementation of the function. The resulting template, similar to the one shown in Figure `SC_step`, is then returned to the subprocess that requested it.

- **Dependencies:** This subprocess is responsible for generating the template containing the function modifiers that represent a step’s incoming dependencies. It takes the step object as input and initializes a list to store individual dependency templates. It then checks whether the step has source dependencies; if so, it retrieves each incoming dependency object along with the identifier of the originating source step.

  For each dependency object, and depending on its dependency type, the identifiers of the source and target steps are sent to the template manager to generate the corresponding dependency template, which is then added to the list. Additionally, for delayed dependencies, the interface manager is called to prompt the user to input the desired delay time. This information is subsequently passed to the template manager.

  Finally, the list of dependency templates is sent to the template manager, which consolidates them into a single dependencies template. This unified template is then forwarded to the *Specific step subprocess*.

- **Tags:** This subprocess provides the Specific Step Subprocess with a template that emits events representing a step’s tags. It receives the step object and extracts the tag objects contained within it, storing them as a list. Regardless of whether this list is empty or populated, it is then sent to the template manager, which constructs the tags template by aggregating the code for all tags associated with the step. Finally, the generated template is sent back to the *Specific step subprocess*.

### Generating a PCN model from a SC model

Before digging into the transformation details, it is worth noting that EMF models are persisted as XMI (XML Metadata Interchange) files. This technological bridge is therefore in charge of generating an XMI file from the corresponding SmaC model. The algorithm implemented by the bridge to achieve this is illustrated in Figure `GenProcessPCN`.

![Algorithm for PCN model generation](https://github.com/repositorioanonimo/PCN_to_SmartContract-Bridges/blob/main/Images/GenProcessSC.PNG)

Regarding the process described in the last section, the interface manager is no longer needed here, as all the data required to build the PCN model is contained in the smart contract. In this way, the code generator only relies on a template manager to obtain different template layers, which are then combined to compose the output model. 

The process begins by receiving the SmaC model resource along with an empty file, where the XMI code of the resulting PCN model will be written. First, the code generator retrieves the contract object from the resource, and then another generator function is invoked to initiate the *Code subprocess*, which is explained below. This subprocess generates the entire XMI code as a template. Finally, the generated template containing the code is written into the empty file, effectively converting it into the output PCN model, thus completing the process.

- **Code:** This subprocess, derived from the main process, receives the contract object from the resource and is responsible for generating the full XMI code template. The process begins by retrieving the constructor object from the contract. From the constructor, the declaration lines representing the entities of the diagram are extracted. Next, the subprocess gathers a list of function objects that correspond to the steps in the process. Subsequently, it invokes the *Entities* subprocess, detailed below, to generate a template containing the XMI elements for the entities, including their associated sub-elements. This generated template is then passed to the template manager, which combines it with a base template that includes the XMI declaration for the output model. Once the final combined template is obtained, it is returned to the main process.

- **Entities:** After obtaining the declaration lines from the higher-level process, this subprocess is responsible for generating the XMI template that defines the entities in the diagram. To achieve this, it extracts the orders and names from each declaration line and stores them in separate lists, each dedicated to one of the attributes. Since each XMI entity also contains its steps, another subprocess is invoked to generate a list of step templates for each entity. The extracted orders, names, and step lists are then sent to the template manager, which combines them into the final entities template, ready to be returned to the calling subprocess.

- **General steps:** This subprocess receives the list of entity declaration lines and is responsible for obtaining and returning the XMI templates for the set of steps of each entity. The procedure is repeated for each entity to generate its corresponding steps template, which is then stored in a list to be returned to the higher-level subprocess. During each iteration, the step functions belonging to the current entity are retrieved from the list created in the *Code subprocess*. This is done by extracting the argument of the domain modifier attached to each step, which should match the identifier of the entity being processed. 

  For each step function associated with the entity, a subsequent *Specific step* subprocess is called to generate the template for that specific step. The generated step templates are temporarily stored in a list alongside the other step templates for the same entity. This temporary list is then sent to the template manager, which combines the templates to generate the final steps template. The combined template is returned to the higher-level subprocess, completing the iteration.

- **Specific step:** This subprocess focuses on each step individually, extracting its attributes to create a step template from a step function. Some of the attributes are extracted from the event present in all step functions, which stores parameters that contain data about the step. These parameters include the step type and the domain region of the step's action, both of which are represented as strings and can be incorporated into the templates. The remaining necessary attributes are the dependencies and tags, for which templates are generated through subprocesses described below. Once all these attributes are gathered, they are sent to the template manager, which constructs the final step template. This completed template is then returned to the higher-level subprocess.

- **Dependencies:** As part of the *Specific step* subprocess, this component is responsible for obtaining the list of templates that represent the step's dependencies as XMI attributes. To accomplish this, it receives the step function and the string identifier of the step type.

  The process begins by retrieving the step identifier from the name of its function. A list is then created, initially empty, to store a template for each type of dependency. Next, the names of the dependency modifiers and their associated parameters are extracted from each step function in the contract, and these are stored in separate lists for further processing. The dependencies for each step are iterated over to identify any incoming or outgoing dependencies related to the step in question. Depending on the type of dependency identified, the template manager is called to retrieve the appropriate template for the dependency, which is then added to the corresponding empty template. After all relevant dependencies have been processed, the templates for the corresponding dependency types are stored, now complete, in the initial list. This list is then returned to the *Specific step* subprocess.

- **Tags subprocess:** As a component of the *Specific step* subprocess, this subprocess retrieves the XMI code template that represents the tags attached to a step. To do this, it receives the function of the step and the string identifier of its type. First, it extracts the list of events contained within the function. The step type identifier is then used to filter out events that do not correspond to tags, as it is important to note that each function has a unique structure depending on the type of step it represents. Once the events related to tags are identified, their names and parameters are separated into different lists, linking each name with its respective parameters using the indexes of the lists. These lists are then passed to the template manager, which generates the template containing the corresponding tags. Finally, the subprocess returns the generated template.
