package kk;
import java.util.Scanner;

class Movie{
	String title;
	String director;
	String genre;
	int rating;
	int newrating;
	

Movie (String title,String director,String genre,int rating,int newrating){
	this.title=title;
	this.director=director;
	this.genre=genre;
	this.rating=rating;
	this.newrating=newrating;
	}
	
	public void disp() {
		System.out.println("Title : "+title);
		System.out.println("director : "+director);
		System.out.println("genre : "+genre);
		System.out.println("rating : "+rating);
		
	}
	public void update() {
		//this.newrating=this.rating;
		System.out.println("the new rating of the movie is :"+newrating);
			
	}
}


public class moviemanagemenet {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		
		String title=in.next();
		String director=in.next();
		String genre=in.next();
		int rating=in.nextInt();
		int newrating=in.nextInt();
		
		Movie m=new Movie (title,director,genre,rating,newrating);
		
		
		m.disp();
		m.update();
			

	}

}
