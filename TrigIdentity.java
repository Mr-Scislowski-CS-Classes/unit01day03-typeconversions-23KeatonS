public class TrigIdentity {
    public static void main(String[] args) {
        double theta = Double.parseDouble(args[0]);
        double result = (Math.pow(Math.sin(Math.toRadians(theta)),2)) + (Math.pow(Math.cos(Math.toRadians(theta)),2));
        /*
        
        other method of rounding answer before I knew the round method
        double error = 0.00001;

        if (Math.abs(result-1)<error){
            result = 1;
        }
        */
        System.out.println("Sin^2("+args[0]+") + Cos^2("+args[0]+") = "+Math.round(result));


    }
}
