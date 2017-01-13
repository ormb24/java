import java.awt.Dimension;

import javax.swing.JButton;

public class Btn extends JButton {
	private String name;
	public Btn(String str) {
	//Défini un bouton avec un nom.  Dimensions ajustables automatiquement.
		super(str);
		this.name=str;
		
	}
	
	public Btn(String str, int width, int height) {
	//Définit un bouton avec un nom et ses dimensions.
		super(str);
		this.name=str;
		this.setPreferredSize(new Dimension(width,height));
	}
}
