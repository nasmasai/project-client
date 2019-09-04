package groupwork.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.util.List;

public class RestTesting implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        RestTemplate restTemplate = new RestTemplate();

        ResponseEntity<List<Category>> response = restTemplate.exchange(
                "http://10.51.10.111:8080/categories", HttpMethod.GET, null,
                new ParameterizedTypeReference<List<Category>>() {});
        List<Category>categories = response.getBody();

        for (Category category: categories){
            System.out.println(category.toString());
        }
        System.err.println("Find One (GET)---------------");

        Category category = restTemplate.getForObject(
                "http://10.51.10.111:8080/categories/2",
                Category.class);
        System.out.println(category.toString());

        System.out.println("Creating(POST)_______________________");

        Category newCategory = new Category("Action", "Romance"
        ,120);

        Category createdCategory = restTemplate.postForObject(
                "http://10.51.10.111:8080/categories",
                newCategory, Category.class);
        System.out.println(createdCategory.toString());

        System.out.println("___________");

        String createSuggestedUrl = "http://10.51.10.111.8080/categories/"
                +createdCategory.getId() +"/suggested";

        Suggested newSuggested = new Suggested("The 100");
        Suggested createdSuggested = restTemplate.postForObject(
                createSuggestedUrl, newSuggested, Suggested.class);
        System.out.println(createdSuggested.toString());

    }
}
