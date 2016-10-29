package Deque;
import javax.swing.*;
public class gui extends JFrame
{
	private JPanel panel;
	private JButton removeFrontButton;
	private JButton removeRearButton;
	private JLabel addLabel;
	private JTextField addField;
	private JButton insertFrontButton;
	private JButton insertRearButton;
	private JButton printList;
	private JButton clearList;
	private JButton size;
	private JButton isEmpty;
	private JButton showFront;
	private JButton showRear;
	private final int WINDOW_WIDTH = 600;
	private final int WINDOW_HEIGHT = 150;
		
	public gui()
	{
		setTitle("Assignment 3");
		setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		buildPanel();
		add(panel);
		setVisible(true);
	}
	
	private void buildPanel()
	{
		addLabel = new JLabel("Enter something to add to the list:");
		addField = new JTextField(10);
		insertFrontButton = new JButton("Add Front");
		insertRearButton = new JButton("Add Rear");
		removeFrontButton = new JButton("Remove Front");
		removeRearButton = new JButton("Remove Rear");
		printList = new JButton("Print List");
		clearList = new JButton("Clear List");
		size = new JButton("List Size");
		isEmpty = new JButton("Empty?");
		showFront = new JButton("Front Item");
		showRear = new JButton("Rear Item");
		
		panel = new JPanel();
		
		panel.add(addLabel);
		panel.add(addField);
		panel.add(insertFrontButton);
		panel.add(insertRearButton);
		panel.add(removeFrontButton);
		panel.add(removeRearButton);
		panel.add(printList);
		panel.add(clearList);
		panel.add(size);
		panel.add(isEmpty);
		panel.add(showFront);
		panel.add(showRear);
		
	}
	
	public static void main(String[] args)
	{
		new gui();
		
		
	}

}
