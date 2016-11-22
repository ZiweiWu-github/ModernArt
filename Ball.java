import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.Random;
import java.awt.*;
import java.awt.color.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.Timer;


public class Ball extends JPanel implements Runnable, ActionListener{
	private int xCoord, yCoord, width, height;
	private float run, rise;
	private int xCoord1, yCoord1, xCoord2, yCoord2, xCoord3, yCoord3;
	private int xMax, yMax;
	private boolean left, right, up, down;
	private boolean left1, right1, up1, down1;
	private boolean left2, right2, up2, down2;
	private boolean left3, right3, up3, down3;
	private Timer t = new Timer(5, this);
	public Ball(){
		xMax = 700;
		yMax = 700;
		setxCoord();
		setyCoord();
		height =15;
		width = 15;
		run =width/2;
		rise = height/2;
	}
	public int getxCoord(){
		return xCoord;
	}
	public int getyCoord(){
		return yCoord;
	}
	public void setxCoord(){
		int max = xMax;
		Random rand = new Random();
		int tempX = rand.nextInt(max);
		xCoord = tempX;
		tempX = rand.nextInt(max);
		xCoord1 = tempX;
		tempX = rand.nextInt(max);
		xCoord2 = tempX;
		tempX = rand.nextInt(max);
		xCoord3 = tempX;
	}
	public void setyCoord(){
		int max = yMax; 
		Random rand = new Random();
		int tempY = rand.nextInt(max);
		yCoord = tempY;
		tempY = rand.nextInt(max);
		yCoord1 = tempY;
		tempY = rand.nextInt(max);
		yCoord2 = tempY;
		tempY = rand.nextInt(max);
		yCoord3 = tempY;
	}
	public void paintComponent(Graphics g){
		Graphics2D g2 = (Graphics2D) g;
		this.setBackground(Color.BLACK);
		g2.setColor(Color.BLUE);
		g2.fillOval(xCoord, yCoord, width, height);
		
		g2.setColor(Color.RED);
		g2.fillOval(xCoord1, yCoord1, width, height);
		
		g2.setColor(Color.GREEN);
		g2.fillOval(xCoord2, yCoord2, width, height);
		
		g2.setColor(Color.ORANGE);
		g2.fillOval(xCoord3, yCoord3, width, height);
		
		t.start();
	}
	public void update(){
		if(xCoord < 0){
			left = false;
		}
		if(xCoord>xMax){
			right = false;
		}
		if(xCoord >0 && xCoord<xMax){
			left=true;
			right=true;
		}
		if(yCoord < 0){
			up = false;
		}
		if(yCoord> yMax){
			down = false;
		}
		if(yCoord > 0 && yCoord<yMax){
			up=true;
			down=true;
		}
		
		
		if(xCoord1 < 0){
			left1 = false;
		}
		if(xCoord1>xMax){
			right1 = false;
		}
		if(xCoord1 >0 && xCoord1<xMax){
			left1=true;
			right1=true;
		}
		if(yCoord1 < 0){
			up1 = false;
		}
		if(yCoord1> yMax){
			down1 = false;
		}
		if(yCoord1 > 0 && yCoord1<yMax){
			up1=true;
			down1=true;
		}
		
		if(xCoord2 < 0){
			left2 = false;
		}
		if(xCoord2>xMax){
			right2 = false;
		}
		if(xCoord2 >0 && xCoord2<xMax){
			left2=true;
			right2=true;
		}
		if(yCoord2 < 0){
			up2 = false;
		}
		if(yCoord2> yMax){
			down2 = false;
		}
		if(yCoord2 > 0 && yCoord2<yMax){
			up2=true;
			down2=true;
		}
		
		if(xCoord3 < 0){
			left3 = false;
		}
		if(xCoord3>xMax){
			right3 = false;
		}
		if(xCoord3>0 && xCoord3<xMax){
			left3=true;
			right3=true;
		}
		if(yCoord3 < 0){
			up3= false;
		}
		if(yCoord3 >yMax){
			down3 = false;
		}
		if(yCoord3 > 0 && yCoord3<yMax){
			up3=true;
			down3=true;
		}
	}
	public void move(){
		if(left== true && right==true && up==true && down==true){
			Random rand = new Random();
			int movement = rand.nextInt(8);
			if(movement == 0){xCoord += run;}
			if(movement == 1){xCoord -= run;}
			if(movement == 2){yCoord += rise;}
			if(movement == 3){yCoord -= rise;}
			if(movement == 4){
				xCoord += run;
				yCoord += rise;
			}
			if(movement ==5){
				xCoord += run;
				yCoord -= rise;
			}
			if(movement == 6){
				xCoord -= run;
				yCoord += rise;
			}
			if(movement == 7){
				xCoord -= run;
				yCoord -= rise;
			}
		}
		if(up == false){yCoord+= rise;}
		if(down == false){yCoord -= rise;}
		if(right==false){xCoord-= run;}
		if(left==false){xCoord += run;}
		
		if(left1== true && right1==true && up1==true && down1==true){
			Random rand = new Random();
			int movement = rand.nextInt(8);
			if(movement == 0){xCoord1 += run;}
			if(movement == 1){xCoord1 -= run;}
			if(movement == 2){yCoord1 += rise;}
			if(movement == 3){yCoord1 -= rise;}
			if(movement == 4){
				xCoord1 += run;
				yCoord1 += rise;
			}
			if(movement ==5){
				xCoord1 += run;
				yCoord1 -= rise;
			}
			if(movement == 6){
				xCoord1 -= run;
				yCoord1 += rise;
			}
			if(movement == 7){
				xCoord1 -= run;
				yCoord1 -= rise;
			}
		}
		if(up1 == false){yCoord1+= rise;}
		if(down1 == false){yCoord1 -= rise;}
		if(right1==false){xCoord1-= run;}
		if(left1==false){xCoord1 += run;}
		
		if(left2== true && right2==true && up2==true && down2==true){
			Random rand = new Random();
			int movement = rand.nextInt(8);
			if(movement == 0){xCoord2 += run;}
			if(movement == 1){xCoord2 -= run;}
			if(movement == 2){yCoord2 += rise;}
			if(movement == 3){yCoord2 -= rise;}
			if(movement == 4){
				xCoord2 += run;
				yCoord2 += rise;
			}
			if(movement ==5){
				xCoord2 += run;
				yCoord2 -= rise;
			}
			if(movement == 6){
				xCoord2 -= run;
				yCoord2 += rise;
			}
			if(movement == 7){
				xCoord2 -= run;
				yCoord2 -= rise;
			}
		}
		if(up2 == false){yCoord2+= rise;}
		if(down2 == false){yCoord2 -= rise;}
		if(right2==false){xCoord2-= run;}
		if(left2==false){xCoord2 += run;}
		
		if(left3== true && right3==true && up3==true && down3==true){
			Random rand = new Random();
			int movement = rand.nextInt(8);
			if(movement == 0){xCoord3 += run;}
			if(movement == 1){xCoord3 -= run;}
			if(movement == 2){yCoord3 += rise;}
			if(movement == 3){yCoord3 -= rise;}
			if(movement == 4){
				xCoord3 += run;
				yCoord3 += rise;
			}
			if(movement ==5){
				xCoord3 += run;
				yCoord3 -= rise;
			}
			if(movement == 6){
				xCoord3 -= run;
				yCoord3 += rise;
			}
			if(movement == 7){
				xCoord3 -= run;
				yCoord3 -= rise;
			}
		}
		if(up3 == false){yCoord3+= rise;}
		if(down3 == false){yCoord3 -= rise;}
		if(right3==false){xCoord3-= run;}
		if(left3==false){xCoord3 += run;}
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		update();
		move();
		repaint();
	}
}
