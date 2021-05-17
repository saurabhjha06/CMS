import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import com.jgoodies.forms.factories.*;
/*
 * Created by JFormDesigner on Mon Feb 15 00:07:03 IST 2016
 */



/**
 * @author Nishant Kumar
 */
public class Registrationform extends JPanel {
	public Registrationform() {
		initComponents();
	}

	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
		// Generated using JFormDesigner Evaluation license - Dolly Jha
		panel1 = new JPanel();
		label1 = new JLabel();
		panel3 = new JPanel();
		label4 = new JLabel();
		First_Name = new JTextField();
		label10 = new JLabel();
		panel4 = new JPanel();
		panel9 = new JPanel();
		label7 = new JLabel();
		comboBox1 = new JComboBox<>();
		comboBox3 = new JComboBox<>();
		comboBox4 = new JComboBox<>();
		panel10 = new JPanel();
		label6 = new JLabel();
		maleRadioBtn = new JRadioButton();
		femaleRadioBtn = new JRadioButton();
		panel11 = new JPanel();
		label3 = new JLabel();
		textField1 = new JTextField();
		textField6 = new JTextField();
		panel7 = new JPanel();
		textField5 = new JTextField();
		textField7 = new JTextField();
		textField10 = new JTextField();
		textField9 = new JTextField();
		label14 = new JLabel();
		label20 = new JLabel();
		textField8 = new JTextField();
		label21 = new JLabel();
		label22 = new JLabel();
		textField2 = new JTextField();
		label27 = new JLabel();
		textField13 = new JTextField();
		label29 = new JLabel();
		textField11 = new JTextField();
		panel16 = new JPanel();
		label25 = new JLabel();
		label17 = new JLabel();
		panel17 = new JPanel();
		label24 = new JLabel();
		label23 = new JLabel();
		label18 = new JLabel();
		panel18 = new JPanel();
		label19 = new JLabel();
		label8 = new JLabel();
		label26 = new JLabel();
		panel19 = new JPanel();
		label2 = new JLabel();
		label35 = new JLabel();
		textField12 = new JTextField();
		panel20 = new JPanel();
		label31 = new JLabel();
		label28 = new JLabel();
		label5 = new JLabel();
		label36 = new JLabel();
		button2 = new JButton();
		button3 = new JButton();
		panel8 = new JPanel();
		label9 = new JLabel();
		label13 = new JLabel();
		comboBox5 = new JComboBox<>();
		panel12 = new JPanel();
		label12 = new JLabel();
		panel13 = new JPanel();
		textField4 = new JTextField();
		label11 = new JLabel();
		panel14 = new JPanel();
		label15 = new JLabel();
		textField15 = new JTextField();
		panel15 = new JPanel();
		label32 = new JLabel();
		comboBox7 = new JComboBox<>();
		comboBox6 = new JComboBox<>();
		comboBox2 = new JComboBox<>();

		//======== this ========
		setBackground(Color.white);
		setForeground(Color.white);
		setBorder(new LineBorder(Color.black, 3));

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
			label1.setText("   COMPLAINT REGISTRATION FORM");
			label1.setBackground(new Color(102, 102, 255));
			label1.setForeground(new Color(0, 102, 51));
			label1.setFont(new Font("Tahoma", Font.PLAIN, 28));
			label1.setBorder(new LineBorder(new Color(0, 102, 51), 4));
			panel1.add(label1);
			label1.setBounds(255, 15, 530, 40);

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
		panel1.setBounds(5, 5, 1070, 75);

		//======== panel3 ========
		{
			panel3.setBackground(Color.white);
			panel3.setBorder(new TitledBorder(new LineBorder(new Color(0, 102, 51), 2, true), "Personal Information", TitledBorder.LEADING, TitledBorder.DEFAULT_POSITION,
				new Font("Franklin Gothic Demi Cond", Font.PLAIN, 24), new Color(42, 149, 119)));
			panel3.setLayout(null);

			//---- label4 ----
			label4.setText(" Name");
			label4.setFont(new Font("Bookman Old Style", Font.PLAIN, 18));
			label4.setForeground(Color.white);
			panel3.add(label4);
			label4.setBounds(15, 50, 115, label4.getPreferredSize().height);
			panel3.add(First_Name);
			First_Name.setBounds(160, 45, 200, 25);

			//---- label10 ----
			label10.setText("*");
			label10.setForeground(Color.white);
			label10.setFont(new Font("Tahoma", Font.PLAIN, 22));
			panel3.add(label10);
			label10.setBounds(110, 45, 30, 25);

			//======== panel4 ========
			{
				panel4.setBackground(new Color(42, 146, 119));
				panel4.setBorder(new BevelBorder(BevelBorder.RAISED));
				panel4.setLayout(null);

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
			panel3.add(panel4);
			panel4.setBounds(10, 30, 585, 50);

			//======== panel9 ========
			{
				panel9.setBackground(new Color(42, 146, 119));
				panel9.setBorder(new BevelBorder(BevelBorder.RAISED));
				panel9.setLayout(null);

				//---- label7 ----
				label7.setText("Date of birth");
				label7.setFont(new Font("Baskerville Old Face", Font.PLAIN, 18));
				label7.setForeground(Color.white);
				panel9.add(label7);
				label7.setBounds(10, 15, 100, label7.getPreferredSize().height);

				//---- comboBox1 ----
				comboBox1.setModel(new DefaultComboBoxModel<>(new String[] {
					"[dd]",
					"01",
					"02",
					"03",
					"04",
					"05",
					"06",
					"07",
					"08",
					"09",
					"10"
				}));
				comboBox1.setFont(new Font("Tahoma", Font.PLAIN, 14));
				panel9.add(comboBox1);
				comboBox1.setBounds(150, 10, comboBox1.getPreferredSize().width, 25);

				//---- comboBox3 ----
				comboBox3.setModel(new DefaultComboBoxModel<>(new String[] {
					"[mm]",
					"January",
					"february",
					"March",
					"April",
					"May",
					"June",
					"July",
					"August",
					"September",
					"October",
					"November",
					"December"
				}));
				comboBox3.setFont(new Font("Tahoma", Font.PLAIN, 14));
				panel9.add(comboBox3);
				comboBox3.setBounds(210, 10, comboBox3.getPreferredSize().width, 25);

				//---- comboBox4 ----
				comboBox4.setModel(new DefaultComboBoxModel<>(new String[] {
					"[yy]",
					"1990",
					"1991",
					"1992",
					"1993",
					"1994",
					"1995",
					"1996",
					"1997",
					"1998",
					"1999",
					"2001",
					"2002",
					"2003",
					"2004",
					"2005",
					"2006",
					"2007",
					"2008",
					"2009",
					"2010",
					"2011",
					"2012",
					"2013",
					"2014",
					"2015",
					"2016",
					"2017",
					"2018",
					"2019",
					"2020"
				}));
				comboBox4.setFont(new Font("Tahoma", Font.PLAIN, 14));
				panel9.add(comboBox4);
				comboBox4.setBounds(310, 10, comboBox4.getPreferredSize().width, 25);

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
			panel3.add(panel9);
			panel9.setBounds(10, 85, 585, 50);

			//======== panel10 ========
			{
				panel10.setBackground(new Color(42, 146, 119));
				panel10.setBorder(new BevelBorder(BevelBorder.RAISED));
				panel10.setLayout(null);

				//---- label6 ----
				label6.setText("Gender");
				label6.setFont(new Font("Baskerville Old Face", Font.PLAIN, 18));
				label6.setForeground(Color.white);
				panel10.add(label6);
				label6.setBounds(25, 20, 65, 19);

				//---- maleRadioBtn ----
				maleRadioBtn.setText("Male");
				maleRadioBtn.setFont(new Font("Tahoma", Font.PLAIN, 16));
				maleRadioBtn.setBorderPainted(true);
				maleRadioBtn.setBackground(new Color(42, 149, 119));
				maleRadioBtn.setForeground(Color.white);
				panel10.add(maleRadioBtn);
				maleRadioBtn.setBounds(150, 10, 70, 30);

				//---- femaleRadioBtn ----
				femaleRadioBtn.setText("Female");
				femaleRadioBtn.setFont(new Font("Tahoma", Font.PLAIN, 16));
				femaleRadioBtn.setBorderPainted(true);
				femaleRadioBtn.setBackground(new Color(42, 149, 119));
				femaleRadioBtn.setForeground(Color.white);
				panel10.add(femaleRadioBtn);
				femaleRadioBtn.setBounds(250, 10, 85, 30);

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
			panel3.add(panel10);
			panel10.setBounds(10, 140, 585, 50);

			//======== panel11 ========
			{
				panel11.setBackground(new Color(42, 146, 119));
				panel11.setBorder(new BevelBorder(BevelBorder.RAISED));
				panel11.setLayout(null);

				//---- label3 ----
				label3.setText("Complain No");
				label3.setFont(new Font("Baskerville Old Face", Font.PLAIN, 18));
				label3.setForeground(Color.white);
				panel11.add(label3);
				label3.setBounds(new Rectangle(new Point(15, 15), label3.getPreferredSize()));

				//---- textField1 ----
				textField1.setText("REG0004");
				textField1.setFont(new Font("Times New Roman", Font.PLAIN, 18));
				textField1.setHorizontalAlignment(SwingConstants.CENTER);
				textField1.setEditable(false);
				panel11.add(textField1);
				textField1.setBounds(150, 10, 220, 25);

				{ // compute preferred size
					Dimension preferredSize = new Dimension();
					for(int i = 0; i < panel11.getComponentCount(); i++) {
						Rectangle bounds = panel11.getComponent(i).getBounds();
						preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
						preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
					}
					Insets insets = panel11.getInsets();
					preferredSize.width += insets.right;
					preferredSize.height += insets.bottom;
					panel11.setMinimumSize(preferredSize);
					panel11.setPreferredSize(preferredSize);
				}
			}
			panel3.add(panel11);
			panel11.setBounds(10, 195, 585, 50);

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
		panel3.setBounds(5, 85, 610, 260);
		add(textField6);
		textField6.setBounds(150, 480, 365, 25);

		//======== panel7 ========
		{
			panel7.setBorder(new TitledBorder(new LineBorder(new Color(0, 102, 51), 2, true), "Personal Information", TitledBorder.LEADING, TitledBorder.DEFAULT_POSITION,
				new Font("Franklin Gothic Demi Cond", Font.PLAIN, 24), new Color(42, 149, 119)));
			panel7.setBackground(Color.white);
			panel7.setForeground(Color.red);
			panel7.setLayout(null);
			panel7.add(textField5);
			textField5.setBounds(145, 55, 375, 25);
			panel7.add(textField7);
			textField7.setBounds(145, 175, 370, 25);
			panel7.add(textField10);
			textField10.setBounds(690, 115, 235, 25);
			panel7.add(textField9);
			textField9.setBounds(690, 170, 160, 25);

			//---- label14 ----
			label14.setText("*");
			label14.setFont(new Font("Tahoma", Font.PLAIN, 22));
			label14.setForeground(Color.white);
			panel7.add(label14);
			label14.setBounds(new Rectangle(new Point(95, 50), label14.getPreferredSize()));

			//---- label20 ----
			label20.setText("District/City");
			label20.setFont(new Font("Baskerville Old Face", Font.PLAIN, 18));
			label20.setForeground(Color.white);
			panel7.add(label20);
			label20.setBounds(575, 60, 100, label20.getPreferredSize().height);
			panel7.add(textField8);
			textField8.setBounds(690, 55, 230, 25);

			//---- label21 ----
			label21.setText("State/UT");
			label21.setFont(new Font("Baskerville Old Face", Font.PLAIN, 18));
			label21.setForeground(Color.white);
			panel7.add(label21);
			label21.setBounds(575, 112, 95, 20);

			//---- label22 ----
			label22.setText("Pincode");
			label22.setFont(new Font("Baskerville Old Face", Font.PLAIN, 18));
			label22.setForeground(Color.white);
			panel7.add(label22);
			label22.setBounds(575, 165, 60, 40);
			panel7.add(textField2);
			textField2.setBounds(690, 240, 160, 25);

			//---- label27 ----
			label27.setText("Phone No");
			label27.setFont(new Font("Baskerville Old Face", Font.PLAIN, 18));
			label27.setForeground(Color.white);
			panel7.add(label27);
			label27.setBounds(new Rectangle(new Point(30, 250), label27.getPreferredSize()));
			panel7.add(textField13);
			textField13.setBounds(145, 300, 210, 25);

			//---- label29 ----
			label29.setText("E-mail");
			label29.setFont(new Font("Baskerville Old Face", Font.PLAIN, 18));
			label29.setForeground(Color.white);
			panel7.add(label29);
			label29.setBounds(new Rectangle(new Point(575, 300), label29.getPreferredSize()));
			panel7.add(textField11);
			textField11.setBounds(690, 295, 250, 25);

			//======== panel16 ========
			{
				panel16.setBackground(new Color(42, 146, 119));
				panel16.setBorder(new BevelBorder(BevelBorder.RAISED));
				panel16.setLayout(null);

				//---- label25 ----
				label25.setText("*");
				label25.setFont(new Font("Tahoma", Font.PLAIN, 22));
				label25.setForeground(Color.white);
				panel16.add(label25);
				label25.setBounds(645, 10, 20, 17);

				//---- label17 ----
				label17.setText("address 1");
				label17.setFont(new Font("Baskerville Old Face", Font.PLAIN, 18));
				label17.setForeground(Color.white);
				panel16.add(label17);
				label17.setBounds(10, 20, 95, label17.getPreferredSize().height);

				{ // compute preferred size
					Dimension preferredSize = new Dimension();
					for(int i = 0; i < panel16.getComponentCount(); i++) {
						Rectangle bounds = panel16.getComponent(i).getBounds();
						preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
						preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
					}
					Insets insets = panel16.getInsets();
					preferredSize.width += insets.right;
					preferredSize.height += insets.bottom;
					panel16.setMinimumSize(preferredSize);
					panel16.setPreferredSize(preferredSize);
				}
			}
			panel7.add(panel16);
			panel16.setBounds(20, 40, 980, 50);

			//======== panel17 ========
			{
				panel17.setBackground(new Color(42, 146, 119));
				panel17.setBorder(new BevelBorder(BevelBorder.RAISED));
				panel17.setLayout(null);

				//---- label24 ----
				label24.setText("*");
				label24.setFont(new Font("Tahoma", Font.PLAIN, 22));
				label24.setForeground(Color.white);
				panel17.add(label24);
				label24.setBounds(635, 0, 23, label24.getPreferredSize().height);

				//---- label23 ----
				label23.setText("*");
				label23.setFont(new Font("Tahoma", Font.PLAIN, 22));
				label23.setForeground(Color.white);
				panel17.add(label23);
				label23.setBounds(70, 5, 18, label23.getPreferredSize().height);

				//---- label18 ----
				label18.setText("address 2");
				label18.setFont(new Font("Baskerville Old Face", Font.PLAIN, 18));
				label18.setForeground(Color.white);
				panel17.add(label18);
				label18.setBounds(5, 25, 95, label18.getPreferredSize().height);

				{ // compute preferred size
					Dimension preferredSize = new Dimension();
					for(int i = 0; i < panel17.getComponentCount(); i++) {
						Rectangle bounds = panel17.getComponent(i).getBounds();
						preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
						preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
					}
					Insets insets = panel17.getInsets();
					preferredSize.width += insets.right;
					preferredSize.height += insets.bottom;
					panel17.setMinimumSize(preferredSize);
					panel17.setPreferredSize(preferredSize);
				}
			}
			panel7.add(panel17);
			panel17.setBounds(20, 102, 980, 50);

			//======== panel18 ========
			{
				panel18.setBackground(new Color(42, 146, 119));
				panel18.setBorder(new BevelBorder(BevelBorder.RAISED));
				panel18.setLayout(null);

				//---- label19 ----
				label19.setText("address 3");
				label19.setFont(new Font("Baskerville Old Face", Font.PLAIN, 18));
				label19.setForeground(Color.white);
				panel18.add(label19);
				label19.setBounds(10, 10, 80, 24);

				//---- label8 ----
				label8.setText("*");
				label8.setFont(new Font("Tahoma", Font.PLAIN, 22));
				label8.setForeground(Color.white);
				panel18.add(label8);
				label8.setBounds(80, 5, label8.getPreferredSize().width, 17);

				//---- label26 ----
				label26.setText("*");
				label26.setFont(new Font("Tahoma", Font.PLAIN, 22));
				label26.setForeground(Color.white);
				panel18.add(label26);
				label26.setBounds(615, 0, 23, 27);

				{ // compute preferred size
					Dimension preferredSize = new Dimension();
					for(int i = 0; i < panel18.getComponentCount(); i++) {
						Rectangle bounds = panel18.getComponent(i).getBounds();
						preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
						preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
					}
					Insets insets = panel18.getInsets();
					preferredSize.width += insets.right;
					preferredSize.height += insets.bottom;
					panel18.setMinimumSize(preferredSize);
					panel18.setPreferredSize(preferredSize);
				}
			}
			panel7.add(panel18);
			panel18.setBounds(20, 164, 980, 50);

			//======== panel19 ========
			{
				panel19.setBackground(new Color(42, 146, 119));
				panel19.setBorder(new BevelBorder(BevelBorder.RAISED));
				panel19.setLayout(null);

				//---- label2 ----
				label2.setText("Area Code");
				label2.setFont(new Font("Baskerville Old Face", Font.PLAIN, 18));
				label2.setForeground(Color.white);
				panel19.add(label2);
				label2.setBounds(555, 10, 85, 29);

				//---- label35 ----
				label35.setText("*");
				label35.setForeground(Color.white);
				label35.setFont(new Font("Tahoma", Font.PLAIN, 22));
				panel19.add(label35);
				label35.setBounds(new Rectangle(new Point(80, 5), label35.getPreferredSize()));
				panel19.add(textField12);
				textField12.setBounds(125, 15, 165, 25);

				{ // compute preferred size
					Dimension preferredSize = new Dimension();
					for(int i = 0; i < panel19.getComponentCount(); i++) {
						Rectangle bounds = panel19.getComponent(i).getBounds();
						preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
						preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
					}
					Insets insets = panel19.getInsets();
					preferredSize.width += insets.right;
					preferredSize.height += insets.bottom;
					panel19.setMinimumSize(preferredSize);
					panel19.setPreferredSize(preferredSize);
				}
			}
			panel7.add(panel19);
			panel19.setBounds(20, 226, 980, 50);

			//======== panel20 ========
			{
				panel20.setBackground(new Color(42, 146, 119));
				panel20.setBorder(new BevelBorder(BevelBorder.RAISED));
				panel20.setLayout(null);

				//---- label31 ----
				label31.setText("*");
				label31.setFont(new Font("Tahoma", Font.PLAIN, 22));
				label31.setForeground(Color.white);
				panel20.add(label31);
				label31.setBounds(55, 5, 20, label31.getPreferredSize().height);

				//---- label28 ----
				label28.setText("Mobile");
				label28.setFont(new Font("Baskerville Old Face", Font.PLAIN, 18));
				label28.setForeground(Color.white);
				panel20.add(label28);
				label28.setBounds(new Rectangle(new Point(5, 20), label28.getPreferredSize()));

				//---- label5 ----
				label5.setText("*");
				label5.setFont(new Font("Tahoma", Font.PLAIN, 20));
				label5.setForeground(Color.white);
				panel20.add(label5);
				label5.setBounds(new Rectangle(new Point(605, 5), label5.getPreferredSize()));

				{ // compute preferred size
					Dimension preferredSize = new Dimension();
					for(int i = 0; i < panel20.getComponentCount(); i++) {
						Rectangle bounds = panel20.getComponent(i).getBounds();
						preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
						preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
					}
					Insets insets = panel20.getInsets();
					preferredSize.width += insets.right;
					preferredSize.height += insets.bottom;
					panel20.setMinimumSize(preferredSize);
					panel20.setPreferredSize(preferredSize);
				}
			}
			panel7.add(panel20);
			panel20.setBounds(20, 288, 980, 50);

			//---- label36 ----
			label36.setText("*");
			panel7.add(label36);
			label36.setBounds(635, 225, 35, 25);

			//---- button2 ----
			button2.setIcon(new ImageIcon("E:\\Project\\Image\\Reset1.png"));
			button2.setText("Clear");
			button2.setFont(new Font("Times New Roman", Font.PLAIN, 24));
			button2.setBackground(new Color(42, 146, 119));
			button2.setBorder(new LineBorder(new Color(0, 102, 102), 2));
			panel7.add(button2);
			button2.setBounds(155, 350, 150, 45);

			//---- button3 ----
			button3.setIcon(new ImageIcon("E:\\Project\\Image\\save1.png"));
			button3.setText("Save");
			button3.setFont(new Font("Times New Roman", Font.PLAIN, 24));
			button3.setBorder(new LineBorder(new Color(0, 102, 102), 2));
			button3.setBackground(new Color(42, 146, 119));
			panel7.add(button3);
			button3.setBounds(615, 350, 150, 45);

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
		panel7.setBounds(5, 360, 1050, 420);

		//======== panel8 ========
		{
			panel8.setBorder(new TitledBorder(new LineBorder(new Color(0, 102, 51), 2, true), "Personal Information", TitledBorder.LEADING, TitledBorder.DEFAULT_POSITION,
				new Font("Franklin Gothic Demi Cond", Font.PLAIN, 24), new Color(42, 149, 119)));
			panel8.setBackground(Color.white);
			panel8.setLayout(null);

			//---- label9 ----
			label9.setText(" Category");
			label9.setForeground(Color.white);
			label9.setFont(new Font("Bookman Old Style", Font.PLAIN, 18));
			panel8.add(label9);
			label9.setBounds(new Rectangle(new Point(35, 40), label9.getPreferredSize()));

			//---- label13 ----
			label13.setText("Model No");
			label13.setForeground(Color.white);
			label13.setFont(new Font("Bookman Old Style", Font.PLAIN, 18));
			panel8.add(label13);
			label13.setBounds(new Rectangle(new Point(35, 95), label13.getPreferredSize()));

			//---- comboBox5 ----
			comboBox5.setModel(new DefaultComboBoxModel<>(new String[] {
				"[Select]",
				"Television",
				"Refrigerator",
				"Mobile Phone",
				"Air Conditioner"
			}));
			panel8.add(comboBox5);
			comboBox5.setBounds(170, 40, 175, 25);

			//======== panel12 ========
			{
				panel12.setBackground(new Color(42, 146, 119));
				panel12.setBorder(new BevelBorder(BevelBorder.RAISED));
				panel12.setLayout(null);

				//---- label12 ----
				label12.setText("*");
				label12.setFont(new Font("Tahoma", Font.PLAIN, 22));
				label12.setForeground(Color.white);
				panel12.add(label12);
				label12.setBounds(105, 5, label12.getPreferredSize().width, 22);

				{ // compute preferred size
					Dimension preferredSize = new Dimension();
					for(int i = 0; i < panel12.getComponentCount(); i++) {
						Rectangle bounds = panel12.getComponent(i).getBounds();
						preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
						preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
					}
					Insets insets = panel12.getInsets();
					preferredSize.width += insets.right;
					preferredSize.height += insets.bottom;
					panel12.setMinimumSize(preferredSize);
					panel12.setPreferredSize(preferredSize);
				}
			}
			panel8.add(panel12);
			panel12.setBounds(20, 30, 385, 45);

			//======== panel13 ========
			{
				panel13.setBackground(new Color(42, 146, 119));
				panel13.setBorder(new BevelBorder(BevelBorder.RAISED));
				panel13.setLayout(null);
				panel13.add(textField4);
				textField4.setBounds(155, 10, 170, 25);

				//---- label11 ----
				label11.setText("*");
				label11.setFont(new Font("Tahoma", Font.PLAIN, 22));
				label11.setForeground(Color.white);
				panel13.add(label11);
				label11.setBounds(100, 5, label11.getPreferredSize().width, 22);

				{ // compute preferred size
					Dimension preferredSize = new Dimension();
					for(int i = 0; i < panel13.getComponentCount(); i++) {
						Rectangle bounds = panel13.getComponent(i).getBounds();
						preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
						preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
					}
					Insets insets = panel13.getInsets();
					preferredSize.width += insets.right;
					preferredSize.height += insets.bottom;
					panel13.setMinimumSize(preferredSize);
					panel13.setPreferredSize(preferredSize);
				}
			}
			panel8.add(panel13);
			panel13.setBounds(20, 85, 385, 45);

			//======== panel14 ========
			{
				panel14.setBackground(new Color(42, 146, 119));
				panel14.setBorder(new BevelBorder(BevelBorder.RAISED));
				panel14.setLayout(null);

				//---- label15 ----
				label15.setText("Product Name");
				label15.setForeground(Color.white);
				label15.setFont(new Font("Bookman Old Style", Font.PLAIN, 18));
				panel14.add(label15);
				label15.setBounds(new Rectangle(new Point(10, 10), label15.getPreferredSize()));
				panel14.add(textField15);
				textField15.setBounds(155, 10, 170, 25);

				{ // compute preferred size
					Dimension preferredSize = new Dimension();
					for(int i = 0; i < panel14.getComponentCount(); i++) {
						Rectangle bounds = panel14.getComponent(i).getBounds();
						preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
						preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
					}
					Insets insets = panel14.getInsets();
					preferredSize.width += insets.right;
					preferredSize.height += insets.bottom;
					panel14.setMinimumSize(preferredSize);
					panel14.setPreferredSize(preferredSize);
				}
			}
			panel8.add(panel14);
			panel14.setBounds(20, 140, 385, 45);

			//======== panel15 ========
			{
				panel15.setBackground(new Color(42, 146, 119));
				panel15.setBorder(new BevelBorder(BevelBorder.RAISED));
				panel15.setLayout(null);

				//---- label32 ----
				label32.setText("Complaint On");
				label32.setFont(new Font("Bookman Old Style", Font.PLAIN, 18));
				label32.setForeground(Color.white);
				panel15.add(label32);
				label32.setBounds(new Rectangle(new Point(15, 10), label32.getPreferredSize()));

				//---- comboBox7 ----
				comboBox7.setModel(new DefaultComboBoxModel<>(new String[] {
					"[yy]",
					"2005",
					"2006",
					"2007",
					"2008",
					"2009",
					"2010",
					"2011",
					"2012",
					"2013",
					"2014",
					"2015",
					"2016",
					"2017",
					"2018",
					"2019",
					"2020"
				}));
				comboBox7.setFont(comboBox7.getFont().deriveFont(comboBox7.getFont().getSize() + 3f));
				panel15.add(comboBox7);
				comboBox7.setBounds(305, 10, 65, 25);

				//---- comboBox6 ----
				comboBox6.setModel(new DefaultComboBoxModel<>(new String[] {
					"[mm]",
					"January",
					"February",
					"March",
					"April",
					"May",
					"June",
					"July",
					"August",
					"September",
					"October",
					"November",
					"December"
				}));
				comboBox6.setFont(comboBox6.getFont().deriveFont(comboBox6.getFont().getSize() + 3f));
				panel15.add(comboBox6);
				comboBox6.setBounds(220, 10, 75, 25);

				//---- comboBox2 ----
				comboBox2.setModel(new DefaultComboBoxModel<>(new String[] {
					"[dd]",
					"01",
					"02",
					"03",
					"04",
					"05",
					"06",
					"07",
					"08",
					"09",
					"10",
					"11",
					"12",
					"13",
					"14",
					"15",
					"16",
					"17",
					"18",
					"19",
					"20"
				}));
				comboBox2.setFont(comboBox2.getFont().deriveFont(comboBox2.getFont().getSize() + 3f));
				panel15.add(comboBox2);
				comboBox2.setBounds(155, 10, 55, 25);

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
			panel8.add(panel15);
			panel15.setBounds(20, 195, 385, 45);

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
		panel8.setBounds(630, 80, 425, 260);

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

		//---- genderGroup ----
		ButtonGroup genderGroup = new ButtonGroup();
		genderGroup.add(maleRadioBtn);
		genderGroup.add(femaleRadioBtn);
		// JFormDesigner - End of component initialization  //GEN-END:initComponents
	}

	// JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
	// Generated using JFormDesigner Evaluation license - Dolly Jha
	private JPanel panel1;
	private JLabel label1;
	private JPanel panel3;
	private JLabel label4;
	private JTextField First_Name;
	private JLabel label10;
	private JPanel panel4;
	private JPanel panel9;
	private JLabel label7;
	private JComboBox<String> comboBox1;
	private JComboBox<String> comboBox3;
	private JComboBox<String> comboBox4;
	private JPanel panel10;
	private JLabel label6;
	private JRadioButton maleRadioBtn;
	private JRadioButton femaleRadioBtn;
	private JPanel panel11;
	private JLabel label3;
	private JTextField textField1;
	private JTextField textField6;
	private JPanel panel7;
	private JTextField textField5;
	private JTextField textField7;
	private JTextField textField10;
	private JTextField textField9;
	private JLabel label14;
	private JLabel label20;
	private JTextField textField8;
	private JLabel label21;
	private JLabel label22;
	private JTextField textField2;
	private JLabel label27;
	private JTextField textField13;
	private JLabel label29;
	private JTextField textField11;
	private JPanel panel16;
	private JLabel label25;
	private JLabel label17;
	private JPanel panel17;
	private JLabel label24;
	private JLabel label23;
	private JLabel label18;
	private JPanel panel18;
	private JLabel label19;
	private JLabel label8;
	private JLabel label26;
	private JPanel panel19;
	private JLabel label2;
	private JLabel label35;
	private JTextField textField12;
	private JPanel panel20;
	private JLabel label31;
	private JLabel label28;
	private JLabel label5;
	private JLabel label36;
	private JButton button2;
	private JButton button3;
	private JPanel panel8;
	private JLabel label9;
	private JLabel label13;
	private JComboBox<String> comboBox5;
	private JPanel panel12;
	private JLabel label12;
	private JPanel panel13;
	private JTextField textField4;
	private JLabel label11;
	private JPanel panel14;
	private JLabel label15;
	private JTextField textField15;
	private JPanel panel15;
	private JLabel label32;
	private JComboBox<String> comboBox7;
	private JComboBox<String> comboBox6;
	private JComboBox<String> comboBox2;
	// JFormDesigner - End of variables declaration  //GEN-END:variables
}
