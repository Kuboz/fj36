package br.com.caelum;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TesteLambda {

	public static void main(String[] args) {
		ArrayList<LocalDateTime> datas = new ArrayList<>();
		
		datas.add(LocalDateTime.of(2018, 5, 5,8,00));
		datas.add(LocalDateTime.of(2018, 5, 5,13,00));
		datas.add(LocalDateTime.of(2018, 5, 5,17,00));
		
		datas.add(LocalDateTime.of(2018, 5, 6,8,00));
		datas.add(LocalDateTime.of(2018, 5, 6,13,00));
		datas.add(LocalDateTime.of(2018, 5, 6,17,00));
		
		datas.add(LocalDateTime.of(2018, 5, 7,8,00));
		datas.add(LocalDateTime.of(2018, 5, 7,13,00));
		datas.add(LocalDateTime.of(2018, 5, 7,17,00));
		
//		Map<LocalDate,List<LocalTime>> target=
		datas.stream()
		.collect(
				Collectors.groupingBy(LocalDateTime::toLocalDate,
						Collectors.mapping(LocalDateTime::toLocalTime, 
								Collectors.toList()
						)
				)
		).entrySet().forEach(System.out::println);
		
//		boolean res =datas.stream()
//		.map(LocalDateTime::toLocalDate)
//		.distinct()
//		.map(x->x.getDayOfWeek())
//		.map(DayOfWeek.MONDAY::equals)
//		.reduce(false,(a,b)->a||b);
//		System.out.println(res);
		
//		datas.stream()
//		.map(x->{
//			return x.toLocalDate();
//		})
//		.distinct()
//		.filter(x-> x.getDayOfWeek().equals(DayOfWeek.MONDAY))
//		.forEach(x->System.out.println(x));
		
	}
}
