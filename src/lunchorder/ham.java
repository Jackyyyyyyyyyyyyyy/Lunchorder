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
public class ham {
    private double fat,carbs,fiber;
    public ham(double ft,double cbs,double fb){
        fat = ft;
        carbs=cbs;
        fiber = fb;
    
        
        
    }
        public String toString() {
        String hamburgers;
        hamburgers ="Each hamburger has "+fat+"g of fat, "+carbs+"g of carbs, and "+fiber+"g of fiber.";
	return(hamburgers);
	}
}

