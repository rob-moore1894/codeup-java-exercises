public class User {
//    Create a class called User.
//    The User should have the following properties:
//            - private username
    private String username;
//            - private password
    private String password;
//            - private numberOfSuccessfulLogins that tracks the number of times
    private int numberOfSuccessfulLogins = 0;
//            - private numberOfFailedLoginAttempts
    private int numberofFailedLoginAttempts = 0;
//            - private isLoggedIn boolean property and default it to false.
    private boolean isLoggedIn = false;
//            - private static int numberOfUsers.
    private static int numberOfUsers;
//
//    The User class should have the following methods and functionality
//            - login() should accept the username and password as arguments and compare them to the username and password properties of that specific user object.. If these match for that particular user, set isLoggedIn to true. If there have been at least 3 failed login attempts, then this method should output "YOUR ACCOUNT HAS BEEN TEMPORARILY SUSPENDED.".

    private boolean login(String username, String password){
        if (username == this.username && password == this.password){
            return true;
        } else {
            return false;
        }
    }
//            - logout() should set isLoggedIn to false.
//            - wait5minutes() should reset the numberOfFailedLoginAttempts to zero. For the basic version of this, don't worry about the 5 minute delay, only force the calling code to call this method before logging in. As a bonus, implement the 5 minute delay.
//            - every time a new user is created, increment numberOfUsers by one.
//            - a public static getNumberOfUsers method that returns the number of users in the application.
//- changePassword() method should take in the current password, if it matches for that specific user, then prompt the user w/ scan/input class to change to the new password. As soon as the password is changed, print that the account is logged out and then logout the user.
//
//
//    The User constructor should accept two strings, the username and the password, as arguments.

    public User(String username, String password) {
        this.username = username;
        this.password = password;
        numberofFailedLoginAttempts = 0;
        numberOfSuccessfulLogins = 0;
        numberOfUsers++;
    }
//
//    Make a class called UserTest.java to test out the code below:
//            - make a user, purposefully fail to login 3 times, then wait five minutes, then login.
//- now, change that user's password and re-log in with the new password.
//            - make a second user and login successfully
//- output the number of users.
}
