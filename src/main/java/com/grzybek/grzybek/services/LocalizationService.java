package com.grzybek.grzybek.services;

import com.grzybek.grzybek.domain.Localization;
import com.grzybek.grzybek.dto.LocalizationTO;
import com.grzybek.grzybek.repository.LocalizationRepository;
import com.grzybek.grzybek.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class LocalizationService {

    private final LocalizationRepository localizationRepository;

    private final UserRepository userRepository;

    public void createLocalization(LocalizationTO localizationTO, String name) {
        Localization localization = convertToLocalization(localizationTO);
        localization.setUser(userRepository.findByEmail(name));
        localization.setAdminMark(0);
        localization.setIsPrivate(false);
        localizationRepository.save(localization);
    }

    public List<Localization> getListAllLocalization() {
        return localizationRepository.findAll();
    }

    public void updateLocalization(Localization localization) {
        localizationRepository.saveAndFlush(localization);
    }

    public Localization getLocalizationById(Integer id) {
        return localizationRepository.findOne(id);
    }

    public void deleteLocalization(Integer id) {
        localizationRepository.delete(id);
    }

    private Localization convertToLocalization(LocalizationTO localizationTO){
        return Localization.builder().comment(localizationTO.getComment())
                .grzyb(localizationTO.getGrzyb()).adminMark(localizationTO.getAdminMark())
                .isPrivate(localizationTO.getIsPrivate())
                .localizationEast(localizationTO.getLocalizationEast())
                .localizationNorth(localizationTO.getLocalizationNorth())
                .ecology(localizationTO.getEcology())
                .build();
    }
}
