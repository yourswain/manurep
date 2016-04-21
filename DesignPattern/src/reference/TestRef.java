package reference;

import java.lang.ref.WeakReference;

public class TestRef {

    public static void main(String[] args) {

        // Initial Strong Ref
        Object obj = new Object();  

        System.out.println("Instance : " + obj);

        // Create a Weak Ref on obj
        WeakReference<Object> weakRef 
                  = new WeakReference<Object>(obj);
        
        // Make obj eligible for GC !
        obj = null;     
        
        
        // Get a strong reference again. Now its not eligible for GC
        Object strongRef = weakRef.get();  
        
        System.out.println("strongRef : " + strongRef);

        // Make the instance eligible for GC again
        strongRef = null;

        // Keep your fingers crossed    
        System.gc();    

        // should be null if GC collected
        System.out.println("Instance : " + weakRef.get()); 
    }
}