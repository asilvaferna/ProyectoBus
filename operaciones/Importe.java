/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operaciones;

/**
 *
 * @author Adri
 */
public class Importe {
    
    private final float BST = 2.50f;
    private final float IMP = 0.10f;
    private final float PPKM = 0.10f;
    private final float BPREM = 3.0f;

    

    public float getBASE() {
        return BST;
    }

    public float getImpuestos() {
        return IMP;
    }

    
    public float kilometros(String nombreCiudad){
        if (nombreCiudad.equals("Lugo")){
            return 120f;
        } else if(nombreCiudad.equals("Santiago")){
            return 70f;
        } else if(nombreCiudad.equals("Ourense")){
            return 90f;
        } else if(nombreCiudad.equals("A Coruña")){
            return 120f;
        } else {
            return 140f;
        }
    }
    
    public float tipo(String tipoBillete){
        
        if (tipoBillete.equals("Ida")){
            return 1;
        } else {
            return 0.10f;
        }
    }
    
    public float edad(String tipoEdad){
        if(tipoEdad.equals("Senior")){
            return 0.20f;
        } else if (tipoEdad.equals("Junior")){
            return 0.10f;
        } else {
            return 1;
        }
    }
    
    public double precioBilleteAII(String nombreCiudad, String claseBillete, String tipoEdad, String tipoBillete){
        if (claseBillete.equals("Normal") && tipoBillete.equals("Ida-Vuelta")){
            return BST * tipo(tipoBillete);
        } else if(claseBillete.equals("Normal") && tipoBillete.equals("Ida") && tipoEdad.equals("Adulto")){
            return BST * tipo(tipoBillete) * edad(tipoEdad);
        } else if(claseBillete.equals("Normal") && tipoBillete.equals("Ida") && tipoEdad.equals("Junior")){
            return BST * tipo(tipoBillete) * edad(tipoEdad);
        } else if(claseBillete.equals("Normal") && tipoBillete.equals("Ida") && tipoEdad.equals("Senior")){
            return BST * tipo(tipoBillete) * edad(tipoEdad);
        } else if(claseBillete.equals("Premium") && tipoBillete.equals("Ida-Vuelta")){
            return BPREM * tipo(tipoBillete);
        } else if(claseBillete.equals("Premium") && tipoBillete.equals("Ida") && tipoEdad.equals("Senior")){
            return BPREM * tipo(tipoBillete) * edad(tipoEdad);
        } else if(claseBillete.equals("Premium") && tipoBillete.equals("Ida") && tipoEdad.equals("Adulto")){
            return BPREM * tipo(tipoBillete) * edad(tipoEdad);
        } else {
            return BPREM * tipo(tipoBillete) * edad(tipoEdad);
        } 
    }
    
    public double precioBilleteDII(String nombreCiudad, String claseBillete, String tipoEdad, String tipoBillete){
        return precioBilleteAII(nombreCiudad, claseBillete, tipoEdad, tipoBillete) * IMP + precioBilleteAII(nombreCiudad, claseBillete, tipoEdad, tipoBillete);
    }
    
    public double impuestos(String nombreCiudad, String claseBillete, String tipoEdad, String tipoBillete){
        return IMP * precioBilleteAII(nombreCiudad, claseBillete, tipoEdad, tipoBillete);
    }
    
}
