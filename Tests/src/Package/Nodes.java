package Package;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Nodes {
	private Map<Integer, HashSet<Integer>> valueFriends;
	
	public Nodes() {
		valueFriends = new HashMap<Integer, HashSet<Integer>>(); 
	}

	public Map<Integer, HashSet<Integer>> getValueFriends() {
		return valueFriends;
	}

	public void setValueFriends(int key) {
		valueFriends.put(key, new HashSet<Integer>());
	}
	
	public void UnionValues(int firstV, int secondV) {
		if (valueFriends.containsKey(firstV) && valueFriends.containsKey(secondV)) {
			valueFriends.get(firstV).add(secondV);
			valueFriends.get(secondV).add(firstV);
		}
	}

	public boolean Find(int firstValue1, int secondValue1) {
		if (valueFriends.containsKey(firstValue1) && valueFriends.containsKey(secondValue1)) {
			if (valueFriends.get(firstValue1).contains(secondValue1)) {
				return true;
			} else return false;
		}
		return false;
	}
}
