package componentes;

import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JSlider;

public class slider extends JSlider {
	public slider() {
		super();
		setMajorTickSpacing(10);
		setMinorTickSpacing(1);
		setPaintTicks(true);
		setPaintLabels(true);
		setBorder(BorderFactory.createEmptyBorder(0,0,10,0));
	}
}
