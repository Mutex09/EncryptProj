# EncryptPropject
There are five arguments: <b>-mode, -key, -data/-in, -alg, -out.</b><br> 
<b>The first</b> argument should determine the program’s <b>mode</b> <b>(enc - encryption, dec - decryption).</b> <br>
<b>The second</b> argument is an integer <b>key</b> to modify the message.<br> 
<b>The third</b> argument is a text or ciphertext within quotes to encrypt or decrypt(-data) or full name of a file to read data(-in).<br>
<b>The fourth</b> argument is a shift or unicode algorithm(-alg)<br>
<b>Shift</b> algorithm reads an English message and an integer number (key) from the standard input and shifts each letter by the specified number according to its order in the alphabet. If you reach the end of the alphabet, start back at the beginning (a follows z)..<br>
<b>Unicode</b> algorithm, it takes message and an integer number (key) from the standard input and shifts each character by the specified number according to the Unicode table.<br>
And <b>the fifth</b> argument is a full name of file to write the result(-out).<br>
There are some rules:
1. If there is no <b>-mode</b>, the program should work in <b>enc</b> mode.
2. If there is no <b>-key</b>, the program should consider that <b>key</b> = 0.
3. If there is no <b>-data</b>, and there is no <b>-in</b> the program should assume that the <b>data</b> is an empty string.
4. If there is no <b>-out</b> argument, the program must print <b>data</b> to the standard output.
5. If there are both <b>-data</b> and <b>-in</b> arguments, your program should prefer <b>-data</b> over <b>-in</b>.
6. If there is no <b>-alg</b> you should default it to <b>shift</b>.
