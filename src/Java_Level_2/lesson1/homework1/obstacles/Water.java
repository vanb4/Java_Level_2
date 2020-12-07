package Java_Level_2.lesson1.homework1.obstacles;

import Java_Level_2.lesson1.homework1.participans.Animal;
import Java_Level_2.lesson1.homework1.participans.Participan;
import Java_Level_2.lesson1.homework1.participans.Swimable;

public class Water extends Obstacle {
    private  int lenght;

    public Water(int lenght) {
        this.lenght = lenght;

    }

    @Override
    public void doIt(Participan a) {
        if (a instanceof Swimable){
            ((Swimable)a).swim(lenght);
        } else {
            System.out.println(a.getColor()+" "+ a.getType() + " " + a.getName() + " -Can't swim!");
            a.setOnDistance(false);
        }

    }
}
