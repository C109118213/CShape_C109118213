public class Ctriangle extends CShape {

    protected double a,b,c;
    public void Ctriangle(double a1,double b1,double c1){
        a=a1;
        b=b1;
        c=c1;
    }
    @Override
    public void show() {
        System.out.println("color:"+color);
        System.out.println("area:"+0.5*a*b);
    }
}
