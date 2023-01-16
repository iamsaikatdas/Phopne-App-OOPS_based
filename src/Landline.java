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
        this.myPhoneNo = myPhoneNo;
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
        if(isPowerOn == true) {
            System.out.println("You are dialing the number: " + phoneNo);
        } else{
            System.out.println("Apka dial kiya gaya number abhi Switch off hai.");
        }
    }

    // 4
    @Override
    public boolean answerCall() {
        // phone ring hote hobe, jodi phoner power on thake tahole ring hobe otherwise hobe na.
        // reference receiveCall
        if (isRinging == true){
            System.out.println("Call answered.  ");
            this.isRinging = false;
            return true;
        }
        return false;
    }

    // 3
    @Override
    public void receiveCall(String phoneNo) {
        // call nubmer korar por received caller ke call jabe
        // 1 phone on thakte hobe, nahole ph off bolte hobe and se jake call koreche and amar number aki ki na.
        // phone on thaklei isringing true hobe.
        if(isPowerOn && myPhoneNo.equals(phoneNo)){
            this.isRinging = true;
            System.out.println("You get a call from: " + phoneNo);
        }else{
            System.out.println("Call not received");
        }
        return;
    }

     // 1
    @Override
    public boolean isRinging() {
       return isRinging;   // if isRinging == true return ture, else return false;
    }
}
