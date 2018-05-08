package article.entity;

import java.util.Date;

public class article {
	private String id;
	private String fcuser_id;
	private String fccomment_id;
	private String art_title;
	private String pic_url;
	private String art_abstract;
	private String art_key;
	private String content;
	private String art_state;
	private String art_type;
	private Date create_date;
	private int browse_count;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFcuser_id() {
		return fcuser_id;
	}

	public void setFcuser_id(String fcuser_id) {
		this.fcuser_id = fcuser_id;
	}

	public String getFccomment_id() {
		return fccomment_id;
	}

	public void setFccomment_id(String fccomment_id) {
		this.fccomment_id = fccomment_id;
	}

	public String getArt_title() {
		return art_title;
	}

	public void setArt_title(String art_title) {
		this.art_title = art_title;
	}

	public String getPic_url() {
		return pic_url;
	}

	public void setPic_url(String pic_url) {
		this.pic_url = pic_url;
	}

	public String getArt_abstract() {
		return art_abstract;
	}

	public void setArt_abstract(String art_abstract) {
		this.art_abstract = art_abstract;
	}

	public String getArt_key() {
		return art_key;
	}

	public void setArt_key(String art_key) {
		this.art_key = art_key;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getArt_state() {
		return art_state;
	}

	public void setArt_state(String art_state) {
		this.art_state = art_state;
	}

	public String getArt_type() {
		return art_type;
	}

	public void setArt_type(String art_type) {
		this.art_type = art_type;
	}

	public Date getCreate_date() {
		return create_date;
	}

	public void setCreate_date(Date create_date) {
		this.create_date = create_date;
	}

	public int getBrowse_count() {
		return browse_count;
	}

	public void setBrowse_count(int browse_count) {
		this.browse_count = browse_count;
	}

	@Override
	public String toString() {
		return "article [id=" + id + ", fcuser_id=" + fcuser_id + ", fccomment_id=" + fccomment_id + ", art_title="
				+ art_title + ", pic_url=" + pic_url + ", art_abstract=" + art_abstract + ", art_key=" + art_key
				+ ", content=" + content + ", art_state=" + art_state + ", art_type=" + art_type + ", create_date="
				+ create_date + ", browse_count=" + browse_count + "]";
	}

}
