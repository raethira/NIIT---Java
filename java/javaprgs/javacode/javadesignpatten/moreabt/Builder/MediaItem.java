class MediaItem
{
  private String s;
  public MediaItem(String s)
  {
	  this.s = s;
  }
 public String toString()
 {
	 return s;
  }
}

class Chapter extends MediaItem {
  public Chapter(String s) { super(s); }
}
class Article extends MediaItem {
  public Article(String s) { super(s); }
}
class WebItem extends MediaItem {
  public WebItem(String s) { super(s); }
}