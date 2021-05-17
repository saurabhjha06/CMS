import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
/*
 * Created by JFormDesigner on Mon Mar 07 22:29:28 IST 2016
 */



/**
 * @author Saurabh Jha
 */
public class ServiceRejection extends JPanel {
	public ServiceRejection() {
		initComponents();
	}

	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
		// Generated using JFormDesigner Evaluation license - Dolly Jha
		panel1 = new JPanel();
		label1 = new JLabel();
		panel2 = new JPanel();
		panel8 = new JPanel();
		label9 = new JLabel();
		label13 = new JLabel();
		label15 = new JLabel();
		comboBox5 = new JComboBox<>();
		textField4 = new JTextField();
		label32 = new JLabel();
		textField17 = new JTextField();
		textField18 = new JTextField();
		panel3 = new JPanel();
		label2 = new JLabel();
		label3 = new JLabel();
		label4 = new JLabel();
		label5 = new JLabel();
		textField1 = new JTextField();
		textField2 = new JTextField();
		comboBox1 = new JComboBox<>();
		yesRadioBtn = new JRadioButton();
		noRadioBtn = new JRadioButton();
		panel4 = new JPanel();
		panel9 = new JPanel();
		scrollPane1 = new JScrollPane();
		textArea1 = new JTextArea();
		panel10 = new JPanel();
		scrollPane2 = new JScrollPane();
		textArea2 = new JTextArea();
		panel7 = new JPanel();
		button1 = new JButton();
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
			panel1.setBorder(new LineBorder(new Color(222, 89, 145, 204), 8));
			panel1.setLayout(null);

			//---- label1 ----
			label1.setText("Service Rejection Form");
			label1.setBorder(new LineBorder(new Color(0, 102, 51), 4));
			label1.setFont(new Font("Tahoma", Font.PLAIN, 28));
			label1.setForeground(new Color(0, 102, 51));
			label1.setHorizontalAlignment(SwingConstants.CENTER);
			panel1.add(label1);
			label1.setBounds(210, 15, 580, 45);

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
		panel1.setBounds(0, 0, 1080, 80);

		//======== panel2 ========
		{
			panel2.setBackground(new Color(255, 255, 204));
			panel2.setLayout(null);

			//======== panel8 ========
			{
				panel8.setBorder(new TitledBorder(new LineBorder(new Color(0, 102, 51), 2, true), "Product Info", TitledBorder.LEADING, TitledBorder.DEFAULT_POSITION,
					new Font("Franklin Gothic Demi Cond", Font.PLAIN, 24), new Color(0, 102, 51)));
				panel8.setBackground(Color.white);
				panel8.setLayout(null);

				//---- label9 ----
				label9.setText("Product Category");
				label9.setForeground(new Color(0, 102, 51));
				label9.setFont(new Font("Lucida Console", Font.PLAIN, 18));
				label9.setBackground(Color.white);
				panel8.add(label9);
				label9.setBounds(new Rectangle(new Point(35, 55), label9.getPreferredSize()));

				//---- label13 ----
				label13.setText("Model No");
				label13.setForeground(new Color(0, 102, 51));
				label13.setFont(new Font("Lucida Console", Font.PLAIN, 18));
				label13.setBackground(Color.white);
				panel8.add(label13);
				label13.setBounds(new Rectangle(new Point(35, 105), label13.getPreferredSize()));

				//---- label15 ----
				label15.setText("Product Name");
				label15.setForeground(new Color(0, 102, 51));
				label15.setFont(new Font("Lucida Console", Font.PLAIN, 18));
				label15.setBackground(Color.white);
				panel8.add(label15);
				label15.setBounds(new Rectangle(new Point(35, 150), label15.getPreferredSize()));

				//---- comboBox5 ----
				comboBox5.setModel(new DefaultComboBoxModel<>(new String[] {
					"[Select Category]",
					"Televison",
					"Mobile",
					"Refrigerator",
					"Air Conditioner"
				}));
				panel8.add(comboBox5);
				comboBox5.setBounds(270, 55, 165, 25);

				//---- textField4 ----
				textField4.setBackground(Color.white);
				panel8.add(textField4);
				textField4.setBounds(270, 100, 165, 25);

				//---- label32 ----
				label32.setText("Complaint On");
				label32.setFont(new Font("Lucida Console", Font.PLAIN, 18));
				label32.setForeground(new Color(0, 102, 51));
				label32.setBackground(Color.white);
				panel8.add(label32);
				label32.setBounds(new Rectangle(new Point(35, 200), label32.getPreferredSize()));

				//---- textField17 ----
				textField17.setBackground(Color.white);
				panel8.add(textField17);
				textField17.setBounds(270, 190, 165, 25);

				//---- textField18 ----
				textField18.setBackground(Color.white);
				panel8.add(textField18);
				textField18.setBounds(270, 145, 165, 25);

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
			panel2.add(panel8);
			panel8.setBounds(10, 15, 475, 260);

			//======== panel3 ========
			{
				panel3.setBackground(Color.white);
				panel3.setBorder(new TitledBorder(new LineBorder(new Color(0, 102, 51), 2, true), "Complaint Issue", TitledBorder.RIGHT, TitledBorder.DEFAULT_POSITION,
					new Font("Franklin Gothic Demi Cond", Font.PLAIN, 24), new Color(0, 102, 51)));
				panel3.setLayout(null);

				//---- label2 ----
				label2.setText("Device Issue");
				label2.setFont(new Font("Lucida Console", Font.PLAIN, 18));
				label2.setForeground(new Color(0, 102, 51));
				panel3.add(label2);
				label2.setBounds(new Rectangle(new Point(20, 60), label2.getPreferredSize()));

				//---- label3 ----
				label3.setText("Affected area/Part");
				label3.setFont(new Font("Lucida Console", Font.PLAIN, 18));
				label3.setForeground(new Color(0, 102, 51));
				panel3.add(label3);
				label3.setBounds(new Rectangle(new Point(20, 115), label3.getPreferredSize()));

				//---- label4 ----
				label4.setText("Damage Percentage");
				label4.setFont(new Font("Lucida Console", Font.PLAIN, 18));
				label4.setForeground(new Color(0, 102, 51));
				panel3.add(label4);
				label4.setBounds(new Rectangle(new Point(15, 165), label4.getPreferredSize()));

				//---- label5 ----
				label5.setText("Warranty");
				label5.setFont(new Font("Lucida Console", Font.PLAIN, 18));
				label5.setForeground(new Color(0, 102, 51));
				panel3.add(label5);
				label5.setBounds(new Rectangle(new Point(20, 215), label5.getPreferredSize()));
				panel3.add(textField1);
				textField1.setBounds(300, 50, 215, 25);
				panel3.add(textField2);
				textField2.setBounds(300, 106, 215, 25);

				//---- comboBox1 ----
				comboBox1.setModel(new DefaultComboBoxModel<>(new String[] {
					"    {Select Nearest Value}",
					"10%",
					"20%",
					"30%",
					"40%",
					"50%",
					"60%",
					"70%",
					"80%",
					"90%",
					">90%"
				}));
				comboBox1.setFont(new Font("Tahoma", Font.PLAIN, 16));
				panel3.add(comboBox1);
				comboBox1.setBounds(300, 162, 205, 25);

				//---- yesRadioBtn ----
				yesRadioBtn.setText("Yes");
				yesRadioBtn.setHorizontalAlignment(SwingConstants.CENTER);
				yesRadioBtn.setFont(new Font("Tahoma", Font.PLAIN, 16));
				panel3.add(yesRadioBtn);
				yesRadioBtn.setBounds(300, 205, 80, 30);

				//---- noRadioBtn ----
				noRadioBtn.setText("No");
				noRadioBtn.setHorizontalAlignment(SwingConstants.CENTER);
				noRadioBtn.setFont(new Font("Tahoma", Font.PLAIN, 16));
				panel3.add(noRadioBtn);
				noRadioBtn.setBounds(390, 205, 80, 30);

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
			panel3.setBounds(495, 15, 555, 260);

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
		add(panel2);
		panel2.setBounds(5, 90, 1060, 295);

		//======== panel4 ========
		{
			panel4.setBackground(new Color(255, 255, 204));
			panel4.setBorder(new TitledBorder(new LineBorder(new Color(0, 102, 51), 2, true), "Reason of Rejection", TitledBorder.CENTER, TitledBorder.DEFAULT_POSITION,
				new Font("Franklin Gothic Demi Cond", Font.PLAIN, 24), new Color(0, 102, 51)));
			panel4.setLayout(null);

			//======== panel9 ========
			{
				panel9.setBorder(new TitledBorder(new LineBorder(new Color(0, 153, 102), 2, true), "What Happened", TitledBorder.LEADING, TitledBorder.DEFAULT_POSITION,
					new Font("Tahoma", Font.PLAIN, 18), new Color(0, 153, 102)));
				panel9.setBackground(Color.white);
				panel9.setLayout(null);

				//======== scrollPane1 ========
				{
					scrollPane1.setViewportView(textArea1);
				}
				panel9.add(scrollPane1);
				scrollPane1.setBounds(35, 40, 300, 115);

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
			panel4.add(panel9);
			panel9.setBounds(50, 40, 380, 190);

			//======== panel10 ========
			{
				panel10.setBackground(Color.white);
				panel10.setBorder(new TitledBorder(new LineBorder(new Color(0, 153, 102), 2, true), "What's Next", TitledBorder.LEADING, TitledBorder.DEFAULT_POSITION,
					new Font("Tahoma", Font.PLAIN, 18), new Color(0, 153, 102)));
				panel10.setLayout(null);

				//======== scrollPane2 ========
				{
					scrollPane2.setViewportView(textArea2);
				}
				panel10.add(scrollPane2);
				scrollPane2.setBounds(30, 40, 315, 110);

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
			panel4.add(panel10);
			panel10.setBounds(605, 40, 380, 190);

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
		panel4.setBounds(15, 410, 1040, 250);

		//======== panel7 ========
		{
			panel7.setBackground(new Color(255, 255, 204));
			panel7.setLayout(null);

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
		add(panel7);
		panel7.setBounds(5, 395, 1065, 280);

		//---- button1 ----
		button1.setText("Exit");
		button1.setIcon(new ImageIcon("E:\\Project\\Image\\Exit3.png"));
		button1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		add(button1);
		button1.setBounds(90, 680, 140, button1.getPreferredSize().height);

		//---- button2 ----
		button2.setText("Save");
		button2.setIcon(new ImageIcon("E:\\Project\\Image\\save (2).png"));
		button2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		add(button2);
		button2.setBounds(750, 680, 135, button2.getPreferredSize().height);

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

		//---- warrantyGroup ----
		ButtonGroup warrantyGroup = new ButtonGroup();
		warrantyGroup.add(yesRadioBtn);
		warrantyGroup.add(noRadioBtn);
		// JFormDesigner - End of component initialization  //GEN-END:initComponents
	}

	// JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
	// Generated using JFormDesigner Evaluation license - Dolly Jha
	private JPanel panel1;
	private JLabel label1;
	private JPanel panel2;
	private JPanel panel8;
	private JLabel label9;
	private JLabel label13;
	private JLabel label15;
	private JComboBox<String> comboBox5;
	private JTextField textField4;
	private JLabel label32;
	private JTextField textField17;
	private JTextField textField18;
	private JPanel panel3;
	private JLabel label2;
	private JLabel label3;
	private JLabel label4;
	private JLabel label5;
	private JTextField textField1;
	private JTextField textField2;
	private JComboBox<String> comboBox1;
	private JRadioButton yesRadioBtn;
	private JRadioButton noRadioBtn;
	private JPanel panel4;
	private JPanel panel9;
	private JScrollPane scrollPane1;
	private JTextArea textArea1;
	private JPanel panel10;
	private JScrollPane scrollPane2;
	private JTextArea textArea2;
	private JPanel panel7;
	private JButton button1;
	private JButton button2;
	// JFormDesigner - End of variables declaration  //GEN-END:variables
}
