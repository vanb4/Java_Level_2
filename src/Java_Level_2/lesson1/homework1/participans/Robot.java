package Java_Level_2.lesson1.homework1.participans;

public class Robot extends Animal implements Swimable, Walkable {
   private int maxSwimDistance;
   private int maxRunDistance;


    public Robot(String name, String color) {
        super("Robot", name, color);
        maxSwimDistance =  TYPICAL_SWIM_DISTANCE + 5;
        maxRunDistance = TYPICAL_RUN_DISTANCE * 600;
    }

    @Override
    public void swim(int distance) {
        if(distance <=maxSwimDistance){
            System.out.println(color+" "+ type + " " + name+ " - Swim OK!");
        }
        else
        {
            System.out.println(color+" "+ type + " " + name+ " - Swim FAILED!");
            onDistance = false;
        }

    }

    @Override

    public void run (int distance )
    {
        if(distance <=maxRunDistance){
            System.out.println(color+" "+ type + " " + name+ " - Run OK!");
        }
        else
        {
            System.out.println(color+" "+ type + " " + name+ " - Run FAILED!");
            onDistance = false;
        }
    }


}

