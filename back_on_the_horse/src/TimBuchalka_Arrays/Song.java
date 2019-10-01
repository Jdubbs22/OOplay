package TimBuchalka_Arrays;

public class Song {

	String title;
	String duration;
	
	public Song(String title, String duration) {
		super();
		this.title = title;
		this.duration = duration;
	}//end constructor

	public String getTitle() {
		return title;
	}//end getter
	
	public String getDuration(){
		return duration;
	}//end getter
	
	@Override
	public String toString(){
		return  this.title+ " : "+ this.duration;
	}//end tostring  
	
	
	
	
	
}//end method
