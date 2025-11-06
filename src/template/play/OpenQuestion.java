package template.play;

import java.util.Scanner;

// Åbent spørgsmål - spilleren svarer med fri tekst
public class OpenQuestion extends Question {
    private String question;
    private String correctAnswer;

    public OpenQuestion(String question, String correctAnswer) {
        this.question = question;
        this.correctAnswer = correctAnswer;
    }

    protected void displayQuestion() {
        System.out.println("Open Question: " + question);
    }

    protected String getUserAnswer() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Skriv dit svar: ");
        return scan.nextLine();
    }

    protected boolean checkAnswer(String answer) {
        if (answer == null) return false;
        return answer.trim().equalsIgnoreCase(correctAnswer.trim());
    }
}

