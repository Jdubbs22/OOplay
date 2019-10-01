package TimBuchalka_Arrays;

import java.util.ArrayList;

// Modify the playlist challenge so that the Album class uses an inner class.
// Instead of using an ArrayList to hold its tracks, it will use an inner class called SongList
// The inner SongList class will use an ArrayList and will provide a method to add a song.
// It will also provide findSong() methods which will be used by the containing Album class
// to add songs to the playlist.
// Neither the Song class or the Main class should be changed.
public class Albums {
	String name;
	
	ArrayList<Song> SongList = new ArrayList<Song>();



	public Albums(String name, ArrayList<Song> songList) {
		super();
		this.name = name;
		SongList = songList;
	}

	public String getName() {
		return name;
	}//end getter
	
	@Override
	public String toString(){
		return " album: "+this.name;
	}//end tostring  
	
	
	//his description  https://www.udemy.com/java-the-complete-java-developer-course/learn/v4/t/lecture/3779664?start=75
	

	private class Songlist{
//	private	ArrayList<Song> SongList;
		private Songlist Songlist;
		
		public Songlist(){
			//this.SongList = new ArrayList<Song>();
			this.Songlist= new Songlist();
		}//end consturctor
		
		public boolean add(Song song){ //tims solution
			if(SongList.contains(song) ){
				return false;
			}//end if
			this.Songlist.add(song);
			return true;
			
		}//end method
		
	/*	private Song findSong(String title){
			for(Song checkedSong: this.Songlist){
				if(checkedSong.getTitle().equals(title)){
					return checkedSong;
				}//end if
			}//end for
			
			return null;
		}//end method  */
		
		public Song findSong(int trackNumber){
			int index = trackNumber-1;
			if((index >=0) && (index<SongList.size())){
				return SongList.get(index);
			}//end if
			return null;
		}//end method
		
	}//end inner class
	
}//end class
