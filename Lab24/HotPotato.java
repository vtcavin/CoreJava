package Lab24;
import java.util.LinkedList;
import java.util.Queue;
public class HotPotato {
	public static void main(String[] args) {
        Queue<String> playersQueue = new LinkedList<>();
        playersQueue.add("Player1");
        playersQueue.add("Player2");
        playersQueue.add("Player3");
        playersQueue.add("Player4");
        int rounds = 5;
        for (int i = 1; i <= rounds; i++) {
            System.out.println("Round " + i + ": Music playing...");
            for (int j = 0; j < playersQueue.size() - 1; j++) {
                String currentPlayer = playersQueue.poll();
                System.out.println("Passing the potato from " + currentPlayer + " to next player");
                playersQueue.add(currentPlayer);
            }
            String eliminatedPlayer = playersQueue.poll();
            System.out.println("Music stops " + eliminatedPlayer + " is out");
            playersQueue.add(eliminatedPlayer);
            System.out.println("Remaining players: " + playersQueue);
            System.out.println();
        }
        System.out.println("The winner is: " + playersQueue.poll());
    }
}
