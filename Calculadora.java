import java.lang.Math;

public class Calculadora {
    private int num1;
    private int num2;
    
    public Calculadora(int a, int b) {
        num1 = a;
        num2 = b;
    }
    
    public int suma() {
        return num1 + num2;
    }
    
    public int resta() {
        return num1 - num2;
    }
    
    public int multiplica() {
        return num1 * num2;
    }
    
    public int division() {
        return num1 / num2;
    }
    
    public double raizCuadrada() {
        return Math.sqrt(num1);
    }
    
    public int elevarAlCuadrado() {
        return num1 * num1;
    }
    
    public int elevarAlCubo() {
        return num1 * num1 * num1;
    }
}
