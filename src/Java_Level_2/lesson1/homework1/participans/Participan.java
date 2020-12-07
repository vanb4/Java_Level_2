package Java_Level_2.lesson1.homework1.participans;

public abstract  class Participan {
    protected String type;
    protected String name;
    protected String color;

    /*protected int maxRunDistance;
    protected int maxJumpHeight;*/

    protected boolean onDistance;

    public Participan(String type,
                      String name,
                      String color/*,
                  int maxRunDistance,
                  int maxJumpHeight*/)
    {
        this.type = type;
        this.name = name;
        this.color = color;
       /* this.maxRunDistance = maxRunDistance;
        this.maxJumpHeight = maxJumpHeight;*/
        this.onDistance = true;
    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    /*public int getMaxRunDistance() {
        return maxRunDistance;
    }

    public int getMaxJumpHeight() {
        return maxJumpHeight;
    }*/

    public boolean isOnDistance() {
        return onDistance;
    }

    public void setOnDistance(boolean onDistance) {
        this.onDistance = onDistance;
    }

    /*public void run (int distance )
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
*/
   /* public void jump (int height )
    {
        if(height<=maxJumpHeight){
            System.out.println(color+" "+ type + " " + name+ " - Jump OK!");
        }
        else
        {
            System.out.println(color+" "+ type + " " + name+ " -Jump FAILED!");
            onDistance = false;
        }
    }*/

    public void info () {
        System.out.println(color + " " + type + " " + name + ": " + onDistance);
    }

    public abstract void run (int lenght);

    public abstract void jump(int height);
}


