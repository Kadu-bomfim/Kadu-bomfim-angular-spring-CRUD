package br.com.kadubomfim.resource;

import br.com.kadubomfim.model.Categoria;
import br.com.kadubomfim.repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.servlet.http.HttpServletResponse;
import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/categorias")
public class CategoriaResource {

    @Autowired
    private CategoriaRepository categoriaRepository;

    @GetMapping
    public List<Categoria> listar() {
        return categoriaRepository.findAll();
    }

    @GetMapping("/{codigo}")
    public Categoria buscarPeloCodigo(@PathVariable Long codigo){
        return categoriaRepository.findById(codigo).orElseThrow(null);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Categoria> criar(@RequestBody Categoria categoria, HttpServletResponse response) {

        Categoria categoriaSalva = categoriaRepository.save(categoria);

        URI uri = ServletUriComponentsBuilder.fromCurrentRequestUri().path("/{codigo}").buildAndExpand(categoriaSalva.getCodigo()).toUri();

/*      NÃO precisa desse RESPONSE, o postman ja tras o location com o codigo do item criado
        response.setHeader("Location", uri.toASCIIString());*/

        return ResponseEntity.created(uri).body(categoriaSalva);
    }
}
