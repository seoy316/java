package com.oop.interface_2.interface_1;

public class InterfaceMain {
    public static void main(String []args) {
        InterfaceImpl impl = new InterfaceImpl();

        InterfaceA interfaceA = impl;
        InterfaceB interfaceB = impl;
        InterfaceC interfaceC = impl;

        interfaceA.methodA();
        interfaceB.methodB();
        interfaceC.methodC();


    }
}
