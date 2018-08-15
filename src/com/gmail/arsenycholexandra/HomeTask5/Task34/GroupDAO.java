package com.gmail.arsenycholexandra.HomeTask5.Task34;

public interface GroupDAO {
	public void saveGroup(Group group, String filepath);

	public Group readGroup(Group group, String filepath);
}
