public class RockPaperScissorsLizardSpock
{
    public static void main (String args[])
    {
	new RockPaperScissorsLizardSpock ();
    }

    public RockPaperScissorsLizardSpock ()
    {
	int cPoint = 0;
	int uPoint = 0;
	int game = 1;
	char playAgain = 'y';
	System.out.println ("-----Rock, Paper, Scissors, Lizard, Spock------\n");
	while (playAgain == 'y' || playAgain == 'Y')
	{

	    char user = userChoice ();
	    System.out.println ("You have selected " + user);
	    char comp = compChoice ();
	    System.out.println ("The computer has selected " + comp);
	    char win = winner (user, comp);
	    if (win == 'c')
	    {
		cPoint++;
		System.out.println ("\nThe computer wins!");
	    }
	    else if (win == 'u')
	    {
		uPoint++;
		System.out.println ("\nYou win!");

	    }
	    else
		System.out.println ("\nThere is a tie!");
	    System.out.println ("Points: You: " + uPoint + " Computer: " + cPoint);
	    playAgain = IBIO.inputChar ("\nPlay again? (y/n) ");
	    System.out.println ("");
	}
	System.out.println ("Goodbye!");
    }


    public boolean isValid (String c)
    {
	/* All valid data:
	       Rock, ROCK, rock, r, R
	       Paper, PAPER, paper, p, P
	       Scissors, SCISSORS, scissors, s, S
	   return true if valid, false otherwise
	*/
	if (c.equals ("r") || c.equals ("s") || c.equals ("p") || c.equals ("Rock") || c.equals ("ROCK") || c.equals ("rock") || c.equals ("r") || c.equals ("R") || c.equals ("Paper") || c.equals ("PAPER") || c.equals ("paper") || c.equals ("p") || c.equals ("P") || c.equals ("Scissors") || c.equals ("SCISSORS") || c.equals ("scissors") || c.equals ("s") || c.equals ("S") || c.equals ("Lizard") || c.equals ("LIZARD") || c.equals ("lizard") || c.equals ("l") || c.equals ("L") || c.equals ("Spock") || c.equals ("SPOCK") || c.equals ("spock") || c.equals ("k") || c.equals ("K"))
	    return false;
	else
	    return true;
    }


    public char userChoice ()
    { //print options: rock, paper, scissors
	System.out.println ("Choices: Rock (r), paper (p), scissors (s), lizard (l), or Spock (k).");

	boolean a = true;
	String x = "";
	while (a == true)
	{
	    x = IBIO.inputString ("Pick your weapon: ");
	    a = isValid (x);
	}
	//Loop: if invalid input, ask again
	//stopping condition is the isValid method!!

	//If: transfer values - Rock, ROCK, rock, r, R - to r, etc.

	//return r, p or s
	if (x.equals ("Rock") || x.equals ("ROCK") || x.equals ("rock") || x.equals ("r") || x.equals ("R"))
	    return 'r';
	else if (x.equals ("Paper") || x.equals ("PAPER") || x.equals ("paper") || x.equals ("p") || x.equals ("P"))
	    return 'p';
	else if (x.equals ("Scissors") || x.equals ("SCISSORS") || x.equals ("scissors") || x.equals ("s") || x.equals ("S"))
	    return 's';
	else if (x.equals ("Lizard") || x.equals ("LIZARD") || x.equals ("lizard") || x.equals ("l") || x.equals ("L"))
	    return 'l';
	else
	    return 'k';
    }


    public char compChoice ()
    { //make a random number between 1 and 3
	int x = (int) (Math.random () * 5);
	//if the number is 1, return r; 2 return s; 3 return p
	if (x == 1)
	    return 'r';
	else if (x == 2)
	    return 's';
	else if (x == 3)
	    return 'p';
	else if (x == 4)
	    return 'l';
	else
	    return 'k';
    }


    public char winner (char comp, char user)
    { //comp and user both hold r, s, p
	//returns c for computer, u for user and b for both

	//Rock
	if (user == 'r' && comp == 'p')
	    return 'u';
	else if (user == 'r' && comp == 's')
	    return 'c';
	else if (user == 'r' && comp == 'l')
	    return 'c';
	else if (user == 'r' && comp == 'k')
	    return 'u';

	//Paper
	else if (user == 'p' && comp == 'r')
	    return 'c';
	else if (user == 'p' && comp == 's')
	    return 'u';
	else if (user == 'p' && comp == 'l')
	    return 'u';
	else if (user == 'p' && comp == 'k')
	    return 'c';

	//Scissors
	else if (user == 's' && comp == 'r')
	    return 'u';
	else if (user == 's' && comp == 'p')
	    return 'c';
	else if (user == 's' && comp == 'l')
	    return 'c';
	else if (user == 's' && comp == 'k')
	    return 'u';

	//Lizard
	else if (user == 'l' && comp == 'r')
	    return 'u';
	else if (user == 'l' && comp == 'p')
	    return 'c';
	else if (user == 'l' && comp == 's')
	    return 'u';
	else if (user == 'l' && comp == 'k')
	    return 'c';

	//Spock
	else if (user == 'k' && comp == 'r')
	    return 'c';
	else if (user == 'k' && comp == 'p')
	    return 'u';
	else if (user == 'k' && comp == 's')
	    return 'c';
	else if (user == 'k' && comp == 'l')
	    return 'u';

	//Tie
	else
	    return 'b';
    }
}

