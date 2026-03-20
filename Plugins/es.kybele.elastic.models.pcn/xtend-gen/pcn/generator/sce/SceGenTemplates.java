package pcn.generator.sce;

import java.util.ArrayList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.IntegerRange;
import pcn.PCNDelayTimeTag;
import pcn.PCNProbabilitiesTag;
import pcn.PCNProcessEntity;
import pcn.PCNProcessStepWithTags;
import pcn.PCNRegularProcessStep;
import pcn.PCNSyncTag;
import pcn.PCNTag;
import pcn.PCNTextualTag;

@SuppressWarnings("all")
public class SceGenTemplates {
  /**
   * Template for the base code (mappings, constructor, modifiers, events)
   * 	@param contratName is the Contract class name
   * 	@param entityAddresses is the template for the Entities addresses
   * 	@param steps is the template for the Steps
   * 	@return the Xtend template for the base code
   */
  public String baseCode(final String contractName, final String entityAddresses, final String steps) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("// SPDX-License-Identifier: GPL-3.0");
    _builder.newLine();
    _builder.newLine();
    _builder.append("pragma solidity >=0.8.2 <0.9.0;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("contract ");
    _builder.append(contractName);
    _builder.append(" {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("struct Entity{");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("uint order;");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("string name;");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("address addr;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("mapping(uint => Entity) private entity;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("mapping(uint => bool) private completedStep;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("mapping(uint => uint) private waitInit;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("mapping(uint => bool) private decision;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("mapping(uint => uint) private delayedDependencyInit;");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("constructor() { ");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append(entityAddresses, "\t\t");
    _builder.append("\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("completedStep[0] = true;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("modifier domain(uint _entity) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("require(msg.sender == entity[_entity].addr,");
    _builder.newLine();
    _builder.append("\t    ");
    _builder.append("\"This step isn\'t part of your domain\");");
    _builder.newLine();
    _builder.append("\t    ");
    _builder.append("_;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("modifier standardDependency(uint _source, uint _target) {");
    _builder.newLine();
    _builder.append("\t    ");
    _builder.append("require(completedStep[_source],");
    _builder.newLine();
    _builder.append("\t    ");
    _builder.append("\"Dependencies not complete for this step\");");
    _builder.newLine();
    _builder.append("\t        ");
    _builder.newLine();
    _builder.append("\t    ");
    _builder.append("require(!completedStep[_target],");
    _builder.newLine();
    _builder.append("\t    ");
    _builder.append("\"This step has already been done\");");
    _builder.newLine();
    _builder.append("\t    ");
    _builder.append("_;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("modifier delayedDependency(uint _source, uint _target, uint _duration) {");
    _builder.newLine();
    _builder.append("\t    ");
    _builder.append("require(completedStep[_source],");
    _builder.newLine();
    _builder.append("\t    ");
    _builder.append("\"Dependencies not complete for this step\");");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t    ");
    _builder.append("require(!completedStep[_target],");
    _builder.newLine();
    _builder.append("\t    ");
    _builder.append("\"This step has already been done\");");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t     ");
    _builder.append("require(block.timestamp >= delayedDependencyInit[_source] + _duration,");
    _builder.newLine();
    _builder.append("\t    ");
    _builder.append("\"You must wait a while before executing this step\");");
    _builder.newLine();
    _builder.append("\t    ");
    _builder.append("_;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("modifier positiveDependency(uint _source, uint _target) {");
    _builder.newLine();
    _builder.append("\t    ");
    _builder.append("require(completedStep[_source],");
    _builder.newLine();
    _builder.append("\t    ");
    _builder.append("\"Dependencies not complete for this step\");");
    _builder.newLine();
    _builder.append("\t        ");
    _builder.newLine();
    _builder.append("\t    ");
    _builder.append("require(!completedStep[_target],");
    _builder.newLine();
    _builder.append("\t    ");
    _builder.append("\"This step has already been done\");");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t    ");
    _builder.append("require(decision[_source]==true,");
    _builder.newLine();
    _builder.append("\t    ");
    _builder.append("\"The decision taken is negative\");");
    _builder.newLine();
    _builder.append("\t    ");
    _builder.append("_;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("modifier negativeDependency(uint _source, uint _target) {");
    _builder.newLine();
    _builder.append("\t    ");
    _builder.append("require(completedStep[_source],");
    _builder.newLine();
    _builder.append("\t    ");
    _builder.append("\"Dependencies not complete for this step\");");
    _builder.newLine();
    _builder.append("\t        ");
    _builder.newLine();
    _builder.append("\t    ");
    _builder.append("require(!completedStep[_target],");
    _builder.newLine();
    _builder.append("\t    ");
    _builder.append("\"This step has already been done\");");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t    ");
    _builder.append("require(decision[_source]==false,");
    _builder.newLine();
    _builder.append("\t    ");
    _builder.append("\"The decision taken is positive\");");
    _builder.newLine();
    _builder.append("\t    ");
    _builder.append("_;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("event StepInfo(string _class, string _domainRegion, int _domainRegionId, string _action);");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("event StepCompleted(address _entity, string _name);");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("event Innovation();");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("event MonetaryCompensationsTag();");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("event MonetaryCostsTag();");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("event NonmonetaryBenefitsTag();");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("event NonmonetaryCostsTag();");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("event TextTag(string _text);");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("event DelayTimeTag(string _time);");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("event ProbabilitiesTag(string _yes, string _no);");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("event SynchronizationTag();");
    _builder.newLine();
    _builder.append("\t");
    _builder.append(steps, "\t");
    _builder.append("\t    \t\t");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    return _builder.toString();
  }

  /**
   * Template for the Entity addresses
   * 	@param entities is the list of Entities
   * 	@param addresses is the list of Entity addresses introduced
   * 	@return the Xtend template for the Entities
   */
  public String entitiesTemplate(final EList<PCNProcessEntity> entities, final ArrayList<String> addresses) {
    StringConcatenation _builder = new StringConcatenation();
    {
      int _size = entities.size();
      boolean _greaterThan = (_size > 0);
      if (_greaterThan) {
        {
          int _size_1 = entities.size();
          int _minus = (_size_1 - 1);
          IntegerRange _upTo = new IntegerRange(0, _minus);
          for(final Integer i : _upTo) {
            _builder.append("entity[");
            _builder.append(i);
            _builder.append("] = Entity(");
            int _order = entities.get((i).intValue()).getOrder();
            _builder.append(_order);
            _builder.append(", \"");
            String _name = entities.get((i).intValue()).getName();
            _builder.append(_name);
            _builder.append("\", ");
            String _get = addresses.get((i).intValue());
            _builder.append(_get);
            _builder.append(");");
            _builder.newLineIfNotEmpty();
          }
        }
        _builder.newLine();
      }
    }
    return _builder.toString();
  }

  /**
   * Template for the Steps
   * 	@param steps is the Steps templates list of an Entity
   * 	@return the Xtend template for the Steps
   */
  public String stepsTemplate(final ArrayList<String> steps) {
    StringConcatenation _builder = new StringConcatenation();
    {
      for(final String step : steps) {
        _builder.append(step);
        _builder.append("    \t\t\t");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder.toString();
  }

  /**
   * Template for Step functions
   * 	@param step is the Step itself
   * 	@param stepId is the Step ID
   * 	@param action is the Step action
   * 	@param entity is the Entity that performs the Step
   * 	@param dependencies is the list of Dependencies with other Steps
   * 	@param domainRegion is the region of the Domain in which the Step is located
   * 	@param tags is the list of Tags that the Step has
   * 	@param body is the exclusive code part of each Step
   * 	@return the Xtend template for the Step function
   */
  public String stepTemplate(final PCNProcessStepWithTags step, final int stepId, final String action, final int entityId, final String dependencies, final String domainRegion, final int domainRegionId, final String tags, final String body) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.newLine();
    _builder.append("function step");
    _builder.append(stepId);
    _builder.append("() public domain(");
    _builder.append(entityId);
    _builder.append(")");
    _builder.newLineIfNotEmpty();
    _builder.append(dependencies);
    _builder.newLineIfNotEmpty();
    _builder.append("{  \t    \t\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("emit StepInfo(\"");
    String _name = step.eClass().getName();
    _builder.append(_name, "\t");
    _builder.append("\", \"");
    _builder.append(domainRegion, "\t");
    _builder.append("\", ");
    _builder.append(domainRegionId, "\t");
    _builder.append(", \"");
    String _action = step.getAction();
    _builder.append(_action, "\t");
    _builder.append("\");");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append(tags, "\t");
    _builder.append("    \t\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append(body, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    return _builder.toString();
  }

  /**
   * Template for Step Dependencies
   * 	@param dependencies is the Dependencies templates list of the Step
   * 	@return the Xtend template for the Dependencies
   */
  public String dependenciesTemplate(final ArrayList<String> dependencies) {
    StringConcatenation _builder = new StringConcatenation();
    {
      for(final String dependency : dependencies) {
        _builder.append(dependency);
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder.toString();
  }

  /**
   * Template for Standard Dependencies
   * 	@param sourceId is the source step ID of the Dependency
   * 	@param targetId is the target step ID of the Dependency
   * 	@return the Xtend template for the standard Dependency
   */
  public String standardDependencyTemplate(final int sourceId, final int targetId) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("standardDependency(");
    _builder.append(sourceId);
    _builder.append(", ");
    _builder.append(targetId);
    _builder.append(")");
    _builder.newLineIfNotEmpty();
    return _builder.toString();
  }

  /**
   * Template for Delayed Dependencies
   * 	@param sourceId is the source step ID of the Dependency
   * 	@param targetId is the target step ID of the Dependency
   * 	@param dependencyDelay is the delay itroduced for the Dependency
   * 	@return the Xtend template for the Delayed Dependency
   */
  public String delayedDependencyTemplate(final int sourceId, final int targetId, final int dependencyDelay) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("delayedDependency(");
    _builder.append(sourceId);
    _builder.append(", ");
    _builder.append(targetId);
    _builder.append(", ");
    _builder.append(dependencyDelay);
    _builder.append(")");
    _builder.newLineIfNotEmpty();
    return _builder.toString();
  }

  /**
   * Template for Positive Dependencies
   * 	@param sourceId is the source step ID of the Dependency
   * 	@param targetId is the target step ID of the Dependency
   * 	@return the Xtend template for the Positive Dependency
   */
  public String positiveDependencyTemplate(final int sourceId, final int targetId) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("positiveDependency(");
    _builder.append(sourceId);
    _builder.append(", ");
    _builder.append(targetId);
    _builder.append(")");
    _builder.newLineIfNotEmpty();
    return _builder.toString();
  }

  /**
   * Template for Negative Dependencies
   * 	@param sourceId is the source step ID of the Dependency
   * 	@param targetId is the target step ID of the Dependency
   * 	@return the Xtend template for the Negative Dependency
   */
  public String negativeDependencyTemplate(final int sourceId, final int targetId) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("negativeDependency(");
    _builder.append(sourceId);
    _builder.append(", ");
    _builder.append(targetId);
    _builder.append(")");
    _builder.newLineIfNotEmpty();
    return _builder.toString();
  }

  /**
   * Template for Step Tags
   * 	@param tags is the Tags list of the Step
   * 	@param delayTimeTah is the possible DelayTime tag of the Step
   * 	@param probabilitiesTag is the possible Probabilities Tag of the Step
   * 	@param syncTag is the possible Sync Tag of the Step
   * 	@return the Xtend template for the Step Tags
   */
  public String tagsTemplate(final EList<PCNTag> tags, final PCNDelayTimeTag delayTimeTag, final PCNProbabilitiesTag probabilitiesTag, final PCNSyncTag syncTag) {
    StringConcatenation _builder = new StringConcatenation();
    {
      for(final PCNTag tag : tags) {
        CharSequence _switchResult = null;
        String _name = tag.eClass().getName();
        if (_name != null) {
          switch (_name) {
            case "PCNNonMonetaryBenefit":
              _switchResult = "emit NonmonetaryBenefitsTag();";
              break;
            case "PCNNonMonetaryCost":
              _switchResult = "emit NonmonetaryCostsTag();";
              break;
            case "PCNMonetaryBenefit":
              _switchResult = "emit MonetaryCompensationsTag();";
              break;
            case "PCNMonetaryCost":
              _switchResult = "emit MonetaryCostsTag();";
              break;
            case "PCNTextualTag":
              StringConcatenation _builder_1 = new StringConcatenation();
              _builder_1.append("emit TextTag(\"");
              String _tag = ((PCNTextualTag) tag).getTag();
              _builder_1.append(_tag);
              _builder_1.append("\");");
              _switchResult = _builder_1;
              break;
          }
        }
        _builder.append(_switchResult);
        _builder.newLineIfNotEmpty();
      }
    }
    {
      if ((probabilitiesTag != null)) {
        _builder.append("emit ProbabilitiesTag(\"");
        String _yesProbability = probabilitiesTag.getYesProbability();
        _builder.append(_yesProbability);
        _builder.append("\", \"");
        String _noProbability = probabilitiesTag.getNoProbability();
        _builder.append(_noProbability);
        _builder.append("\");");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      if ((delayTimeTag != null)) {
        _builder.append("emit DelayTimeTag(\"");
        String _delayTime = delayTimeTag.getDelayTime();
        _builder.append(_delayTime);
        _builder.append("\");");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      if ((syncTag != null)) {
        _builder.append("emit SynchronizationTag();");
        _builder.newLine();
      }
    }
    return _builder.toString();
  }

  /**
   * Template for the body of a Standard Step function
   * 	@param step is the Step itself
   * 	@param stepId is the Step ID
   * 	@param action is the Step action
   * 	@return the Xtend template for the Standard Step function
   */
  public String standardStepTemplate(final PCNRegularProcessStep step, final int stepId, final String action) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.newLine();
    _builder.append("//");
    _builder.newLine();
    _builder.append("// Functional logic");
    _builder.newLine();
    _builder.append("//");
    _builder.newLine();
    _builder.newLine();
    _builder.append("emit StepCompleted(msg.sender, \"Done: ");
    _builder.append(action);
    _builder.append("\");");
    _builder.newLineIfNotEmpty();
    _builder.append("completedStep[");
    _builder.append(stepId);
    _builder.append("] = true;");
    _builder.newLineIfNotEmpty();
    {
      boolean _isEmpty = step.getPCNDelayedDependency().isEmpty();
      boolean _not = (!_isEmpty);
      if (_not) {
        _builder.newLine();
        _builder.append("delayedDependencyInit[");
        _builder.append(stepId);
        _builder.append("] = block.timestamp;\t");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder.toString();
  }

  /**
   * Template for the body of a DoAndWait Step function
   * 	@param step is the Step itself
   * 	@param stepId is the Step ID
   * 	@param action is the Step action
   * 	@param waitingTime is the waiting time introduced for the Step
   * 	@return the Xtend template for the DoAndWait Step function
   */
  public String doAndWaitStepTemplate(final PCNRegularProcessStep step, final int stepId, final String action, final int waitingTime) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.newLine();
    _builder.append("if (waitInit[");
    _builder.append(stepId);
    _builder.append("]==0) {");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("//");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("// Functional logic");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("//");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("waitInit[");
    _builder.append(stepId, "\t");
    _builder.append("] = block.timestamp;");
    _builder.newLineIfNotEmpty();
    _builder.append("} else {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("require(block.timestamp >= waitInit[");
    _builder.append(stepId, "\t");
    _builder.append("] + ");
    _builder.append(waitingTime, "\t");
    _builder.append(",");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("\"Wait not finished yet\");");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("emit StepCompleted(msg.sender, \"Done: ");
    _builder.append(action, "\t");
    _builder.append("\");");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("completedStep[");
    _builder.append(stepId, "\t");
    _builder.append("] = true;");
    _builder.newLineIfNotEmpty();
    {
      boolean _isEmpty = step.getPCNDelayedDependency().isEmpty();
      boolean _not = (!_isEmpty);
      if (_not) {
        _builder.newLine();
        _builder.append("\t");
        _builder.append("delayedDependencyInit[");
        _builder.append(stepId, "\t");
        _builder.append("] = block.timestamp;\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("}");
    _builder.newLine();
    return _builder.toString();
  }

  /**
   * Template for the body of a Innovation Step function
   * 	@param step is the Step itself
   * 	@param stepId is the Step ID
   * 	@param action is the Step action
   * 	@return the Xtend template for the Innovation Step function
   */
  public String innovationStepTemplate(final PCNRegularProcessStep step, final int stepId, final String action) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.newLine();
    _builder.append("//");
    _builder.newLine();
    _builder.append("// Functional logic");
    _builder.newLine();
    _builder.append("//");
    _builder.newLine();
    _builder.newLine();
    _builder.append("emit Innovation();");
    _builder.newLine();
    _builder.append("emit StepCompleted(msg.sender, \"Done: ");
    _builder.append(action);
    _builder.append("\");");
    _builder.newLineIfNotEmpty();
    _builder.append("completedStep[");
    _builder.append(stepId);
    _builder.append("] = true;");
    _builder.newLineIfNotEmpty();
    {
      boolean _isEmpty = step.getPCNDelayedDependency().isEmpty();
      boolean _not = (!_isEmpty);
      if (_not) {
        _builder.newLine();
        _builder.append("delayedDependencyInit[");
        _builder.append(stepId);
        _builder.append("] = block.timestamp;\t");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder.toString();
  }

  /**
   * Template for the body of a Outsourced Step function
   * 	@param step is the Step itself
   * 	@param stepId is the Step ID
   * 	@param action is the Step action
   * 	@param outsource is the outsource address introduced for the Step
   * 	@return the Xtend template for the Outsourced Step function
   */
  public String outsourcedStepTemplate(final PCNRegularProcessStep step, final int stepId, final String action, final String outsource) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.newLine();
    _builder.append("//");
    _builder.newLine();
    _builder.append("// Functional logic");
    _builder.newLine();
    _builder.append("//");
    _builder.newLine();
    _builder.newLine();
    _builder.append("address outsource = ");
    _builder.append(outsource);
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.append("emit StepCompleted(outsource, \"Done: ");
    _builder.append(action);
    _builder.append("\");");
    _builder.newLineIfNotEmpty();
    _builder.append("completedStep[");
    _builder.append(stepId);
    _builder.append("] = true;");
    _builder.newLineIfNotEmpty();
    {
      boolean _isEmpty = ((PCNRegularProcessStep) step).getPCNDelayedDependency().isEmpty();
      boolean _not = (!_isEmpty);
      if (_not) {
        _builder.newLine();
        _builder.append("delayedDependencyInit[");
        _builder.append(stepId);
        _builder.append("] = block.timestamp;\t");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder.toString();
  }

  /**
   * Template for the body of a Wait Step function
   * 	@param step is the Step itself
   * 	@param stepId is the Step ID
   * 	@param action is the Step action
   * 	@param waitingTime is the waiting time introduced for the Step
   * 	@return the Xtend template for the Wait Step function
   */
  public String waitStepTemplate(final PCNRegularProcessStep step, final int stepId, final String action, final int waitingTime) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.newLine();
    _builder.append("if (waitInit[");
    _builder.append(stepId);
    _builder.append("]==0) {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("waitInit[");
    _builder.append(stepId, "\t");
    _builder.append("] = block.timestamp;");
    _builder.newLineIfNotEmpty();
    _builder.append("} else {\t\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("require(block.timestamp >= waitInit[");
    _builder.append(stepId, "\t");
    _builder.append("] + ");
    _builder.append(waitingTime, "\t");
    _builder.append(",");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("\"Wait not finished yet\");");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("emit StepCompleted(msg.sender, \"Done: ");
    _builder.append(action, "\t");
    _builder.append("\");");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("completedStep[");
    _builder.append(stepId, "\t");
    _builder.append("] = true;");
    _builder.newLineIfNotEmpty();
    {
      boolean _isEmpty = ((PCNRegularProcessStep) step).getPCNDelayedDependency().isEmpty();
      boolean _not = (!_isEmpty);
      if (_not) {
        _builder.newLine();
        _builder.append("\t");
        _builder.append("delayedDependencyInit[");
        _builder.append(stepId, "\t");
        _builder.append("] = block.timestamp;\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("}");
    _builder.newLine();
    return _builder.toString();
  }

  /**
   * Template for the body of a Decision Step function
   * 	@param step is the Step itself
   * 	@param stepId is the Step ID
   * 	@param action is the Step action
   * 	@return the Xtend template for the Decision Step function
   */
  public String decisionStepTemplate(final PCNProcessStepWithTags step, final int stepId, final String action) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.newLine();
    _builder.append("bool selection;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("//");
    _builder.newLine();
    _builder.append("// Functional logic using \'selection\' variable to decide between");
    _builder.newLine();
    _builder.append("// the affirmative dependency (variable set to \'true\')");
    _builder.newLine();
    _builder.append("// or the negative dependency (variable set to \'false\')");
    _builder.newLine();
    {
      PCNProbabilitiesTag _probabilitiesTags = step.getProbabilitiesTags();
      boolean _tripleNotEquals = (_probabilitiesTags != null);
      if (_tripleNotEquals) {
        _builder.append("// Keep in mind the probability of each decision indicated in the Tag event");
        _builder.newLine();
        _builder.append("// Yes: ");
        String _yesProbability = step.getProbabilitiesTags().getYesProbability();
        _builder.append(_yesProbability);
        _builder.append(", No: ");
        String _noProbability = step.getProbabilitiesTags().getNoProbability();
        _builder.append(_noProbability);
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("//");
    _builder.newLine();
    _builder.newLine();
    _builder.append("if (!selection) {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("decision[");
    _builder.append(stepId, "\t");
    _builder.append("] = false;");
    _builder.newLineIfNotEmpty();
    _builder.append("} else {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("decision[");
    _builder.append(stepId, "\t");
    _builder.append("] = true;");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("emit StepCompleted(msg.sender, \"Done: ");
    _builder.append(action);
    _builder.append("\");");
    _builder.newLineIfNotEmpty();
    _builder.append("completedStep[");
    _builder.append(stepId);
    _builder.append("] = true;");
    _builder.newLineIfNotEmpty();
    return _builder.toString();
  }
}
