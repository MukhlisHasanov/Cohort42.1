package lesson31.homework;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

/**
 * AIT-TR, cohort 42.1, Java Basic, Homework #31
 * @author Mukhlis Hasanov
 * @version 07-Apr-24
 */
public class Homework31 extends JFrame {
    private Random random;
    private final Color[] COLORS = {Color.red, Color.green, Color.blue, Color.yellow, Color.magenta};
    private int SHAPE_COUNT = 100;
    private enum ShapeForm {
        CIRCLES, RECTANGLES, TRIANGLES
    }
    private ShapeForm shapeForm;

    public static void main(String[] args) {
        new Homework31();
    }

    public Homework31()  {
        setTitle("Hello, Swing!");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(500, 500);
        setLocationRelativeTo(null);

        random = new Random();

        Canvas canvas = new Canvas();
        canvas.setBackground(Color.white);

        JButton btnCircles = new JButton("Circles");
        JButton btnRectangles = new JButton("Rectangles");
        JButton btnTriangles = new JButton("Triangles");
        JButton btnExit = new JButton("Exit");

        btnCircles.addActionListener(e -> {
            shapeForm = ShapeForm.CIRCLES;
            canvas.repaint();
        });

        btnRectangles.addActionListener(e -> {
            shapeForm = ShapeForm.RECTANGLES;
            canvas.repaint();
        });

        btnTriangles.addActionListener(e -> {
            shapeForm = ShapeForm.TRIANGLES;
            canvas.repaint();
        });

        btnExit.addActionListener(e -> System.exit(0));

        Panel btnPanel = new Panel();
        btnPanel.setLayout(new GridLayout());
        btnPanel.add(btnCircles);
        btnPanel.add(btnRectangles);
        btnPanel.add(btnTriangles);
        btnPanel.add(btnExit);

        add(btnPanel, BorderLayout.SOUTH);
        add(canvas, BorderLayout.CENTER);

        setVisible(true);
    }

    private class Canvas extends JPanel {
        @Override
        public void paint(Graphics g) {
            super.paint(g);
            for (int i = 0; i < SHAPE_COUNT; i++) {
                switch (shapeForm) {
                    case CIRCLES: {
                        int d = random.nextInt(20) + 60;
                        int x = random.nextInt(getWidth() - d);
                        int y = random.nextInt(getHeight() - d);
                        Color color = COLORS[random.nextInt(COLORS.length)];
                        g.setColor(color);
                        g.fillOval(x, y, d, d);
                        g.setColor(Color.black);
                        g.drawOval(x, y, d, d);
                        break;
                    }
                    case RECTANGLES: {
                    int width = random.nextInt(20) + 60;
                    int height = random.nextInt(20) + 60;
                    int x = random.nextInt(getWidth() - width);
                    int y = random.nextInt(getHeight() - height);
                    Color color = COLORS[random.nextInt(COLORS.length)];
                    g.setColor(color);
                    g.fillRect(x, y, width, height);
                    g.setColor(Color.black);
                    g.drawRect(x, y, width,height);
                    break;
                }
                    case TRIANGLES: {
                        int length = random.nextInt(20) + 80;
                        int h = (int) (length * Math.sqrt(3) / 2);
                        int x1 = random.nextInt(getWidth() - length);
                        int y1 = random.nextInt(getHeight() - h);

                        // Determine the random direction of the base
                        boolean baseToRight = random.nextBoolean(); // true - вправо, false - влево

                        // Determine the coordinates of the vertices of the triangle depending on the direction of the base
                        int x2, y2, x3, y3;
                        if (baseToRight) {
                            x2 = x1 + length;
                            y2 = y1 + h;
                            x3 = x1 + length / 2;
                            y3 = y1;
                        } else {
                            x2 = x1;
                            y2 = y1 + h;
                            x3 = x1 + length / 2;
                            y3 = y1;
                        }

                        int[] xPoints = {x1, x2, x3}; // Array with x coordinates of vertices
                        int[] yPoints = {y1, y2, y3}; // Array with y coordinates of vertices

                        Color color = COLORS[random.nextInt(COLORS.length)];
                        g.setColor(color);
                        g.fillPolygon(xPoints, yPoints, 3); // 3 - number of triangle vertices
                        g.setColor(Color.black);
                        g.drawPolygon(xPoints, yPoints, 3);
                        break;
                    }
                }
            }
        }
    }
}