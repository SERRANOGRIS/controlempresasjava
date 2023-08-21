
package controlempresas.appweb.utils;


import java.io.IOException;
import jakarta.servlet.ServletException;

public interface IAutorize {
    void authorize() throws ServletException, IOException;
}
