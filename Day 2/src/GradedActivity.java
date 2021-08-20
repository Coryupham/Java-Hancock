public class GradedActivity {
    private double score;

    public void setScore(double s) {
        score = s;
    }

    public double getScore() {
        return score;
    }

    public char getGrade() {
        char result;

        if (score >= 90) {
            result = 'A';
        } else if (score >= 80) {
            result = 'B';
        } else {
            result = 'C';
        }

        return result;
    }
}

