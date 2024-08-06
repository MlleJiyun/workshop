package com.demo.myapp4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// 1. 도메인에 대한 이해
// 2. 엔터티에 구분
// Library -> books, authors, members, loans
// Domain Driven-Design (DDD) + microservices
// 3. 엔터티간의 관계
// 책은 작가가 쓴다.
// 고객은 책 빌린다.
// 고객은 대출해서 빌린다.
// 4. 리소스에 대한 정의
// /books, /authors, /members, /loans
// 5. 동사안되고 명사형을 선택
// /findBooks(x), /books(o)
// 6. /authors/{author id}/books..
//    /members/{member id}/loans..
//
//
// books/api/v1/
// - GET /books
// - POST /books
// - GET /books/{book id}
// - PUT /books/{book id}
// - DELETE /books/{books id}
// authors/v1/
// members/v1/
// loans/v1

// /getOrder -> GET /orders
// /createOrder -> POST /orders

// users/1234/orders

// /getUser(x) -> /users
// /book -> /books
// POST /creatBooks -> POST /books
// /getAllOrders(x) -> GET /orders
// /employees/45(o)
// /employees?employeeId=45(x)

// Filters, Sorts, Pagingnation
// /books?author=Rowling&sort=title

// /addNewEmployee 
// /updateEmployee 
// /deleteEmployee 
// /deleteAllEmployees 
// /promoteEmployee 
// /promoteAllEmployees


@SpringBootApplication
public class Myapp4Application {
	public static void main(String[] args) {
		SpringApplication.run(Myapp4Application.class, args);
	}
}