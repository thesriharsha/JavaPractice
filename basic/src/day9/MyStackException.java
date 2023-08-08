package day9;

interface Stack {
	void push(String value) throws StackIsFullException;

	String pop() throws StackIsEmptyException;

	int length();
}

class StackIsEmptyException extends Exception {
}

class StackIsFullException extends Exception {
}

public class MyStackException implements Stack {

	private String data[] = new String[10];
	private int top = 0;

	@Override
	public void push(String value) throws StackIsFullException {
		if (data.length != top)
			data[top++] = value;
		else
			throw new StackIsFullException();
	}

	@Override
	public String pop() throws StackIsEmptyException {
		if (top != 0)
			return data[--top];
		else {
			throw new StackIsEmptyException();
		}

	}

	@Override
	public int length() {
		// TODO Auto-generated method stub
		return top;
	}

	public static void main(String[] args) {
		MyStackException m = new MyStackException();
		try {
			m.push("Harsha");
			m.pop();
			m.pop();

		} catch (StackIsEmptyException e) {
			System.out.println("Stack is Empty");
		} catch (StackIsFullException e) {
			System.out.println("Stack is full");

		}
	}
}
