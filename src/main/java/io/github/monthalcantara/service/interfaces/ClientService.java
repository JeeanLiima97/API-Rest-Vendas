package io.github.monthalcantara.service.interfaces;

import io.github.monthalcantara.model.Client;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;


public interface ClientService {
    Client findByNameLike(String name);

    Optional<Client> findById(Integer id);

    Page<Client> findByName(String name, Pageable pageable);

    Client findClientFetchOrderItem(Integer id);

    boolean existsByName(String name);

    Client save(Client client);

    void deleteByName(String name);

    void deleteById(Integer id);

    Client updateById(Integer id, Client client);

    Page<Client> findAll(Example example, Pageable pageable);


}
