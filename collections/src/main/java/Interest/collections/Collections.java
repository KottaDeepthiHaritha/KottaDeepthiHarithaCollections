package Interest.collections;
import java.util.Arrays;
import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class Collections 
{
	private static final Logger LOGGER=LogManager.getLogger(Collections.class);
    public static void main( String[] args )
    {
    	 Scanner s=new Scanner(System.in);
    	    CustomList<Integer> li= new CustomList<Integer>();
    	    li.adding(10);
    	    li.adding(22);
    	    li.adding(33);
    	    li.adding(44);
    	    li.adding(50);
    	    li.adding(66);
    	    li.adding(78);
    	    li.adding(89);
    	    li.adding(97);
    	    li.adding(100);
    	    LOGGER.info("Operations on Custom List");
    	    LOGGER.info("Elements in the Custom List are");
    	    LOGGER.info(li);
    	    LOGGER.info("Before adding the elements,the Custom List is");
    	    LOGGER.info(li);
    	    LOGGER.info("Enter an element to add");
            int add=s.nextInt();
            li.adding(add);
            LOGGER.info("After adding the elements,the Custom List is");
            LOGGER.info(li);
    	    LOGGER.info("Before deleting the elements,the Custom List is");
    	    LOGGER.info(li);
    	    LOGGER.info("Enter index of the element to be removed");
            int de=s.nextInt();
            li.remove(de);
            LOGGER.info("After deleting the elements,the Custom List is");
            LOGGER.info(li);
            LOGGER.info("Enter index of element to be fetched");
            int fet=s.nextInt();
            LOGGER.info(li.getting(fet));
            LOGGER.info("After all Operations,Elements in the Custom List are");
            LOGGER.info(li);
    }
}
