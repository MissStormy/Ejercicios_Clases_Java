/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_2;

/**
 *
 * @author Dungeon Larimaster
 */
public class Cuenta {

    //atributos
    String nombre;
    String num_cuenta;
    double interes;
    double saldo;

    public Cuenta() {

    }

    //constructor
    public Cuenta(String nombre, String num_cuenta, double interes, double saldo) {
        this.nombre = nombre;
        this.num_cuenta = num_cuenta;
        this.interes = interes;
        this.saldo = saldo;
    }

    public Cuenta(Cuenta OtraCuenta) {
        this.nombre = OtraCuenta.getNombre();
        this.num_cuenta = OtraCuenta.getNum_cuenta();
        this.interes = OtraCuenta.getInteres();
        this.saldo = OtraCuenta.getSaldo();
    }

    public boolean Ingreso(double cantidad) {
        if (cantidad > 0) {
            this.saldo += cantidad;
            return true;
        } else {
            return false;
        }
    }

    public boolean Reintegro(double saldo, double cantidad) {
        if (cantidad > 0) {
            if (saldo > 0) {
                if (saldo > cantidad) {
                    this.saldo -= cantidad;
                    return true;
                } else {
                    return false;
                }
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public void Transferencia(Cuenta cuentadestino, int importe) {
        double saldocuentadestino = cuentadestino.getSaldo();

        if (this.saldo > importe) {
            this.saldo -= importe;
            saldocuentadestino += importe;
            cuentadestino.setSaldo(saldocuentadestino);
        } else {
            System.out.println("La cantidad que quieres traspasar es mayor a tu saldo.");
        }
    }
    //gettes y settes

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNum_cuenta() {
        return num_cuenta;
    }

    public void setNum_cuenta(String num_cuenta) {
        this.num_cuenta = num_cuenta;
    }

    public double getInteres() {
        return interes;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String toString() {
        String mensaje = "Nombre: " + nombre + " Numero de cuenta: " + num_cuenta + " Interes: " + interes + " Saldo: " + saldo;
        return mensaje;
    }
}
