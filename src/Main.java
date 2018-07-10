import org.apache.commons.lang3.builder.*;

public class Bank{
    String name;
    Strng address;
    
    public boolean equals(Object o){
        return EqualsBuilder.reflectionEquals(this, o); 
    }
}