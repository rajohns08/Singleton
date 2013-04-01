package singleton;

public class Singleton {
	
	private static Singleton uniqueInstance;									// Create a static object. Needs to be static so it can be used by static method
	
	private Singleton(){}														// Make constructor private so that an object cannot be instantiated from outside class
	
	public static synchronized Singleton getInstance()							// Make a static method to create an instance that can be called from 
	{																			// Make it synchronized to ensure only one thread can enter at a time
		if (uniqueInstance == null)												// Only create a new instance if one has not been created, otherwise return existing instance
		{
			uniqueInstance = new Singleton();
		}
		
		return uniqueInstance;
	}

}
