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
public class soda {
    private double fat,carbs,fiber;
    public soda(double ft,double cbs,double fb){
        fat = ft;
        carbs=cbs;
        fiber = fb;
    
        
        
    }
        public String toString() {
        String sodas;
        sodas ="Each soda has "+fat+"g of fat, "+carbs+"g of carbs, and "+fiber+"g of fiber.";
	return(sodas);
	}
}
