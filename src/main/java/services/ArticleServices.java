package services;

import entity.Article;
import entity.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class ArticleServices {
    @Autowired
    private ArticleRepository repository;

    public List<Article> getAll() {
        return (ArrayList<Article>) repository.findAll();
    }



}
