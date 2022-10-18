import java.util.*;

public class TextAdventure 
{
  FancyConsole console;
  Scanner inScanner;
  Player ourHero;

  public TextAdventure()
  {
    console = new FancyConsole("Great Text Adventure!", 600, 600);
    inScanner = new Scanner(System.in);

    ourHero = new Player("Bob", 100, 10,1);
  }

  public void play()
  {
    String input;
    console.setImage("distantcity.jpg");

    System.out.println("What is your name?\n");
    input = inScanner.nextLine();
    ourHero.name=input;

    System.out.println("You wake up to find yourself on the edge of a shadowy forest with the sun nearly set.\nYou see what looks like a city in the distance. \nWhat would you like to do? \ncity: go towards the city\nforest: turn around and re-enter the forest\nlook: look around further to see what else is around\nnap: go back to sleep\n" + ourHero.getName() + ": ");
    String location = "";
    boolean dark = false;
    while((!(location.equals("mountains")) && (!(location.equals("city"))) && (!(location.equals("forest")))))
    {
      System.out.println("what would you like to do?");
     location = inScanner.nextLine();
     location = location.toLowerCase();
    if(location.equals("city")){
    enterZone1();

    }else if(location.equals("forest")){
    enterZone2();

    }else if(location.equals("mountains")){
      enterZone3();

    }else if(location.equals("look")){
      if(dark == true){
        System.out.println("Its too dark to see anything interesting");
      }else{
        System.out.println("You see some mountains in the distance");

      }

    }else if((location.equals("nap"))){
      System.out.println("You go back to sleep for a little while it is now night");
      dark = true;

    }else{
      System.out.println("You seem confused ");

    }

    }
    if(ourHero.health==0){
      gameEnd();
    }
  }
  private void enterZone1()
  {
    String l1="";
    console.setImage("distantcity.jpg");
    System.out.println("You enter the city and you see several things to do\ngraveyard:go to graveyard\nblacksmith:enter blacksmith\nwalk:keep walking");
    int counter=0;
    while((!(l1.equals("blacksmith")) && (!(l1.equals("graveyard")))))
    {
      System.out.println("what would you like to do?");
     l1 = inScanner.nextLine();
     l1 = l1.toLowerCase();
    if(l1.equals("graveyard")){
    enterZone4();

    }else if(l1.equals("blacksmith")){
    enterZone5();

    }else if(l1.equals("walk")){
      counter++;
      if(counter<=3){
      System.out.println("you walk further into the city and dont see much of intrest");
      }else if(counter<5){
        System.out.println("you keep walking further into the city but you countinue to find nothing of intrest");

      }else if(counter<=7){
        System.out.println("you keep walking even further into the city but you kept walking straight into a wall");

      }else if(counter >=10){
        System.out.println("you keep walking into the wall enough times to which you have collapsed on the floor out of pain and exshaughtion\nYou made it your mission to walk as far as you could and never stop walking unfortunatley you didnt acount for walls");
        ourHero.health=0;

      }
    }else{
      System.out.println("You seem confused");

    }

    }
  }
    

  

  private void enterZone2()
  {
    console.setImage("forest.jpg");


    
  }

  private void enterZone3()
  {
    console.setImage("mountains.jpg");

  }

  private void enterZone4()
  {
    System.out.println("You enter the graveyard "); 
    
  }

  private void enterZone5()
  {
   System.out.println("welcome to my blacksmith shop would you like something\naxe +10 strength - 10 gold\nsword +5 strength -5 gold\nspear +20 strength - 50 gold\ncity:Go back to city");
  String item = "";
   while((!(item.equals("city"))))
   {
     System.out.println("what would you like to do?");
    item = inScanner.nextLine();
    item = item.toLowerCase();
   if(item.equals("axe")){
    if(ourHero.gold>=10){
   ourHero.strength=ourHero.strength+10;
   ourHero.gold=ourHero.gold - 10;
    }else{
      System.out.print("You dont have enough money");
      System.out.println("your gold");
         System.out.println(ourHero.gold);
    }

   }else if(item.equals("sword")){
    if(ourHero.gold>=5){
      ourHero.strength=ourHero.strength+5;
      ourHero.gold=ourHero.gold - 5;
       }else{
         System.out.print("You dont have enough money");
         System.out.println("your gold");
         System.out.println(ourHero.gold);
       }

   }else if(item.equals("spear")){
    if(ourHero.gold>=50){
      ourHero.strength=ourHero.strength+20;
      ourHero.gold=ourHero.gold - 50;
       }else{
         System.out.print("You dont have enough money");
         System.out.println("your gold");
         System.out.println(ourHero.gold);
       }
   }else if(item.equals("city")){
    enterZone1();

  }else{
     System.out.println("You seem confused ");

   }

   }
  }

  private void enterZone6()
  {
    // change image
    // ADD CODE HERE

    // describe the area/situation to the user. 
    // Give them options for choices.
    // ADD CODE HERE

    // Take action or go to another zone based on their choice
    // ADD CODE HERE
    
  }

  private void gameEnd()
  {
    System.out.println("You died\ntry again next time");

    inScanner.close();
  }
}