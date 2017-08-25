package minecraft.gui;


import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;


public abstract class Form implements IForm {

    private JFrame frame;

    public JFrame getFrame() {
        return this.frame;
    }

    public void setFrame(JFrame frame) {
        this.frame = frame;
        this.onFrameChange(frame);

        if (this.isCentered()) {
            Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

            frame.setLocation(
                    frame.getSize().width - screenSize.width / 2,
                    frame.getSize().height - screenSize.height / 2
            );
        }

        Dimension preferredSize = this.getPreferredSize();
        if (preferredSize != null) {
            frame.setSize(preferredSize);
        }
    }

    public boolean isRoot() {
        return false;
    }

    public boolean isCentered() {
        return false;
    }

    public Dimension getPreferredSize() {
        return null;
    }

    protected void onFrameChange(JFrame newFrame) {
        newFrame.toFront();
    }

    public void onCreate() {}

    public Desktop getDesktop() {
        return Desktop.isDesktopSupported() ? Desktop.getDesktop() : null;
    }

    /*
        Открывает ссылку в окне браузера
     */
    public void browseLink(String url) {
        Desktop desktop = this.getDesktop();

        if (desktop != null) {
            try {
                desktop.browse(new URI(url));
            } catch (IOException | URISyntaxException | NullPointerException e) {
                e.printStackTrace();
            }
        }
    }


    public void makeLink(JLabel label, final String url) {
        final Form form = this;

        label.setText("<HTML><U>" + label.getText() + "</U></HTML>");
        label.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        label.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                form.browseLink(url);
            }
        });
    }

}
