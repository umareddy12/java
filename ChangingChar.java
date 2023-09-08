class ChangingChar
{
	public static void main (String[] args)
	{
		// your code goes here
		String word = "Ocygen";
        char[] wordArray = word.toCharArray();
        wordArray[1] = 'x';
        word = new String(wordArray);
        System.out.println(word);
	}
}
