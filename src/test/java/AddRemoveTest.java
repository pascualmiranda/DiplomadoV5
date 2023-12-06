import base.BaseTest;
import org.testng.annotations.Test;
import task.tasking.AddElements;
import task.tasking.RemoveElements;

public class AddRemoveTest extends BaseTest {

    @Test
    public void addElementTest(){
        AddElements.as(webDriver);
    }

    @Test
    public void removeElementTest(){
        RemoveElements.as(webDriver);
    }

}
