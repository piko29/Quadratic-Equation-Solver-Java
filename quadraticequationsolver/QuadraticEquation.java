package quadraticequationsolver;


public class QuadraticEquation 
{
    private double a,b,c;
    
    public QuadraticEquation (double a, double b, double c)
    {
        this.a = a;
        this.b = b;
        this.c = c;
    }
public String calculate()
{
    String result ="";
    double delta;
    delta = (b*b-4*a*c);
    if (delta>0)
    {
        delta = Math.sqrt(delta);
        double x1 = (-b-delta)/(2*a);
        double x2= (-b+delta)/(2*a);
        result = "It has roots: x1= "+x1+" and x2= "+x2;
        
    }
    else if(delta==0)
    {
        delta=Math.sqrt(delta);
        double x0= -b/(2*a);
        result = "It has root: x0= " +x0;
    }
    else if(delta<0)
    {
    double real = -b/(2*a);
    double img = Math.sqrt(-delta) / (2*a);
    result = "It has Complex roots: x1 = " + real + " + " + img +"i and x2 = " + real + " - " + img + "i";
    }
    return result;
}    
       
    public void setA(double a)
    {
        this.a=a;
    }
    public void setB(double b)
    {
        this.b=b;
    }
    public void setC(double c)
    {
        this.c=c;
    }

}