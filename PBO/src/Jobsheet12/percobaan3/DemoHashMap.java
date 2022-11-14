package Jobsheet12.percobaan3;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

public class DemoHashMap {
    public static void main(String[]args){
        HashMap hMapItem = new HashMap();
        hMapItem.put("1","Biskuit");
        hMapItem.put("2","Shampo");
        hMapItem.put("3","Soap");
        
        System.out.println(hMapItem);
        
        Collection mCollection = hMapItem.values();
        Iterator mIterator = mCollection.iterator();
        
        while(mIterator.hasNext()) {
            System.out.println(mIterator.next());
        }
        
        System.out.format("HashMap Item Total : %d\n\n",hMapItem.size());
        
        Object nObject = hMapItem.remove("1");
        System.out.format("%s remove from HashMap\n",nObject);
        System.out.format("HashMap Item Total : %d\n",hMapItem.size());
        System.out.println(hMapItem);
        
        hMapItem.clear();
        System.out.format("HashMap Item Total : %d\n",hMapItem.size());
    }
}
