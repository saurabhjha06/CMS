import java.awt.*;
import javax.swing.*;
import javax.swing.table.*;
/*
 * Created by JFormDesigner on Thu May 12 19:36:23 IST 2016
 */



/**
 * @author Dolly Jha
 */
public class SearchResults extends JFrame {
	public SearchResults() {
		initComponents();
	}

	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
		// Generated using JFormDesigner Evaluation license - Dolly Jha
		label1 = new JLabel();
		scrollPane1 = new JScrollPane();
		table1 = new JTable();
		label2 = new JLabel();

		//======== this ========
		setTitle("Search Results");
		setBackground(Color.lightGray);
		Container contentPane = getContentPane();
		contentPane.setLayout(null);

		//---- label1 ----
		label1.setText("Search Results are as follows:-");
		label1.setFont(new Font("Times New Roman", Font.BOLD, 24));
		contentPane.add(label1);
		label1.setBounds(new Rectangle(new Point(35, 25), label1.getPreferredSize()));

		//======== scrollPane1 ========
		{

			//---- table1 ----
			table1.setModel(new DefaultTableModel(
				new Object[][] {
					{"Saurabh", "REG0006", "9304438190", "07/02/2015", "680"},
					{"Rakesh", "REG0002", "9934571037", "05/01/2015", "720"},
					{"Amit", "REG0003", "9835017112", "02/02/2015", "720"},
					{"Sumit", "REG0004", "9124879548", "03/03/2015", "620"},
					{"Ravi", "REG0005", "7855489022", "27/02/2015", "910"},
					{"Nishant", "REG0006", "7785858621", "21/02/2015", "720"},
					{"Vishwas", "REG0007", "9921457895", "17/01/2015", "620"},
					{"Sunil", "REG0008", "9835210547", "15/02/2015", "620"},
					{null, null, null, null, null},
					{null, null, null, null, null},
					{null, null, null, null, null},
					{null, null, null, null, null},
					{null, null, null, null, null},
					{null, null, null, null, null},
					{null, null, null, null, null},
				},
				new String[] {
					"NAME", "COMPLAIN NO", "MOBILE NO", "COMPLAINT ON", "MODEL NO"
				}
			));
			{
				TableColumnModel cm = table1.getColumnModel();
				cm.getColumn(0).setResizable(false);
				cm.getColumn(0).setCellEditor(new DefaultCellEditor(
					new JComboBox(new DefaultComboBoxModel(new String[] {
						"Saurabh",
						"Rakesh",
						"Amit",
						"Sumit",
						"Ravi",
						"Nishant",
						"Vishwas",
						"Sunil",
						"Prashant"
					}))));
				cm.getColumn(1).setCellEditor(new DefaultCellEditor(
					new JComboBox(new DefaultComboBoxModel(new String[] {
						"REG0001",
						"REG0002",
						"REG0003",
						"REG0004",
						"REG0005",
						"REG0006",
						"REG0007",
						"REG0008",
						"REG0009"
					}))));
				cm.getColumn(2).setCellEditor(new DefaultCellEditor(
					new JComboBox(new DefaultComboBoxModel(new String[] {
						"9304438190",
						"9934571037",
						"9835017112",
						"9124879548",
						"7855489022",
						"7785858621",
						"9921457895",
						"9835210547",
						"9935875210"
					}))));
				cm.getColumn(3).setCellEditor(new DefaultCellEditor(
					new JComboBox(new DefaultComboBoxModel(new String[] {
						"07/02/2015",
						"05/01/2015",
						"02/02/2015",
						"03/03/2015",
						"27/02/2015",
						"21/02/2015",
						"17/01/2015",
						"15/02/2015",
						"09/01/2015"
					}))));
				cm.getColumn(4).setCellEditor(new DefaultCellEditor(
					new JComboBox(new DefaultComboBoxModel(new String[] {
						"680",
						"720",
						"720",
						"620",
						"910",
						"720",
						"620",
						"620",
						"620"
					}))));
			}
			table1.setCellSelectionEnabled(true);
			scrollPane1.setViewportView(table1);
		}
		contentPane.add(scrollPane1);
		scrollPane1.setBounds(35, 85, 560, 255);

		//---- label2 ----
		label2.setText("*Above records are from compalints registered eariler");
		label2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(label2);
		label2.setBounds(new Rectangle(new Point(275, 385), label2.getPreferredSize()));

		{ // compute preferred size
			Dimension preferredSize = new Dimension();
			for(int i = 0; i < contentPane.getComponentCount(); i++) {
				Rectangle bounds = contentPane.getComponent(i).getBounds();
				preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
				preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
			}
			Insets insets = contentPane.getInsets();
			preferredSize.width += insets.right;
			preferredSize.height += insets.bottom;
			contentPane.setMinimumSize(preferredSize);
			contentPane.setPreferredSize(preferredSize);
		}
		pack();
		setLocationRelativeTo(getOwner());
		// JFormDesigner - End of component initialization  //GEN-END:initComponents
	}

	// JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
	// Generated using JFormDesigner Evaluation license - Dolly Jha
	private JLabel label1;
	private JScrollPane scrollPane1;
	private JTable table1;
	private JLabel label2;
	// JFormDesigner - End of variables declaration  //GEN-END:variables
}
