package com.example.demo;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Logic {
    public int sum(int a, int b) {
        return a + b;
    }

    public double product(double a, double b) {
        getPrinter();
        return a * b;
    }

    private boolean getPrinter() {
        return false;
    }

    public static void getCaller() {
        List<StackWalker.StackFrame> stack = StackWalker.getInstance().walk((s) -> s.collect(Collectors.toList()));
        for (var call : stack) {
            if(call.getFileName().equals("DemoApplicationTests.java")){
                System.out.println(call);
            }
        }

    }
}
