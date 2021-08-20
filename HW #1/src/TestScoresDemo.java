import java.util.Scanner;

public class TestScoresDemo {
    public static void main(String[] args)
    {

        System.out.println("Enter name");
        Scanner keyboard  = new Scanner(System.in);
        String nameEntered = keyboard.nextLine();

        TestScores t1= new TestScores(nameEntered);


        double score = 0;
        int counter = 1;
        while(score >= 0 )
        {
            System.out.println("Enter score " + counter +  " or a negative number to exit");
            score = keyboard.nextDouble();
            if (score >= 0)
            {
                t1.addTestScore(score);
                counter++;
            }
        }
        System.out.println("-- " + nameEntered + " --");
        System.out.println("Num tests taken: " + t1.getNumTestsTaken());
        System.out.printf("Average: %.1f\n", t1.getAverage());


    }
}
