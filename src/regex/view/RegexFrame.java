package regex.view;

import regex.controller.*;
import javax.swing.JFrame;
import java.awt.Dimension;

public class RegexFrame extends JFrame
{
	private RegexController baseController;
	private RegexPanel appPanel;
	
	public RegexFrame(RegexController baseController)
	{
		super();
		this.baseController = baseController;
		this.appPanel = new RegexPanel(baseController);
		
		this.setupRegexFrame();
	}
	
	public void setupRegexFrame()
	{
		this.setContentPane(appPanel);
		this.setTitle(" ");
		this.setSize(new Dimension(700, 700));
		this.setVisible(true);
	}
}
