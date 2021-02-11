package game;

import square.RedSquare;
import square.YellowSquare;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;

public class GameBoard extends JFrame implements MouseListener {

    public final int tileSideCount = 8;
    private int Random;

    private Object[][] squareCollection;
    private Object selectedSquare;

    public GameBoard() {

        this.squareCollection = new Object[tileSideCount][tileSideCount];

        //red
        this.squareCollection[Random][Random] = (new RedSquare(Random, Random, Color.RED));
        this.squareCollection[Random][Random] = (new RedSquare(Random, Random, Color.RED));
        this.squareCollection[Random][Random] = (new RedSquare(Random, Random, Color.RED));
        this.squareCollection[Random][Random] = (new RedSquare(Random, Random, Color.RED));


        this.setSize(800, 800);
        this.setVisible(true);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.addMouseListener(this);
    }


    @Override
    public void mouseClicked(MouseEvent mouseEvent) {

    }

    @Override
    public void mousePressed(MouseEvent mouseEvent) {

    }

    @Override
    public void mouseReleased(MouseEvent mouseEvent) {

    }

    @Override
    public void mouseEntered(MouseEvent mouseEvent) {

    }

    @Override
    public void mouseExited(MouseEvent mouseEvent) {

    }

    public void paint(Graphics g) {

        super.paint(g);

        for (int row = 0; row < 8; row++) {


            for (int col = 0; col < 8; col++) {

                this.renderGameTile(g, row, col);
                this.renderGameSquare(g, row, col);
            }

        }
    }




    private Color getTileColor(int row, int col) {

        boolean isRowEven = (row % 2 == 0);
        boolean isRowOdd = !isRowEven;
        boolean isColEven = (col % 2 == 0);
        boolean isColOdd = !isColEven;

        if (isRowEven && isColEven) return Color.GREEN;
        if (isRowEven && isColOdd) return Color.RED;
        if (isRowOdd && isColEven) return Color.RED;
        return Color.GREEN;
    }


    private Object getBoardSquare(int row, int col) {
        return this.squareCollection[row][col];
    }

    private boolean hasBoardSquare(int row, int col){

        return this.getBoardSquare(row, col) != null;
    }

    private void renderGameSquare (Graphics g, int row, int col) {

        if (this.hasBoardSquare(row, col)) {

            YellowSquare y = (YellowSquare) this.getBoardSquare(row, col);
            y.render(g);

        }
    }

        private void renderGameTile (Graphics g,int row, int col){


        }



}
