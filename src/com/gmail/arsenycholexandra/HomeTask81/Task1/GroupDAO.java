package com.gmail.arsenycholexandra.HomeTask81.Task1;

public interface GroupDAO {
	public void saveGroup(Group group, String filepath);

	public Group readGroup(Group group, String filepath);
}
