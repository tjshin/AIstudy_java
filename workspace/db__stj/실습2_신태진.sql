-- 실습 1의 필드를 저장하는 테이블을 생성 SQL을 아래표를 참조하여 작성하시오
create table books (
    isbn            number(5)       not null, --도서 번호
    title           varchar2(50)    not null, --도서 명
    author          varchar2(250)   not null, --저자
    publisher       varchar2(50)    not null, --출판사
    price           number(6)       not null, --가격
    descrpt         varchar2(200),            --상세
    publish_date    varchar2(10),             --발행일, year+"."+month
    constraint books_pk primary key (isbn)
);