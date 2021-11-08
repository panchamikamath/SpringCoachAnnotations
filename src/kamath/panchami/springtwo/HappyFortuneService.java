package kamath.panchami.springtwo;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortuneService(){
		return "This is your lucky day";
	}

}
