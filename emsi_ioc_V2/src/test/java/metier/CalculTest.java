package metier;

import org.junit.Assert;
import org.junit.Test;

public class CalculTest {
    private Calcul calcul;
    @Test
    public void testSomme(){
      calcul= new Calcul();
      double a=3; double b=2;
      double excepted=5;
      double res= calcul.somme(a,b);
        Assert.assertTrue(res==excepted);
    }
}
