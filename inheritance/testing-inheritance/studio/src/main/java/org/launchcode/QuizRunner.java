public class QuizRunner {
    public static void main(String[] args) {
        Quiz myQuiz = new Quiz();

        MultipleChoice myMultiChoice = new MultipleChoice("What sound does a dog make?" +
                "\nA: Bark\nB: Quack\nPlease just type a single letter as an answer", "A");
        myQuiz.addQuestion(myMultiChoice);

        CheckBox myCheckBox = new CheckBox("Select all that apply, which animals can fly?\nA: Penguins\nB: Doves\nC: Owls", "B, C");
        myQuiz.addQuestion(myCheckBox);

        TrueFalse myTrueFalse= new TrueFalse("Dogs are omnivores?  \n True or False?", "True");
        myQuiz.addQuestion(myTrueFalse);

        ShortAnswer myShortAnswer= new ShortAnswer( "Kangaroos are from which country?", "Australia");
        myQuiz.addQuestion(myShortAnswer);

        LinearScale myLinearScale = new LinearScale("On a scale from 1-10 how cute are penguins?", 8, 10);
        myQuiz.addQuestion(myLinearScale);

        ParagraphQuestion myParagraphQuestion = new ParagraphQuestion("Tell me why animals are cool?", "Because they are.");
        myQuiz.addQuestion(myParagraphQuestion);

        myQuiz.runQuiz();
    }
}