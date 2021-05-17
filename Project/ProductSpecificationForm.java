import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
/*
 * Created by JFormDesigner on Tue Feb 16 14:54:41 IST 2016
 */



/**
 * @author Nishant Kumar
 */
public class ProductSpecificationForm extends JPanel {
	public ProductSpecificationForm() {
		initComponents();
	}

	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
		// Generated using JFormDesigner Evaluation license - Dolly Jha
		panel1 = new JPanel();
		label1 = new JLabel();
		panel4 = new JPanel();
		panel5 = new JPanel();
		label2 = new JLabel();
		label3 = new JLabel();
		label4 = new JLabel();
		comboBox1 = new JComboBox<>();
		textField1 = new JTextField();
		textField2 = new JTextField();
		panel2 = new JPanel();
		label5 = new JLabel();
		label6 = new JLabel();
		label7 = new JLabel();
		label8 = new JLabel();
		textField3 = new JTextField();
		textField4 = new JTextField();
		panel3 = new JPanel();
		comboBox2 = new JComboBox<>();
		comboBox3 = new JComboBox<>();
		comboBox4 = new JComboBox<>();
		panel6 = new JPanel();
		label9 = new JLabel();
		textField6 = new JTextField();
		textField5 = new JTextField();
		panel7 = new JPanel();
		label10 = new JLabel();
		textField7 = new JTextField();
		panel8 = new JPanel();
		textField8 = new JTextField();
		button2 = new JButton();
		button1 = new JButton();

		//======== this ========

		// JFormDesigner evaluation mark
		setBorder(new javax.swing.border.CompoundBorder(
			new javax.swing.border.TitledBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0),
				"JFormDesigner Evaluation", javax.swing.border.TitledBorder.CENTER,
				javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Dialog", java.awt.Font.BOLD, 12),
				java.awt.Color.red), getBorder())); addPropertyChangeListener(new java.beans.PropertyChangeListener(){public void propertyChange(java.beans.PropertyChangeEvent e){if("border".equals(e.getPropertyName()))throw new RuntimeException();}});

		setLayout(null);

		//======== panel1 ========
		{
			panel1.setBackground(Color.white);
			panel1.setBorder(new LineBorder(new Color(222, 89, 145, 204), 8, true));
			panel1.setLayout(null);

			//---- label1 ----
			label1.setText("         PRODUCT SPECIFICATION FORM");
			label1.setFont(new Font("Tahoma", Font.PLAIN, 26));
			label1.setForeground(new Color(0, 102, 102));
			label1.setBorder(new LineBorder(new Color(0, 102, 51), 4));
			panel1.add(label1);
			label1.setBounds(220, 15, 555, 50);

			{ // compute preferred size
				Dimension preferredSize = new Dimension();
				for(int i = 0; i < panel1.getComponentCount(); i++) {
					Rectangle bounds = panel1.getComponent(i).getBounds();
					preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
					preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
				}
				Insets insets = panel1.getInsets();
				preferredSize.width += insets.right;
				preferredSize.height += insets.bottom;
				panel1.setMinimumSize(preferredSize);
				panel1.setPreferredSize(preferredSize);
			}
		}
		add(panel1);
		panel1.setBounds(0, 10, 1000, 80);

		//======== panel4 ========
		{
			panel4.setBackground(new Color(42, 146, 119));
			panel4.setLayout(null);

			//======== panel5 ========
			{
				panel5.setBorder(new TitledBorder(new BevelBorder(BevelBorder.RAISED, Color.white, null, null, null), "Device Information", TitledBorder.LEADING, TitledBorder.DEFAULT_POSITION,
					new Font("Franklin Gothic Demi Cond", Font.PLAIN, 24), Color.white));
				panel5.setBackground(new Color(42, 146, 119));
				panel5.setFont(new Font("Verdana", Font.PLAIN, 22));
				panel5.setForeground(Color.white);
				panel5.setLayout(null);

				//---- label2 ----
				label2.setText("Category");
				label2.setFont(new Font("Verdana", Font.PLAIN, 22));
				label2.setForeground(Color.white);
				panel5.add(label2);
				label2.setBounds(new Rectangle(new Point(20, 40), label2.getPreferredSize()));

				//---- label3 ----
				label3.setText("Model No");
				label3.setFont(new Font("Verdana", Font.PLAIN, 22));
				label3.setForeground(Color.white);
				panel5.add(label3);
				label3.setBounds(new Rectangle(new Point(20, 90), label3.getPreferredSize()));

				//---- label4 ----
				label4.setText("Serial No");
				label4.setFont(new Font("Verdana", Font.PLAIN, 22));
				label4.setForeground(Color.white);
				panel5.add(label4);
				label4.setBounds(new Rectangle(new Point(20, 145), label4.getPreferredSize()));

				//---- comboBox1 ----
				comboBox1.setModel(new DefaultComboBoxModel<>(new String[] {
					"[Select Device Category]"
				}));
				comboBox1.setBorder(new BevelBorder(BevelBorder.RAISED, Color.white, null, null, null));
				comboBox1.setFont(new Font("Tahoma", Font.PLAIN, 12));
				panel5.add(comboBox1);
				comboBox1.setBounds(190, 45, 165, 25);
				panel5.add(textField1);
				textField1.setBounds(190, 95, 165, 25);
				panel5.add(textField2);
				textField2.setBounds(190, 150, 165, 25);

				{ // compute preferred size
					Dimension preferredSize = new Dimension();
					for(int i = 0; i < panel5.getComponentCount(); i++) {
						Rectangle bounds = panel5.getComponent(i).getBounds();
						preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
						preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
					}
					Insets insets = panel5.getInsets();
					preferredSize.width += insets.right;
					preferredSize.height += insets.bottom;
					panel5.setMinimumSize(preferredSize);
					panel5.setPreferredSize(preferredSize);
				}
			}
			panel4.add(panel5);
			panel5.setBounds(10, 20, 460, 220);

			//======== panel2 ========
			{
				panel2.setBackground(new Color(42, 146, 119));
				panel2.setBorder(new TitledBorder(new BevelBorder(BevelBorder.LOWERED), "Invoice Details", TitledBorder.LEADING, TitledBorder.DEFAULT_POSITION,
					new Font("Franklin Gothic Demi Cond", Font.PLAIN, 24), Color.white));
				panel2.setLayout(null);

				//---- label5 ----
				label5.setText("Invoice No.");
				label5.setFont(new Font("Verdana", Font.PLAIN, 22));
				label5.setForeground(Color.white);
				panel2.add(label5);
				label5.setBounds(new Rectangle(new Point(30, 45), label5.getPreferredSize()));

				//---- label6 ----
				label6.setText("Date of Purchase ");
				label6.setFont(new Font("Verdana", Font.PLAIN, 22));
				label6.setForeground(Color.white);
				panel2.add(label6);
				label6.setBounds(new Rectangle(new Point(550, 40), label6.getPreferredSize()));

				//---- label7 ----
				label7.setText("Delear Name");
				label7.setFont(new Font("Verdana", Font.PLAIN, 22));
				label7.setForeground(Color.white);
				panel2.add(label7);
				label7.setBounds(new Rectangle(new Point(25, 95), label7.getPreferredSize()));

				//---- label8 ----
				label8.setText("Address:-");
				label8.setFont(new Font("Verdana", Font.PLAIN, 22));
				label8.setForeground(Color.white);
				panel2.add(label8);
				label8.setBounds(new Rectangle(new Point(30, 160), label8.getPreferredSize()));
				panel2.add(textField3);
				textField3.setBounds(195, 165, 340, 95);
				panel2.add(textField4);
				textField4.setBounds(205, 45, 255, 25);

				//======== panel3 ========
				{
					panel3.setBackground(new Color(42, 146, 119));
					panel3.setBorder(new BevelBorder(BevelBorder.RAISED));
					panel3.setLayout(null);

					//---- comboBox2 ----
					comboBox2.setModel(new DefaultComboBoxModel<>(new String[] {
						"[dd]"
					}));
					panel3.add(comboBox2);
					comboBox2.setBounds(750, 10, comboBox2.getPreferredSize().width, 25);

					//---- comboBox3 ----
					comboBox3.setModel(new DefaultComboBoxModel<>(new String[] {
						"[mm]"
					}));
					panel3.add(comboBox3);
					comboBox3.setBounds(810, 10, comboBox3.getPreferredSize().width, 25);

					//---- comboBox4 ----
					comboBox4.setModel(new DefaultComboBoxModel<>(new String[] {
						"[yy]"
					}));
					panel3.add(comboBox4);
					comboBox4.setBounds(865, 10, comboBox4.getPreferredSize().width, 25);

					{ // compute preferred size
						Dimension preferredSize = new Dimension();
						for(int i = 0; i < panel3.getComponentCount(); i++) {
							Rectangle bounds = panel3.getComponent(i).getBounds();
							preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
							preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
						}
						Insets insets = panel3.getInsets();
						preferredSize.width += insets.right;
						preferredSize.height += insets.bottom;
						panel3.setMinimumSize(preferredSize);
						panel3.setPreferredSize(preferredSize);
					}
				}
				panel2.add(panel3);
				panel3.setBounds(10, 30, 955, 50);

				//======== panel6 ========
				{
					panel6.setBackground(new Color(42, 146, 119));
					panel6.setBorder(new BevelBorder(BevelBorder.RAISED));
					panel6.setLayout(null);

					//---- label9 ----
					label9.setText("Contact No.");
					label9.setFont(new Font("Verdana", Font.PLAIN, 22));
					label9.setForeground(Color.white);
					panel6.add(label9);
					label9.setBounds(new Rectangle(new Point(545, 15), label9.getPreferredSize()));
					panel6.add(textField6);
					textField6.setBounds(750, 10, 190, 30);
					panel6.add(textField5);
					textField5.setBounds(195, 15, 255, 25);

					{ // compute preferred size
						Dimension preferredSize = new Dimension();
						for(int i = 0; i < panel6.getComponentCount(); i++) {
							Rectangle bounds = panel6.getComponent(i).getBounds();
							preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
							preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
						}
						Insets insets = panel6.getInsets();
						preferredSize.width += insets.right;
						preferredSize.height += insets.bottom;
						panel6.setMinimumSize(preferredSize);
						panel6.setPreferredSize(preferredSize);
					}
				}
				panel2.add(panel6);
				panel6.setBounds(10, 90, 955, 55);

				//======== panel7 ========
				{
					panel7.setBackground(new Color(42, 146, 119));
					panel7.setBorder(new BevelBorder(BevelBorder.RAISED));
					panel7.setLayout(null);

					//---- label10 ----
					label10.setText("Registration No.");
					label10.setFont(new Font("Verdana", Font.PLAIN, 22));
					label10.setForeground(Color.white);
					panel7.add(label10);
					label10.setBounds(new Rectangle(new Point(550, 65), label10.getPreferredSize()));
					panel7.add(textField7);
					textField7.setBounds(755, 65, 190, 30);

					{ // compute preferred size
						Dimension preferredSize = new Dimension();
						for(int i = 0; i < panel7.getComponentCount(); i++) {
							Rectangle bounds = panel7.getComponent(i).getBounds();
							preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
							preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
						}
						Insets insets = panel7.getInsets();
						preferredSize.width += insets.right;
						preferredSize.height += insets.bottom;
						panel7.setMinimumSize(preferredSize);
						panel7.setPreferredSize(preferredSize);
					}
				}
				panel2.add(panel7);
				panel7.setBounds(10, 155, 955, 115);

				{ // compute preferred size
					Dimension preferredSize = new Dimension();
					for(int i = 0; i < panel2.getComponentCount(); i++) {
						Rectangle bounds = panel2.getComponent(i).getBounds();
						preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
						preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
					}
					Insets insets = panel2.getInsets();
					preferredSize.width += insets.right;
					preferredSize.height += insets.bottom;
					panel2.setMinimumSize(preferredSize);
					panel2.setPreferredSize(preferredSize);
				}
			}
			panel4.add(panel2);
			panel2.setBounds(15, 260, 975, 280);

			//======== panel8 ========
			{
				panel8.setBackground(new Color(42, 146, 119));
				panel8.setBorder(new TitledBorder(new BevelBorder(BevelBorder.LOWERED), "Remarks", TitledBorder.LEADING, TitledBorder.DEFAULT_POSITION,
					new Font("Franklin Gothic Demi Cond", Font.PLAIN, 22), Color.white));
				panel8.setLayout(null);
				panel8.add(textField8);
				textField8.setBounds(30, 50, 380, 150);

				{ // compute preferred size
					Dimension preferredSize = new Dimension();
					for(int i = 0; i < panel8.getComponentCount(); i++) {
						Rectangle bounds = panel8.getComponent(i).getBounds();
						preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
						preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
					}
					Insets insets = panel8.getInsets();
					preferredSize.width += insets.right;
					preferredSize.height += insets.bottom;
					panel8.setMinimumSize(preferredSize);
					panel8.setPreferredSize(preferredSize);
				}
			}
			panel4.add(panel8);
			panel8.setBounds(510, 15, 445, 225);

			//---- button2 ----
			button2.setIcon(new ImageIcon("E:\\Project\\Image\\Screenshot_20160306-171652.png"));
			button2.setText("Exit");
			button2.setFont(new Font("Times New Roman", Font.PLAIN, 24));
			panel4.add(button2);
			button2.setBounds(95, 550, 150, 50);

			//---- button1 ----
			button1.setIcon(new ImageIcon("E:\\Project\\Image\\save (2).png"));
			button1.setText("Save");
			button1.setFont(new Font("Times New Roman", Font.PLAIN, 24));
			panel4.add(button1);
			button1.setBounds(690, 550, 150, button1.getPreferredSize().height);

			{ // compute preferred size
				Dimension preferredSize = new Dimension();
				for(int i = 0; i < panel4.getComponentCount(); i++) {
					Rectangle bounds = panel4.getComponent(i).getBounds();
					preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
					preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
				}
				Insets insets = panel4.getInsets();
				preferredSize.width += insets.right;
				preferredSize.height += insets.bottom;
				panel4.setMinimumSize(preferredSize);
				panel4.setPreferredSize(preferredSize);
			}
		}
		add(panel4);
		panel4.setBounds(0, 85, 1000, 610);

		{ // compute preferred size
			Dimension preferredSize = new Dimension();
			for(int i = 0; i < getComponentCount(); i++) {
				Rectangle bounds = getComponent(i).getBounds();
				preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
				preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
			}
			Insets insets = getInsets();
			preferredSize.width += insets.right;
			preferredSize.height += insets.bottom;
			setMinimumSize(preferredSize);
			setPreferredSize(preferredSize);
		}
		// JFormDesigner - End of component initialization  //GEN-END:initComponents
	}

	// JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
	// Generated using JFormDesigner Evaluation license - Dolly Jha
	private JPanel panel1;
	private JLabel label1;
	private JPanel panel4;
	private JPanel panel5;
	private JLabel label2;
	private JLabel label3;
	private JLabel label4;
	private JComboBox<String> comboBox1;
	private JTextField textField1;
	private JTextField textField2;
	private JPanel panel2;
	private JLabel label5;
	private JLabel label6;
	private JLabel label7;
	private JLabel label8;
	private JTextField textField3;
	private JTextField textField4;
	private JPanel panel3;
	private JComboBox<String> comboBox2;
	private JComboBox<String> comboBox3;
	private JComboBox<String> comboBox4;
	private JPanel panel6;
	private JLabel label9;
	private JTextField textField6;
	private JTextField textField5;
	private JPanel panel7;
	private JLabel label10;
	private JTextField textField7;
	private JPanel panel8;
	private JTextField textField8;
	private JButton button2;
	private JButton button1;
	// JFormDesigner - End of variables declaration  //GEN-END:variables
}
