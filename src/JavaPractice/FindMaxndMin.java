package JavaPractice;

public class FindMaxndMin {
    public static void main(String[] args) {
        int [] marks = {34, 54, 56, 44, 47, 76, 76, 45};

        int max_number = MaxNumber(marks);
        System.out.println("number is: "+max_number);

        int min_number = MinNumber(marks);
        System.out.println("minimum number: "+ min_number);

        int BiggestNumber = HighestNumber(marks);
        System.out.println(BiggestNumber);

        int lowestnumber = LowestNumber(marks);
        System.out.println(lowestnumber);
    }

    //For each loop
    private static int MaxNumber(int[] marks) {
        int max= marks[0];
        for (int maxNumber : marks){
            if (maxNumber> max) {
                max = maxNumber;
            }
        }
        return max;
    }

    private static int MinNumber(int[] marks){
        int min = marks[0];
        for (int minMarks : marks){
            if(minMarks<min){
                min = minMarks;
            }
        }
        return min;
    }

    //Regular For loop
    private static int HighestNumber(int[] marks){
        int highest = marks[0];
        for (int i=0; i< marks.length; i++){
            if ( marks[i] > highest) {
                highest = marks[i];
            }
        }
        return highest;
    }

    private static int LowestNumber(int[] marks){
        int Lowest = marks[0];
        for (int i =0 ; i < marks.length; i++){
            if (marks[i] < Lowest){
                Lowest = marks[i];
            }
        }
        return Lowest;
    }



}
