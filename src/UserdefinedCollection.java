public class UserdefinedCollection {
	
	private String name;
	private String address;
	private String city;
	private String pincode;
	
	UserdefinedCollection(String n, String a, String c, String p){
		name=n;
		address=a;
		city=c;
		pincode=p;
	}	
	
	public String toString(){
		return name+"\n"+address+"\n"+city+" "+pincode;		
	}
}
