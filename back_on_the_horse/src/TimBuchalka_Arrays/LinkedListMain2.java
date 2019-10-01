package TimBuchalka_Arrays;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;


public class LinkedListMain2 {

	private static Scanner scanner = new Scanner(System.in);
	
	public static void main (String[]args){
		
		ArrayList<Albums> AlbumList = new ArrayList<Albums>();
		ArrayList<Song> PHMsongList = new ArrayList<Song>();
		
		Albums PrettyHateMachine = new Albums("Pretty Hate Machine", PHMsongList);
		AlbumList.add(PrettyHateMachine);
		ArrayList<Song> TDSsongList = new ArrayList<Song>();
		Albums TheDownwardSpiral = new Albums("The Downward Spiral", TDSsongList);
		AlbumList.add(TheDownwardSpiral);
		
		PHMsongList.add(addSong("Head Like a hole", "3:53"));
		PHMsongList.add(addSong("terrible lie","4:53"));
		PHMsongList.add(addSong("down in it","5:53"));
		PHMsongList.add(addSong("sanctified","6:53"));
		PHMsongList.add(addSong("something I can never have","7:53"));
		PHMsongList.add(addSong("kinda I want to","8:53"));
		
		TDSsongList.add(addSong("mr self destruct","4:30"));
		TDSsongList.add(addSong("piggy","5:30"));
		TDSsongList.add(addSong("heresy","6:30"));
		TDSsongList.add(addSong("march of the pigs","7:30"));
		TDSsongList.add(addSong("closer","8:30"));
		TDSsongList.add(addSong("ruiner","9:30"));
		
		LinkedList<Song> playlist = new LinkedList<Song>();
/*		playlist.add(addSongFromAlbum(AlbumList, 0, 0));
		playlist.add(addSongFromAlbum(AlbumList, 0, 4));
		playlist.add(addSongFromAlbum(AlbumList, 0, 1));
		playlist.add(addSongFromAlbum(AlbumList, 1, 3));
		playlist.add(addSongFromAlbum(AlbumList, 1, 5));
		playlist.add(addSongFromAlbum(AlbumList, 1, 1));  */
	
		play(playlist, AlbumList);
			
	}//end main
	
	
	private static void play(LinkedList<Song> playlist,ArrayList<Albums> AlbumList){
	
	ListIterator<Song> iterator =  playlist.listIterator();
		
		//ShowAlbum(AlbumList);
		boolean forward = true;
		boolean quit = false;
		showOptions();
		int currentPos =0;
		while (quit ==false){
			int choice = scanner.nextInt();
			
			scanner.nextLine();
			Song current;
			switch(choice){
			case 0:
				System.out.println("Shutting down...");
				quit= true;
				break;
			case 1:
				if(playlist.size() == 0) {
		            System.out.println("No songs in playlist");
		          //  return;
		            break;
		        }
				//PlaySong(playlist);
			//	current =  iterator.next();
		//		 System.out.println("Now playing: "+iterator.next() );
		
				//System.out.println("Now playing: "+ current);
			
				System.out.println("Now playling: "+playlist.get(currentPos).toString());
				
				break;
			case 2: 
		/*		 if(!forward) {//if user previously chosen back
                       if(iterator.hasNext()) {
                           iterator.next();
                       }
                       forward = true;
                   }
                   if(iterator.hasNext()) {
                       System.out.println("Now playing " + iterator.next().toString());
                   } else {
                       System.out.println("We have reached the end of the playlist\n"+"Please press 3 to go backward");
                       forward = false;
                   }  */
				currentPos++;
				if(currentPos>=0 && currentPos < playlist.size()){
				
		System.out.println("Now playling: "+playlist.get(currentPos).toString());
				}//end if
				else{
					System.out.println("You have reached the end of the playlist");
					currentPos--;
				}//end else
				
                   break;
			//	System.out.println("Now playing: "+ iterator.next());
				//skipForward(playlist);
				
			case 3: 
			/*	 if(forward) {//if currently going forward
                     if(iterator.hasPrevious()) {
                         iterator.previous();
                     }
                     forward = false;
                 }
                 if(iterator.hasPrevious()) {
                     System.out.println("Now playing " + iterator.previous().toString());
                 } else {
                     System.out.println("We are at the start of the playlist\n"+ "please press 1 to play");
                     forward = true;
                 }  */
				currentPos--;
				if(currentPos>=0 && currentPos < playlist.size()){
				
				System.out.println("Now playling: "+playlist.get(currentPos).toString());
				}//end if
				else{
					System.out.println("You have reached the begining of the playlist");
					currentPos++;
				}//end else
                 break;
				//iterator.previous();
				//System.out.println("Now playing: "+ iterator.previous());
				//skipBackward();
				
			case 4:
				 /*  if(forward) {
                       if(iterator.hasPrevious()) {
                           System.out.println("Now replaying " + iterator.previous().toString());
                           forward = false;
                       } else {
                           System.out.println("We are at the start of the list");
                       }
                   } 
				  else {
                         if(iterator.hasNext()) {
                           System.out.println("Now replaying " + iterator.next().toString());
                           forward = true;
                       } else {
                           System.out.println("We have reached the end of the list");
                       }
                   }  */
				
				System.out.println("Now replaying: "+ playlist.get(currentPos).toString() );
				
                   break;
				//System.out.println("Now playing: "+ iterator.previous());
				//replay();
				
			case 5: 
				if(playlist.size() == 0) {
		            System.out.println("No songs in playlist");
		          //  return;
		            break;
		        }
				printPlaylist(playlist);
				break;
			case 6: 
				ShowAlbum(AlbumList);
				break;
			case 7:
				System.out.println("Chose and album Number");
				int albNum = scanner.nextInt();
				scanner.nextLine();
				System.out.println("choose a track number");
				int trackNum = scanner.nextInt();
				scanner.nextLine();
				addSongToPlaylist(playlist, AlbumList, albNum, trackNum);
				break;
			case 8:
				removeFromPlay(playlist, AlbumList);
				break;
			case 9:
				showOptions();
				break;
			}//end switch
		}//end while
	}//end method
	
	private static void skipForward(LinkedList<Song> playlist) {
		
		
	}

	private static void removeFromPlay(LinkedList<Song> playlist,ArrayList<Albums> AlbumList) {
		System.out.println("Choose which track to remove from the following: ");
		printPlaylist(playlist);
		int choice;
		choice = scanner.nextInt();
		scanner.nextLine();
		playlist.remove(choice);
		
	}

	private static void addSongToPlaylist(LinkedList<Song> playlist,ArrayList<Albums> AlbumList, int album, int song){
		playlist.add(addSongFromAlbum(AlbumList, album, song));
	}
	
	private static void PlaySong(LinkedList<Song> playlist) {
		
		System.out.println("Now Playing: "+ playlist.indexOf(0));  //.getFirst().toString());
	}//end method

	private static void showOptions() {
		System.out.println("Options\n"
				+ "0 to shut down\n"
				+ "1 to play song\n"
				+ "2 to skip forward one track\n"+
				"3 to skip backward one track\n"+
				"4 to replay the same track\n"+
				"5 to list songs in playlist\n"+
				"6 to show available songs to add to playlist\n"+
				"7 to add to playlist\n"+
				"8 to remove from playlist\n"+
				"9 to show options again\n");
		
	}//end method

	private static Song addSong( String songName, String duration){
		return new Song(songName,duration);
	}//end method
	
	private static void ShowAlbum(ArrayList<Albums> AlbumList){
		for(int i =0; i<AlbumList.size();i++){
			System.out.println("Album #: "+i+ " "+ AlbumList.get(i).toString());
			System.out.println("Songs:");
			for(int j =0;j<AlbumList.get(i).SongList.size();j++){
				System.out.println("Track: "+j+" "+ AlbumList.get(i).SongList.get(j).toString());
			}//end internal for
		}//end for
	}//end method
	
	private static Song addSongFromAlbum(ArrayList<Albums> AlbumList, int albIndex, int songIndex){
		return AlbumList.get(albIndex).SongList.get(songIndex);
	}//end method
	
	private static void printPlaylist( LinkedList<Song> playlist){
		Iterator<Song> iterator = playlist.iterator();
		System.out.println("========== playlist ===========");
		int postion=0;
		while(iterator.hasNext()){
			
			System.out.print("Track #: " + postion+ " ");
			System.out.println( iterator.next());
			postion++;
		}//end while
		System.out.println("======= end of playlist =====");
	}//end method
	
}//end class