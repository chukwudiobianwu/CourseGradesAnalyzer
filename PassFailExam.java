/**
   This class determines a passing or failing grade for
   an exam.
*/

public class PassFailExam extends GradedActivity
{
private int numQuestions;  // Number of questions
private double pointsEach; // Points for each question
private int numMissed;     // Number of questions missed
private double numericScore;// Declare a local variable for the score.
private char letterGrade;
private double  minP;
/**
      The constructor sets the number of questions, the
      number of questions missed, and the minimum passing
      score.
      @param questions The number of questions.
      @param missed The number of questions missed.
      @param minPassing The minimum passing score.
   */

   public PassFailExam(int questions, int missed,
                       double minPassing)
   {
      // Call the superclass constructor.
      minP=minPassing;

      // Set the numQuestions and numMissed fields.
      numQuestions = questions;
      numMissed = missed;

      // Calculate the points for each question and
      // the numeric score for this exam.
      pointsEach = 100.0 / questions;
      numericScore = 100.0 - (missed * pointsEach);

      // Call the superclass's setScore method to
      // set the numeric score.
      setScore(numericScore);
}
/**
this returns the grade
*/
public double getScore(){
	return super.getScore();
	}
/**
this ovverides the getGrade method in the super class and returns the grade
*/
   	@Override
      public char getGrade()
      {
         if (getScore() >= minP)
            letterGrade = 'P';
         else
            letterGrade = 'F';

         return letterGrade;
   }
}