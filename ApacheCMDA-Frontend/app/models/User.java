/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package models;

import com.fasterxml.jackson.databind.JsonNode;
import play.data.validation.Constraints;
import play.data.validation.ValidationError;
import util.APICall;
import util.Constants;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class User {

	private static final String GET_ALL_USER = Constants.NEW_BACKEND + "users/getAllUsers/json";
	private static final String GET_ONE_USER = Constants.NEW_BACKEND + "users/";

	public long id;
	public String userName;
	public String firstName;
	public String lastName;
	public String affiliation;
	public String email;
	public String password;
	public String description;

/*
	@Id
	@Constraints.Min(10)
	public long id;

	@Constraints.Required(groups = { SignIn.class, SignUp.class, Update.class })
	public String password;

	@Constraints.Email
	@Column(unique = true)
	@Constraints.Required(groups = { SignIn.class, SignUp.class, Update.class })
	public String email;

	private String userName;
	@Constraints.Required
	private String firstName;
	@Constraints.Required
	private String lastName;
	private String middleInitial;
	private String affiliation;
	private String title;


	private String mailingAddress;
	private String phoneNumber;
	private String faxNumber;
	private String researchFields;
	private String highestDegree;

	// @OneToMany(mappedBy = "user", cascade={CascadeType.ALL})
	// private Set<ClimateService> climateServices = new
	// HashSet<ClimateService>();
*/
	public User() {
	}

	public static User getUser(long userId) {

		JsonNode json = APICall.callAPI(GET_ONE_USER + userId);

		User user = new User();
		user.id = json.get("id").asInt();
		//System.out.println("here");
		user.userName = getField(json, "userName");
		user.firstName = getField(json, "firstName");
		user.lastName = getField(json, "lastName");
		user.affiliation = getField(json, "affiliation");
		user.email = getField(json, "email");
		user.password = getField(json, "password");
		user.description = getField(json, "description");

		return user;
	}

	public static List<User> all() {

		List<User> users = new ArrayList<User>();

		JsonNode userNode = APICall.callAPI(GET_ALL_USER);

		if (userNode == null || userNode.has("error")
				|| !userNode.isArray()) {
			return users;
		}

		for (int i = 0; i < userNode.size(); i++) {
			JsonNode json = userNode.path(i);
			User user = new User();
			user.id = json.get("id").asLong();
			//System.out.println("here");
			user.userName = getField(json, "userName");
			user.firstName = getField(json, "firstName");
			user.lastName = getField(json, "lastName");
			user.affiliation = getField(json, "affiliation");
			user.email = getField(json, "email");
			user.password = getField(json, "password");
			user.description = getField(json, "description");
			users.add(user);
		}
		return users;
	}

	public static String getField(JsonNode node, String fieldName) {
		if(node.get(fieldName)!=null) {
			return node.get(fieldName).asText();
		}
		else {
			return "";
		}
	}
	/*
	public User(String userName, String password, String firstName,
			String lastName, String middleInitial, String affiliation,
			String title, String email, String mailingAddress,
			String phoneNumber, String faxNumber, String researchFields,
			String highestDegree) {
		super();
		this.userName = userName;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.middleInitial = middleInitial;
		this.affiliation = affiliation;
		this.title = title;
		this.email = email;
		this.mailingAddress = mailingAddress;
		this.phoneNumber = phoneNumber;
		this.faxNumber = faxNumber;
		this.researchFields = researchFields;
		this.highestDegree = highestDegree;
	}

	public long getId() {
		return id;
	}

	public String getUserName() {
		return userName;
	}

	public String getPassword() {
		return password;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getMiddleInitial() {
		return middleInitial;
	}

	public String getAffiliation() {
		return affiliation;
	}

	public String getTitle() {
		return title;
	}

	public String getEmail() {
		return email;
	}

	public String getMailingAddress() {
		return mailingAddress;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public String getFaxNumber() {
		return faxNumber;
	}

	public String getResearchFields() {
		return researchFields;
	}

	public String getHighestDegree() {
		return highestDegree;
	}
	
	public void setId(long id) {
		this.id = id;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setMiddleInitial(String middleInitial) {
		this.middleInitial = middleInitial;
	}

	public void setAffiliation(String affiliation) {
		this.affiliation = affiliation;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setMailingAddress(String mailingAddress) {
		this.mailingAddress = mailingAddress;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public void setFaxNumber(String faxNumber) {
		this.faxNumber = faxNumber;
	}

	public void setResearchFields(String researchFields) {
		this.researchFields = researchFields;
	}

	public void setHighestDegree(String highestDegree) {
		this.highestDegree = highestDegree;
	}

	public static Finder<Long, User> find = new Finder<Long, User>(
			Long.class, User.class
	);

	public static User byEmail(String email) {
		return find.where()
				.eq("email", email)
				.findUnique();
	}

	public static User byEmailAndPassword(String email, String password) {
		return find.where()
				.eq("email", email)
				.eq("password", password)
				.findUnique();
	}

	public List<ValidationError> validate(Class group) {
		List<ValidationError> errors = new ArrayList<ValidationError>();

		if (group == SignIn.class) {
			User user = byEmailAndPassword(email, password);

			if (user == null) {
				errors.add(new ValidationError("", "Invalid email or password."));
			}
		} else if (group == SignUp.class) {
			if (User.byEmail(email) != null) {
				errors.add(new ValidationError("email", "This email is already registered."));
			}
		}

		return errors.isEmpty() ? null : errors;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", userName=" + userName + ", password="
				+ password + ", firstName=" + firstName + ", lastName="
				+ lastName + ", middleInitial=" + middleInitial
				+ ", affiliation=" + affiliation + ", title=" + title
				+ ", email=" + email + ", mailingAddress=" + mailingAddress
				+ ", phoneNumber=" + phoneNumber + ", faxNumber=" + faxNumber
				+ ", researchFields=" + researchFields + ", highestDegree="
				+ highestDegree + "]";
	}

	public interface SignIn { }

	public interface SignUp { }

	public interface Update { }
	*/
}

