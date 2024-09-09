public class InterfaceDemo {
    public static void main(String[] args) {
        Queen q = new Queen();
        q.move();
    }
}

interface ChessPlayer {
    public void move();
}

class Queen implements ChessPlayer {
    public void move() {
        System.out.println("up, down, right, left, diagonal");
    }
}

class Rook implements ChessPlayer {
    public void move() {
        System.out.println("up, down, right, left");
    }
}
