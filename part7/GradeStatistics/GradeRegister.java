package part7.GradeStatistics;

import java.util.ArrayList;

public class GradeRegister {
    private ArrayList<Integer> examPoints;
    private ArrayList<Integer> grades;

    public GradeRegister() {
        this.grades = new ArrayList<>();
        this.examPoints = new ArrayList<>();
    }

    public void addGradeBasedOnPoints(int points) {
        this.grades.add(pointsToGrade(points));
        this.examPoints.add(points);
    }

    public int numberOfGrades(int grade) {
      int count = 0;
      for (int received: this.grades) {
          if (received == grade) {
              count++;
          }
      }

      return count++;
    }

    public static int pointsToGrade(int points) {

        int grade = 0;
        if (points < 50) {
            grade = 0;
        } else if (points < 60) {
            grade = 1;
        } else if (points < 70) {
            grade = 2;
        } else if (points < 80) {
            grade = 3;
        } else if (points < 90) {
            grade = 4;
        } else {
            grade = 5;
        }

        return grade;
    }

    public double averageOfGrades(){
        if(this.grades.isEmpty()) {
            return -1;
        }

        int size = this.grades.size();
        int sum = 0;

        for(int i = 0; i < size; i++) {
            sum += this.grades.get(i);
        }

        return 1.0 * sum/size;
    }

    public double averageOfPoints() {

        if(this.examPoints.isEmpty()) {
            return -1;
        }

        int size = examPoints.size();
        int sum = 0;

        for (int i = 0; i < size; i++) {
            sum += this.examPoints.get(i);
        }

        return 1.0 * sum/size;
    }

    public double passingGrade() {

      if(this.examPoints.isEmpty()) {
          return -1;
      }

      int size = examPoints.size();
      int sum = 0;
      int count = 0;


      for (int i = 0; i < size; i++) {
          int grade = this.examPoints.get(i);
          if(grade >= 50) {
              sum += grade;
              count++;
          }
      }
      return 1.0 * sum/count;
  }

  public double passPercentage() {
      if (this.examPoints.isEmpty()) {
      return -1;
      }

      int totalStudents = this.examPoints.size();
      int passingStudents = 0;


      for (int points : this.examPoints) {
          if (points >= 50) {
          passingStudents++;
          }
      }
      return 100.0 * passingStudents / totalStudents;
  }
}
