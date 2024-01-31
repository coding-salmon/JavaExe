package ch08.class09.Ex4;

public class SongMain {
	public static void songInfo(Song song) {
	 
			System.out.println("노래제목:" + song.getTitle());
			System.out.println("가수:"+ song.getArtist());
			System.out.println("앨범제목:"+ song.getAlbum());
			System.out.println("작곡가:"+song.getComposer());
			System.out.println("발표연도:"+song.getYear());
			System.out.println("앨범트랙번호:" +song.getTrack());
	}
	
	
	public static void main(String[] args) {
		
	
		
		Song song = new Song();
		song.setTitle("Dancing Queen");
		song.setArtist("ABBA");
		song.setAlbum("Queen");
		song.setComposer("noname");
		song.setYear(1999);
		song.setTrack(123);
		songInfo(song);
		
	}

}

