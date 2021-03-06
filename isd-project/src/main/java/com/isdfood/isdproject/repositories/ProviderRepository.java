package com.isdfood.isdproject.repositories;

import com.isdfood.isdproject.models.Provider;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProviderRepository {
    int addProvider(Provider provider);

    List<Provider> viewProviders();

    void editProvider(String name);

    void deleteProvider(String name);

    default int addProvider(String name, Integer deliveryPrice, String contactInfo, Boolean isActive) {
        return addProvider(new Provider(name, deliveryPrice, contactInfo, isActive));
    }

    Provider findProvider(String name);
}
