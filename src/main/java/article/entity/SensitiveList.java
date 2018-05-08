package article.entity;

/**
 * √Ù∏–¥ ±Ì
 * 
 * @author fengcheng
 *
 */
public class SensitiveList {
	private String sl_id;// id
	private String words;// √Ù∏–¥ 

	public String getSl_id() {
		return sl_id;
	}

	public void setSl_id(String sl_id) {
		this.sl_id = sl_id;
	}

	public String getWords() {
		return words;
	}

	public void setWords(String words) {
		this.words = words;
	}

	@Override
	public String toString() {
		return "sensitiveList [sl_id=" + sl_id + ", words=" + words + "]";
	}
}
