
public class node {
	String data;
	node nextNode;
	public node(String nData, node nNext){
		data=nData;
		nextNode=nNext;
	}
	public String getData(){
		return data;
	}
	public void setData(String newData){
		data = newData;
	}
	public node getNextNode(){
		return nextNode;
	}
	public void setNextNode(node newNext){
		nextNode = newNext;
	}
}
