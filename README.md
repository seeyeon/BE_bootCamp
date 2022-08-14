# BE_bootCamp
 Commento  backend boot camp(2022-07~08)

## 1주차 개발환경 셋팅

### 1. JDK 1.8설치 
![image](https://user-images.githubusercontent.com/71398979/180863744-aebfb951-e80a-4203-a20b-e0067cd5c9f2.png)

#### 2. Eclipse, Spring 다운로드 및 설치
* Eclipse와 Spring설치 시 오류가 났었는데 Eclipse최신 버전 설치 시 STS에서 Spring  MVC Project가 안보일 수 있다.
 * 온갖 구글링을 해도 Preference-Templete Projects에서 수정을 해봐도 수행X 결국, Eclipse버전을 2020-3 버전으로 다운받음
 * STS( Spring Tools 3 Add-On for Spring Tools 4 )와 Eclipse와 ~~버전 연동이 잘 되는 짝을 아직 잘 모르겠다~~
   ( 이클립스 버전 높이면 STS 연동 안되고 버전 내리면 Spring Tools 3만 있음.. ~~뭐지~~)
  
#### 3. Tomcat 설정
* Tomcat? **WAS(web application server)** 컨테이너, 웹 컨테이너, 서블릿 컨테이너로도 불림
* java EE 기반으로 만들어졌으며 JSP와 Servlet 구동을 위한 서블릿 컨테이너 역할을 수행한다.

#### 4. Hello World 출력
![Untitled](https://user-images.githubusercontent.com/71398979/180865885-6d95cc6b-ad9f-445b-b8df-fa258b8d9dca.png)
* 서버를 동작 시킨 뒤, 브라우저에서 "localhost:8080/settingweb(프로젝트명)/"으로 접속 시 결과 출력된다.
 ![image](https://user-images.githubusercontent.com/71398979/180866008-1f9bc848-4219-4772-9963-ff488c032a4e.png)
 * Spring Problems(2 items) 오류 발생,  ~~관련해서 구글링엄청함~~ 
 * 위 오류가 해결되지 않으니 서버가 정상 동작하지 않아 결과가 나오지 않았는데 해결책은 생각보다 간단했음
 * 원인: eclipse의 spring 기능 상에 spring security 스키마를 정상적으로 처리하지 못해 발생되는 문제
   해결방법: 프로젝트 선택 후 Spring Tools -> Remove Spring Project Nature로 .. spring tool 기능 비활성화
   
#### 5. mariadb, mySql Workbench 설치 및 샘플 DB 구축
![Untitled](https://user-images.githubusercontent.com/71398979/180866426-09ce4e5b-3885-49aa-a488-073a1944fe0b.png)
* SQL공부를 한 덕분에 DB쪽 코딩은 어렵지 않았다!

#### 6. 스프링, Mariadb, MyBatis 연동, 데이터 조회
![image](https://user-images.githubusercontent.com/71398979/180866673-54aea042-1006-4521-abbd-1563e6dcd0f0.png)
![image](https://user-images.githubusercontent.com/71398979/180866714-5c26f7c8-158b-47d4-a11c-a52b16a83cb5.png)

* 과제를 그대로 따라 했음에도 위 오류가 계속 발샐함. ~~해결방법 아직도 모르겠음~~
* root-context.xml에서 문제가 있는것 같은데 3일 내내 구글링 해도 ~~모르겠다~~ 해결되었으면 좋겠는데...

#### 7.6번 오류에 대한 원인 파악(예상)
![image](https://user-images.githubusercontent.com/71398979/180869240-01db4482-95ea-4bac-9b41-425ea34e8535.png)
* 원인1) 위 사진과 같이 파일 구조(?)의 이상현상
* 원인2) root-context.xml의 문제 

> "문제해결"(2022-7-30) : jdk 버전 1.8에서 11로 변경 / eclipse 버전 변경 후 STS 재설치<br>
> "jdk버전과 Eclipse버전의 문제가 있었던 것으로 추청... "<br>
> "문제가 해결이 안될때는 다음날 다시 처음부터 천천히 다시 해보면 해결되는 경우가 많다!"<br>
---------

## 2주차 API 가이드문서(초안) 작성하기
* 회원가입 API 가이드 문서_초안.docx 이라는 제목으로 파일을 업로드해 두었습니다.
* 가장 기초적인 기능 중 하나인 회원가입 API를 작성(초안 2022-08-03)
* ~~이렇게 작성하는게 맞는건지..~~

---------

## 4주차  SW 활용 현황 API 구현 및 API 가이드 문서 보완
*  1~3주차 내용을 종합하여 SW활용현황 API를 구현함으로서 그 동안 학습한 내용을 총정리  
*  SQL과 JAVA 코드를 함께 복합적으로 활용하는 API를 개발해보며, API 개발 로직을 좀 더 깊이 이해한다.

API 가이드 문서를 보완하여 github에 "회원가입 API 가이드 문서_수정본" 제목으로 업로드하였다.<br>
또한 HTTP와 REST API에 대한 학습에 대해서는 "추가 개념자료_퀴즈(HTTP, REST API)" 제목으로 업로드하였다.<br>

