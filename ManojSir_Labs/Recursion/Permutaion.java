class Permutaion1{
	
	static void display(String str, String result){
		if(str.length() == 0){
			System.out.println(result + "");
			return;
		}for(int i=0; i<str.length(); i++){
			char ch = str.charAt(i);
			String res = str.substring(0,i) + str.substring(i+1);
			display(res, result + ch);
		}
	}
	
	public static void main(String args[]){
		String s = "ABC";
		display(s,"");
	}
}