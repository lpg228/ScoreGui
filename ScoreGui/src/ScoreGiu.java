import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 * GUI program to find the weighted average of four test scores
 * @author User Laura Garcia
 * The user is supposed to enter the data and press a Calculate button.  The program must display the weighted average.
 */
public class ScoreGui extends JFrame
{
	private JLabel oneLabel,twoLabel,threeLabel,scoreLabel,weightLabel,onewLabel,twowLabel;
    private JLabel threewLabel,fourwLabel,avgLabel,fourLabel,bLabel,bLabel2,bLabel3;
    private JTextField oneTextField, twoTextField,threeTextField,fourTextField;
    private JTextField onewTextField, twowTextField,threewTextField,fourwTextField, avgwTextField;
    private JButton calcButton,exitButton;
    private CalculateButtonHandler cbHandler;
    private ExitButtonHandler ebHandler;
    private JTextField [] textFields = new JTextField[4];
    private JTextField [] textFieldsWeight = new JTextField[4];
    
    /**
     * Constructs the connections of the calculator.
     */
    public ScoreGui()
    {
    	/**
    	 * This methods would help label the order where the tests scores and weight will be.
    	 * @param there's also going to be a label for the average.
    	 * the JButom would help calculate the average and weight of the tests scores.
    	 * There's also an exit button to exit the window.
    	 */
    	bLabel=new JLabel("");
        bLabel2= new JLabel("");
        bLabel3= new JLabel("");
        scoreLabel=new JLabel("Score",SwingConstants.CENTER);
        weightLabel=new JLabel("Weight",SwingConstants.CENTER);
        oneLabel=new JLabel("Test one: ",SwingConstants.RIGHT);
        twoLabel=new JLabel("Test two: ",SwingConstants.RIGHT);
        threeLabel=new JLabel("Test three: ",SwingConstants.RIGHT);
        fourLabel=new JLabel("Test four: ",SwingConstants.RIGHT);
        avgLabel=new JLabel("Average: ",SwingConstants.RIGHT);
        textFields[0]=new JTextField(5);
        textFields[1]=new JTextField(5);
        textFields[2]=new JTextField(5);
        textFields[3]=new JTextField(5);
        
        onewTextField=new JTextField(5);
        twowTextField=new JTextField(5);
        threewTextField=new JTextField(5);
        fourwTextField=new JTextField(5);
        avgwTextField=new JTextField(5);
        calcButton=new JButton("Calculate");
        cbHandler=new CalculateButtonHandler();
        calcButton.addActionListener(cbHandler);
        exitButton = new JButton("Exit");
        ebHandler = new ExitButtonHandler();
        exitButton.addActionListener(ebHandler);
        Container pane = getContentPane();
        pane.setLayout(new GridLayout(7,3));
        pane.add(bLabel);
        pane.add(oneLabel);
        pane.add(scoreLabel);
        pane.add(weightLabel);     
        pane.add(oneLabel);
        pane.add(textFields[0]);
        pane.add(onewTextField);     
        pane.add(twoLabel);
        pane.add(textFields[1]);
        pane.add(twowTextField);     
        pane.add(threeLabel);
        pane.add(textFields[2]);
        pane.add(threewTextField);    
        pane.add(fourLabel);
        pane.add(textFields[3]);
        pane.add(fourwTextField);   
        pane.add(avgLabel);
        pane.add(avgwTextField);
        pane.add(calcButton);
        pane.add(bLabel2);
        pane.add(bLabel3);
        pane.add(exitButton);      
        setSize(400,300);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    /**
     * This method is to let me know how many times,
     *  I have click the button in the program.
     */
    private class CalculateButtonHandler implements ActionListener
    {
    	/**
    	 * This method displays the set text of the tests 
    	 */
    	public void actionPerformed(ActionEvent e)
        {
    		/**
    		 * displays all of the buttons of the calculator.
    		 */
    		double one,onew,two,twow,three,threew,four,fourw,avg;
         one=Double.parseDouble(textFields[0].getText());
         onew=Double.parseDouble(onewTextField.getText());
         two=Double.parseDouble(textFields[1].getText());
         twow=Double.parseDouble(twowTextField.getText());
         three=Double.parseDouble(textFields[2].getText());
         threew=Double.parseDouble(threewTextField.getText());
         four=Double.parseDouble(textFields[3].getText());
         fourw=Double.parseDouble(fourwTextField.getText());
         avg=(one*onew+two*twow+three*threew+four*fourw)/(onew+twow+threew+fourw);
         avgwTextField.setText(" "+ avg);
        }
    }
    /**
     * This method lets know how many times the handler button was click.
     */
    private class ExitButtonHandler implements ActionListener{
   /**
    * It displays the calculator, 
    * for the weight and average of the tests.
    */
    	public void actionPerformed(ActionEvent e)
        {System.exit(0);
        }
    }
}