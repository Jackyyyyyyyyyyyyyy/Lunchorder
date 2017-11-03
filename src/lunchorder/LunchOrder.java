/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lunchorder;
import java.text.DecimalFormat;
import java.util.Scanner;
/**
 *
 * @author Jaliu7185
 */
public class LunchOrder {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double ham,sala,fires,soda;
        DecimalFormat currencyFormat = new DecimalFormat("###.##");
      
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of hamburgers: ");
        ham = input.nextDouble();
        ham hamburger = new ham(9,33,1);
        System.out.println(hamburger);
         
        System.out.print("Enter number of salads: ");
        sala = input.nextDouble();
        sala salads = new sala(1,11,5);
        System.out.println(salads);
        
        System.out.print("Enter number of fries: ");
        fires = input.nextDouble();
        fires fries= new fires(11,36,4);
        System.out.println(fries);
        
        System.out.print("Enter number of sodas: ");
        soda = input.nextDouble();
        soda sodas= new soda(0,38,0);
        System.out.println(sodas);
        
        Price Pc =  new Price();
        Pc.price(ham,sala,fires,soda);
        System.out.print("Your order comes to: $ "+currencyFormat.format(Pc.getPrice()));
    }
    
}
