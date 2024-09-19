
public class Artist{

	private String name;

	Artist(String naam){
		
		this.name = naam;

	}

	public void setName(String naam){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void displayInfo(){
		System.out.println("Artist Name: "+name);
	}

}