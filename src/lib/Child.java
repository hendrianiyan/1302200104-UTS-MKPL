package lib;

public class Child {

    //data Child
	private List<String> childNames;
	private List<String> childIdNumbers;

    public Child (){
        
    }

    public void addChild(String childName, String childIdNumber) {
		childNames.add(childName);
		childIdNumbers.add(childIdNumber);
	}
}