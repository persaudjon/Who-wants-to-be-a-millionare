public class MillionGames
{
     public static void main(String[]args)throws Exception
    {
      int choice;
      System.out.println("Million Game");
      System.out.println("Do you want to load the game? Y or N");

      choice=(char)System.in.read();System.in.read();


      if((choice=='y')||(choice=='Y'))
      {
          Menu();
      }
      else if((choice=='n')||(choice=='N'))
      {
          System.out.println("Not Loading");
      }
      else
      {
          System.out.println("Wrong choice");
      }
    }
    public static void Menu()throws Exception
    {
      int option;
      System.out.println("***********************************************************************");
      System.out.println("***   **   **        **  *****  ******        *****    ****    ***  ***");
      System.out.println("***  *  *  *****  *****  *****  *********  ******  ***  ***  *  **  ***");
      System.out.println("***  ****  *****  *****  *****  *********  ******  ***  ***  *** *  ***");
      System.out.println("***  ****  *****  *****  *****  *********  ******  ***  ***  ****   ***");
      System.out.println("***  ****  **        **    **      ***        ****     ****  *****  ***");
      System.out.println("***********************************************************************");
      System.out.println("***********************************************************************");
      System.out.println("***********      *******  ******   **   ***      **********************");
      System.out.println("**********  *********** ** *****  *  *  ***  **************************");
      System.out.println("**********  **********      ****  ****  ***    ************************");
      System.out.println("**********  ***  ****  ****  ***  ****  ***  **************************");
      System.out.println("***********      ***  ******  **  ****  ***      **********************");
      System.out.println("***********************************************************************");
      System.out.println("***********************************************************************");
      System.out.println("********************** Loading Complete *******************************");
      System.out.println("***********************************************************************");
      System.out.println("*****  ***  ***  ***  ***  ***  ***  ***  ***  ***  ***  **************");
      System.out.println("*****  ***  ***  ***  ***  1 0 0  %  ***  ***  ***  ***  **************");
      System.out.println("*****  ***  ***  ***  ***  ***  ***  ***  ***  ***  ***  **************");
      System.out.println("***********************************************************************");
      System.out.println("a.How to Play?\nb.Play the Game\nc.Exit");

      option=(char)System.in.read();System.in.read();

      if((option=='a')||(option=='A'))
      {
        System.out.println("====================================================================");
          System.out.println("Read Please!!!");
          Rules();
      }
      else if((option=='b')||(option=='B'))
      {
          System.out.println("====================================================================");
          System.out.println("Play Game");
          SignIn();

      }
      else if((option=='c')||(option=='C'))
      {
          System.out.println("Sign Out pls...");
      }
      else
      {
          System.out.println("Wrong Choice");
      }
    }
    public static void Rules()throws Exception
    {
        int returns;
        System.out.println("====================================================================");
        System.out.println("Rules about the game.");
        System.out.println("Generals:");
        System.out.println("1.Once the game start you should answer the question");
        System.out.println("  You should press the 'Enter'key to confirm that your answer\n is your Final Answer");
        System.out.println("2.You cannot out at any time;you'll be credited with the winning");
        System.out.println("  amount of the last question you answered.");
        System.out.println("3.If you answer incorrectly, you only win the amount of the last");
        System.out.println("  milestone you passed");
        System.out.println("4.Milestones are Php 20 000, Php 100 000, Php 500 000, Php 1 000 000");
        System.out.println("5.And don't forget to read what the program outputted to the screen");
        System.out.println("Life Lines:");
        System.out.println("1.At the last three question of the game,You can use Life Line each question.");
        System.out.println("2.The only Life Line you can use is 50:50");
        System.out.println("3.There is three 50:50,automatically removes two incorrect answers. ");
        System.out.println("4.You can only use 1 Life Line in the last three  question.");

        System.out.println("====================================================================");

        System.out.println("Do you want to return at the main menu? Y or N");

        returns=(char)System.in.read();System.in.read();

      if((returns=='y')||(returns=='Y'))
      {
          Menu();
      }
      else if((returns=='n')||(returns=='N'))
      {
          Rules();
      }
      else
      {
          System.out.println("Wrong choice");
      }
    }
    public static void SignIn()throws Exception
    {
        int choice;

        System.out.println("Welcome to Millionaire Game");
        System.out.println("Php 1,000                   Php 100,000  Milestones");
        System.out.println("Php 5,000                   Php 150,000");
        System.out.println("Php 10,000                  Php 250,000");
        System.out.println("Php 20,000  Milestones      Php 500,000  Milestones");
        System.out.println("Php 50,000                  Php 750,000");
        System.out.println("Php 75,000                  Php 900,000");
        System.out.println("\n");
        System.out.println("    *Php  1,000,000  Jackpot*");
        System.out.println("====================================================================");
        System.out.println("Do you want to start the game? Y or N");

      choice=(char)System.in.read();System.in.read();

      if((choice=='Y')||(choice=='y'))
      {

          q1();
      }
      else
      {
        System.out.println("Bye");
      }
    }
    public static void q1()throws Exception
    {
        int a1;
        System.out.println("====================================================================");
        System.out .println("Let's Play\nFor Php 1,000 question");
        System.out .println("In arts,If you combined Red and Blue what is the results?");
        System.out .println("a.Orange    c.Green\nb.Violet    d.Black");

        a1=(char)System.in.read();System.in.read();

        if((a1=='b')||(a1=='B'))
        {
            System.out.println("Congratulations\nYou passed the question worth Php 1000");
            q2();
        }
        else
        {
            System.out.println("Wrong answer\nYou have Php 0");
            System.out.println("The correct answer is letter 'B'");
            End();
        }
    }
    public static void q2()throws Exception
    {
        int a2;
        System.out.println("====================================================================");
        System.out .println("Let's Play\nFor Php 5,000 question");
        System.out .println("In Trigonometry,'csc' is short for?");
        System.out .println("a.Cosine    c.Sine\nb.Tangent  d.Cosecant");

        a2=(char)System.in.read();System.in.read();

        if((a2=='d')||(a2=='D'))
        {
          System.out.println("Congratulations\nYou passed the question worth Php 5000");
          q3();
        }
        else
        {
            System.out.println("Wrong answer\nYou have Php 0");
            System.out.println("The correct answer is letter 'D'");
            End();
        }
    }
    public static void q3()throws Exception
    {
        int a3;
        System.out.println("====================================================================");
        System.out .println("Let's Play\nFor Php 10,000 question");
        System.out .println("Which of these zodiac signs is not represented by \nan animal that grows horns?");
        System.out .println("a.Taurus    c.Capricorn\nb.Aquarius  d.Aries");

      a3=(char)System.in.read();System.in.read();

        if((a3=='b')||(a3=='B'))
        {
          System.out.println("Congratulations\nYou passed the question worth Php 10,000");
          q4();

        }
        else
        {
            System.out.println("Wrong answer\nYou have Php 0");
            System.out.println("The correct answer is letter 'B'");
            End();
        }
    }
    public static void q4()throws Exception
    {
        int a4;
        System.out.println("====================================================================");
        System.out .println("Let's Play\nFor Php 20,000 question");
        System.out .println("How many days are in a leap year?");
        System.out .println("a.366      c.365\nb.369      d.396");

        a4=(char)System.in.read();System.in.read();


      if((a4=='a')||(a4=='A'))
        {
          System.out.println("Congratulations\nYou have a safety money worth Php 20,000");
          q5();
        }
        else
        {
            System.out.println("Wrong answer\nYou have Php 0");
            System.out.println("The correct answer is letter 'A'");
            End();
        }

    }
    public static void q5()throws Exception
    {
        int a5;
        System.out.println("====================================================================");
        System.out .println("Let's Play\nFor Php 50,000 question");
        System.out .println("The names of most continents on Earth begin \nwith which letter of the English alphabet?");
        System.out .println("a.A      c.E\nb.N      d.S");

      a5=(char)System.in.read();System.in.read();

      if((a5=='a')||(a5=='A'))
        {
          System.out.println("Congratulations\nYou passed the question worth Php 50,000");
          q6();
        }
        else
        {
            System.out.println("Wrong answer\nYou have Php 20,000");
            System.out.println("The correct answer is letter 'A'");
            End();
        }
    }
    public static void q6()throws Exception
    {
        int a6;
        System.out.println("====================================================================");
        System.out .println("Let's Play\nFor Php 75,000 question");
        System.out .println("What is the last letter of the Greek alphabet?");
        System.out .println("a.Alpha      c.Sigma\nb.Omega      d.Kappa");

      a6=(char)System.in.read();System.in.read();

      if((a6=='b')||(a6=='B'))

        {
          System.out.println("Congratulations\nYou passed the question worth Php 75,000");
          q7();
        }
        else
        {
            System.out.println("Wrong answer\nYou have Php 20,000");
            System.out.println("The correct answer is letter 'B'");
            End();
        }
    }
    public static void q7()throws Exception
    {
        int a7;
        System.out.println("====================================================================");
        System.out .println("Let's Play\nFor Php 100,000 question");
        System.out .println("What year did Christopher Columbus discover America?");
        System.out .println("a.1521      c.1492\nb.1776      d.1851");

      a7=(char)System.in.read();System.in.read();
      if((a7=='c')||(a7=='C'))

        {
          System.out.println("Congratulations\nYou have now safety money worth Php 100,000");
          q8();
        }
        else
        {
            System.out.println("Wrong answer\nYou have Php 20,000");
            System.out.println("The correct answer is letter 'C'");
            End();
        }
    }
    public static void q8()throws Exception
    {
        int a8;
        System.out.println("====================================================================");
        System.out .println("Let's Play\nFor Php 150,000 question");
        System.out .println("What is 100 percent of 50 percent of 50 percent of 500?");
        System.out .println("a.250      c.125\nb.300      d.500");

      a8=(char)System.in.read();System.in.read();
      if((a8=='c')||(a8=='C'))

        {
          System.out.println("Congratulations\nYou passed the question worth Php 150,000");
          q9();

        }
        else
        {
            System.out.println("Wrong answer\nYou have Php 100,000");
            System.out.println("The correct answer is letter 'C'");
            End();
        }
    }
    public static void q9()throws Exception
    {
        int a9;
        System.out.println("====================================================================");
        System.out .println("Let's Play\nFor Php 250,000 question");
        System.out .println("Tigris and Euphrates are the two major river of what country?");
        System.out .println("a.China      c.Greece\nb.Iraq        d.India");

      a9=(char)System.in.read();System.in.read();
      if((a9=='b')||(a9=='B'))

        {
          System.out.println("Congratulations\nYou passed the question worth Php 250,000");
          q10();
        }
        else
        {
            System.out.println("Wrong answer\nYou have Php 100,000");
            System.out.println("The correct answer is letter 'B'");
            End();
        }
    }
    public static void q10()throws Exception
    {
        int a10;
        System.out.println("====================================================================");
        System.out .println("Let's Play\nFor Php 500,000 question");
        System.out .println("An Italian operatic Tenor singer and also a member of 'The Three Tenors'?");
        System.out .println("a.Chopin      c.Pavarotti\nb.Haskin      d.Carreras");

      a10=(char)System.in.read();System.in.read();
      if((a10=='c')||(a10=='C'))

        {
          System.out.println("Congratulations\nYou have now a safety money worth Php 500,000");
          q11();
        }
        else
        {
            System.out.println("Wrong answer\nYou have Php 100,000");
            System.out.println("The correct answer is letter 'C'");
            End();
        }
    }
    public static void q11()throws Exception
    {
        int a11;
        System.out.println("====================================================================");
        System.out .println("Let's Play\nFor Php 750,000 question");
        System.out .println("In arts, It is a masterpiece of Renaissance sculpture by Michelangelo?");
        System.out .println("a.Mona Lisa      c.The Last Supper\nb.Spolarium      d.Pieta");

        System.out.println("Do you want to use LifeLine?Y or N");

      a11=(char)System.in.read();System.in.read();
      if((a11=='y')||(a11=='Y'))
        {
          Life11();
        }
      else if ((a11=='n')||(a11=='N'))
        {
          Nolife11();
        }
      else
        {
            System.out.println("Wrong Choice");
        }
    }
    public static void q12()throws Exception
    {
        int a12;
        System.out.println("====================================================================");
        System.out .println("Let's Play\nFor Php 900,000 question");
        System.out .println("What kind of flytrap is the name for a carnivorous plant?");
        System.out .println("a.Venus      c.Arriana\nb.Diana      d.Vanessa");

        System.out.println("Do you want to use LifeLine?Y or N");

      a12=(char)System.in.read();System.in.read();
      if((a12=='y')||(a12=='Y'))

        {
          Life12();
        }
        else if ((a12=='n')||(a12=='N'))
        {
          Nolife12();
        }
        else
        {
            System.out.println("Wrong Choice");
        }
    }
    public static void q13()throws Exception
    {
        int a13;
        System.out.println("====================================================================");
        System.out.println("Let's Play\nFor Php 1,000,000 question");
        System.out.println("What is the name of the minor planet rotating around the sun");
        System.out.println("which is located between mars and jupiter it is also called planet 13241.?");
        System.out.println("a.Planet X      c.Ceres\nb.Planet Biyo      d.Corot-7B");

        System.out.println("Do you want to use LifeLine?Y or N");

      a13=(char)System.in.read();System.in.read();
      if((a13=='y')||(a13=='Y'))

        {
          Life13();
        }
        else if((a13=='n')||(a13=='N'))
        {
          Nolife13();
        }
        else
        {
            System.out.println("Wrong Choice");
        }
    }
    public static void Life11()throws Exception
    {
        int a11;
        System.out.println("====================================================================");

        System.out.println("Two of the Three wrong answers have been removed");

        System.out .println("In arts, It is a masterpiece of Renaissance sculpture by Michelangelo?");
        System.out .println("a.Mona Lisa");
        System.out .println("                  d.Pieta");

        a11=(char)System.in.read();System.in.read();
        if((a11=='d')||(a11=='D'))

        {
          System.out.println("Congratulations\nYou passed the question worth Php 750,000");
          q12();
        }
        else
        {
            System.out.println("Wrong answer\nYou have Php 500,000");
            System.out.println("The correct answer is letter 'D'");
            End();
        }

    }
    public static void Nolife11()throws Exception
    {
        int a11;
        System.out.println("====================================================================");

        System.out .println("In arts, It is a masterpiece of Renaissance sculpture by Michelangelo?");
        System.out .println("a.Mona Lisa      c.The Last Supper\nb.Spolarium      d.Pieta");

        a11=(char)System.in.read();System.in.read();
        if((a11=='d')||(a11=='D'))

        {
          System.out.println("Congratulations\nYou passed the question worth Php 750,000");
          q12();
        }
        else
        {
            System.out.println("Wrong answer\nYou have Php 500,000");
            System.out.println("The correct answer is letter 'D'");
            End();
        }
    }
    public static void Life12()throws Exception
    {
        int a12;
        System.out.println("====================================================================");

        System.out.println("Two of the three  wrong answers have been removed");

        System.out .println("What kind of flytrap is the name for a carnivorous plant?");
        System.out .println("a.Venus      c.Arriana");

        a12=(char)System.in.read();System.in.read();
        if((a12=='a')||(a12=='A'))

        {
          System.out.println("Congratulations\nYou passed the question worth Php 900,000");
          q13();
        }
        else
        {
            System.out.println("Wrong answer\nYou have Php 500,000");
            System.out.println("The correct answer is letter 'A'");
            End();
        }
    }
    public static void Nolife12()throws Exception
    {
        int a12;
        System.out.println("====================================================================");

        System.out .println("What kind of flytrap is the name for a carnivorous plant?");
        System.out .println("a.Venus      c.Arriana\nb.Diana      d.Vanessa");

        a12=(char)System.in.read();System.in.read();

      if((a12=='a')||(a12=='A'))
        {
          System.out.println("Congratulations\nYou passed the question worth Php 900,000");
          q13();
        }
        else
        {
            System.out.println("Wrong answer\nYou have Php 500,000");
            System.out.println("The correct answer is letter 'A'");
            End();
        }
    }
    public static void Life13()throws Exception
    {
        int a13;
        System.out.println("====================================================================");

        System.out.println("Two of the three wrong answers have been removed");

        System.out.println("What is the name of the minor planet rotating around the sun");
        System.out.println("which is located between mars and jupiter it is also called planet 13241.?");
        System.out.println("a.Planet X      \nb.Planet Biyo");

        a13=(char)System.in.read();System.in.read();
        if((a13=='b')||(a13=='B'))

        {
          System.out.println("Congratulations\nYou won the jackpot price worth Php 1,000,000");
          End();
        }
        else
        {
            System.out.println("Wrong answer\nYou have Php 500,000");
            System.out.println("The correct answer is letter 'B'");
            End();
        }
    }
        public static void Nolife13()throws Exception
    {
        int a13;
        System.out.println("====================================================================");

        System.out.println("Two of the three wrong answers have been removed");

        System.out.println("What is the name of the minor planet rotating around the sun");
        System.out.println("which is located between Mars and Jupiter it is also called Planet 13241.?");
        System.out.println("a.Planet X      c.Ceres\nb.Planet Biyo    d.Corot-7B");

        a13=(char)System.in.read();System.in.read();
        if((a13=='b')||(a13=='B'))

        {
          System.out.println("Congratulations\nYou won the Jackpot price worth Php 1,000,000");
        }
        else
        {
            System.out.println("Wrong answer\nYou have Php 500,000");
            System.out.println("The correct answer is letter 'B'");
            End();
        }
    }
    public static void End()throws Exception
    {
        int users;
        System.out.println("====================================================================");
        System.out.println("Do you want to Load the Game Again?Y or N");

        users=(char)System.in.read();System.in.read();

        if((users=='y')||(users=='Y'))
        {
            Menu();
        }
        else
        {
            System.out.println("Thank You for Playing");
        }
    }
}




