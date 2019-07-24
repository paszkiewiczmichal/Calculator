import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame implements ActionListener{

    private JTextField numbersField;
    private JButton zero, one, two, three, four, five, six, seven, eight, nine, point, ac,  plusMinus, percent,
            podzielić, razy, minus, plus, bResult;
    private double amount1 = 0, amount2 = 0, result = 0;
    private int operator = 0;

    public static void main(String[] args) {
        Window window = new Window();
        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        window.setVisible(true);
    }

    public Window(){

        // Window settings

        setSize(320, 505);
        setTitle("Calculator");
        setLayout(null);
        setResizable(false);

        // Amount field

        numbersField = new JTextField(10);;
        numbersField.setBounds(0,0,320, 80);
        numbersField.setFont(new Font("SansSerif", Font.BOLD, 32));
        numbersField.addActionListener(this);
        numbersField.setEditable(false);
        numbersField.setHorizontalAlignment(JTextField.RIGHT);
        add(numbersField);

    }

}
