package org.intellij.ibatis.dom.configuration;

import com.intellij.javaee.model.xml.CommonDomModelElement;
import com.intellij.psi.PsiClass;
import com.intellij.util.xml.GenericAttributeValue;
import org.jetbrains.annotations.NotNull;

/**
 * type handler element
 *
 * @author linux_china@hotmail.com
 */
public interface TypeHandler extends CommonDomModelElement {
    @NotNull
    public GenericAttributeValue<String> getJavaType();

    @NotNull
    public GenericAttributeValue<String> getJdbcType();

    @NotNull
    public GenericAttributeValue<PsiClass> getCallback();
}
