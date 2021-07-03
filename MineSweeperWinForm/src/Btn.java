import javax.swing.*;

public class Btn extends JButton {

    private  int row;
    private  int col;

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getCol() {
        return col;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public boolean isMine() {
        return mine;
    }

    public void setMine(boolean mine) {
        this.mine = mine;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    private  int count;
    private boolean mine;
    private  boolean flag;
    /**
     * Creates a button with no set text or icon.
     */
    public Btn(int row, int col) {

        this.row = row;
        this.col = col;
        this.count = 0;
        this.flag=false;
        this.mine=false;

    }


    /**
     * Creates a button with no set text or icon.
     */



}
