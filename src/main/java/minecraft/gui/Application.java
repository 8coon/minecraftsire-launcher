package minecraft.gui;

import minecraft.gui.IForm;

import javax.swing.*;
import java.util.HashMap;
import java.util.Map;


public class Application {

    private Map<String, IForm> forms = new HashMap<String, IForm>();

    public void addForm(String name, IForm form) {
        JFrame frame = new JFrame(form.getTitle());
        frame.setContentPane(form.getContentPane());
        frame.setDefaultCloseOperation(form.isRoot() ? WindowConstants.EXIT_ON_CLOSE : WindowConstants.HIDE_ON_CLOSE);
        frame.pack();

        form.setFrame(frame);
        form.onCreate();

        forms.put(name, form);
    }

    public IForm getForm(String name) {
        return forms.get(name);
    }

    public void toggleFormVisibility(String name, boolean visibility) {
        forms.get(name).getFrame().setVisible(visibility);
    }

    public void showForm(String name) {
        this.toggleFormVisibility(name, true);
    }

    public void hideForm(String name) {
        this.toggleFormVisibility(name, false);
    }

}
