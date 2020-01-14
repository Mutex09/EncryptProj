import java.io.*;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Objects;

public class FinalCrypt
{
    public static void main(String[] args)
    {

        String message = "";
        String cryptMessage = "";
        int key = 0;
        String command = "enc";
        boolean in = false;
        boolean out = false;
        boolean shift = false;
        boolean unicode = false;
        boolean data = false;

        LinkedList<String> input = new LinkedList<>();

        Collections.addAll(input, args);

        StringBuilder inName = new StringBuilder("");
        StringBuilder outName = new StringBuilder("");
        StringBuilder argument = new StringBuilder();

        for (int i = 0; i < args.length; i++)
        {
            argument.delete(0,argument.length());
            argument.append(input.pollFirst());

            if (argument.toString().equals("-in") && !data)
            {
                in = true;
                inName.append(input.pollFirst());
                i++;
                message = null;
            }
            switch (argument.toString())
            {
                case ("-data"):
                    message = input.pollFirst();
                    i++;
                    data = true;
                    in = false;
                    break;
                case ("-key"):
                    key = Integer.parseInt(Objects.requireNonNull(input.pollFirst()));
                    i++;
                    break;
                case ("-mode"):
                    command = input.pollFirst();
                    i++;
                    break;
                case ("-out"):
                    out = true;
                    outName.append(input.pollFirst());
                    i++;
                    break;
                case("unicode"):
                    unicode = true;
                    shift = false;
                    break;
                case("shift"):
                    shift = true;
                    unicode = false;
                    break;
            }
        }

        if (!shift && !unicode)
        {
            shift = true;
        }

        if (in)
        {
            In file = new In();
            message = file.ins(inName.toString());
        }

        if (shift)
        {
            ShiftCrypt shiftCrypt = new ShiftCrypt();
            cryptMessage = shiftCrypt.crypt(message,key,command);
        }
        if (unicode)
        {
            UniCrypt uniCrypt = new UniCrypt();
            cryptMessage = uniCrypt.crypt(message,key,command);
        }

        if (out)
        {
            Out file = new Out();
            file.outs(outName.toString(),cryptMessage);
            System.out.println("Check the file: " + outName);
        }

        if (!out)
            System.out.println(cryptMessage);
        }
}
