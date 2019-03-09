package com.rvlstudio.rss;

public class RssItem {
	private RssElement<String> title;
	private RssElement<String> link;
	private RssElement<String> description;
	private RssElement<String> author;
	private RssElement<String> category;
	private RssElement<String> comments;
	private RssElement<String> enclosure;
	private RssElement<String> guid;
	private RssElement<String> pubDate;

	public boolean hasTitle() {	return title != null && title.getValue() != null;	}
	public boolean hasLink() { return link != null && link.getValue() != null;	}
	public boolean hasAuthor() { return author != null && author.getValue() != null;	}
	public boolean hasCategory() { return category != null && category.getValue() != null;	}
	public boolean hasComments() { return comments != null && comments.getValue() != null;	}
	public boolean hasEnclosure() {	return enclosure != null && enclosure.getValue() != null;	}
	public boolean hasDescription() {	return description != null && description.getValue() != null;	}
	public boolean hasGuid() {	return guid != null && guid.getValue() != null;	}
	public boolean hasPubDate() {	return pubDate != null && pubDate.getValue() != null;	}

	public void setTitle(RssElement<String> title) {	this.title = title;	}
	public RssElement<String> getTitle() {	return this.title;	}

	public void setLink(RssElement<String> link) {	this.link = link;	}
	public RssElement<String> getLink() {	return this.link;	}
	
	public void setAuthor(RssElement<String> author) {	this.author = author;	}
	public RssElement<String> getAuthor() {	return this.author;	}
	
	public void setCategory(RssElement<String> category) {	this.category = category;	}
	public RssElement<String> getCategory() {	return this.category;	}
	
	public void setComments(RssElement<String> comments) {	this.comments = comments;	}
	public RssElement<String> getComments() {	return this.comments;	}
	
	public void setEnclosure(RssElement<String> enclosure) {	this.enclosure = enclosure;	}
	public RssElement<String> getEnclosure() {	return this.enclosure;	}
	
	public void setDescription(RssElement<String> description) {	this.description = description;	}
	public RssElement<String> getDescription() {	return this.description;	}

	public void setGuid(RssElement<String> guid) { this.guid = guid; }
	public RssElement<String> getGuid() { return this.guid; }

	public void setPubDate(RssElement<String> pubDate) {	this.pubDate = pubDate;	}
	public RssElement<String> getPubDate() {	return this.pubDate;	}

	@Override
	public String toString() {
		return "{" +
			"\n\ttitle :" + getTitle() +
			",\n\tlink: " + getLink() +
			",\n\tauthor: " + getAuthor() +
			",\n\tcategory: " + getCategory() +
			",\n\tcomments: " + getComments() +
			",\n\tenclosure: " + getEnclosure() +
			",\n\tdescription: " + getDescription() +
			",\n\tguid: " + getGuid() +
			",\n\tpubDate: " + getPubDate() +
			"\n}";
	}
}