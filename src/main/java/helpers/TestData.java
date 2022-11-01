package helpers;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.UUID;

import org.json.simple.JSONObject;
import org.testng.annotations.DataProvider;

public class TestData {

	public static Random rand = new Random();

	public static String getRandomDigits(int count) {
		StringBuilder sb = new StringBuilder();
		for (int i = 1; i <= count; i++) {
			sb.append(rand.nextInt(10));
		}
		return sb.toString();
	}

	public static String getUniqueId() {
		return String.format("%s_%s", UUID.randomUUID().toString().substring(0, 5), System.currentTimeMillis() / 1000);
	}

	public static String getInn() {
		return String.format("%s", getRandomDigits(12));
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
	public Iterator<JSONObject> preparedData() {
		return getUsers(3).iterator();
	}
 
	private List<JSONObject> getUsers(int count) {
		List<JSONObject> users = new ArrayList<>();
		for (int i = 1; i <= count; i++) {
			JSONObject user = new JSONObject();
			user.put("name", generateRandomName());
			user.put("email", generateRandomEmail());
			user.put("inn", getInn());
			user.put("companies", new int[] { 21 });
			user.put("tasks", new int[] { 12 });
			user.put("hobby", getRandomHobby());
			user.put("phone", getRandomPhone());
			users.add(user);
		}
		return users;
	}
}
