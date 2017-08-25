package minecraft.gui;


import javax.swing.*;


public interface IForm {

    JPanel getContentPane();
    String getTitle();
    JFrame getFrame();
    void setFrame(JFrame frame);
    boolean isRoot();
    void onCreate();

}
