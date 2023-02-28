package Map;

import java.security.KeyStore.Entry;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ExemploMap {
    public static void main(String[] args) {
        // formas de inicializar um Map
        // Map carrosPopulares2020 = new HashMap<>(); // antes do java 5
        // Map<String, Double> carrosPopulares = new HashMap<>(); // Generics(jdk5) - Diamont Operator(jdk7)
        // HashMap<String, Double> carrosPopulares2020 = new HashMap<>();
        // Map<String, Double> carrosPopulares2020 = Map.of("Gol", 14.4, "Uno", 15.6, "Mobi", 16,1);

        System.out.println("Crie um dicionério que relacione os modelos e seus respectivos consumos: ");
        Map<String, Double> carrosPopulares = new HashMap<>() {{ // hashmap armazena com valores aleatorios
            put("gol", 14.4);
            put("uno", 15.6);
            put("mobi", 16.1);
            put("hb20", 14.5);
            put("kwid", 15.6);
        }};
        System.out.println(carrosPopulares);

        System.out.println("Substitua o consumo do gol 15,2km/l: ");
        carrosPopulares.put("gol", 19.0);
        System.out.println(carrosPopulares);
        // não tem como adicionar, tem como alterar

        System.out.println("COnfira se o modelo tucson está no dicionario: " + carrosPopulares.containsKey("tucson"));

        System.out.println("Exiba o consumo do mobi: " + carrosPopulares.get("mobi"));

        System.out.println("Exiba o terceiro valor adicionado");
        // o map não um método que mostre valores relacionado a posicao, visto que armazena aleatoriamente

        System.out.println("Exiba os modelos dos carros"); // metodo keySet()
        Set<String> modelos = carrosPopulares.keySet();
        System.out.println(modelos);

        System.out.println("Exiba os consumos dos carros"); // metodo values()
        Collection<Double> consumos = carrosPopulares.values();
        System.out.println(consumos);

        System.out.println("Exiba o modelo mais economico e seu consumo");
        Double consumoMaisEficiente =  Collections.max(carrosPopulares.values());
        Set<Map.Entry<String, Double>> entries = carrosPopulares.entrySet();
        String modeloMaisEficiente;

        for (M)








    }
}
