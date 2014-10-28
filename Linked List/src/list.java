import java.util.Scanner;
public class list {
	public static void main(String[] args) {
		node Hydrogen = new node("1",null);
		node Lithium = new node("3",null);
		node Beryllium = new node("4",null);
		node Sodium = new node("11",null);
		node Magnesium = new node("12",null);
		node Potassium = new node("19",null);
		node Calcium = new node("20",null);
		node Rubidium = new node("37",null);
		node Strontium = new node("38",null);
		node Cesium = new node("55",null);
		node Barium = new node("56",null);
		node Francium = new node("87",null);
		node Radon = new node("88",null);
		
		
		Hydrogen.setNextNode(Lithium);
		Lithium.setNextNode(Beryllium);
		Beryllium.setNextNode(Sodium);
		Sodium.setNextNode(Magnesium);
		Magnesium.setNextNode(Potassium);
		Potassium.setNextNode(Calcium);
		Calcium.setNextNode(Rubidium);
		Rubidium.setNextNode(Strontium);
		Strontium.setNextNode(Cesium);
		Cesium.setNextNode(Barium);
		Barium.setNextNode(Francium);
		Francium.setNextNode(Radon);
		Radon.setNextNode(null);
		
		printlist(Hydrogen);
	}
	public static void printlist(node start){
		node temp = start;
		System.out.println(temp.data);
		while (temp.nextNode!=null){
			temp=temp.nextNode;
			System.out.println(temp.data);
		}
	}

}
