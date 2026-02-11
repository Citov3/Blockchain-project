//Sebastian Villavicencio 

//Create block class
public class block{
    //include attributes needed 
    public int index;
    private long timestamp;
    public String data;
    public String previousHash;

//constructor for block
public block(int index, long timestamp, String data, String previousHash){
    this.index = index;
    this.timestamp = timestamp;
    this.data = data;
    this.previousHash = previousHash;
}


}