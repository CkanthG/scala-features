package objectoriented

trait Logger {
  def log(message: String): Unit = println(s"Log: $message")
}

trait Authenticator {
  def authenticate(username: String, password: String): Boolean =
    username == "admin" && password == "1234"
}

class AuthenticationService extends Authenticator with Logger {
  def login(username: String, password: String): Unit = {
    if (authenticate(username, password)) {
      log(s"User $username logged in successfully")
    } else {
      log(s"Failed login attempt for user $username")
    }
  }
}

