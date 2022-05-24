/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package empresa;

/**
 *
 * @author 701
 */
public class Empresa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Plan U001=new Plan("Paquete amigo 100", "Farid Castillo Gonzalez", "6566452765");
        System.out.println(U001);
        U001.Beneficios();
        U001.Vigencia();
        U001.pago();
        Recarga U002=new Recarga(500, "Baylon Diego", "6562868184");
        System.out.println(U002);
        U002.pago();
    }
    
}
