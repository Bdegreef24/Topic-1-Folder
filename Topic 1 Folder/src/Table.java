// Imports
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Table
		extends 	JFrame
 {
	// Instance attributes used in this example
	private	JPanel		topPanel;
	private	JTable		table;
	private	JScrollPane scrollPane;

	// Constructor of main frame
	public Table ()
	{
		// Set the frame characteristics
		setTitle( "Table 1.4" );
		setSize( 300, 200 );
		setBackground( Color.gray );

		// Create a panel to hold all other components
		topPanel = new JPanel();
		topPanel.setLayout( new BorderLayout() );
		getContentPane().add( topPanel );

		// Create columns names
		String columnNames[] = { "A", "A ^ 2", "A ^ 3" };

		// Create some data
		String dataValues[][] =
		{
			{ "1", "1", "1" },
			{ "2", "4", "8" },
			{ "3", "9", "27" },
			{ "4", "16", "64" }
		};

		// Create a new table instance
		table = new JTable( dataValues, columnNames );

		// Add the table to a scrolling pane
		scrollPane = new JScrollPane( table );
		topPanel.add( scrollPane, BorderLayout.CENTER );
	}

	// Main entry point for this example
	public static void main( String args[] )
	{
		// Create an instance of the test application
		Table mainFrame	= new Table();
		mainFrame.setVisible( true );
	}
}
