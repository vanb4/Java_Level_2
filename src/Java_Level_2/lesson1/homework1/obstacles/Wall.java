package Java_Level_2.lesson1.homework1.obstacles;

import Java_Level_2.lesson1.homework1.participans.Animal;
import Java_Level_2.lesson1.homework1.participans.Participan;

public class Wall extends Obstacle {
    private  int height;

    public Wall(int height) {
        this.height = height;

    }

    @Override
    public void doIt(Participan a) {
        a.jump(height);
    }
}
