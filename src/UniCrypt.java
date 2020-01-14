public class UniCrypt
{
    public String Crypt(String message, int key, String command)
    {
        StringBuilder cryptMessage = new StringBuilder("");

        char symbol;

        if (command.matches("enc"))
        {

            for (int i = 0; i < message.length(); i++)
            {
                symbol = message.charAt(i);

                int rom = Character.hashCode(symbol) + key;

                cryptMessage.append(Character.toString(rom));
            }
        } if (command.matches("dec"))
        {
            for (int i = 0; i < message.length(); i++)
            {
                symbol = message.charAt(i);

                int rom = Character.hashCode(symbol) - key;

                cryptMessage.append(Character.toString(rom));
            }
        }
        return cryptMessage.toString();
    }
}
