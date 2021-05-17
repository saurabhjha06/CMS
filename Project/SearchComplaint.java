import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
/*
 * Created by JFormDesigner on Fri Feb 26 17:04:40 IST 2016
 */



/**
 * @author Nishant Kumar
 */
public class SearchComplaint extends JPanel {
	public SearchComplaint() {
		initComponents();
	}

	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
		// Generated using JFormDesigner Evaluation license - Dolly Jha
		panel1 = new JPanel();
		panel2 = new JPanel();
		panel3 = new JPanel();
		label1 = new JLabel();
		compNoRadioBtn = new JRadioButton();
		panel4 = new JPanel();
		label3 = new JLabel();
		complainerRadioBtn = new JRadioButton();
		panel5 = new JPanel();
		label2 = new JLabel();
		dateRadioBtn = new JRadioButton();
		textField1 = new JTextField();
		textField2 = new JTextField();
		textField3 = new JTextField();
		label10 = new JLabel();
		label12 = new JLabel();
		panel7 = new JPanel();
		panel8 = new JPanel();
		comboBox1 = new JComboBox<>();
		button2 = new JButton();
		button1 = new JButton();

		//======== this ========
		setBackground(Color.white);
		setBorder(new MatteBorder(2, 2, 2, 2, new Color(0, 102, 51)));

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
			panel1.setBorder(new TitledBorder(new LineBorder(new Color(0, 102, 51), 2), "Search Complaint", TitledBorder.LEFT, TitledBorder.DEFAULT_POSITION,
				new Font("Lucida Console", Font.BOLD, 24), new Color(0, 102, 51)));
			panel1.setLayout(null);

			//======== panel2 ========
			{
				panel2.setBorder(new TitledBorder(new MatteBorder(2, 2, 1, 1, new Color(0, 102, 51)), "Select Search Choice", TitledBorder.CENTER, TitledBorder.DEFAULT_POSITION,
					new Font("Lucida Console", Font.PLAIN, 22), new Color(0, 102, 51)));
				panel2.setBackground(Color.white);
				panel2.setLayout(null);

				//======== panel3 ========
				{
					panel3.setBackground(new Color(255, 255, 204));
					panel3.setFont(new Font("Verdana", Font.PLAIN, 20));
					panel3.setLayout(null);

					//---- label1 ----
					label1.setText("Complaint Number");
					label1.setFont(new Font("NSimSun", Font.BOLD, 24));
					label1.setHorizontalAlignment(SwingConstants.CENTER);
					label1.setForeground(new Color(0, 102, 51));
					panel3.add(label1);
					label1.setBounds(new Rectangle(new Point(145, 5), label1.getPreferredSize()));

					//---- compNoRadioBtn ----
					compNoRadioBtn.setBackground(new Color(255, 255, 204));
					panel3.add(compNoRadioBtn);
					compNoRadioBtn.setBounds(new Rectangle(new Point(45, 10), compNoRadioBtn.getPreferredSize()));

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
				panel3.setBounds(5, 35, 530, 40);

				//======== panel4 ========
				{
					panel4.setBackground(new Color(255, 255, 204));
					panel4.setLayout(null);

					//---- label3 ----
					label3.setText("Name of Complainer");
					label3.setFont(new Font("NSimSun", Font.BOLD, 24));
					label3.setHorizontalAlignment(SwingConstants.CENTER);
					label3.setForeground(new Color(0, 102, 51));
					panel4.add(label3);
					label3.setBounds(new Rectangle(new Point(135, 5), label3.getPreferredSize()));

					//---- complainerRadioBtn ----
					complainerRadioBtn.setBackground(new Color(255, 255, 204));
					panel4.add(complainerRadioBtn);
					complainerRadioBtn.setBounds(new Rectangle(new Point(45, 10), complainerRadioBtn.getPreferredSize()));

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
				panel2.add(panel4);
				panel4.setBounds(5, 120, 530, 40);

				//======== panel5 ========
				{
					panel5.setBackground(new Color(255, 255, 204));
					panel5.setLayout(null);

					//---- label2 ----
					label2.setText("Date of Complaint");
					label2.setFont(new Font("NSimSun", Font.BOLD, 24));
					label2.setHorizontalAlignment(SwingConstants.CENTER);
					label2.setForeground(new Color(0, 102, 51));
					panel5.add(label2);
					label2.setBounds(new Rectangle(new Point(145, 10), label2.getPreferredSize()));

					//---- dateRadioBtn ----
					dateRadioBtn.setBackground(new Color(255, 255, 204));
					panel5.add(dateRadioBtn);
					dateRadioBtn.setBounds(new Rectangle(new Point(45, 10), dateRadioBtn.getPreferredSize()));

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
				panel2.add(panel5);
				panel5.setBounds(5, 210, 530, 40);

				//---- textField1 ----
				textField1.setBorder(new MatteBorder(2, 2, 2, 2, new Color(0, 102, 51)));
				panel2.add(textField1);
				textField1.setBounds(140, 85, 210, 25);

				//---- textField2 ----
				textField2.setBorder(new MatteBorder(2, 2, 2, 2, new Color(0, 102, 51)));
				panel2.add(textField2);
				textField2.setBounds(138, 175, 210, 25);

				//---- textField3 ----
				textField3.setBorder(new MatteBorder(2, 2, 2, 2, new Color(0, 102, 51)));
				panel2.add(textField3);
				textField3.setBounds(138, 265, 210, 25);

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
			panel2.setBounds(25, 60, 540, 310);

			//---- label10 ----
			label10.setText("Cancel");
			label10.setForeground(Color.white);
			label10.setFont(new Font("Verdana", Font.BOLD, 18));
			panel1.add(label10);
			label10.setBounds(new Rectangle(new Point(575, 430), label10.getPreferredSize()));

			//---- label12 ----
			label12.setText("Search");
			label12.setForeground(Color.white);
			label12.setFont(new Font("Verdana", Font.BOLD, 18));
			panel1.add(label12);
			label12.setBounds(new Rectangle(new Point(205, 430), label12.getPreferredSize()));

			//======== panel7 ========
			{
				panel7.setBackground(Color.white);
				panel7.setBorder(new TitledBorder(new MatteBorder(2, 1, 2, 2, new Color(0, 102, 51)), "Sort Complaint By", TitledBorder.RIGHT, TitledBorder.DEFAULT_POSITION,
					new Font("Tahoma", Font.PLAIN, 18), new Color(0, 102, 51)));
				panel7.setLayout(null);

				//======== panel8 ========
				{
					panel8.setLayout(null);

					//---- comboBox1 ----
					comboBox1.setModel(new DefaultComboBoxModel<>(new String[] {
						"[Select sorting Options]",
						"Alphabet order",
						"Pincode",
						"Contact No"
					}));
					comboBox1.setFont(new Font("Segoe UI Light", Font.PLAIN, 16));
					panel8.add(comboBox1);
					comboBox1.setBounds(10, 5, 205, comboBox1.getPreferredSize().height);

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
				panel7.add(panel8);
				panel8.setBounds(5, 30, 225, 40);

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
			panel7.setBounds(590, 60, 235, 305);

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
		panel1.setBounds(15, 10, 855, 390);

		//---- button2 ----
		button2.setIcon(new ImageIcon("E:\\Project\\Image\\Search-Engine-Optimization-icon.png"));
		button2.setText("Search");
		button2.setFont(new Font("Segoe UI", Font.BOLD, 16));
		add(button2);
		button2.setBounds(575, 415, 190, 55);

		//---- button1 ----
		button1.setIcon(new ImageIcon("E:\\Project\\Image\\cancel.png"));
		button1.setFont(new Font("Segoe UI", Font.BOLD, 16));
		button1.setText("Cancel");
		add(button1);
		button1.setBounds(85, 410, 180, 55);

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

		//---- searchChoiceGroup ----
		ButtonGroup searchChoiceGroup = new ButtonGroup();
		searchChoiceGroup.add(compNoRadioBtn);
		searchChoiceGroup.add(complainerRadioBtn);
		searchChoiceGroup.add(dateRadioBtn);
		// JFormDesigner - End of component initialization  //GEN-END:initComponents
	}

	// JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
	// Generated using JFormDesigner Evaluation license - Dolly Jha
	private JPanel panel1;
	private JPanel panel2;
	private JPanel panel3;
	private JLabel label1;
	private JRadioButton compNoRadioBtn;
	private JPanel panel4;
	private JLabel label3;
	private JRadioButton complainerRadioBtn;
	private JPanel panel5;
	private JLabel label2;
	private JRadioButton dateRadioBtn;
	private JTextField textField1;
	private JTextField textField2;
	private JTextField textField3;
	private JLabel label10;
	private JLabel label12;
	private JPanel panel7;
	private JPanel panel8;
	private JComboBox<String> comboBox1;
	private JButton button2;
	private JButton button1;
	// JFormDesigner - End of variables declaration  //GEN-END:variables
}
