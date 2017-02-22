package regex.view;

import regex.controller.*;
import javax.swing.*;
import javax.swing.JPanel;

public class RegexPanel extends JPanel 
{
	private RegexController baseController;
	private SpringLayout baseLayout;
	private JTextArea DisplayOne;
	private JTextArea DisplayTwo;
	private JTextArea DisplayThree;
	private JTextArea DisplayFour;
	private JLabel LabelOne;
	private JLabel LabelTwo;
	private JLabel LabelThree;
	private JLabel LabelFour;
	private JButton Button;
	
	public RegexPanel(RegexController baseController)
	{
		super();
		this.baseController = baseController;
		baseLayout = new SpringLayout();
		DisplayOne = new JTextArea(25, 25);
		DisplayTwo = new JTextArea(25, 25);
		DisplayThree = new JTextArea(25, 25);
		DisplayFour = new JTextArea(25, 25);
		LabelOne = new JLabel("");
		LabelTwo = new JLabel("");
		LabelThree = new JLabel("");
		LabelFour = new JLabel("");
		Button = new JButton("");
		
		setupRegexDisplay();
		setupRegexPanel();
		setupRegexLayout();
	}
	
	private void setupRegexDisplay()
	{
		
	}
	
	private void setupRegexPanel()
	{
		
	}
	
	private void setupRegexLayout()
	{
		
	}
}
