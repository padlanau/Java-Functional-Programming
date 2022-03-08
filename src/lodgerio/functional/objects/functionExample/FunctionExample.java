package lodgerio.functional.objects.functionExample;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FunctionExample {
    public static void main(String[] args) {
        List<Example> productsList = new ArrayList<Example>();
//Here we are listing the products
        productsList.add(new Example(1,"Shirt",1500f));
        productsList.add(new Example(2,"Long Sleeve Top",1000f));
        productsList.add(new Example(3,"Crop Top",1600f));
        productsList.add(new Example(4,"Jeans",2100f));
        productsList.add(new Example(5,"Skirt",1800f));

        // map is to convert the list to Float
        List<Float> pricesList = productsList.stream()
                .filter(p ->p.pro_cost> 1500)
                .map(pm -> pm.pro_cost)
                .collect(Collectors.toList());
        System.out.println(pricesList);
    }

}
