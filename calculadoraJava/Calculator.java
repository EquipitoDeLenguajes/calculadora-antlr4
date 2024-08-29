import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class Calculator {

    public static void main(String[] args) throws Exception {
        CharStream input = CharStreams.fromString("2*-3\n");
        calculadoraLexer lexer = new calculadoraLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        calculadoraParser parser = new calculadoraParser(tokens);
        ParseTree tree = parser.prog();  
        MyVisitor visitor = new MyVisitor();
        visitor.visit(tree);  // evaluate and print result
    }
}
