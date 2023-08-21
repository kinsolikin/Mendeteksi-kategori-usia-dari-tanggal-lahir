import java.util.*;

class ConditionalOperator
{
static int a;
/**
 * @param args
 */
public static void main (String args[])
{
Scanner scan = new Scanner(System.in);

System.out.println ("Umur :");
a=scan.nextInt();

{
if (a>=0 && a<15)
{
System.out.println ("Anda Anak-anak");
}
else if ( a>16 && a<25)
{
System.out.println ("Anda Remaja");
}
else if ( a>26 && a<45)
{
System.out.println ("Anda Dewasa");
}
else if ( a>45)
{
System.out.println ("Lansia");
}

}

}
}