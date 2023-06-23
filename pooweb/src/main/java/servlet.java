import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Figur.Cilindro;
import Figur.Rombo;
import Figur.Trapecio;
import Figur.Triangulo;

public class servlet extends javax.servlet.http.HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Ha ingresado correctamente.");

        String accion = req.getParameter("accion");
        System.out.println(accion);
        switch (accion) {
            case "cilindroArea":
                req.getRequestDispatcher("cilindroArea.jsp").forward(req, resp);
                break;
            case "romboArea":
                req.getRequestDispatcher("romboArea.jsp").forward(req, resp);
                break;
            case "trapecioArea":
                req.getRequestDispatcher("trapecioArea.jsp").forward(req, resp);
                break;
            case "trianguloArea":
                req.getRequestDispatcher("trianguloArea.jsp").forward(req, resp);
                break;


             case "cilindroPerimetro":
                req.getRequestDispatcher("cilindroPerimetro.jsp").forward(req, resp);
                break;
            case "romboPerimetro":
                req.getRequestDispatcher("romboPerimetro.jsp").forward(req, resp);
                break;
            case "trapecioPerimetro":
                req.getRequestDispatcher("trapecioPerimetro.jsp").forward(req, resp);
                break;
            case "trianguloPerimetro":
                req.getRequestDispatcher("trianguloPerimetro.jsp").forward(req, resp);
                break;    
             
                

            case "aroPerCil":
                req.getRequestDispatcher("aroPerCil.jsp").forward(req, resp);
                break;   
            case "aroPerRom":
                req.getRequestDispatcher("aroPerRom.jsp").forward(req, resp);
                break;    
            case "aroPerTra":
                req.getRequestDispatcher("aroPerTra.jsp").forward(req, resp);
                break;   
            case "aroPerTri":
                req.getRequestDispatcher("aroPerTri.jsp").forward(req, resp);
                break;         
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Ha ingresado correctamente al DO POST.");

        String accion = req.getParameter("accion");
        System.out.println("La accion es " + accion);

        switch (accion) {
            case "areacilin":
                double radio = Double.parseDouble(req.getParameter("Radio"));
                double altura = Double.parseDouble(req.getParameter("Altura"));
                Cilindro calcularAreaCilindro = new Cilindro();
                double areaCilindro = calcularAreaCilindro.calcularArea(radio, altura);

                req.setAttribute("accion", String.valueOf(areaCilindro));
                System.out.println("El area es: " + areaCilindro);

                req.getRequestDispatcher("area.jsp").forward(req, resp);
                break;
            case "arearom":
                double diagonalMayor = Double.parseDouble(req.getParameter("diagonalMayor"));
                double diagonalMenor = Double.parseDouble(req.getParameter("diagonalMenor"));
                Rombo calcularAreaRombo = new Rombo();
                double areaRombo = calcularAreaRombo.calcularArea(diagonalMayor, diagonalMenor);

                req.setAttribute("accion", String.valueOf(areaRombo));
                System.out.println("El area es: " + areaRombo);

                req.getRequestDispatcher("area.jsp").forward(req, resp);
                break;
            case "areatra":
                System.out.println("Ingreso al areatra");
                double baseMayor = Double.parseDouble(req.getParameter("baseMayor"));
                double baseMenor = Double.parseDouble(req.getParameter("baseMenor"));
                double altura3 = Double.parseDouble(req.getParameter("altura3"));
                Trapecio calcularAreaTrapecio = new Trapecio();
                double areaTrapecio = calcularAreaTrapecio.calcularArea(baseMayor, baseMenor, altura3);

                req.setAttribute("accion", String.valueOf(areaTrapecio));
                System.out.println("El area es: " + areaTrapecio);

                req.getRequestDispatcher("area.jsp").forward(req, resp);
                break;
            case "areatri":
                double base = Double.parseDouble(req.getParameter("base"));
                double altura2 = Double.parseDouble(req.getParameter("altura2"));
                Triangulo calcularAreaTriangulo = new Triangulo();
                double areaTriangulo = calcularAreaTriangulo.calcularArea(base, altura2);

                req.setAttribute("accion", String.valueOf(areaTriangulo));
                System.out.println("El area es: " + areaTriangulo);

                req.getRequestDispatcher("area.jsp").forward(req, resp);
                break;



                // AGREGAR DATOS A LAS FIGURAS PARA EL PERIMETRO
            case "perimetrocilin":
                double radio2 = Double.parseDouble(req.getParameter("Radio"));
                Cilindro calcularPerCilindro = new Cilindro();
                double perimetroCilindro = calcularPerCilindro.calcularPerimetro(radio2);
                req.setAttribute("accion", String.valueOf(perimetroCilindro));
                System.out.println("El Perimetro es: " + perimetroCilindro);
                req.getRequestDispatcher("perimetro.jsp").forward(req, resp);
                break;
            case "perimetrorom":
                double Lado1 = Double.parseDouble(req.getParameter("Lado1"));
                double Lado2 = Double.parseDouble(req.getParameter("Lado2"));
                double Lado3 = Double.parseDouble(req.getParameter("Lado3"));
                double Lado4 = Double.parseDouble(req.getParameter("Lado4"));
                Rombo calcularPerRombo = new Rombo();
                double perimetroRombo = calcularPerRombo.calcularPerimetro(Lado1,Lado2,Lado3,Lado4);
                req.setAttribute("accion", String.valueOf(perimetroRombo));
                System.out.println("El perimetro es: " + perimetroRombo);
                req.getRequestDispatcher("perimetro.jsp").forward(req, resp);
                break;
            case "perimetrotra":
                double Lado11 = Double.parseDouble(req.getParameter("Lado1"));
                double Lado22 = Double.parseDouble(req.getParameter("Lado2"));
                double Lado33 = Double.parseDouble(req.getParameter("Lado3"));
                double Lado44 = Double.parseDouble(req.getParameter("Lado4"));
                Trapecio calcularPerTrapecio = new Trapecio();
                double perimetroTrapecio = calcularPerTrapecio.calcularPerimetro(Lado11,Lado22,Lado33,Lado44);
                req.setAttribute("accion", String.valueOf(perimetroTrapecio));
                System.out.println("El perimetro es: " + perimetroTrapecio);

                req.getRequestDispatcher("perimetro.jsp").forward(req, resp);
                break;
            case "perimetroTri":
                System.out.println("ha ingresado correctamente al triangulozzzz");
                double Lado111 = Double.parseDouble(req.getParameter("Lado1"));
                double Lado222 = Double.parseDouble(req.getParameter("Lado2"));
                double Lado333 = Double.parseDouble(req.getParameter("Lado3"));
                Triangulo calcularPerTriangulo = new Triangulo();
                double perimetroTriangulo = calcularPerTriangulo.calcularPerimetro(Lado111,Lado222,Lado333);
                req.setAttribute("accion", String.valueOf(perimetroTriangulo));
                System.out.println("El perimetro es: " + perimetroTriangulo);
                req.getRequestDispatcher("perimetro.jsp").forward(req, resp);
                break;
        }
    }
}