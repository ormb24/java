import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

public class Panneau extends JPanel {
	public Panneau() {
		super();
	}
	
	public Panneau(int w, int h) {
		super();
		this.setPreferredSize(new Dimension(w,h));
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		this.setBackground(Color.BLACK);
		/*int x1=this.getHeight();
		int y1=this.getWidth();
		g.setColor(Color.YELLOW);
		g.fillRect(0,0,x1,y1);
		g.setColor(Color.BLUE);
		g.fillOval((x1)/2,(y1)/2,50,50);
		this.setBackground(Color.GREEN);
		System.out.println("Largeur : "+y1+"; Hauteur : "+x1);
		*/
		
	}
}
