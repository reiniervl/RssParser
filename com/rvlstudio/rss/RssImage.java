package com.rvlstudio.rss;

public class RssImage {
	private String url;
	private String title;
	private String link;
	private int width = 88; // MAX 144
	private int height = 31; // MAX 400
	private String description;

	public RssImage(String url, String title, String link) {
		this(url, title, link, 0, 0, null);
	}

	public RssImage(String url, String title, String link, int width, int height, String description) {
		this.url = url;
		this.title = title;
		this.link = link;
		if(width != 0 && width < 144) this.width = width;
		if(height != 0 && height < 400) this.height = height;
		this.description = description;
	}

	public boolean hasUrl() { return url != null; }
	public boolean hasTitle() { return title != null; }
	public boolean hasLink() { return link != null; }
	public boolean hasWidth() { return true; }
	public boolean hasHeight() { return true; }
	public boolean hasDescription() { return description != null; }

	public void setUrl(String url) {	this.url = url;	}
	public String getUrl() {	return this.url;	}

	public void setTitle(String title) {	this.title = title;	}
	public String getTitle() {	return this.title;	}

	public void setLink(String link) {	this.link = link;	}
	public String getLink() {	return this.link;	}
	
	public void setWidth(int width) {
		if(width > 144) this.width = 144;
		else this.width = width;
	}

	public int getWidth() {	return this.width;	}

	public void setHeight(int height) {
		if(height > 400) this.height = 400;
		else this.height = height;
	}

	public int getHeight() {	return this.height;	}

	public void setDescription(String description) {	this.description = description;	}
	public String getDescription() {	return this.description; }

	@Override
	public String toString() {
		return "{" +
		"\n\turl: " + url +
		",\n\ttitle: " + title +
		",\n\tlink: " + link +
		",\n\twidth: " + width +
		",\n\theight: " + height +
		",\n\tdescription: " + description +
		"\n}";
	}
}