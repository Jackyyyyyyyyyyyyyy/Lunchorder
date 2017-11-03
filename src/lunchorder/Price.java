/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lunchorder;
/**
 *
 * @author Jaliu7185
 */
public class Price {
    private double ham,sala,fires,sodas,price;
    	public Price() {
	 	ham = 1.85;
                sala = 2.00;
                fires = 1.30;
                sodas = 0.95;
            
               
	}
        
        public double getPrice() {
	 	return(price);
	}
        
        public void price(double nh,double ns,double nf,double nso) {
            
                price = ham*nh+sala*ns+fires*nf+sodas*nso;
                
	}
       
}
