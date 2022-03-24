package classList;

import listClassNodes.NodeSimpleLists;
import org.w3c.dom.Node;

public class ListClass {

    private NodeSimpleLists firstNode;
    private NodeSimpleLists lastNode;
    private NodeSimpleLists newNode;
    private int size;

    public ListClass() {

        firstNode = null;
        lastNode = null;
        size = 0;

    }

    public boolean isEmply(){
        return(size == 0);
    }

    public int getSize(){
        return size;
    }

    public void aumentarSize(){
        size++;
    }

    public void mermarSize(){
        size--;
    }

    public ListClass addNode(String data){

        newNode = new NodeSimpleLists(data);

        if(isEmply()){

            firstNode = newNode;
            lastNode = newNode;
            newNode.setPromter(newNode);

        }else {

            lastNode.setPromter(newNode);
            lastNode = newNode;
        }

        aumentarSize();

        return this;

    }

    public ListClass deleteOneNode(){

        if(isEmply()){

            System.out.println("lista vacia");
            return null;
        }else if(getSize()==1){

            lastNode = null;

            firstNode = null;
        }else {

            NodeSimpleLists actual = firstNode;

            while (actual.getPromter() != lastNode){
                actual = actual.getPromter();
            }
            actual.setPromter(null);
            lastNode = actual;

        }

        mermarSize();
        return this;

    }

    public void print(){

        NodeSimpleLists nodoAsistente = firstNode;
        String mensaje = "";


        if (isEmply()){
            System.out.println("Lista vacia");
        }else {

            for(int i = 0;i < getSize();i++){
                mensaje =  mensaje + "-------------------------------------\n";
                mensaje =  mensaje +  "nodo actual: " + nodoAsistente.toString() + "\n";
                mensaje = mensaje + (1+i) + " dato : " + nodoAsistente.getData() + "\n";
                mensaje = mensaje + "apuntador a " +  nodoAsistente.getPromter() +"\n";

                nodoAsistente= nodoAsistente.getPromter();
            }

            System.out.println(mensaje);
        }

    }


}
