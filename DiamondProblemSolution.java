// --------------------------------  player Class  -------------------------- //
abstract class Player {
    String name;
    abstract public int next();
}

// --------------------------------  HumanPlayer Class  -------------------------- //
class HumanPlayer extends Player {

    @Override
    public int next() {
        System.out.println("Player is Human...");
        return 1;
    }
}

// --------------------------------  NaiveAI Class  -------------------------- //
abstract class NaiveAI extends Player {

    @Override 
    abstract public int next();
}

// --------------------------------  BinarySearch AI Class  -------------------------- //
class BinaySAI extends NaiveAI {
    @Override
    public int next() {
        System.out.println("Player is Binary AI of Naive AI...");
        return 1;
    }
}

// --------------------------------  Super AI Class  -------------------------- //
class SuperAI extends NaiveAI {
    @Override
    public int next() {
        System.out.println("Player is Super AI of Naive AI...");
        return 1;
    }
}

// --------------------------------  Game Class  -------------------------- //
class Game {

    int secret_number;
    int high;
    int low;
    boolean win_flag;
    Player player;

    public Game(Player player) {
        this.player = player;
    }

    public void run() {
        player.next();
        high++;
    }

    public boolean hasWon() {
        return win_flag;
    }
}


// --------------------------------  main Class  -------------------------- //

class Q3 {
    public static void main(String arg[]) {

        Player Human = new HumanPlayer();
        Player BinarySearch = new BinaySAI();
        Player Super = new SuperAI();
        Game H = new Game(Human);               // HumanPlayer object
        Game B = new Game(BinarySearch);        // BinarySearh AI object
        Game S = new Game(Super);               // SuperAI object

        H.run();                // HumanPlayer run
        B.run();                // BinarySearch run
        S.run();                // SuperAI run

    }
}
