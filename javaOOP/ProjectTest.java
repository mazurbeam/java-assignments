public class ProjectTest {
	public static void main(String[] args) {
		Project testProject1 = new Project();
		System.out.println(testProject1.elevatorPitch());
		
		Project testProject2 = new Project("Project Class", "Build a project class with name and description");
		System.out.println(testProject2.elevatorPitch());

	}
}