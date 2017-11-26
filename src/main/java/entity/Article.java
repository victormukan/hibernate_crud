package entity;

import javax.persistence.*;

@Entity
@Table(name="articles")

public class Article{
   @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="article_id")
    private int article_id;

    @Column(name="title")
    private String title;

    @Column(name="category")
    private String category;

    public int getArticle_id() {
        return article_id;
    }

    public void setArticle_id(int article_id) {
        this.article_id = article_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Article{" +
                "article_id=" + article_id +
                ", title='" + title + '\'' +
                ", category='" + category + '\'' +
                '}';
    }
}
