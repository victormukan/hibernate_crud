package program;

import entity.Article;
import entity.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import services.ArticleServices;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class Console {
//    @Autowired
//    private static ArticleRepository repository;
    public static void main(String[] args) {
        List<Article> articles = new ArticleServices().getAll();
        articles.forEach(i -> System.out.println(i.toString()));

        SpringApplication.run(Console.class, args);

    }
}
