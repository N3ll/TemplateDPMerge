package day1031ex3TM;

import java.util.Iterator;

import day1031ex3TM.Team.Weekday;

public class TestTeams {

	public static void main(String[] args) {
		Sequence<Team> agf = new ListSequence<Team>();
		Team one = new Team(Weekday.Tuesday, "basketball");
		Team two = new Team(Weekday.Tuesday, "volleyball");
		Team three = new Team(Weekday.Thursday, "football");
		Team four = new Team(Weekday.Thursday, "handball");

		agf.add(one);
		agf.add(two);
		agf.add(three);
		agf.add(four);
		agf.add(one);

		Sequence<Team> aia = new ListSequence<Team>();
		Team five = new Team(Weekday.Tuesday, "basketball");
		Team six = new Team(Weekday.Wednesday, "floorball");
		Team seven = new Team(Weekday.Thursday, "football");

		aia.add(five);
		aia.add(six);
		aia.add(seven);

		Iterator<Team> iterator = agf.iterator();
		System.out.println("Team AGF:");
		while (iterator.hasNext()) {
			Team obj = iterator.next();
			System.out.println(obj);
		}

		System.out.println("Team AIA:");
		for (iterator = aia.iterator(); iterator.hasNext();) {
			Team obj = iterator.next();
			System.out.println(obj);
		}

		MergingTemplate<Team> jT = new JoinTeams();
		Sequence<Team> join = new ListSequence<Team>();
		jT.merge(aia, agf, join);

		iterator = join.iterator();
		System.out.println("After merging:");
		while (iterator.hasNext()) {
			Team obj = iterator.next();
			System.out.println(obj);
		}

		// MergingTemplate<Team> mT = new MergeAllTeams();
		// Sequence<Team> all = new ListSequence<Team>();
		// mT.merge(aia, agf, all);
		//
		// iterator = all.iterator();
		// System.out.println("After merging:");
		// while (iterator.hasNext()) {
		// Team obj = iterator.next();
		// System.out.println(obj);
		// }
		//
		// //Should the sequences be empty after the merging?
		// System.out.println("Team AIA:");
		// for (iterator = aia.iterator(); iterator.hasNext();) {
		// Team obj = iterator.next();
		// System.out.println(obj);
		// }

	}

}
