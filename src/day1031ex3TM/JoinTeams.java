package day1031ex3TM;

import java.util.Iterator;

public class JoinTeams extends MergingTemplate<Team> {

	@Override
	protected void move(Sequence<Team> s, Sequence<Team> g) {
		g.add(s.head());
		s.tail();
	}

	@Override
	protected void move(Sequence<Team> s1, Sequence<Team> s2, Sequence<Team> g) {
		g.add(s1.head());
		g.add(s2.head());
		s1.tail();
		s2.tail();
	}

	@Override
	protected void moveTail(Sequence<Team> s, Sequence<Team> g) {
		Iterator<Team> i = s.iterator();
		while (i.hasNext()) {
			Team obj = i.next();
			g.add(obj);
		}
	}

}
