import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.*;

public class CheckBoxTest {

    CheckBox myCheckBox;


    @Before
    public void setUpTests() {
        this.myCheckBox = new CheckBox("A test question", "A test answer");
    }

    @Test
    public void constructorSetProperties() {
        assertEquals("A test question", this.myCheckBox.getTheQuestion());
        assertEquals("A test answer", this.myCheckBox.getTheAnswer());
    }

    @Test
    public void checkAnswerReturnsTrue() {
        boolean actualAnswer = myCheckBox.checkAnswer("A test answer");
        assertTrue("A test question", actualAnswer);

    }


}