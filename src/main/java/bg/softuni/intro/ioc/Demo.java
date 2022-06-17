package bg.softuni.intro.ioc;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Demo implements CommandLineRunner {

    private final ZooService zooService;

    public Demo(ZooService zooService) {
        this.zooService = zooService;
    }

    @Override
    public void run(String... args) throws Exception {
        zooService.doWork();
    }

}
