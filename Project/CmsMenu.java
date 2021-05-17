import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
/*
 * Created by JFormDesigner on Wed Feb 10 16:16:04 IST 2016
 */



/**
 * @author Nishant Kumar
 */
public class CmsMenu extends JFrame {
	public CmsMenu() {
		initComponents();
	}

	private void label4MouseClicked(MouseEvent e) {
		// TODO add your code here
	}

	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
		// Generated using JFormDesigner Evaluation license - Gaurav Kumar
		panel1 = new JPanel();
		label1 = new JLabel();
		menuBar1 = new JMenuBar();
		menu1 = new JMenu();
		menu7 = new JMenu();
		menuItem25 = new JMenuItem();
		menuItem1 = new JMenuItem();
		menu8 = new JMenu();
		menuItem2 = new JMenuItem();
		menuItem3 = new JMenuItem();
		menuItem4 = new JMenuItem();
		menuItem5 = new JMenuItem();
		menuItem26 = new JMenuItem();
		menu9 = new JMenu();
		menuItem27 = new JMenuItem();
		menuItem28 = new JMenuItem();
		menuItem29 = new JMenuItem();
		menu10 = new JMenu();
		menuItem30 = new JMenuItem();
		menuItem31 = new JMenuItem();
		menu2 = new JMenu();
		menuItem9 = new JMenuItem();
		menuItem10 = new JMenuItem();
		menuItem11 = new JMenuItem();
		menuItem12 = new JMenuItem();
		menuItem13 = new JMenuItem();
		menu3 = new JMenu();
		menuItem14 = new JMenuItem();
		menuItem15 = new JMenuItem();
		menuItem16 = new JMenuItem();
		menuItem17 = new JMenuItem();
		menu4 = new JMenu();
		menuItem18 = new JMenuItem();
		menuItem19 = new JMenuItem();
		menu5 = new JMenu();
		menuItem20 = new JMenuItem();
		menuItem21 = new JMenuItem();
		menu6 = new JMenu();
		menuItem22 = new JMenuItem();
		menuItem23 = new JMenuItem();
		menuItem24 = new JMenuItem();
		scrollPane1 = new JScrollPane();
		componentPanel = new JPanel();
		dashboardPanel = new JPanel();
		panel2 = new JPanel();
		panel7 = new JPanel();
		panel3 = new JPanel();
		panel5 = new JPanel();
		label3 = new JLabel();
		label4 = new JLabel();
		label5 = new JLabel();
		label6 = new JLabel();
		label7 = new JLabel();
		label8 = new JLabel();
		separator1 = new JSeparator();
		panel8 = new JPanel();
		panel9 = new JPanel();
		panel10 = new JPanel();
		panel11 = new JPanel();
		panel12 = new JPanel();
		panel13 = new JPanel();
		panel15 = new JPanel();
		label13 = new JLabel();
		panel16 = new JPanel();
		label14 = new JLabel();

		//======== this ========
		setTitle("COMPLAINT MANAGEMENT STYSTEM");
		setBackground(new Color(153, 204, 255));
		setVisible(true);
		Container contentPane = getContentPane();
		contentPane.setLayout(null);

		//======== panel1 ========
		{
			panel1.setBackground(Color.white);
			panel1.setBorder(new LineBorder(new Color(222, 89, 145, 204), 8, true));

			// JFormDesigner evaluation mark
			panel1.setBorder(new javax.swing.border.CompoundBorder(
				new javax.swing.border.TitledBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0),
					"JFormDesigner Evaluation", javax.swing.border.TitledBorder.CENTER,
					javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Dialog", java.awt.Font.BOLD, 12),
					java.awt.Color.red), panel1.getBorder())); panel1.addPropertyChangeListener(new java.beans.PropertyChangeListener(){public void propertyChange(java.beans.PropertyChangeEvent e){if("border".equals(e.getPropertyName()))throw new RuntimeException();}});

			panel1.setLayout(null);

			//---- label1 ----
			label1.setText("   COMPLAINT MANAGEMENT SYSTEM");
			label1.setFont(new Font("Times New Roman", Font.PLAIN, 26));
			label1.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(0, 102, 51), new Color(0, 102, 51), new Color(0, 102, 51), new Color(0, 102, 51)));
			label1.setForeground(new Color(0, 102, 51));
			panel1.add(label1);
			label1.setBounds(225, 10, 510, 40);

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
		contentPane.add(panel1);
		panel1.setBounds(0, 0, 1173, 65);

		//======== menuBar1 ========
		{
			menuBar1.setPreferredSize(new Dimension(396, 21));

			//======== menu1 ========
			{
				menu1.setText("CMS MASTER");
				menu1.setMnemonic('M');

				//======== menu7 ========
				{
					menu7.setText("Create");
					menu7.setMnemonic('C');

					//---- menuItem25 ----
					menuItem25.setText(" New Registration");
					menu7.add(menuItem25);

					//---- menuItem1 ----
					menuItem1.setText("Product Category");
					menu7.add(menuItem1);
				}
				menu1.add(menu7);

				//======== menu8 ========
				{
					menu8.setText("Modify");

					//---- menuItem2 ----
					menuItem2.setText("Registration form");
					menu8.add(menuItem2);

					//---- menuItem3 ----
					menuItem3.setText("Customer profile");
					menu8.add(menuItem3);

					//---- menuItem4 ----
					menuItem4.setText("Category");
					menu8.add(menuItem4);

					//---- menuItem5 ----
					menuItem5.setText("Report");
					menu8.add(menuItem5);

					//---- menuItem26 ----
					menuItem26.setText("Agent");
					menu8.add(menuItem26);
				}
				menu1.add(menu8);

				//======== menu9 ========
				{
					menu9.setText("Search");

					//---- menuItem27 ----
					menuItem27.setText("Agent ID");
					menu9.add(menuItem27);

					//---- menuItem28 ----
					menuItem28.setText("Complaint No");
					menu9.add(menuItem28);

					//---- menuItem29 ----
					menuItem29.setText("Report ID");
					menu9.add(menuItem29);
				}
				menu1.add(menu9);

				//======== menu10 ========
				{
					menu10.setText("Restore/Backup");

					//---- menuItem30 ----
					menuItem30.setText("Customer Records");
					menu10.add(menuItem30);

					//---- menuItem31 ----
					menuItem31.setText("Transaction Records");
					menu10.add(menuItem31);
				}
				menu1.add(menu10);
			}
			menuBar1.add(menu1);

			//======== menu2 ========
			{
				menu2.setText("COMPLAINT");

				//---- menuItem9 ----
				menuItem9.setText("Customer Profile");
				menu2.add(menuItem9);

				//---- menuItem10 ----
				menuItem10.setText("Create Invoice");
				menu2.add(menuItem10);

				//---- menuItem11 ----
				menuItem11.setText("Departmental Invoice");
				menu2.add(menuItem11);

				//---- menuItem12 ----
				menuItem12.setText("Scheduling");
				menu2.add(menuItem12);

				//---- menuItem13 ----
				menuItem13.setText("Confirmation");
				menu2.add(menuItem13);
			}
			menuBar1.add(menu2);

			//======== menu3 ========
			{
				menu3.setText("STATUS");

				//---- menuItem14 ----
				menuItem14.setText("Track Complaint");
				menu3.add(menuItem14);

				//---- menuItem15 ----
				menuItem15.setText("Acknowledgment");
				menu3.add(menuItem15);

				//---- menuItem16 ----
				menuItem16.setText("Track Charged Amount");
				menu3.add(menuItem16);

				//---- menuItem17 ----
				menuItem17.setText("Extend Warranty");
				menu3.add(menuItem17);
			}
			menuBar1.add(menu3);

			//======== menu4 ========
			{
				menu4.setText("REPORT");

				//---- menuItem18 ----
				menuItem18.setText("Customer");
				menu4.add(menuItem18);

				//---- menuItem19 ----
				menuItem19.setText("Stock Report");
				menu4.add(menuItem19);
			}
			menuBar1.add(menu4);

			//======== menu5 ========
			{
				menu5.setText("TRANSACTION");

				//---- menuItem20 ----
				menuItem20.setText("Bill Payment");
				menu5.add(menuItem20);

				//---- menuItem21 ----
				menuItem21.setText("Recipt");
				menu5.add(menuItem21);
			}
			menuBar1.add(menu5);

			//======== menu6 ========
			{
				menu6.setText("ADMIN");

				//---- menuItem22 ----
				menuItem22.setText("Login");
				menu6.add(menuItem22);

				//---- menuItem23 ----
				menuItem23.setText("Salary");
				menu6.add(menuItem23);

				//---- menuItem24 ----
				menuItem24.setText("Update Tax");
				menu6.add(menuItem24);
			}
			menuBar1.add(menu6);
		}
		contentPane.add(menuBar1);
		menuBar1.setBounds(0, 65, 1173, 35);

		//======== scrollPane1 ========
		{

			//======== componentPanel ========
			{
				componentPanel.setLayout(new BorderLayout());

				//======== dashboardPanel ========
				{
					dashboardPanel.setLayout(null);

					//======== panel2 ========
					{
						panel2.setBackground(new Color(42, 146, 119));
						panel2.setLayout(null);

						//======== panel7 ========
						{
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
						panel2.add(panel7);
						panel7.setBounds(0, 550, 965, 0);

						//======== panel3 ========
						{
							panel3.setBorder(new TitledBorder(new BevelBorder(BevelBorder.RAISED, Color.white, null, null, null), "Dashboard", TitledBorder.LEADING, TitledBorder.DEFAULT_POSITION,
								new Font("Franklin Gothic Demi Cond", Font.PLAIN, 24), Color.white));
							panel3.setBackground(new Color(42, 146, 119));
							panel3.setLayout(null);

							//======== panel5 ========
							{
								panel5.setBorder(new LineBorder(Color.white, 2));
								panel5.setLayout(null);

								//---- label3 ----
								label3.setText("Search Complaint");
								label3.setFont(new Font("Verdana", Font.BOLD, 22));
								panel5.add(label3);
								label3.setBounds(20, 55, 220, label3.getPreferredSize().height);

								//---- label4 ----
								label4.setText("Know your Customer");
								label4.setFont(new Font("Verdana", Font.BOLD, 22));
								label4.setHorizontalAlignment(SwingConstants.CENTER);
								label4.addMouseListener(new MouseAdapter() {
									@Override
									public void mouseClicked(MouseEvent e) {
										label4MouseClicked(e);
									}
								});
								panel5.add(label4);
								label4.setBounds(10, 10, 295, label4.getPreferredSize().height);

								//---- label5 ----
								label5.setText("Service Charges");
								label5.setFont(new Font("Verdana", Font.BOLD, 22));
								panel5.add(label5);
								label5.setBounds(325, 15, 215, label5.getPreferredSize().height);

								//---- label6 ----
								label6.setText(" Technician Info");
								label6.setFont(new Font("Verdana", Font.BOLD, 22));
								panel5.add(label6);
								label6.setBounds(315, 55, 245, 40);

								//---- label7 ----
								label7.setText("Check Invoice");
								label7.setFont(new Font("Verdana", Font.BOLD, 22));
								panel5.add(label7);
								label7.setBounds(20, 100, 200, label7.getPreferredSize().height);

								//---- label8 ----
								label8.setText("Serviced Device");
								label8.setFont(new Font("Verdana", Font.BOLD, 22));
								panel5.add(label8);
								label8.setBounds(320, 100, label8.getPreferredSize().width, 38);

								//---- separator1 ----
								separator1.setOrientation(SwingConstants.VERTICAL);
								separator1.setForeground(Color.black);
								panel5.add(separator1);
								separator1.setBounds(305, 5, 20, 175);

								//======== panel8 ========
								{
									panel8.setBackground(new Color(255, 204, 204));
									panel8.setLayout(null);

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
								panel8.setBounds(5, 5, 295, 40);

								//======== panel9 ========
								{
									panel9.setBackground(new Color(255, 204, 204));
									panel9.setLayout(null);

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
								panel5.add(panel9);
								panel9.setBounds(5, 50, 295, 40);

								//======== panel10 ========
								{
									panel10.setBackground(new Color(255, 204, 204));
									panel10.setLayout(null);

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
								panel5.add(panel10);
								panel10.setBounds(5, 95, 295, 40);

								//======== panel11 ========
								{
									panel11.setBackground(new Color(255, 204, 204));
									panel11.setLayout(null);

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
								panel5.add(panel11);
								panel11.setBounds(310, 10, 320, 40);

								//======== panel12 ========
								{
									panel12.setBackground(new Color(255, 204, 204));
									panel12.setLayout(null);

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
								panel5.add(panel12);
								panel12.setBounds(310, 55, 320, 40);

								//======== panel13 ========
								{
									panel13.setBackground(new Color(255, 204, 204));
									panel13.setLayout(null);

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
								panel5.add(panel13);
								panel13.setBounds(310, 100, 320, 40);

								//======== panel15 ========
								{
									panel15.setBackground(new Color(255, 204, 204));
									panel15.setLayout(null);

									//---- label13 ----
									label13.setText("Track Service");
									label13.setFont(new Font("Verdana", Font.BOLD, 22));
									panel15.add(label13);
									label13.setBounds(new Rectangle(new Point(25, 5), label13.getPreferredSize()));

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
								panel5.add(panel15);
								panel15.setBounds(5, 140, 295, 40);

								//======== panel16 ========
								{
									panel16.setBackground(new Color(255, 204, 204));
									panel16.setLayout(null);

									//---- label14 ----
									label14.setText("Rejected Complaints");
									label14.setFont(new Font("Verdana", Font.BOLD, 22));
									panel16.add(label14);
									label14.setBounds(10, -5, label14.getPreferredSize().width, 40);

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
								panel5.add(panel16);
								panel16.setBounds(310, 145, 320, 35);

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
							panel3.add(panel5);
							panel5.setBounds(20, 45, 640, 190);

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
						panel3.setBounds(5, 10, 960, 270);

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
					dashboardPanel.add(panel2);
					panel2.setBounds(0, 90, 1173, panel2.getPreferredSize().height);

					{ // compute preferred size
						Dimension preferredSize = new Dimension();
						for(int i = 0; i < dashboardPanel.getComponentCount(); i++) {
							Rectangle bounds = dashboardPanel.getComponent(i).getBounds();
							preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
							preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
						}
						Insets insets = dashboardPanel.getInsets();
						preferredSize.width += insets.right;
						preferredSize.height += insets.bottom;
						dashboardPanel.setMinimumSize(preferredSize);
						dashboardPanel.setPreferredSize(preferredSize);
					}
				}
				componentPanel.add(dashboardPanel, BorderLayout.CENTER);
			}
			scrollPane1.setViewportView(componentPanel);
		}
		contentPane.add(scrollPane1);
		scrollPane1.setBounds(0, 0, 1175, 675);

		{ // compute preferred size
			Dimension preferredSize = new Dimension();
			for(int i = 0; i < contentPane.getComponentCount(); i++) {
				Rectangle bounds = contentPane.getComponent(i).getBounds();
				preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
				preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
			}
			Insets insets = contentPane.getInsets();
			preferredSize.width += insets.right;
			preferredSize.height += insets.bottom;
			contentPane.setMinimumSize(preferredSize);
			contentPane.setPreferredSize(preferredSize);
		}
		pack();
		setLocationRelativeTo(null);
		// JFormDesigner - End of component initialization  //GEN-END:initComponents
	}

	// JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
	// Generated using JFormDesigner Evaluation license - Gaurav Kumar
	private JPanel panel1;
	private JLabel label1;
	private JMenuBar menuBar1;
	private JMenu menu1;
	private JMenu menu7;
	private JMenuItem menuItem25;
	private JMenuItem menuItem1;
	private JMenu menu8;
	private JMenuItem menuItem2;
	private JMenuItem menuItem3;
	private JMenuItem menuItem4;
	private JMenuItem menuItem5;
	private JMenuItem menuItem26;
	private JMenu menu9;
	private JMenuItem menuItem27;
	private JMenuItem menuItem28;
	private JMenuItem menuItem29;
	private JMenu menu10;
	private JMenuItem menuItem30;
	private JMenuItem menuItem31;
	private JMenu menu2;
	private JMenuItem menuItem9;
	private JMenuItem menuItem10;
	private JMenuItem menuItem11;
	private JMenuItem menuItem12;
	private JMenuItem menuItem13;
	private JMenu menu3;
	private JMenuItem menuItem14;
	private JMenuItem menuItem15;
	private JMenuItem menuItem16;
	private JMenuItem menuItem17;
	private JMenu menu4;
	private JMenuItem menuItem18;
	private JMenuItem menuItem19;
	private JMenu menu5;
	private JMenuItem menuItem20;
	private JMenuItem menuItem21;
	private JMenu menu6;
	private JMenuItem menuItem22;
	private JMenuItem menuItem23;
	private JMenuItem menuItem24;
	private JScrollPane scrollPane1;
	private JPanel componentPanel;
	private JPanel dashboardPanel;
	private JPanel panel2;
	private JPanel panel7;
	private JPanel panel3;
	private JPanel panel5;
	private JLabel label3;
	private JLabel label4;
	private JLabel label5;
	private JLabel label6;
	private JLabel label7;
	private JLabel label8;
	private JSeparator separator1;
	private JPanel panel8;
	private JPanel panel9;
	private JPanel panel10;
	private JPanel panel11;
	private JPanel panel12;
	private JPanel panel13;
	private JPanel panel15;
	private JLabel label13;
	private JPanel panel16;
	private JLabel label14;
	// JFormDesigner - End of variables declaration  //GEN-END:variables
}
