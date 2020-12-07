package Java_Level_2.lesson1.homework1.participans;

public class Cat extends Animal implements Jumpable, Walkable {
    private int maxJumpHeight;
    private int maxRunDistance;
    public Cat(String name, String color) {
        super("Cat", name, color);
        maxJumpHeight = TYPICAL_JUMP_HEIGHT  * 10;
        maxRunDistance = TYPICAL_RUN_DISTANCE * 5;
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
