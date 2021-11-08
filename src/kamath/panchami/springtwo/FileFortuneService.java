package kamath.panchami.springtwo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class FileFortuneService implements FortuneService {

	private String fileName = "fortune-data.txt";
	private List<String> fortunes;
	private Random random = new Random();
	
	public FileFortuneService() {
		File theFile = new File(fileName);
		fortunes = new ArrayList<String>();
		try(BufferedReader br = new BufferedReader(new FileReader(theFile))){
			String temp;
			while((temp = br.readLine()) != null) {
				fortunes.add(temp);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
		
	@Override
	public String getFortuneService() {
		return fortunes.get(random.nextInt(fortunes.size()));
	}

}
