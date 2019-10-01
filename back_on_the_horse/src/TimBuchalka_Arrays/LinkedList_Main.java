package TimBuchalka_Arrays;

import java.util.ArrayList;
import java.util.LinkedList;

import java.util.Scanner;

public class LinkedList_Main {

	
    // Create a program that implements a playlist for songs
    // Create a Song class having Title and Duration for a song.
    // The program will have an Album class containing a list of songs.
    // The albums will be stored in an ArrayList
    // Songs from different albums can be added to the playlist and will appear in the list in the order
    // they are added.
    // Once the songs have been added to the playlist, create a menu of options to:-
    // Quit,Skip forward to the next song, skip backwards to a previous song.  Replay the current song.
    // List the songs in the playlist
    // A song must exist in an album before it can be added to the playlist (so you can only play songs that
    // you own).
    // Hint:  To replay a song, consider what happened when we went back and forth from a city before we
    // started tracking the direction we were going.
    // As an optional extra, provide an option to remove the current song from the playlist
    // (hint: listiterator.remove()
	
	
	//playlist is your linked list
	
	private static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {

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
		
		
	//	Node First = new Node(null);
//
	//	Node playlist = First;
	//	First.info = addSong("testSong1", "testTime1");
	//	Node second = new Node( addSong("testSong2", "testTime2"), First);
	//	Node n = addToPlaylist(First.next, "testSong2", "testTime2");
	//	Node m = addToPlaylist(First, "testSong3", "testTime3");
	//	Node temp = First;
	//	First = new Node(addSong("testSong2", "testTime2"), temp);
		
		 LinkList theLinkedList = new LinkList();
		 theLinkedList.insertFirstLink(addSong("testSong1", "testSong1"));
		 theLinkedList.insertFirstLink(addSong("testSong2", "testSong2"));
		
		 theLinkedList.display();
		 
		 
		//play(First, AlbumList);
		
	}//end main
	
	private static void play(Node First,ArrayList<Albums> AlbumList){
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
				if(First == null) {
		            System.out.println("No songs in playlist");
		     
		            break;
		        }
	
			
				System.out.println("Now playling: "+First.info.toString());
				
				break;
			case 2: 
		
				currentPos++;
			/*	if(currentPos>=0 && currentPos < playlist.size()){
				
		System.out.println("Now playling: "+playlist.get(currentPos).toString());
				}//end if
				else{
					System.out.println("You have reached the end of the playlist");
					currentPos--;
				}//end else  */
				
                   break;
			
				
			case 3: 
	
				currentPos--;
			/*	if(currentPos>=0 && currentPos < playlist.size()){
				
				System.out.println("Now playling: "+playlist.get(currentPos).toString());
				}//end if
				else{
					System.out.println("You have reached the begining of the playlist");
					currentPos++;
				}//end else  */
                 break;
			
			case 4:
		
				
			//	System.out.println("Now replaying: "+ playlist.get(currentPos).toString() );
				
                   break;
				//System.out.println("Now playing: "+ iterator.previous());
				//replay();
				
			case 5: 
				
			/*	
				if(playlist.size() == 0) {
		            System.out.println("No songs in playlist");
		          //  return;
		            break;
		        }
				printPlaylist(playlist);
				*/
				listSongsInPlaylist( First);
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
			//	addSongToPlaylist(playlist, AlbumList, albNum, trackNum);
				break;
			case 8:
			//	removeFromPlay(playlist, AlbumList);
				break;
			case 9:
				showOptions();
				break;
			}//end switch
		}//end while
	}//end method
	
	private static void ShowAlbum(ArrayList<Albums> albumList) {
		for(int i =0; i<albumList.size();i++){
			System.out.println("Album #: "+i+ " "+ albumList.get(i).toString());
			System.out.println("Songs:");
			for(int j =0;j<albumList.get(i).SongList.size();j++){
				System.out.println("Track: "+j+" "+ albumList.get(i).SongList.get(j).toString());
			}//end internal for
		}//end for
		
	}

	private static Node addToPlaylist(Node first,  String songName, String duration){
		if(first == null){
			first = new Node(addSong(songName,duration),first);
			return first;
		}//end if
		Node p = first;
		while (p.next != null){
			p=p.next;
		}//end while
		p.next = new Node(addSong(songName,duration),first);
	return	p;
		//first.next = temp;
	}//end method
	
	
	
	private static void listSongsInPlaylist(Node first) {
		System.out.println("Songs in playlist:\n");
		System.out.println(first.getInfo());
		System.out.println(first.next.getInfo());
	for(Node p = first; p.next!= null; p = p.next){
		System.out.println(p.info.toString());
		
	}//end for
		
	/*	while(first.next !=null){
			System.out.println(first.info);
			first=first.next;
		}//end while  */
		
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
	private static Albums AddAlbumAnd1stSong (String albumName,String songName, String duration ){
		ArrayList<Song> song = new ArrayList<Song>();
		song.add(addSong(songName, duration));
		Albums album = new Albums(albumName, song);
		
		return album;
		
	}
	
	private static void Forward(Node current){
		current = current.next;
		Node temp= current;
		
		System.out.println(current.info);
	}//end method
	
	

	private static void listSongsInAlbum(Albums album){
		System.out.println("Listed songs: ");
		for(int i =0; i< album.SongList.size();i++){
			System.out.println(album.SongList.get(i).toString());
		}//end for
		
	}//end method
	private static void listSongs(ArrayList<LinkedList<Song>> albumList){
		//testAlbum1     ListIterator<String> listIterator = cities.listIterator();
		System.out.println("Listed songs: ");
		for(int i=0; i<albumList.size();i++){
			//ListIterator<LinkedList<Song>> listIter = albumList.listIterator();
			if(albumList.isEmpty()){
				System.out.println("no songs to play");
			}//end if
			else{
			//	System.out.print(albumList.getClass().getName()+ " *");
				System.out.println(albumList.get(i).toString());
				//System.out.println(listIter.next());
			}//end else
		}//end for
		
	}//end method
	
}//end class
