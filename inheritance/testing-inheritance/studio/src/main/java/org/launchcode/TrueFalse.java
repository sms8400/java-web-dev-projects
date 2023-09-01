public class TrueFalse extends Question {
    // Class Variables

    // Constructors
    public TrueFalse(String question, String answer) {
        super(question, answer);
    }

    // Method
    @Override
    public boolean checkAnswer(String answer) {
        // answer = "true" "false"  or "TRUE" or "FALSE"
        if (answer.toUpperCase().equals(this.getTheAnswer().toUpperCase())) {
            return true;
        } else {
            return false;
        }
    }
}