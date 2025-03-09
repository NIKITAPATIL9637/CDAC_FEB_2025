class Solution {

      String name;
	  //Parent
	  Solution(String name){
	      this.name = name;
	  }
	  //Child
	  Solution(Solution obj2){
	      this.name = obj2.name;
	  }

      public static void main(String args[]){
	    Solution s1 = new Solution("Nikita");
		System.out.println("The Constructor 1 is: " + s1.name);
		
		Solution s2 = new Solution(s1);
		System.out.println("The constructor 2 is: " + s2.name);
		
	  }
}