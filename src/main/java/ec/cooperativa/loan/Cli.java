package ec.cooperativa.loan;

import java.util.*;

public class Cli {
    public static void main(String[] args) {
        double income = 0;
        double debt = 0;
        double savings = 0;
        int tenure = 0;
        int age = 0;
        int late = 0;
        int deps = 0;

        String name = "Member";
        for (int i = 0; i < args.length; i++) {
           if (args[i].equals("--income")) {
                income = Double.parseDouble(args[++i]);
            } else if (args[i].equals("--debt")) {
                debt = Double.parseDouble(args[++i]);
            } else if (args[i].equals("--tenure-months")) {
                tenure = Integer.parseInt(args[++i]);
            } else if (args[i].equals("--age")) {
                age = Integer.parseInt(args[++i]);
            } else if (args[i].equals("--savings-balance")) {
                savings = Double.parseDouble(args[++i]);
            } else if (args[i].equals("--late-payments")) {
                late = Integer.parseInt(args[++i]);
            } else if (args[i].equals("--dependents")) {
                deps = Integer.parseInt(args[++i]);
            } else if (args[i].equals("--name")) {
                name = args[++i];
            }

        Map r = Eligibility.evaluate(income, debt, tenure, age, savings, late, deps, true, false, false);
        System.out.println(Eligibility.formatReport(r, name));
    }
}
