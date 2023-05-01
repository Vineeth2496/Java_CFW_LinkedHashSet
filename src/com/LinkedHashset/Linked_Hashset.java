package com.LinkedHashset;

import java.util.LinkedHashSet;
import java.util.Spliterator;

public class Linked_Hashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet Li=new LinkedHashSet();
		System.out.println("Before JamesBond LinkedList: ");
		Li.add("DR.No");
		Li.add("From Russia with Love");
		Li.add("Golden Finger");
		Li.add("Thunder Ball");
		System.out.println("After JamesBond LinkedList: "+Li);
		//	public java.util.Spliterator<E> spliterator();
		Spliterator s=Li.spliterator();
		s.forEachRemaining((n)-> System.out.println(n));
	}

}
/*

C:\Users\vinee>javap java.util.LinkedHashSet
Compiled from "LinkedHashSet.java"
public class java.util.LinkedHashSet<E> extends java.util.HashSet<E> implements java.util.Set<E>, java.lang.Cloneable, java.io.Serializable {
  public java.util.LinkedHashSet(int, float);
  public java.util.LinkedHashSet(int);
  public java.util.LinkedHashSet();
  public java.util.LinkedHashSet(java.util.Collection<? extends E>);
  public java.util.Spliterator<E> spliterator();
}

C:\Users\vinee>
*/