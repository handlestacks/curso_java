package secao12.posts.entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {
	
	public static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

	private Date moment;
	private String title;
	private String content;
	private Integer likes = 0;

	private List<Comment> comments = new ArrayList<>();

	public Post() {
	}

	public Post(Date moment, String title, String content) {
		this.moment = moment;
		this.title = title;
		this.content = content;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Integer getLikes() {
		return likes;
	}

	public void setLikes(Integer likes) {
		this.likes = likes;
	}

	public List<Comment> getComments() {
		return comments;
	}

	public void addComment(Comment comment) {
		comments.add(comment);
	}

	public void removeComment(Comment comment) {
		comments.remove(comment);
	}
	
	public String toString() {
		int nLikes = getLikes() == null ? 0 : getLikes();
		StringBuilder sb = new StringBuilder();
		sb.append(this.getTitle() + "\n");
		sb.append(nLikes + " like(s)");
		sb.append(" - ");
		sb.append(sdf.format(this.getMoment()) + "\n");
		sb.append(this.getContent() + "\n");
		sb.append("Comments: \n");
		
		for(Comment c : comments) {
			sb.append(c.getText() + "\n");
		}
		
		sb.append("\n");
				
		return sb.toString();
	}

}
