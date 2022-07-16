import java.util.*;
public class runfile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Cipher cipher  = new Cipher();

        int k = new Random().nextInt(10);
        String msg = "";

        System.out.println("Are you (E)ncypting or (D)ecypting ?");
        String value = input.nextLine();

        if(value.equals("E")){
            System.out.println("Enter a message");
            String message = input.nextLine();
            input.close();
            msg = Cipher.cipher(message, k);
            System.out.println("Message encrpted: "+msg + ", encode key: "+k);
        }

        else{
            
            if(msg.length()==0){

                System.out.println("Enter a message to decipher");
                String message = input.nextLine();
                System.out.println("Encoding key?");
                final int c = input.nextInt();

                String text = Cipher.decipher(message, c);

                System.out.println("complete: "+text);
            }   
        }
        
    }
}
