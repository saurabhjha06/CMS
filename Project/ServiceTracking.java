import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
/*
 * Created by JFormDesigner on Wed Mar 02 11:55:00 IST 2016
 */



/**
 * @author Saurabh Jha
 */
public class ServiceTracking extends JPanel {
	public ServiceTracking() {
		initComponents();
	}

	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
		// Generated using JFormDesigner Evaluation license - Gaurav Kumar
		panel5 = new JPanel();
		panel2 = new JPanel();
		panel3 = new JPanel();
		label5 = new JLabel();
		label6 = new JLabel();
		label7 = new JLabel();
		textField3 = new JTextField();
		passwordField1 = new JPasswordField();
		button2 = new JButton();
		panel6 = new JPanel();
		panel1 = new JPanel();
		label2 = new JLabel();
		label3 = new JLabel();
		label4 = new JLabel();
		textField1 = new JTextField();
		textField2 = new JTextField();
		button1 = new JButton();
		panel7 = new JPanel();
		panel4 = new JPanel();
		label8 = new JLabel();
		label9 = new JLabel();
		label10 = new JLabel();
		textField4 = new JTextField();
		textField5 = new JTextField();
		button3 = new JButton();
		panel8 = new JPanel();
		panel9 = new JPanel();
		label11 = new JLabel();
		label12 = new JLabel();
		textField6 = new JTextField();
		label13 = new JLabel();
		comboBox1 = new JComboBox<>();
		comboBox2 = new JComboBox<>();
		comboBox3 = new JComboBox<>();
		button4 = new JButton();
		label14 = new JLabel();
		label1 = new JLabel();

		//======== this ========
		setBorder(new MatteBorder(4, 3, 2, 3, new Color(0, 102, 51)));

		// JFormDesigner evaluation mark
		setBorder(new javax.swing.border.CompoundBorder(
			new javax.swing.border.TitledBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0),
				"JFormDesigner Evaluation", javax.swing.border.TitledBorder.CENTER,
				javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Dialog", java.awt.Font.BOLD, 12),
				java.awt.Color.red), getBorder())); addPropertyChangeListener(new java.beans.PropertyChangeListener(){public void propertyChange(java.beans.PropertyChangeEvent e){if("border".equals(e.getPropertyName()))throw new RuntimeException();}});

		setLayout(null);

		//======== panel5 ========
		{
			panel5.setBorder(new MatteBorder(5, 2, 5, 2, new Color(0, 102, 51)));
			panel5.setLayout(null);

			//======== panel2 ========
			{
				panel2.setBorder(new MatteBorder(4, 4, 2, 4, new Color(0, 102, 51)));
				panel2.setBackground(new Color(0, 102, 51));
				panel2.setLayout(null);

				//======== panel3 ========
				{
					panel3.setBorder(new TitledBorder(null, "Option 2", TitledBorder.RIGHT, TitledBorder.DEFAULT_POSITION,
						new Font("Franklin Gothic Demi Cond", Font.PLAIN, 24), Color.white));
					panel3.setBackground(new Color(0, 102, 51));
					panel3.setFont(new Font("Tahoma", Font.PLAIN, 14));
					panel3.setLayout(null);

					//---- label5 ----
					label5.setText("I have a user id and password");
					label5.setForeground(Color.white);
					label5.setFont(new Font("Tahoma", Font.BOLD, 16));
					panel3.add(label5);
					label5.setBounds(new Rectangle(new Point(85, 30), label5.getPreferredSize()));

					//---- label6 ----
					label6.setText("User Id:-");
					label6.setForeground(Color.white);
					label6.setFont(new Font("Tahoma", Font.PLAIN, 14));
					panel3.add(label6);
					label6.setBounds(new Rectangle(new Point(20, 85), label6.getPreferredSize()));

					//---- label7 ----
					label7.setText("Password:-");
					label7.setForeground(Color.white);
					label7.setFont(new Font("Tahoma", Font.PLAIN, 14));
					panel3.add(label7);
					label7.setBounds(new Rectangle(new Point(20, 150), label7.getPreferredSize()));
					panel3.add(textField3);
					textField3.setBounds(110, 75, 210, 25);
					panel3.add(passwordField1);
					passwordField1.setBounds(110, 140, 210, 25);

					//---- button2 ----
					button2.setText("Continue");
					button2.setIcon(new ImageIcon("E:\\Project\\Image\\ok.png"));
					button2.setFont(new Font("Times New Roman", Font.PLAIN, 20));
					panel3.add(button2);
					button2.setBounds(new Rectangle(new Point(260, 210), button2.getPreferredSize()));

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
				panel3.setBounds(15, 10, 420, 270);

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
			panel5.add(panel2);
			panel2.setBounds(500, 20, 450, 290);

			//======== panel6 ========
			{
				panel6.setBackground(new Color(0, 102, 51));
				panel6.setLayout(null);

				//======== panel1 ========
				{
					panel1.setBackground(new Color(0, 102, 51));
					panel1.setBorder(new TitledBorder(null, " Option 1", TitledBorder.LEADING, TitledBorder.DEFAULT_POSITION,
						new Font("Franklin Gothic Demi Cond", Font.PLAIN, 24), Color.white));
					panel1.setLayout(null);

					//---- label2 ----
					label2.setText("I have a Complaint No.");
					label2.setForeground(Color.white);
					label2.setFont(new Font("Tahoma", Font.BOLD, 16));
					panel1.add(label2);
					label2.setBounds(165, 25, 190, label2.getPreferredSize().height);

					//---- label3 ----
					label3.setText("Complaint No:-");
					label3.setForeground(Color.white);
					label3.setFont(new Font("Tahoma", Font.PLAIN, 14));
					panel1.add(label3);
					label3.setBounds(20, 90, 100, label3.getPreferredSize().height);

					//---- label4 ----
					label4.setText("Mobile No:-");
					label4.setForeground(Color.white);
					label4.setFont(new Font("Tahoma", Font.PLAIN, 14));
					panel1.add(label4);
					label4.setBounds(20, 160, 75, label4.getPreferredSize().height);
					panel1.add(textField1);
					textField1.setBounds(150, 85, 210, 25);
					panel1.add(textField2);
					textField2.setBounds(150, 150, 210, 25);

					//---- button1 ----
					button1.setText("Continue");
					button1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
					button1.setIcon(new ImageIcon("E:\\Project\\Image\\ok.png"));
					panel1.add(button1);
					button1.setBounds(260, 215, button1.getPreferredSize().width, 48);

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
				panel6.add(panel1);
				panel1.setBounds(15, 5, 425, 275);

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
			panel5.add(panel6);
			panel6.setBounds(10, 20, 455, 290);

			//======== panel7 ========
			{
				panel7.setBackground(new Color(0, 102, 51));
				panel7.setLayout(null);

				//======== panel4 ========
				{
					panel4.setBorder(new TitledBorder(null, "Option 3", TitledBorder.LEADING, TitledBorder.DEFAULT_POSITION,
						new Font("Franklin Gothic Demi Cond", Font.PLAIN, 24), Color.white));
					panel4.setBackground(new Color(0, 102, 51));
					panel4.setLayout(null);

					//---- label8 ----
					label8.setText("I have a Serial No.");
					label8.setForeground(Color.white);
					label8.setFont(new Font("Tahoma", Font.BOLD, 16));
					panel4.add(label8);
					label8.setBounds(new Rectangle(new Point(180, 35), label8.getPreferredSize()));

					//---- label9 ----
					label9.setText("Serial No:-");
					label9.setForeground(Color.white);
					label9.setFont(new Font("Tahoma", Font.PLAIN, 14));
					panel4.add(label9);
					label9.setBounds(new Rectangle(new Point(25, 85), label9.getPreferredSize()));

					//---- label10 ----
					label10.setText("Device Name:-");
					label10.setForeground(Color.white);
					label10.setFont(new Font("Tahoma", Font.PLAIN, 14));
					panel4.add(label10);
					label10.setBounds(new Rectangle(new Point(25, 140), label10.getPreferredSize()));
					panel4.add(textField4);
					textField4.setBounds(145, 80, 210, 25);
					panel4.add(textField5);
					textField5.setBounds(145, 135, 210, 25);

					//---- button3 ----
					button3.setText("Continue");
					button3.setIcon(new ImageIcon("E:\\Project\\Image\\ok.png"));
					button3.setFont(new Font("Times New Roman", Font.PLAIN, 20));
					panel4.add(button3);
					button3.setBounds(new Rectangle(new Point(260, 200), button3.getPreferredSize()));

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
				panel7.add(panel4);
				panel4.setBounds(30, 10, 425, 260);

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
			panel5.add(panel7);
			panel7.setBounds(10, 345, 460, 280);

			//======== panel8 ========
			{
				panel8.setBackground(new Color(0, 102, 51));
				panel8.setLayout(null);

				//======== panel9 ========
				{
					panel9.setBackground(new Color(0, 102, 51));
					panel9.setBorder(new TitledBorder(null, "Option 4", TitledBorder.RIGHT, TitledBorder.DEFAULT_POSITION,
						new Font("Franklin Gothic Demi Cond", Font.PLAIN, 24), Color.white));
					panel9.setLayout(null);

					//---- label11 ----
					label11.setText("I know the date of registration");
					label11.setFont(new Font("Tahoma", Font.BOLD, 18));
					label11.setForeground(Color.white);
					panel9.add(label11);
					label11.setBounds(new Rectangle(new Point(25, 30), label11.getPreferredSize()));

					//---- label12 ----
					label12.setText("Name:-");
					label12.setFont(new Font("Tahoma", Font.PLAIN, 18));
					label12.setForeground(Color.white);
					panel9.add(label12);
					label12.setBounds(new Rectangle(new Point(30, 75), label12.getPreferredSize()));
					panel9.add(textField6);
					textField6.setBounds(120, 70, 210, 25);

					//---- label13 ----
					label13.setText("Date:-");
					label13.setFont(new Font("Tahoma", Font.PLAIN, 18));
					label13.setForeground(Color.white);
					panel9.add(label13);
					label13.setBounds(new Rectangle(new Point(30, 135), label13.getPreferredSize()));

					//---- comboBox1 ----
					comboBox1.setModel(new DefaultComboBoxModel<>(new String[] {
						"[DD]"
					}));
					panel9.add(comboBox1);
					comboBox1.setBounds(120, 135, comboBox1.getPreferredSize().width, 25);

					//---- comboBox2 ----
					comboBox2.setModel(new DefaultComboBoxModel<>(new String[] {
						"[MM]"
					}));
					panel9.add(comboBox2);
					comboBox2.setBounds(170, 135, comboBox2.getPreferredSize().width, 25);

					//---- comboBox3 ----
					comboBox3.setModel(new DefaultComboBoxModel<>(new String[] {
						"[YY]"
					}));
					panel9.add(comboBox3);
					comboBox3.setBounds(220, 135, comboBox3.getPreferredSize().width, 25);

					//---- button4 ----
					button4.setText("Continue");
					button4.setIcon(new ImageIcon("E:\\Project\\Image\\ok.png"));
					button4.setFont(new Font("Times New Roman", Font.PLAIN, 20));
					panel9.add(button4);
					button4.setBounds(new Rectangle(new Point(260, 195), button4.getPreferredSize()));

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
				panel8.add(panel9);
				panel9.setBounds(20, 15, 420, 255);

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
			panel5.add(panel8);
			panel8.setBounds(500, 345, 450, 275);

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
		add(panel5);
		panel5.setBounds(5, 120, 960, 650);

		//---- label14 ----
		label14.setIcon(new ImageIcon("E:\\Project\\Image\\settings.png"));
		add(label14);
		label14.setBounds(20, 5, 170, 115);

		//---- label1 ----
		label1.setText("text");
		label1.setIcon(new ImageIcon("E:\\Project\\Image\\Service tracking.png"));
		add(label1);
		label1.setBounds(205, 15, 705, 95);

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
	// Generated using JFormDesigner Evaluation license - Gaurav Kumar
	private JPanel panel5;
	private JPanel panel2;
	private JPanel panel3;
	private JLabel label5;
	private JLabel label6;
	private JLabel label7;
	private JTextField textField3;
	private JPasswordField passwordField1;
	private JButton button2;
	private JPanel panel6;
	private JPanel panel1;
	private JLabel label2;
	private JLabel label3;
	private JLabel label4;
	private JTextField textField1;
	private JTextField textField2;
	private JButton button1;
	private JPanel panel7;
	private JPanel panel4;
	private JLabel label8;
	private JLabel label9;
	private JLabel label10;
	private JTextField textField4;
	private JTextField textField5;
	private JButton button3;
	private JPanel panel8;
	private JPanel panel9;
	private JLabel label11;
	private JLabel label12;
	private JTextField textField6;
	private JLabel label13;
	private JComboBox<String> comboBox1;
	private JComboBox<String> comboBox2;
	private JComboBox<String> comboBox3;
	private JButton button4;
	private JLabel label14;
	private JLabel label1;
	// JFormDesigner - End of variables declaration  //GEN-END:variables
}
