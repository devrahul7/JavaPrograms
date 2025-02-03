// simple concepts utilization by rahul
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class HillClimber extends JFrame {
    GamePanel game;
    
    public HillClimber() {
        game = new GamePanel();
        this.add(game);
        this.setTitle("Hill Climber");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }
    
    public static void main(String[] args) {
        new HillClimber();
    }
}

class GamePanel extends JPanel implements ActionListener {
    static final int GAME_WIDTH = 800;
    static final int GAME_HEIGHT = 600;
    static final Dimension SCREEN_SIZE = new Dimension(GAME_WIDTH, GAME_HEIGHT);
    
    int carX = 50;
    int carY = 300;
    double velocityX = 0;
    double velocityY = 0;
    boolean isJumping = true;
    int score = 0;
    Timer gameTimer;
    
    GamePanel() {
        this.setPreferredSize(SCREEN_SIZE);
        this.setBackground(new Color(135, 206, 235)); // Sky blue
        this.setFocusable(true);
        this.addKeyListener(new AL());
        
        gameTimer = new Timer(16, this); // About 60 FPS
        gameTimer.start();
    }
    
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2d = (Graphics2D)g;
        
        // Draw ground
        g2d.setColor(new Color(34, 139, 34)); // Forest green
        for(int i = 0; i < GAME_WIDTH/20; i++) {
            int height = 100 + (int)(Math.sin(i * 0.5) * 50);
            g2d.fillRect(i*20, GAME_HEIGHT-height, 20, height);
        }
        
        // Draw car
        g2d.setColor(Color.RED);
        g2d.fillRect(carX, carY, 40, 20); // Car body
        g2d.setColor(Color.BLACK);
        g2d.fillOval(carX, carY+15, 15, 15); // Left wheel
        g2d.fillOval(carX+25, carY+15, 15, 15); // Right wheel
        
        // Draw score
        g2d.setColor(Color.BLACK);
        g2d.setFont(new Font("Arial", Font.BOLD, 20));
        g2d.drawString("Score: " + score, 20, 30);
    }
    
    public void move() {
        // Apply gravity
        if(isJumping) {
            velocityY += 0.5;
        }
        
        // Update position
        carX += velocityX;
        carY += velocityY;
        
        // Ground collision
        int groundHeight = GAME_HEIGHT - (100 + (int)(Math.sin((carX/20) * 0.5) * 50));
        if(carY + 30 > groundHeight) {
            carY = groundHeight - 30;
            velocityY = 0;
            isJumping = false;
        } else {
            isJumping = true;
        }
        
        // Apply friction
        velocityX *= 0.98;
        
        // Update score
        score = Math.max(score, carX / 10);
        
        // Keep car in bounds
        if(carX < 0) {
            carX = 0;
            velocityX = 0;
        }
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        move();
        repaint();
    }
    
    public class AL extends KeyAdapter {
        @Override
        public void keyPressed(KeyEvent e) {
            if(e.getKeyCode() == KeyEvent.VK_RIGHT) {
                velocityX = Math.min(velocityX + 1, 10);
            }
            if(e.getKeyCode() == KeyEvent.VK_LEFT) {
                velocityX = Math.max(velocityX - 1, -10);
            }
            if(e.getKeyCode() == KeyEvent.VK_SPACE && !isJumping) {
                velocityY = -10;
                isJumping = true;
            }
        }
    }
}
