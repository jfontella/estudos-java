package application;

import java.util.Scanner;

import entities.Comment;
import entities.Post;

public class MainSocial {
	
	
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Digite um titulo para sua postagem");
		String titulo = scn.next();
		System.out.println("Digite o texto da sua postagem");
		String postagem = scn.next();
		Post post1 = new Post(titulo, postagem);
		
		System.out.println("Digite um titulo para sua segunda postagem");
	    titulo = scn.next();
		System.out.println("Digite o texto da sua postagem");
		postagem = scn.next();
		Post post2 = new Post(titulo, postagem);
		
		System.out.println("Digite um comentario para a postagem 1");
		String comment = scn.next();
		Comment comentario = new Comment(comment);
		System.out.println("Digite outro comentario para a postagem 1");
		comment = scn.next();
		Comment comentario2 = new Comment(comment);
		post1.addComent(comentario);
		post1.addComent(comentario2);
		
		System.out.println("Digite um comentario para a postagem 2");
		comment = scn.next();
		Comment comentario3 = new Comment(comment);
		System.out.println("Digite outro comentario para a postagem 2");
		comment = scn.next();
		Comment comentario4 = new Comment(comment);
		post2.addComent(comentario3);
		post2.addComent(comentario4);
		
		System.out.println("Quantos like essa postagem merece(1)");
		post1.setLikes(scn.nextInt());
		System.out.println("E esse princeso?(2)");
		post2.setLikes(scn.nextInt());
		
		System.out.println("Post 1: ");
		System.out.println("Data - " + post1.getMoment());
		System.out.println("Titulo - " + post1.getTitle());
		System.out.println("Conteudo - " + post1.getContent());
		System.out.println("LIKES: " + post1.getLikes());
		System.out.println("Comentarios da postagem 1: ");
		System.out.println(post1.getComments());
	
		System.out.println("Post 2: ");
		System.out.println("Data - " + post2.getMoment());
		System.out.println("Titulo - " + post2.getTitle());
		System.out.println("Conteudo - " + post2.getContent());
		System.out.println("LIKES: " + post2.getLikes());
		System.out.println("Comentarios da postagem 2: ");
		System.out.println(post2.getComments());
		
		
	}

}
