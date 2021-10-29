package Session;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class nasornTask {

	public static void main(String[] args) throws FileNotFoundException, ScriptException, NoSuchMethodException {
		
		ScriptEngine engine = new ScriptEngineManager().getEngineByName("nashorn");
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 2numbers:");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		
		engine.eval(new FileReader("Resource/calci.js"));
		Invocable invocable=(Invocable)engine;
		
		invocable.invokeFunction("add",num1,num2);
		invocable.invokeFunction("sub",num1,num2);
		invocable.invokeFunction("multi",num1,num2);
	}

}
