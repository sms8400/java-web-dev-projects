import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class LinearScaleTest {
    LinearScale myLinearScale;


    @Before
    public void setUpTests() {

        this.myLinearScale = new LinearScale("A test question", 1, 10);
    }

    @Test
    public void constructorSetProperties() {
        assertEquals("A test question", this.myLinearScale.getTheQuestion());
        assertEquals(1, this.myLinearScale.getLowValue());
        assertEquals(10, this.myLinearScale.getHighValue());
    }

    @Test
    public void checksLinearAnswerAndReturnsTrue() {
        boolean actualAnswer = this.myLinearScale.checkAnswer("5");
        assertTrue(actualAnswer);
    }
}
