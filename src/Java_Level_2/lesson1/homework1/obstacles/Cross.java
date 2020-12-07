package Java_Level_2.lesson1.homework1.obstacles;

import Java_Level_2.lesson1.homework1.participans.Animal;
import Java_Level_2.lesson1.homework1.participans.Jumpable;
import Java_Level_2.lesson1.homework1.participans.Participan;
import Java_Level_2.lesson1.homework1.participans.Walkable;

public class Cross extends Obstacle {
    private  int lenght;

    public Cross (int lenght) {
        this.lenght = lenght;

    }

    @Override
    public void doIt(Participan a) {
        if (a instanceof Walkable) {
            ((Walkable)a).run(lenght);
        } else {
            System.out.println(a.getColor()+" "+ a.getType() + " " + a.getName() + " - Can't run!");
            a.setOnDistance(false);
        }
    }
    }

