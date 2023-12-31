package org.cs320.ozyegin.service;

import org.cs320.ozyegin.data_layer.AdvertRepository;
import org.cs320.ozyegin.model.Advertisement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Date;
import java.util.List;

@Service
public class AdvertServiceImpl implements AdvertService{

    @Autowired
    public AdvertRepository advertRepository;
    @Override
    public Advertisement saveAdvertisement(Advertisement advertisement) {
        System.out.println(advertisement);
        advertisement.setDate(new Date());
        return advertRepository.save(advertisement);
    }

    @Override
    public List<Advertisement> findAllAdvertisements() {
        return advertRepository.findAllAdverts();
    }

    @Override
    public List<Advertisement> findByPartialTitle(String title) {
        return advertRepository.findByPartialTitle(title);
    }

    @Override
    public Advertisement findAdvertByID(Long id) {
        return advertRepository.findByID(id);
    }
}
