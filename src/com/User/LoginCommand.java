package com.User;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

public class LoginCommand implements UserCommand {
    @Override
    public int execute(HttpServletRequest request, HttpServletResponse response) throws IOException {

        userDAO dao = userDAO.getInstance();
        String userId = request.getParameter("userId");
        String password = request.getParameter("password");
        List<String> data = dao.getData(userId, password);
        request.setAttribute("info", data);
        return 1;
    }
}
