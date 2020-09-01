package core.basesyntax;

import core.basesyntax.controller.ConsoleHandler;
import core.basesyntax.dao.BetDao;
import core.basesyntax.dao.CarDao;
import core.basesyntax.factory.Factory;
import core.basesyntax.lib.Injector;
import java.lang.reflect.InvocationTargetException;

public class Main {
    public static void main(String[] args) throws InvocationTargetException,
            NoSuchMethodException, InstantiationException, IllegalAccessException {
        ConsoleHandler consoleHandler = (ConsoleHandler) Injector.getInstance(ConsoleHandler.class);
        consoleHandler.handle();

        BetDao betDao = Factory.getBetDao();
        CarDao carDao = Factory.getCarDao();
        System.out.println("Bets: " + betDao.getAll());
        System.out.println("Cars: " + carDao.getAll());
    }
}
