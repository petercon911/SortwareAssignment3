package nuig.app.soft_assignment;




import static org.junit.Assert.assertTrue;

import java.time.LocalDateTime;
import java.util.Date;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
	Date birth = new Date(1985, 1, 1);
    Student test = new Student("Peter", 22, birth, 1);
    
    public void shouldAnswerWithTrue()
    {
        if (test.getAge() == 22) 
        	assert(true);
    }
}
