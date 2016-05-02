package componentes;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

public class boton extends JButton {
	private final static Color COLORBOTON = new Color(96, 164, 123);
	public boton(String text) {
		setText(text);
		setForeground(Color.BLACK);
		setBackground(COLORBOTON);
		Border line = new LineBorder(Color.BLACK);
		Border margin = new EmptyBorder(5, 15, 5, 15);
		Border compound = new CompoundBorder(line, margin);
		setBorder(compound);
	}
}
