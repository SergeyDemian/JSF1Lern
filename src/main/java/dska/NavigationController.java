package main.java.dska;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

@ManagedBean(name = "navigationController", eager = true)
@RequestScoped
public class NavigationController implements Serializable {


	private static final long serialVersionUID = 1L;
	
	public String moveToPage1 (){
		return "page1";
	}
	
	@ManagedProperty(value = "#{param.pageId}")
	private String pageId;
	
	public String showPage() {
		if(pageId == null) return "index";
		
		if(pageId.equals("1")) return "page1";
		else if (pageId.equals("2")) return "page2";
		else return "index";
		
	}

	public String getPageId() {
		return pageId;
	}

	public void setPageId(String pageId) {
		this.pageId = pageId;
	}

}
