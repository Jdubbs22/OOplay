import java.util.ArrayList;
import java.util.LinkedList;

//The program will have an Album class containing a list of songs.
//   The albums will be stored in an ArrayList
public class Album {

	private String albumName;
	private String artist;
	private ArrayList<Song> songs;  //created an arraylist of song
	
	public Album(String albumName, String artist) {
		this.albumName = albumName;
		this.artist = artist;
		this.songs = new ArrayList<Song>(); //initializes the new arraylist in constructor
											// of class song
		
	}//end constructor
	
	public boolean addSong(String title, double duration) {
        if(findSong(title) == null) {
        	  this.songs.add(new Song(title, duration));
              return true;
        }//end if
        return false;
    }// end addsong
	 
	private Song findSong(String title) {
        for(Song checkedSong: this.songs) { //forEach..creates a variable checkedsongs
										// for each item in the arrayList...done to make things easier to read/abbreviation
        	if(checkedSong.getTitle().equals(title)) { //checking for duplicates
				return checkedSong;
			}//end if
				
		}//end for
		return null; //if null then addsong returns true and thus adds song
	}//end findsong
	
	
	public boolean addToPlayList(int trackNumber, LinkedList<Song> playList) {
        int index = trackNumber -1;
        if((index >0) && (index <= this.songs.size())) {
            playList.add(this.songs.get(index));
            return true;
        }//end if
        System.out.println("This album does not have a track " + trackNumber);
        return false;
    }//end addtoplaylist

    public boolean addToPlayList(String title, LinkedList<Song> playList) {
        Song checkedSong = findSong(title);
        if(checkedSong != null) {
            playList.add(checkedSong);
            return true;
        }//end if
        System.out.println("The song " + title + " is not in this album");
        return false;
    }//end overloaded addtoplaylist
}//end album
