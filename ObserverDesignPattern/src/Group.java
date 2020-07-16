
import java.util.ArrayList;
import java.util.*;

class Group implements Subject{ // this class is called subject in observer design pattern
	
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
        notifyObserver();	//this function notifies new posts to observers
    }

    public void notifyObserver() {
        for (Observer observer : observers) {
            observer.update(this.getPost());	//update posts for observers
        }
    }
    
    public void registerObserver(Observer o) {
        observers.add(o); //add observer object to list
    }
    
    public void removeObserver(Observer o) {
        observers.remove(o); //remove observer object from list 
    }
}
