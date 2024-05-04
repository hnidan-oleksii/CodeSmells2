package Part2.Task3;

public class Currency {
    private String code;
    // Конструктор та інші методи класу...
    public Currency(String code) {
        this.code = code;
    }

    public static Currency getInstance(String code) {
        return CurrencyFactory.getCurrency(code);
    }

    public String getCode() {
        return code;
    }
    // Інші методи класу...
}

