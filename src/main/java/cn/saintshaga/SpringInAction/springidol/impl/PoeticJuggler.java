package cn.saintshaga.SpringInAction.springidol.impl;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.stereotype.Component;

import cn.saintshaga.SpringInAction.springidol.Poem;
import cn.saintshaga.SpringInAction.springidol.exception.PerformanceException;

@Component
public class PoeticJuggler extends Juggler{
	private Poem poem;
	@Inject
	@Named("sonnet29")
	public PoeticJuggler(Poem poem) {
		super();
		this.poem = poem;
	}
	public PoeticJuggler(int beanBags, Poem poem) {
		super(beanBags);
		this.poem = poem;
	}
	
	public void perform() throws PerformanceException{
		super.perform();
		System.out.println("While reciting....");
		poem.recite();
	}
}
