package org.jboss.windup.rules.apps.xml.confighandler;

import static org.joox.JOOX.$;

import org.jboss.windup.config.exception.ConfigurationException;
import org.jboss.windup.config.parser.ElementHandler;
import org.jboss.windup.config.parser.NamespaceElementHandler;
import org.jboss.windup.config.parser.ParserContext;
import org.jboss.windup.config.parser.xml.RuleProviderHandler;
import org.w3c.dom.Element;

@NamespaceElementHandler(elementName = "xslt-parameter", namespace = RuleProviderHandler.WINDUP_RULE_NAMESPACE)
public class XSLTParameterHandler implements ElementHandler<XSLTParameter> {

    @Override
    public XSLTParameter processElement(ParserContext handlerManager, Element element)
            throws ConfigurationException {
        String property = $(element).attr("property");
        String value = $(element).attr("value");
        XSLTParameter entry = new XSLTParameter(property, value);
        return entry;
    }
}
