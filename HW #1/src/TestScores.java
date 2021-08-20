public class TestScores {
    private String name;
    private double totalScore;
    private int numScores;
    int test;

    public TestScores (String name)
    {
        this.name = name;
    }

    public void addTestScore (double earned)
    {
        totalScore += earned;
        numScores++;
    }

    public int getNumTestsTaken ()
    {
        return numScores;
    }

    public double getAverage()
    {
        return totalScore/numScores;
    }
}
