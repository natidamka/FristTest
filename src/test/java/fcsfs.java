import org.apache.commons.codec.binary.Base64;

public class fcsfs {

    public  static  void main(String[] args){

        String password = "KNGAUWW547ZLV7GJOUNOQQIRAHONTTB7";

        byte [] encodedPassword = Base64.encodeBase64(password.getBytes());
        System.out.println("Encoded Password is :" + new String(encodedPassword));
    }

}

