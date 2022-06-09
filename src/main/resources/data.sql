
DROP TABLE decks;
DROP TABLE cards;

CREATE TABLE decks
(
    id          INTEGER PRIMARY KEY,
    title       TEXT NOT NULL,
    description TEXT NOT NULL
);

CREATE TABLE cards
(
    id       INTEGER PRIMARY KEY,
    deckId   INTEGER NOT NULL,
    question TEXT    NOT NULL,
    answer   TEXT    NOT NULL
);

INSERT
INTO decks (id, title, description)
VALUES (1, 'Spring Boot', 'A collection of what I know about Spring Boot.');


INSERT
INTO cards (id, deckId, question, answer)
VALUES (1, 1, 'What is the annotation @autowired used for',
        'It is used to inject dependencies from the Context container. Example: calling a repository from a service.')
