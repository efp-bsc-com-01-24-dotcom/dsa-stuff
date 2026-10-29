public class LinkNode<T>{
    private T element;
    private LinkNode next;

    LinkNode(T elem , LinkNode nextNode) {
        element = elem;
        next = nextNode;
    }
    LinkNode(LinkNode nextNode) {
        next = nextNode;
    }
    LinkNode next(){
        return next;
    }

    LinkNode setNext(LinkNode nextNode) {
        return next = nextNode;
    }
    T element(){
        return element;
    }
    T set_Element(T elem){
        return element = elem;
    }    
}