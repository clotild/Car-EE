package servlet;

import com.example.voitures.model.Car;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import service.CarService;

import java.io.IOException;
import java.util.List;

@WebServlet(urlPatterns = {"/", CarListServlet.URL})
public class CarListServlet extends HttpServlet {

    public static final String URL = "/cars";
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        CarService carService = new CarService();
        List<Car> carList = carService.fetchAllPosts();

        req.setAttribute("cars", carList);
        req
                .getRequestDispatcher("/WEB-INF/car-list.jsp")
                .forward(req, resp);
    }
}