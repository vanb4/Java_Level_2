package Java_Level_2.lesson2.Homework2;

import Java_Level_2.lesson2.Hw2.MyArrayDataException;
import Java_Level_2.lesson2.Hw2.MyArraySizeException;

public class MainException {


    public static void main(String[] args) {
        final String[][] arrayError1 = new String[][]
                {
                        {"1", "1", "7", "4"},
                        null,
                        {"1", "3", "7", "2"},
                        {"1", "5", "7", "4"},
                };

        final String[][] arrayError2 = new String[][]
                {
                        {"1", "1", "7", "4"},
                        {"1", "null", "7", "4"},
                        {"1", "3", "7", "2"},
                        {"1", "5", "7", "4"},
                };

        final String[][] arrayError3 = new String[][]
                {
                        {"2", "2", "1", "8"},
                        {"3", "5", "2", "4"},
                        {"9", "3", "3", "2"},
                        {"4", "5", "4", "8"},
                };

        final String[][] arrayError4 = new String[][]
                {
                        {"2", "2", "1", "8"},
                        {"3", "5", "2", "4"},
                        {"9", "3", "b", "2"},
                        {"4", "5", "4", "8"},
                };

        final String[][] arrayError5 = new String[][]
                {
                        {"2", "2", "1", "8"},
                        {"3", "5", "2", "4"},
                        {"9", "3", "b", "2"},
                        {"4", "5", "8"},
                };
        String[][] arrayError = arrayError1;
        printInfo(arrayError);


    }



    public static int getArrayError (String[][]arrayError){
            if (arrayError == null || arrayError.length != 4) {
                throw new MyArraySizeException();
            }
            int result = 0;
            for (int i = 0; i < arrayError.length; i++) {
                if (arrayError[i] == null ||arrayError[i].length != 4) {
                    throw new MyArraySizeException();
                } else {
                    for (int j = 0; j < arrayError[i].length; j++) {
                        try {
                            result += Integer.parseInt(arrayError[i][j]);
                        } catch (NumberFormatException ex) {
                            throw new MyArrayDataException(i, j);
                        }
                    }
                }
            }
            return result;

        }

        public static void printInfo (String[][] arrayError){
        try {
                System.out.println("RESULT " + getArrayError(arrayError));
            } catch (MyArraySizeException ex) {
                System.out.println(ex.getMessage());
            } catch (MyArrayDataException ex) {
                System.out.println(ex.getFullMessage());
            }
        }

















        /* int result = 0;
        String[][] arrayError = arrayError2;

        if (arrayError== null || arrayError.length != 4) {
            throw new MyArraySizeException();
        }

        for (int i = 0; i < arrayError.length; i++) {
            if (arrayError[i] == null || arrayError[i].length != 4) {
                throw new MyArraySizeException();
            } else {
                for (int j = 0; j < arrayError[i].length; j++) {
                    try {
                        result += Integer.parseInt(arrayError[i][j]);
                    } catch (NumberFormatException ex) {
                        throw new MyArrayDataException(i, j);
                    }
                }
            }
        }
        System.out.println(System.lineSeparator() +  ":");
        try {
            System.out.println("RESULT ");
        } catch (MyArraySizeException ex) {
            System.out.println(ex.getMessage());
        } catch (MyArrayDataException ex) {
            System.out.println(ex.getFullMessage());
        }*/





    }


