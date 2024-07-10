// src/main/java/Arena.java
public class Arena {
 private Player player1;
 private Player player2;
 private Dice dice;

 public Arena(Player player1, Player player2) {
 this.player1 = player1;
 this.player2 = player2;
 this.dice = new Dice();
 }

 public void fight() {
 while (player1.isAlive() && player2.isAlive()) {
 Player attacker = player1.getHealth() <= player2.getHealth() ? player1 : player2;
 Player defender = attacker == player1 ? player2 : player1;
 performAttack(attacker, defender);
 if (!defender.isAlive()) {
 System.out.println(defender.getName() + " has died. " + attacker.getName() + " wins!");
 return;
 }
 // Swap roles
 Player temp = attacker;
 attacker = defender;
 defender = temp;
 performAttack(attacker, defender);
 if (!defender.isAlive()) {
 System.out.println(defender.getName() + " has died. " + attacker.getName() + " wins!");
 return;
 }
 }
 }

 private void performAttack(Player attacker, Player defender) {
 int attackRoll = dice.roll();
 int defendRoll = dice.roll();
 int attackDamage = attacker.getAttack() * attackRoll;
 int defendStrength = defender.getStrength() * defendRoll;
 int damage = attackDamage - defendStrength;

 if (damage > 0) {
 defender.reduceHealth(damage);
 System.out.println(attacker.getName() + " attacks " + defender.getName() + " with damage " + damage + ". " + defender.getName() + " health now " + defender.getHealth());
 } else {
 System.out.println(defender.getName() + " successfully defended against " + attacker.getName() + "'s attack.");
 }
 }
}
