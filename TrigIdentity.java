public class TrigIdentity {
    public static void main(String[] args) {
        double theta = Double.parseDouble(args[0]);
        double result = (Math.pow(Math.sin(Math.toRadians(theta)),2)) + (Math.pow(Math.cos(Math.toRadians(theta)),2));
        System.out.println(result);


    }
}
