package learn.java.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SixApril {

	public static void main(String[] args) {

		Group grp1 = new Group(1, "grp1");
		Group grp2 = new Group(2, "grp1");
		Group grp3 = new Group(3, "grp3");
		Group grp4 = new Group(5, "grp5");
		Group grp5 = new Group(4, "grp4");

		List<Group> grpList = new ArrayList<>();

		grpList.add(grp1);
		grpList.add(grp2);
		grpList.add(grp3);
		grpList.add(grp4);
		grpList.add(grp5);

		List<Group> greter3List = grpList.stream().sorted(Comparator.naturalOrder()).filter(x -> (x.groupId > 3))
				.collect(Collectors.toList());

		Map<String, Long> mapResult = grpList.stream().collect(Collectors.groupingBy(Group::getGroupName,Collectors.counting()));
		
		System.out.println(mapResult);
		
		List<String> items = Arrays.asList("apple", "apple", "banana", "apple", "orange", "banana", "papaya");
		
		Map<String,Long> resMap = items.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		
		System.out.println(resMap);

	}

}

class Group implements Comparable<Group> {

	int groupId;
	String groupName;

	public Group(int groupId, String groupName) {
		super();
		this.groupId = groupId;
		this.groupName = groupName;
	}

	@Override
	public int compareTo(Group o) {
		return this.groupId - o.groupId;
	}

	public int getGroupId() {
		return groupId;
	}

	public void setGroupId(int groupId) {
		this.groupId = groupId;
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

}
