package minecraft.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class LauncherForm extends Form {
    private JPanel FormBackground;
    private JPanel Box;
    private JPasswordField PasswordInput;
    private JTextField LoginInput;
    private JButton LoginButton;
    private JCheckBox RememberSessionCheck;
    private JPanel LoginForm;
    private JLabel WebsiteLink;
    private JLabel RestoreAccessLink;

    public LauncherForm() {
        final LauncherForm form = this;

        LoginButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("CLICKED");
            }
        });

        RestoreAccessLink.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                form.browseLink("https://minecraftshire.ru/app/restore_access");
            }
        });

        WebsiteLink.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                form.browseLink("https://minecraftshire.ru/");
            }
        });
    }

    @Override
    public boolean isCentered() {
        return true;
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(700, 420);
    }

    @Override
    public void onCreate() {
        WebsiteLink.setText("<HTML><U>Перейти на сайт</U></HTML>");
        WebsiteLink.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        RestoreAccessLink.setText("<HTML><U>Восстановить доступ</U></HTML>");
        RestoreAccessLink.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }

    public JPanel getContentPane() {
        return FormBackground;
    }

    public String getTitle() {
        return "Minecraftshire Launcher";
    }

    public boolean isRoot() {
        return true;
    }

}
