package com.grzybek.grzybek.services;

import com.grzybek.grzybek.domain.Attribute;
import com.grzybek.grzybek.dto.AttributeTO;
import com.grzybek.grzybek.repository.AttributeRepository;
import lombok.*;
import org.springframework.stereotype.Service;

import javax.validation.constraints.NotNull;
import java.util.List;

@Service
@AllArgsConstructor
public class AttributeService {

    private final AttributeRepository attributeRepository;

    public List<Attribute> getListAllAttributes() { return attributeRepository.findAll();
    }

    public void deleteAttribute(Integer id) {
        attributeRepository.delete(id);
    }

    public Attribute getAttributeById(Integer id) {
        return attributeRepository.getOne(id);
    }

    public void updateAttribute(Attribute attribute) {
        attributeRepository.saveAndFlush(attribute);
    }

    public void createAttribute(AttributeTO attribute) {
        attributeRepository.save(convertTO(attribute));
    }

    private Attribute convertTO(@NotNull AttributeTO attributeTO) {
        return Attribute.builder().description(attributeTO.getDescription()).build();


    }
}
