package minecraft;

import minecraft.gui.Application;
import minecraft.gui.LauncherForm;


public class LauncherApplication extends Application implements Runnable {

    public static final String LAUNCHER_FORM = "LauncherForm";

    public LauncherApplication() {
        this.addForm(LAUNCHER_FORM, new LauncherForm());
    }

    public void run() {
        this.showForm(LAUNCHER_FORM);
    }
}
