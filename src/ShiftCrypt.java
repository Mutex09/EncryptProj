public class ShiftCrypt
{

    public String Crypt(String message, int key, String command)
    {

        StringBuilder cryptMessage = new StringBuilder("");

        for (int i = 0; i < message.length(); i++)
        {
            char symbol = message.charAt(i);

            if (Character.toString(symbol).matches("[a-z]"))
            {
                int rom = 0;

                if (command.equals("dec"))
                {
                    rom = Character.hashCode(symbol) - key;
                } else if (command.equals("enc"))
                {
                    rom = Character.hashCode(symbol) + key;
                }

                while (rom > 122)
                {
                    rom = rom -26;
                }
                while (rom < 97)
                {
                    rom += 26;
                }

                cryptMessage.append(Character.toString(rom));
            }else if (Character.toString(symbol).matches("[A-Z]"))
            {
                int rom = 0;

                if (command.equals("dec"))
                {
                    rom =Character.hashCode(symbol) - key;
                } else if (command.equals("enc"))
                {
                    rom =Character.hashCode(symbol) + key;
                }

                while (rom > 90)
                {
                    rom = rom -26;
                }
                while (rom < 65)
                {
                    rom += 26;
                }

                cryptMessage.append(Character.toString(rom));
            } else {cryptMessage.append(symbol);}

        }

        return cryptMessage.toString();
    }
}
