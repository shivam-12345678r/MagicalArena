// src/test/java/PlayerTest.java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PlayerTest {

 @Test
 public void testPlayerInitialization() {
 Player player = new Player("Test Player", 50, 5, 10);
 assertEquals("Test Player", player.getName());
 assertEquals(50, player.getHealth());
 assertEquals(5, player.getStrength());
 assertEquals(10, player.getAttack());
 }

 @Test
 public void testPlayerHealthReduction() {
 Player player = new Player("Test Player", 50, 5, 10);
 player.reduceHealth(20);
 assertEquals(30, player.getHealth());
 player.reduceHealth(40);
 assertEquals(0, player.getHealth());
 }
}