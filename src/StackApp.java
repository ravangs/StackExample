
public class StackApp {
	
	public static void main(String[] args) {
		
		StackUser stackUser = new StackUser();
		Stack CurrentStack = new FixedStackArray(10);
		stackUser.fill(CurrentStack);
		stackUser.empty(CurrentStack);
	}
}
