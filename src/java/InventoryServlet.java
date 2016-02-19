
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aaronauge
 */

public class InventoryServlet extends HttpServlet {
    
    /**
     *
     * @param req
     * @param resp
     * @throws ServletException
     * @throws IOException
     */
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp)
throws ServletException, IOException  {
        InventoryManager invMan = new InventoryManager();
        try {
            for (Product p : invMan.getProductList()){
                resp.getwriter().println(p);
                        }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(InventoryServlet.class.getName()).log(Level.SEVERE, null, ex);
        }

     
}

    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse resp)
throws ServletException, IOException {

}
    
}
