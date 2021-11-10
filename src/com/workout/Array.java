package com.workout;

import java.util.HashSet;
import java.util.Set;

public class Array {

	public static void main(String[] args) {
		int a[] = { 1, 2, 2, 3, 4, 5, 5, 3, 2 };
		System.out.println(a);
		Set<Integer> s = new HashSet<Integer>();
		for (int c : a) {
			s.add(c);
		}
	}
}