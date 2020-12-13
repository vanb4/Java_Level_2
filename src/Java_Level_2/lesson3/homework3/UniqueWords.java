package Java_Level_2.lesson3.homework3;

import java.util.*;


public class UniqueWords {
    public static void main(String[] args) {
        ArrayList<String> WordsList = new ArrayList<>(
                Arrays.asList("Cat","Mouse","Dog","Duck","Pig",
                              "Pig","Chicken", "Turkey", "Cow",
                              "Dog","Turkey","Pig","Dog","Dog"));
        ArrayList<String> uniqueWordsList = new ArrayList<>();
        for (int i =0; i < WordsList.size(); i++){
            int numberWords = 0;
            for(int j =0; j < WordsList.size(); j++){
                if (WordsList.get(i).equals(WordsList.get(j) )){
                    numberWords++;
                }
            }
            uniqueWordsList.add(WordsList.get(i)+ "=" + numberWords++);
        }
        Set<String> set = new HashSet<>(uniqueWordsList);
        System.out.println(set);
    }
}
