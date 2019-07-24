import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame implements ActionListener{

    private JTextField numbersField;
    private JButton bZero, bOne, bTwo, bThree, bFour, bFive, bSix, bSeven, bEight, bNine, bPoint, bAc,  bPlusMinus, bPercent,
            bDivide, bMultiply,bMinus, bPlus, bResult;
    private double amount1 = 0, amount2 = 0, result = 0;
    private int operator = 0;

    public static void main(String[] args) {
        Main window = new Main();
        window.setVisible(true);
    }

    public Main(){


    // Window settings

        setSize(320, 505);
        setTitle("Calculator");
        setLayout(null);
        setResizable(false);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    // Amount field

        numbersField = new JTextField(10);;
        numbersField.setBounds(0,0,320, 80);
        numbersField.setFont(new Font("SansSerif", Font.BOLD, 32));
        numbersField.addActionListener(this);
        numbersField.setEditable(false);
        numbersField.setHorizontalAlignment(JTextField.RIGHT);
        add(numbersField);

    // Function buttons

        bAc = new JButton("AC");
        bAc.setBounds(0, 80, 80,80);
        bAc.addActionListener(this);
        add(bAc);

        bPlusMinus = new JButton("+/-");
        bPlusMinus.setBounds(80, 80, 80,80);
        bPlusMinus.addActionListener(this);
        add(bPlusMinus);

        bPercent = new JButton("%");
        bPercent.setBounds(160, 80, 80,80);
        bPercent.addActionListener(this);
        add(bPercent);

        bDivide = new JButton("/");
        bDivide.setBounds(240, 80, 80,80);
        bDivide.addActionListener(this);
        add(bDivide);

        bMultiply = new JButton("*");
        bMultiply.setBounds(240, 160, 80,80);
        bMultiply.addActionListener(this);
        add(bMultiply);

        bMinus = new JButton("-");
        bMinus.setBounds(240, 240, 80,80);
        bMinus.addActionListener(this);
        add(bMinus);

        bPlus = new JButton("+");
        bPlus.setBounds(240, 320, 80,80);
        bPlus.addActionListener(this);
        add(bPlus);

        bResult = new JButton("=");
        bResult.setBounds(240, 400, 80,80);
        bResult.addActionListener(this);
        add(bResult);

    // numbers buttons

        bSeven = new JButton("7");
        bSeven.setBounds(0, 160, 80,80);
        bSeven.addActionListener(this);
        add(bSeven);

        bEight = new JButton("8");
        bEight.setBounds(80, 160, 80,80);
        bEight.addActionListener(this);
        add(bEight);

        bNine = new JButton("9");
        bNine.setBounds(160, 160, 80,80);
        bNine.addActionListener(this);
        add(bNine);

        bFour = new JButton("4");
        bFour.setBounds(0, 240, 80,80);
        bFour.addActionListener(this);
        add(bFour);

        bFive = new JButton("5");
        bFive.setBounds(80, 240, 80,80);
        bFive.addActionListener(this);
        add(bFive);

        bSix = new JButton("6");
        bSix.setBounds(160, 240, 80,80);
        bSix.addActionListener(this);
        add(bSix);

        bOne = new JButton("1");
        bOne.setBounds(0, 320, 80,80);
        bOne.addActionListener(this);
        add(bOne);

        bTwo = new JButton("2");
        bTwo.setBounds(80, 320, 80,80);
        bTwo.addActionListener(this);
        add(bTwo);

        bThree = new JButton("3");
        bThree.setBounds(160, 320, 80,80);
        bThree.addActionListener(this);
        add(bThree);

        bZero = new JButton("0");
        bZero.setBounds(0, 400, 160,80);
        bZero.addActionListener(this);
        add(bZero);

        bPoint = new JButton(",");
        bPoint.setBounds(160, 400, 80,80);
        bPoint.addActionListener(this);
        add(bPoint);

}

    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == bSeven) {
            numbersField.setText(numbersField.getText().concat("7"));
        }if (e.getSource() == bEight) {
            numbersField.setText(numbersField.getText().concat("8"));
        }if (e.getSource() == bNine) {
            numbersField.setText(numbersField.getText().concat("9"));
        }if (e.getSource() == bFour) {
            numbersField.setText(numbersField.getText().concat("4"));
        }if (e.getSource() == bFive) {
            numbersField.setText(numbersField.getText().concat("5"));
        }if (e.getSource() == bSix) {
            numbersField.setText(numbersField.getText().concat("6"));
        }if (e.getSource() == bThree) {
            numbersField.setText(numbersField.getText().concat("3"));
        }if (e.getSource() == bTwo) {
            numbersField.setText(numbersField.getText().concat("2"));
        }if (e.getSource() == bOne) {
            numbersField.setText(numbersField.getText().concat("1"));
        }if (e.getSource() == bZero) {
            numbersField.setText(numbersField.getText().concat("0"));
        }if (e.getSource() == bPoint) {
            numbersField.setText(numbersField.getText().concat("."));
        }if (e.getSource() == bPlus){
            amount1 = Double.parseDouble(numbersField.getText());
            operator = 1;
            numbersField.setText("");
        }if (e.getSource() == bMinus){
            amount1 = Double.parseDouble(numbersField.getText());
            operator = 2;
            numbersField.setText("");
        }if (e.getSource() == bMultiply){
            amount1 = Double.parseDouble(numbersField.getText());
            operator = 3;
            numbersField.setText("");
        }if (e.getSource() == bDivide){
            amount1 = Double.parseDouble(numbersField.getText());
            operator = 4;
            numbersField.setText("");
        }if (e.getSource() == bPercent){
            amount1 = Double.parseDouble(numbersField.getText());
            operator = 5;
            numbersField.setText("");
        }if (e.getSource() == bPlusMinus){
            amount1 = Double.parseDouble(numbersField.getText());
            numbersField.setText("-" + amount1);
        }

        // Calculations

        if (e.getSource() == bResult){
            amount2 = Double.parseDouble(numbersField.getText());
            switch (operator){
                case 1 : result = amount1 + amount2;
                    break;
                case 2 : result = amount1 - amount2;
                    break;
                case 3 : result = amount1 * amount2;
                    break;
                case 4 : result = amount1 / amount2;
                    break;
                case  5 : result = amount1 / 100 * amount2;
                    break;
                default : result = 0;
            }
            numbersField.setText("" + result);
        }

        // Clear

        if (e.getSource() == bAc)numbersField.setText("");
    }

}
