package leetcode_top100;

import java.util.HashMap;
import java.util.Map;

public class Solution_Copy_List_With_Random_Pointer {
	
	public RandomListNode copyRandomList(RandomListNode head) {
        
		if(head == null) return null;
		Map<RandomListNode,RandomListNode> map = new HashMap<RandomListNode,RandomListNode>();
		
		RandomListNode node = head;
		while(node != null) {
			map.put(node, new RandomListNode(node.label));
			node = node.next;
		}
		
		node = head;
		while(node != null) {
			map.get(node).next = map.get(node.next);
			map.get(node).random = map.get(node.random);
			node = node.next;
		}
		return map.get(head);
		
    }
}
