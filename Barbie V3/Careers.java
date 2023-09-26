import java.util.ArrayList;
import java.util.List;

class Career {
  public List<Values> listCareers;

    public Career() {
        listCareers = new ArrayList<>();
        // Ordem específica: (name, popularity, remuneration, relevance)
        listCareers.add(new Values("Médico", 9, 9, 7));
        listCareers.add(new Values("Policial", 6, 6, 8));
        listCareers.add(new Values("Atleta", 9, 7, 2));
        listCareers.add(new Values("Estudante", 2, 1, 5));
        listCareers.add(new Values("Modelo", 8, 8, 3));
        listCareers.add(new Values("Astronauta", 10, 10, 9));
        listCareers.add(new Values("Chefe de Cozinha", 7, 5, 7));
    }

    public List<Values> getlistCareers() {
        return listCareers;
    }
}
