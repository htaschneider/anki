package com.pwschneider.anki.controller;

import com.pwschneider.anki.model.Deck;
import com.pwschneider.anki.service.DeckService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DeckController {

    @Autowired
    DeckService deckService;

    @GetMapping("/decks")
    public List<Deck> getAllDecks() {
        return deckService.getAllDecks();
    }


}
