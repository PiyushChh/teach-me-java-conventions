


import org.junit.Test;
import powerpackage.PowerFinder;



public class PowerTest {
    @Test
    public void oneRaisedToOneIsOne() {
//        PowerFinder powerfinder=new PowerFinder();

        assert PowerFinder.of(1,1) == 1;
    }

    @Test
    public void twoRaisedToOneIsTwo() {
//        PowerFinder powerfinder=new PowerFinder();
        assert PowerFinder.of(2,1) == 2;
    }

    @Test
    public void twoRaisedToTwoIsFour() {

//        PowerFinder powerfinder=new PowerFinder();
        assert PowerFinder.of(2, 2) == 4;
    }

    @Test
    public void threeRaisedToTwoIs9() {
        assert PowerFinder.of(3, 2)==9;
    }

}
