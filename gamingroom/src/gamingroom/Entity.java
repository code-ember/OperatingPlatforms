package gamingroom;

public class Entity {
    
    // Private Attributes  
    private long id;
    private String name;
    
    // Hide the default constructor to prevent creating empty instances
    private Entity() {
    }
    
    // Constructor with an identifier and name
    public Entity(long id, String name){
        this();
        this.id = id;
        this.name = name;
    }
    
    // @return the id
    public long getId() {
        return id;
    }
    
    // @return the name
    public String getName() {
        return name;
    }
    
    public String toString() {
        return "Entity [id=" + id + ", name=" + name + "]";
    }
}