package myServices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

public class RestFortuneServices {
    @Component
    public class RestFortuneServices implements FortuneServices {

        @Override
        public String getFortune() {
            return null;
        }
        @Autowired
        @Qualifier("randomFortuneService")
        private FortuneService fortuneService;

    }
}
