package Deque;
import javax.swing.*;
import java.awt.event.*;
import java.util.Deque;
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
		
	public gui(dequeClass<String> deque)
	{
		setTitle("Assignment 3");
		setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		buildPanel(deque);
		add(panel);
		setVisible(true);
	}
	
	private void buildPanel(dequeClass<String> deque)
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
		
		insertFrontButton.addActionListener(new InsertFrontListener());
		insertRearButton.addActionListener(new InsertRearListener());
		removeFrontButton.addActionListener(new RemoveFrontListener());
		removeRearButton.addActionListener(new RemoveRearListener());
		printList.addActionListener(new PrintListener());
		clearList.addActionListener(new ClearListener());
		size.addActionListener(new SizeListener());
		isEmpty.addActionListener(new EmptyListener());
		showFront.addActionListener(new FrontListner());
		showRear.addActionListener(new RearListener());
		
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
	
	private  class InsertFrontListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			String input = addField.getText();
			
			addField.setText("");
		}
	}
	
	private class InsertRearListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			String input = addField.getText();
			dequeClass<String> deque = new dequeClass<String>();
			deque.insertRear(input);
			addField.setText("");
		}
	}
	
	private class RemoveFrontListener<E> implements ActionListener{
		public void actionPerformed(ActionEvent e){
			dequeClass<E> deque = new dequeClass<E>();
			deque.removeFront();
		}
	}

	private class RemoveRearListener<E> implements ActionListener{
		public void actionPerformed(ActionEvent e){
			dequeClass<E> deque = new dequeClass<E>();
			deque.removeRear();
		}
	}

	private class PrintListener<E> implements ActionListener{
		public void actionPerformed(ActionEvent e){
			dequeClass<E> deque = new dequeClass<E>();
			String printOut = deque.toString();
			JOptionPane.showMessageDialog(null, printOut);
		}
	}

	private class ClearListener<E> implements ActionListener{
		public void actionPerformed(ActionEvent e){
			dequeClass<E> deque = new dequeClass<E>();
			deque.clear();
		}
	}

	private class SizeListener<E> implements ActionListener{
		public void actionPerformed(ActionEvent e){
			dequeClass<E> deque = new dequeClass<E>();
			int size = deque.size();
			JOptionPane.showMessageDialog(null, size);
		}
	}

	private class EmptyListener<E> implements ActionListener{
		public void actionPerformed(ActionEvent e){
			dequeClass<E> deque = new dequeClass<E>();
			boolean result = deque.isEmpty();
			if(result){
				JOptionPane.showMessageDialog(null, "The list is empty");
			}
			JOptionPane.showMessageDialog(null, "There are "+ deque.size());
		}
	}

	private class FrontListner<E> implements ActionListener{
		public void actionPerformed(ActionEvent e){
			dequeClass<E> deque = new dequeClass<E>();
			E element = deque.getFront();
			JOptionPane.showMessageDialog(null, "This is the current front object: " + element);
		}
	}

	private class RearListener<E> implements ActionListener{
		public void actionPerformed(ActionEvent e){
			dequeClass<E> deque = new dequeClass<E>();
			E element = deque.getRear();
			JOptionPane.showMessageDialog(null, "This is the current rear object: " + element);
		}
	}
	
	public static void main(String[] args)
	{
		dequeClass<String> deque = new dequeClass<String>();
		new gui(deque);	
	}

}
