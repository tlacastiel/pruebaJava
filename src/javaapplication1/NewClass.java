/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author erik
 */
public class NewClass {
    private String asd;
    
    private String marca;

    public String getAsd() {
        return asd;
    }

    public void setAsd(String asd) {
        this.asd = asd;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    public static void main(String[] args) {
        NewClass asd = new NewClass();
        asd.setAsd("AFria");
        asd.setAsd("AFria");
        asd.setAsd("AFria");
        System.out.println("PRINT="+asd.getAsd());        
    }
}
