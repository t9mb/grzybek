package com.grzybek.grzybek.services;

import com.grzybek.grzybek.domain.Grzyb;
import com.grzybek.grzybek.dto.GrzybTO;
import com.grzybek.grzybek.repository.GrzybRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.util.Base64Utils;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@Service
@AllArgsConstructor
public class GrzybService {

    private final GrzybRepository grzybRepository;

    public List<Grzyb> getListAllGrzyb() {
        return grzybRepository.findAll();
    }

    public void deleteGrzyb(Integer id) {
        grzybRepository.delete(id);
    }

    public GrzybTO getGrzybById(Integer id) {
        Grzyb grzyb = grzybRepository.getOne(id);
        return new GrzybTO(grzyb, convertByteToString(grzyb.getImage()));
    }

    public void updateGrzyb(Grzyb grzyb) {
        grzybRepository.saveAndFlush(grzyb);
    }

    public void createGrzyb(GrzybTO grzybTO) {
        grzybRepository.save(conwertToGrzyb(grzybTO));
    }

    private Grzyb conwertToGrzyb(GrzybTO grzybTO) {
        return Grzyb.builder().image(convertFileToByte(grzybTO.getMultipartFile())).attribute(grzybTO.getAttribute())
                .name(grzybTO.getName()).description(grzybTO.getDescription()).build();
    }

    static byte[] convertFileToByte(MultipartFile file) {
        byte[] fileBin = null;

        try {
            fileBin = file.getBytes();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return fileBin;
    }

    static String convertByteToString(byte[] file) {
        return Base64Utils.encodeToString(file);
    }
}

