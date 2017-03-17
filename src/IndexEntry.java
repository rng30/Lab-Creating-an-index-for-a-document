import java.util.*;
public class IndexEntry{
	
	private String word;
	private ArrayList<Integer> numsList;
	
	public IndexEntry(String w, ArrayList<Integer> n){
		word = w.toUpperCase();
		numsList = n;
	}
	
	public void add(int num){
		if (numsList.contains(num) == false){
			numsList.add(num);
		}
	}
	
	public String getWord(){
		return word;
	}
	
	public String toString(){
		return word + " " + numsList;
	}
}