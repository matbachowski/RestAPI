package pl.zajecia.piosenki;

import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping ("/api/piosenki")
public class PiosenkaAPI {
    private ArrayList<Piosenka> lista;

    public PiosenkaAPI() {
        lista = new ArrayList<Piosenka>();
        lista.add(new Piosenka(1, "tytul1", 1999));
        lista.add(new Piosenka(2, "tytul2", 2010));
        lista.add(new Piosenka(3, "tytul3", 1980));
    }

    @GetMapping("/all")
    public ArrayList<Piosenka> get() {
        return lista;
    }

    @GetMapping
    public Piosenka getById(@RequestParam int id) {
        Optional<Piosenka> first = lista
                .stream()
                .filter(element -> element.getId() == id)
                .findFirst();
        return first.get();
    }

    @PostMapping
    public boolean addPiosenka(@RequestBody Piosenka piosenka){
        return lista.add(piosenka);
    }
    @PutMapping
    public boolean updatePiosenka(@RequestBody Piosenka piosenka){
        return lista.add(piosenka);
    }

    @DeleteMapping
    public boolean removePiosenka(@RequestParam long id) {
        return lista.removeIf(p -> p.getId() == id);
    }

}
