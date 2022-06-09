package com.pwschneider.anki.repository;

import com.pwschneider.anki.model.Deck;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DeckRepository extends JpaRepository<Deck, Integer> {
}
