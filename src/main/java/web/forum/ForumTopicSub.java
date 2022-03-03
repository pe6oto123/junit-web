package web.forum;

import java.util.ArrayList;
import java.util.List;

public class ForumTopicSub {

    private String name;
    private String content;
    private List<Comment> comments;

    public ForumTopicSub(String name, String content, ArrayList<Comment> comments) {
	super();
	this.name = name;
	this.content = content;
	this.comments = comments;
    }

    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name;
    }

    public String getContent() {
	return content;
    }

    public void setContent(String content) {
	this.content = content;
    }

    public ArrayList<Comment> getComments() {
	return (ArrayList<Comment>) comments;
    }

    public void setComments(ArrayList<Comment> comments) {
	this.comments = comments;
    }

}
