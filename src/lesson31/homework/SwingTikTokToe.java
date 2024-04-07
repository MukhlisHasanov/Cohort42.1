package lesson31.homework;

//import lesson11.TicTacToe;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.Panel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class SwingTikTokToe extends JFrame {
    private char[][] table = new char[3][3];

    public static void main(String[] args) {
        new SwingTikTokToe();
    }

    public SwingTikTokToe() throws HeadlessException {
        setTitle("");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(500, 500);
        setLocationRelativeTo(null);

        // TicTacToe initTable();

        Canvas canvas = new Canvas();
        canvas.setBackground(Color.white);
        canvas.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {

                int x = e.getX() / (getWidth() / 3);
                int y = e.getY() / (getHeight() / 3);
                System.out.println("x:" + e.getX() + " y:" + e.getY());
                System.out.println("x:" + x + " y:" + y);
                table[x][y] = 'x';
                canvas.repaint();
            }
        });

        JButton btnInit = new JButton("Init");
        JButton btnExit = new JButton("Exit");

        btnInit.addActionListener(e -> {
        });
        btnExit.addActionListener(e -> System.exit(0));

        Panel btnPanel = new Panel();
        btnPanel.setLayout(new GridLayout());
        btnPanel.add(btnInit);
        btnPanel.add(btnExit);

        add(btnPanel, BorderLayout.SOUTH);
        add(canvas, BorderLayout.CENTER);

        setVisible(true);
    }

    private class Canvas extends JPanel {
        @Override
        public void paint(Graphics g) {
            super.paint(g);
            int width = getWidth();
            int height = getHeight();
            int cellWidth = width / 3;
            int cellHeight = height / 3;
            g.setColor(Color.lightGray);
            g.drawLine(0, 1, width, 1);
            for (int i = 0; i < 2; i++) {
                g.drawLine(0, cellHeight * (i + 1), width, cellHeight * (i + 1));
                g.drawLine(cellWidth * (i + 1), 1, cellWidth * (i + 1), height);
            }
            for (int x = 0; x < 3; x++) {
                for (int y = 0; y < 3; y++) {
                    if (table[x][y] == 'x') {
                        g.setColor(Color.blue);
                        g.drawLine(cellWidth * x, cellHeight * y, cellWidth * (x + 1), cellHeight * (y + 1));
                        g.drawLine(cellWidth * (x + 1), cellHeight * (y), cellWidth * x, cellHeight * (y + 1));
                    }
                    if (table[x][y] == 'o') {
                        g.setColor(Color.red);
                        g.drawOval(cellWidth * x, cellHeight * y, cellWidth, cellHeight);
                    }
                }
            }
        }
    }
}
