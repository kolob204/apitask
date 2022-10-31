package helpers;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

import org.testng.annotations.DataProvider;

import POJO.User;
 
public class TestData {

	public static String getUniqueId() {
		return String.format("%s_%s", UUID.randomUUID().toString().substring(0, 5), System.currentTimeMillis() / 1000);
	}

	public static String generateRandomName() {
		return String.format("%s", getUniqueId());
	}

	public static String generateRandomEmail() {
		return String.format("%s@%s", getUniqueId(), "yourHostName.com");
	}

	@DataProvider(parallel = true)
	public Iterator<User> preparedData() {
		final User user1 = new User(generateRandomName(),generateRandomEmail(), "123456789012", new int[] { 21 }, new int[] { 12 });
		user1.setHobby("шашки");
		user1.setPhone("89031234212");
		final User user2 = new User(generateRandomName(),generateRandomEmail(), "993456789012", new int[] { 21 }, new int[] { 12 });
		user2.setHobby("велосипед");
		user2.setPhone("89278914501");
		final User user3 = new User(generateRandomName(),generateRandomEmail(), "223456782019", new int[] { 21 }, new int[] { 12 });
		user3.setHobby("киберспорт");
		user3.setPhone("89178789245");
		
		List<User> list = new ArrayList<User>() {
			{
				add(user1);
				add(user2);
				add(user3);
			}
		};
		return list.iterator();
	}
}
