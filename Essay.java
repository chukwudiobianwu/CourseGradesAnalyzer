public class Essay extends GradedActivity{

private int grammar;//holds the score given for grammar
private int spelling;//holds the score given for correct spelling
private int correctLength;//holds the score given for corect length
private int correction;//holds the score given for the content
private int totalP;//holds the total score
/**
this method sets the scores for grammar,spelling,
correct length,content and calculates the total scores
*/
public void setScore(int a,int b,int c,int d){
	grammar=a;
	spelling=b;
	correctLength=c;
	correction=d;
	totalP =grammar + spelling + correctLength + correction;
	setScore(totalP);
	}
/**
this returns the score
*/
public double getScore(){
	return super.getScore();
	}
/**
this returns the grade
*/
public char getGrade(){
	return super.getGrade();
	}
}