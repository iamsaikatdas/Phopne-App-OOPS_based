import java.util.Scanner;

public class Landline implements Phone{

    // attribute what should landline class have
    private String myPhoneNo;
    private boolean isRinging;
    private boolean isPowerOn;

    public Landline (String myPhoneNo){
        this.myPhoneNo = myPhoneNo;
        this.isRinging = false;
        this.isPowerOn = true; // first of all phone is off
    }


    public String getMyPhoneNo() {
        return myPhoneNo;
    }

    public void setMyPhoneNo(String myPhoneNo) {
        if (myPhoneNo.length() == 10){
            this.myPhoneNo = myPhoneNo;
        }else {
            System.out.println("Please, type a valid phone no. from setMyPhoneNo.");
        }
    }

    public void setRinging(boolean ringing) {
        isRinging = ringing;
    }

    public boolean isPowerOn() {
        return isPowerOn;
    }

    public void setPowerOn(boolean powerOn) {
        isPowerOn = powerOn;
    }

    @Override
    public void powerOn() {
        this.isPowerOn = true;
    }

     // 2
    @Override
    public void callNumber( String phoneNo) {
        // kaoke call korte hole ki ki thakte hobe : -
        // 1 - your phone power is on
        if(phoneNo.length() == 10){
            if(isPowerOn == true) {
                System.out.println("You are dialing the number: " + phoneNo);
            } else{
                System.out.println("Apka dial kiya gaya number abhi Switch off hai.");
            }
        }else{
            System.out.println("This is not a valid Phone no.");
        }
        return;
    }

    // 4
    @Override
    public boolean answerCall() {
        // phone ring hote hobe, jodi phoner power on thake tahole ring hobe otherwise hobe na.
        // reference receiveCall
        Scanner sc = new Scanner(System.in);

        if (isRinging == true){
            System.out.println();
            System.out.print("Please answering the call using Y/N: ");
            char c = sc.next().charAt(0);
            if ( c == 'y'){
                // call received korar por ktha hobe message e.
                System.out.println("Hello...");
                char isContinue = 'y';
                while (isContinue == 'y'){
                    sc.nextLine();
                    System.out.print("Second person typing: ");
                    String firstPerson = sc.nextLine();
                    System.out.println("Second person says: " + firstPerson);

                    System.out.print("First person typing: ");
                    String secondPerson = sc.nextLine();
                    System.out.println("First person says: " + secondPerson);

                    System.out.print("Is continue: ");
                    isContinue = sc.next().charAt(0);
                }
                System.out.println("Call answered, and cut off the call.");
                this.isRinging = false;
                return true;
            }else{
                System.out.println("Caller are too busy right now, after sometime he will call you back.");
                System.out.println();
                System.out.print("Can you send message Y/N: ");
                char m = sc.next().charAt(0);
                if (m == 'y'){
                    sc.nextLine();
                    String msg = sc.nextLine();
                    System.out.println("You received a message: " + msg);
                }
            }
        }
        return false;
    }

    // 3
    @Override
    public void receiveCall(String phoneNo) {
        // call nubmer korar por received caller ke call jabe
        // 1 phone on thakte hobe, nahole ph off bolte hobe and se jake call koreche and amar number aki ki na.
        // phone on thaklei isringing true hobe.

        if (phoneNo.length()==10){
            if(isPowerOn && myPhoneNo.equals(phoneNo)){
                this.isRinging = true;
                System.out.println("You get a call from: " + myPhoneNo);
            }else{
                System.out.println("Call not received, due to Wrong phone no.");
            }
        }else{
            System.out.println("Please type a valid phone no. received call");
        }
        return;
    }

     // 1
    @Override
    public boolean isRinging() {
       return isRinging;   // if isRinging == true return ture, else return false;
    }

    @Override
    public void sentMessage(String sentPhoneNo, String receivedPhoneNo) {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("This is personal messaging section would you like to continue? replay using Y/N:  ");
        char conf = sc.next().charAt(0);
        sc.nextLine(); // because sc.next() want to enter
        if (conf == 'y'){
            String msg = sc.nextLine();
            System.out.println("Your phone number is: " + receivedPhoneNo);
            System.out.println("You received the messaged from: " + sentPhoneNo + "\nand the message is: " + msg);
        } else {
            System.out.println(sentPhoneNo + " declined to continue messaging you");
        }

    }

}
