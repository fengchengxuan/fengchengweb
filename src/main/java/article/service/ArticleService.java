package article.service;

import java.util.Date;
import java.util.List;

import article.entity.Article;
import article.entity.Fccomment;

public interface ArticleService {
	List<Article> findArticleList(String type);
	Article getArticle(String articleId);
	List<Fccomment> getComent(String fcuser_id, String articleId);
	void addCommont(String article_id, String fcuser_id, String repay_id, Date comm_time, String content);
	void addArticle(String artType ,String artTitle,String artKey,String fcAbstract,String picUrl,String content,String artState);
    void updateArticle(String artType ,String artTitle,String artKey,String fcAbstract,String picUrl,String content,String artState);
    void updateArticle(String id);
}
