package cm.busime.model;

import java.io.Serializable;

public class BusimeTreeNode implements Serializable {

	private static final long serialVersionUID = 20120517L;

	private String name;

	private String view;
	
	private String icon;
	
	private boolean isHeader;

	public BusimeTreeNode(String name, String view) {
		this.name = name;
		this.view = view;
		this.isHeader = false;
	}
	
	public BusimeTreeNode(String name, String view, String icon) {
		this.name = name;
		this.view = view;
		this.icon = icon;
		this.isHeader = true;
	}

	public String getName() {
		return name;
	}

	public String getView() {
		return view;
	}
	
	public String getIcon() {
		return icon;
	}
	
	public boolean isHeader() {
		return isHeader;
	}
}
