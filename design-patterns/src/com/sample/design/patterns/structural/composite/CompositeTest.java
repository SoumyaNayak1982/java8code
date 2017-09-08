package com.sample.design.patterns.structural.composite;

public class CompositeTest {
	// Component
	// Leaf
	// Composite
	// Client
	public static void main(String[] args) {
		HtmlTag parentTag = new HtmlParent("<html>");
		parentTag.setStartTag("<html>");
		parentTag.setEndTag("</html>");

		HtmlTag p1 = new HtmlParent("<body>");
		p1.setStartTag("<body>");
		p1.setEndTag("</body>");

		parentTag.addChildTag(p1);

		HtmlTag child1 = new HtmlElement("<p>");
		child1.setStartTag("<p>");
		child1.setEndTag("</p>");
		child1.setTagBody("Testing html tag library");
		p1.addChildTag(child1);

		child1 = new HtmlElement("<p>");
		child1.setStartTag("<p>");
		child1.setEndTag("</p>");
		child1.setTagBody("Paragraph 2");
		p1.addChildTag(child1);

		parentTag.generateHtml();

	}

}