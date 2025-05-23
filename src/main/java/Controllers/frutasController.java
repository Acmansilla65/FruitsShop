package Controllers;

import Data.envioData;
import Data.frutasData;
import Models.envioModel;
import Models.frutasModel;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "frutasController", value = "/frutasController")
public class frutasController extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/plain");
        response.setContentType("text/html;charset=UTF-8");
        int idFruta = Integer.parseInt(request.getParameter("id"));
        int cant = Integer.parseInt(request.getParameter("cant"));
        int idEnv = Integer.parseInt(request.getParameter("env"));

        frutasModel f = frutasData.getFrutaById(idFruta);
        envioModel e = envioData.getEnviosById(idEnv);

        if (f != null) {
            double precioTotal = f.getPrecioUnidad() * cant * e.getPrecioEnvio();
            precioTotal = Math.round(precioTotal * 100) / 100.0;
            String respuesta = "Has comprado " + cant + " " + f.getNombre() + " con envio " + e.getNombre() + " por un precio de " + precioTotal + "€";
            response.getWriter().write(respuesta);
        } else {
            response.getWriter().write("Producto no encontrado.");
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Método vacío, implementar si es necesario
    }

    @Override
    public String getServletInfo() {
        return "Servlet para manejar empleados";
    }
}
