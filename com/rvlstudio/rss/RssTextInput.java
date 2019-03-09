package com.rvlstudio.rss;

public class RssTextInput {
	private String title;
	private String description;
	private String name;
	private String link;

	public RssTextInput(String title, String description, String name, String link) {
		this.title = title;
		this.description = description;
		this.name = name;
		this.link = link;
	}

	public void setTitle(String title) { this.title = title; }
	public String getTitle() { return this.title;	}

	public void setDescription(String description) { this.description = description; }
	public String getDescription() { return this.description; }

	public void setName(String name) { this.name = name; }
	public String getName() {	return this.name;	}
	
	public void setLink(String link) { this.link = link; }
	public String getLink() {	return this.link;	}

	@Override
	public String toString() {
		return "{" +
			"title='" + getTitle() + "'" +
			",description='" + getDescription() + "'" +
			",name='" + getName() + "'" +
			",link='" + getLink() + "'" +
			"}";
	}

}