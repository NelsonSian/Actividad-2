/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nelson Sian
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Student estudiante1 = new Student("Nelson Sian", "San Juan Sacatepequez");
        Student estudiante2 = new Student("Carlos Alvarez", "San Pedro Sacatepequez");
        Student estudiante3 = new Student("Ever Castaño", "San Lucas Sacatepequez");
        estudiante1.VerInformacion();
        estudiante2.VerInformacion();
        estudiante3.VerInformacion();
        
    }
    
}
