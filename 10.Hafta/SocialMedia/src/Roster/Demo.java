package Roster;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.Comparator;
import java.util.function.Predicate;

import Roster.RosterTest.CheckPerson;

import java.lang.Iterable;
import java.time.chrono.IsoChronology;




public class Demo {
	

    public static void main(String[] args) {
        List<Person> roster = Person.createRoster();
        for (Person p : roster) {
            p.printPerson();
        }
        
        roster.
        stream().
        filter(new Predicate<Person>() {
			@Override
			public boolean test(Person t) {
				
				return t.getAge()>30;
			}
        	
		}).
        map(p->p.name).
        forEach(d->System.out.println(d));
        
    }   
       
}