package tictactoe;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame window = new JFrame("Igrulya");
        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        window.setSize(800,800);
        window.setLayout(new BorderLayout());
        window.setLocationRelativeTo(null);
        window.setResizable(false);
        TicTacToe game = new TicTacToe();
        window.add(game);
        window.setVisible(true);

    }
}
