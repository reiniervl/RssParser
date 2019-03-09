package com.rvlstudio.rss;

import java.io.IOException;
import java.util.List;
import java.util.ArrayList;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.xml.sax.SAXException;

public class RssParser {
	public static RssChannel parse(String uri) {
		RssChannel c = null;
		try {
			Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(uri);
			NodeList channel = doc.getElementsByTagName("channel");
			if(channel.getLength() == 0) {
				System.out.println("Channel element missing");
				return null;
			}

			c = new RssChannel();
			NodeList nodes = channel.item(0).getChildNodes();
			for(int i = 0; i < nodes.getLength(); i++) {
				Node n = nodes.item(i);
				switch(n.getNodeName()) {
					case "title":
						c.setTitle(new RssElement<String>(n.getTextContent(), parseAttributes(n)));
						break;
					case "link":
						c.setLink(new RssElement<String>(n.getTextContent(), parseAttributes(n)));
						break;
					case "description":
						c.setDescription(new RssElement<String>(n.getTextContent(), parseAttributes(n)));
						break;
					case "item":
						if(c.getItems() == null) c.setItems(new RssElement<List<RssItem>>(new ArrayList<RssItem>()));
						c.getItems().getValue().add(parseItem(n));
						break;
					case "language":
						c.setLanguage(new RssElement<String>(n.getTextContent(), parseAttributes(n)));
						break;
					case "copyright":
						c.setCopyricht(new RssElement<String>(n.getTextContent(), parseAttributes(n)));
						break;
					case "managingEditor":
						c.setManagingEditor(new RssElement<String>(n.getTextContent(), parseAttributes(n)));
						break;
					case "webMaster":
						c.setWebMaster(new RssElement<String>(n.getTextContent(), parseAttributes(n)));
						break;
					case "pubDate":
						c.setPubDate(new RssElement<String>(n.getTextContent(), parseAttributes(n)));
						break;
					case "lastBuildDate":
						c.setLastBuildDate(new RssElement<String>(n.getTextContent(), parseAttributes(n)));
						break;
					case "category":
						c.setCategory(new RssElement<String>(n.getTextContent(), parseAttributes(n)));
						break;
					case "generator":
						c.setGenerator(new RssElement<String>(n.getTextContent(), parseAttributes(n)));
						break;
					case "docs":
						c.setDocs(new RssElement<String>(n.getTextContent(), parseAttributes(n)));
						break;
					case "cloud":
						c.setCloud(new RssElement<String>(n.getTextContent(), parseAttributes(n)));
						break;
					case "ttl":
						c.setTtl(new RssElement<Integer>(Integer.parseInt(n.getTextContent()), parseAttributes(n)));
						break;
					case "image":
						c.setImage(new RssElement<RssImage>(parseImage(n), parseAttributes(n)));
						break;
					case "rating":
						c.setRating(new RssElement<String>(n.getTextContent(), parseAttributes(n)));
						break;
					case "textInput":
						c.setTextInput(new RssElement<RssTextInput>(parseTextInput(n), parseAttributes(n)));
						break;
					case "skipHours":
						break;
					case "skipDays":
						break;
					default:
						break;
				}
			}
		} catch(SAXException | ParserConfigurationException | IOException e) {
			System.out.println(e);
		}
		return c;
	}

	public static RssTextInput parseTextInput(Node textInputNode) {
		String title = null;
		String description = null;
		String name = null;
		String link = null;

		NodeList c = textInputNode.getChildNodes();
		for(int i = 0; i < c.getLength(); i++) {
			Node n = c.item(i);
			switch(n.getNodeName()) {
				case "url":
					name = n.getTextContent();
					break;
				case "title":
					title = n.getTextContent();
					break;
				case "link":
					link = n.getTextContent();
					break;
				case "description":
					description = n.getTextContent();
					break;
				default:
					break;
			}
		}

		return new RssTextInput(title, description, name, link);
	}

	public static RssImage parseImage(Node imageNode) {
		String url = null;
		String title = null;
		String link = null;
		int width = 88;
		int height = 31;
		String description = null;

		NodeList c = imageNode.getChildNodes();
		for(int i = 0; i < c.getLength(); i++) {
			Node n = c.item(i);
			switch(n.getNodeName()) {
				case "url":
					url = n.getTextContent();
					break;
				case "title":
					title = n.getTextContent();
					break;
				case "link":
					link = n.getTextContent();
					break;
				case "width":
					width = Integer.parseInt(n.getTextContent());
					break;
				case "height":
					height = Integer.parseInt(n.getTextContent());
					break;
				case "description":
					description = n.getTextContent();
					break;
				default:
					break;
			}
		}

		return new RssImage(url, title, link, width, height, description);
	}

	private static RssItem parseItem(Node itemNode) {
		RssItem item = new RssItem();
		NodeList c = itemNode.getChildNodes();

		for(int i = 0; i < c.getLength(); i++) {
			Node n = c.item(i);
			switch(n.getNodeName()) {
				case "title":
					item.setTitle(new RssElement<String>(n.getTextContent(), parseAttributes(n)));
					break;
				case "link":
					item.setLink(new RssElement<String>(n.getTextContent(), parseAttributes(n)));
					break;
				case "author":
					item.setAuthor(new RssElement<String>(n.getTextContent(), parseAttributes(n)));
					break;
				case "category":
					item.setCategory(new RssElement<String>(n.getTextContent(), parseAttributes(n)));
					break;
				case "comments":
					item.setComments(new RssElement<String>(n.getTextContent(), parseAttributes(n)));
					break;
				case "enclosure":
					item.setEnclosure(new RssElement<String>(n.getTextContent(), parseAttributes(n)));
					break;
				case "description":
					item.setDescription(new RssElement<String>(n.getTextContent(), parseAttributes(n)));
					break;
				case "guid":
					item.setGuid(new RssElement<String>(n.getTextContent(), parseAttributes(n)));
					break;
				case "pubDate":
					item.setPubDate(new RssElement<String>(n.getTextContent(), parseAttributes(n)));
					break;
				default:
					break;
			}
		}
		return item;
	}

	private static List<String[]> parseAttributes(Node node) {
		NamedNodeMap attrs = node.getAttributes();
		ArrayList<String[]> a = new ArrayList<>();
		for(int j = 0; j < attrs.getLength(); j++) {
			a.add(new String[] { attrs.item(j).getNodeName(), attrs.item(j).getNodeValue() });
		}
		return a;
	}
	
	private RssParser() {}
}