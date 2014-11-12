package ctec.sampleandroidstateproject.model;

import android.app.Application;

public class AndroidAppState extends Application
{
	private String name;
	private String age;
	private String phrase;
	private String stuff;
	
	public void onCreate()
	{
		super.onCreate();
		
		name = "";
		age = "";
		phrase = "";
		stuff = "";
	}
	
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public String getAge()
	{
		return age;
	}
	public void setAge(String age)
	{
		this.age = age;
	}
	public String getPhrase()
	{
		return phrase;
	}
	public void setPhrase(String phrase)
	{
		this.phrase = phrase;
	}
	public String getStuff()
	{
		return stuff;
	}
	public void setStuff(String stuff)
	{
		this.stuff = stuff;
	}
}
