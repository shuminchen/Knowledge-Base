package edu.brandeis.cs12b.pa07;
import java.util.*;
public class KnowledgeBase {
	Map <String, Noun> knowledgeBase =  new HashMap<String, Noun>(); 
	/**
	 * Store an 'is a' relationship in your knowledge base
	 * @param type to store
	 * @param supertype to store
	 */
	public void storeIsA(String type, String supertype) {
		// TODO implement me!
		Noun parent = new Noun(supertype);
		Noun child = new Noun(type);
		
		if(knowledgeBase.containsKey(type)) {
			child = knowledgeBase.get(type);
		}
		if(knowledgeBase.containsKey(supertype)) {
			parent = knowledgeBase.get(supertype);
		}
		parent.addChild(child);
		knowledgeBase.put(type, child);
		knowledgeBase.put(supertype, parent);
	
	}
	
	/**
	 * Check to see if a type is a child of a supertype
	 * @param type to check
	 * @param supertype to check
	 * @return true if type is a child of supertype, false otherwise,
	 * or if either type or supertype is not stored in the KnowledgeBase
	 */
	public boolean isA(String type, String supertype) {
		// TODO implement me!
	
		if(!knowledgeBase.containsKey(type) || !knowledgeBase.containsKey(supertype)) {
			return false;
		}
		Noun child = knowledgeBase.get(type);
		Noun parent = knowledgeBase.get(supertype);
		if(parent.check(child)) {
			return true;
		}

		return false;
	}
	
	

	
	
	
	
	
	
	
	
	
	
//  ____________________EXTRA CREDIT BELOW THIS LINE____________________________
 
	
	/**
	 * EXTRA CREDIT: Write a method that checks to see if two objects stored
	 * in the KnowledgeBase are siblings (See assignment PDF for details)
	 * @param typeOne to check
	 * @param typeTwo to check
	 * @return true if both types are siblings, false if not or if either
	 * type is not stored in the KnowledgeBase
	 */
	public boolean isSiblingOf(String typeOne, String typeTwo){
		//If you decided not to implement this part, don't touch the line below.
		//If you decided to implement this part, remove the next line and implement your solution.
	//	throw new UnsupportedOperationException("Bonus question isSiblingOf not implemented");
		
		if(!knowledgeBase.containsKey(typeOne) || !knowledgeBase.containsKey(typeTwo)) {
			return false;
		}
		
		Noun childOne = knowledgeBase.get(typeOne);
		Noun childTwo = knowledgeBase.get(typeTwo);
		Set<Noun> directParentOne = childOne.getDirectParent(childOne);
		Set<Noun> directParentTwo = childTwo.getDirectParent(childTwo);
		if(directParentOne == null||directParentTwo == null) {
			return false;
		}
		
		for(Noun i: directParentOne) {
			if (directParentTwo.contains(i)) {
				return true;
			}
		}
		return false;

	/*	
		Noun directParentOne = childOne.getDirectParent(childOne);
		Noun directParentTwo = childTwo.getDirectParent(childTwo);
		if(directParentOne == null||directParentTwo == null) {
			return false;
		}
		if(directParentOne == directParentTwo) {
			return true;
		}
		
		return false;
	*/	
	}	
	

	
	/**
	 * EXTRA CREDIT: Write a method that finds the path from a root of your KnowledgeBase
	 * to the specified type (See assignment PDF for details)
	 * @param type that should be the end of the path
	 * @return as String of the following form:
	 * "rootName -> childOfRoot -> secondLevelChild -> type \n
	 * rootTwoName -> childOfRoot -> secondLevelChild -> type"
	 */
	public String findPaths (String type){
		//If you decided not to implement this part, don't touch the line below.
		//If you decided to implement this part, remove the next line and implement your solution.
		throw new UnsupportedOperationException("Bonus question findPaths not implemented");
	}
	
	/**
	 * EXTRA CREDIT: Modify your KnowledgeBase so that it can handle hasA relationships
	 * as well as the normal isA relationships. (See assignment PDF for details)
	 * @param supertype to store
	 * @param type to store
	 */
	public void storeHasA(String supertype, String type){
		//If you decided not to implement this part, don't touch the line below.
		//If you decided to implement this part, remove the next line and implement your solution.
		throw new UnsupportedOperationException("Bonus question storeHasA not implemented");

	}
	
	/**
	 * EXTRA CREDIT: Modify your KnowledgeBase so that it can handle hasA relationships
	 * as well as the normal isA relationships. (See assignment PDF for details)
	 * @param supertype to check
	 * @param type to check
	 * @return true if supertype has a type, false otherwise
	 */
	public boolean hasA(String superType, String type){
		//If you decided not to implement this part, don't touch the line below.
		//If you decided to implement this part, remove the next line and implement your solution.
		throw new UnsupportedOperationException("Bonus question hasA not implemented");

	}


}
