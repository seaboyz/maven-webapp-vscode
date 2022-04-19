
import java.io.IOException;
import java.sql.Connection;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.UnavailableException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/users")
public class UserServlet extends HttpServlet {

  private Connection connection;

  public void init(ServletConfig config) throws ServletException {
    super.init(config);
    String dbDriver = "org.postgresql.Driver";
    try {
      Class.forName(dbDriver).newInstance();
    } catch (ClassNotFoundException e) {
      throw new UnavailableException(
          "UserServlet.init(  ) ClassNotFoundException: " +
              e.getMessage());
    } catch (IllegalAccessException e) {
      throw new UnavailableException(
          "UserServlet.init(  ) IllegalAccessException: " +
              e.getMessage());
    } catch (InstantiationException e) {
      throw new UnavailableException(
          "UserServlet.init(  ) InstantiationException: " +
              e.getMessage());
    }
  }

  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {

    response.getWriter().print(request.getParameter("id"));

    // try {
    // connection = Database.getConnection();
    // PreparedStatement preparedStatement = connection
    // .prepareStatement("SELECT * FROM ERS_USERS WHERE ERS_USER_ID = ?");
    // preparedStatement.setInt(1, Integer.valueOf(request.getParameter("id")));
    // ResultSet resultSet = preparedStatement.executeQuery();

    // User user = new User();
    // ;

    // if (resultSet.next()) {
    // user.setId(resultSet.getInt("ers_user_id"));
    // user.setUsername(resultSet.getString("ers_user_name"));
    // user.setPassword(resultSet.getString("ers_password"));
    // user.setEmail(resultSet.getString("ers_email"));
    // user.setFirstname(
    // resultSet.getString("ers_first_name"));
    // user.setLastname(resultSet.getString("ers_last_name"));
    // int roleId = resultSet.getInt("user_role_id");
    // if (roleId == 1) {
    // user.setRole(Role.EMPLOYEE);
    // } else {
    // user.setRole(Role.FINANCE_MANAGER);
    // }
    // }
    // // convert resultSet to JSON
    // String userJsonString = new Gson().toJson(user);

    // // send json as response
    // PrintWriter out = response.getWriter();
    // response.setContentType("application/json");
    // response.setCharacterEncoding("UTF-8");
    // out.print(userJsonString);
    // out.flush();

    // connection.close();
    // } catch (SQLException e) {
    // System.out.println("UserServlet.doGet() SQLException: " + e.getMessage());
    // }

  }
}