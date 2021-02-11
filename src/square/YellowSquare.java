package square;

import java.awt.*;

public class YellowSquare {
    private static final int TILE_SIZE = 80;
    private int row;
    private int col;
    private Color color;
    private int point;

    public YellowSquare(int row, int col, Color color) {

        this.row = row;
        this.col = col;
        this.color = color;

    }

    public int getRow() {

        return row;
    }

    public int getCol() {

        return col;
    }


    public YellowSquare() {

    }


    public void render(Graphics g) {
        int x = this.col * TILE_SIZE;
        int y = this.row * TILE_SIZE;

        g.setColor(this.color);

    }
}
