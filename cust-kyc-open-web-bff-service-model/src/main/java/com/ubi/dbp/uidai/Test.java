package com.ubi.dbp.uidai;

import java.util.HashSet;
import java.util.Set;

public class Test {

	public static void main(String[] args) {
		Set<String> hs = new HashSet<>();
		hs.add("Abcd");
		hs.add("efg");
		hs.add("abcd");
		String s = new String("Abcd");
		hs.add(s);
		hs.add("Abcdefg");
        System.out.println(hs);
	}

}
