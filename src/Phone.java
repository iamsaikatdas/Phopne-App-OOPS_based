public interface Phone {
    void powerOn();
    void callNumber(String phoneNo);
    boolean answerCall();
    void receiveCall(String phoneNo);
    boolean isRinging();
    void sentMessage(String sentPhoneNo, String receivedPhoneNo);
}

