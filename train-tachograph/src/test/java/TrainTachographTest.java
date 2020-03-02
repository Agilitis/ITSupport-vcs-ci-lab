import hu.bme.mit.train.tachograph.TrainTachograph;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class TrainTachographTest {

    private TrainTachograph tt;

    @Before
    public void before() {
        tt = new TrainTachograph();
    }

    @Test
    public void Check_TachoGraph_Data() {
        Assert.assertTrue(!this.tt.getTachographTable().isEmpty());


    }


}
