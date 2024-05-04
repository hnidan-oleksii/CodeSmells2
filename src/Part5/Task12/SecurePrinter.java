package Part5.Task12;

class SecurePrinter extends Printer {
    @Override
    void print(String document) {
        System.out.println("Printing securely: " + document);
        super.print(document);
    }
}

