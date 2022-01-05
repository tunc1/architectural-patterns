package mvp;

import javax.swing.*;

public class View
{
    private JFrame frame;
    private JTextField textField;
    private JButton button;
    private JLabel label;
    public View()
    {
        createUI();
        setValue("0");
    }
    public void show()
    {
        frame.setVisible(true);
    }
    public void setOnUpdate(Runnable runnable)
    {
        button.addActionListener(e->runnable.run());
    }
    public String getValue()
    {
        return textField.getText();
    }
    private void createUI()
    {
        frame=new JFrame("MVP");
        frame.setBounds(100,100,300,400);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        label=new JLabel();
        label.setBounds(40,10,140,30);
        frame.add(label);
        button=new JButton("Update");
        button.setBounds(40,90,100,30);
        frame.add(button);
        textField=new JTextField();
        textField.setBounds(40,40,150,25);
        frame.add(textField);
    }
    public void setValue(String value)
    {
        label.setText("Current Value: "+value);
    }
}
