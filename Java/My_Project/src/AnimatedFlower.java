import javax.swing.*;
import java.awt.*;
public class AnimatedFlower extends JPanel{
    private int petalSize = 10; // Initial size of petals
    private final int maxPetalSize = 70; // Maximum size for petals
    private boolean showMessage = false; // Flag to control message display

    public static void main(String[] args) {
        JFrame frame = new JFrame("A Flower for Shakchunni ");
        AnimatedFlower flower = new AnimatedFlower();

        frame.add(flower);
        frame.setSize(800, 800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        // Animation loop for petals
        new Timer(50, e -> {
            if (flower.petalSize < flower.maxPetalSize) {
                flower.petalSize += 2; // Gradually increase the petal size
            }
            flower.repaint();
        }).start();

        // Timer to display message after a delay
        new Timer(5000, e -> {
            flower.showMessage = true; // Enable the message after 5 seconds
            flower.repaint();
        }).start();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        drawFlower(g);

        if (showMessage) {
            drawMessage(g);
        }
    }

    private void drawFlower(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        int centerX = getWidth() / 2;
        int centerY = getHeight() / 2;

        // Draw petals
        for (int i = 0; i < 360; i += 45) {
            double angle = Math.toRadians(i);
            int x = centerX + (int) (Math.cos(angle) * petalSize);
            int y = centerY + (int) (Math.sin(angle) * petalSize);

            g2d.setColor(new Color(255, 182, 193)); // Light pink for petals
            g2d.fillOval(x - petalSize / 2, y - petalSize / 2, petalSize, petalSize);
        }

        // Draw flower center
        g2d.setColor(new Color(255, 215, 0)); // Golden yellow for the center
        g2d.fillOval(centerX - 20, centerY - 20, 40, 40);

        // Draw stem
        g2d.setColor(new Color(34, 139, 34)); // Green for the stem
        g2d.fillRect(centerX - 5, centerY + 40, 10, 150);

        // Draw leaves
        g2d.setColor(new Color(50, 205, 50));
        g2d.fillOval(centerX - 50, centerY + 100, 50, 30);
        g2d.fillOval(centerX, centerY + 100, 50, 30);
    }

    private void drawMessage(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;

        // Set font for the message
        g2d.setFont(new Font("Serif", Font.BOLD, 32));
        g2d.setColor(new Color(128, 0, 128)); // Purple color for text

        // Center the message text
        String message = "Areeee DADA KHobor vAloooo Toooo :)";
        FontMetrics metrics = g2d.getFontMetrics();
        int x = (getWidth() - metrics.stringWidth(message)) / 2;
        int y = getHeight() - 100;

        g2d.drawString(message, x, y);
    }
}
