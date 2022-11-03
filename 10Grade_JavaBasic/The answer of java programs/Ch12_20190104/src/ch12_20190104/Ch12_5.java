/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch12_20190104;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 * @author xvpow
 */
public class Ch12_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	Student st1 = new Student("Ken",25);
	Student st2 = new Student("Vivin",27);
	Student st3 = new Student("Join",30);
	Student st4 = new Student("Lucy",36);
	Student st5 = new Student("Iris",10);
	Student st6 = new Student("Ben",21);
Stream<Student> stream=	Stream.of(st1,st2,st3,st4,st5,st6);
//幫我用年齡群組 ---5
// Map<Integer,List<Student>>  groupSt =  stream.collect(
//	 Collectors.groupingBy(st->st.getAge() / 10)  );
// System.out.println(groupSt);
//幫我計算每一群的人數 --5
// Map<Integer,Long>  groupCount2 =  stream.collect(
//	 Collectors.groupingBy(st->(st.getAge() / 10)*10,
//		 Collectors.mapping(st->st, Collectors.counting()))  );
// System.out.println(groupCount2);

   String names = 
	   stream.map(st->st.getName()).
		   collect(Collectors.joining(",", "Title:", "."));
	System.out.println(names);
    }
    
}
