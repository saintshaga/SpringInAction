package cn.saintshaga.SpringInAction.springidol.impl;

import javax.inject.Named;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import cn.saintshaga.SpringInAction.springidol.Instrument;

public class Saxophone implements Instrument {
	public void play() {
		System.out.println("TOOT TOOT TOOT");
	}

}
