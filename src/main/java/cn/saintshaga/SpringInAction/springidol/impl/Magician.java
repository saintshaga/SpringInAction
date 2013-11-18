package cn.saintshaga.SpringInAction.springidol.impl;

import org.springframework.stereotype.Component;

import cn.saintshaga.SpringInAction.springidol.MindReader;

@Component
public class Magician implements MindReader {
	private String thoughts;
	public void interceptThoughts(String thoughts) {
		System.out.println("Intercepting volunteer's thoughts");
		this.thoughts = thoughts;
	}

	public String getThoughts() {
		return thoughts;
	}

}
