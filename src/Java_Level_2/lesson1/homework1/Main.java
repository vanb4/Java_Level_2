package Java_Level_2.lesson1.homework1;

import Java_Level_2.lesson1.homework1.obstacles.Cross;
import Java_Level_2.lesson1.homework1.obstacles.Obstacle;
import Java_Level_2.lesson1.homework1.obstacles.Wall;
import Java_Level_2.lesson1.homework1.obstacles.Water;
import Java_Level_2.lesson1.homework1.participans.*;

public class Main {
    public static void main(String[] args) {



      Participan[] participans = new Participan []{
              new Dog(  "Bobik", Color.RED.getEnglishColorName()),
              new Cat( "Barsik",  Color.BLACK.getEnglishColorName()),
              new Duck( "Scrooge",  Color.WHITE.getEnglishColorName()),
              new Robot("Wally", Color.GREY.getEnglishColorName())

      };
        Obstacle[] obstacles = new Obstacle[]{
                new Cross(100),
                new Wall(4),
                new Water(20)};

        for(Participan a : participans){
            for(Obstacle o : obstacles){
                o.doIt((Participan) a);
                if (!a.isOnDistance()){
                    break;
                }
             }
        }
        System.out.println("RESULT: ");
        for (Participan a:participans){
            a.info();
        }
    }




}
