package Session;

import java.util.*;

public class Comparator12 {
	public void show(List<Movies> movie) {

		for (Movies movies : movie) {
			System.out.println(movies);
		}
	}

	public static void main(String[] args) {
		List<Movies> movie = new ArrayList<Movies>();
		movie.add(new Movies(4, "Huchcha", 2000));
		movie.add(new Movies(5, "Nandi", 2005));
		movie.add(new Movies(2, "shh", 1999));
		movie.add(new Movies(3, "Kotigobba", 2012));
		Scanner in = new Scanner(System.in);
		Comparator12 cm = new Comparator12();

		while (true) {
			System.out.println(
					"\n 1.Sort by Ratings \n 2.Sort by name \n 3.Sort by year \n 4.Sort by ratings in Reverse \n 5.Sort By name in Reverse\n 6.Sort by year in Reverse \n 7.Exit");
			System.out.println("Enter Your Choice");
			int ch = in.nextInt();
			switch (ch) {
			case 1:
				Collections.sort(movie, new SortByRating());
				System.out.println("Sorted by Ratings");
				cm.show(movie);

				break;
			case 2:
				Collections.sort(movie, new SortByName());
				System.out.println("Sorted by name");
				cm.show(movie);
				break;
			case 3:
				Collections.sort(movie, new SortByYear());
				System.out.println("Sorted by year");
				cm.show(movie);
				break;
			case 4:
				Collections.sort(movie, new SortByRating1());
				System.out.println("Sorted by Ratings in reverse");
				cm.show(movie);
				break;
			case 5:
				Collections.sort(movie, new SortByName1());
				System.out.println("Sorted by name  in reverse");
				cm.show(movie);
				break;
			case 6:
				Collections.sort(movie, new SortByYear1());
				System.out.println("Sorted by year in reverse");
				cm.show(movie);
				break;
			case 7:
				System.exit(0);
			}

		}

	}

}

class Movies {
	int ratings;
	String name;
	int year;

	public Movies(int ratings, String name, int year) {

		this.ratings = ratings;
		this.name = name;
		this.year = year;
	}

	@Override
	public String toString() {
		return "ratings=" + ratings + ", name=" + name + ", year=" + year;
	}

}

class SortByRating implements Comparator<Movies> {

	@Override
	public int compare(Movies o1, Movies o2) {
		// TODO Auto-generated method stub
		return o1.ratings - o2.ratings;
	}

}

class SortByName implements Comparator<Movies> {

	@Override
	public int compare(Movies o1, Movies o2) {
		// TODO Auto-generated method stub
		return o1.name.compareTo(o2.name);
	}

}

class SortByYear implements Comparator<Movies> {

	@Override
	public int compare(Movies o1, Movies o2) {
		// TODO Auto-generated method stub
		return o1.year - o2.year;
	}

}

class SortByRating1 implements Comparator<Movies> {

	@Override
	public int compare(Movies o1, Movies o2) {
		// TODO Auto-generated method stub
		return o2.ratings - o1.ratings;
	}

}

class SortByName1 implements Comparator<Movies> {

	@Override
	public int compare(Movies o1, Movies o2) {
		// TODO Auto-generated method stub
		return o2.name.compareTo(o1.name);
	}

}

class SortByYear1 implements Comparator<Movies> {

	@Override
	public int compare(Movies o1, Movies o2) {
		// TODO Auto-generated method stub
		return o2.year - o1.year;
	}
}
