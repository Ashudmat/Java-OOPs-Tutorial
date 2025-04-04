public class MethodOverloading {
    public static void main(String[] args) {
        Guest guest= new Guest();
        guest.greet();
        guest.greet(1231);
    }
}

class Guest{

    public void greet(int memberId){
        System.out.println("Welcome! You are a premium customer");
    }

    public void greet(){
        System.out.println("Hi! Welcome. Would you like to be a member?");
    }
}
