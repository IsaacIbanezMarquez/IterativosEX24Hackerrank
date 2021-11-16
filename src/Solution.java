
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

// ENUNCIADO:

// Consecutius:

/*  Fes un programa que llegeixi una seqüència de nombres enters acabada en zero i escrigui si dos nombres consecutius són iguals o no. Si existeixen dos nombres seguits iguals escriurem TRUE, sinó escriurem FALSE.

Input Format

Successió de nombres enters acabada en 0.

Constraints

No n'hi ha.

Output Format

{TRUE | FALSE}

Sample Input 0

1 2 3 4 5 6 7 8 0
Sample Output 0

FALSE
Sample Input 1

45 46 23 23 78 9 0
Sample Output 1

TRUE

 */


public class Solution
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        String a = "";


        while (num2 != 0)
        {

            if (num1 == num2)
            {
                a = "TRUE";
            }


            num1 = num2;
            num2 = sc.nextInt();
        }
        if (a == "TRUE")
        {
            System.out.println(a);
        }
        else
        {
            System.out.println("FALSE");
        }
    }
}
