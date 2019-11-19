package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Formatter;

public class Post {
	
	
	private String title;
	private String content;
	private int likes;
	private Date moment;
	private ArrayList<Comment> comments = new ArrayList<>();
	SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	public Post(String title, String content) {
		this.title = title;
		this.content = content;
		this.moment = new Date();
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

	public int getLikes() {
		return likes;
	}

	public void setLikes(int likes) {
		this.likes = likes;
	}

	public Date getMoment() {
		return moment;
	}
	public String getComments() {
		String comentarios = "";
		for (Comment comment : comments) {
			comentarios += comment.getText();
			comentarios += "\n";
		}
		return comentarios;
	}
	public void addComent(Comment comentario) {
		comments.add(comentario);
	}
	
	

}
