import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class Pizzarechner {
	public static void main(String[] args) throws IOException {
		
		//First pizza's values are collected, not sanitized
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Pizza 1 Durchmesser (cm):");
        String p1Diameter = reader.readLine();       
        double p1Area = Double.valueOf(p1Diameter) * Double.valueOf(p1Diameter) * (double)Math.PI;
        System.out.println("Pizza 1 Preis (€):");
        String p1Price = reader.readLine();
        
        //Second pizza's values are collected, not sanitized
        System.out.println("Pizza 2 Durchmesser (cm):");
        String p2Diameter = reader.readLine();
        double p2Area = Double.valueOf(p2Diameter) * Double.valueOf(p2Diameter) * Math.PI;
        System.out.println("Pizza 2 Preis (€):");
        String p2Price = reader.readLine();
        
        double p1Value = p1Area / Double.valueOf(p1Price);
        double p2Value = p2Area / Double.valueOf(p2Price);
        double sizeRatio = (Double.max(p1Area, p2Area) / Double.min(p1Area, p2Area) * 100) - 100;
        
        DecimalFormat df = new DecimalFormat("#.##");
        
        int c;
        if (p1Area > p2Area) {c = 1;} else {c = 2;};
        double priceDifference;
        if (c == 1) {
        	priceDifference = p1Value - p2Value;
        } else {
        	priceDifference = p2Value - p1Value;
        }
        System.out.println("Pizza " + c + " ist " + df.format(sizeRatio) + "% größer und Pro cm² " +
        		df.format(priceDifference) + " Cent günstiger.");  
	}

}
