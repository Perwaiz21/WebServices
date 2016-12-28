package com.tutorialspoint;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class UserDao {
	/*public List<User> getAllUsers() {
		List<User> userList = null;
		try {
			File file = new File("Users.txt");
			if (!file.exists()) {
				User user = new User(1, "Mahesh", "Teacher");
				userList = new ArrayList<User>();
				userList.add(user);
				saveUserList(userList);
			} else {
				FileInputStream fis = new FileInputStream(file);
				ObjectInputStream ois = new ObjectInputStream(fis);
				userList = (List<User>) ois.readObject();
				ois.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return userList;
	}*/

		
	public List<User> getAllAnotherUsers() {
		List<User> userList = null;
		try {
			
			File file = new File("D:/Carey_perwaiz/Webservices Tutorial/WorkSpace-For-Webservices/UserManagement/WebContent/Users.xml");
			if (!file.exists()) {
			
			User user = new User(1, "Kunal", "Sr.Software Engineer");
			userList = new ArrayList<User>();
			userList.add(user);
			}
			else {
				FileInputStream fis = new FileInputStream(file);
				ObjectInputStream ois = new ObjectInputStream(fis);
				try {
					userList = (List<User>) ois.readObject();
				} catch (ClassNotFoundException e) {
					e.printStackTrace();
				}
				ois.close();
			}
			FileOutputStream fos = new FileOutputStream(file);

			ObjectOutputStream oos = new ObjectOutputStream(fos);

			oos.writeObject(userList);
			oos.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return userList;
	}
	
	
	
	public List<User> getAnotherUsersUpdatePut() {
		List<User> userList = null;
		try {
			
			File file = new File("D:/Carey_perwaiz/Webservices Tutorial/WorkSpace-For-Webservices/UserManagement/WebContent/Users.xml");
			if (!file.exists()) {
			
			User user = new User(1, "Kunal", "Sr.Software Engineer");
			userList = new ArrayList<User>();
			userList.add(user);
			}
			else {
				FileInputStream fis = new FileInputStream(file);
				ObjectInputStream ois = new ObjectInputStream(fis);
				try {
					userList = (List<User>) ois.readObject();
				} catch (ClassNotFoundException e) {
					e.printStackTrace();
				}
				ois.close();
			}
			FileOutputStream fos = new FileOutputStream(file);

			ObjectOutputStream oos = new ObjectOutputStream(fos);

			oos.writeObject(userList);
			oos.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return userList;
	}
	
	

	/*private void saveUserList(List<User> userList) {
		try {
			File file = new File("Users.txt");
			FileOutputStream fos;

			fos = new FileOutputStream(file);

			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(userList);
			oos.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}*/
}