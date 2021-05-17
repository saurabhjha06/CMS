import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
/*
 * Created by JFormDesigner on Tue Apr 19 10:03:12 IST 2016
 */



/**
 * @author Gaurav Kumar
 */
public class CreateEmployee1 extends JPanel {
	public CreateEmployee1() {
		initComponents();
	}

	private void exitBtn(ActionEvent e) {
		// TODO add your code here
	}

	private void saveBtn(ActionEvent e) {
		// TODO add your code here
	}

	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
		// Generated using JFormDesigner Evaluation license - Gaurav Kumar
		scrollPane1 = new JScrollPane();
		ContentPanel = new JPanel();
		employeeRegPanel = new JPanel();
		namePanel = new JPanel();
		F_name = new JLabel();
		firstname = new JTextField();
		L_name = new JLabel();
		lastname = new JTextField();
		contactInfoPanel = new JPanel();
		contactPanel = new JPanel();
		Mobile_No = new JLabel();
		mobileNo = new JTextField();
		Phone_No = new JLabel();
		phoneNo = new JTextField();
		Area_Code = new JLabel();
		textField6 = new JTextField();
		label2 = new JLabel();
		addressPanel = new JPanel();
		Address = new JLabel();
		State = new JLabel();
		state = new JTextField();
		City = new JLabel();
		city = new JTextField();
		pincode = new JTextField();
		Pincode = new JLabel();
		add1 = new JTextField();
		add2 = new JTextField();
		add3 = new JTextField();
		empPhoto = new JPanel();
		dobPanel = new JPanel();
		dob = new JLabel();
		dd = new JComboBox<>();
		mm = new JComboBox<>();
		yy = new JComboBox<>();
		gender = new JLabel();
		maleRadioBtn = new JRadioButton();
		femaleRadioBtn = new JRadioButton();
		empIdPanel = new JPanel();
		emp_Id = new JLabel();
		textField9 = new JTextField();
		credentialsPanel = new JPanel();
		user_Id = new JLabel();
		security_ques = new JLabel();
		security_ans = new JLabel();
		Passwd = new JLabel();
		Confirm_passwd = new JLabel();
		userId = new JTextField();
		securityQues = new JComboBox<>();
		securityAnswer = new JTextField();
		passwd = new JPasswordField();
		confirmPasswd = new JPasswordField();
		label18 = new JLabel();
		label19 = new JLabel();
		label20 = new JLabel();
		label21 = new JLabel();
		label22 = new JLabel();
		panel1 = new JPanel();
		button2 = new JButton();
		button3 = new JButton();
		label1 = new JLabel();
		panel2 = new JPanel();
		button1 = new JButton();
		exitBtn = new JButton();
		saveBtn = new JButton();

		//======== this ========

		// JFormDesigner evaluation mark
		setBorder(new javax.swing.border.CompoundBorder(
			new javax.swing.border.TitledBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0),
				"JFormDesigner Evaluation", javax.swing.border.TitledBorder.CENTER,
				javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Dialog", java.awt.Font.BOLD, 12),
				java.awt.Color.red), getBorder())); addPropertyChangeListener(new java.beans.PropertyChangeListener(){public void propertyChange(java.beans.PropertyChangeEvent e){if("border".equals(e.getPropertyName()))throw new RuntimeException();}});

		setLayout(null);

		//======== scrollPane1 ========
		{

			//======== ContentPanel ========
			{
				ContentPanel.setLayout(null);

				//======== employeeRegPanel ========
				{
					employeeRegPanel.setBackground(new Color(42, 146, 119));
					employeeRegPanel.setBorder(new TitledBorder(null, "Employee Registration Pannel", TitledBorder.LEADING, TitledBorder.DEFAULT_POSITION,
						new Font("Lucida Console", Font.BOLD, 22), Color.white));
					employeeRegPanel.setLayout(null);

					//======== namePanel ========
					{
						namePanel.setLayout(null);

						//---- F_name ----
						F_name.setText("First Name");
						F_name.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 22));
						namePanel.add(F_name);
						F_name.setBounds(new Rectangle(new Point(15, 10), F_name.getPreferredSize()));
						namePanel.add(firstname);
						firstname.setBounds(160, 10, 190, 25);

						//---- L_name ----
						L_name.setText("Last Name");
						L_name.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 22));
						namePanel.add(L_name);
						L_name.setBounds(new Rectangle(new Point(390, 10), L_name.getPreferredSize()));
						namePanel.add(lastname);
						lastname.setBounds(495, 10, 150, 25);

						{ // compute preferred size
							Dimension preferredSize = new Dimension();
							for(int i = 0; i < namePanel.getComponentCount(); i++) {
								Rectangle bounds = namePanel.getComponent(i).getBounds();
								preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
								preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
							}
							Insets insets = namePanel.getInsets();
							preferredSize.width += insets.right;
							preferredSize.height += insets.bottom;
							namePanel.setMinimumSize(preferredSize);
							namePanel.setPreferredSize(preferredSize);
						}
					}
					employeeRegPanel.add(namePanel);
					namePanel.setBounds(10, 45, 680, 45);

					//======== contactInfoPanel ========
					{
						contactInfoPanel.setBorder(new TitledBorder(new LineBorder(new Color(0, 153, 102), 2, true), "Contact Info", TitledBorder.LEFT, TitledBorder.BELOW_TOP,
							new Font("Lucida Console", Font.PLAIN, 24), new Color(0, 102, 51)));
						contactInfoPanel.setLayout(null);

						//======== contactPanel ========
						{
							contactPanel.setBorder(new BevelBorder(BevelBorder.RAISED, Color.black, null, null, null));
							contactPanel.setLayout(null);

							//---- Mobile_No ----
							Mobile_No.setText("Mobile No :");
							Mobile_No.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 22));
							contactPanel.add(Mobile_No);
							Mobile_No.setBounds(new Rectangle(new Point(15, 15), Mobile_No.getPreferredSize()));
							contactPanel.add(mobileNo);
							mobileNo.setBounds(130, 15, 160, 25);

							//---- Phone_No ----
							Phone_No.setText("Phone No :");
							Phone_No.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 22));
							contactPanel.add(Phone_No);
							Phone_No.setBounds(new Rectangle(new Point(310, 15), Phone_No.getPreferredSize()));
							contactPanel.add(phoneNo);
							phoneNo.setBounds(430, 15, 160, 25);

							//---- Area_Code ----
							Area_Code.setText("Area Code :");
							Area_Code.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 22));
							contactPanel.add(Area_Code);
							Area_Code.setBounds(new Rectangle(new Point(615, 15), Area_Code.getPreferredSize()));

							//---- textField6 ----
							textField6.setHorizontalAlignment(SwingConstants.CENTER);
							contactPanel.add(textField6);
							textField6.setBounds(730, 15, 165, 25);

							//---- label2 ----
							label2.setText("*");
							label2.setFont(new Font("Tahoma", Font.PLAIN, 20));
							label2.setForeground(new Color(255, 0, 51));
							contactPanel.add(label2);
							label2.setBounds(new Rectangle(new Point(110, 15), label2.getPreferredSize()));

							{ // compute preferred size
								Dimension preferredSize = new Dimension();
								for(int i = 0; i < contactPanel.getComponentCount(); i++) {
									Rectangle bounds = contactPanel.getComponent(i).getBounds();
									preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
									preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
								}
								Insets insets = contactPanel.getInsets();
								preferredSize.width += insets.right;
								preferredSize.height += insets.bottom;
								contactPanel.setMinimumSize(preferredSize);
								contactPanel.setPreferredSize(preferredSize);
							}
						}
						contactInfoPanel.add(contactPanel);
						contactPanel.setBounds(30, 190, 920, 55);

						//======== addressPanel ========
						{
							addressPanel.setBorder(new BevelBorder(BevelBorder.RAISED, Color.black, null, Color.black, null));
							addressPanel.setLayout(null);

							//---- Address ----
							Address.setText(" Address :-");
							Address.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 22));
							addressPanel.add(Address);
							Address.setBounds(10, 5, 90, 45);

							//---- State ----
							State.setText("State");
							State.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 22));
							addressPanel.add(State);
							State.setBounds(new Rectangle(new Point(620, 10), State.getPreferredSize()));

							//---- state ----
							state.setHorizontalAlignment(SwingConstants.CENTER);
							addressPanel.add(state);
							state.setBounds(715, 10, 170, 28);

							//---- City ----
							City.setText("City");
							City.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 22));
							addressPanel.add(City);
							City.setBounds(620, 55, 40, City.getPreferredSize().height);

							//---- city ----
							city.setHorizontalAlignment(SwingConstants.CENTER);
							addressPanel.add(city);
							city.setBounds(715, 55, 170, 28);

							//---- pincode ----
							pincode.setHorizontalAlignment(SwingConstants.CENTER);
							addressPanel.add(pincode);
							pincode.setBounds(715, 100, 170, 28);

							//---- Pincode ----
							Pincode.setText("Pincode");
							Pincode.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 22));
							addressPanel.add(Pincode);
							Pincode.setBounds(new Rectangle(new Point(620, 100), Pincode.getPreferredSize()));
							addressPanel.add(add1);
							add1.setBounds(135, 20, 240, 28);
							addressPanel.add(add2);
							add2.setBounds(135, 60, 240, 28);
							addressPanel.add(add3);
							add3.setBounds(135, 105, 240, 28);

							{ // compute preferred size
								Dimension preferredSize = new Dimension();
								for(int i = 0; i < addressPanel.getComponentCount(); i++) {
									Rectangle bounds = addressPanel.getComponent(i).getBounds();
									preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
									preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
								}
								Insets insets = addressPanel.getInsets();
								preferredSize.width += insets.right;
								preferredSize.height += insets.bottom;
								addressPanel.setMinimumSize(preferredSize);
								addressPanel.setPreferredSize(preferredSize);
							}
						}
						contactInfoPanel.add(addressPanel);
						addressPanel.setBounds(30, 35, 920, 150);

						{ // compute preferred size
							Dimension preferredSize = new Dimension();
							for(int i = 0; i < contactInfoPanel.getComponentCount(); i++) {
								Rectangle bounds = contactInfoPanel.getComponent(i).getBounds();
								preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
								preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
							}
							Insets insets = contactInfoPanel.getInsets();
							preferredSize.width += insets.right;
							preferredSize.height += insets.bottom;
							contactInfoPanel.setMinimumSize(preferredSize);
							contactInfoPanel.setPreferredSize(preferredSize);
						}
					}
					employeeRegPanel.add(contactInfoPanel);
					contactInfoPanel.setBounds(10, 305, 960, 255);

					//======== empPhoto ========
					{
						empPhoto.setBackground(new Color(42, 146, 119));
						empPhoto.setBorder(new TitledBorder(new BevelBorder(BevelBorder.LOWERED), "Employee Photo", TitledBorder.CENTER, TitledBorder.DEFAULT_POSITION,
							new Font("Lucida Console", Font.PLAIN, 22), Color.white));
						empPhoto.setLayout(null);

						{ // compute preferred size
							Dimension preferredSize = new Dimension();
							for(int i = 0; i < empPhoto.getComponentCount(); i++) {
								Rectangle bounds = empPhoto.getComponent(i).getBounds();
								preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
								preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
							}
							Insets insets = empPhoto.getInsets();
							preferredSize.width += insets.right;
							preferredSize.height += insets.bottom;
							empPhoto.setMinimumSize(preferredSize);
							empPhoto.setPreferredSize(preferredSize);
						}
					}
					employeeRegPanel.add(empPhoto);
					empPhoto.setBounds(715, 15, 225, 210);

					//======== dobPanel ========
					{
						dobPanel.setLayout(null);

						//---- dob ----
						dob.setText("Date of Birth");
						dob.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 22));
						dobPanel.add(dob);
						dob.setBounds(15, 5, 106, 26);

						//---- dd ----
						dd.setModel(new DefaultComboBoxModel<>(new String[] {
							"[dd]"
						}));
						dobPanel.add(dd);
						dd.setBounds(new Rectangle(new Point(160, 10), dd.getPreferredSize()));

						//---- mm ----
						mm.setModel(new DefaultComboBoxModel<>(new String[] {
							"[mm]"
						}));
						dobPanel.add(mm);
						mm.setBounds(new Rectangle(new Point(205, 10), mm.getPreferredSize()));

						//---- yy ----
						yy.setModel(new DefaultComboBoxModel<>(new String[] {
							"[yy]"
						}));
						dobPanel.add(yy);
						yy.setBounds(new Rectangle(new Point(255, 10), yy.getPreferredSize()));

						//---- gender ----
						gender.setText("Gender");
						gender.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 22));
						dobPanel.add(gender);
						gender.setBounds(390, 10, 62, 26);

						//---- maleRadioBtn ----
						maleRadioBtn.setText("Male");
						maleRadioBtn.setFont(new Font("Tahoma", Font.PLAIN, 16));
						dobPanel.add(maleRadioBtn);
						maleRadioBtn.setBounds(495, 5, 57, 29);

						//---- femaleRadioBtn ----
						femaleRadioBtn.setText("Female");
						femaleRadioBtn.setFont(new Font("Tahoma", Font.PLAIN, 16));
						dobPanel.add(femaleRadioBtn);
						femaleRadioBtn.setBounds(560, 5, 75, 29);

						{ // compute preferred size
							Dimension preferredSize = new Dimension();
							for(int i = 0; i < dobPanel.getComponentCount(); i++) {
								Rectangle bounds = dobPanel.getComponent(i).getBounds();
								preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
								preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
							}
							Insets insets = dobPanel.getInsets();
							preferredSize.width += insets.right;
							preferredSize.height += insets.bottom;
							dobPanel.setMinimumSize(preferredSize);
							dobPanel.setPreferredSize(preferredSize);
						}
					}
					employeeRegPanel.add(dobPanel);
					dobPanel.setBounds(10, 110, 680, 45);

					//======== empIdPanel ========
					{
						empIdPanel.setLayout(null);

						//---- emp_Id ----
						emp_Id.setText("Employee ID");
						emp_Id.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 22));
						empIdPanel.add(emp_Id);
						emp_Id.setBounds(new Rectangle(new Point(15, 5), emp_Id.getPreferredSize()));

						//---- textField9 ----
						textField9.setText("Auto Generated");
						textField9.setHorizontalAlignment(SwingConstants.CENTER);
						textField9.setEditable(false);
						empIdPanel.add(textField9);
						textField9.setBounds(160, 10, 260, 25);

						{ // compute preferred size
							Dimension preferredSize = new Dimension();
							for(int i = 0; i < empIdPanel.getComponentCount(); i++) {
								Rectangle bounds = empIdPanel.getComponent(i).getBounds();
								preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
								preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
							}
							Insets insets = empIdPanel.getInsets();
							preferredSize.width += insets.right;
							preferredSize.height += insets.bottom;
							empIdPanel.setMinimumSize(preferredSize);
							empIdPanel.setPreferredSize(preferredSize);
						}
					}
					employeeRegPanel.add(empIdPanel);
					empIdPanel.setBounds(10, 175, 680, 45);

					//======== credentialsPanel ========
					{
						credentialsPanel.setBorder(new TitledBorder(new LineBorder(new Color(0, 102, 51), 3), "Credentials", TitledBorder.LEADING, TitledBorder.BELOW_TOP,
							new Font("Lucida Console", Font.PLAIN, 24), new Color(0, 102, 51)));
						credentialsPanel.setLayout(null);

						//---- user_Id ----
						user_Id.setText("User ID");
						user_Id.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 22));
						credentialsPanel.add(user_Id);
						user_Id.setBounds(new Rectangle(new Point(45, 50), user_Id.getPreferredSize()));

						//---- security_ques ----
						security_ques.setText("Security Question");
						security_ques.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 22));
						credentialsPanel.add(security_ques);
						security_ques.setBounds(45, 90, security_ques.getPreferredSize().width, 26);

						//---- security_ans ----
						security_ans.setText("Answer");
						security_ans.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 22));
						credentialsPanel.add(security_ans);
						security_ans.setBounds(45, 125, security_ans.getPreferredSize().width, 26);

						//---- Passwd ----
						Passwd.setText("Password");
						Passwd.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 22));
						credentialsPanel.add(Passwd);
						Passwd.setBounds(45, 165, Passwd.getPreferredSize().width, 26);

						//---- Confirm_passwd ----
						Confirm_passwd.setText("Confirm Password");
						Confirm_passwd.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 22));
						credentialsPanel.add(Confirm_passwd);
						Confirm_passwd.setBounds(45, 210, Confirm_passwd.getPreferredSize().width, 26);

						//---- userId ----
						userId.setBorder(new MatteBorder(2, 2, 2, 2, new Color(0, 102, 51)));
						credentialsPanel.add(userId);
						userId.setBounds(395, 40, 235, 30);

						//---- securityQues ----
						securityQues.setModel(new DefaultComboBoxModel<>(new String[] {
							"     [Select Security Question]"
						}));
						securityQues.setBorder(new MatteBorder(2, 2, 2, 2, new Color(0, 102, 51)));
						credentialsPanel.add(securityQues);
						securityQues.setBounds(395, 83, 235, 30);

						//---- securityAnswer ----
						securityAnswer.setBorder(new MatteBorder(2, 2, 2, 2, new Color(0, 102, 51)));
						credentialsPanel.add(securityAnswer);
						securityAnswer.setBounds(395, 126, 235, 30);

						//---- passwd ----
						passwd.setBorder(new MatteBorder(2, 2, 2, 2, new Color(0, 102, 51)));
						credentialsPanel.add(passwd);
						passwd.setBounds(395, 169, 235, 30);

						//---- confirmPasswd ----
						confirmPasswd.setBorder(new MatteBorder(2, 2, 2, 2, new Color(0, 102, 51)));
						credentialsPanel.add(confirmPasswd);
						confirmPasswd.setBounds(395, 212, 235, 30);

						//---- label18 ----
						label18.setText("*");
						label18.setFont(new Font("Tahoma", Font.PLAIN, 20));
						label18.setForeground(new Color(255, 0, 51));
						credentialsPanel.add(label18);
						label18.setBounds(new Rectangle(new Point(105, 45), label18.getPreferredSize()));

						//---- label19 ----
						label19.setText("*");
						label19.setFont(new Font("Tahoma", Font.PLAIN, 20));
						label19.setForeground(new Color(255, 0, 51));
						credentialsPanel.add(label19);
						label19.setBounds(new Rectangle(new Point(195, 85), label19.getPreferredSize()));

						//---- label20 ----
						label20.setText("*");
						label20.setFont(new Font("Tahoma", Font.PLAIN, 20));
						label20.setForeground(new Color(255, 0, 51));
						credentialsPanel.add(label20);
						label20.setBounds(new Rectangle(new Point(110, 125), label20.getPreferredSize()));

						//---- label21 ----
						label21.setText("*");
						label21.setFont(new Font("Tahoma", Font.PLAIN, 20));
						label21.setForeground(new Color(255, 0, 51));
						credentialsPanel.add(label21);
						label21.setBounds(new Rectangle(new Point(130, 160), label21.getPreferredSize()));

						//---- label22 ----
						label22.setText("*");
						label22.setFont(new Font("Tahoma", Font.PLAIN, 20));
						label22.setForeground(new Color(255, 0, 51));
						credentialsPanel.add(label22);
						label22.setBounds(new Rectangle(new Point(200, 210), label22.getPreferredSize()));

						{ // compute preferred size
							Dimension preferredSize = new Dimension();
							for(int i = 0; i < credentialsPanel.getComponentCount(); i++) {
								Rectangle bounds = credentialsPanel.getComponent(i).getBounds();
								preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
								preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
							}
							Insets insets = credentialsPanel.getInsets();
							preferredSize.width += insets.right;
							preferredSize.height += insets.bottom;
							credentialsPanel.setMinimumSize(preferredSize);
							credentialsPanel.setPreferredSize(preferredSize);
						}
					}
					employeeRegPanel.add(credentialsPanel);
					credentialsPanel.setBounds(10, 565, 960, 290);

					//======== panel1 ========
					{
						panel1.setLayout(null);

						//---- button2 ----
						button2.setText("Modify");
						button2.setBorder(new MatteBorder(2, 2, 2, 2, new Color(0, 153, 102)));
						button2.setFont(new Font("Verdana", Font.PLAIN, 18));
						button2.setIcon(new ImageIcon("E:\\Project\\Image\\Reset1.png"));
						panel1.add(button2);
						button2.setBounds(215, 10, 125, 45);

						//---- button3 ----
						button3.setText("Save");
						button3.setBorder(new MatteBorder(2, 2, 2, 2, new Color(0, 153, 102)));
						button3.setFont(new Font("Verdana", Font.PLAIN, 18));
						button3.setIcon(new ImageIcon("E:\\Project\\Image\\save1.png"));
						panel1.add(button3);
						button3.setBounds(455, 10, 125, 45);

						//---- label1 ----
						label1.setText("Employee Photo");
						label1.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 22));
						panel1.add(label1);
						label1.setBounds(new Rectangle(new Point(10, 15), label1.getPreferredSize()));

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
					employeeRegPanel.add(panel1);
					panel1.setBounds(10, 240, 680, 60);

					//======== panel2 ========
					{
						panel2.setLayout(null);

						//---- button1 ----
						button1.setText("Upload Image");
						button1.setFont(new Font("Verdana", Font.PLAIN, 18));
						button1.setBorder(new MatteBorder(2, 2, 1, 2, new Color(0, 153, 102)));
						button1.setIcon(new ImageIcon("C:\\Users\\Saurabh\\Desktop\\2.png"));
						panel2.add(button1);
						button1.setBounds(5, 2, 205, 55);

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
					employeeRegPanel.add(panel2);
					panel2.setBounds(715, 240, 215, 60);

					{ // compute preferred size
						Dimension preferredSize = new Dimension();
						for(int i = 0; i < employeeRegPanel.getComponentCount(); i++) {
							Rectangle bounds = employeeRegPanel.getComponent(i).getBounds();
							preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
							preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
						}
						Insets insets = employeeRegPanel.getInsets();
						preferredSize.width += insets.right;
						preferredSize.height += insets.bottom;
						employeeRegPanel.setMinimumSize(preferredSize);
						employeeRegPanel.setPreferredSize(preferredSize);
					}
				}
				ContentPanel.add(employeeRegPanel);
				employeeRegPanel.setBounds(0, 0, 995, 865);

				//---- exitBtn ----
				exitBtn.setText("Exit");
				exitBtn.setIcon(new ImageIcon("E:\\Project\\Image\\Exit3.png"));
				exitBtn.setFont(exitBtn.getFont().deriveFont(exitBtn.getFont().getSize() + 6f));
				exitBtn.addActionListener(e -> exitBtn(e));
				ContentPanel.add(exitBtn);
				exitBtn.setBounds(680, 870, 140, 50);

				//---- saveBtn ----
				saveBtn.setText("Save");
				saveBtn.setIcon(new ImageIcon("E:\\Project\\Image\\save (2).png"));
				saveBtn.setFont(saveBtn.getFont().deriveFont(saveBtn.getFont().getSize() + 6f));
				saveBtn.addActionListener(e -> saveBtn(e));
				ContentPanel.add(saveBtn);
				saveBtn.setBounds(10, 870, 140, 50);

				{ // compute preferred size
					Dimension preferredSize = new Dimension();
					for(int i = 0; i < ContentPanel.getComponentCount(); i++) {
						Rectangle bounds = ContentPanel.getComponent(i).getBounds();
						preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
						preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
					}
					Insets insets = ContentPanel.getInsets();
					preferredSize.width += insets.right;
					preferredSize.height += insets.bottom;
					ContentPanel.setMinimumSize(preferredSize);
					ContentPanel.setPreferredSize(preferredSize);
				}
			}
			scrollPane1.setViewportView(ContentPanel);
		}
		add(scrollPane1);
		scrollPane1.setBounds(0, 0, 995, 945);

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
	// Generated using JFormDesigner Evaluation license - Gaurav Kumar
	private JScrollPane scrollPane1;
	private JPanel ContentPanel;
	private JPanel employeeRegPanel;
	private JPanel namePanel;
	private JLabel F_name;
	private JTextField firstname;
	private JLabel L_name;
	private JTextField lastname;
	private JPanel contactInfoPanel;
	private JPanel contactPanel;
	private JLabel Mobile_No;
	private JTextField mobileNo;
	private JLabel Phone_No;
	private JTextField phoneNo;
	private JLabel Area_Code;
	private JTextField textField6;
	private JLabel label2;
	private JPanel addressPanel;
	private JLabel Address;
	private JLabel State;
	private JTextField state;
	private JLabel City;
	private JTextField city;
	private JTextField pincode;
	private JLabel Pincode;
	private JTextField add1;
	private JTextField add2;
	private JTextField add3;
	private JPanel empPhoto;
	private JPanel dobPanel;
	private JLabel dob;
	private JComboBox<String> dd;
	private JComboBox<String> mm;
	private JComboBox<String> yy;
	private JLabel gender;
	private JRadioButton maleRadioBtn;
	private JRadioButton femaleRadioBtn;
	private JPanel empIdPanel;
	private JLabel emp_Id;
	private JTextField textField9;
	private JPanel credentialsPanel;
	private JLabel user_Id;
	private JLabel security_ques;
	private JLabel security_ans;
	private JLabel Passwd;
	private JLabel Confirm_passwd;
	private JTextField userId;
	private JComboBox<String> securityQues;
	private JTextField securityAnswer;
	private JPasswordField passwd;
	private JPasswordField confirmPasswd;
	private JLabel label18;
	private JLabel label19;
	private JLabel label20;
	private JLabel label21;
	private JLabel label22;
	private JPanel panel1;
	private JButton button2;
	private JButton button3;
	private JLabel label1;
	private JPanel panel2;
	private JButton button1;
	private JButton exitBtn;
	private JButton saveBtn;
	// JFormDesigner - End of variables declaration  //GEN-END:variables
}
