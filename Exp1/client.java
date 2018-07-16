import java.net.*;
import java.io.*;
public class client
{
    public static void main(String[] arg) throws Exception
    {
        try {
            Socket S=new Socket(InetAddress.getLocalHost(),1000); 
            BufferedReader br=new BufferedReader(new InputStreamReader(S.getInputStream()));
           String input;
           PrintWriter out =new PrintWriter(S.getOutputStream(),true);
           while((input=br.readLine())!=null)
            {
                System.out.println(input);
                out.println("Date and time recived ... Client Acknowledge...");
             }
            }
        catch(Exception e)
        {}
    }
}
