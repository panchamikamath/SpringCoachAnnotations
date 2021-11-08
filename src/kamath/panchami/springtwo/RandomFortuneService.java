package kamath.panchami.springtwo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	//create an array of strings
	private String[] data = {
			"The journey is reward",
			"Patience is the key"
	};
	
	private Random random = new Random();
	
	@Override
	public String getFortuneService() {
		return data[random.nextInt(data.length)];
	}

}
