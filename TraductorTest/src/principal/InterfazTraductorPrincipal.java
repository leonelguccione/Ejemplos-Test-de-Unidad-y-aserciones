package principal;

import interfaz.InterfazTraductor;

public class InterfazTraductorPrincipal
{
    public InterfazTraductorPrincipal()
    {
        super();
    }

    public static void main(String[] args)
    {
        //InterfazTraductorPrincipal interfazTraductorPrincipal = new InterfazTraductorPrincipal();
        InterfazTraductor interfaz = new InterfazTraductor( );
        interfaz.setVisible( true );
    }
}
