import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
/*
 * Created by JFormDesigner on Tue Apr 26 11:24:57 IST 2016
 */



/**
 * @author Gaurav Kumar
 */
public class ServiceCharge extends JPanel {
	public ServiceCharge() {
		initComponents();
	}

	private void checkBtnActionPerformed() {
		// TODO add your code here
	}

	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
		// Generated using JFormDesigner Evaluation license - Dolly Jha
		ServicePanel = new JPanel();
		comboBox1 = new JComboBox<>();
		label2 = new JLabel();
		label5 = new JLabel();
		label6 = new JLabel();
		comboBox2 = new JComboBox<>();
		yesRadioBtn = new JRadioButton();
		noRadioBtn = new JRadioButton();
		exitBtn = new JButton();
		checkBtn = new JButton();
		label3 = new JLabel();
		panel3 = new JPanel();
		label4 = new JLabel();

		//======== this ========
		setBorder(new LineBorder(new Color(0, 102, 51), 2));

		// JFormDesigner evaluation mark
		setBorder(new javax.swing.border.CompoundBorder(
			new javax.swing.border.TitledBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0),
				"JFormDesigner Evaluation", javax.swing.border.TitledBorder.CENTER,
				javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Dialog", java.awt.Font.BOLD, 12),
				java.awt.Color.red), getBorder())); addPropertyChangeListener(new java.beans.PropertyChangeListener(){public void propertyChange(java.beans.PropertyChangeEvent e){if("border".equals(e.getPropertyName()))throw new RuntimeException();}});

		setLayout(null);

		//======== ServicePanel ========
		{
			ServicePanel.setBorder(new TitledBorder(new LineBorder(new Color(0, 102, 51), 2), "Select Service", TitledBorder.LEFT, TitledBorder.DEFAULT_POSITION,
				new Font("Cambria", Font.BOLD, 20), new Color(0, 102, 51)));
			ServicePanel.setLayout(null);

			//---- comboBox1 ----
			comboBox1.setModel(new DefaultComboBoxModel<>(new String[] {
				"[Select Service Option]",
				"Repair",
				"Replacement",
				"Cleaning",
				"Lubrication",
				"Warranty Extension"
			}));
			ServicePanel.add(comboBox1);
			comboBox1.setBounds(315, 40, 225, 25);

			//---- label2 ----
			label2.setText("Service Cataloge");
			label2.setFont(new Font("Tahoma", Font.PLAIN, 18));
			ServicePanel.add(label2);
			label2.setBounds(new Rectangle(new Point(35, 40), label2.getPreferredSize()));

			//---- label5 ----
			label5.setText("Tax& Others");
			label5.setFont(new Font("Tahoma", Font.PLAIN, 18));
			ServicePanel.add(label5);
			label5.setBounds(new Rectangle(new Point(35, 90), label5.getPreferredSize()));

			//---- label6 ----
			label6.setText("Spares&Components");
			label6.setFont(new Font("Tahoma", Font.PLAIN, 18));
			ServicePanel.add(label6);
			label6.setBounds(new Rectangle(new Point(30, 145), label6.getPreferredSize()));

			//---- comboBox2 ----
			comboBox2.setModel(new DefaultComboBoxModel<>(new String[] {
				"[Select Spare Choice]",
				"Battery",
				"Display",
				"Sound Components",
				"Cooling spares",
				"Switching tools",
				"Power units",
				"Cabinets",
				"Input units"
			}));
			ServicePanel.add(comboBox2);
			comboBox2.setBounds(315, 145, 220, 25);

			//---- yesRadioBtn ----
			yesRadioBtn.setText("Yes");
			yesRadioBtn.setFont(new Font("Tahoma", Font.PLAIN, 14));
			ServicePanel.add(yesRadioBtn);
			yesRadioBtn.setBounds(new Rectangle(new Point(315, 90), yesRadioBtn.getPreferredSize()));

			//---- noRadioBtn ----
			noRadioBtn.setText("No");
			noRadioBtn.setFont(new Font("Tahoma", Font.PLAIN, 14));
			ServicePanel.add(noRadioBtn);
			noRadioBtn.setBounds(new Rectangle(new Point(390, 90), noRadioBtn.getPreferredSize()));

			//---- exitBtn ----
			exitBtn.setText("Exit");
			exitBtn.setIcon(new ImageIcon("E:\\Project\\Image\\exitnew.png"));
			exitBtn.setFont(new Font("Tahoma", Font.PLAIN, 16));
			exitBtn.addActionListener(e -> checkBtnActionPerformed());
			ServicePanel.add(exitBtn);
			exitBtn.setBounds(90, 225, 145, 50);

			//---- checkBtn ----
			checkBtn.setText("Check");
			checkBtn.setIcon(new ImageIcon("E:\\Project\\Image\\icon-services.21092210_std.png"));
			checkBtn.setFont(new Font("Tahoma", Font.PLAIN, 16));
			checkBtn.addActionListener(e -> checkBtnActionPerformed());
			ServicePanel.add(checkBtn);
			checkBtn.setBounds(345, 225, 145, 50);

			{ // compute preferred size
				Dimension preferredSize = new Dimension();
				for(int i = 0; i < ServicePanel.getComponentCount(); i++) {
					Rectangle bounds = ServicePanel.getComponent(i).getBounds();
					preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
					preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
				}
				Insets insets = ServicePanel.getInsets();
				preferredSize.width += insets.right;
				preferredSize.height += insets.bottom;
				ServicePanel.setMinimumSize(preferredSize);
				ServicePanel.setPreferredSize(preferredSize);
			}
		}
		add(ServicePanel);
		ServicePanel.setBounds(40, 125, 640, 300);

		//---- label3 ----
		label3.setIcon(new ImageIcon("E:\\Project\\Image\\Check_Balances-512.png"));
		add(label3);
		label3.setBounds(75, 25, 65, 55);

		//======== panel3 ========
		{
			panel3.setBorder(new MatteBorder(2, 2, 2, 2, new Color(0, 102, 51)));
			panel3.setLayout(null);

			//---- label4 ----
			label4.setText("    Service Charge Description");
			label4.setFont(new Font("Andalus", Font.BOLD, 24));
			label4.setForeground(new Color(0, 102, 51));
			label4.setBorder(new MatteBorder(2, 2, 1, 2, new Color(0, 102, 51)));
			panel3.add(label4);
			label4.setBounds(145, 15, 382, label4.getPreferredSize().height);

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
		add(panel3);
		panel3.setBounds(45, 20, 645, 70);

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

		//---- TaxBtnGroup ----
		ButtonGroup TaxBtnGroup = new ButtonGroup();
		TaxBtnGroup.add(yesRadioBtn);
		TaxBtnGroup.add(noRadioBtn);
		// JFormDesigner - End of component initialization  //GEN-END:initComponents
	}

	// JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
	// Generated using JFormDesigner Evaluation license - Dolly Jha
	private JPanel ServicePanel;
	private JComboBox<String> comboBox1;
	private JLabel label2;
	private JLabel label5;
	private JLabel label6;
	private JComboBox<String> comboBox2;
	private JRadioButton yesRadioBtn;
	private JRadioButton noRadioBtn;
	private JButton exitBtn;
	private JButton checkBtn;
	private JLabel label3;
	private JPanel panel3;
	private JLabel label4;
	// JFormDesigner - End of variables declaration  //GEN-END:variables
}
