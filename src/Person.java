
public class Person implements Comparable<Person>{

	String fName;
	String lName;
	
	public Person(String fullName){
		
		char[] cArr = fullName.toCharArray();
		int index = 0;
		
		for (int i = 0; i < cArr.length; i++) {
			
			if(cArr[i] == ' '){
				index = i;
			}
			
		}
		
		this.fName = fullName.substring(index + 1);
		this.lName = fullName.substring(0, index);
		
		
		
	}
	
	
	@Override
	public int compareTo(Person o) {

		String srg1 = fName.substring(0,2);
		String srg2 = lName.substring(0,2);
				
		if(srg2.compareTo(o.lName) == 0){
			
			return srg1.compareTo(o.fName);
			
		}else{
			
			return srg1.compareTo(o.lName);
			
		}

	}
	
	
	
	public String getFullName() {
		return lName + " " + fName;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}






	
	
	
	
	
	
}
