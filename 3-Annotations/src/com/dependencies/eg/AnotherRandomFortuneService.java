package com.dependencies.eg;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Random;
import org.springframework.stereotype.Component;
import javax.annotation.PostConstruct;

@Component
public class AnotherRandomFortuneService implements IFortuneService {
	
	ArrayList<String> fortuneList;
	
	Random random = new Random();
	
	AnotherRandomFortuneService() {
		System.out.println("Inside another random fortune service constructor...");
		fortuneList = new ArrayList<String>();
	}
	
	@PostConstruct
	public void loadFortunes() {
		System.out.println("Loading files..");
		var fileName = "fortune-list.txt";
		URL url = getClass().getResource(fileName);
		File file = new File(url.getPath());
		try
		{
			BufferedReader bf = new BufferedReader(new FileReader(file));
			String line;
			while((line = bf.readLine())!=null) {
				fortuneList.add(line);
			}
			bf.close();
		}
		catch(IOException e) {
			System.out.println(e);
		}
	}
	
	@Override
	public String getFortune() {
		
		System.out.println("File lines count: "+fortuneList.size());
		int index = random.nextInt(fortuneList.size());
		System.out.println("Index: "+index);
		return fortuneList.get(index);
	}
}
