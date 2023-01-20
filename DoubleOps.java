class DoubleOps {
    public static void main(String[] args) {
        int num = Integer.parseInt(args[0]);
        int absolute = Math.abs(num);
        System.out.println("The absolute value of "+args[0]+" is "+absolute);

        double base = Double.parseDouble(args[0]);
        double power = Double.parseDouble(args[1]);
        double result = Math.pow(base,power);
        System.out.println(base +" to the "+power+" power is "+result);

        double radicand = Double.parseDouble(args[0]);
        double root = Math.sqrt(radicand);
        System.out.println("The square root of "+ radicand +" is "+ root);

        double num1 = Double.parseDouble(args[0]);
        double randnum = Math.random();
        double finalnum = randnum*num1;
        System.out.println("A random number between 0 and "+args[0]+" is "+finalnum);
    }
}