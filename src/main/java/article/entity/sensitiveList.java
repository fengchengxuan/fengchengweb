package article.entity;

public class sensitiveList {
	private String sl_id;
	private String words;

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
