package mapcollections;

import java.util.EnumMap;

public final class EnumTest {
    private EnumMap<Message,String> siteMessage = new EnumMap<>(Message.class);

    public boolean addMessage(String type,String msg){
        try {
            siteMessage.put(Message.valueOf(type.toUpperCase()),msg);
            return true;
        } catch (IllegalArgumentException e) {
            return false;
        }
    }

    public String getMessage(String type){
        String message = null;
        try {
            message = siteMessage.get(Message.valueOf(type.toUpperCase()));
            return message;
        } catch (IllegalArgumentException e) {
            return message;
        }
    }
    public static void main(String[] args) {
        EnumTest test = new EnumTest();
        test.addMessage("error","Ide not working");
        test.addMessage("success","Ide is ready to use!");

        System.out.println(test.getMessage("success"));

    }
}
