import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
/*
 * Created by JFormDesigner on Tue Feb 23 16:47:51 IST 2016
 */



/**
 * @author Nishant Kumar
 */
public class CustomerProfile extends JPanel {
	public CustomerProfile() {
		initComponents();
	}

	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
		// Generated using JFormDesigner Evaluation license - Dolly Jha
		panel1 = new JPanel();
		panel2 = new JPanel();
		label1 = new JLabel();
		textField1 = new JTextField();
		panel3 = new JPanel();
		label6 = new JLabel();
		separator1 = new JSeparator();
		textField9 = new JTextField();
		panel15 = new JPanel();
		textField5 = new JTextField();
		label8 = new JLabel();
		textField7 = new JTextField();
		label9 = new JLabel();
		textField6 = new JTextField();
		label7 = new JLabel();
		label13 = new JLabel();
		textField8 = new JTextField();
		label14 = new JLabel();
		textField11 = new JTextField();
		label15 = new JLabel();
		textField12 = new JTextField();
		panel5 = new JPanel();
		label16 = new JLabel();
		textField13 = new JTextField();
		label17 = new JLabel();
		textField14 = new JTextField();
		panel7 = new JPanel();
		label3 = new JLabel();
		comboBox1 = new JComboBox<>();
		comboBox2 = new JComboBox<>();
		comboBox3 = new JComboBox<>();
		label4 = new JLabel();
		radioButton1 = new JRadioButton();
		radioButton2 = new JRadioButton();
		panel4 = new JPanel();
		label5 = new JLabel();
		textField2 = new JTextField();
		panel6 = new JPanel();
		textField3 = new JTextField();
		label2 = new JLabel();
		panel8 = new JPanel();
		button1 = new JButton();
		panel10 = new JPanel();
		panel9 = new JPanel();
		button2 = new JButton();

		//======== this ========
		setBackground(new Color(42, 146, 119));

		// JFormDesigner evaluation mark
		setBorder(new javax.swing.border.CompoundBorder(
			new javax.swing.border.TitledBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0),
				"JFormDesigner Evaluation", javax.swing.border.TitledBorder.CENTER,
				javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Dialog", java.awt.Font.BOLD, 12),
				java.awt.Color.red), getBorder())); addPropertyChangeListener(new java.beans.PropertyChangeListener(){public void propertyChange(java.beans.PropertyChangeEvent e){if("border".equals(e.getPropertyName()))throw new RuntimeException();}});

		setLayout(null);

		//======== panel1 ========
		{
			panel1.setBorder(new TitledBorder(null, "Personal Information", TitledBorder.LEADING, TitledBorder.DEFAULT_POSITION,
				new Font("Lucida Console", Font.PLAIN, 22), Color.white));
			panel1.setBackground(new Color(42, 146, 119));
			panel1.setLayout(null);

			//======== panel2 ========
			{
				panel2.setLayout(null);

				//---- label1 ----
				label1.setText("First Name");
				label1.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 22));
				panel2.add(label1);
				label1.setBounds(new Rectangle(new Point(10, 10), label1.getPreferredSize()));
				panel2.add(textField1);
				textField1.setBounds(115, 5, 195, 25);

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
			panel1.add(panel2);
			panel2.setBounds(10, 30, 320, 40);

			//======== panel3 ========
			{
				panel3.setBorder(new TitledBorder(new LineBorder(new Color(0, 153, 102), 2, true), "Contact Info", TitledBorder.LEFT, TitledBorder.BELOW_TOP,
					new Font("Lucida Console", Font.PLAIN, 24), new Color(0, 153, 102)));
				panel3.setLayout(null);

				//---- label6 ----
				label6.setText(" Permanent Address :");
				label6.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 22));
				panel3.add(label6);
				label6.setBounds(15, 50, 200, 75);

				//---- separator1 ----
				separator1.setOrientation(SwingConstants.VERTICAL);
				panel3.add(separator1);
				separator1.setBounds(695, 15, 20, 140);
				panel3.add(textField9);
				textField9.setBounds(225, 30, 415, 100);

				//======== panel15 ========
				{
					panel15.setLayout(null);
					panel15.add(textField5);
					textField5.setBounds(130, 10, 160, 25);

					//---- label8 ----
					label8.setText("Phone No :");
					label8.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 22));
					panel15.add(label8);
					label8.setBounds(new Rectangle(new Point(350, 10), label8.getPreferredSize()));
					panel15.add(textField7);
					textField7.setBounds(460, 10, 140, 25);

					//---- label9 ----
					label9.setText("Area Code :");
					label9.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 22));
					panel15.add(label9);
					label9.setBounds(new Rectangle(new Point(710, 15), label9.getPreferredSize()));
					panel15.add(textField6);
					textField6.setBounds(820, 15, 150, 25);

					//---- label7 ----
					label7.setText("Mobile No :");
					label7.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 22));
					panel15.add(label7);
					label7.setBounds(new Rectangle(new Point(15, 15), label7.getPreferredSize()));

					{ // compute preferred size
						Dimension preferredSize = new Dimension();
						for(int i = 0; i < panel15.getComponentCount(); i++) {
							Rectangle bounds = panel15.getComponent(i).getBounds();
							preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
							preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
						}
						Insets insets = panel15.getInsets();
						preferredSize.width += insets.right;
						preferredSize.height += insets.bottom;
						panel15.setMinimumSize(preferredSize);
						panel15.setPreferredSize(preferredSize);
					}
				}
				panel3.add(panel15);
				panel15.setBounds(5, 165, 1030, 55);

				//---- label13 ----
				label13.setText("State");
				label13.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 22));
				panel3.add(label13);
				label13.setBounds(new Rectangle(new Point(725, 25), label13.getPreferredSize()));
				panel3.add(textField8);
				textField8.setBounds(820, 25, 170, 25);

				//---- label14 ----
				label14.setText("City");
				label14.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 22));
				panel3.add(label14);
				label14.setBounds(new Rectangle(new Point(725, 70), label14.getPreferredSize()));
				panel3.add(textField11);
				textField11.setBounds(820, 70, 170, 25);

				//---- label15 ----
				label15.setText("Pincode");
				label15.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 22));
				panel3.add(label15);
				label15.setBounds(new Rectangle(new Point(720, 120), label15.getPreferredSize()));
				panel3.add(textField12);
				textField12.setBounds(820, 120, 170, 25);

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
			panel1.add(panel3);
			panel3.setBounds(10, 135, 1040, 225);

			//======== panel5 ========
			{
				panel5.setLayout(null);

				//---- label16 ----
				label16.setText("e-mail :");
				label16.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 22));
				panel5.add(label16);
				label16.setBounds(new Rectangle(new Point(30, 10), label16.getPreferredSize()));
				panel5.add(textField13);
				textField13.setBounds(130, 15, 405, 25);

				//---- label17 ----
				label17.setText("Unique Customer ID");
				label17.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 22));
				panel5.add(label17);
				label17.setBounds(new Rectangle(new Point(550, 15), label17.getPreferredSize()));

				//---- textField14 ----
				textField14.setText("CUS0001");
				textField14.setFont(new Font("Tahoma", Font.PLAIN, 14));
				textField14.setHorizontalAlignment(SwingConstants.CENTER);
				textField14.setEnabled(false);
				panel5.add(textField14);
				textField14.setBounds(740, 15, 250, 25);

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
			panel1.add(panel5);
			panel5.setBounds(10, 370, 1040, 55);

			//======== panel7 ========
			{
				panel7.setLayout(null);

				//---- label3 ----
				label3.setText("Date of Birth");
				label3.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 22));
				panel7.add(label3);
				label3.setBounds(new Rectangle(new Point(10, 5), label3.getPreferredSize()));

				//---- comboBox1 ----
				comboBox1.setModel(new DefaultComboBoxModel<>(new String[] {
					"[dd]"
				}));
				panel7.add(comboBox1);
				comboBox1.setBounds(new Rectangle(new Point(165, 10), comboBox1.getPreferredSize()));

				//---- comboBox2 ----
				comboBox2.setModel(new DefaultComboBoxModel<>(new String[] {
					"[mm]"
				}));
				panel7.add(comboBox2);
				comboBox2.setBounds(new Rectangle(new Point(210, 10), comboBox2.getPreferredSize()));

				//---- comboBox3 ----
				comboBox3.setModel(new DefaultComboBoxModel<>(new String[] {
					"[yy]"
				}));
				panel7.add(comboBox3);
				comboBox3.setBounds(new Rectangle(new Point(260, 10), comboBox3.getPreferredSize()));

				//---- label4 ----
				label4.setText("Gender");
				label4.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 22));
				panel7.add(label4);
				label4.setBounds(new Rectangle(new Point(365, 5), label4.getPreferredSize()));

				//---- radioButton1 ----
				radioButton1.setText("Male");
				radioButton1.setFont(new Font("Tahoma", Font.PLAIN, 16));
				panel7.add(radioButton1);
				radioButton1.setBounds(new Rectangle(new Point(475, 5), radioButton1.getPreferredSize()));

				//---- radioButton2 ----
				radioButton2.setText("Female");
				radioButton2.setFont(new Font("Tahoma", Font.PLAIN, 16));
				panel7.add(radioButton2);
				radioButton2.setBounds(new Rectangle(new Point(570, 5), radioButton2.getPreferredSize()));

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
			panel1.add(panel7);
			panel7.setBounds(10, 90, 1040, 40);

			//======== panel4 ========
			{
				panel4.setLayout(null);

				//---- label5 ----
				label5.setText("Middle Name");
				label5.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 22));
				panel4.add(label5);
				label5.setBounds(10, 5, 110, 26);
				panel4.add(textField2);
				textField2.setBounds(130, 5, 180, 25);

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
			panel1.add(panel4);
			panel4.setBounds(360, 30, 320, 40);

			//======== panel6 ========
			{
				panel6.setLayout(null);
				panel6.add(textField3);
				textField3.setBounds(115, 5, 190, 25);

				//---- label2 ----
				label2.setText("Last Name");
				label2.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 22));
				panel6.add(label2);
				label2.setBounds(15, 5, 88, 26);

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
			panel1.add(panel6);
			panel6.setBounds(725, 30, 320, 40);

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
		panel1.setBounds(10, 5, 1060, 440);

		//======== panel8 ========
		{
			panel8.setBorder(new BevelBorder(BevelBorder.LOWERED));
			panel8.setBackground(new Color(42, 146, 119));
			panel8.setLayout(null);

			//---- button1 ----
			button1.setText("Save");
			button1.setFont(new Font("Verdana", Font.PLAIN, 20));
			button1.setIcon(new ImageIcon("E:\\Project\\Image\\save1.png"));
			panel8.add(button1);
			button1.setBounds(5, 5, 140, 50);

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
		add(panel8);
		panel8.setBounds(140, 460, 150, 60);

		//======== panel10 ========
		{
			panel10.setBackground(new Color(42, 146, 119));
			panel10.setBorder(new BevelBorder(BevelBorder.RAISED));
			panel10.setLayout(null);

			//======== panel9 ========
			{
				panel9.setBorder(new BevelBorder(BevelBorder.LOWERED));
				panel9.setBackground(new Color(42, 146, 119));
				panel9.setLayout(null);

				//---- button2 ----
				button2.setText("Modify");
				button2.setFont(new Font("Verdana", Font.PLAIN, 20));
				button2.setIcon(new ImageIcon("E:\\Project\\Image\\Reset1.png"));
				panel9.add(button2);
				button2.setBounds(5, 5, 150, 50);

				{ // compute preferred size
					Dimension preferredSize = new Dimension();
					for(int i = 0; i < panel9.getComponentCount(); i++) {
						Rectangle bounds = panel9.getComponent(i).getBounds();
						preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
						preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
					}
					Insets insets = panel9.getInsets();
					preferredSize.width += insets.right;
					preferredSize.height += insets.bottom;
					panel9.setMinimumSize(preferredSize);
					panel9.setPreferredSize(preferredSize);
				}
			}
			panel10.add(panel9);
			panel9.setBounds(695, 10, 160, 60);

			{ // compute preferred size
				Dimension preferredSize = new Dimension();
				for(int i = 0; i < panel10.getComponentCount(); i++) {
					Rectangle bounds = panel10.getComponent(i).getBounds();
					preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
					preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
				}
				Insets insets = panel10.getInsets();
				preferredSize.width += insets.right;
				preferredSize.height += insets.bottom;
				panel10.setMinimumSize(preferredSize);
				panel10.setPreferredSize(preferredSize);
			}
		}
		add(panel10);
		panel10.setBounds(15, 450, 1050, 80);

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
	private JPanel panel2;
	private JLabel label1;
	private JTextField textField1;
	private JPanel panel3;
	private JLabel label6;
	private JSeparator separator1;
	private JTextField textField9;
	private JPanel panel15;
	private JTextField textField5;
	private JLabel label8;
	private JTextField textField7;
	private JLabel label9;
	private JTextField textField6;
	private JLabel label7;
	private JLabel label13;
	private JTextField textField8;
	private JLabel label14;
	private JTextField textField11;
	private JLabel label15;
	private JTextField textField12;
	private JPanel panel5;
	private JLabel label16;
	private JTextField textField13;
	private JLabel label17;
	private JTextField textField14;
	private JPanel panel7;
	private JLabel label3;
	private JComboBox<String> comboBox1;
	private JComboBox<String> comboBox2;
	private JComboBox<String> comboBox3;
	private JLabel label4;
	private JRadioButton radioButton1;
	private JRadioButton radioButton2;
	private JPanel panel4;
	private JLabel label5;
	private JTextField textField2;
	private JPanel panel6;
	private JTextField textField3;
	private JLabel label2;
	private JPanel panel8;
	private JButton button1;
	private JPanel panel10;
	private JPanel panel9;
	private JButton button2;
	// JFormDesigner - End of variables declaration  //GEN-END:variables
}
