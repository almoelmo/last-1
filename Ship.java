package kirill;

public class Ship {

    static public String one = "oneFloor";
    static public String two = "twoFloor";
    static public String three = "threeFloor";
    static public String four = "fourFloor";

    private int size;
    private String name;
    private String player;

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

    public Ship(int size, String name, String player) {
        this.size = size;
        this.name = name;
        this.player = player;
    }

    public Ship(int size, String player) {
        this.size = size;
        this.player = player;
    }

    public Ship(String name, String player) {
        this.name = name;
        this.player = player;
    }
}
