package cn.saintshaga.SpringInAction.springidol.impl;

import org.springframework.stereotype.Component;

import cn.saintshaga.SpringInAction.springidol.Contestant;

@Component
public class GraciousContestant implements Contestant {

	public void receiveAward() {
		System.out.println("receive a award!");
	}

}
