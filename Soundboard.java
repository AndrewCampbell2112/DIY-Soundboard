import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Soundboard extends JFrame
{
    public static void main(String args[])
	{
		//Set up the JFrame
		Soundboard soundboard = new Soundboard();
		soundboard.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		soundboard.setTitle("DIY Soundboard");
		soundboard.setBackground(Color.red);
		soundboard.setLayout(new GridLayout());
		
		//Set the JFrame to full screen
		Toolkit tk = Toolkit.getDefaultToolkit();
		int xSize = ((int) tk.getScreenSize().getWidth()/2);
		int ySize = ((int) tk.getScreenSize().getHeight()/2);
		soundboard.setSize(xSize, ySize);
		soundboard.setVisible(true);
		
		//Create Buttons for the JFrame
		JButton buttonOne = new JButton("buttonOne Text");
		JButton buttonTwo = new JButton("buttonTwo Text");
		JButton buttonThree = new JButton("buttonThree Text");
		JButton buttonFour = new JButton("buttonFour Text");
		JButton buttonFive = new JButton("buttonFive Text");
		JButton buttonSix = new JButton("buttonSix Text");
		
		//Adds all the buttons to the JFrame Panel
		soundboard.add(buttonOne);
		soundboard.add(buttonTwo);			
		soundboard.add(buttonThree);
		soundboard.add(buttonFour);
		soundboard.add(buttonFive);
		soundboard.add(buttonSix);
		
		//Checks to see if the "buttonOne" button has been pressed
		buttonOne.addActionListener(new ActionListener()
		{
		  public void actionPerformed(ActionEvent e)
		  {	
			try {
				Runtime.getRuntime().exec(new String[] {"cmd", "/K", "LOCAL PATH TO FILE HERE"});	//Runs selected music file via command prompt
			} catch (IOException e1) {
				e1.printStackTrace();
			}
			
		  }
		});

		//Checks to see if the "buttonTwo" button has been pressed
		buttonTwo.addActionListener(new ActionListener()
		{
		  public void actionPerformed(ActionEvent e)
		  {
			try {
				Runtime.getRuntime().exec(new String[] {"cmd", "/K", "LOCAL PATH TO FILE HERE"});	//Runs selected music file via command prompt
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		  }
		});
		
		//Checks to see if the "buttonThree" button has been pressed
		buttonThree.addActionListener(new ActionListener()
		{
			
			 public void actionPerformed(ActionEvent e)
			  {
				try {
					Runtime.getRuntime().exec(new String[] {"cmd", "/K", "LOCAL PATH TO FILE HERE"});	//Runs selected music file via command prompt
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			  }
		});
		
		//Checks to see if the "buttonFour" button has been pressed
		buttonFour.addActionListener(new ActionListener()
		{
		  public void actionPerformed(ActionEvent e)
		  {
			try {
				Runtime.getRuntime().exec(new String[] {"cmd", "/K", "LOCAL PATH TO FILE HERE"});	//Runs selected music file via command prompt
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		  }
		});

		//Checks to see if the "buttonFive" button has been pressed
		buttonFive.addActionListener(new ActionListener()
		{
		  public void actionPerformed(ActionEvent e)
		  {
			try {
				Runtime.getRuntime().exec(new String[] {"cmd", "/K", "LOCAL PATH TO FILE HERE"});	//Runs selected music file via command prompt
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		  }
		});

		//Checks to see if the "buttonSix" button has been pressed
		buttonSix.addActionListener(new ActionListener()
		{
		  public void actionPerformed(ActionEvent e)
		  {
			try {
				Runtime.getRuntime().exec(new String[] {"cmd", "/K", "LOCAL PATH TO FILE HERE"});	//Runs selected music file via command prompt
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		  }
		});
		
	}	
}
