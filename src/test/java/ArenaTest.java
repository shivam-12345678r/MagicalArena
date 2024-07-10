// src/test/java/ArenaTest.java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ArenaTest {

 @Test
 public void testArenaFight() {
 Player playerA = new Player("Player A", 50, 5, 10);
 Player playerB = new Player("Player B", 100, 10, 5);
 Arena arena = new Arena(playerA, playerB);
 arena.fight();

 assertTrue(playerA.getHealth() == 0 || playerB.getHealth() == 0);
 }
}
