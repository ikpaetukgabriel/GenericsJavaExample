import java.util.*;


class Gabriel<E> {
	private E myObject;
	
	public Gabriel(E myObj) {
		this.myObject = myObj;
	}

	public E getMyObject() {
		return this.myObject;
	}

}

class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");

    Scanner scanner = new Scanner(System.in);

    System.out.print("Please, enter a number: ");
    int num = scanner.nextInt();

    System.out.println(String.valueOf(num)
    .concat(": is the number."));

    scanner.close();

		Gabriel<Integer> gabeClass = new Gabriel<Integer>(num);

		System.out.println("Here is your object ".concat(String.valueOf(gabeClass.getMyObject())));
		System.out.println("And here is its class: ".concat(String.valueOf(gabeClass.getClass())));
  }
}