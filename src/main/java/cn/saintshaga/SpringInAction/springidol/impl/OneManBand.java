package cn.saintshaga.SpringInAction.springidol.impl;

import java.util.Collection;

import org.springframework.stereotype.Component;

import cn.saintshaga.SpringInAction.springidol.Instrument;
import cn.saintshaga.SpringInAction.springidol.Performer;
import cn.saintshaga.SpringInAction.springidol.exception.PerformanceException;

@Component
public class OneManBand implements Performer {

	private Collection<Instrument> instruments;
	public void perform() throws PerformanceException {
		for (Instrument instrument : instruments) {
			instrument.play();
		}
	}
	public Collection<Instrument> getInstruments() {
		return instruments;
	}
	public void setInstruments(Collection<Instrument> instruments) {
		this.instruments = instruments;
	}

}
