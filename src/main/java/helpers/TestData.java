package helpers;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.UUID;

import org.testng.annotations.DataProvider;

import pojo.User;
 
public class TestData {

	public static Random rand = new Random();
	
	public static String getRandomDigits(int count) {
		StringBuilder sb = new StringBuilder();
		for(int i=1;i<=count;i++) {
			sb.append(rand.nextInt(10));
		}
		return sb.toString();
	}
	
	public static String getUniqueId() {
		return String.format("%s_%s", UUID.randomUUID().toString().substring(0, 5), System.currentTimeMillis() / 1000);
	}

	public static String getInn() {			 
		return String.format("%s",getRandomDigits(12));
	}
	
	public static String getRandomPhone() {
		return String.format("89%s", getRandomDigits(9));
	}
	
	public static String getRandomHobby() {
		return String.format("%s", UUID.randomUUID().toString().substring(0, 10));
	}
	
	public static String generateRandomName() {
		return String.format("%s", getUniqueId());
	}

	public static String generateRandomEmail() {
		return String.format("%s@%s", getUniqueId(), "yourHostName.com");
	}

	@DataProvider(parallel = true)
	public Iterator<User> preparedData() { 
		return getUsers(1).iterator();
	}

	private List<User> getUsers(int count) {
		List<User> users = new ArrayList<>();
		for(int i=1;i<=count;i++) {
			User user = new User(generateRandomName(),generateRandomEmail(), getInn(), new int[] { 21 }, new int[] { 12 });
			user.setHobby(getRandomHobby());
			user.setPhone(getRandomPhone());			
			users.add(user);
		}
		return users;
	}
}
