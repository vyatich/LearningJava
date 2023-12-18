package com.site.part2.lesson18_12;

import java.util.Scanner;

public class FinallyException {

    public static void main(String[] args) {
        Scanner scanner = null;
        try {

        } finally {
            scanner.close();
        }
    }
}
