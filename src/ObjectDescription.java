import java.io.ObjectStreamClass;
import java.io.ObjectStreamField;
import java.util.Arrays;


public class ObjectDescription {
	public static void main (String[] args) {
		ObjectStreamClass osc = ObjectStreamClass.lookupAny(chapter7.User.class);
		System.out.println(osc.forClass());
		ObjectStreamField[] userStreamFields = osc.getFields();
		String text ="";
		char[] password;
		text = System.console().readLine("%s","Enter data: \n");
		//System.out.println("enter psw: ");
		password=System.console().readPassword("%s","enter psw");
		System.out.println(Arrays.toString(password));
		System.out.println(text);
		ObjectStreamField obj2 = osc.getField("age");

		System.out.println(osc.getSerialVersionUID());
		System.out.println(obj2);
		for (ObjectStreamField obj : userStreamFields) {
			System.out.println(obj.getName()+" "+obj.getType());
	}

	}
}
