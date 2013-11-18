package cn.saintshaga.SpringInAction.springidol.impl;

import org.springframework.stereotype.Component;

import cn.saintshaga.SpringInAction.springidol.Thinker;

@Component
public class Volunteer implements Thinker {
	private String thoughts;
	public void thinkOfSomething(String thoughts) {
		this.thoughts = thoughts;
		System.out.println(thoughts);
	}
	public String getThoughts() {
		return this.thoughts;
	}

}
