import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
/*
 * Created by JFormDesigner on Sat Mar 26 18:50:42 IST 2016
 */



/**
 * @author Saurabh Jha
 */
public class CMS_Login extends JPanel  {

	private void ClearBtnActionPerformed(ActionEvent e) {
		// TODO add your code here
	}

	private void LoginBtnActionPerformed(ActionEvent e) {
		// TODO add your code here
	}

	private void adminlogoMouseClicked(MouseEvent e) {
		// TODO add your code here
	}

	private void Forg_passMouseClicked(MouseEvent e) {
		// TODO add your code here
	}

	private void emplogoMouseClicked(MouseEvent e) {
		// TODO add your code here
	}

	private void Add_UserMouseClicked(MouseEvent e) {
		// TODO add your code here
	}

	private void label2MouseClicked(MouseEvent e) {
		// TODO add your code here
	}

	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
		// Generated using JFormDesigner Evaluation license - Gaurav Kumar
		titlePanel = new JPanel();
		title = new JLabel();
		credentialsPanel = new JPanel();
		userIdPanel = new JPanel();
		User_id = new JLabel();
		UserId = new JTextField();
		passwdPanel = new JPanel();
		Password = new JLabel();
		Passwd = new JPasswordField();
		Forg_pass = new JLabel();
		ClearBtn = new JButton();
		LoginBtn = new JButton();
		accountSelectionPanel = new JPanel();
		adminPanel = new JPanel();
		adminRadioBtn = new JRadioButton();
		adminlogo = new JLabel();
		empPanel = new JPanel();
		empRadioBtn = new JRadioButton();
		emplogo = new JLabel();
		Add_User = new JLabel();

		//======== this ========
		setBackground(new Color(240, 233, 154));

		// JFormDesigner evaluation mark
		setBorder(new javax.swing.border.CompoundBorder(
			new javax.swing.border.TitledBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0),
				"JFormDesigner Evaluation", javax.swing.border.TitledBorder.CENTER,
				javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Dialog", java.awt.Font.BOLD, 12),
				java.awt.Color.red), getBorder())); addPropertyChangeListener(new java.beans.PropertyChangeListener(){public void propertyChange(java.beans.PropertyChangeEvent e){if("border".equals(e.getPropertyName()))throw new RuntimeException();}});

		setLayout(null);

		//======== titlePanel ========
		{
			titlePanel.setBackground(new Color(42, 146, 119));
			titlePanel.setBorder(new MatteBorder(2, 3, 2, 3, Color.white));
			titlePanel.setLayout(null);

			//---- title ----
			title.setText("Complaint Management System-Login panel");
			title.setFont(new Font("Times New Roman", Font.BOLD, 26));
			title.setForeground(Color.white);
			title.setHorizontalAlignment(SwingConstants.CENTER);
			titlePanel.add(title);
			title.setBounds(120, 5, 535, title.getPreferredSize().height);

			{ // compute preferred size
				Dimension preferredSize = new Dimension();
				for(int i = 0; i < titlePanel.getComponentCount(); i++) {
					Rectangle bounds = titlePanel.getComponent(i).getBounds();
					preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
					preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
				}
				Insets insets = titlePanel.getInsets();
				preferredSize.width += insets.right;
				preferredSize.height += insets.bottom;
				titlePanel.setMinimumSize(preferredSize);
				titlePanel.setPreferredSize(preferredSize);
			}
		}
		add(titlePanel);
		titlePanel.setBounds(0, 5, 775, 40);

		//======== credentialsPanel ========
		{
			credentialsPanel.setBackground(new Color(240, 233, 154));
			credentialsPanel.setBorder(new TitledBorder(new LineBorder(Color.black, 3), "Credentials", TitledBorder.CENTER, TitledBorder.DEFAULT_POSITION,
				new Font("Lucida Console", Font.BOLD, 22)));
			credentialsPanel.setLayout(null);

			//======== userIdPanel ========
			{
				userIdPanel.setLayout(null);

				//---- User_id ----
				User_id.setText("User Id");
				User_id.setFont(new Font("Consolas", Font.PLAIN, 22));
				userIdPanel.add(User_id);
				User_id.setBounds(new Rectangle(new Point(10, 5), User_id.getPreferredSize()));

				//---- UserId ----
				UserId.setBorder(new MatteBorder(2, 2, 2, 2, Color.black));
				userIdPanel.add(UserId);
				UserId.setBounds(125, 10, 155, 25);

				{ // compute preferred size
					Dimension preferredSize = new Dimension();
					for(int i = 0; i < userIdPanel.getComponentCount(); i++) {
						Rectangle bounds = userIdPanel.getComponent(i).getBounds();
						preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
						preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
					}
					Insets insets = userIdPanel.getInsets();
					preferredSize.width += insets.right;
					preferredSize.height += insets.bottom;
					userIdPanel.setMinimumSize(preferredSize);
					userIdPanel.setPreferredSize(preferredSize);
				}
			}
			credentialsPanel.add(userIdPanel);
			userIdPanel.setBounds(10, 30, 295, 45);

			//======== passwdPanel ========
			{
				passwdPanel.setLayout(null);

				//---- Password ----
				Password.setText("Password");
				Password.setFont(new Font("Consolas", Font.PLAIN, 22));
				passwdPanel.add(Password);
				Password.setBounds(new Rectangle(new Point(10, 10), Password.getPreferredSize()));

				//---- Passwd ----
				Passwd.setBorder(new MatteBorder(2, 2, 2, 2, Color.black));
				passwdPanel.add(Passwd);
				Passwd.setBounds(125, 15, 155, 25);

				{ // compute preferred size
					Dimension preferredSize = new Dimension();
					for(int i = 0; i < passwdPanel.getComponentCount(); i++) {
						Rectangle bounds = passwdPanel.getComponent(i).getBounds();
						preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
						preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
					}
					Insets insets = passwdPanel.getInsets();
					preferredSize.width += insets.right;
					preferredSize.height += insets.bottom;
					passwdPanel.setMinimumSize(preferredSize);
					passwdPanel.setPreferredSize(preferredSize);
				}
			}
			credentialsPanel.add(passwdPanel);
			passwdPanel.setBounds(10, 95, 295, 45);

			//---- Forg_pass ----
			Forg_pass.setText("Forgot Password ?");
			Forg_pass.setFont(new Font("Tahoma", Font.BOLD, 16));
			Forg_pass.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					Forg_passMouseClicked(e);
				}
			});
			credentialsPanel.add(Forg_pass);
			Forg_pass.setBounds(new Rectangle(new Point(90, 150), Forg_pass.getPreferredSize()));

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
		add(credentialsPanel);
		credentialsPanel.setBounds(365, 75, 315, 200);

		//---- ClearBtn ----
		ClearBtn.setIcon(new ImageIcon("E:\\Project\\Image\\Reset1.png"));
		ClearBtn.setText("Clear");
		ClearBtn.setFont(new Font("Times New Roman", Font.PLAIN, 24));
		ClearBtn.setBackground(new Color(42, 146, 119));
		ClearBtn.setBorder(new MatteBorder(2, 2, 2, 2, new Color(0, 102, 102)));
		ClearBtn.addActionListener(e -> ClearBtnActionPerformed(e));
		add(ClearBtn);
		ClearBtn.setBounds(155, 310, 150, 48);

		//---- LoginBtn ----
		LoginBtn.setIcon(new ImageIcon("E:\\Project\\Image\\login (2).png"));
		LoginBtn.setText(" Login");
		LoginBtn.setFont(new Font("Times New Roman", Font.PLAIN, 24));
		LoginBtn.setBackground(new Color(42, 146, 119));
		LoginBtn.setBorder(new MatteBorder(2, 2, 2, 2, new Color(0, 102, 102)));
		LoginBtn.addActionListener(e -> LoginBtnActionPerformed(e));
		add(LoginBtn);
		LoginBtn.setBounds(430, 310, 150, 48);

		//======== accountSelectionPanel ========
		{
			accountSelectionPanel.setBackground(new Color(240, 233, 144));
			accountSelectionPanel.setBorder(new TitledBorder(new LineBorder(Color.black, 3), "Select Account Type", TitledBorder.CENTER, TitledBorder.DEFAULT_POSITION,
				new Font("Lucida Console", Font.BOLD, 22)));
			accountSelectionPanel.setLayout(null);

			//======== adminPanel ========
			{
				adminPanel.setLayout(null);

				//---- adminRadioBtn ----
				adminRadioBtn.setText("Administrator");
				adminRadioBtn.setFont(new Font("Times New Roman", Font.BOLD, 20));
				adminPanel.add(adminRadioBtn);
				adminRadioBtn.setBounds(new Rectangle(new Point(15, 15), adminRadioBtn.getPreferredSize()));

				//---- adminlogo ----
				adminlogo.setIcon(new ImageIcon("E:\\Project\\Image\\admin.png"));
				adminlogo.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						label2MouseClicked(e);
					}
				});
				adminPanel.add(adminlogo);
				adminlogo.setBounds(new Rectangle(new Point(180, 0), adminlogo.getPreferredSize()));

				{ // compute preferred size
					Dimension preferredSize = new Dimension();
					for(int i = 0; i < adminPanel.getComponentCount(); i++) {
						Rectangle bounds = adminPanel.getComponent(i).getBounds();
						preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
						preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
					}
					Insets insets = adminPanel.getInsets();
					preferredSize.width += insets.right;
					preferredSize.height += insets.bottom;
					adminPanel.setMinimumSize(preferredSize);
					adminPanel.setPreferredSize(preferredSize);
				}
			}
			accountSelectionPanel.add(adminPanel);
			adminPanel.setBounds(15, 40, 280, 60);

			//======== empPanel ========
			{
				empPanel.setLayout(null);

				//---- empRadioBtn ----
				empRadioBtn.setText("Employee");
				empRadioBtn.setFont(new Font("Times New Roman", Font.BOLD, 20));
				empPanel.add(empRadioBtn);
				empRadioBtn.setBounds(new Rectangle(new Point(15, 10), empRadioBtn.getPreferredSize()));

				//---- emplogo ----
				emplogo.setIcon(new ImageIcon("E:\\Project\\Image\\emp.png"));
				emplogo.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						emplogoMouseClicked(e);
					}
				});
				empPanel.add(emplogo);
				emplogo.setBounds(180, 0, 75, 55);

				{ // compute preferred size
					Dimension preferredSize = new Dimension();
					for(int i = 0; i < empPanel.getComponentCount(); i++) {
						Rectangle bounds = empPanel.getComponent(i).getBounds();
						preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
						preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
					}
					Insets insets = empPanel.getInsets();
					preferredSize.width += insets.right;
					preferredSize.height += insets.bottom;
					empPanel.setMinimumSize(preferredSize);
					empPanel.setPreferredSize(preferredSize);
				}
			}
			accountSelectionPanel.add(empPanel);
			empPanel.setBounds(15, 120, 280, 60);

			{ // compute preferred size
				Dimension preferredSize = new Dimension();
				for(int i = 0; i < accountSelectionPanel.getComponentCount(); i++) {
					Rectangle bounds = accountSelectionPanel.getComponent(i).getBounds();
					preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
					preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
				}
				Insets insets = accountSelectionPanel.getInsets();
				preferredSize.width += insets.right;
				preferredSize.height += insets.bottom;
				accountSelectionPanel.setMinimumSize(preferredSize);
				accountSelectionPanel.setPreferredSize(preferredSize);
			}
		}
		add(accountSelectionPanel);
		accountSelectionPanel.setBounds(20, 75, 315, 200);

		//---- Add_User ----
		Add_User.setIcon(new ImageIcon("E:\\Project\\Image\\add_user.png"));
		Add_User.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Add_UserMouseClicked(e);
			}
		});
		add(Add_User);
		Add_User.setBounds(new Rectangle(new Point(690, 110), Add_User.getPreferredSize()));

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

		//---- userGroup ----
		ButtonGroup userGroup = new ButtonGroup();
		userGroup.add(adminRadioBtn);
		userGroup.add(empRadioBtn);
		// JFormDesigner - End of component initialization  //GEN-END:initComponents
	}

	// JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
	// Generated using JFormDesigner Evaluation license - Gaurav Kumar
	private JPanel titlePanel;
	private JLabel title;
	private JPanel credentialsPanel;
	private JPanel userIdPanel;
	private JLabel User_id;
	private JTextField UserId;
	private JPanel passwdPanel;
	private JLabel Password;
	private JPasswordField Passwd;
	private JLabel Forg_pass;
	private JButton ClearBtn;
	private JButton LoginBtn;
	private JPanel accountSelectionPanel;
	private JPanel adminPanel;
	private JRadioButton adminRadioBtn;
	private JLabel adminlogo;
	private JPanel empPanel;
	private JRadioButton empRadioBtn;
	private JLabel emplogo;
	private JLabel Add_User;
	// JFormDesigner - End of variables declaration  //GEN-END:variables
}
