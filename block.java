//Sebastian Villavicencio 

//Create block class
public class block{
    //include attributes needed 
    private int index; //position of block in chain
    private long timestamp; //time block created
    private String data; //data stored in block
    private String previousHash; //hash of previous block
    private int nonce; //number only used once

//constructor for block
public block(int index, long timestamp, String data, String previousHash){
    this.index = index;
    this.timestamp = timestamp;
    this.data = data;
    this.previousHash = previousHash;
}
//method that is urgent to calculate hash of block
public String calculateHash(){
    String input = index + Long.toString(timestamp) + data + previousHash + Integer.toString(nonce);
    String hash = Integer.toString(input.hashCode());
    return hash;

}


}