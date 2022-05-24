/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package empresa;

/**
 *
 * @author 701
 */
public class Plan extends Usuario implements Pagos {

    private String nomrePlan, cargoextra;

    public Plan(String nomrePlan, String nombre, String telefono) {
        super(nombre, telefono);
        this.nomrePlan = nomrePlan;
        this.cargoextra = "20$/100M";
    }

    public String getNomrePlan() {
        return nomrePlan;
    }

    public void setNomrePlan(String nomrePlan) {
        this.nomrePlan = nomrePlan;
    }

    public String getCargoextra() {
        return cargoextra;
    }

    public void setCargoextra(String cargoextra) {
        this.cargoextra = cargoextra;
    }
    
    public void Beneficios(){
        switch(nomrePlan){
            case "Paquete amigo 100"->{
                System.out.println("Los beneficios son:\nLlamadas ilimitadas\nRedes sociales ilimitadas\n1200Megas");
            }
            case "Paquete amigo 150"->{
                System.out.println("Los beneficios son:\nLlamadas ilimitadas\nRedes sociales ilimitadas\n2000Megas");
            }
            case "Paquete amigo 200"->{
                System.out.println("Los beneficios son:\nLlamadas ilimitadas\nRedes sociales ilimitadas\n3000Megas");
            }
            case "Paquete amigo 500"->{
                System.out.println("Los beneficios son:\nLlamadas ilimitadas\nRedes sociales ilimitadas\n10000Megas");
            }
        }
    }
    
    public void Vigencia(){
        switch(nomrePlan){
            case "Paquete amigo 100"->{
                System.out.println("Tu plan durará 17 dias");
            }
            case "Paquete amigo 150"->{
                System.out.println("Tu plan durará 17 dias");
            }
            case "Paquete amigo 200"->{
                System.out.println("Tu plan durará 17 dias");
            }
            case "Paquete amigo 500"->{
                System.out.println("Tu plan durará 17 dias");
            }
        }
    }

    @Override
    public void pago() {
        switch(nomrePlan){
            case "Paquete amigo 100"->{
                System.out.println("El paquete cuesta $100 si consumes tus megas antes de tiempo se te cobrará un cargo extra de"+cargoextra);
            }
            case "Paquete amigo 150"->{
                System.out.println("El paquete cuesta $150 si consumes tus megas antes de tiempo se te cobrará un cargo extra de"+cargoextra);
            }
            case "Paquete amigo 200"->{
                System.out.println("El paquete cuesta $200 si consumes tus megas antes de tiempo se te cobrará un cargo extra de"+cargoextra);
            }
            case "Paquete amigo 500"->{
                System.out.println("El paquete cuesta $500 si consumes tus megas antes de tiempo se te cobrará un cargo extra de"+cargoextra);
            }
        }
    }

    @Override
    public String toString() {
        return super.toString()+"Plan \nPlan: " + nomrePlan + "\nCargoextra:" + cargoextra;
    }
    
}
