import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class Myframe extends JFrame implements ActionListener{

    private Container c;
    private JTextField tf1,tf2;
    private JLabel l1,l2 ,result;
    private JButton add, subt, div, mul;

    Myframe(){
        setTitle("SIMPLE CALCULATOR");
        setSize(500,500);
        setLocation(100,100);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        

        c = getContentPane();
        c.setLayout(null);

        l1 = new JLabel("First Operand :");
        l1.setBounds(10,50,100,25);
        tf1 = new JTextField();
        tf1.setBounds(120, 50, 120, 25);

        l2 = new JLabel("Second Operand :");
        l2.setBounds(10,100,200,25);
        tf2 = new JTextField();
        tf2.setBounds(120, 100, 120, 25);

        add = new JButton("+");
        add.setBounds(10,150,75,25);
        subt = new JButton("-");
        subt.setBounds(100,150,75,25);
        div = new JButton("/");
        div.setBounds(190,150,75,25);
        mul = new JButton("*");
        mul.setBounds(280,150,75,25);

        result = new JLabel("Result");
        result.setBounds(10,200,400,25);
 
        c.add(l1);
        c.add(l2);
        c.add(tf1);
        c.add(tf2);
        c.add(add);
        c.add(subt);
        c.add(div);
        c.add(mul);
        c.add(result);

        add.addActionListener(this);
        subt.addActionListener(this);
        div.addActionListener(this);
        mul.addActionListener(this);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e){
        try{
        int a = Integer.parseInt(tf1.getText());
        int b = Integer.parseInt(tf2.getText());
        if(e.getSource()==add){
            int c = a + b;
            result.setText("Result : "+c);
        }
        else if(e.getSource()==subt){
            int c = a - b;
            result.setText("Result : "+c);
        }
        else if(e.getSource()==div){
            int c = a / b;
            result.setText("Result : "+c);
        }
        // else if(e.getSource()==mul){
        else{
            int c = a * b;
            result.setText("Result : "+c);
        }}
        catch(NumberFormatException e1){
            result.setText("ERROR, Please input integers only!!");
        }catch(ArithmeticException e2){
            result.setText("ERROR, Division by zero is not allowed!!");
        }
}}


public class Calculator {
    public static void main (String args[]){
        Myframe frame = new Myframe();
    }
}
