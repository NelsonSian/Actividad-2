
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nelson Sian
 */
public class Student extends Person{
    double Fee;
    int year;
    String Program;
    
    
    public Student(String name, String address) {
        super(name, address);
        this.Fee=Fee;
        this.Program=Program;
        this.year=year;
        
    }
    @Override
 public void VerInformacion () {
     JOptionPane.showMessageDialog(null, "Name: " + name + "\nAddress: " + address + "\nFee: " + Fee + "\nProgram: "
     + Program + "\nYear: " + year, "Student data ", JOptionPane.INFORMATION_MESSAGE);
     
 }
    
}
