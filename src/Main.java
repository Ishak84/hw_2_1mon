public class Main {
    public static void main(String[] args) {
        System.out.println(tempOfMethod(12,50));
        System.out.println(tempOfMethod(39,4));
        System.out.println(tempOfMethod(17,14));
        System.out.println(tempOfMethod(0,21));
        System.out.println(tempOfMethod(7,6));
    }

    public static String tempOfMethod(int temp, int age){
        if (age >= 20 && age <= 45 && temp >= -20 && temp <= 30){
            return "можно идти гулять one";
        } else if (age > 0 && age <= 20 && temp >= 0 && temp <= 20 ) {
            return "можно идти гулять two";
        } else if (age >= 45 && temp >= -10 && temp <= 25 ) {
            return "можно идти гулять three";
        } else {
            return "оставайтесь дома";
        }
    }
}