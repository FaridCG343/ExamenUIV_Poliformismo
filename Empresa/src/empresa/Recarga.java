/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package empresa;

/**
 *
 * @author 701
 */
public class Recarga extends Usuario implements Pagos{
    private double monto;

    public Recarga(double monto, String nombre, String telefono) {
        super(nombre, telefono);
        this.monto = monto;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    @Override
    public void pago() {
        System.out.println("El monto de la recarga es de"+monto+"\nMás el cobro por el servicio"+monto*.10+"\nDa un total de "+monto*1.10);
    }
    
    

    @Override
    public String toString() {
        return super.toString()+"\nRecarga \nMonto:" + monto;
    }
    
}
