import static org.junit.jupiter.api.Assertions.*;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.Scanner;

class SEF_MusicApp_Update {

	@Test
    public void testUpdateArtist() throws FileNotFoundException {
		ArrayList<Artist> arrayList=new ArrayList<>();
       String id="685MMMRR_%";
       int index=0;
       String[] art=new String[8];
        Scanner sc=new Scanner(new File("artists.txt"));
        while (sc.hasNextLine())
        {
        	String newLine=sc.nextLine();
        	if (newLine == "")
        	{
        		String[] occupation=art[5].split(",");
        		ArrayList<String> newOccupation=new ArrayList<>();
        		for (String o:occupation )
        		newOccupation.add(o.replace('[', ' ').replace(']', ' ').strip());
        		ArrayList<String> award=new ArrayList<>();
        		String[] awards=art[7].split(",");
        		for (int i=0;i<awards.length-1;i=i+2)
        		{
        			award.add(awards[i].replace('[', ' ').replace(']', ' ').strip()+", "+awards[i+1].replace('[', ' ').replace(']', ' ').strip());
        		}
        		ArrayList<String> genres=new ArrayList<>();
        		String[] genre=art[6].split(",");
        		for (String g:genre)
        			genres.add(g.replace('[', ' ').replace(']', ' ').strip());
        		Artist ar=new Artist(art[0],art[1],art[2],art[3],art[4],newOccupation,genres,award);
        		arrayList.add(ar);
        		art=new String[8];
        		index=0;
        	}
        	else
        	{
        	String Info=newLine.substring(newLine.indexOf(": ")+2);
        	art[index]=Info;
        	index++;
        	}
        }
        for (int i=0;i<arrayList.size();i++)
        {
        	if (arrayList.get(i).getID().equals(id))
        		arrayList.get(i).setAddress("Melbourne|Victoria|Australia");;
        }
        for (int i=0;i<arrayList.size();i++)
        {
        	if (arrayList.get(i).getID().equals(id))
        		assertEquals(true, arrayList.get(i).updateArtist());
        }
       
}
	@Test
    public void testUpdateArtist2() throws FileNotFoundException {
		ArrayList<Artist> arrayList=new ArrayList<>();
       String id="685MMMRR_%";
       int index=0;
       String[] art=new String[8];
        Scanner sc=new Scanner(new File("artists.txt"));
        while (sc.hasNextLine())
        {
        	String newLine=sc.nextLine();
        	if (newLine == "")
        	{
        		String[] occupation=art[5].split(",");
        		ArrayList<String> newOccupation=new ArrayList<>();
        		for (String o:occupation )
        		newOccupation.add(o.replace('[', ' ').replace(']', ' ').strip());
        		ArrayList<String> award=new ArrayList<>();
        		String[] awards=art[7].split(",");
        		for (int i=0;i<awards.length-1;i=i+2)
        		{
        			award.add(awards[i].replace('[', ' ').replace(']', ' ').strip()+", "+awards[i+1].replace('[', ' ').replace(']', ' ').strip());
        		}
        		ArrayList<String> genres=new ArrayList<>();
        		String[] genre=art[6].split(",");
        		for (String g:genre)
        			genres.add(g.replace('[', ' ').replace(']', ' ').strip());
        		Artist ar=new Artist(art[0],art[1],art[2],art[3],art[4],newOccupation,genres,award);
        		arrayList.add(ar);
        		art=new String[8];
        		index=0;
        	}
        	else
        	{
        	String Info=newLine.substring(newLine.indexOf(": ")+2);
        	art[index]=Info;
        	index++;
        	}
        }
        for (int i=0;i<arrayList.size();i++)
        {
        	if (arrayList.get(i).getID().equals(id))
        		arrayList.get(i).setName("kazaki");;
        }
        for (int i=0;i<arrayList.size();i++)
        {
        	if (arrayList.get(i).getID().equals(id))
        		assertEquals(true, arrayList.get(i).updateArtist());
        }
       
}
	@Test
    public void testUpdateArtist3() throws FileNotFoundException {
		ArrayList<Artist> arrayList=new ArrayList<>();
       String id="685MMMRR_%";
       int index=0;
       String[] art=new String[8];
        Scanner sc=new Scanner(new File("artists.txt"));
        while (sc.hasNextLine())
        {
        	String newLine=sc.nextLine();
        	if (newLine == "")
        	{
        		String[] occupation=art[5].split(",");
        		ArrayList<String> newOccupation=new ArrayList<>();
        		for (String o:occupation )
        		newOccupation.add(o.replace('[', ' ').replace(']', ' ').strip());
        		ArrayList<String> award=new ArrayList<>();
        		String[] awards=art[7].split(",");
        		for (int i=0;i<awards.length-1;i=i+2)
        		{
        			award.add(awards[i].replace('[', ' ').replace(']', ' ').strip()+", "+awards[i+1].replace('[', ' ').replace(']', ' ').strip());
        		}
        		ArrayList<String> genres=new ArrayList<>();
        		String[] genre=art[6].split(",");
        		for (String g:genre)
        			genres.add(g.replace('[', ' ').replace(']', ' ').strip());
        		Artist ar=new Artist(art[0],art[1],art[2],art[3],art[4],newOccupation,genres,award);
        		arrayList.add(ar);
        		art=new String[8];
        		index=0;
        	}
        	else
        	{
        	String Info=newLine.substring(newLine.indexOf(": ")+2);
        	art[index]=Info;
        	index++;
        	}
        }
        for (int i=0;i<arrayList.size();i++)
        {
        	if (arrayList.get(i).getID().equals(id))
        		arrayList.get(i).setBirthdate("12-02-1993");;
        }
        for (int i=0;i<arrayList.size();i++)
        {
        	if (arrayList.get(i).getID().equals(id))
        		assertEquals(true, arrayList.get(i).updateArtist());
        }
       
}
	@Test
    public void testUpdateArtist4() throws FileNotFoundException {
		ArrayList<Artist> arrayList=new ArrayList<>();
       String id="685MMMRR_%";
       int index=0;
       String[] art=new String[8];
        Scanner sc=new Scanner(new File("artists.txt"));
        while (sc.hasNextLine())
        {
        	String newLine=sc.nextLine();
        	if (newLine == "")
        	{
        		String[] occupation=art[5].split(",");
        		ArrayList<String> newOccupation=new ArrayList<>();
        		for (String o:occupation )
        		newOccupation.add(o.replace('[', ' ').replace(']', ' ').strip());
        		ArrayList<String> award=new ArrayList<>();
        		String[] awards=art[7].split(",");
        		for (int i=0;i<awards.length-1;i=i+2)
        		{
        			award.add(awards[i].replace('[', ' ').replace(']', ' ').strip()+", "+awards[i+1].replace('[', ' ').replace(']', ' ').strip());
        		}
        		ArrayList<String> genres=new ArrayList<>();
        		String[] genre=art[6].split(",");
        		for (String g:genre)
        			genres.add(g.replace('[', ' ').replace(']', ' ').strip());
        		Artist ar=new Artist(art[0],art[1],art[2],art[3],art[4],newOccupation,genres,award);
        		arrayList.add(ar);
        		art=new String[8];
        		index=0;
        	}
        	else
        	{
        	String Info=newLine.substring(newLine.indexOf(": ")+2);
        	art[index]=Info;
        	index++;
        	}
        }
        for (int i=0;i<arrayList.size();i++)
        {
        	if (arrayList.get(i).getID().equals(id))
        		arrayList.get(i).setBio("This song has become the sensational hit of the year and sold around 1M albums");;
        }
        for (int i=0;i<arrayList.size();i++)
        {
        	if (arrayList.get(i).getID().equals(id))
        		assertEquals(true, arrayList.get(i).updateArtist());
        }
       
}	
}
