// Delete Columns to make sorted
// link: https://leetcode.com/problems/delete-columns-to-make-sorted/

public class DeleteColumns {
	
	static int minDeletionSize(String[] strs) {
		int count = 0;
		for(int i=0; i<strs[0].length(); i++) {
			for(int j=1; j<strs.length; j++) {
				if(strs[j-1].charAt(i) > strs[j].charAt(i)) {
					count++;
					break;
				}
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		String[] strs = {"zyx","wvu","tsr"};
		System.out.println(minDeletionSize(strs));
	}

}
