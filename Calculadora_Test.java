import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class Calculadora_Test {
    @Test
    public void testSuma() {
        Calculadora calcu = new Calculadora(20, 10);
        int resultado = calcu.suma();
        assertEquals(30, resultado);
    }
    
    @Test
    public void testResta() {
        Calculadora calcu = new Calculadora(20, 10);
        int resultado = calcu.resta();
        assertEquals(10, resultado);
    }
    
    @Test
    public void testMultiplica() {
        Calculadora calcu = new Calculadora(20, 10);
        int resultado = calcu.multiplica();
        assertEquals(200, resultado);
    }
    
    @Test 
    public void testDivision() {
        Calculadora calcu = new Calculadora(20, 10);
        int resultado = calcu.division();
        assertEquals(2, resultado);
    }
    
    @Test
    public void testRaizCuadrada() {
        Calculadora calcu = new Calculadora(25, 0);
        double resultado = calcu.raizCuadrada();
        assertEquals(5.0, resultado, 0.0001);
    }
    
    @Test
    public void testElevarAlCuadrado() {
        Calculadora calcu = new Calculadora(5, 0);
        int resultado = calcu.elevarAlCuadrado();
        assertEquals(25, resultado);
    }
    
    @Test
    public void testElevarAlCubo() {
        Calculadora calcu = new Calculadora(3, 0);
        int resultado = calcu.elevarAlCubo();
        assertEquals(27, resultado);
    }
}
