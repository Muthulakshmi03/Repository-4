package org.phone;

public class InternalStorage {
	
	void processorName() {
		
		System.out.println("Processdor name is Intel");
	}
	
	void ramSize() {
		System.out.println("Ram size is 1GB");
	}
	
	
	 public static void main(String[] args) {
		
		 InternalStorage i= new InternalStorage();
		 ExternalStorage e= new ExternalStorage();
			
		 e.size();
		 i.processorName();
		 i.ramSize();
		 
	}
	
	

}
