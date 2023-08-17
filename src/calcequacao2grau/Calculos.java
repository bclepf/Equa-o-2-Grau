package calcequacao2grau;

/**
 *
 * @author berna
 */
public class Calculos {
    private final double v1;
    private final double v2;
    private final double v3;

    public Calculos(double v1, double v2, double v3) {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }
               
    public double calculaDelta(){
        return Math.pow(v2, 2) - 4 * (v1 * v3);
    }  

    public double[] calculaSolucao() {
        double delta = calculaDelta();
        double s1 = (-v2 + Math.sqrt(delta))/(2*v1);
        double s2 = (-v2 - Math.sqrt(delta))/(2*v1);
        return new double[]{s1, s2};
    }
    
    public double calculaDeltaZero(){
    return -v2/(2*v1);
    }   
    
}
