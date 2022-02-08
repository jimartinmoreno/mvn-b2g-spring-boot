package guru.springframework.springboot;

import guru.springframework.springboot.controllers.ExampleController;
import org.junit.jupiter.api.Test;
import org.mockito.internal.matchers.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class Mb2gSpringBootApplicationIT {

    @Autowired
    ExampleController exampleController;

    @Test
    public void contextLoads() {
        System.out.println("############### IT = " + exampleController);
        assertThat(exampleController).isNotNull();
    }
}

