package kirill;

public class GameField {

    private int[][] field = new int[10][10];
    private String player;

    //static public String[] rules = {"Однопалубные в количестве 4", "Двухпалубные в количестве 3", "Трехпалубные в количестве 2", "Четырехпалубные в количестве 1",};
    static public int[] rules = {4, 3, 2, 1};

    public GameField(String player) {
        this.player = player;
    }

    public void changeStatusAddShip(int x, int y, int status){
        field[x - 1][y - 1] = status;
    }

    public void changeStatusEnemyMiss(int x, int y, int status){
        field[x - 1][y - 1] = status;
    }

    public void changeStatusEnemyHit(int x, int y, int status){
        field[x - 1][y - 1] = status;
    }

    public void changeStatusEnemyKill(int x, int y, int status){
        field[x - 1][y - 1] = status;
    }

    public void printField(){
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(field[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
