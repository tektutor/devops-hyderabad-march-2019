package org.tektutor;

public class Main {

	public String printModuleName() {
		System.out.println ( "Main module" );
		return "Main module";
	}

	public static void main ( String[] args ) {
	
		FrontEnd fe = new FrontEnd();
		BusinessLayer bl = new BusinessLayer();
		DataAccessLayer dal = new DataAccessLayer();
		Main main = new Main();

		System.out.println ( fe.printModuleName() );
		System.out.println ( bl.printModuleName() );
		System.out.println ( dal.printModuleName() );

		System.out.println ( main.printModuleName() );
		
		
	}

}
