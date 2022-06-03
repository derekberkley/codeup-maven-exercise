import org.junit.Test;
import static org.junit.Assert.*;

public class Testing {


//    1. set up maven project
//            bring in the junit dependency
//    reload your project (pom)
//        refer to the curriculum
//            import test and assetrt from the junit dependency
//    add testing annotation(s)
//        write a method
//    set up our own code
//    --> create a variable for your age
//    --> create variable for the tested age
    // use whatever assert method is going to help us test our code
    // --> assertTrue ("message for our understanding", what it's testing)

    @Test
    public void testIfOlderThanThirtyFour() {
        int age = 43;
        assertTrue("age should be older than 34", age > 34);
    }

}
