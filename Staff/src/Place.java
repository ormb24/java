import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;

public class Place extends JFrame {
	private Panneau leftpan=new Panneau(120,100);
	private Panneau rightpan=new Panneau();
	private JButton b1=new JButton("Nom : ");
	private Btn b2=new Btn("Prénom : ",100,50);
	//private b=new BoxLayout(this,)
	
	public Place() {
		super();
		Box box1=Box.createHorizontalBox();
		Box box2=Box.createHorizontalBox();
		Box box3=Box.createHorizontalBox();
		leftpan.add(b1);
		leftpan.add(b2);
		leftpan.setBackground(Color.BLUE);
		box1.add(leftpan);
		box2.add(rightpan);
		box3.add(box1);
		box3.add(box2);
		//this.setLayout(new BorderLayout());
		//this.add(leftpan,BorderLayout.WEST);
		//this.add(rightpan,BorderLayout.EAST);
		
		
		this.setTitle("Lieu");
		this.setSize(400,200);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.getContentPane().add(box3);
		this.setVisible(true);
	}
}
