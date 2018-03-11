package main.java.dska;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;

@ManagedBean(name="helloWorld", eager = true)
public class HelloWorld implements Serializable {

	private static final long serialVersionUID = 1L;
	
	public String str = "Hello yyyyyyyyyaaaaaahhhhhhhhhhhuuuuuuuuuuu!!!!";

	public HelloWorld() {
		System.out.println("Привет");
	}

	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}
	
}
