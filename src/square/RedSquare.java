package square;

import java.awt.*;

public class RedSquare {
    private static final int TILE_SIZE = 80;
    private int row;
    private int col;
    private Color color;
    private int point;

    public RedSquare(int row, int col, Color color) {

        this.row = row;
        this.col = col;
        this.color = color;

    }

    public int getRow (){

        return row;
    }

    public int getCol (){

        return col;
    }



    public RedSquare() {

    }
}
