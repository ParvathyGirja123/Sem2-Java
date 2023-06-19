// Parent class - Student
class Student {
    protected int academicScore;

    public Student(int academicScore) {
        this.academicScore = academicScore;
    }

    public int getAcademicScore() {
        return academicScore;
    }
}

// Parent class - Sports
class Sports {
    protected int sportsScore;

    public Sports(int sportsScore) {
        this.sportsScore = sportsScore;
    }

    public int getSportsScore() {
        return sportsScore;
    }
}

// Child class - Result
class Result extends Student, Sports {
    public Result(int academicScore, int sportsScore) {
        super(academicScore);
        this.sportsScore = sportsScore;
    }

    public void displayScores() {
        System.out.println("Academic Score: " + getAcademicScore());
        System.out.println("Sports Score: " + getSportsScore());
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        // Create an instance of Result
        Result result = new Result(90, 85);

        // Display the scores
        result.displayScores();
    }
}
