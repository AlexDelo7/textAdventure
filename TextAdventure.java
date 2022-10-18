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

    ourHero = new Player("Bob", 100, 10);
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
     location = inScanner.nextLine();
     location = location.toLowerCase();
    if(location == "city"){
    enterZone1();

    }else if(location == "forest"){
    enterZone2();

    }else if(location == "mountains"){
      enterZone3();

    }else if(location == "look"){
      if(dark == true){
        System.out.println("Its too dark to see anything interesting");
      }else{
        System.out.println("You see some mountains in the distance");

      }

    }else if(location == "nap"){
      System.out.println("You go back to sleep for a little while it is now night");
      dark = true;

    }else{
      System.out.println("You seem confused what would you like to do?");

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
    while(l1 !="graveyard"||l1!="blacksmith")
    {
      System.out.println("What would you like to do?");

     l1 = inScanner.nextLine();
     l1 = l1.toLowerCase();
    if(l1 == "graveyard"){
    enterZone4();

    }else if(l1 == "blacksmith"){
    enterZone5();

    }else if(l1 == "walk"){
      if(counter<=3){
      System.out.println("you walk further into the city and dont see much of intrest");
      counter++;
      }else if(counter<5){
        System.out.println("you keep walking further into the city but you countinue to find nothing of intrest");

      }else if(counter<=7){
        System.out.println("you keep walking even further into the city but you kept walking straight into a wall");

      }else if(counter >=10){
        System.out.println("you keep walking into the wall enough times to which you have collapsed on the floor out of pain and exshaughtion\nYou made it your mission to walk as far as you could and never stop walking unfortunatley you didnt acount for walls");
        ourHero.health=0;

      }

    }else{
      System.out.println("You seem confused what would you like to do?");

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
    // change image
    // ADD CODE HERE

    // describe the area/situation to the user. 
    // Give them options for choices.
    // ADD CODE HERE

    // Take action or go to another zone based on their choice
    // ADD CODE HERE
    
  }

  private void enterZone5()
  {
    // change image
    // ADD CODE HERE

    // describe the area/situation to the user. 
    // Give them options for choices.
    // ADD CODE HERE

    // Take action or go to another zone based on their choice
    // ADD CODE HERE
    
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