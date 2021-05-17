import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
/*
 * Created by JFormDesigner on Mon Mar 07 18:44:35 IST 2016
 */



/**
 * @author Saurabh Jha
 */
public class ServiceSchedulingForm extends JPanel {
	public ServiceSchedulingForm() {
		initComponents();
	}

	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
		// Generated using JFormDesigner Evaluation license - Dolly Jha
		label1 = new JLabel();
		panel1 = new JPanel();
		label9 = new JLabel();
		comboBox5 = new JComboBox<>();
		label13 = new JLabel();
		textField4 = new JTextField();
		label15 = new JLabel();
		textField15 = new JTextField();
		separator1 = new JSeparator();
		label32 = new JLabel();
		textField16 = new JTextField();
		label2 = new JLabel();
		textField1 = new JTextField();
		label3 = new JLabel();
		textField2 = new JTextField();
		label5 = new JLabel();
		yesBtn = new JRadioButton();
		noBtn = new JRadioButton();
		label4 = new JLabel();
		textField3 = new JTextField();
		button1 = new JButton();
		button2 = new JButton();
		panel2 = new JPanel();

		//======== this ========
		setBackground(Color.white);
		setBorder(new LineBorder(new Color(0, 153, 102), 3));

		// JFormDesigner evaluation mark
		setBorder(new javax.swing.border.CompoundBorder(
			new javax.swing.border.TitledBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0),
				"JFormDesigner Evaluation", javax.swing.border.TitledBorder.CENTER,
				javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Dialog", java.awt.Font.BOLD, 12),
				java.awt.Color.red), getBorder())); addPropertyChangeListener(new java.beans.PropertyChangeListener(){public void propertyChange(java.beans.PropertyChangeEvent e){if("border".equals(e.getPropertyName()))throw new RuntimeException();}});

		setLayout(null);

		//---- label1 ----
		label1.setIcon(new ImageIcon("E:\\Project\\Image\\Scheduling.png"));
		label1.setBorder(null);
		add(label1);
		label1.setBounds(60, 20, 810, 110);

		//======== panel1 ========
		{
			panel1.setBackground(Color.white);
			panel1.setBorder(new TitledBorder(new MatteBorder(2, 2, 2, 2, new Color(0, 102, 51)), "Device Synopsis", TitledBorder.LEADING, TitledBorder.DEFAULT_POSITION,
				new Font("Microsoft JhengHei", Font.BOLD, 18), new Color(0, 102, 51)));
			panel1.setLayout(null);

			//---- label9 ----
			label9.setText("Product Category");
			label9.setForeground(new Color(0, 102, 51));
			label9.setFont(new Font("Lucida Console", Font.PLAIN, 18));
			panel1.add(label9);
			label9.setBounds(20, 40, 176, 19);

			//---- comboBox5 ----
			comboBox5.setModel(new DefaultComboBoxModel<>(new String[] {
				"[Select category]",
				"Televison",
				"Mobile",
				"Refrigerator",
				"Air Conditioner"
			}));
			panel1.add(comboBox5);
			comboBox5.setBounds(220, 40, 155, 25);

			//---- label13 ----
			label13.setText("Model No");
			label13.setForeground(new Color(0, 102, 51));
			label13.setFont(new Font("Lucida Console", Font.PLAIN, 18));
			panel1.add(label13);
			label13.setBounds(20, 100, 88, 19);

			//---- textField4 ----
			textField4.setBorder(new MatteBorder(2, 2, 2, 2, new Color(0, 102, 51)));
			panel1.add(textField4);
			textField4.setBounds(220, 98, 155, 25);

			//---- label15 ----
			label15.setText("Product Name");
			label15.setForeground(new Color(0, 102, 51));
			label15.setFont(new Font("Lucida Console", Font.PLAIN, 18));
			panel1.add(label15);
			label15.setBounds(20, 160, 132, 19);

			//---- textField15 ----
			textField15.setBorder(new MatteBorder(2, 2, 2, 2, new Color(0, 102, 51)));
			panel1.add(textField15);
			textField15.setBounds(220, 156, 155, 25);

			//---- separator1 ----
			separator1.setOrientation(SwingConstants.VERTICAL);
			panel1.add(separator1);
			separator1.setBounds(400, 25, 5, 240);

			//---- label32 ----
			label32.setText("Complaint On");
			label32.setFont(new Font("Lucida Console", Font.PLAIN, 18));
			label32.setForeground(new Color(0, 102, 51));
			panel1.add(label32);
			label32.setBounds(425, 35, 132, 19);

			//---- textField16 ----
			textField16.setBorder(new MatteBorder(2, 2, 2, 2, new Color(0, 102, 51)));
			panel1.add(textField16);
			textField16.setBounds(665, 30, 195, 30);

			//---- label2 ----
			label2.setText("Device Issue");
			label2.setFont(new Font("Lucida Console", Font.PLAIN, 18));
			label2.setForeground(new Color(0, 102, 51));
			panel1.add(label2);
			label2.setBounds(425, 100, 132, 19);

			//---- textField1 ----
			textField1.setBorder(new MatteBorder(2, 2, 2, 2, new Color(0, 102, 51)));
			panel1.add(textField1);
			textField1.setBounds(665, 90, 195, 30);

			//---- label3 ----
			label3.setText("Affected Part");
			label3.setFont(new Font("Lucida Console", Font.PLAIN, 18));
			label3.setForeground(new Color(0, 102, 51));
			panel1.add(label3);
			label3.setBounds(425, 155, 170, 19);

			//---- textField2 ----
			textField2.setBorder(new MatteBorder(2, 2, 2, 2, new Color(0, 102, 51)));
			panel1.add(textField2);
			textField2.setBounds(665, 150, 195, 30);

			//---- label5 ----
			label5.setText("Warranty");
			label5.setFont(new Font("Lucida Console", Font.PLAIN, 18));
			label5.setForeground(new Color(0, 102, 51));
			panel1.add(label5);
			label5.setBounds(425, 220, 88, 19);

			//---- yesBtn ----
			yesBtn.setText("Yes");
			yesBtn.setHorizontalAlignment(SwingConstants.CENTER);
			yesBtn.setFont(new Font("Tahoma", Font.PLAIN, 16));
			yesBtn.setBorder(new MatteBorder(2, 2, 2, 2, new Color(0, 102, 51)));
			yesBtn.setBorderPainted(true);
			panel1.add(yesBtn);
			yesBtn.setBounds(665, 220, 80, 30);

			//---- noBtn ----
			noBtn.setText("No");
			noBtn.setHorizontalAlignment(SwingConstants.CENTER);
			noBtn.setFont(new Font("Tahoma", Font.PLAIN, 16));
			noBtn.setBorder(new MatteBorder(2, 2, 2, 2, new Color(0, 102, 51)));
			noBtn.setBorderPainted(true);
			panel1.add(noBtn);
			noBtn.setBounds(750, 220, 80, 30);

			//---- label4 ----
			label4.setText("Serial No.");
			label4.setFont(new Font("Lucida Console", Font.PLAIN, 18));
			label4.setForeground(new Color(0, 102, 51));
			panel1.add(label4);
			label4.setBounds(new Rectangle(new Point(20, 220), label4.getPreferredSize()));

			//---- textField3 ----
			textField3.setBorder(new MatteBorder(2, 2, 2, 2, new Color(0, 102, 51)));
			panel1.add(textField3);
			textField3.setBounds(220, 214, 155, 25);

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
		panel1.setBounds(25, 150, 895, 285);

		//---- button1 ----
		button1.setText("Exit");
		button1.setIcon(new ImageIcon("E:\\Project\\Image\\exitnew.png"));
		button1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		add(button1);
		button1.setBounds(115, 450, 145, 50);

		//---- button2 ----
		button2.setText("Save");
		button2.setIcon(new ImageIcon("E:\\Project\\Image\\save1.png"));
		button2.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		add(button2);
		button2.setBounds(685, 450, 145, 50);

		//======== panel2 ========
		{
			panel2.setLayout(null);

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
		panel2.setBounds(5, 10, 940, 130);

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
		warrantyGroup.add(yesBtn);
		warrantyGroup.add(noBtn);
		// JFormDesigner - End of component initialization  //GEN-END:initComponents
	}

	// JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
	// Generated using JFormDesigner Evaluation license - Dolly Jha
	private JLabel label1;
	private JPanel panel1;
	private JLabel label9;
	private JComboBox<String> comboBox5;
	private JLabel label13;
	private JTextField textField4;
	private JLabel label15;
	private JTextField textField15;
	private JSeparator separator1;
	private JLabel label32;
	private JTextField textField16;
	private JLabel label2;
	private JTextField textField1;
	private JLabel label3;
	private JTextField textField2;
	private JLabel label5;
	private JRadioButton yesBtn;
	private JRadioButton noBtn;
	private JLabel label4;
	private JTextField textField3;
	private JButton button1;
	private JButton button2;
	private JPanel panel2;
	// JFormDesigner - End of variables declaration  //GEN-END:variables
}
