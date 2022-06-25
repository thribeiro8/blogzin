package com.spring.blogzin.utils;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.spring.blogzin.model.Post;
import com.spring.blogzin.repository.BlogzinRepository;

@Component
public class DummyData {

	@Autowired
	BlogzinRepository blogzinRepository;

//	@PostConstruct - Comentado para não ficar gerando 2 registros cada vez que rodar a aplicação
	public void savePosts() {

		List<Post> posts = new ArrayList<>();
		Post post1 = new Post();
		post1.setAutor("Thomas Ribeiro");
		post1.setData(LocalDate.now());
		post1.setTitulo("Backend");
		post1.setTexto(
				"Como o próprio nome sugere, vem da ideia daquilo que tem por trás de uma aplicação. Pode ficar meio abstrato num primeiro momento, mas pense que para conseguir usar o Facebook no dia a dia, os dados (as informações) do seu perfil, amigos e publicações precisam estar salvos em algum lugar e serem processados a partir dele, sendo este lugar um banco de dados.\r\n"
						+ "\r\n"
						+ "O Back-End trabalha em boa parte dos casos fazendo a ponte entre os dados que vem do navegador rumo ao banco de dados e vice-versa, sempre aplicando as devidas regras de negócio, validações e garantias num ambiente restrito ao usuário final (ou seja, onde ele não consegue acessar ou manipular algo).");

		Post post2 = new Post();
		post2.setAutor("Thomas Ribeiro");
		post2.setData(LocalDate.now());
		post2.setTitulo("Frontend");
		post2.setTexto(
				"Podemos classificar como a parte visual de um site, aquilo que conseguimos interagir. Quem trabalha com Front End é responsável por desenvolver por meio do código uma interface gráfica e, normalmente, com as tecnologias base da Web: HTML, CSS e JavaScript.");

		posts.add(post1);
		posts.add(post2);

		posts.forEach((post) -> {
			Post postSaved = blogzinRepository.save(post);
			System.out.println(postSaved.getId());
		});

	}

}
