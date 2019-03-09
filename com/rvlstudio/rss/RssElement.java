package com.rvlstudio.rss;

import java.util.Map;
import java.util.Map.Entry;
import java.util.HashMap;
import java.util.List;

public class RssElement<T> {
	private T value;
	private Map<String, String> attributes = new HashMap<>();

	public RssElement(T value, List<String[]> attributes) {
		this.value = value;
		for(String[] a : attributes) this.attributes.put(a[0], a[1]);
	}

	public RssElement(T value) {
		this.value = value;
	}

	public boolean hasValue() { return value != null; }
	public boolean hasAttributes() { return !attributes.isEmpty(); }

	public T getValue() { return value; }
	void setValue(T value) { this.value = value; }

	public Map<String, String> getAttributes() { return this.attributes; }
	public void setAttributes(Map<String, String> attributes) { this.attributes = attributes; }

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		boolean first = true;
		for(Entry<String, String> e : attributes.entrySet()) {
			if(!first) sb.append(", ");
			else first = false;
			sb.append(String.format("{ %s: %s }", e.getKey(), e.getValue()));
		}
		return getValue().toString() + sb.toString();
	}
}