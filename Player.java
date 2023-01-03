package kirill;


        this.ships = new int[countShips()];
    }
    public class Player {

        private String name;
        private int points = 0;
        private int[][] field;
        private int[] ships;


        public void setName(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public String shoot(int x, int y){
            return "Игрок " + this.name + " решил ударить по ячейке " + x + " " + y;
        }

        public void setPoints() {
            this.points++;
        }

        public int getPoints() {
            return points;
        }

        public void setField(int[][] field) {
            this.field = field;
        }

        public Player(String name, int points, int[][] field) {
            this.name = name;
            this.points = points;
            this.field = field;
            this.ships = new int[countShips()];
        }

        public Player(String name, int points) {
            this.name = name;
            this.points = points;
            this.ships = new int[countShips()];
        }

        public Player(String name) {
            this.name = name;
            this.ships = new int[countShips()];
        }

        public Player(int points) {
            this.points = points;
    private int countShips(){
        int count = 0;
        for (int i = 0; i < GameField.rules.length; i++) {
            count += GameField.rules[i];
        }
        return count;
    }
}