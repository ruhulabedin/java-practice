package com.java.map;

import java.util.HashMap;

public class maptest {
	public static void main(String[] args) {
		HashMap<String, String> acctyp = new HashMap<String, String>();
		acctyp.put("'Open'", "ACCTYP 01");
		acctyp.put("'Sheltered'", "ACCTYP 02");
		HashMap<String, HashMap<String, String>> gens = new HashMap<String, HashMap<String, String>>();
		gens.put("'GEN01'", acctyp);
	}
}
