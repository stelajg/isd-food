package com.isdfood.isdproject.repositories;

import com.isdfood.isdproject.models.Provider;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ProviderDataAccess implements ProviderRepository {

    public List<Provider> providerList = new ArrayList<>();

    @Override
    public int addProvider(Provider provider) {
        providerList.add(provider);
        return 1;
    }

    @Override
    public List<Provider> viewProviders() {
        return providerList;
    }

    @Override
    public void editProvider(String name) {
//        Provider provider = findProvider(name);
//        if(provider != null){
//
//        }
    }

    @Override
    public void deleteProvider(String name) {
        Provider provider = findProvider(name);
        providerList.remove(provider);
    }

    @Override
    public Provider findProvider(String name) {
        for(Provider provider: providerList){
            if(provider.getName().equals(name)){
                return provider;
            }
        }
        return null;
    }
}
