package io.heapy.bootique4;

import io.bootique.Bootique;

public class Main {
    public static void main(String[] args) {
        Bootique.app(args).autoLoadModules().exec().exit();
    }
}
