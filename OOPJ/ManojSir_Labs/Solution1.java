class Solution1 {

      String name;
	  int number;
	  String address;
	  //Parent
	  Solution1(String name, int number, String address){
	      this.name = name;
		  this.number = number;
		  this.address = address;
	  }
//Child
	  /*Solution1(Solution obj2){
	      this.name = obj2.name;
		  this.number = obj2.number;
	  }*/

      public static void main(String args[]){
	    Solution1 s1 = new Solution1("Nikita", 88);
		System.out.println("The Constructor 1 is: " + s1.name + s1.number + s1.address);
		
		/*Solution1 s2 = new Solution1(s1);
		System.out.println("The constructor 2 is: " + s2.name);*/
		
	  }
}