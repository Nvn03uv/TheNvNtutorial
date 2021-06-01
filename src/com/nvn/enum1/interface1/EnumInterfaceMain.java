package com.nvn.enum1.interface1;

public class EnumInterfaceMain {
	
	public static void main(String[] ar) {
		// runtime polimorfism can be achahive.
		EnumInterface tester = null;
		tester =  EnumImplemetsInterface.abc;
		tester.show();
		
		tester = EnumImplemetsInterface.cde;
		tester.show();
		
		tester = EnumImplemetsInterface.efg;
		tester.show();
		
		tester = EnumImplemetsInterface2.ijk;
		tester.show();
		
		tester = EnumImplemetsInterface2.lmn;
		tester.show();
		
		tester = EnumImplemetsInterface2.opq;
		tester.show();
		
	}
}
