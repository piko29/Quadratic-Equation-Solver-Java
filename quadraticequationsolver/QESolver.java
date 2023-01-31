package quadraticequationsolver;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class QESolver extends JFrame implements ActionListener
{
    private JTextField tA, tB, tC;
    private JTextArea tResult;
    private JLabel lA, lB, lC, lResult;
    private JButton bCalculate, bExit;
       
    public QESolver()
    {
        setBounds(300,200, 400, 300);
        setTitle("Quadratic equation solver");
        setLayout(null);
        
        lA = new JLabel("a", JLabel.RIGHT);
        lA.setBounds(10, 50, 25, 20);
        tA = new JTextField();
        tA.setBounds(50, 50, 50, 20);
        tA.setToolTipText("Enter the value of A");
        
        lB = new JLabel("b", JLabel.RIGHT);
        lB.setBounds(10, 80, 25, 20);
        tB = new JTextField();
        tB.setBounds(50, 80, 50, 20);
        tB.setToolTipText("Enter the value of B");
        
        lC = new JLabel("c", JLabel.RIGHT);
        lC.setBounds(10, 110, 25, 20);
        tC = new JTextField();
        tC.setBounds(50, 110, 50, 20);
        tC.setToolTipText("Enter the value of C");
        
        lResult = new JLabel("Results: ", JLabel.RIGHT);
        lResult.setBounds(10, 140, 50, 20);
        tResult = new JTextArea();
        tResult.setLineWrap(true);
        tResult.setWrapStyleWord(true);
        tResult.setBounds(80, 140, 250, 50);
             
        add(lA);
        add(tA);
        add(lB);
        add(tB);
        add(lC);
        add(tC);
        add(lResult);
        add(tResult);
        
        bCalculate = new JButton("Calculate");
        bCalculate.setBounds(50,200,150,20);
        add(bCalculate);
        bCalculate.addActionListener(this);
        
        bExit = new JButton("Exit");
        bExit.setBounds(210, 200, 100, 20);
        add(bExit);
        bExit.addActionListener(this);       
    }

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        Object source = e.getSource();
        if (source==bExit)
        {
            dispose();
        }
        else if(source==bCalculate)
        {
            double a= Double.parseDouble(tA.getText());
            double b= Double.parseDouble(tB.getText());
            double c= Double.parseDouble(tC.getText());
           
            QuadraticEquation equation = new QuadraticEquation(a, b, c);
            String results = equation.calculate();
            tResult.setText(results);   
        }
    }
        
    
    public static void main(String[] args) 
    {
        QESolver application = new QESolver();
        application.setDefaultCloseOperation(3);
        application.setVisible(true);
        
    }


}
