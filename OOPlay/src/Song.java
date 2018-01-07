

//Create a Song class having Title and Duration for a song.
public class Song {
	private String title;
    private double duration;

    public Song(String title, double duration) {
        this.title = title;
        this.duration = duration;
    }//end constructor
	
	
	@Override  //source, overide, object,toString
	public String toString() { //changed the tostring to the return statement
		// TODO Auto-generated method stub
		return this.title+": "+this.duration;
	}//end tostring

	public String getTitle() {
		return title;
	}//end getter


	

	

	
	
	
	
}//end song class
