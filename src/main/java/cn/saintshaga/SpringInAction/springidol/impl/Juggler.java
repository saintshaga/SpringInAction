package cn.saintshaga.SpringInAction.springidol.impl;

import org.springframework.stereotype.Component;

import cn.saintshaga.SpringInAction.springidol.Performer;
import cn.saintshaga.SpringInAction.springidol.exception.PerformanceException;

@Component
public class Juggler implements Performer {

	private int beanBags = 3;
	public Juggler() {
	}
	public Juggler(int beanBags) {
		this.beanBags = beanBags;
	}
	public void perform() throws PerformanceException {
		System.out.println("Juggler's beanBags:"+beanBags);
	}
	public int getBeanBags() {
		return beanBags;
	}
	public void setBeanBags(int beanBags) {
		this.beanBags = beanBags;
	}

}
