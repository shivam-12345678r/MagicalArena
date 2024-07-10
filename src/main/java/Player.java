// src/main/java/Player.java
public class Player {
 private String name;
 private int health;
 private int strength;
 private int attack;

 public Player(String name, int health, int strength, int attack) {
 this.name = name;
 this.health = health;
 this.strength = strength;
 this.attack = attack;
 }

 public String getName() {
 return name;
 }

 public int getHealth() {
 return health;
 }

 public int getStrength() {
 return strength;
 }

 public int getAttack() {
 return attack;
 }

 public void reduceHealth(int damage) {
 this.health -= damage;
 if (this.health < 0) this.health = 0;
 }

 public boolean isAlive() {
 return this.health > 0;
 }

 @Override
 public String toString() {
 return String.format("%s: Health=%d, Strength=%d, Attack=%d", name, health, strength, attack);
 }
}