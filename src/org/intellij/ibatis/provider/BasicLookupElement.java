package org.intellij.ibatis.provider;

import com.intellij.codeInsight.completion.InsertHandler;
import com.intellij.codeInsight.completion.InsertionContext;
import com.intellij.codeInsight.lookup.LookupElement;
import com.intellij.codeInsight.lookup.LookupElementPresentation;
import com.intellij.codeInsight.lookup.LookupElementRenderer;
import com.intellij.openapi.editor.Editor;
import com.intellij.openapi.editor.EditorModificationUtil;
import com.intellij.psi.PsiDocumentManager;
import org.jetbrains.annotations.NotNull;

/**
 * basic loookup element
 */
public class BasicLookupElement extends LookupElement {
    private String value;

    public BasicLookupElement(String value) {

        this.value = value;
    }

    @NotNull
    public String getLookupString() {
        return value;
    }

    public InsertHandler<? extends LookupElement> getInsertHandler() {
        return new InsertHandler<LookupElement>() {
            public void handleInsert(InsertionContext insertionContext, LookupElement lookupElement) {
                Editor editor = insertionContext.getEditor();
                EditorModificationUtil.insertStringAtCaret(editor, SqlMapSymbolCompletionData.CLOSE_TAG);
                PsiDocumentManager.getInstance(editor.getProject()).commitDocument(editor.getDocument());
//                editor.getCaretModel().moveCaretRelatively(-1, 0, false, false, true);
            }
        };
    }

    @NotNull
    protected LookupElementRenderer<? extends LookupElement> getRenderer() {
        return new LookupElementRenderer<LookupElement>() {
            @Override
            public void renderElement(LookupElement lookupElement, LookupElementPresentation lookupElementPresentation) {
                lookupElementPresentation.setItemText(lookupElement.getLookupString());
            }
        };
    }
}
