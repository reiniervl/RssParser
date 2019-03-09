package com.rvlstudio.rss;

import java.util.List;

public class RssChannel {
	// Required
	private RssElement<String> title;
	private RssElement<String> link;
	private RssElement<String> description;

	// Optional
	private RssElement<String> language;
	private RssElement<String> copyright;
	private RssElement<String> managingEditor;
	private RssElement<String> webMaster;
	private RssElement<String> pubDate;
	private RssElement<String> lastBuildDate;
	private RssElement<String> category;
	private RssElement<String> generator;
	private RssElement<String> docs;
	private RssElement<String> cloud;
	private RssElement<Integer> ttl;
	private RssElement<RssImage> image;
	private RssElement<String> rating;
	private RssElement<RssTextInput> textInput;
	private RssElement<List<Integer>> skipHours;
	private RssElement<List<String>> skipDays;
	private RssElement<List<RssItem>> items;


	public boolean hasLanguage() { return language != null && language.hasValue(); }
	public boolean hasCopyright() { return copyright != null && copyright.hasValue(); }
	public boolean hasManagingEditor() { return managingEditor != null && managingEditor.hasValue(); }
	public boolean hasWebMaster() { return webMaster != null && webMaster.hasValue(); }
	public boolean hasPubDate() { return pubDate != null && pubDate.hasValue(); }
	public boolean hasLastBuildDate() { return lastBuildDate != null && lastBuildDate.hasValue(); }
	public boolean hasCategory() { return category != null && category.hasValue(); }
	public boolean hasGenerator() { return generator != null && generator.hasValue(); }
	public boolean hasDocs() { return docs != null && docs.hasValue(); }
	public boolean hasCloud() { return cloud != null && cloud.hasValue(); }
	public boolean hasTtl() { return ttl != null && ttl.hasValue(); }
	public boolean hasImage() { return image != null && image.hasValue(); }
	public boolean hasRating() { return rating != null && rating.hasValue(); }
	public boolean hasTextInput() { return textInput != null && textInput.hasValue(); }
	public boolean hasSkipHours() { return skipHours != null && skipHours.hasValue(); }
	public boolean hasSkipDays() { return skipDays != null && skipDays.hasValue(); }

	public RssChannel() {}

	public RssChannel(RssElement<String> title, RssElement<String> link, RssElement<String> description) {
		this.title = title;
		this.link = link;
		this.description = description;
	}

	public void setTitle(RssElement<String> title) {
		this.title = title;
	}
	public RssElement<String> getTitle() {
		return this.title;
	}
	public void setLink(RssElement<String> link) {
		this.link = link;
	}
	public RssElement<String> getLink() {
		return this.link;
	}
	public void setDescription(RssElement<String> description) {
		this.description = description;
	}
	public RssElement<String> getDescription() {
		return this.description;
	}
	public void setLanguage(RssElement<String> language) {
		this.language = language;
	}
	public RssElement<String> getLanguage() {
		return this.language;
	}
	public void setCopyricht(RssElement<String> copyricht) {
		this.copyright = copyricht;
	}
	public RssElement<String> getCopyricht() {
		return this.copyright;
	}
	public void setManagingEditor(RssElement<String> managingEditor) {
		this.managingEditor = managingEditor;
	}
	public RssElement<String> getManagingEditor() {
		return this.managingEditor;
	}
	public void setWebMaster(RssElement<String> webMaster) {
		this.webMaster = webMaster;
	}
	public RssElement<String> getWebMaster() {
		return this.webMaster;
	}
	public void setPubDate(RssElement<String> pubDate) {
		this.pubDate = pubDate;
	}
	public RssElement<String> getPubDate() {
		return this.pubDate;
	}
	public void setLastBuildDate(RssElement<String> lastBuildDate) {
		this.lastBuildDate = lastBuildDate;
	}
	public RssElement<String> getLastBuildDate() {
		return this.lastBuildDate;
	}
	public void setCategory(RssElement<String> category) {
		this.category = category;
	}
	public RssElement<String> getCategory() {
		return this.category;
	}
	public void setGenerator(RssElement<String> generator) {
		this.generator = generator;
	}
	public RssElement<String> getGenerator() {
		return this.generator;
	}
	public void setDocs(RssElement<String> docs) {
		this.docs = docs;
	}
	public RssElement<String> getDocs() {
		return this.docs;
	}
	public void setCloud(RssElement<String> cloud) {
		this.cloud = cloud;
	}
	public RssElement<String> getCloud() {
		return this.cloud;
	}
	public void setTtl(RssElement<Integer> ttl) {
		this.ttl = ttl;
	}
	public RssElement<Integer> getTtl() {
		return this.ttl;
	}
	public void setImage(RssElement<RssImage> image) {
		this.image = image;
	}
	public RssElement<RssImage> getImage() {
		return this.image;
	}
	public void setRating(RssElement<String> rating) {
		this.rating = rating;
	}
	public RssElement<String> getRating() {
		return this.rating;
	}
	public void setTextInput(RssElement<RssTextInput> textInput) {
		this.textInput = textInput;
	}
	public RssElement<RssTextInput> getTextInput() {
		return this.textInput;
	}
	public void setSkipHours(RssElement<List<Integer>> skipHours) {
		this.skipHours = skipHours;
	}
	public RssElement<List<Integer>> getSkipHours() {
		return this.skipHours;
	}
	public void setSkipDays(RssElement<List<String>> skipDays) {
		this.skipDays = skipDays;
	}
	public RssElement<List<String>> getSkipDays() {
		return this.skipDays;
	}
	public void setItems(RssElement<List<RssItem>> items) {
		this.items = items;
	}
	public RssElement<List<RssItem>> getItems() {
		return this.items;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for(RssItem item : getItems().getValue()) sb.append(item.toString() + "\n");
		return "{\n" +
			"title: " + getTitle() +
			",\n\tlink: " + getLink() +
			",\n\tdescription: " + getDescription() +
			",\n\tlanguage: " + getLanguage() +
			",\n\tcopyricht: " + getCopyricht() +
			",\n\tmanagingEditor: " + getManagingEditor() +
			",\n\twebMaster: " + getWebMaster() +
			",\n\tpubDate: " + getPubDate() +
			",\n\tlastBuildDate: " + getLastBuildDate() +
			",\n\tcategory: " + getCategory() +
			",\n\tgenerator: " + getGenerator() +
			",\n\tdocs: " + getDocs() +
			",\n\tcloud: " + getCloud() +
			",\n\tttl: " + getTtl() +
			",\n\timage: " + getImage() +
			",\n\trating: " + getRating() +
			",\n\ttextInput: " + getTextInput() +
			",\n\tskipHours: " + getSkipHours() +
			",\n\tskipDays: " + getSkipDays() +
			",\n\titems: " + sb.toString() +
			"\n}";
	}
}