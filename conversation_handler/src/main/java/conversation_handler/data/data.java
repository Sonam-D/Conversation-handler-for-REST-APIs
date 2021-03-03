package conversation_handler.data;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class data {
private String name;
private String date;
private String Path;

public String getName() {
	return this.name;
}

public data() {
	
}

public data(String name, String current) {
	
	this.name = name;
	this.date = current;
	
}


public String getPath() {
	return Path;
}

public void setPath(String path) {
	Path = path;
}

public void setName(String name) {
	this.name = name;
}
public String getdate() {
	System.out.println("Printing date");
	System.out.println(this.date);
	return this.date;
}
public void setdate(String current) {
	this.date = current;
}

}
