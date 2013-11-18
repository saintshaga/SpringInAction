package cn.saintshaga.SpringInAction.springidol;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.saintshaga.SpringInAction.springidol.impl.Juggler;

public class Main {

	public static void main(String[] args) throws Exception{
		ApplicationContext context = new ClassPathXmlApplicationContext("cn/saintshaga/SpringInAction/springidol/Performer.xml");
		Performer performer = (Performer)context.getBean("kenny");
		performer.perform();
//		Thinker thinker = (Thinker)context.getBean("volunteer");
//		thinker.thinkOfSomething("greet is good!");
		((Contestant)performer).receiveAward();
	}

}
