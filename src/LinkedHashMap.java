import java.util.ArrayList;

public class LinkedHashMap {
    ArrayList<Node> hashMap = new ArrayList<>(10);
    LinkedList linkedlist = new LinkedList();

    private int hashFunction(int number){
        return number%10;
    }

    public void addNumber(int number){
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int key = linkedHashMap.hashFunction(number);
        if(hashMap.size() == 0){
            for (int i=0;i<10;i++){
                hashMap.add(null);
            }
        }
        if(hashMap.get(key) != null){
            Node head = hashMap.get(key);
            linkedlist.addNode(head,number);
        } else {
            Node head = linkedlist.addNode(null, number);
            hashMap.set(key, head);
        }
    }

    public void display(){
        for(int i=0; i<hashMap.size();i++){
            linkedlist.display(hashMap.get(i));
        }
    }
}
