package Java_Level_2.lesson1.homework1.obstacles;

import Java_Level_2.lesson1.homework1.participans.Animal;
import Java_Level_2.lesson1.homework1.participans.Jumpable;
import Java_Level_2.lesson1.homework1.participans.Participan;
import Java_Level_2.lesson1.homework1.participans.Swimable;

public class Wall extends Obstacle {
    private  int height;

    public Wall(int height) {
        this.height = height;

    }

    @Override
    public void doIt(Participan a) {

    if (a instanceof Jumpable) {
        ((Jumpable )a).jump (height);
    } else {
        System.out.println(a.getColor()+" "+ a.getType() + " " + a.getName() + " -Can't jump!");
        a.setOnDistance(false);
    }
    }
}
