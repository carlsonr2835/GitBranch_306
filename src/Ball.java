import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class Ball {
	private static final int BALL_LENGTH = 50;
	private static final int BALL_HEIGHT = 50;
	public void draw(Graphics g, int ballX, int ballY)
	{
		Graphics2D g2 = (Graphics2D) g;
		g2.setColor(Color.red);
		g2.fillOval(ballX, ballY, BALL_LENGTH, BALL_HEIGHT);
		int x = ballX + BALL_LENGTH;
		int y = ballY + BALL_HEIGHT/2;
        int x2 = x + BALL_LENGTH;
		g2.drawString("Bounce!", ballX, ballY+BALL_HEIGHT+40);	
	}
}
