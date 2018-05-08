package article.service;



import java.util.ArrayList;

import article.entity.Article;

public interface ArticleService {
	ArrayList<Article> allArticle(String type);
}
