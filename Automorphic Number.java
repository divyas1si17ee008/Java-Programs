#https://www.facebook.com/permalink.php?story_fbid=107317871142097&id=100055916535575
#Subscribed by Code House
@Hacktoberfest 2020
@C++
import java.util.*;
public class Main
{
	static boolean isAutomorphic(int N)
	{
		int sq = N * N;

		while (N > 0)
		{
			if (N % 10 != sq % 10)
			return false;

			// Reduce N and square
			N /= 10;
			sq /= 10;
		}

		return true;
	}
public static void main(String[] args)
	{
		int num;
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		if(isAutomorphic(num))
		{
			System.out.println(“Automorphic” );
		}
		else
			System.out.println(“Not Automorphic”);
	}
}
