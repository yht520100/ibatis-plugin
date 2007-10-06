package org.intellij.ibatis.dom.sqlMap;

import com.intellij.javaee.model.xml.CommonDomModelElement;
import com.intellij.util.xml.GenericAttributeValue;

/**
 * update element
 */
public interface Delete extends CommonDomModelElement {
    public GenericAttributeValue<String> getId();

    public GenericAttributeValue<String> getParameterClass();

    public GenericAttributeValue<String> getParameterMap();

}