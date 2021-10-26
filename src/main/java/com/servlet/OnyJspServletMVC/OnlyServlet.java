package com.servlet.OnyJspServletMVC;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "OnlyServlet", value = "/onlyservlet")
public class OnlyServlet extends HttpServlet {
    private String message;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        response.setContentType("text/html");
        //Print Code
        PrintWriter out = response.getWriter();
        printHead(out);
        //Style
        printStyle(out);
        //Body
        out.println("<body>\n" +
                "\t\t<div class=\"container\">\n" +
                "            <div class=\"d-flex justify-content-center h-100\">\n" +
                "                <div class=\"card\">\n" +
                "                    <div class=\"card-header\">\n" +
                "                        <h3 class=\"text-center\">Welcome Back</h3>                \n" +
                "                        <div class=\"d-flex justify-content-end social_icon\">\n" +
                "\t\t\t\t\t\t\t<a href=\"https://hcmute-group-9-assignment-link.herokuapp.com/\" style=\"height: 70%; margin-top: 130%;\" class=\"btn btn-warning\"> <i class=\"fa fa-home\"></i> </a>\n" +
                "                        </div>" +
                "                    </div>\n" +
                "                    <div class=\"card-body\">\n" +
                "                        <form action=\"/servletonly\" method=\"post\">\n" +
                "                            <div class=\"input-group form-group\">\n" +
                "                                <div class=\"input-group-prepend\">\n" +
                "                                    <span class=\"input-group-text\"><i class=\"fas fa-user\"></i></span>\n" +
                "                                </div>\n" +
                "                                <input type=\"text\" class=\"form-control\" placeholder=\"username\" name=\"username\" value=\"" + username + "\">                        \n" +
                "                            </div>                            \n" +
                "                        </form>\n" +
                "                    </div>\n" +
                "                    <div class=\"card-footer\">\n" +
                "                \n" +
                "                    </div>\n" +
                "                </div>\n" +
                "            </div>\n" +
                "        </div>\n" +
                "\t</body>");
        //Footer
        printFooter(out);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        //Print Code
        PrintWriter out = response.getWriter();
        printHead(out);
        //Style
        printStyle(out);
        //Body
        out.println("<body>\n" +
                "\t\t<div class=\"container\">\n" +
                "            <div class=\"d-flex justify-content-center h-100\">\n" +
                "                <div class=\"card\">\n" +
                "                    <div class=\"card-header\">\n" +
                "                        <h3>Sign In</h3>\n" +
                "                        <div class=\"d-flex justify-content-end social_icon\">\n" +
                "                            <a href=\"https://hcmute-group-9-assignment-link.herokuapp.com/\" style=\"height: 70%; margin-top: 130%;\" class=\"btn btn-warning\"> <i class=\"fa fa-home\"></i> </a>\n" +
                "                        </div>\n" +
                "                    </div>\n" +
                "                    <div class=\"card-body\">\n" +
                "                        <form action=\"/onlyservlet\" method=\"post\">\n" +
                "                            <div class=\"input-group form-group\">\n" +
                "                                <div class=\"input-group-prepend\">\n" +
                "                                    <span class=\"input-group-text\"><i class=\"fas fa-user\"></i></span>\n" +
                "                                </div>\n" +
                "                                <input type=\"text\" class=\"form-control\" placeholder=\"username\" name=\"username\">\n" +
                "                                \n" +
                "                            </div>\n" +
                "                            <div class=\"input-group form-group\">\n" +
                "                                <div class=\"input-group-prepend\">\n" +
                "                                    <span class=\"input-group-text\"><i class=\"fas fa-key\"></i></span>\n" +
                "                                </div>\n" +
                "                                <input type=\"password\" class=\"form-control\" placeholder=\"password\">\n" +
                "                            </div>\n" +
                "                            <div class=\"row align-items-center remember\">\n" +
                "                                <input type=\"checkbox\">Remember Me\n" +
                "                            </div>\n" +
                "                            <div class=\"form-group\">\n" +
                "                                <input type=\"submit\" value=\"Login\" class=\"btn float-right login_btn\">\n" +
                "                            </div>\n" +
                "                        </form>\n" +
                "                    </div>\n" +
                "                    <div class=\"card-footer\">\n" +
                "                        <div class=\"d-flex justify-content-center links\">\n" +
                "                            Don't have an account?<a href=\"#\">Sign Up</a>\n" +
                "                        </div>\n" +
                "                        <div class=\"d-flex justify-content-center\">\n" +
                "                            <a href=\"#\">Forgot your password?</a>\n" +
                "                        </div>\n" +
                "                    </div>\n" +
                "                </div>\n" +
                "            </div>\n" +
                "        </div>\n" +
                "\t</body>\n");
        //Footer
        printFooter(out);
    }

    public void printHead(PrintWriter out) {
        out.println("<!DOCTYPE html>");
        out.println("<html lang=\"en\">");
        //Head
        out.println("<head>\n" +
                "\t\t<meta charset=\"UTF-8\" />\n" +
                "\t\t<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\" />\n" +
                "\t\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\n" +
                "\t\t<!--Bootsrap 4 CDN-->\n" +
                "\t\t<link\n" +
                "\t\t\trel=\"stylesheet\"\n" +
                "\t\t\thref=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css\"\n" +
                "\t\t\tintegrity=\"sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO\"\n" +
                "\t\t\tcrossorigin=\"anonymous\"\n" +
                "\t\t/>\n" +
                "\t\t<!--Fontawesome CDN-->\n" +
                "\t\t<link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.3.1/css/all.css\" integrity=\"sha384-mzrmE5qonljUremFsqc01SB46JvROS7bZs3IO2EmfFsd15uHvIt+Y8vEf7N7fWAU\" crossorigin=\"anonymous\" />\n" +
                "\n" +
                "\t\t<script src=\"//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js\"></script>\n" +
                "\t\t<script src=\"//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\n" +
                "\t\t<title>Only Servlet</title>\n" +
                "\t</head>");
    }

    public void printStyle(PrintWriter out) {
        out.println("<style>\n" +
                "\t\t@import url(\"https://fonts.googleapis.com/css?family=Numans\");\n" +
                "\t\thtml, body {\n" +
                "\t\t\tbackground-image: url(\"http://getwallpapers.com/wallpaper/full/a/5/d/544750.jpg\");\n" +
                "\t\t\tbackground-size: cover;\n" +
                "\t\t\tbackground-repeat: no-repeat;\n" +
                "\t\t\theight: 100%;\n" +
                "\t\t\tfont-family: \"Numans\", sans-serif;\n" +
                "\t\t}\n" +
                "\n" +
                "\t\t.container {\n" +
                "\t\t\theight: 100%;\n" +
                "\t\t\talign-content: center;\n" +
                "\t\t}\n" +
                "\n" +
                "\t\t.card {\n" +
                "\t\t\theight: 370px;\n" +
                "\t\t\tmargin-top: auto;\n" +
                "\t\t\tmargin-bottom: auto;\n" +
                "\t\t\twidth: 400px;\n" +
                "\t\t\tbackground-color: rgba(0, 0, 0, 0.5) !important;\n" +
                "\t\t}\n" +
                "\n" +
                "\t\t.social_icon span {\n" +
                "\t\t\tfont-size: 60px;\n" +
                "\t\t\tmargin-left: 10px;\n" +
                "\t\t\tcolor: #ffc312;\n" +
                "\t\t}\n" +
                "\n" +
                "\t\t.social_icon span:hover {\n" +
                "\t\t\tcolor: white;\n" +
                "\t\t\tcursor: pointer;\n" +
                "\t\t}\n" +
                "\n" +
                "\t\t.card-header h3 {\n" +
                "\t\t\tcolor: white;\n" +
                "\t\t}\n" +
                "\n" +
                "\t\t.social_icon {\n" +
                "\t\t\tposition: absolute;\n" +
                "\t\t\tright: 20px;\n" +
                "\t\t\ttop: -45px;\n" +
                "\t\t}\n" +
                "\n" +
                "\t\t.input-group-prepend span {\n" +
                "\t\t\twidth: 50px;\n" +
                "\t\t\tbackground-color: #ffc312;\n" +
                "\t\t\tcolor: black;\n" +
                "\t\t\tborder: 0 !important;\n" +
                "\t\t}\n" +
                "\n" +
                "\t\tinput:focus {\n" +
                "\t\t\toutline: 0 0 0 0 !important;\n" +
                "\t\t\tbox-shadow: 0 0 0 0 !important;\n" +
                "\t\t}\n" +
                "\n" +
                "\t\t.remember {\n" +
                "\t\t\tcolor: white;\n" +
                "\t\t}\n" +
                "\n" +
                "\t\t.remember input {\n" +
                "\t\t\twidth: 20px;\n" +
                "\t\t\theight: 20px;\n" +
                "\t\t\tmargin-left: 15px;\n" +
                "\t\t\tmargin-right: 5px;\n" +
                "\t\t}\n" +
                "\n" +
                "\t\t.login_btn {\n" +
                "\t\t\tcolor: black;\n" +
                "\t\t\tbackground-color: #ffc312;\n" +
                "\t\t\twidth: 100px;\n" +
                "\t\t}\n" +
                "\n" +
                "\t\t.login_btn:hover {\n" +
                "\t\t\tcolor: black;\n" +
                "\t\t\tbackground-color: white;\n" +
                "\t\t}\n" +
                "\n" +
                "\t\t.links {\n" +
                "\t\t\tcolor: white;\n" +
                "\t\t}\n" +
                "\n" +
                "\t\t.links a {\n" +
                "\t\t\tmargin-left: 4px;\n" +
                "\t\t}\n" +
                "\t</style>");
    }

    public void printFooter(PrintWriter out) {
        out.println("\n" +
                "\t<footer>\n" +
                "\t\t<script src=\"./main.js\"></script>\n" +
                "\t</footer>");
        out.println("</html>");
    }
}
