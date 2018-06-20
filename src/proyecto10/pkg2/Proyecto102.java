/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto10.pkg2;

import javax.swing.JOptionPane;

/**
 *
 * @author propa
 */
public class Proyecto102 {

    public static void metodo() {
        int numero1 = (int) Math.floor((Math.random() * 50) + 1);
        int numeroint = Integer.parseInt(JOptionPane.showInputDialog("numero de intentos"));
        int numero2 = 0;
        int i=0;
        for ( i = numeroint; i!= 0; ) {
           numero2= Integer.parseInt(JOptionPane.showInputDialog("Resposta?"));
           int numero3=0;
           if(numero1<numero2){
           numero3=numero2-numero1;
           
          
          if(numero3>20){JOptionPane.showMessageDialog(null,"moi lonxe");}
         else if(numero3>=10&&numero3<=20){JOptionPane.showMessageDialog(null,"lonxe");}
          else if(numero3>=5&&numero3<10){JOptionPane.showMessageDialog(null,"preto");}
          else{JOptionPane.showMessageDialog(null,"moi preto");}
           i--;
           
           }
           else if(numero2<numero1){
           numero3=numero1-numero2;
          
          if(numero3>20){JOptionPane.showMessageDialog(null,"moi lonxe");}
         else if(numero3>=10&&numero3<=20){JOptionPane.showMessageDialog(null,"lonxe");}
          else if(numero3>=5&&numero3<10){JOptionPane.showMessageDialog(null,"preto");}
          else{JOptionPane.showMessageDialog(null,"moi preto");}
           i--;
           i--;}
            
           else {JOptionPane.showMessageDialog(null, "Has ganado");
           i=0;}
                
           
            
        }
    }

    public static void main(String[] args) {
metodo();
    }

}
