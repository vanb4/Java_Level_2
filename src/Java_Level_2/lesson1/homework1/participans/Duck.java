package Java_Level_2.lesson1.homework1.participans;

public class Duck extends Animal implements Swimable, Jumpable, Walkable {

    private int maxSwimDistance;
    private int maxJumpHeight;
    private int maxRunDistance;


    public Duck(String name, String color) {
        super("Duck", name, color);
        maxSwimDistance =  TYPICAL_SWIM_DISTANCE * 10;

        maxJumpHeight = TYPICAL_JUMP_HEIGHT *5;
        maxRunDistance =  TYPICAL_RUN_DISTANCE *10;
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

    public void jump (int height )
    {
        if(height<=maxJumpHeight){
            System.out.println(color+" "+ type + " " + name+ " - Jump OK!");
        }
        else
        {
            System.out.println(color+" "+ type + " " + name+ " -Jump FAILED!");
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
