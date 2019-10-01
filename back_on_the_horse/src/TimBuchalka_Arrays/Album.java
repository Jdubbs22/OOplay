package TimBuchalka_Arrays;

import java.util.LinkedList;

public class Album {
	
	String name;
	
	LinkedList<Song> SongList = new LinkedList<Song>();

	public Album(String name) {
		super();
		this.name = name;
	//	SongList = songList;
		
	}//end constructor

	public String getName() {
		return name;
	}//end getter
	
	@Override
	public String toString(){
		return " album: "+this.name;
	}//end tostring  
	
	

}//end class
