package solution;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


/**
 * 
 * @author nicolenunes
 * @version 2/6/19
 * 
 */
public class Calculator implements ActionListener
{
    private JFrame frame;
    private JTextField leftOperand;
    private JTextField rightOperand;
    private JLabel resultLabel;
    private int result;
    private int num1;
    private int num2;
   

    /**
     * 
     */
    public Calculator()
    {
        frame = new JFrame();
        frame.setVisible(true);
        frame.setSize(100, 100);
        frame.setTitle("Calculator");
        initialization();
    }
    /**
     * This is a getter for JFrame.

     * 
     * @return JFrame
     * 
     */
    public JFrame getFrame()
    {   
        return frame;
    }
    
    /**
     * Initialization of all methods to create calculator.
     */
    public void initialization()
    {
        inFields();
        inResults();
        inButtons();
       
    }
    /**
     * This is a method to create the buttons.
     */
    public void inButtons()
    {
        JPanel panelButton = new JPanel();
   
        panelButton.setVisible(true);
        JButton addButton = new JButton("ADD");
        addButton.setName("addButton");
        panelButton.add(addButton);
        addButton.addActionListener(this);
       
        
        JButton subButton = new JButton("SUB");
        subButton.setName("subButton");
        panelButton.add(subButton);
        subButton.addActionListener(this);
        
        
        JButton multButton = new JButton("MULT");
        multButton.setName("multButton");
        panelButton.add(multButton);
        multButton.addActionListener(this);
      
        
        JButton divButton = new JButton("DIV");
        divButton.setName("divButton");
        panelButton.add(divButton);
        divButton.addActionListener(this);
      
        frame.add(panelButton, BorderLayout.PAGE_END);
    }
    
    /**
     * Method to create the fields.
     */
    public void inFields()
    {
        JPanel panelText = new JPanel();
        panelText.setVisible(true);
        leftOperand = new JTextField();
        rightOperand = new JTextField();
        leftOperand.setName("leftOperand");
        
        rightOperand.setName("rightOperand");
       
        panelText.add(leftOperand);
        leftOperand.setColumns(10);
        panelText.add(rightOperand);
        rightOperand.setColumns(10);
        
        frame.add(panelText, BorderLayout.PAGE_START);
        
    }
    
    /** 
     * Method to create the results.
     */
    public void inResults()
    {
        JPanel panelResult = new JPanel();
        resultLabel = new JLabel("Result = ");
       
        resultLabel.setName("resultLabel");
        panelResult.add(resultLabel);
        
        frame.add(panelResult, BorderLayout.CENTER);
        panelResult.setVisible(true);
        
    }
    
    /**
     * 
     * @param args is a command
     */
    public static void main(String[] args)
    {
        Calculator calc = new Calculator(); 
    }
    
    /**
     * ActionListener for the buttons.
     * 
     * @param e is an ActionEvent
     */
    public void actionPerformed(ActionEvent e)
    {
        String s = e.getActionCommand();
        try
        {
            if (s.equals("ADD"))
            {
                num1 = Integer.parseInt(leftOperand.getText());
                num2 = Integer.parseInt(rightOperand.getText());
                result = num1 + num2;
                resultLabel.setText("Result = " + Integer.toString(result));
            }
            else if (s.equals("SUB"))
            {
                num1 = Integer.parseInt(leftOperand.getText());
                num2 = Integer.parseInt(rightOperand.getText());
                result = num1 - num2;
                resultLabel.setText("Result = " + Integer.toString(result));
            }
            else if (s.equals("MULT"))
            {
                num1 = Integer.parseInt(leftOperand.getText());
                num2 = Integer.parseInt(rightOperand.getText());
                result = num1 * num2;
                resultLabel.setText("Result = " + Integer.toString(result));
            }
            else if (s.equals("DIV"))
            {
                num1 = Integer.parseInt(leftOperand.getText());
                num2 = Integer.parseInt(rightOperand.getText());
                result = num1 / num2;
                resultLabel.setText("Result = " + Integer.toString(result));
            }
        }
        catch (NumberFormatException numberFormatException)
        {
            resultLabel.setText("Result = Error");
        }
        catch (ArithmeticException arithmeticException)
        {
            resultLabel.setText("Result = Error");
        }
    }
}
 


