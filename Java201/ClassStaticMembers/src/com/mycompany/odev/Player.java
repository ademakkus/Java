package com.mycompany.odev;

public class Player {

    int health=100;
    static int numberOfPlayers=0;
      public Player(){

          numberOfPlayers++;
      }
      void life(){
          health=100;
      }
      void attack(){
          health--;
      }
      void setNumberOfPlayers(){
          System.out.println(numberOfPlayers);
      }
}

