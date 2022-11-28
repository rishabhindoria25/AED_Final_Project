/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NUHealthCare.Map;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;

/**
 *
 * @author Rishabh,Uday,Aditi
 */
public class SMS {

    public static final String ACCOUNT_SID = "AC5a7da250c8cd70eaf8419d4897d3859d";
//              System.getenv("TWILIO_ACCOUNT_SID");
    public static final String AUTH_TOKEN = "16e5749b2b3b08422b70dd40ecaf3245";
//            System.getenv("TWILIO_AUTH_TOKEN");

    public static void SendSMS(String to, String msg) {
        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
        Message message = Message.creator(
                new com.twilio.type.PhoneNumber(to),
                new com.twilio.type.PhoneNumber("+18507864090"),
                msg)
                .create();

//        System.out.println(message.getSid());
    }
}
