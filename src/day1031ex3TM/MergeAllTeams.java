package day1031ex3TM;


public class MergeAllTeams extends MergingTemplate<Team> {

	@Override
	protected void move(Sequence<Team> s, Sequence<Team> g) {
		g.add(s.head());
		s.tail();
	}

	@Override
	protected void move(Sequence<Team> s1, Sequence<Team> s2, Sequence<Team> g) {
		move(s1, g);
		move(s2, g);
	}

	@Override
	protected void moveTail(Sequence<Team> s, Sequence<Team> g) {
		g.addAll(s);
		while (!s.isEmpty()) {
			s.tail();
		}
	}
}
