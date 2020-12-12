package Java_Level_2.lesson2.Homework2;

public class MyArrayDataException extends MyException{
    private final int x;
    private final int y;

    public MyArrayDataException(int x, int y) {
        super("Heверный формат данных");
        this.x = x;
        this.y = y;
    }



    public String getFullMessage() {
        return this.getMessage() + ":ячейка массива [" + x + "," + y +"]";
    }

}
