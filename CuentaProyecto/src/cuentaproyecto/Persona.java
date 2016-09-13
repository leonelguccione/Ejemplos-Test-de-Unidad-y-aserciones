package cuentaproyecto;


public class Persona
{
    private String nya;
    private String dni;

    public Persona(String nya, String dni)
    {
        super();
        this.nya = nya;
        this.dni = dni;
    }

    public void setNya(String nya)
    {
        this.nya = nya;
    }

    public String getNya()
    {
        return nya;
    }

    public void setDni(String dni)
    {
        this.dni = dni;
    }

    public String getDni()
    {
        return dni;
    }

}
