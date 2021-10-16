package java6studio;

import java.util.ArrayList;
import java.util.HashMap;

public class Question {
    private String question;
    private ArrayList<String> possibleAnswers;
    private ArrayList<String> userAnswers;
    private ArrayList<String> correctAnswers;

    public Question(String question, ArrayList<String> possibleAnswers, ArrayList<String> correctAnswers){
        this.question = question;
        this.possibleAnswers = possibleAnswers;
        this.correctAnswers = correctAnswers;
    }

    public Question(){

    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public ArrayList<String> getCorrectAnswers() {
        return correctAnswers;
    }

    public ArrayList<String> getPossibleAnswers() {
        return possibleAnswers;
    }

    public ArrayList<String> getUserAnswers() {
        return userAnswers;
    }

    public void setCorrectAnswers(ArrayList<String> correctAnswers) {
        this.correctAnswers = correctAnswers;
    }

    public void setPossibleAnswers(ArrayList<String> possibleAnswers) {
        this.possibleAnswers = possibleAnswers;
    }

    public void setUserAnswers(ArrayList<String> userAnswers) {
        this.userAnswers = userAnswers;
    }




    public void printQuestion(){

    }

    public void gradeQuestion(){

    }



    @Override
    public String toString() {
        return "Question{" +
                "question='" + question + '\'' +
                ", possibleAnswers=" + possibleAnswers +
                ", userAnswers=" + userAnswers +
                ", correctAnswers=" + correctAnswers +
                '}';
    }
}
