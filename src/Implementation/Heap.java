package Implementation;
import java.util.*;
public class Heap {
    ArrayList<Integer> list=new ArrayList<>();
    public void add(int value) {
        list.add(value);
        upheapify(list.size()-1);
    }

    private void upheapify(int ci) {
        int pi=(ci-1)/2;
        if(list.get(pi)>list.get(ci)){
            swap(ci,pi);
            upheapify(pi);
        }
    }
    public void swap(int i, int j) {
        int ithe=list.get(i);
        int jthe=list.get(j);
        list.set(i,jthe);
        list.set(j,ithe);
    }
    public int remove() {
        swap(0,list.size()-1);
        int rv=list.remove(list.size()-1);
        downheapify(0);
        return rv;
    }

    private void downheapify(int pi) {
        int lci=2*pi+1;
        int rci=2*pi+2;
        int mini=pi;
        if(lci< list.size() && list.get(lci)<list.get(pi)){
            mini=lci;
        }
        if(rci<list.size() && list.get(rci)<list.get(mini)){
            mini=rci;
        }
        if(mini!=pi){
            swap(mini,pi);
            downheapify(mini);
        }
    }

    public int size(){
        return list.size();
    }
    public int minimum(){
        return list.get(0);
    }
    public void Display(){
        System.out.println(list);
    }

}
