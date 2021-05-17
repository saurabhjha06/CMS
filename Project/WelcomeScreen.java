import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
/*
 * Created by JFormDesigner on Wed Apr 13 16:48:57 IST 2016
 */



/**
 * @author Gaurav Kumar
 */
public class WelcomeScreen extends JFrame {
	public WelcomeScreen() {
		initComponents();
	}

	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
		// Generated using JFormDesigner Evaluation license - Dolly Jha
		Titlepanel = new JPanel();
		title = new JLabel();
		ProgressBarpanel = new JPanel();
		progressBar1 = new JProgressBar();
		logo1 = new JLabel();
		logo2 = new JLabel();

		//======== this ========
		setTitle("CMS Welcome Screen Panel");
		setFont(new Font("Dialog", Font.BOLD, 14));
		Container contentPane = getContentPane();
		contentPane.setLayout(null);

		//======== Titlepanel ========
		{
			Titlepanel.setBorder(new MatteBorder(2, 2, 2, 2, Color.black));

			// JFormDesigner evaluation mark
			Titlepanel.setBorder(new javax.swing.border.CompoundBorder(
				new javax.swing.border.TitledBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0),
					"JFormDesigner Evaluation", javax.swing.border.TitledBorder.CENTER,
					javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Dialog", java.awt.Font.BOLD, 12),
					java.awt.Color.red), Titlepanel.getBorder())); Titlepanel.addPropertyChangeListener(new java.beans.PropertyChangeListener(){public void propertyChange(java.beans.PropertyChangeEvent e){if("border".equals(e.getPropertyName()))throw new RuntimeException();}});

			Titlepanel.setLayout(null);

			//---- title ----
			title.setIcon(new ImageIcon("E:\\Project\\Image\\title_1461243353394.jpg"));
			Titlepanel.add(title);
			title.setBounds(0, 0, 870, 80);

			{ // compute preferred size
				Dimension preferredSize = new Dimension();
				for(int i = 0; i < Titlepanel.getComponentCount(); i++) {
					Rectangle bounds = Titlepanel.getComponent(i).getBounds();
					preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
					preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
				}
				Insets insets = Titlepanel.getInsets();
				preferredSize.width += insets.right;
				preferredSize.height += insets.bottom;
				Titlepanel.setMinimumSize(preferredSize);
				Titlepanel.setPreferredSize(preferredSize);
			}
		}
		contentPane.add(Titlepanel);
		Titlepanel.setBounds(30, 15, 870, 80);

		//======== ProgressBarpanel ========
		{
			ProgressBarpanel.setLayout(null);
			ProgressBarpanel.add(progressBar1);
			progressBar1.setBounds(20, 5, 525, 25);

			{ // compute preferred size
				Dimension preferredSize = new Dimension();
				for(int i = 0; i < ProgressBarpanel.getComponentCount(); i++) {
					Rectangle bounds = ProgressBarpanel.getComponent(i).getBounds();
					preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
					preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
				}
				Insets insets = ProgressBarpanel.getInsets();
				preferredSize.width += insets.right;
				preferredSize.height += insets.bottom;
				ProgressBarpanel.setMinimumSize(preferredSize);
				ProgressBarpanel.setPreferredSize(preferredSize);
			}
		}
		contentPane.add(ProgressBarpanel);
		ProgressBarpanel.setBounds(140, 395, 555, 35);

		//---- logo1 ----
		logo1.setIcon(new ImageIcon("E:\\Project\\Image\\LiteViewer-Help-desk-e1399335473258.png"));
		contentPane.add(logo1);
		logo1.setBounds(460, 120, 415, 255);

		//---- logo2 ----
		logo2.setIcon(new ImageIcon("E:\\Project\\Image\\Update-welcome.png"));
		contentPane.add(logo2);
		logo2.setBounds(30, 115, 425, 260);

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
		setLocationRelativeTo(getOwner());
		// JFormDesigner - End of component initialization  //GEN-END:initComponents
	}

	// JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
	// Generated using JFormDesigner Evaluation license - Dolly Jha
	private JPanel Titlepanel;
	private JLabel title;
	private JPanel ProgressBarpanel;
	private JProgressBar progressBar1;
	private JLabel logo1;
	private JLabel logo2;
	// JFormDesigner - End of variables declaration  //GEN-END:variables
}
