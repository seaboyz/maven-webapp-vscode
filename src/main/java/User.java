import java.util.Objects;

/**
 * This User class defines a minimum functionality for
 * interacting with users in the ERS application.
 *
 * All users in this application must at least have:
 * <ul>
 * <li>ID</li>
 * <li>Username</li>
 * <li>Password</li>
 * <li>Role</li>
 * </ul>
 *
 * Additional fields ca
 * 
 * @author Center of Excellence
 */

public class User {

  private int id;
  private String username;
  private String password;
  private String email;
  private String firstname;
  private String lastname;
  private Role role;

  public User() {
  }

  public User(
      String email,
      String password,
      String firstname,
      String lastname) {
    this.username = email.split("@")[0];
    this.email = email;
    this.firstname = firstname;
    this.lastname = lastname;
    this.password = password;
  }

  public User(
      int id,
      String username,
      String password,
      String email,
      String firstname,
      String lastname,
      Role role) {
    this.id = id;
    this.username = username;
    this.password = password;
    this.email = email;
    this.firstname = firstname;
    this.lastname = lastname;
    this.role = role;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getFirstname() {
    return this.firstname;
  }

  public void setFirstname(String firstname) {
    this.firstname = firstname;
  }

  public String getLastname() {
    return this.lastname;
  }

  public void setLastname(String lastname) {
    this.lastname = lastname;
  }

  public Role getRole() {
    return role;
  }

  public void setRole(Role role) {
    this.role = role;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o)
      return true;
    if (o == null || getClass() != o.getClass())
      return false;
    User that = (User) o;
    return id == that.id && Objects.equals(username, that.username) && Objects.equals(password, that.password)
        && role == that.role;
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, username, password, role);
  }

  @Override
  public String toString() {
    return "{" +
        " id='" + getId() + "'" +
        ", username='" + getUsername() + "'" +
        ", password='" + getPassword() + "'" +
        ", email='" + getEmail() + "'" +
        ", firstname='" + getFirstname() + "'" +
        ", lastname='" + getLastname() + "'" +
        ", role='" + getRole() + "'" +
        "}";
  }

}
