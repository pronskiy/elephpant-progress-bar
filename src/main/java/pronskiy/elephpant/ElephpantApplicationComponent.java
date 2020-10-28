package pronskiy.elephpant;

import com.intellij.ide.ui.LafManager;
import com.intellij.ide.ui.LafManagerListener;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;

public class ElephpantApplicationComponent implements LafManagerListener {
    public void lookAndFeelChanged(@NotNull LafManager source) {
        updateProgressBarUi();
    }

    private void updateProgressBarUi() {
        UIManager.put("ProgressBarUI", ElephpantProgressBarUi.class.getName());
        UIManager.getDefaults().put(ElephpantProgressBarUi.class.getName(), ElephpantProgressBarUi.class);
    }
}
