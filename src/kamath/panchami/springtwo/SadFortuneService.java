package kamath.panchami.springtwo;

import org.springframework.stereotype.Component;

@Component
public class SadFortuneService implements FortuneService {

	@Override
	public String getFortuneService(){
		return "This is a sad day";
	}

}
