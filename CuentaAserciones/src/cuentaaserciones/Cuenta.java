package cuentaaserciones;

public class Cuenta
{
    private static int ultimoCodigo = 0;
    private int codigo;
    private double saldo;
    private final Persona titular;
    private EstadoCuenta estado;

    public Cuenta(Persona persona, int saldoInicial)
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

}
