import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class In
{
    public String ins(String inName)
    {
        StringBuilder messageB = new StringBuilder("");

        BufferedReader messageFile;
        String message;
        try {
            messageFile = new BufferedReader(new FileReader( inName));
                while ((message=messageFile.readLine())!=null) {
                    messageB.append(message).append("\n");
                }
            messageFile.close();
        } catch (IOException e)
        {
            System.out.println(e.getMessage());
        }
        return messageB.toString();
    }
}
