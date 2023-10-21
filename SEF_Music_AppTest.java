import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class SEF_Music_AppTest {

	@Test //Test 1:Correct Test Case 1
	void test() {
    	ArrayList<String> occupation=new ArrayList<>();
    	ArrayList<String> genres=new ArrayList<>();
    	ArrayList<String> awards=new ArrayList<>();
    	occupation.add("singer");
    	occupation.add("song writer");
    	genres.add("pop");
    	genres.add("jazz");
    	awards.add("2020, Best song written for visual media");
		Artist ar=new Artist("569MMMRR_%","Hari","Melbourne|Victoria|Australia","12-10-1999","He is an great singer and song writer in 21st century",occupation,genres,awards);
		assertEquals(true, ar.AddArtist());
	}
	@Test//Test 2:Correct Test Case 2
	void test2() {
    	ArrayList<String> occupation=new ArrayList<>();
    	ArrayList<String> genres=new ArrayList<>();
    	ArrayList<String> awards=new ArrayList<>();
    	occupation.add("singer");
    	occupation.add("lyricist");
    	genres.add("pop");
    	genres.add("jazz");
    	awards.add("2023, Best Singer of the year");
		Artist ar=new Artist("697MMMRR_%","Martin","Sydney|South Wales|Australia","31-10-1999","He sang the song Cardigan which became a sensational hit of the year",occupation,genres,awards);
		assertEquals(true, ar.AddArtist());
	}
	
	@Test//Test 3:Wrong Test Case 1( The id  number is specified below 5)
	void test3() {
    	ArrayList<String> occupation=new ArrayList<>();
    	ArrayList<String> genres=new ArrayList<>();
    	ArrayList<String> awards=new ArrayList<>();
    	occupation.add("Music Producer");
    	occupation.add("Singer");
    	genres.add("retro");
    	genres.add("jazz");
    	awards.add("2001, Best Music Director");
		Artist ar=new Artist("143MMMRR_%","Billie","Geelong|Victoria|Australia","31-09-1989","She composed Fly me to the moon song and made some amazing songs with pop",occupation,genres,awards);
		assertEquals(false, ar.AddArtist());
	}
	@Test//Test 4:Correct Test Case
	void test4() {
    	ArrayList<String> occupation=new ArrayList<>();
    	ArrayList<String> genres=new ArrayList<>();
    	ArrayList<String> awards=new ArrayList<>();
    	occupation.add("Lyricist");
    	occupation.add("Playback");
    	genres.add("pop");
    	genres.add("jazz");
    	awards.add("2005, Best Lyricist of the year");
		Artist ar=new Artist("685MMMRR_%","Jack","Geelong|Victoria|Australia","31-12-1989","She wrote the song Everything I wanted and Lovely and Ecstasy",occupation,genres,awards);
		assertEquals(true, ar.AddArtist());
	}
	@Test//Test 5:Wrong Test Case (The awards name is less than 4 letters)
	void test5() {
    	ArrayList<String> occupation=new ArrayList<>();
    	ArrayList<String> genres=new ArrayList<>();
    	ArrayList<String> awards=new ArrayList<>();
    	occupation.add("Lyricist");
    	occupation.add("Playback");
    	genres.add("pop");
    	genres.add("jazz");
    	awards.add("2022, Bes");
		Artist ar=new Artist("667MMMRR_%","Kane","Geelong|Victoria|Australia","31-09-1999","He composed Javelin song and made some amazing songs with pop",occupation,genres,awards);
		assertEquals(false, ar.AddArtist());
	}
	@Test//Test 6:Correct Test Case
	void test6() {
    	ArrayList<String> occupation=new ArrayList<>();
    	ArrayList<String> genres=new ArrayList<>();
    	ArrayList<String> awards=new ArrayList<>();
    	occupation.add("Singer");
    	occupation.add("Music Director");
    	occupation.add("Sound Engineer");
    	genres.add("retro");
    	genres.add("pop");
    	awards.add("2021, Best Sound Engineering in the year");
		Artist ar=new Artist("695MMMRR_%","Resul","Melbourne|Victoria|Australia","23-06-1989","He Mixed sound and engineered for lots of movies like Pirates,She,Kraken etc.",occupation,genres,awards);
		assertEquals(true, ar.AddArtist());
	}


}
