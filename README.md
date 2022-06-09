# Anki

## A memorization method
Anki is a flashcard program using spaced repetition, a technique from cognitive science for fast and long-lasting memorization. "Anki" (暗記) is the Japanese word for "memorization".

## Usage
- create a deck:
``` bash
  CURL -X POST  localhost:8080/decks/ \
  -H "Content-Type: application/json" \
  -d @- <<'EOF'
  {
    "title": "Spring Boot",
    "decription": "Decks and cards I used to study Spring Boot",
    "cards": [
        {
            "question": "q1",
            "answer": "a1"
        },
        {
            "question": "q2",
            "answer": "a2"
        },
        ...
    ]
  }
  EOF
 ```

## Compiling & Running
To run the project one needs:
- JDK 11
- Maven

To compile the project:
```
mvn compile
```

To run the application:
```
mvn spring-boot:run
```

## Reference
It's heavily based on the, also open-source, [anki](https://en.wikipedia.org/wiki/Anki_(software)).