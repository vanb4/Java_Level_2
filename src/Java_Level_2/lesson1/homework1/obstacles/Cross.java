package Java_Level_2.lesson1.homework1.obstacles;

import Java_Level_2.lesson1.homework1.participans.Animal;
import Java_Level_2.lesson1.homework1.participans.Participan;

public class Cross extends Obstacle {
    private  int lenght;

    public Cross (int lenght) {
        this.lenght = lenght;

    }

    @Override
    public void doIt(Participan a) {
        a.run(lenght);
    }
}
