import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(value = RetentionPolicy.RUNTIME)
public @interface ClassInfo {
	
	String author();
	int revision();
    boolean checked() default false;
    Class<?>[] relatedClasses();
}
