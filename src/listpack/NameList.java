package listpack;

import iteratorpack.getIterator;
import iteratorpack.Iterator;

public class NameList implements getIterator {

	public String names[]={"loga","nathan"};
	public Iterator getIterators() {
		
		return new NameIterator();
	}
	 private class NameIterator implements Iterator {

	      int index;

	      @Override
	      public boolean hasNext() {
	      
	         if(index < names.length){
	            return true;
	         }
	         return false;
	      }

	      @Override
	      public Object next() {
	      
	         if(this.hasNext()){
	            return names[index++];
	         }
	         return null;
	      }		
	   }
}