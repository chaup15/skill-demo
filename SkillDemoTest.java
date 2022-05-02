import static org.junit.Assert.*;
import org.junit.*;

public class SkillDemoTest {
    @Test
    public void evenTest(){
        assertEquals(true, SkillDemo.evenNum(3)); //Failing test
    }
}
