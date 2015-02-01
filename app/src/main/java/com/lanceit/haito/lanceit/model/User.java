package com.lanceit.haito.lanceit.model;

import org.json.JSONException;
import org.json.JSONObject;

public class User {

    private String username;
    private int age;
    private long phoneNumber;
    private String firstName;
    private String lastName;
    private String email;

    public User(String username, int age, long phoneNumber, String firstName, String lastName, String email) {
        this.username = username;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public static User parseFromJSON(JSONObject userInJSON){
        try {
            return new User(
                    userInJSON.getString("username"),
                    userInJSON.getInt("age"),
                    userInJSON.getLong("phoneNumber"),
                    userInJSON.getString("firstName"),
                    userInJSON.getString("lastName"),
                    userInJSON.getString("email")
                    );
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
