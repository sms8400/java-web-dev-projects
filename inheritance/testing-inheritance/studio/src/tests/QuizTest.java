import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class QuizTest {

    Quiz myQuiz;

//    before causes test to run before the test
    @Before
    public void setUpTests() {

        this.myQuiz = new Quiz();
    }

    @Test
    public void addQuestionMethodAddsQuestion() {
        CheckBox testQuestion = new CheckBox("A test question", "A test answer");
        this.myQuiz.addQuestion(testQuestion);
        assertEquals(1, this.myQuiz.getQuestions().size());
    }

}