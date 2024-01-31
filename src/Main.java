public class Main {
    public static void main(String[] args) {
        String n1 = "10";
        String n2 = "20";

        int i1 = Integer.parseInt(n1);
        int i2 = Integer.parseInt(n2);

        System.out.println(i1 + i2);    //30

        String n3 = "10.5";
        String n4 = "20.5";
        double i3 = Double.parseDouble(n3);
        double i4 = Double.parseDouble(n4);

        System.out.println(i3 + i4);
    }
}
