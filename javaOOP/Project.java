public class Project {
	private String name;
	private String description;
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String elevatorPitch() {
		return name + ": "+description;
	}
	
	public Project() {
		this.setName("New Project");
		this.setDescription("Something awesome");
	}

	public Project(String name) {
		this.setName(name);
		this.setDescription("Something awesome");
	}

	public Project(String name, String description) {
		this.setName(name);
		this.setDescription(description);
	}
}