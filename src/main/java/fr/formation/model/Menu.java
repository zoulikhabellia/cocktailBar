package fr.formation.model;

public class Menu {
final	private  String title;
final	private  String url;
	
	public Menu(final String title, final String url)
	{this.title=title;
	this.url=url;
	}

	public String getTitle() {
		return title;
	}

	public String getUrl() {
		return url;
	}

}
