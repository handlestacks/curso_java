package secao12.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import secao12.entities.Comment;
import secao12.entities.Post;

public class Facebook {

	public static void main(String[] args) throws ParseException {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

		System.out.println("Welcome to Facebook!");
		System.out.print("How many posts are you publishing? ");
		int n = sc.nextInt();
		List<Post> feed = new ArrayList();

		for (int i = 0; i < n; i++) {
			
			sc.nextLine();
			System.out.print("Enter the date and hour of the moment: ");
			Date moment = sdf.parse(sc.nextLine());
			System.out.print("Enter the title: ");
			String title = sc.nextLine();
			System.out.print("Enter the content: ");
			String content = sc.nextLine();
			System.out.print("Enter the likes: ");
			Integer likes = sc.nextInt();

			feed.add(new Post(moment, title, content, likes));
			System.out.println();

		}
		
		System.out.println("Posts: ");
		for(Post p : feed) {
			System.out.println(p.getTitle());
		}		
		
		System.out.println();
		
		char comment = 'y';
		while(comment == 'y') {
			
			System.out.print("Enter the post id to comment: ");
			int postid = sc.nextInt();
			
			System.out.print("Enter the text to comment: ");
			String text = sc.nextLine();
			
			sc.nextLine();
			
			//feed.get(postid).addComment(new Comment(text));
			System.out.println(feed.get(postid));
			
			System.out.print("Do you like to do another comment? ");
			comment = sc.nextLine().charAt(0);
			
		}

		System.out.println();
				
		for(Post p : feed) {
			
			System.out.println(p.getTitle());
			System.out.println(p.getLikes() + " likes - " + p.getMoment());
			System.out.println(p.getContent());
			System.out.println("Comments: ");
			for(Comment c : p.getComments()) {
				System.out.println(c.getText());
			}
			
			System.out.println();
			
		}
		
		sc.close();

	}

}
