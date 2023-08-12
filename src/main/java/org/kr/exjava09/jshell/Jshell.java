package main.java.org.kr.exjava09.jshell;

import jdk.jshell.JShell;
import jdk.jshell.SnippetEvent;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.List;

public class Jshell {
    private static final DecimalFormat DF = new DecimalFormat();

    public static void main(String[] args) {
        final BigDecimal preco = new BigDecimal(2000.0);
        final BigDecimal icms = new BigDecimal(0.18);
        final String formula = "preco * icms";
        final String eval = formula.replaceAll("preco", String.valueOf(preco)).replaceAll("icms", String.valueOf(icms));
        final JShell jshell = JShell.create();
        final List<SnippetEvent> resultado = jshell.eval(eval);
        System.out.println("\n\n");
        System.out.println("preco: R$ " + bdFormat(preco));
        System.out.println("icms: " + bdFormat(icms));
        System.out.println("o valor do icms é: R$ " + resultado.get(0).value());
    }

    private static String bdFormat(final BigDecimal bd) {
        DF.setMaximumFractionDigits(2);
        DF.setMinimumFractionDigits(0);
        DF.setGroupingUsed(false);
        return DF.format(bd);
    }
}
