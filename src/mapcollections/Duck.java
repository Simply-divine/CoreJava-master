package mapcollections;

/**
 * @author Hardik
 * @version 1.0
 * custom exception for handling duck
 */
class invalidDuckException extends Exception{
    invalidDuckException(String s){
        super(s);
    }
}

/**
 * Duck class having id and swim method
 */
public class Duck {
    private String name;

    /**
     * get an id of duck
     * @return returns duck id
     * @throws invalidDuckException
     */
    public Integer getDuckidno() throws invalidDuckException {
            if(duckidno==null){
                throw new invalidDuckException(enumErrorTest.getMessage("error"));
            }
        return duckidno;
    }

    private Integer duckidno;
    EnumTest enumErrorTest=new EnumTest();
    private Duck(){
        enumErrorTest.addMessage("error","duck id is wrong");
    }

    /**
     * @param name name of duck species
     * @param duckIdNo id of that species in our zoo
     */
    Duck(String name,int duckIdNo){
        this.name=name;
        this.duckidno=duckIdNo;
    }

    /**
     * duck swimming technique
     */
    public void swim(){
        System.out.println("I am swimming");
    }

    public static void main(String[] args) {
        Duck duck=new Duck();
        try {
            duck.getDuckidno();
        } catch (invalidDuckException e) {
            e.printStackTrace();
        }
    }
}
