public class Quadratic {
    public static void main(String[] args) {
        double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[1]);
        double c = Double.parseDouble(args[2]);
        double result1 = (((-1*b) + Math.sqrt(Math.pow(b,2)-(4*a*c)))/(2*a));
        double result2 = (((-1*b) - Math.sqrt(Math.pow(b,2)-(4*a*c)))/(2*a));
        System.out.println("The solutions to "+args[0]+"x^2"+" + "+ args[1]+"x"+" + "+args[2]+" are " +result1 +" and "+result2);
    }
}
