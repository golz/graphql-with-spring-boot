# graphql-with-spring-boot
GraphQL Spring Boot

Access localhost:8080/graphiql

Calling mutation
mutation {
  createPerson(personName: "test", job: "IT", salary: "1000") 
  {
    id
  }
}

Getting data
query {
  persons(count: 1) 
  {
    id, 
    name, 
    job
  }
}
