package collections.set.movie;

public class Movie {

	public String movie_name;
	public String dir_name;
	public double duration_in_hh_mm_ss;
	public double rating;
	
	public Movie()
	{
		
	}
	
	public Movie(String movie_name, String dir_name, double duration_in_hh_mm_ss, double rating)
	{
		this.movie_name = movie_name;
		this.dir_name = dir_name;
		this.duration_in_hh_mm_ss = duration_in_hh_mm_ss;
		this.rating = rating;
	}

	public String getMovie_name() {
		return movie_name;
	}

	public void setMovie_name(String movie_name) {
		this.movie_name = movie_name;
	}

	public String getDir_name() {
		return dir_name;
	}

	public void setDir_name(String dir_name) {
		this.dir_name = dir_name;
	}

	public double getDuration_in_hh_mm_ss() {
		return duration_in_hh_mm_ss;
	}

	public void setDuration_in_hh_mm_ss(double duration_in_hh_mm_ss) {
		this.duration_in_hh_mm_ss = duration_in_hh_mm_ss;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	@Override
	public String toString() {
		return "Movie [movie_name=" + movie_name + ", dir_name=" + dir_name + ", duration_in_hh_mm_ss="
				+ duration_in_hh_mm_ss + ", rating=" + rating + "]";
	}
	
	
}
