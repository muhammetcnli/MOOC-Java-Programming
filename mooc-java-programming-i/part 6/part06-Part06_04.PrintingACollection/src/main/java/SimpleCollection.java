
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }
    
    @Override
    public String toString(){
        String message;
        if(elements.size() == 0){
            message = "The collection "+this.name +" is empty.";
        } else if(elements.size() == 1){
            message = "The collection "+this.name +" has " + elements.size() + " element:" ;
            message = message + "\n" + elements.get(0);
            
            for(String element: elements){
                message.concat(element);
            }
                    
            
        } else{
            message = "The collection "+this.name +" has " + elements.size() + " elements:";
            for(String element: elements){
                
                message = message + "\n" + element;
                
            }
        }
        
        return message;
        
        
        
    }
    
}
