package web.forum;

import java.util.ArrayList;
import java.util.List;

public class ForumTopic {

    private String name;
    private List<ForumTopicSub> subTopics;
    
    public ForumTopic(String name, ArrayList<ForumTopicSub> arrayList) {
	super();
	this.name = name;
	this.subTopics = arrayList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<ForumTopicSub> getSubTopics() {
        return (ArrayList<ForumTopicSub>) subTopics;
    }

    public void setSubTopics(ArrayList<ForumTopicSub> subTopics) {
        this.subTopics = subTopics;
    }
    
}
