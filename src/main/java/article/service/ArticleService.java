package article.service;

import java.util.List;

public interface ArticleService {
	List<Article> findArticleList(String type);
	Article getArticle(String articleId);
	List<FcComment> getComent(String articleId);
	void addArticle(String artType ,String artTitle,String artKey,String fcAbstract,String picUrl,String content,String artState);
    void updateArticle(String artType ,String artTitle,String artKey,String fcAbstract,String picUrl,String content,String artState);
}
