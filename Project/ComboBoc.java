import java.awt.*;
import javax.swing.*;
/*
 * Created by JFormDesigner on Wed Apr 13 17:47:15 IST 2016
 */



/**
 * @author Gaurav Kumar
 */
public class ComboBoc extends JPanel {
	public ComboBoc() {
		initComponents();
	}

	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
		// Generated using JFormDesigner Evaluation license - Gaurav Kumar
		checkBox1 = new JCheckBox();
		checkBox2 = new JCheckBox();

		//======== this ========

		// JFormDesigner evaluation mark
		setBorder(new javax.swing.border.CompoundBorder(
			new javax.swing.border.TitledBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0),
				"JFormDesigner Evaluation", javax.swing.border.TitledBorder.CENTER,
				javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Dialog", java.awt.Font.BOLD, 12),
				java.awt.Color.red), getBorder())); addPropertyChangeListener(new java.beans.PropertyChangeListener(){public void propertyChange(java.beans.PropertyChangeEvent e){if("border".equals(e.getPropertyName()))throw new RuntimeException();}});

		setLayout(null);

		//---- checkBox1 ----
		checkBox1.setText("Male");
		add(checkBox1);
		checkBox1.setBounds(35, 110, 75, checkBox1.getPreferredSize().height);

		//---- checkBox2 ----
		checkBox2.setText("Female");
		add(checkBox2);
		checkBox2.setBounds(new Rectangle(new Point(105, 110), checkBox2.getPreferredSize()));

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
		// JFormDesigner - End of component initialization  //GEN-END:initComponents
	}

	// JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
	// Generated using JFormDesigner Evaluation license - Gaurav Kumar
	private JCheckBox checkBox1;
	private JCheckBox checkBox2;
	// JFormDesigner - End of variables declaration  //GEN-END:variables
}
