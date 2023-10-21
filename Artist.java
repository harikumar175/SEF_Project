
import java.util.ArrayList;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.*;

public class Artist {

	    private String ID;
	    private String Name;
	    private String Address;
	    private String Birthdate;
	    private String Bio;
	    private ArrayList<String> Occupations;
	    private ArrayList<String> Genres;
	    private ArrayList<String> Awards;

		public Artist(String iD, String name, String address, String birthdate, String bio, ArrayList<String> occupations,
				ArrayList<String> genres, ArrayList<String> awards) {
			super();
			ID = iD;
			Name = name;
			Address = address;
			Birthdate = birthdate;
			Bio = bio;
			Occupations = occupations;
			Genres = genres;
			Awards = awards;
		}
		
		
		
		public String getID() {
			return ID;
		}
		public void setID(String iD) {
			ID = iD;
		}
		public String getName() {
			return Name;
		}



		public void setName(String name) {
			Name = name;
		}



		public String getAddress() {
			return Address;
		}



		public void setAddress(String address) {
			Address = address;
		}



		public String getBirthdate() {
			return Birthdate;
		}



		public void setBirthdate(String birthdate) {
			Birthdate = birthdate;
		}



		public String getBio() {
			return Bio;
		}



		public void setBio(String bio) {
			Bio = bio;
		}



		public ArrayList<String> getOccupations() {
			return Occupations;
		}



		public void setOccupations(ArrayList<String> occupations) {
			Occupations = occupations;
		}



		public ArrayList<String> getGenres() {
			return Genres;
		}



		public void setGenres(ArrayList<String> genres) {
			Genres = genres;
		}



		public ArrayList<String> getAwards() {
			return Awards;
		}



		public void setAwards(ArrayList<String> awards) {
			Awards = awards;
		}



		private boolean is_valid_artist_id(String artistID) {
	        return artistID.matches("[5-9]{3}[A-Z]{5}[!@#$%^&*()_+]{2}");
	    }
	    
	    private boolean is_valid_birth_date(String birthDate) {
	        return birthDate.matches("\\d{2}-\\d{2}-\\d{4}");
	    }
	    
	    private boolean is_valid_address(String address) {
	        return address.matches("[^|]+\\|[^|]+\\|[^|]+");
	    }
	    
	    private boolean is_valid_bio(String bio) {
	        int wordCount = bio.split("\\s+").length;
	        return wordCount >= 10 && wordCount <= 30;
	    }
	    
	    private boolean is_valid_occupations(ArrayList<String> occupations) {
	        return !occupations.isEmpty() && occupations.size() <= 5;
	    }
	    
	    private boolean is_valid_awards(ArrayList<String> awards) {
	        if (awards.isEmpty()) {
	            return true;
	        }

	        for (String award : awards) {
	            String[] parts = award.split(",");
	            if (parts.length != 2) {
	                return false;
	            }

	            String year = parts[0].trim();
	            String title = parts[1].trim();
	            String[] ti=title.split(" ");

	            if (year.matches("\\d{4}") == false || (ti.length > 3 && ti.length <= 10) == false) {
	                return false;
	            }
	        }

	        return awards.size() <= 3;
	    }
	    
	    private boolean is_valid_genres(ArrayList<String> genres) {
	        if (genres.isEmpty() || genres.size() > 5) {
	            return false;
	        }

	        if (genres.contains("pop") && genres.contains("rock")) {
	            return false;
	        }

	        return true;
	    }
	    private boolean isArtistInfoValid() {
	        return (ID != null && Name != null && Address != null && Birthdate != null
	                && Bio != null && Occupations != null && Genres != null && Awards != null);
	    }
	    private boolean isBornBefore2000() {
	        int birthYear = Integer.parseInt(Birthdate.substring(6));
	        return birthYear < 2000;
	    }


	    private boolean hasAwardsBefore2000() {
	        for (String award : Awards) {
	            int awardYear = Integer.parseInt(award.split(",")[0].trim());
	            if (awardYear < 2000) {
	                return true;
	            }
	        }
	        return false;
	    }
	    
	    public boolean AddArtist() {

	        if (
	            is_valid_artist_id(ID) &&
	            is_valid_birth_date(Birthdate) &&
	            is_valid_address(Address) &&
	            is_valid_bio(Bio) &&
	            is_valid_occupations(Occupations) &&
	            is_valid_awards(Awards) &&
	            is_valid_genres(Genres)

	        ) {

	        	try {
	        		File f=new File("artists.txt");
	        		f.createNewFile();
	                FileWriter writer = new FileWriter(f, true);
	                writer.write("Artist ID: " + ID + "\n");
	                writer.write("Name: " + Name + "\n");
	                writer.write("Birth Date: " + Birthdate + "\n");
	                writer.write("Address: " + Address + "\n");
	                writer.write("Bio: " + Bio + "\n");
	                writer.write("Occupations: " + String.join(", ", Occupations) + "\n");
	                writer.write("Awards: " + String.join(", ", Awards) + "\n");
	                writer.write("Genres: " + String.join(", ", Genres) + "\n");
	                writer.write("\n");  
	                writer.close();
	                return true;
	            } catch (IOException e) {
	                System.err.println("An error occurred while writing to the file.");
	                e.printStackTrace();
	            }
	        }
	        return false;
	    }
	    public boolean updateArtist() {
	    
	        if (isArtistInfoValid() &&
	                is_valid_artist_id(ID) &&
	                is_valid_birth_date(Birthdate) &&
	                is_valid_address(Address) &&
	                is_valid_bio(Bio) &&
	                is_valid_occupations(Occupations) &&
	                is_valid_awards(Awards) &&
	                is_valid_genres(Genres))
	               // && !isBornBefore2000() &&
	               // !hasAwardsBefore2000()) 
	        {
	        	try {
	        		BufferedReader reader = new BufferedReader(new FileReader("artists.txt"));
	                String line;
	                StringBuilder fileContent = new StringBuilder();

	               // boolean artistFound = false;

	                while ((line = reader.readLine()) != null) {
	                    if (line.startsWith("Artist ID: " + ID)) 
	                    {
//	                        if (Bio != null && !Bio.isEmpty()) {
//	                            fileContent.append("Bio: ").append(Bio).append("\n");
//	                        } else {
//	                            fileContent.append(line).append("\n");
//	                        }
//
//	                        if (Awards != null && !Awards.isEmpty()) {
//	                            fileContent.append("Awards: ").append(String.join(", ", Awards)).append("\n");
//	                        } else {
//	                            fileContent.append(line).append("\n");
//	                        }
//
//	                        artistFound = true;
	                    	String id=line.substring(line.indexOf(": ")+2);
	                    	if (id.equals(ID))
	                    	{
	                    		fileContent.append("Artist ID: ").append(ID).append("\n");
	                    		fileContent.append("Name: ").append(Name).append("\n");
	                    		fileContent.append("Address: ").append(Address).append("\n");
	                    		fileContent.append("Birthdate: ").append(Birthdate).append("\n");
	                    		fileContent.append("Bio: ").append(Bio).append("\n");
	                    		fileContent.append("Occupations: ").append(Occupations).append("\n");
	                    		fileContent.append("Genres: ").append(Genres).append("\n");
	                    		fileContent.append("Awards: ").append(Awards).append("\n");
	                    		for (int i=0;i<7;i++)
	                    		line = reader.readLine();
	                    	}
	                    	else
	                    		 fileContent.append(line).append("\n");
	                    } 
	                    else {
	                        fileContent.append(line).append("\n");
	                    }
	                }

	                reader.close();
	              //  if (artistFound) {
	                    FileWriter writer = new FileWriter("artists.txt");
	                    writer.write(fileContent.toString());
	                    writer.close();
	                    return true;
//	                } else {
//	                    // Artist with the given ID was not found
//	                    return false;
	    
	            } catch (IOException e) {
	                System.err.println("An error occurred while writing to the file.");
	                e.printStackTrace();
	            }
	        }
	        return false;
	    }
	    
public static void main(String[] args) {
	ArrayList<String> occupation=new ArrayList<>();
	ArrayList<String> genres=new ArrayList<>();
	ArrayList<String> awards=new ArrayList<>();
	occupation.add("singer");
	occupation.add("song writer");
	genres.add("pop");
	genres.add("jazz");
	awards.add("2020, Best song written for visual media");
	Artist ar=new Artist("569MMMRR_%","Hari","Melbourne|Victoria|Australia","12-10-1999","He is an great singer and song writer in 21st century",occupation,genres,awards);
	System.out.println(ar.updateArtist());
}
	  }


//References:
//1) Matching the Regex : https://stackoverflow.com/questions/25277300/how-to-return-a-string-which-matches-the-regex-in-java
//2)
