public class LinkNode<T>{
    private T element;
    private LinkNode<T> next;

    LinkNode(T elem , LinkNode<T> nextNode) {
        element = elem;
        next = nextNode;
    }
    LinkNode(LinkNode<T> nextNode) {
        next = nextNode;
    }
    LinkNode<T> next(){
        return next;
    }

    LinkNode<T> setNext(LinkNode<T> nextNode) {
        return next = nextNode;
    }
    T element(){
        return element;
    }
    T set_Element(T elem){
        return element = elem;
    }    
}