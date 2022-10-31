package POJO;

import java.util.Arrays;

public class UserCreationResponse {

	private String		email;
	private String		name;
	private String		name1;
	private String		hobby;
	private String		surname1;
	private String		fathername1;
	private String		cat;
	private String		dog;
	private String		parrot;
	private String		cavy;
	private String		hamster;
	private String		squirrel;
	private String		phone;
	private String		adres;
	private String		gender;

	private Date		date_start;
	private Date		date_updated;
	private Date		birthday;

	private String[]	role;
	private Date		date_register;
	private String		date;
	private String		by_user;
	private Company[]	companies;
	private Task[]		tasks;

	public static class Date {
		private long	sec;
		private long	usec;

		public Date() {
		}

		public long getSec() {
			return sec;
		}

		public void setSec(long sec) {
			this.sec = sec;
		}

		public long getUsec() {
			return usec;
		}

		public void setUsec(long usec) {
			this.usec = usec;
		}
	}

	public static class Company {
		private String	name;
		private int		id;

		public Company() {
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

	}

	public static class Task {
		private String	name;
		private int		id;

		public Task() {
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

	}

	public UserCreationResponse() {
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName1() {
		return name1;
	}

	public void setName1(String name1) {
		this.name1 = name1;
	}

	public String getHobby() {
		return hobby;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}

	public String getSurname1() {
		return surname1;
	}

	public void setSurname1(String surname1) {
		this.surname1 = surname1;
	}

	public String getFathername1() {
		return fathername1;
	}

	public void setFathername1(String fathername1) {
		this.fathername1 = fathername1;
	}

	public String getCat() {
		return cat;
	}

	public void setCat(String cat) {
		this.cat = cat;
	}

	public String getDog() {
		return dog;
	}

	public void setDog(String dog) {
		this.dog = dog;
	}

	public String getParrot() {
		return parrot;
	}

	public void setParrot(String parrot) {
		this.parrot = parrot;
	}

	public String getCavy() {
		return cavy;
	}

	public void setCavy(String cavy) {
		this.cavy = cavy;
	}

	public String getHamster() {
		return hamster;
	}

	public void setHamster(String hamster) {
		this.hamster = hamster;
	}

	public String getSquirrel() {
		return squirrel;
	}

	public void setSquirrel(String squirrel) {
		this.squirrel = squirrel;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAdres() {
		return adres;
	}

	public void setAdres(String adres) {
		this.adres = adres;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Date getDate_start() {
		return date_start;
	}

	public void setDate_start(Date date_start) {
		this.date_start = date_start;
	}

	public Date getDate_updated() {
		return date_updated;
	}

	public void setDate_updated(Date date_updated) {
		this.date_updated = date_updated;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String[] getRole() {
		return role;
	}

	public void setRole(String[] role) {
		this.role = role;
	}

	public Date getDate_register() {
		return date_register;
	}

	public void setDate_register(Date date_register) {
		this.date_register = date_register;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getBy_user() {
		return by_user;
	}

	public void setBy_user(String by_user) {
		this.by_user = by_user;
	}

	public Company[] getCompanies() {
		return companies;
	}
	
	public int[] getCompaniesAsIntArrayOfId() {
		 return Arrays.stream(companies)
			.mapToInt(x -> x.getId())
			.toArray();
	}
	
	public void setCompanies(Company[] companies) {
		this.companies = companies;
	}

	public Task[] getTasks() {
		return tasks;
	}

	public void setTasks(Task[] tasks) {
		this.tasks = tasks;
	}

}
