# Technological bridges between PCN and Smart Contracts

This project is a set of tools that act as technological bridges between the business notation **PCN** (Process Chain Network) and **smart contracts**, aiming to bring this technology closer to business professionals. These tools enable the transformation of PCN diagrams into smart contracts written in Solidity and vice versa, both modeled under the MDE (Model-Driven Engineering) paradigm.

The tools are integrated with the following plugins in the Eclipse IDE:
* [**INNoVaServ**](https://github.com/franciscoperezb/innovaserv_toolkit): A modeling environment for service design that supports various business notations.

  The PCN model definition provided by this environment includes a package that integrates the **PCN - smart contract bridge** functionality, enabling the generation of smart contracts in the form of SmaC models (*.sce*) from PCN models (*.pcn*).
  
* [**SmaC**](https://github.com/CommITURJC/SmaC): A textual DSL that supports the coding of smart contracts written in Solidity.

  The definition of this DSL (SmaC model) includes a package that integrates the **smart contract - PCN bridge** functionality, allowing the generation of PCN models (*.pcn*) from smart contracts in the form of SmaC models (*.sce*) in a specific format.

## PCN - Smart Contract bridge

To transform a PCN model into a smart contract, simply right-click on the target PCN model in Eclipse's *Package Explorer*, select ***Generate Solidity code***, and fill in the required data to generate the resulting *.sce* file in the *sce-gen* directory.

![PCN - Smart Contract Bridge](https://github.com/alv4rob/PCN-SmartContract-Bridges/blob/main/Videos/PCN-SmartContract_Demo.gif)

The tool is implemented in the [***pcn.generator.sce***](https://github.com/alv4rob/PCN-SmartContract-Bridges/blob/main/Plugins/es.kybele.elastic.models.pcn/src/pcn/generator/sce/) package and follows this architecture:

![PCN - Smart Contract Bridge Architecture](https://github.com/alv4rob/PCN-SmartContract-Bridges/blob/main/Images/PCN-SmartContract_Arch.png)

## Smart Contract - PCN bridge

To transform a smart contract into a PCN model, simply right-click on the target SmaC model in Eclipse's *Package Explorer* and select ***Generate PCN model*** to generate the resulting *.pcn* file in the *pcn-gen* directory.

![Smart Contract - PCN Bridge](https://github.com/alv4rob/PCN-SmartContract-Bridges/blob/main/Videos/SmartContract-PCN_Demo.gif)

The tool is implemented in the [***sce.generator.pcn***](https://github.com/alv4rob/PCN-SmartContract-Bridges/blob/main/Plugins/org.xtext.ui/src/sce/generator/pcn/) package and follows this architecture:

![Smart Contract - PCN Bridge Architecture](https://github.com/alv4rob/PCN-SmartContract-Bridges/blob/main/Images/SmartContract-PCN_Arch.png)
