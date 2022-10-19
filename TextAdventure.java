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
    while((!(location.equals("mountain")) && (!(location.equals("city"))) && (!(location.equals("forest")))))
    {
      System.out.println("what would you like to do?");
     location = inScanner.nextLine();
     location = location.toLowerCase();
    if(location.equals("city")){
    enterZone1();

    }else if(location.equals("forest")){
    enterZone2();

    }else if(location.equals("mountain")){
      enterZone3();

    }else if(location.equals("look")){
      if(dark == true){
        System.out.println("Its too dark to see anything interesting");
      }else{
        System.out.println("You see some mountains in the distance\nmountain:Go to the mountains");

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
    console.setImage("city.jpg");
    System.out.println("You enter the city and you see several things to do\ngraveyard:go to graveyard\nblacksmith:enter blacksmith\nwalk:keep walking\nforest:Turn back to the forest");
    int counter=0;
    while((!(l1.equals("graveyard")) && (!(l1.equals("blacksmith"))) && (!(l1.equals("forest")))))
    {
      System.out.println("what would you like to do?");
     l1 = inScanner.nextLine();
     l1 = l1.toLowerCase();
    if(l1.equals("graveyard")){
    enterZone4();

    }else if(l1.equals("blacksmith")){
    enterZone5();

  }else if(l1.equals("forest")){
    enterZone2();

    } else if(l1.equals("walk")){
      counter++;
      if(counter<=3){
      System.out.println("you walk further into the city and dont see much of intrest");
      }else if(counter<5){
        System.out.println("you keep walking further into the city but you countinue to find nothing of intrest");

      }else if(counter<=9){
        System.out.println("you keep walking even further into the city but you kept walking straight into a wall");

      }else if(counter >=10){
        System.out.println("you keep walking into the wall enough times to which you have collapsed on the floor out of pain and exshaughtion\nYou made it your mission to walk as far as you could and never stop walking unfortunatley you didnt acount for walls");
        ourHero.health=0;

      }
    }else{
      System.out.println("You seem confused");

    }

    }
  
  if(ourHero.health==0){

    gameEnd();
  }
  }
    

  

  private void enterZone2()
  {
    console.setImage("forest.jpg");

    System.out.println("You enter the Forest "); 
    String l3="";
    System.out.println("You walk throughthe forest and see several things. You see a sword in a tree stump, and some mountains\ncity:Go to the city\nmountain:Go to the city\nsword:Try to take the sword");
    while((!(l3.equals("city")) && (!(l3.equals("mountains")))))
    {
      System.out.println("what would you like to do?");
     l3 = inScanner.nextLine();
     l3= l3.toLowerCase();
    if(l3.equals("city")){
    enterZone1();

    }else if(l3.equals("mountain")){
    enterZone3();

    }else if(l3.equals("sword")){
    System.out.println("You walk over to the sword and atempt to pull it out");
     if(ourHero.strength>=10){
      ourHero.strength=ourHero.strength + 100;
      System.out.println("You put you hands on the sword grip and rip in out of the tree stump as you lift it you feel imense power surge through your body");

     }else{
      System.out.println("You atempot to pull the sword but fall down because its too hard to pull out");
      System.out.println("Your Strength");
      System.out.println(ourHero.strength);


     }
      
    }else{
      System.out.println("You seem confused");

    }

    }


    
  }

  private void enterZone3()
  {
    console.setImage("mountains.png");
    System.out.println("You enter the mountain "); 
    String l5="";
    System.out.println("You enter the mountain to see not much of intrest other than a campfire with rustic old looking armor siting near it and a cave  opening nearby\ncave:enter the cave\nforest:go to the forest below\narmor:take the armor");
    while((!(l5.equals("cave")) && (!(l5.equals("forest")))))
    {
      System.out.println("what would you like to do?");
     l5 = inScanner.nextLine();
     l5= l5.toLowerCase();
    if(l5.equals("cave")){
    enterZone6();

    }else if(l5.equals("forest")){
    enterZone2();

    }else if(l5.equals("armor")){
    System.out.println("You walk over to the campfire and take the armor sitting nearby its a great fit and you feel more protected");
    ourHero.health=ourHero.health+50;
      System.out.println("your health");
         System.out.println(ourHero.health);
      
    }else{
      System.out.println("You seem confused");

    }

    }
    

  }

  private void enterZone4()
  {
    console.setImage("graveyard.jpg");

    System.out.println("You enter the graveyard "); 
    String l2="";
    System.out.println("You enter the graveyard and see a crate thats barely in tact and doot that seem to lead into some sort of cave and and entrance back to the city\ncity:Go back to the city\ncrate:Investigate the crate\ndoor:Enter the door");
    while((!(l2.equals("city")) && (!(l2.equals("door")))))
    {
      System.out.println("what would you like to do?");
     l2 = inScanner.nextLine();
     l2= l2.toLowerCase();
    if(l2.equals("door")){
    enterZone6();

    }else if(l2.equals("city")){
    enterZone1();

    }else if(l2.equals("crate")){
    System.out.println("You walk over to the crate and smash it open with your fists\nYou see achest inside the crate\nYou open the chest and you take 20 gold out of it");
    ourHero.gold=ourHero.gold+20;
      System.out.println("your gold");
         System.out.println(ourHero.gold);
         console.setImage("treasure.jpg");

      
    }else{
      System.out.println("You seem confused");

    }

    }
    
  }

  private void enterZone5()
  {
    console.setImage("blacksmith.jpg");
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
   System.out.println("Here you go");
      System.out.println("your gold");
         System.out.println(ourHero.gold);
    }else{
      System.out.print("You dont have enough money");
      System.out.println("your gold");
         System.out.println(ourHero.gold);
    }

   }else if(item.equals("sword")){
    if(ourHero.gold>=5){
      ourHero.strength=ourHero.strength+5;
      ourHero.gold=ourHero.gold - 5;
      System.out.println("Here you go");
      System.out.println("your gold");
         System.out.println(ourHero.gold);
       }else{
         System.out.print("You dont have enough money");
         System.out.println("your gold");
         System.out.println(ourHero.gold);
       }

   }else if(item.equals("spear")){
    if(ourHero.gold>=50){
      ourHero.strength=ourHero.strength+20;
      ourHero.gold=ourHero.gold - 50;
      System.out.println("Here you go");
      System.out.println("your gold");
         System.out.println(ourHero.gold);
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
    console.setImage("cave.jpg");

    System.out.println("You enter the cave "); 
    String l4="";
    System.out.println("You walk in the cave and see a shiny barrel and a agressive monster \nmountain:go to the mountain\ngraveyard:Go to the graveyard\ncrate:Investigate the crate\nmonster:fight the monster\nbarrel:search the barrel");
    int monsterHealth=100;
    int monsterStrength=5;
    int monsterA=0;
    while((!(l4.equals("graveyard")) && (!(l4.equals("mountain")))))
    {
      System.out.println("what would you like to do?");
     l4 = inScanner.nextLine();
     l4= l4.toLowerCase();
    if(l4.equals("graveyard")){
    enterZone4();

    }else if(l4.equals("mountain")){
    enterZone1();

    }else if(l4.equals("monster")){
      console.setImage("zombie.png");

    while(monsterHealth>0){
      monsterA=(int) (Math.random()*2);
      if (monsterA==1){
        ourHero.health=ourHero.health-monsterStrength;
        System.out.println("your health");
           System.out.println(ourHero.health);
      }else{
        System.out.println("The monster attacked and missed");

            
           }
           monsterHealth=monsterHealth-ourHero.strength;
           System.out.println("Monsters health");
           System.out.println(monsterHealth);



    }
    if(monsterHealth<0){
      System.out.println("You killed the monster you win");
    }
    }else if(l4.equals("barrel")){
      System.out.println("You walk over to the barrel and open it\nYou see a 200 gold at the bottom inside the crate\nYou open the chest and you take 200 gold out of it");
      ourHero.gold=ourHero.gold+200;
        System.out.println("your gold");
           System.out.println(ourHero.gold);
      
    }else{
      System.out.println("You seem confused");

    }

    }
 
}
private void gameEnd()
{
  System.out.println("You died\ntry again next time");

  inScanner.close();
}
}