package Demo;

import iteratorpack.Iterator;
import listpack.NameList;

public class Demo {
	
	 public static void main(String[] args) {
	      NameList namesRepository = new NameList();

	     
	      Iterator it=namesRepository.getIterators();
	      
	      while (it.hasNext()) {
			
	    	  System.out.println(it.next());
			
		}
	      
	   }

}
