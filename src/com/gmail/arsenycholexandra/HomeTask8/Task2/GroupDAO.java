package com.gmail.arsenycholexandra.HomeTask8.Task2;

public interface GroupDAO {
	public void saveGroup(Group group, String filepath);

	public Group readGroup(Group group, String filepath);
}
