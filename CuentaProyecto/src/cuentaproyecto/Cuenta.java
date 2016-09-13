package cuentaproyecto;


public class Cuenta
{
    private static int ultimoCodigo = 0;
    private int codigo;
    private double saldo;
    private final Persona titular;
    private int estado;

    public Cuenta(Persona persona, double saldoInicial)
    {
        codigo = ++ultimoCodigo;
        saldo = saldoInicial;
        titular = persona;
        estado = EstadoCuenta.OPERATIVA;
    }

    public void ingreso(double cantidad)
    {
        saldo = saldo + cantidad;
    }

    public void setCodigo(int codigo)
    {
        this.codigo = codigo;
    }

    public int getCodigo()
    {
        return codigo;
    }

    public void setSaldo(double saldo)
    {
        this.saldo = saldo;
    }

    public double getSaldo()
    {
        return saldo;
    }

    public Persona getTitular()
    {
        return titular;
    }

    public void setEstado(int estado)
    {
        this.estado = estado;
    }

    public int getEstado()
    {
        return estado;
    }


}
