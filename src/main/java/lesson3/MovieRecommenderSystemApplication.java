package lesson3;

import org.springframework.context.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.swing.*;
import java.util.Arrays;

@SpringBootApplication
public class MovieRecommenderSystemApplication {

    public static void main(String[] args) {
       ApplicationContext appContext = SpringApplication.run(MovieRecommenderSystemApplication.class, args);
       RecommenderImplementation recommender = appContext.getBean(RecommenderImplementation.class);
       String [] result = recommender.recommendedMovies("Finding Dory");
        System.out.println(Arrays.toString(result));

    }

}