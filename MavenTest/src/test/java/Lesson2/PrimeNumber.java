package Lesson2;

        import org.testng.Assert;
        import org.testng.annotations.Test;

/**
 * Created by admin on 20.10.2014.
 */
public class PrimeNumber {

    @Test
    public void detPrimeTest()
    {
        PrimeNumber isPrime = new PrimeNumber();
        Assert.assertEquals(isPrime.detPrime(4), true);
    }

  public boolean detPrime(int num) {
        if (num % 2 == 0) return false;
        for (int i = 3; i * i <= num; i += 2) {
            if (num % i == 0)
                return false;
        }
        return true;
    }
}
