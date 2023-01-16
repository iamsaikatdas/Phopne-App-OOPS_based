public class Main {
    public static void main(String[] args) {

//        System.out.println("Hello world!");
        Landline ll = new Landline("9547746752");
        Landline ll2 = new Landline("7718763602");

        ll.callNumber("7718763602");
        ll2.receiveCall("7718763602");
        System.out.println(ll2.answerCall());



        // is a valid phone no (phone no. length is 10);
        // which ph no I called this is busy or not.
        //

    }
}