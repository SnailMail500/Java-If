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
        //could have an else if on this line with a different condition in case that's a thing you really want to do (it's fine I'm just snarky)
        else{
            System.out.println("This statement will be executed!");
        }
    }
}
