import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MineSweeper implements MouseListener {
    JFrame frame;
    Btn[][] board=new Btn[10][10];
    int openedButtons;
    public MineSweeper() {
        openedButtons=0;
         frame=new JFrame("Minesweeper Game");
         Dimension screenSize=Toolkit.getDefaultToolkit().getScreenSize();
    int height=screenSize.height;
    int width=screenSize.width;

    frame.setSize(width/2,height/2);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setLayout(new GridLayout(10,10));
        for (int row = 0; row <board.length ; row++) {
            for (int col = 0; col <board[0].length ; col++) {
                Btn newBtn=new Btn(row,col);
              newBtn.addMouseListener(this);
frame.add(newBtn);
board[row][col]=newBtn;
            }
        }
        generateMine();
        updateCount();
        //print();
      //  printMine();
    frame.setVisible(true);
    }

    private void updateCount() {
        for (int row = 0; row <board.length ; row++) {
            for (int col = 0; col <board[0].length ; col++) {
                if(board[row][col].isMine()){
                    counting(row,col);
                }
            }
        }
    }
public void open(int row,int col){
 if(row<0||row>=board.length||col<0||col>= board[0].length||board[row][col].getText().length()>0||board[row][col].isEnabled()==false)
     return;
 else if(board[row][col].getCount()!=0){
     board[row][col].setText(board[row][col].getCount()+"");
     board[row][col].setEnabled(false);
     openedButtons++;
 }
 else{
     openedButtons++;
     board[row][col].setEnabled(false);
     open(row-1,col);
     open(row+1,col);
     open(row,col-1);
     open(row,col+1);

 }
}
    private void counting(int row, int col) {

        for (int i = row-1; i <=row+1 ; i++) {
            for (int j = col-1; j <=col+1 ; j++) {
               try {
                   int value=board[i][j].getCount();
                   board[i][j].setCount(++value);
               }
               catch (Exception exc){

               }
            }
        }
    }

    private void print() {
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[0].length; col++) {
                if (board[row][col].isMine()) {
                    board[row][col].setIcon(new ImageIcon("mine.png"));
                } else {
                    board[row][col].setText(board[row][col].getCount() + "");
                    board[row][col].setEnabled(false);
                }
            }
        }
    }
    public void printMine(){
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[0].length; col++) {
                if (board[row][col].isMine()) {
                    board[row][col].setIcon(new ImageIcon("mine.png"));
                }
            }
        }
    }
    private void generateMine() {
        int i=0;
        while(i<10){
            int randRow= (int) (Math.random()* board.length);
            int randCol= (int) (Math.random()* board[0].length);
            while(board[randRow][randCol].isMine()){
                randRow= (int) (Math.random()* board.length);
                randCol= (int) (Math.random()* board[0].length);
            }
            board[randRow][randRow].setMine(true);
            i++;
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
    Btn btn= (Btn) e.getComponent();

        if(e.getButton()==1)
            if(btn.isMine())
            {
                JOptionPane.showMessageDialog(frame,"Mayına bastınız. Oyun bitti!");
            print();
            }
        else {
            open(btn.getRow(), btn.getCol());
            if(openedButtons== board.length* board[0].length-10){
             JOptionPane.showMessageDialog(frame,"Tebrikler Kazandınız.");
                print();
                }
            }
    else if(e.getButton()==3)
        System.out.println("right clicked");
    if(!btn.isFlag()){
        btn.setIcon(new ImageIcon("flag.png"));
    }
    else
    {
        btn.setIcon(null);
    }
        btn.setFlag(true);

    }

    /**
     * Invoked when a mouse button has been pressed on a component.
     *
     * @param e the event to be processed
     */
    @Override
    public void mousePressed(MouseEvent e) {

    }

    /**
     * Invoked when a mouse button has been released on a component.
     *
     * @param e the event to be processed
     */
    @Override
    public void mouseReleased(MouseEvent e) {

    }

    /**
     * Invoked when the mouse enters a component.
     *
     * @param e the event to be processed
     */
    @Override
    public void mouseEntered(MouseEvent e) {

    }

    /**
     * Invoked when the mouse exits a component.
     *
     * @param e the event to be processed
     */
    @Override
    public void mouseExited(MouseEvent e) {

    }
}
