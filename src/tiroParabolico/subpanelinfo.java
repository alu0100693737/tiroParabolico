package tiroParabolico;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

public class subpanelinfo extends JPanel {
	
	private final static Color COLORSUBPANELINFO = new Color(255, 229, 143);
	public subpanelinfo() {
		setForeground(Color.BLACK);
		setBackground(COLORSUBPANELINFO);
		Border line = new LineBorder(Color.BLACK);
		Border margin = new EmptyBorder(5, 15, 5, 15);
		Border compound = new CompoundBorder(line, margin);
		setBorder(compound);
		setFont(new Font("Comic Sans MS", Font.BOLD, 18));
	}
}
