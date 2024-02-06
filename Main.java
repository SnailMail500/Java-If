public class Main {
    public static void main (String[] args){
        if (20 > 18) {
            System.out.println("20 is greater than 18");
        }
        else{
            System.out.println("This will never be met because...\nthe condition will always be true!");//self explanatory really
        }
        boolean test = false;
        if (test == true){
            System.out.println("This time, it's the if that will never be met (this bit here)");
        }
        else{
            System.out.println("This statement will never be executed!");
        }
    }
}
