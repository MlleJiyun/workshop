# Developing-Backend-API-Services-Using-Spring-Boot

## 교재 Source
https://github.com/kiekk/book-spring-boot-up-and-running
## 네이버 공유 사이트
http://naver.me/FZ2g7qU6

### Day 1: Introduction to Spring Boot and RESTful API
- Basic concepts and advantages of Spring Boot
- RESTful API design principles
- Spring Boot project structure and configuration
- Http Status
      <br> https://en.wikipedia.org/wiki/List_of_HTTP_status_codes
    - 200 OK
    - 201 Created
    - 400 Bad Request            
    - 401 Unauthorized
    - 403 Forbidden
    - 404 Not Found
    - 500 Internal Server Error

### Day 2: Core Features of Spring Boot
- Database integration using Spring Data JPA
- Implementing CRUD (Create, Read, Update, Delete) APIs
- Exception handling and validation

* Spring Boot REST API 애너테이션
    1. @RestController, @GetMapping
    2. Java Bean as JSON
    3. List as JSON
    2. @PathVariable
    3. @RequestParam
    4. @PostMapping, @RequestBody
    5. @PutMapping, @RequestBody
    6. @DeleteMapping
    7. ResponseEntity to Http Response
    8. Spring MVC Controller - @RequestMapping
 
      Posts Management 
      - Create, Read, Update, Delete Posts
      - Pagination, Sorting
      Comments Management
      - Create, Read, Update, Delete Comments
      Authentication & Authorization
      - Register, Login, Security
      Category Management
      - Create, Read, Update, Delete Category
      
      * REST APIs for Post Resource			
      Http	 Method	URL Path									Status Code			설명
      GET		 /api/posts											200(OK)				Get all posts
      GET		 /api/posts/{id}									200(OK)				Get post by Id
      POST	 /api/posts											201(CREATED)		Create a new post
      PUT		 /api/posts/{id}									200(OK)				Update existing post with Id
      DELETE	 /api/posts/{id}									200(OK)				Delete post by Id
      GET		 /api/posts?pageSize=5&pageNo=18&sortBy=firstName	200(OK)				Paging, Sorting posts    

      * Actuator 모든 항목 및 실행시 properties 값 보여주는 옵션
      management.endpoints.web.exposure.include=*
      management.endpoint.env.show-values=ALWAYS

### Day 3: Security and Authentication
- Securing APIs with Spring Security
- JWT-based authentication and access control
- Integration with OAuth2 and social logins

### Day 4: Advanced Features and Performance Optimization
- Microservices and API Gateway
- Caching and performance optimization strategies
- Asynchronous processing and event-driven development

### Day 5: Project and Deployment
- Scenario-based project development
- Containerization and deployment using Docker
- Deployment using cloud services
