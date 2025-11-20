class User {

String username;

String email;

int followers;

// Constructor to automatically set up the user

User (String username, String email, int followers) {

this.username = username;

this.email = email;

this.followers = followers;

}

void postPhoto (String photoDescription) {
System.out.println(username + " posted a photo: " + photo Description);

}
}

User Ria = new User("Ria", "ria88@gmail.com", 300); // Ria's account is set up

automatically
