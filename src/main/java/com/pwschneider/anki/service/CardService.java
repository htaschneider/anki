package com.pwschneider.anki.service;

import com.pwschneider.anki.model.Card;
import com.pwschneider.anki.repository.CardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CardService {

    @Autowired
    CardRepository cardRepository;

    public List<Card> getAllDecks() {
        return cardRepository.findAll();
    }
}
