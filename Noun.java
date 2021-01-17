package edu.brandeis.cs12b.pa07;

import java.awt.List;
import java.util.*;
import java.io.File;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Noun{
	private String current;
//	private ArrayList<Noun> child;
	private Set <Noun> child;
	//private Noun parent;
	private Set <Noun> parent;
	
	public Noun(String current) {
		this.current=current;
		this.child=new HashSet<Noun>();
	//	this.parent=null;
		this.parent = new HashSet<Noun>();
	}
	
	public void addChild(Noun temp) {
		//temp.parent = this;
		temp.parent.add(this);
		this.child.add(temp);
	}
	
	public String getName() {
		return this.current;
	}
	
	
	
	public boolean check(Noun child) {
		if(child == this) {
			return true;
		}
		
		for (Noun s: this.child) {
			if(s.check(child)) {
				return true;
			}
		}
		return false;
	}
	
	
	
	
	public Set getDirectParent(Noun child) {
		return child.parent;
	}
	
}