package lib;

public class Child {

    //data Child
	private String childNames;
	private String childIdNumbers;

    public Child (String childName, String childIdNumbers){
        this.childName = childName;
        this.childIdNumbers = childIdNumbers;
    }

    public void addChild(String childName, String childIdNumber) {
		childNames.add(childName);
		childIdNumbers.add(childIdNumber);
	}
}