public class QuadraticEquation {
    double a,b,c;

    public QuadraticEquation(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double geta(){
        return a;
    }

    public double getb(){
        return b;
    }

    public double getc(){
        return c;
    }

    public double getDiscriminant(){
        return b * b - 4 * a * c;
    }

    public double getRoot1 (){
        double r1 = (-b + Math.sqrt(getDiscriminant())) / 2*a;
        return r1;
    }

    public double getRoot2 (){
        double r2 = (-b - Math.sqrt(getDiscriminant())) / 2 * a;
        return r2;
    }
}
