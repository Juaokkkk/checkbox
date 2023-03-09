
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemListener;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class CheckBoxFrame extends JFrame {
    private JTextField textField;
    private JCheckBox boldJCheckbox;
    private JCheckBox italicJCheckbox;
    
    public CheckBoxFrame(){
        super("JCheckBox Test");
        setLayout(new FlowLayout());
        
        textField = new JTextField("Ala ó, ala ó:",20);
        textField.setFont(new Font("Serif",Font.PLAIN,14));
        add(textField);
        boldJCheckbox = new JCheckBox("Bold");
        italicJCheckbox = new JCheckBox("italic");
        add(boldJCheckbox);
        add(italicJCheckbox);
        
        ItemListener handler = (event) -> {
            Font font = null;
            if(boldJCheckbox.isSelected() && italicJCheckbox.isSelected())
                font = new Font("Serif",Font.BOLD+Font.ITALIC,14);
            else if(boldJCheckbox.isSelected())
                font = new Font("Serif",Font.BOLD,14);
            else if(italicJCheckbox.isSelected())
                font = new Font("Serif",Font.ITALIC,14);
            else font = new Font("Serif", Font.PLAIN, 14);
            textField.setFont(font);
        };
        boldJCheckbox.addItemListener(handler);
        italicJCheckbox.addItemListener(handler);
    }
}
