public class CourseGrades extends GradedActivity implements Analyzable{

private double highest=0;
private double lowest;
private double average;
GradedActivity [] grades=new GradedActivity[4];//a graded activity aray that refers an objecct for each field
/**
this method assigsn an object to the first array of the graded activity array
*/
public void setLab(GradedActivity r){
	 grades[0]=r;
	}
/**
this method assigsn an object to the second array of the graded activity array
*/
public void setPassFailExam(PassFailExam b){
	 grades[1]= b;
	}
/**
this method assigsn an object to the third array of the graded activity array
*/
public void setEssay(Essay r){
	 grades[2]=r;
	}
/**
this method assigsn an object to the fourth array of the graded activity array
*/
public void setFinalExam(FinalExam b){
	 grades[3]= b;
	}
/**
this method returns and calculates the average
*/
public double getAverage(){
		average =(grades[0].getScore()+grades[1].getScore()+grades[2].getScore()+grades[3].getScore())/4;
		return average;
		}
/**
this method returns an object and calculates the highest score
*/
public GradedActivity getHighest(){
	for(int i=0;i<grades.length;i++){
		if(grades[i].getScore() > highest){
			highest=grades[i].getScore();
			}
		}
	GradedActivity g=new GradedActivity();
		g.setScore(highest);
		return g;
		}
/**
this method returns an object and calculates the highest score
*/
public GradedActivity getLowest(){
	lowest=grades[1].getScore();
	for(int i=0;i<grades.length;i++){
		if(grades[i].getScore() < lowest){
			lowest=grades[i].getScore();
			}
		}
		GradedActivity g=new GradedActivity();
			g.setScore(lowest);
			return g;
		}
/**
this method returns a string value which has a summary of the grades,scores,average, and the highest and lowest grades
*/
public String toString(){
	return "Here are the grades\nlab score = "+ grades[0].getScore()+" lab Grade= "+ grades[0].getGrade()+"\nPassFailExam score = "+ grades[1].getScore()+" PassFailExam  Grade= "+ grades[1].getGrade()+
	"\nEssay score = "+  grades[2].getScore()+" Essay Grade= "+ grades[2].getGrade()+"\nFinalExam score = "+ grades[3].getScore()+" FinalExam  Grade= "+ grades[3].getGrade();
}
}