import java.lang.annotation.*;

import javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction;


public class Main {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException {
		TestClass tc = new TestClass();
		System.out.println("Total Anotations:" + tc.getClass().getAnnotations().length);
		
		for (Annotation anotation : tc.getClass().getAnnotations())
		{
			System.out.println(anotation.toString());
		}
		
		System.out.println("Name: " + tc.getClass().getAnnotation(ClassInfo.class).author().toString());
		System.out.println("Status: " + (tc.getClass().getAnnotation(ClassInfo.class).checked() ? "is checked waa" : "nee checked wee"));
		
		Box<Integer> box = new Box<Integer>(3);
		System.out.println(box.getObj());
		
		Box<String> box2 = new Box<String>("SAllamu Allekiku");
		System.out.println(box2.getObj());
		
		Pair<Integer, String> pair = new Pair<Integer, String>(666, "Bismillahuarrahmaniarrahim");
		System.out.println(pair);
		
		String e = Box.newInstance(String.class);
		if (e instanceof String) {
			e += "OOOOK";
			System.out.println(e);
		}
		
	}

}
