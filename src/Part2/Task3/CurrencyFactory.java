package Part2.Task3;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class CurrencyFactory {
    private static final Map<String, Currency> currencies = new ConcurrentHashMap<>();

    public static Currency getCurrency(String code) {
        return currencies.computeIfAbsent(code, Currency::new);
    }
}

