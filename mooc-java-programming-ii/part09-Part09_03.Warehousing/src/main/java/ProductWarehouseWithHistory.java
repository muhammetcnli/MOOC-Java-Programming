/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Muhammet Canlı
 */
public class ProductWarehouseWithHistory extends ProductWarehouse {

    private ChangeHistory historyListobj = new ChangeHistory();

    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance) {

        super(productName, capacity);
        super.addToWarehouse(initialBalance);

        historyListobj.add(initialBalance);

    }

    public String history() {
        return this.historyListobj.toString();
    }

    @Override
    public void addToWarehouse(double amount) {

        double result = 0;

        result = (double) super.getBalance() + amount;

        historyListobj.add(result);

        super.addToWarehouse(amount);
    }
    
    public double takeFromWarehouse(double amount){
        double result = 0;
        
        result = (double) super.getBalance() - amount;
        
        
        historyListobj.add(result);
        
        return super.takeFromWarehouse(amount);
        
    }
    
    public void printAnalysis(){
        
        System.out.println("Product: " + this.getName());
        
        System.out.println("History: "+ historyListobj.toString());
        
        System.out.println("Largest amount of product: " + historyListobj.maxValue());
        
        System.out.println("Smallest amount of product: " + historyListobj.minValue());
        
        System.out.println("Average: " + historyListobj.average());
        
    }

}
