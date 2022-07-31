# BE_bootCamp
 Commento  backend boot camp(2022-07~08)

# 3차 과제
## RestController를 이용한 간단한 API 구현 ( 20년도의 로그인 수 )

#### [개념학습]

1. REST(Representational State Transfer) 방식?  

   특정한 URL은 반드시 그에 상응하는 데이터 자체라는 것을 의미하는 방식.  
   ex. /article/120 : 120번 게시물이라는 고유한 의미를 가진다. GET,POST 방식을 통해 처리 
   
2. @RestController 애너테이션?<br>
    스프링4부터 사용 가능. REST방식의 데이터 처리를 위해 사용하는 애너테이션.<br>
    반환되는 데이터는 단순문자열, JSON, XML 형태<br>

3. 애너테이션?<br>
   주석처럼 프로그램에 영향을 미치지 않으면서 유용한 정보를 제공하는 것.<br>
   ex. @Override, @Deprecated , @FunctionalInterface 등<br>

-------
### [Spring Boot로 개발 환경 설정]<br>
<br>
<img src="https://user-images.githubusercontent.com/71398979/182037863-b39df4ee-1142-4f1a-8ed7-a39e9305c7a9.png" width="400" height="300" />

> "문제 발생" <br>
   프로젝트 실행 시, 우측 마이스 클릭-run as > spring boot app이 있어야하는 데 없음<br>

> "문제 해결!" <br>
   IDE 상단에 Run WebBootApplication 아이콘 눌러서 실행 <br>
   [참고한 내용](https://www.geeksforgeeks.org/how-to-run-your-first-spring-boot-application-in-eclipse-ide/)<br>

-------
### [20년도 로그인수 API Spring Boot, Mybatis, mariadb 연동 결과]<br> 
<br>
<img src="https://user-images.githubusercontent.com/71398979/182038760-2ba7322c-06d6-4c0b-bbbf-4ce42840c080.png">

> 정상적으로 결과가 나오는 것을 확인할 수 있다.

<img src="https://user-images.githubusercontent.com/71398979/182038778-129b4981-52fb-4802-8f3d-8981a7af1658.png" width="400" height="300" />

> 데이터를 **추가**로 넣었을때도 정상적으로 결과값이 나온다.
<br> 
