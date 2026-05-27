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
            if ("--income".equals(args[i])) {
                income = Double.parseDouble(args[++i]);
            } else if ("--debt".equals(args[i])) {
                debt = Double.parseDouble(args[++i]);
            } else if ("--tenure-months".equals(args[i])) {
                tenure = Integer.parseInt(args[++i]);
            } else if ("--age".equals(args[i])) {
                age = Integer.parseInt(args[++i]);
            } else if ("--savings-balance".equals(args[i])) {
                savings = Double.parseDouble(args[++i]);
            } else if ("--late-payments".equals(args[i])) {
                late = Integer.parseInt(args[++i]);
            } else if ("--dependents".equals(args[i])) {
                deps = Integer.parseInt(args[++i]);
            } else if ("--name".equals(args[i])) {
                name = args[++i];
            }


        Map r = Eligibility.evaluate(income, debt, tenure, age, savings, late, deps, true, false, false);
        System.out.println(Eligibility.formatReport(r, name));
    }
}
