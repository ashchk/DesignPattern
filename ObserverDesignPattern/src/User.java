
import java.util.*;

class User extends Observer {
    private String name;
    
    User(){
		this.name = "Empty";
	}
    
    User(String name){
		this.name = name;
	}
	
	public void Subscribe(Group grp) {
		this.grp = grp;
		this.grp.addObserver(this);
		System.out.print(this.name+" subscribes "+grp.getName()+"\n");
	}
	
	public void unSubscribe(Group grp) {
		this.grp = grp;
		this.grp.removeObserver(this);
		System.out.print("\n"+this.name+" unsubscribes "+grp.getName()+"\n");
	}
	
	public String getName() {
        return name;
    }

    public void update() {
        System.out.print(this.name +" got new post: " + grp.getPost()+"\n");
    }
}