package cn.saintshaga.SpringInAction.springidol;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;
import org.springframework.stereotype.Component;

import cn.saintshaga.SpringInAction.springidol.impl.GraciousContestant;

@Component
@Aspect
public class ContestantIntroducer {
	@DeclareParents(value="cn.saintshaga.SpringInAction.springidol.Performer+",
			defaultImpl=GraciousContestant.class)
	public static Contestant contestant;
	
}
