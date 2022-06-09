package com.pwschneider.anki.service;

import com.pwschneider.anki.model.Deck;
import com.pwschneider.anki.repository.DeckRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeckService {

    @Autowired
    DeckRepository deckRepository;

    public List<Deck> getAllDecks() {
        return deckRepository.findAll();
    }
}
