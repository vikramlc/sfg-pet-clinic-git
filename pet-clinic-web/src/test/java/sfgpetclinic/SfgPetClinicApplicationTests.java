package sfgpetclinic;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SfgPetClinicApplicationTests {

    @Test
    public void contextLoads() {
    }

    @Test
    public void setUp() throws Exception {
        assertEquals(true, true);
    }

}

