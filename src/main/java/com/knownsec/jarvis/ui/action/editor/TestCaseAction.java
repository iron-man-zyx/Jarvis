package com.knownsec.jarvis.ui.action.editor;

import com.intellij.openapi.actionSystem.AnActionEvent;
import com.knownsec.jarvis.message.ChatGPTBundle;
import org.jetbrains.annotations.NotNull;

/**
 * @author zouyx
 */
public class TestCaseAction extends AbstractEditorAction {

    public TestCaseAction() {
        super(() -> ChatGPTBundle.message("action.code.test.menu"));
    }

    @Override
    public void actionPerformed(@NotNull AnActionEvent e) {
        key = "Add test case for code:";
        super.actionPerformed(e);
    }

}
