import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
/*
 * Created by JFormDesigner on Wed May 04 12:12:19 IST 2016
 */



/**
 * @author Dolly Jha
 */
public class CreateInvoice extends JPanel  {

	private void genBtnActionPerformed() {
		// TODO add your code here
	}

	private void exitBtnActionPerformed() {
		// TODO add your code here
	}

	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
		// Generated using JFormDesigner Evaluation license - Dolly Jha
		InvoicePanel = new JPanel();
		label2 = new JLabel();
		label3 = new JLabel();
		label4 = new JLabel();
		Dof_Reg = new JTextField();
		Complaint_No = new JTextField();
		Name = new JTextField();
		label6 = new JLabel();
		addr1 = new JTextField();
		Pin = new JTextField();
		label8 = new JLabel();
		panel3 = new JPanel();
		label9 = new JLabel();
		label10 = new JLabel();
		label11 = new JLabel();
		Sl_No = new JTextField();
		Model_no = new JTextField();
		Dof_pch = new JTextField();
		addr2 = new JTextField();
		label12 = new JLabel();
		label13 = new JLabel();
		email = new JTextField();
		genBtn = new JButton();
		exitBtn = new JButton();
		Mobile_no = new JTextField();
		Invoice_no = new JTextField();
		label7 = new JLabel();
		label16 = new JLabel();
		label17 = new JLabel();
		SignPanel = new JPanel();
		label14 = new JLabel();

		//======== InvoicePanel ========
		{
			InvoicePanel.setBackground(Color.white);
			InvoicePanel.setBorder(new TitledBorder(new LineBorder(new Color(42, 149, 119), 2), " Invoice/Receipt", TitledBorder.CENTER, TitledBorder.DEFAULT_POSITION,
				new Font("Monospaced", Font.BOLD, 24), new Color(42, 149, 119)));

			// JFormDesigner evaluation mark
			InvoicePanel.setBorder(new javax.swing.border.CompoundBorder(
				new javax.swing.border.TitledBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0),
					"JFormDesigner Evaluation", javax.swing.border.TitledBorder.CENTER,
					javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Dialog", java.awt.Font.BOLD, 12),
					java.awt.Color.red), InvoicePanel.getBorder())); InvoicePanel.addPropertyChangeListener(new java.beans.PropertyChangeListener(){public void propertyChange(java.beans.PropertyChangeEvent e){if("border".equals(e.getPropertyName()))throw new RuntimeException();}});

			InvoicePanel.setLayout(null);

			//---- label2 ----
			label2.setText("Complaint No:");
			label2.setFont(new Font("Gabriola", Font.PLAIN, 22));
			label2.setBackground(new Color(42, 149, 119));
			label2.setForeground(new Color(42, 149, 119));
			InvoicePanel.add(label2);
			label2.setBounds(20, 30, 105, 30);

			//---- label3 ----
			label3.setText(" Name:");
			label3.setFont(new Font("Gabriola", Font.PLAIN, 22));
			label3.setBackground(new Color(42, 149, 119));
			label3.setForeground(new Color(42, 149, 119));
			InvoicePanel.add(label3);
			label3.setBounds(20, 136, 100, 25);

			//---- label4 ----
			label4.setText("Date of Registration:");
			label4.setFont(new Font("Gabriola", Font.PLAIN, 22));
			label4.setBackground(new Color(42, 149, 119));
			label4.setForeground(new Color(42, 149, 119));
			InvoicePanel.add(label4);
			label4.setBounds(new Rectangle(new Point(20, 79), label4.getPreferredSize()));

			//---- Dof_Reg ----
			Dof_Reg.setBorder(new LineBorder(new Color(0, 102, 51), 2, true));
			InvoicePanel.add(Dof_Reg);
			Dof_Reg.setBounds(225, 91, 180, 30);

			//---- Complaint_No ----
			Complaint_No.setBorder(new LineBorder(new Color(0, 102, 51), 2, true));
			InvoicePanel.add(Complaint_No);
			Complaint_No.setBounds(225, 40, 275, 30);

			//---- Name ----
			Name.setBorder(new LineBorder(new Color(0, 102, 51), 2, true));
			InvoicePanel.add(Name);
			Name.setBounds(225, 142, 275, 30);

			//---- label6 ----
			label6.setText("Address 1:");
			label6.setFont(new Font("Gabriola", Font.PLAIN, 22));
			label6.setBackground(new Color(42, 149, 119));
			label6.setForeground(new Color(42, 149, 119));
			InvoicePanel.add(label6);
			label6.setBounds(20, 180, 75, label6.getPreferredSize().height);

			//---- addr1 ----
			addr1.setBorder(new LineBorder(new Color(0, 102, 51), 2, true));
			InvoicePanel.add(addr1);
			addr1.setBounds(225, 188, 275, 30);

			//---- Pin ----
			Pin.setBorder(new LineBorder(new Color(0, 102, 51), 2, true));
			InvoicePanel.add(Pin);
			Pin.setBounds(225, 290, 180, 30);

			//---- label8 ----
			label8.setText("Pincode:");
			label8.setFont(new Font("Gabriola", Font.PLAIN, 22));
			label8.setForeground(new Color(42, 149, 119));
			InvoicePanel.add(label8);
			label8.setBounds(20, 294, label8.getPreferredSize().width, 19);

			//======== panel3 ========
			{
				panel3.setBackground(Color.white);
				panel3.setBorder(new TitledBorder(new LineBorder(new Color(0, 102, 51), 2, true), "Device Synopsis", TitledBorder.LEADING, TitledBorder.DEFAULT_POSITION,
					new Font("Gabriola", Font.PLAIN, 22), new Color(42, 149, 119)));
				panel3.setLayout(null);

				//---- label9 ----
				label9.setText("Serial No:");
				label9.setFont(new Font("Gabriola", Font.PLAIN, 22));
				label9.setForeground(new Color(42, 149, 119));
				panel3.add(label9);
				label9.setBounds(15, 30, 75, 35);

				//---- label10 ----
				label10.setText("Model No:");
				label10.setFont(new Font("Gabriola", Font.PLAIN, 22));
				label10.setForeground(new Color(42, 149, 119));
				panel3.add(label10);
				label10.setBounds(20, 70, label10.getPreferredSize().width, 35);

				//---- label11 ----
				label11.setText("Date of Purchase:");
				label11.setFont(new Font("Gabriola", Font.PLAIN, 22));
				label11.setForeground(new Color(42, 149, 119));
				panel3.add(label11);
				label11.setBounds(15, 115, label11.getPreferredSize().width, 33);

				//---- Sl_No ----
				Sl_No.setBorder(new LineBorder(new Color(0, 102, 51), 2, true));
				panel3.add(Sl_No);
				Sl_No.setBounds(185, 30, 185, 25);

				//---- Model_no ----
				Model_no.setBorder(new LineBorder(new Color(0, 102, 51), 2, true));
				panel3.add(Model_no);
				Model_no.setBounds(185, 70, 185, 25);

				//---- Dof_pch ----
				Dof_pch.setBorder(new LineBorder(new Color(0, 102, 51), 2, true));
				panel3.add(Dof_pch);
				Dof_pch.setBounds(185, 110, 185, 25);

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
			InvoicePanel.add(panel3);
			panel3.setBounds(595, 30, 395, 155);

			//---- addr2 ----
			addr2.setBorder(new LineBorder(new Color(0, 102, 51), 2, true));
			InvoicePanel.add(addr2);
			addr2.setBounds(225, 245, 275, 30);

			//---- label12 ----
			label12.setText("Mobile No:");
			label12.setFont(new Font("Gabriola", Font.PLAIN, 22));
			label12.setBackground(new Color(42, 149, 119));
			label12.setForeground(new Color(42, 149, 119));
			InvoicePanel.add(label12);
			label12.setBounds(new Rectangle(new Point(15, 332), label12.getPreferredSize()));

			//---- label13 ----
			label13.setText("E-mail;");
			label13.setFont(new Font("Gabriola", Font.PLAIN, 22));
			label13.setForeground(new Color(42, 149, 119));
			InvoicePanel.add(label13);
			label13.setBounds(new Rectangle(new Point(20, 389), label13.getPreferredSize()));

			//---- email ----
			email.setBorder(new LineBorder(new Color(0, 102, 51), 2, true));
			InvoicePanel.add(email);
			email.setBounds(225, 397, 360, 30);

			//---- genBtn ----
			genBtn.setText("Generate Invoice");
			genBtn.setIcon(new ImageIcon("E:\\Project\\Image\\2.png"));
			genBtn.setFont(new Font("Times New Roman", Font.PLAIN, 16));
			genBtn.addActionListener(e -> genBtnActionPerformed());
			InvoicePanel.add(genBtn);
			genBtn.setBounds(535, 465, 190, genBtn.getPreferredSize().height);

			//---- exitBtn ----
			exitBtn.setText("Exit");
			exitBtn.setIcon(new ImageIcon("E:\\Project\\Image\\exitnew.png"));
			exitBtn.setFont(new Font("Times New Roman", Font.PLAIN, 18));
			exitBtn.addActionListener(e -> exitBtnActionPerformed());
			InvoicePanel.add(exitBtn);
			exitBtn.setBounds(230, 468, 170, 53);

			//---- Mobile_no ----
			Mobile_no.setBorder(new LineBorder(new Color(0, 102, 51), 2, true));
			InvoicePanel.add(Mobile_no);
			Mobile_no.setBounds(225, 340, 190, 30);

			//---- Invoice_no ----
			Invoice_no.setText("CMS0006");
			Invoice_no.setHorizontalAlignment(SwingConstants.CENTER);
			InvoicePanel.add(Invoice_no);
			Invoice_no.setBounds(775, 200, 200, 30);

			//---- label7 ----
			label7.setText("Invoice No:");
			label7.setFont(new Font("Gabriola", Font.PLAIN, 22));
			label7.setBackground(new Color(42, 149, 119));
			label7.setForeground(new Color(42, 149, 119));
			InvoicePanel.add(label7);
			label7.setBounds(605, 195, 95, 38);
			InvoicePanel.add(label16);
			label16.setBounds(new Rectangle(new Point(605, 255), label16.getPreferredSize()));

			//---- label17 ----
			label17.setText("Authorized Signature:");
			label17.setFont(new Font("Gabriola", Font.PLAIN, 22));
			label17.setForeground(new Color(42, 149, 119));
			InvoicePanel.add(label17);
			label17.setBounds(605, 260, 160, label17.getPreferredSize().height);

			//======== SignPanel ========
			{
				SignPanel.setLayout(null);

				{ // compute preferred size
					Dimension preferredSize = new Dimension();
					for(int i = 0; i < SignPanel.getComponentCount(); i++) {
						Rectangle bounds = SignPanel.getComponent(i).getBounds();
						preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
						preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
					}
					Insets insets = SignPanel.getInsets();
					preferredSize.width += insets.right;
					preferredSize.height += insets.bottom;
					SignPanel.setMinimumSize(preferredSize);
					SignPanel.setPreferredSize(preferredSize);
				}
			}
			InvoicePanel.add(SignPanel);
			SignPanel.setBounds(595, 260, 395, 135);

			//---- label14 ----
			label14.setText("Address 2:");
			label14.setFont(new Font("Gabriola", Font.PLAIN, 22));
			label14.setBackground(new Color(42, 149, 119));
			label14.setForeground(new Color(42, 149, 119));
			InvoicePanel.add(label14);
			label14.setBounds(new Rectangle(new Point(20, 237), label14.getPreferredSize()));

			{ // compute preferred size
				Dimension preferredSize = new Dimension();
				for(int i = 0; i < InvoicePanel.getComponentCount(); i++) {
					Rectangle bounds = InvoicePanel.getComponent(i).getBounds();
					preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
					preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
				}
				Insets insets = InvoicePanel.getInsets();
				preferredSize.width += insets.right;
				preferredSize.height += insets.bottom;
				InvoicePanel.setMinimumSize(preferredSize);
				InvoicePanel.setPreferredSize(preferredSize);
			}
		}
		// JFormDesigner - End of component initialization  //GEN-END:initComponents
	}

	// JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
	// Generated using JFormDesigner Evaluation license - Dolly Jha
	private JPanel InvoicePanel;
	private JLabel label2;
	private JLabel label3;
	private JLabel label4;
	private JTextField Dof_Reg;
	private JTextField Complaint_No;
	private JTextField Name;
	private JLabel label6;
	private JTextField addr1;
	private JTextField Pin;
	private JLabel label8;
	private JPanel panel3;
	private JLabel label9;
	private JLabel label10;
	private JLabel label11;
	private JTextField Sl_No;
	private JTextField Model_no;
	private JTextField Dof_pch;
	private JTextField addr2;
	private JLabel label12;
	private JLabel label13;
	private JTextField email;
	private JButton genBtn;
	private JButton exitBtn;
	private JTextField Mobile_no;
	private JTextField Invoice_no;
	private JLabel label7;
	private JLabel label16;
	private JLabel label17;
	private JPanel SignPanel;
	private JLabel label14;
	// JFormDesigner - End of variables declaration  //GEN-END:variables
}
