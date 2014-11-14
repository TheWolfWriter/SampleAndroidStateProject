package ctec.sampleandroidstateproject.model;

import android.app.Application;
/**
 * AppState class. Used to "get" and "set" certain components for the rest of the project.
 * @author S. McKell Nichols
 * @version 1.0
 */
public class AndroidAppState extends Application
{
	/**
	 * Creates "name" option for user.
	 */
	private String name;
	/**
	 * Creates "age" option for user.
	 */
	private String age;
	/**
	 * Creates "phrase" option for user.
	 */
	private String phrase;
	/**
	 * Creates "stuff" option for user.
	 */
	private String stuff;
	
	/**
	 * Initalizes onCreate method.
	 * Also calls name, age, phrase, stuff.
	 */
	public void onCreate()
	{
		super.onCreate();
		
		name = "";
		age = "";
		phrase = "";
		stuff = "";
	}
	
	/**
	 * "Gets" the name.
	 * @return name User's name.
	 */
	public String getName()
	{
		return name;
	}
	/**
	 * "Sets" the name.
	 * @param name User's name.
	 */
	public void setName(String name)
	{
		this.name = name;
	}
	/**
	 * "Gets" the age.
	 * @return age User's age.
	 */
	public String getAge()
	{
		return age;
	}
	/**
	 * "Sets" the age.
	 * @param age User's age
	 */
	public void setAge(String age)
	{
		this.age = age;
	}
	/**
	 * "Gets" the phrase.
	 * @return phrase User's phrase.
	 */
	public String getPhrase()
	{
		return phrase;
	}
	/**
	 * "Sets" the phrase.
	 * @param phrase User's phrase.
	 */
	public void setPhrase(String phrase)
	{
		this.phrase = phrase;
	}
	/**
	 * "Gets" the stuff.
	 * @return stuff User's stuff.
	 */
	public String getStuff()
	{
		return stuff;
	}
	/**
	 * "Sets" the stuff.
	 * @param stuff User's stuff.
	 */
	public void setStuff(String stuff)
	{
		this.stuff = stuff;
	}
}
