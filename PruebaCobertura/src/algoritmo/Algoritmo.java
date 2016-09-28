package algoritmo;


public class Algoritmo
{
    int a;
    int b;
    int c;


    public Algoritmo(int a, int b, int c)
    {
        super();
        this.a = a;
        this.b = b;
        this.c = c;
    }


    public void algoritmo()
    {
        while (a == 10)
        {
            System.out.println("a es igual a 10");
            if (b == 20)
            {
                System.out.println("a sigue siendo igual a 10");
                System.out.println("b es igual a 20");
            }
            else
            {
                if (c == 30)
                {
                    System.out.println("c es igual a 30");
                }
                else
                {
                    System.out.println("c no es igual a 30");
                }
                System.out.println("b no es 20 y se imprimio el valor de c");
            }
            // a = lector.nextInt();
        }
        System.out.println("a no es igual a 10");
    }

}
