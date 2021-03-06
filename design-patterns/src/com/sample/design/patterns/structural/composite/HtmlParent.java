package com.sample.design.patterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class HtmlParent implements HtmlTag {
	private String tagName;
	private String startTag;
	private String endTag;
	private List<HtmlTag> childrenTag;

	public HtmlParent(String tagName) {
		this.tagName = tagName;
		this.startTag = "";
		this.endTag = "";
		this.childrenTag = new ArrayList<>();
	}

	@Override
	public String getTagName() {
		return tagName;
	}

	@Override
	public void setStartTag(String tag) {
		this.startTag = tag;
	}

	@Override
	public void setEndTag(String tag) {
		this.endTag = tag;
	}

	@Override
	public void addChildTag(HtmlTag htmlTag) {
		childrenTag.add(htmlTag);
	}

	@Override
	public void removeChildTag(HtmlTag htmlTag) {
		childrenTag.remove(htmlTag);
	}

	@Override
	public List<HtmlTag> getChildren() {
		return childrenTag;
	}

	@Override
	public void generateHtml() {
		System.out.println(startTag);
		for (HtmlTag tag : childrenTag) {
			tag.generateHtml();
		}
		System.out.println(endTag);

	}

}