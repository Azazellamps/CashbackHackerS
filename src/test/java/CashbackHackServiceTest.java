
import static org.testng.Assert.*;
import org.testng.annotations.Test;
import ru.netology.service.CashbackHackService;


public class CashbackHackServiceTest {
    @Test
    public void amountBelow1000() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 900;
        int actual = cashbackHackService.remain(amount);
        int expected = 100;
        assertEquals(actual, expected);


    }
    @Test
    public void amountAbove1000() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 1100;
        int actual = cashbackHackService.remain(amount);
        int expected = 900;
        assertEquals(actual, expected);


    }
    @Test
    public void amountEqually1000() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 1000;
        int actual = cashbackHackService.remain(amount);
        int expected = 0;
        assertEquals(actual, expected);


    }
}
