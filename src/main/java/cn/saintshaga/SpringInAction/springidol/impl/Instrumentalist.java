package cn.saintshaga.SpringInAction.springidol.impl;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import cn.saintshaga.SpringInAction.springidol.Instrument;
import cn.saintshaga.SpringInAction.springidol.Performer;
import cn.saintshaga.SpringInAction.springidol.exception.PerformanceException;

@Component("kenny")
public class Instrumentalist implements Performer {
	@Value("#{sonnet29.LINES[0]}")
	private String song;
	@Inject
	@Named("saxophone")
	private Instrument instrument;

	public void perform() throws PerformanceException {
		System.out.println("Playing " + song + ":");
		instrument.play();
	}

//	public String getSong() {
//		return song;
//	}
//
//	public void setSong(String song) {
//		this.song = song;
//	}
	
//	public void setInstrument(Instrument instrument) {
//		this.instrument = instrument;
//	}

}
