### Setup & Info

1. PGAdmin (DB NAME: demo)
2. Postman can be accessed via localhost:5001

### Creating simple REST API with Springboot

#### Springboot Intro

Choice of IDE (IntelliJ is preferred because can build jar/generate code but VSCode should have same functionality with plugins)
Spring Initializer

- Adding dependencies
- Setting up project
- pom.xml/application.properties database setup
  Creating project structure (model [entities], service, repository, dto, controller)
  Create Models + Show lombok annotations
  Create repositories (using naming conventions + using @Query annotation)
  Creating Services (business logic) and Controllers (REST API)
  Creating DTO
  Testing with Postman

Create new entities (menu/menuItem)
Relationship annotation for ORM
Create repository/services/controllers
Show bidirectional relationship infinite loop
Fix

#### Common pitfalls

1. Infinite Loop in entity relationship. When serialized with bidirectional relationship @OneToMany and @ManyToOne -> infinite loop)
   Solution: use DTOs and annotations @JsonManagedReference [parent/one side] / @JsonBackReference [child/many side] or if u want to just ignore it @JsonIgnore

- part of the Jackson Library

#### Testing some parts only but dont want to run whole application?

Jshell - terminal type jshell
`/env -class-path /path/to/myapp.jar`
