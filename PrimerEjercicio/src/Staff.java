
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
public class Staff extends Person{
    String school;
    double pay;

    public Staff(String name, String address) {
        super(name, address);
        this.school=school;
        this.pay=pay;
        
    }

  
    @Override
     public void VerInformacion () {
         JOptionPane.showMessageDialog(null, "Name: " + name + "\nAddress: " + address);
     }
        
    }
