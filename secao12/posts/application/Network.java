package secao12.posts.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import secao12.posts.entities.Comment;
import secao12.posts.entities.Post;

public class Network {

	public static void main(String[] args) throws ParseException {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		List<Post> feed = new ArrayList<>();

		System.out.print("Do you want to make a post? ");
		char ans = sc.nextLine().charAt(0);

		while (ans == 'y') {
			System.out.print("Enter the title: ");
			String title = sc.nextLine();

			System.out.print("Enter the content: ");
			String content = sc.nextLine();

			System.out.print("Enter the publication date: ");
			Date moment = sdf.parse(sc.nextLine());

			feed.add(new Post(moment, title, content));

			System.out.print("Do you want to make another post? ");
			ans = sc.nextLine().charAt(0);
		}
		
		System.out.println();
		
		System.out.println("Publishes:");
		for (int i = 0; i < feed.size(); i++) {
			System.out.println("#" + (i + 1) + ": " + feed.get(i).getTitle() + " - Date: " + sdf.format(feed.get(i).getMoment()));
		}
		
		System.out.println();
		
		System.out.print("Do you want to comment any publish? ");
		ans = sc.nextLine().charAt(0);
		
		while(ans == 'y') {
			
			System.out.print("Which publish id? ");
			Integer id = sc.nextInt();
			
			sc.nextLine();
			
			System.out.print("Enter the comment: ");
			String text = sc.nextLine();
			
			feed.get(id - 1).addComment(new Comment(text));
			
			System.out.println();
			System.out.print("Do you want to comment again? ");
			ans = sc.nextLine().charAt(0);
			
		}
		
		System.out.println();
		for(Post post : feed) {
			Integer likes = post.getLikes() == null ? 0 : post.getLikes();
			System.out.println(post.getTitle());
			System.out.println(likes + " like(s)" + " - " + sdf.format(post.getMoment()));
			System.out.println(post.getContent());
			System.out.println("Comments:");
			
			for(Comment comment : post.getComments()) {
				System.out.println(comment.getText());
			}
			
			System.out.println();
			
		}

		sc.close();

	}

}
