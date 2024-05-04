package collections.set.movie;

import java.util.HashSet;


public class MovieMainDetails {

	public static void main(String[] args) {
		
		HashSet<Movie> mov_detail = new HashSet<Movie>();
		
		Movie movi1 = new Movie("Shadows of Tomorrow","Elena Rodriguez",1.28,8.5);
		Movie movi2 = new Movie("Echoes in the Wind","Marcus Hughes",1.12,7.9);
		Movie movi3 = new Movie("Midnight Reverie","Sofia Alvarez",1.42,8.2);
		Movie movi4 = new Movie("Whispers of Destiny","Jonathan Chen",1.20,8.6);
		Movie movi5 = new Movie("Beyond the Horizon","Rachel Bennett",1.35,7.7);
		Movie movi6 = new Movie("The Silent Path","Carlos Martinez",1.18,8.3);
		Movie movi7 = new Movie("Dreamscape Chronicles","Maya Patel",1.30,7.8);
		Movie movi8 = new Movie("Enigma of Time","Liam Johnson",1.25,8.0);
		Movie movi9 = new Movie("Serenade of Serenity","Isabella Thompson",1.32,8.7);
		Movie movi10 = new Movie("Elysium's Gate","Oliver Wilson",1.28,8.4);
		
		// storing my objects in hashset 
		
		mov_detail.add(movi1);
		mov_detail.add(movi2);
		mov_detail.add(movi3);
		mov_detail.add(movi4);
		mov_detail.add(movi5);
		mov_detail.add(movi6);
		mov_detail.add(movi7);
		mov_detail.add(movi8);
		mov_detail.add(movi9);
		mov_detail.add(movi10);
		
		for(Movie detail : mov_detail)
		{
			System.out.println(detail);
		}
		
	}
}
