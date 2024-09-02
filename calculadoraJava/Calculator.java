import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Calculator {
    public static void main(String[] args) throws Exception {
        // Crear un lector de buffer para leer líneas desde la entrada estándar
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        String line;
        // Leer y procesar cada línea de la entrada
        while ((line = reader.readLine()) != null) {
            // Si la línea está vacía, salimos del bucle
            if (line.trim().isEmpty()) {
                break;
            }
            
            // Crear un input stream desde la línea leída
            CharStream input = CharStreams.fromString(line);
            
            // Crear un lexer que convierta la entrada en tokens
            calculadoraLexer lexer = new calculadoraLexer(input);
            
            // Crear un buffer de tokens que el parser pueda leer
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            
            // Crear el parser que analizará los tokens
            calculadoraParser parser = new calculadoraParser(tokens);
            
            // Parsear la línea como un 'prog' (programa completo)
            ParseTree tree = parser.prog();
            
            // Crear un visitor que evalúe las expresiones
            MyVisitor visitor = new MyVisitor();
            
            // Visitar el árbol y evaluar la expresión
            visitor.visit(tree);
        }
    }
}
