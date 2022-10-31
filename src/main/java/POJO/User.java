package POJO;

public class User {

	//Обязательные поля
	private String	name;
	private String	email;
	private int[]	companies;
	private int[]	tasks;
	private String	inn;		//12 digits

	//Не обязательные поля
	private String	hobby;
	private String	adres;
	private String	name1;
	private String	surname1;
	private String	fathername1;
	private String	cat;
	private String	dog;
	private String	parrot;
	private String	cavy;
	private String	hamster;
	private String	squirrel;
	private String	phone;
	private String	gender;
	private String	birthday;
	private String	date_start;

	public User() {
	}

	public User(String name, String email, String inn, int[] companies, int[] tasks) {
		super();
		this.name = name;
		this.email = email;
		this.inn = inn;
		this.companies = companies;
		this.tasks = tasks;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getInn() {
		return inn;
	}

	public void setInn(String inn) {
		this.inn = inn;
	}

	public int[] getCompanies() {
		return companies;
	}

	public void setCompanies(int[] companies) {
		this.companies = companies;
	}

	public int[] getTasks() {
		return tasks;
	}

	public void setTasks(int[] tasks) {
		this.tasks = tasks;
	}

	public String getHobby() {
		return hobby;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}

	public String getAdres() {
		return adres;
	}

	public void setAdres(String adres) {
		this.adres = adres;
	}

	public String getName1() {
		return name1;
	}

	public void setName1(String name1) {
		this.name1 = name1;
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

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getDate_start() {
		return date_start;
	}

	public void setDate_start(String date_start) {
		this.date_start = date_start;
	}

}
