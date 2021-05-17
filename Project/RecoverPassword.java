import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
/*
 * Created by JFormDesigner on Thu Mar 03 14:30:43 IST 2016
 */



/**
 * @author Saurabh Jha
 */
public class RecoverPassword {
	public RecoverPassword() {
		initComponents();
	}

	private void ContBtnActionPerformed() {
		// TODO add your code here
	}

	private void exitBtnActionPerformed() {
		// TODO add your code here
	}

	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
		// Generated using JFormDesigner Evaluation license - Dolly Jha
		mainPanel = new JPanel();
		InfoPanel = new JPanel();
		UserId = new JLabel();
		user_id = new JTextField();
		Dob = new JLabel();
		SecQues = new JLabel();
		sec_ques = new JComboBox<>();
		SecAns = new JLabel();
		sec_ans = new JTextField();
		dd = new JComboBox<>();
		mm = new JComboBox<>();
		yy = new JComboBox<>();
		label1 = new JLabel();
		label2 = new JLabel();
		label3 = new JLabel();
		label4 = new JLabel();
		ContBtn = new JButton();
		exitBtn = new JButton();
		title = new JLabel();

		//======== mainPanel ========
		{
			mainPanel.setForeground(new Color(0, 102, 51));
			mainPanel.setBackground(Color.white);
			mainPanel.setBorder(new MatteBorder(4, 4, 4, 4, new Color(0, 102, 102)));

			// JFormDesigner evaluation mark
			mainPanel.setBorder(new javax.swing.border.CompoundBorder(
				new javax.swing.border.TitledBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0),
					"JFormDesigner Evaluation", javax.swing.border.TitledBorder.CENTER,
					javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Dialog", java.awt.Font.BOLD, 12),
					java.awt.Color.red), mainPanel.getBorder())); mainPanel.addPropertyChangeListener(new java.beans.PropertyChangeListener(){public void propertyChange(java.beans.PropertyChangeEvent e){if("border".equals(e.getPropertyName()))throw new RuntimeException();}});

			mainPanel.setLayout(null);

			//======== InfoPanel ========
			{
				InfoPanel.setBackground(Color.white);
				InfoPanel.setBorder(new TitledBorder(new LineBorder(new Color(0, 102, 51), 2), "Please provide Signup Info", TitledBorder.LEADING, TitledBorder.DEFAULT_POSITION,
					new Font("Lucida Console", Font.PLAIN, 20), new Color(42, 149, 119)));
				InfoPanel.setLayout(null);

				//---- UserId ----
				UserId.setText("User ID");
				UserId.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 20));
				UserId.setForeground(new Color(42, 146, 119));
				InfoPanel.add(UserId);
				UserId.setBounds(20, 50, 70, 24);

				//---- user_id ----
				user_id.setBorder(new LineBorder(new Color(0, 102, 51), 2));
				InfoPanel.add(user_id);
				user_id.setBounds(240, 49, 180, 25);

				//---- Dob ----
				Dob.setText("Date of Birth");
				Dob.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 20));
				Dob.setForeground(new Color(42, 146, 119));
				InfoPanel.add(Dob);
				Dob.setBounds(20, 110, 110, 24);

				//---- SecQues ----
				SecQues.setText("Security Question");
				SecQues.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 20));
				SecQues.setForeground(new Color(42, 146, 119));
				InfoPanel.add(SecQues);
				SecQues.setBounds(new Rectangle(new Point(20, 170), SecQues.getPreferredSize()));

				//---- sec_ques ----
				sec_ques.setModel(new DefaultComboBoxModel<>(new String[] {
					"[Select Your Security Question]",
					"what is your nickname?",
					"Which school you visited first?",
					"What is your father's middle name?",
					"Which is your favourite plant?",
					"What is  name of your favourite teacher?",
					"Which place you were born?"
				}));
				InfoPanel.add(sec_ques);
				sec_ques.setBounds(240, 169, 185, 25);

				//---- SecAns ----
				SecAns.setText("Security Answer");
				SecAns.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 20));
				SecAns.setForeground(new Color(42, 146, 119));
				InfoPanel.add(SecAns);
				SecAns.setBounds(20, 230, 135, 24);

				//---- sec_ans ----
				sec_ans.setBorder(new LineBorder(new Color(0, 102, 51), 2));
				InfoPanel.add(sec_ans);
				sec_ans.setBounds(240, 229, 240, 25);

				//---- dd ----
				dd.setModel(new DefaultComboBoxModel<>(new String[] {
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
				InfoPanel.add(dd);
				dd.setBounds(240, 109, 50, 25);

				//---- mm ----
				mm.setModel(new DefaultComboBoxModel<>(new String[] {
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
				InfoPanel.add(mm);
				mm.setBounds(297, 109, 55, 25);

				//---- yy ----
				yy.setModel(new DefaultComboBoxModel<>(new String[] {
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
					"2000",
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
					"2015"
				}));
				InfoPanel.add(yy);
				yy.setBounds(359, 109, 50, 25);

				//---- label1 ----
				label1.setText("*");
				label1.setForeground(Color.red);
				label1.setFont(new Font("Tahoma", Font.PLAIN, 20));
				InfoPanel.add(label1);
				label1.setBounds(new Rectangle(new Point(80, 45), label1.getPreferredSize()));

				//---- label2 ----
				label2.setText("*");
				label2.setForeground(Color.red);
				label2.setFont(new Font("Tahoma", Font.PLAIN, 20));
				InfoPanel.add(label2);
				label2.setBounds(new Rectangle(new Point(160, 165), label2.getPreferredSize()));

				//---- label3 ----
				label3.setText("*");
				label3.setForeground(Color.red);
				label3.setFont(new Font("Tahoma", Font.PLAIN, 20));
				InfoPanel.add(label3);
				label3.setBounds(new Rectangle(new Point(150, 230), label3.getPreferredSize()));

				//---- label4 ----
				label4.setText("fiels marked with asterisk(*) are mandatory");
				label4.setFont(new Font("Gabriola", Font.PLAIN, 20));
				label4.setForeground(new Color(0, 102, 51));
				InfoPanel.add(label4);
				label4.setBounds(new Rectangle(new Point(455, 15), label4.getPreferredSize()));

				{ // compute preferred size
					Dimension preferredSize = new Dimension();
					for(int i = 0; i < InfoPanel.getComponentCount(); i++) {
						Rectangle bounds = InfoPanel.getComponent(i).getBounds();
						preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
						preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
					}
					Insets insets = InfoPanel.getInsets();
					preferredSize.width += insets.right;
					preferredSize.height += insets.bottom;
					InfoPanel.setMinimumSize(preferredSize);
					InfoPanel.setPreferredSize(preferredSize);
				}
			}
			mainPanel.add(InfoPanel);
			InfoPanel.setBounds(15, 75, 730, 285);

			//---- ContBtn ----
			ContBtn.setText("Continue");
			ContBtn.setIcon(new ImageIcon("E:\\Project\\Image\\ok.png"));
			ContBtn.setFont(ContBtn.getFont().deriveFont(ContBtn.getFont().getSize() + 5f));
			ContBtn.setBackground(Color.white);
			ContBtn.setBorder(new MatteBorder(2, 2, 2, 2, new Color(42, 149, 119)));
			ContBtn.addActionListener(e -> ContBtnActionPerformed());
			mainPanel.add(ContBtn);
			ContBtn.setBounds(420, 370, 150, 50);

			//---- exitBtn ----
			exitBtn.setText("Exit");
			exitBtn.setIcon(new ImageIcon("E:\\Project\\Image\\Exit3.png"));
			exitBtn.setFont(exitBtn.getFont().deriveFont(exitBtn.getFont().getSize() + 5f));
			exitBtn.setBackground(Color.white);
			exitBtn.setBorder(new MatteBorder(2, 2, 2, 2, new Color(42, 149, 119)));
			exitBtn.addActionListener(e -> exitBtnActionPerformed());
			mainPanel.add(exitBtn);
			exitBtn.setBounds(110, 370, 150, 50);

			//---- title ----
			title.setText("Recover Login Password");
			title.setFont(new Font("Segoe UI", Font.PLAIN, 24));
			title.setForeground(new Color(0, 102, 102));
			title.setBorder(new LineBorder(new Color(0, 102, 51), 2));
			title.setHorizontalAlignment(SwingConstants.CENTER);
			mainPanel.add(title);
			title.setBounds(10, 10, 720, 45);

			{ // compute preferred size
				Dimension preferredSize = new Dimension();
				for(int i = 0; i < mainPanel.getComponentCount(); i++) {
					Rectangle bounds = mainPanel.getComponent(i).getBounds();
					preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
					preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
				}
				Insets insets = mainPanel.getInsets();
				preferredSize.width += insets.right;
				preferredSize.height += insets.bottom;
				mainPanel.setMinimumSize(preferredSize);
				mainPanel.setPreferredSize(preferredSize);
			}
		}
		// JFormDesigner - End of component initialization  //GEN-END:initComponents
	}

	// JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
	// Generated using JFormDesigner Evaluation license - Dolly Jha
	private JPanel mainPanel;
	private JPanel InfoPanel;
	private JLabel UserId;
	private JTextField user_id;
	private JLabel Dob;
	private JLabel SecQues;
	private JComboBox<String> sec_ques;
	private JLabel SecAns;
	private JTextField sec_ans;
	private JComboBox<String> dd;
	private JComboBox<String> mm;
	private JComboBox<String> yy;
	private JLabel label1;
	private JLabel label2;
	private JLabel label3;
	private JLabel label4;
	private JButton ContBtn;
	private JButton exitBtn;
	private JLabel title;
	// JFormDesigner - End of variables declaration  //GEN-END:variables
}
