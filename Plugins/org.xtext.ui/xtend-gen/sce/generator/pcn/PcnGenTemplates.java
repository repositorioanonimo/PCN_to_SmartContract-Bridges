package sce.generator.pcn;

import com.google.common.base.Objects;
import java.util.ArrayList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.IntegerRange;

@SuppressWarnings("all")
public class PcnGenTemplates {
  /**
   * Template for the base XMI code
   * 	@param entities is the template for the Entities
   * 	@return the Xtend template for the base XMI code
   */
  public String baseCode(final String entities) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
    _builder.newLine();
    _builder.append("<pcn:PCNDiagram xmi:version=\"2.0\" xmlns:xmi=\"http://www.omg.org/XMI\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:pcn=\"http://www.kybele.es/elastic/models/pcn/1.0\">");
    _builder.newLine();
    _builder.append("  ");
    _builder.append(entities, "  ");
    _builder.newLineIfNotEmpty();
    _builder.append("</pcn:PCNDiagram>");
    _builder.newLine();
    return _builder.toString();
  }

  /**
   * Template for the Entities XMI
   * 	@param orders is the list of Entities orders
   * 	@param names is the list of Entities names
   * 	@param steps is the templates list for the Steps XMI code
   * 	@return the Xtend template for the Entities XMI code
   */
  public String entitiesTemplate(final ArrayList<String> orders, final ArrayList<String> names, final ArrayList<String> steps) {
    StringConcatenation _builder = new StringConcatenation();
    {
      int _size = orders.size();
      boolean _greaterThan = (_size > 0);
      if (_greaterThan) {
        {
          int _size_1 = orders.size();
          int _minus = (_size_1 - 1);
          IntegerRange _upTo = new IntegerRange(0, _minus);
          for(final Integer i : _upTo) {
            _builder.append("<diagramEntities name=\"");
            String _get = names.get((i).intValue());
            _builder.append(_get);
            _builder.append("\" order=\"");
            String _get_1 = orders.get((i).intValue());
            _builder.append(_get_1);
            _builder.append("\">");
            _builder.newLineIfNotEmpty();
            _builder.append("  ");
            String _get_2 = steps.get((i).intValue());
            _builder.append(_get_2, "  ");
            _builder.newLineIfNotEmpty();
            _builder.append("</diagramEntities>");
            _builder.newLine();
          }
        }
      }
    }
    return _builder.toString();
  }

  /**
   * Template for the Steps XMI code
   * 	@param steps is the templates list for the Steps XMI code
   * 	@return the Xtend template for the Steps XMI code
   */
  public String stepsTemplate(final ArrayList<String> steps) {
    StringConcatenation _builder = new StringConcatenation();
    {
      for(final String step : steps) {
        _builder.append(step);
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder.toString();
  }

  /**
   * Template for a Step XMI code
   * 	@param type is the Step type of the Step
   * 	@param domainRegion is the domain region of the Step
   * 	@param action is the action of the step
   * 	@param dependencies is the templates list for the Dependencies XMI code
   * 	@param tags is the templates for the Tags XMI code
   * 	@return the Xtend template for the Step function
   */
  public String stepTemplate(final String type, final String domainRegion, final String action, final ArrayList<String> dependencies, final String tags) {
    StringConcatenation _builder = new StringConcatenation();
    {
      boolean _equals = Objects.equal(type, "PCNDecisionStep");
      if (_equals) {
        _builder.append("<");
        _builder.append(domainRegion);
        _builder.append(" xsi:type=\"pcn:");
        _builder.append(type);
        _builder.append("\" PCNStandardDependencySource=\"");
        String _get = dependencies.get(0);
        _builder.append(_get);
        _builder.append("\" PCNDelayedDependencySource=\"");
        String _get_1 = dependencies.get(1);
        _builder.append(_get_1);
        _builder.append("\" PCNPositiveDecisionSource=\"");
        String _get_2 = dependencies.get(2);
        _builder.append(_get_2);
        _builder.append("\" PCNNegativeDecisionSource=\"");
        String _get_3 = dependencies.get(3);
        _builder.append(_get_3);
        _builder.append("\" action=\"");
        _builder.append(action);
        _builder.append("\" PCNPositiveDecision=\"");
        String _get_4 = dependencies.get(4);
        _builder.append(_get_4);
        _builder.append("\" PCNNegativeDecision=\"");
        String _get_5 = dependencies.get(5);
        _builder.append(_get_5);
        _builder.append("\">");
        _builder.newLineIfNotEmpty();
        _builder.append("  ");
        _builder.append(tags, "  ");
        _builder.newLineIfNotEmpty();
        _builder.append("</");
        _builder.append(domainRegion);
        _builder.append(">");
        _builder.newLineIfNotEmpty();
      } else {
        _builder.append("<");
        _builder.append(domainRegion);
        _builder.append(" xsi:type=\"pcn:");
        _builder.append(type);
        _builder.append("\" PCNStandardDependencySource=\"");
        String _get_6 = dependencies.get(0);
        _builder.append(_get_6);
        _builder.append("\" PCNDelayedDependencySource=\"");
        String _get_7 = dependencies.get(1);
        _builder.append(_get_7);
        _builder.append("\" PCNPositiveDecisionSource=\"");
        String _get_8 = dependencies.get(2);
        _builder.append(_get_8);
        _builder.append("\" PCNNegativeDecisionSource=\"");
        String _get_9 = dependencies.get(3);
        _builder.append(_get_9);
        _builder.append("\" action=\"");
        _builder.append(action);
        _builder.append("\" PCNStandardDependency=\"");
        String _get_10 = dependencies.get(4);
        _builder.append(_get_10);
        _builder.append("\" PCNDelayedDependency=\"");
        String _get_11 = dependencies.get(5);
        _builder.append(_get_11);
        _builder.append("\">");
        _builder.newLineIfNotEmpty();
        _builder.append("  ");
        _builder.append(tags, "  ");
        _builder.newLineIfNotEmpty();
        _builder.append("</");
        _builder.append(domainRegion);
        _builder.append(">");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder.toString();
  }

  /**
   * Template for a Dependency XMI code
   * 	@param entityId is the Entity ID of the Dependency Step
   * 	@param domainRegion is the domain region of the Dependency Step
   * 	@param domainRegionId is the domain region ID of the Dependency Step
   * 	@return the Xtend template for a Dependency XMI code
   */
  public String dependencyTemplate(final String entityId, final String domainRegion, final String domainRegionId) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("//@diagramEntities.");
    _builder.append(entityId);
    _builder.append("/@");
    _builder.append(domainRegion);
    _builder.append(".");
    _builder.append(domainRegionId);
    return _builder.toString();
  }

  /**
   * Template for Step Tags XMI code
   * 	@param tags is the list of Tag names
   * 	@param tagParams is the list of Tag parameters
   * 	@return the Xtend template for the Step Tags XMI code
   */
  public String tagsTemplate(final ArrayList<String> tagNames, final ArrayList<ArrayList<String>> tagParams) {
    StringConcatenation _builder = new StringConcatenation();
    {
      int _size = tagNames.size();
      boolean _greaterThan = (_size > 0);
      if (_greaterThan) {
        {
          int _size_1 = tagNames.size();
          int _minus = (_size_1 - 1);
          IntegerRange _upTo = new IntegerRange(0, _minus);
          for(final Integer i : _upTo) {
            CharSequence _switchResult = null;
            String _get = tagNames.get((i).intValue());
            if (_get != null) {
              switch (_get) {
                case "NonmonetaryBenefitsTag":
                  StringConcatenation _builder_1 = new StringConcatenation();
                  _builder_1.append("<nonMonetaryBenefits/>");
                  _switchResult = _builder_1;
                  break;
                case "NonmonetaryCostsTag":
                  StringConcatenation _builder_2 = new StringConcatenation();
                  _builder_2.append("<nonMonetaryCosts/>");
                  _switchResult = _builder_2;
                  break;
                case "MonetaryCompensationsTag":
                  StringConcatenation _builder_3 = new StringConcatenation();
                  _builder_3.append("<monetaryBenefits/>");
                  _switchResult = _builder_3;
                  break;
                case "MonetaryCostsTag":
                  StringConcatenation _builder_4 = new StringConcatenation();
                  _builder_4.append("<monetaryCosts/>");
                  _switchResult = _builder_4;
                  break;
                case "TextTag":
                  StringConcatenation _builder_5 = new StringConcatenation();
                  _builder_5.append("<textualTags tag=\"");
                  String _get_1 = tagParams.get((i).intValue()).get(0);
                  _builder_5.append(_get_1);
                  _builder_5.append("\"/>");
                  _switchResult = _builder_5;
                  break;
                case "ProbabilitiesTag":
                  StringConcatenation _builder_6 = new StringConcatenation();
                  _builder_6.append("<probabilitiesTags yesProbability=\"");
                  String _get_2 = tagParams.get((i).intValue()).get(0);
                  _builder_6.append(_get_2);
                  _builder_6.append("\" noProbability=\"");
                  String _get_3 = tagParams.get((i).intValue()).get(1);
                  _builder_6.append(_get_3);
                  _builder_6.append("\"/>");
                  _switchResult = _builder_6;
                  break;
                case "DelayTimeTag":
                  StringConcatenation _builder_7 = new StringConcatenation();
                  _builder_7.append("<delayTimeTags delayTime=\"");
                  String _get_4 = tagParams.get((i).intValue()).get(0);
                  _builder_7.append(_get_4);
                  _builder_7.append("\"/>");
                  _switchResult = _builder_7;
                  break;
                case "SynchronizationTag":
                  StringConcatenation _builder_8 = new StringConcatenation();
                  _builder_8.append("<syncTags/>");
                  _switchResult = _builder_8;
                  break;
              }
            }
            _builder.append(_switchResult);
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    return _builder.toString();
  }
}
