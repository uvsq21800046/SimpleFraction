public class Fraction {
    public double num;
    public double den;
    public double res;

    public Fraction(double n, double d){
        num= n;
        den= d;
        res= n/d;
    }

    public String toString(){
        return String.valueOf(this.res);
    }


}
