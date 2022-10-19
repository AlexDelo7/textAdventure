import java.util.*;

public class Player
{
  String name;
  int health=100;
  double gold=10;
  int strength=2;
  int monstersDefeated;

  public Player(String playerName, int startingHealth, double startingGold,int startStrength)
  {
    startingHealth= health;
    startingGold = gold;
    playerName=name;
    startStrength=strength;

  }

  public String getName()
  {
    return name;
  }

  public void changeName(String newName)
  {
    // ADD CODE HERE
  }

  public int getHealth()
  {
    return health;
  }

  public void setHealth(int newHealth)
  {
    health=health+newHealth;
  }

  public double getGold()
  {
    return gold;
  }

  public void setGold(double newAmount)
  {
    gold=gold+newAmount;
  }

  public int getMonstersDefeated()
  {
    return monstersDefeated;
  }

  public void defeatMonster()
  {
    // ADD CODE HERE
  }
}