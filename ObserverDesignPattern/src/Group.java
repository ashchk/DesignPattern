
import java. util. ArrayList;
import java.util.*;

class Group { // this class is called subject in observer design pattern
	
    private List<Observer> observers = new ArrayList<>();//subscriber/observer list
    private String post; 
    private String name;
    
    Group(String name){
		this.name = name;
	}
    
    public String getName() {
        return name;
    }

    public String getPost() {
        return post;
    }

    public void newPost(String post) {
        this.post = post;
        execute();	//this function publishes new posts to subscribers
    }

    private void execute() {
        for (Observer observer : observers) {
            observer.update();	//update posts for subscribers
        }
    }
    
    public void addObserver(Observer o) {
        observers.add(o);
    }
    
    public void removeObserver(Observer o) {
        observers.remove(o);
    }
}