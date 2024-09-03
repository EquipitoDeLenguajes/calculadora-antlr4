import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;

public class Calculator {
    public static void main(String[] args) throws Exception {
        // Crear un lector de buffer para leer líneas desde la entrada estándar
        BufferedReader reader;
        
        if (args.length == 0) {
            reader = new BufferedReader(new InputStreamReader(System.in));
        } else {
            reader = new BufferedReader(new FileReader(args[0]));
        }
        
        // Instanciar el visitor solo una vez para mantener la memoria entre líneas
        MyVisitor visitor = new MyVisitor();

        String line;
        // Leer y procesar cada línea de la entrada
        while ((line = reader.readLine()) != null) {
            // Si la línea está vacía, continuar con la siguiente iteración
            if (line.trim().isEmpty()) {
                continue;
            }

            // Crear un input stream desde la línea leída
            CharStream input = CharStreams.fromString(line);
            
            // Crear un lexer que convierta la entrada en tokens
            calculadoraLexer lexer = new calculadoraLexer(input);
            
            // Crear un buffer de tokens que el parser pueda leer
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            
            // Crear el parser que analizará los tokens
            calculadoraParser parser = new calculadoraParser(tokens);
            
            // Parsear la línea como un 'stat' (una sola línea de la gramática)
            ParseTree tree = parser.stat();
            
            // Visitar el árbol y evaluar la expresión
            visitor.visit(tree);
        }
    }
}
