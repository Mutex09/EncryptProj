import java.io.*;

public class Out
{
    void outs(String outName,String cryptMessage)
    {
        PrintWriter protectedMessage;
        try {
            protectedMessage = new PrintWriter(new BufferedOutputStream(new FileOutputStream( outName)));
            protectedMessage.write(cryptMessage);
            protectedMessage.close();
        } catch (IOException e) {
            System.out.print(e.getMessage());
            System.exit(0);
        }
    }
}
