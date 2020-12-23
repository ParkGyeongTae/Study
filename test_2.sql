use madang;

-- select * from Book;

-- select * from Book;

-- select SUM(saleprice) from Orders;

-- select SUM(saleprice) as 총매출 from Orders where custid = 2;

-- select SUM(saleprice) AS Total, AVG(saleprice) AS Average, MIN(saleprice) AS Minimum, Max(saleprice) AS Maximum from Orders;

-- select COUNT(*) from Orders;

-- select custid, count(*) as 도서수량, sum(saleprice) as 총액 from Orders group by custid;

-- select custid, count(*) as 도서수량 from Orders where saleprice >= 8000 group by custid

-- select * from Customer, Orders where Customer.custid = Orders.custid;
 
-- select * from Customer, Orders where Customer.custid = Orders.custid order by Customer.custid;

-- select name, saleprice from Customer, Orders where Customer.custid = Orders.custid;

-- select name, sum(saleprice) from Customer, Orders where Customer.custid = Orders.custid group by Customer.name order by Customer.name;

-- select Customer.name, Book.bookname from Customer, Orders, Book where Customer.custid = Orders.custid and Orders.bookid = Book.bookid;

-- select Customer.name, Book.bookname from Customer, Orders, Book where Customer.custid = Orders.custid and Orders.bookid = Book.bookid;

-- select b1.bookname from Book b1 where b1.price > (select avg(b2.price) from Book b2 where b2.publisher = b1.publisher);

-- select b1.bookname from Book b1 where b1.price > (select avg(b2.price) from Book b2 where b2.publisher = b1.publisher);

-- 출판사별로 출판사의 평균 도서 가격보다 비싼 도서를 구하시오.
-- select b1.bookname from Book b1 where b1.price > (select avg(b2.price) from Book b2 where b2.publisher = b1.publisher);

-- 대한민국에서 거주하는 고객의 이름과 도서를 주문한 고객의 이름을 보이시오.
-- select name from Customer where address like '대한민국%' union select name from Customer where custid in (select custid from Orders);

-- select name from Customer where address like '대한민국%' union select name from Customer where custid in (select custid from Orders);

-- select b1.bookname from Book b1 where b1.price > (select avg(b2.price) from Book b2 where b2.publisher = b1.publisher);

-- select Customer.name, Book.bookname from Customer, Orders, Book where Customer.custid = Orders.custid and Orders.bookid = Book.bookid;

-- select b1.bookname from Book b1 where b1.price > (select avg(b2.price) from Book b2 where b1.publisher = b2.publisher);

-- select Customer.name, Book.bookname from Customer, Orders, Book where Customer.custid = Orders.custid and Orders.bookid = Book.bookid;

-- 도서의 모든 이름과 가격을 검색하시오.
-- select bookname, price from Book;

-- 모든 도서의 도서번호, 도시이름, 출판사, 가격을 검색하시오.
-- select bookid, bookname, publisher, price from Book;

-- 도서 테이블에 있는 모든 출판사를 검색하시오.
-- select publisher from Book;

-- 가격이 20000원 미만인 도서를 검색하시오.
-- select * from Book where price < 20000;

-- 도서의 모든 이름과 가격을 검색하시오.
-- select bookname, price from Book;

-- 가격이 20000원 미만인 도서를 검색하시오.
-- select * from Book where price < 20000;

-- 가격이 10000원 이상 20000원 이하인 도서를 검색하시오.
-- select * from Book where price between 10000 and 20000;

-- 모든 도서의 도서번호, 도서이름, 출판사, 가격을 검색하시오.
-- select bookid, bookname, publisher, price from Book;

-- 도서 테이블에 있는 모든 출판사를 검색하시오.
-- select publisher from Book;

-- 고객이 주문한 도서의 총 판매액을 구하시오.
-- select sum(saleprice) from Orders;

-- 2번 김연아 고객이 주문한 도서의 총 판매액을 구하시오.
-- select sum(saleprice) as 총매출 from Orders where custid=2;

-- 고객이 주문한 도서의 총 판매액, 평균값, 최저가, 최고가를 구하시오.
-- select sum(saleprice) as total, avg(saleprice) as average, min(saleprice) as minimum, max(saleprice) as maximum from Orders;

-- 고객이 주문한 도서의 총 판매액을 구하시오.
-- select sum(saleprice) from Orders;

-- 마당서점의 도서 판매 건수를 구하시오.
-- select count(*) from Orders;

-- 도서 테이블에 있는 모든 출판사를 검색하시오.
-- select publisher from Book;

-- 고객이 주문한 도서의 총 판매액을 구하시오.
-- select sum(saleprice) from Orders;

-- 2번 김연아 고객의 주문한 도서의 총 판매액을 구하시오.
-- select sum(saleprice) as 총매출 from Orders where custid = 2;

-- 고객이 주문한 도서의 총 판매액, 평균값, 최저가, 최고가를 구하시오.
-- select sum(saleprice) as total, avg(saleprice) as average, min(saleprice) as minimum, max(saleprice) as maximum from Orders;

-- 고객이 주문한 도서의 총 판매액을 구하시오.
-- select sum(saleprice) from Orders;

-- create table NewBook( bookid integer, bookname varchar(20), publisher varchar(20), price integer, primary key (bookid));

-- select * from NewBook;

-- 다음과 같은 속성을 가진 NewCustomer 테이블을 생성하시오.
-- create table NewCustomer ( custid integer primary key, name varchar(40), address varchar(40), phone varchar(30) );

-- 다음과 같은 속성을 가진 NewOrders 테이블을 생성하시오.
-- create table NewOrders ( orderid integer, custid integer not null, bookid integer not null, saleprice integer, orderdate date, primary key(orderid), 
-- foreign key(custid) references NewCustomer(custid) on delete cascade);

-- NewBook 테이블에 varchar(13)의 자료형을 가진 isbn 속성을 추가하시오.
-- alter table NewBook add isbn varchar(13);

-- NewBook 테이블의 isbn 속성의 데이터 타입을 integer형으로 변경하시오.
-- alter table NewBook modify isbn integer;

-- NewBook 테이블의 isbn 속성을 삭제하시오.
-- alter table NewBook drop column isbn;

-- NewBook 테이블의 bookid 속성에 not null 제약조건을 적용하시오.
-- alter table NewBook modify bookid integer not null;

-- NewBook 테이블의 bookid 속성을 기본키로 변경하시오.
-- alter table NewBook add primary key(bookid);

-- NewBook 테이블을 삭제하시오.
-- drop table NewBook;

-- NewCustomer 테이블을 삭제하시오.
-- drop table NewOrders;
-- drop table NewCustomer;

-- Book 테이블에 새로운 도서 '스포츠 의학'을 삽입하시오. 스포츠 의학은 한솔의학서적에서 출간했으며 가격은 90000원이다.
-- insert into Book(bookid, bookname, publisher, price) values(11, '스포츠 의학', '한솔의학서적', 90000);

-- Book 테이블에 새로운 도서 '스포츠 의학'을 삽입하시오. 스포츠 의학은 한솔의학서적에서 출간했으며 가격은 미정이다.
-- insert into Book(bookid, bookname, publisher) values (14, '스포츠 의학', '한솔의학서적');

-- 수입도서 목록(imported_book)을 Book 테이블에 모두 삽입하시오.
-- insert into Book(bookid, bookname, price, publisher) select bookid, bookname, price, publisher from Imported_Book;

-- Customer 테이블에서 고객번호가 5인 고객의 주소를 '대한민국 부산'으로 변경하시오.
-- set SQL_SAFE_UPDATES = 0;
-- update Customer set address = '대한민국 부산' where custid = 5;

-- Book 테이블에서 14번 '스포츠 의학'의 출한사를 imported_book 테이블의 21번 책의 출판사와 동일하게 변경하시오.
-- update Book set publisher = (select publisher from Imported_Book where bookid= '21') where bookid = '14';

-- Book 테이블에서 도서번호가 11인 도서를 삭제하시오.
-- delete from Book where bookid = '11';

-- 모든 고객을 삭제하시오.
-- delete from Customer;

-- -78과 +78의 절대값을 구하시오.
-- select abs(-78), abs(+78);

-- 4.875를 소수 첫째 자리까지 반올림한 값을 구하시오.
-- select round(4.875, 1);

-- 고객별 평균 주문 금액을 백원 단위로 반올림한 값을 구하시오.
-- select custid '고객번호', round(sum(saleprice)/count(*),-2) '평균금액' from Orders group by custid;

-- 도서 제목에 야구가 포함된 도서를 농구로 변경한 후 도서 목록을 보이시오.
-- select bookid, replace(bookname, '야구', '농구') bookname, publisher, price from Book;

-- 굿스포츠에서 출판한 도서의 제목과 제목의 문자 수, 바이트 수를 보이시오.
-- select bookname '제목', char_length(bookname) '문자수', length(bookname) '바이트수' from Book where publisher = '굿스포츠';

-- 마당서점의 고객 중에서 같은 성을 가진 사람이 몇 명이나 되는지 성별 인원수를 구하시오.
-- select substr(name, 1, 1) '성', count(*) '인원' from Customer group by substr(name, 1, 1);

-- 마당서점은 주문일로부터 10일 후 매출을 확정한다. 각 주문의 확정일자를 구하시오.
-- select orderid '주문번호', orderdate '주문일', adddate(orderdate, interval 10 day) '확정' from Orders;

-- 마당서점이 2014년 7월 7일에 주문받은 도서의 주문번호, 주문일, 고객번호, 도서번호를 모두 보이시오. 단, 주문일은 '%Y-%m-%d' 형태로 표시한다.
-- select orderid '주문번호', str_to_date(orderdate, '%Y-%m-%d') '주문일', custid '고객번호', bookid '도서번호' from Orders where orderdate = DATE_FORMAT('20140707', '%Y%m%d');

-- 이름, 전화번호가 포함된 고객목록을 보이시오. 단, 전화번호가 없는 고객은 '연락처없음'으로 표시하시오.
-- select name '이름', ifnull(phone, '연락처없음') '전화번호' from Customer;

-- 이름, 전화번호가 포함된 고객목록을 보이시오. 단, 전화번호가 없는 고객은 '연락처없음'으로 표시하시오.
-- select name '이름', ifnull(phone, '연락처없음') '전화번호' from Customer;

-- 고객 목록에서 고객번호, 이름, 전화번호를 앞의 두 명만 보이시오.
-- set @seq:=0; select (@seq:=@seq+1) '순번', custid, name, phone from Customer where @seq < 2;

-- 마당서점의 고객별 판매액을 보이시오 (고객이름과 고객별 판매액 출력)
-- select (select name from Customer cs where cs.custid = od.custid) 'name', sum(saleprice) 'total' from Orders od group by od.custid;

-- Orders 테이블에 각 주문에 맞는 도서이름을 입력하시오
-- alter table Orders add bname varchar(40);
-- update Orders set bname = (select bookname from Book where Book.bookid = Orders.bookid);

-- 고객번호가 2 이하인 고객의 판매액을 보이시오 (고객이름과 고객별 판매액 출력)
-- select cs.name, sum(od.saleprice) 'total' from (select custid, name from Customer where custid <= 2) cs, Orders od where cs.custid = od.custid group by cs.name;

-- 평균 주문금액 이하의 주문에 대해서 주문번호와 금액을 보이시오.
-- select orderid, saleprice from Orders where saleprice <= (select avg(saleprice) from Orders);

-- 각 고객의 평균 주문금액보다 큰 금액의 주문 내역에 대해서 주문번호, 고객번호, 금액을 보이시오.
-- select orderid, custid, saleprice from Orders md where saleprice > (select avg(saleprice) from Orders so where md.custid = so.custid);

-- 대한민국에 거주하는 고객에게 판매한 도서의 총 판매액을 구하시오.
-- select sum(saleprice) 'total' from Orders where custid in (select custid from Customer where address like '%대한민국%');

-- -78과 +78의 절댓값을 구하시오.
-- select abs(-78), abs(+78);

-- 4.875를 소수 첫째 자리까지 반올림한 값을 구하시오.
-- select round(4.875, 1);

-- 고객별 평균 주문 금액을 백원 단위로 반올림한 값을 구하시오.
-- select custid '고객번호', round(sum(saleprice)/count(*),-2) '평균금액' from Orders group by custid;

-- 도서제목에 야구가 포함된 도서를 농구로 변경한 후 도서 목록을 보이시오.
-- select bookid, replace(bookname, '야구', '농구') bookname, publisher, price from Book;

-- 각 고객의 평균 주문금액보다 큰 금액의 주문 내역에 대해서 주문번호, 고객번호, 금액을 보이시오.
-- select orderid, custid, saleprice from Orders md where saleprice > (select avg(saleprice) from Orders so where md.custid = so.custid);

-- 도서제목에 야구가 포함된 도서를 농구로 변경한 후 도서 목록을 보이시오.
-- select bookid, replace(bookname, '야구', '농구') bookname, publisher, price from Book;

-- 굿스포츠에서 출판한 도서의 제목과 제목의 문자 수, 바이트 수를 보이시오.
-- select bookname '제목', char_length(bookname) '문자수', length(bookname) '바이트수' from Book where publisher = '굿스포츠';

-- 마당서점의 고객 중에서 같은 성을 가진 사람이 몇 명이나 되는지 성별 인원수를 구하시오.
-- select substr(name, 1, 1) '성', count(*) '인원' from Customer group by substr(name, 1, 1);

-- select substr(name, 1, 1) '성', count(*) '인원' from Customer group by substr(name, 1, 1);

-- 모든 도서의 이름과 가격을 검색하시오
-- select bookname, price from Book;

-- 모든 도서의 도서번호, 도서이름, 출판사, 가격을 검색하시오.
-- select bookid, bookname, publisher, price from Book;

-- 모든 도서의 도서번호, 도서이름, 출판사, 가격을 검색하시오.
-- select bookid, bookname, publisher, price from Book;

-- 도서 테이블에 있는 모든 출판사를 검색하시오.
-- select publisher from Book;

-- 가격이 20000원 미만인 도서를 검색하시오.
-- select * from Book where price < 20000;

-- 가격이 10000원 이상 20000원 이하인 도서를 검색하시오.
-- select * from Book where price >= 10000 and price <=20000;

-- 가격이 10000원 이상 20000원 이하인 도서를 검색하시오.
-- select * from Book where price between 10000 and 20000;

-- 출판사가 '굿스포츠' 혹은 '대한미디어'인 도서를 검색하시오.
-- select * from Book where publisher in ('굿스포츠', '대한미디어');

-- '축구의 역사'를 출간한 출판사를 검색하시오.
-- select publisher from Book where bookname in ('축구의 역사');

-- '축구의 역사'를 출간한 출판사를 검색하시오.
-- select bookname, publisher from Book where bookname in ('축구의 역사');

-- '축구의 역사'를 출간한 출판사를 검색하시오.
-- select bookname, publisher from Book where bookname like ('축구의 역사');

-- 도서이름에 '축구'가 포함된 출판사를 검색하시오.
-- select bookname, publisher from Book where bookname like ('%축구%');

-- 도서이름에 '축구'가 포함된 출판사를 검색하시오.
-- select bookname, publisher from Book where bookname like ('%축구%');

-- 도서이름의 왼쪽 두 번째 위치에 '구'라는 문자열을 갖는 도서를 검색하시오.
-- select bookname from Book where bookname like ('_구%');

-- 도서이름의 왼쪽 두 번째 위치에 '구'라는 문자열을 갖는 도서를 검색하시오.
-- select * from Book where bookname like ('_구%');

-- 축구에 관한 도서 중 가격이 20000원 이상인 도서를 검색하시오.
-- select * from Book where bookname like ('%축구%') and price >= 20000;

-- 출판사가 '굿스포츠' 혹은 '대한미디어'인 도서를 검색하시오.
-- select * from Book where publisher in ('굿스포츠', '대한미디어');

-- 출판사가 '굿스포츠' 혹은 '대한미디어'인 도서를 검색하시오.
-- select * from Book where publisher like '굿스포츠' or publisher like '대한미디어';

-- 도서를 이름순으로 검색하시오.
-- select * from Book order by bookname;

-- 도서를 이름순으로 검색하시오.
-- select * from Book order by bookname;

-- 도서를 가격순으로 검색하고, 가격이 같으면 이름순으로 검색하시오.
-- select * from Book order by price, bookname;

-- 도서를 가격순으로 검색하고, 가격이 같으면 이름순으로 검색하시오.
-- select * from Book order by price, bookname;

-- 도서를 가격의 내림차순으로 검색하시오. 만약 가격이 같다면 출판사의 오름차순으로 출력하시오.
-- select * from Book order by price DESC, publisher;

-- 도서를 가격의 내림차순으로 검색하시오. 만약 가격이 같다면 출판사의 오름차순으로 출력하시오.
-- select * from Book order by price DESC, publisher ASC;

-- 고객이 주문한 도서의 총 판매액을 구하시오.
-- select sum(saleprice) from Orders;

-- 2번 김연아 고객이 주문한 도서의 총 판매액을 구하시오.
-- select sum(saleprice) as '총매출' from Orders where custid = 2;

-- 고객이 주문한 도서의 총 판매액, 평균값, 최저가, 최고가를 구하시오.
-- select sum(saleprice) as '총 판매액', avg(saleprice) as '평균값', min(saleprice) as '최저가', max(saleprice) as '최고가' from Orders;

-- 마당서점의 도서 판매 건수를 구하시오.
-- select * from Orders;

-- 마당서점의 도서 판매 건수를 구하시오.
-- select count(*) as '총개수' from Orders;

-- 마당서점의 도서 판매 건수를 구하시오.
-- select count(*) as '총개수' from Orders;

-- 고객별로 주문한 도서의 총 수량과 총 판매액을 구하시오.
-- select count(*) as '총수량', sum(saleprice) as '총판매액' from Orders;

-- 마당서점의 도서 판매 건수를 구하시오.
-- select count(*) from Orders;

-- 고객별로 주문한 도서의 총 수량과 총 판매액을 구하시오.
-- select count(*), sum(saleprice) from Orders;

-- 가격이 8000원 이상인 도서를 구매한 고객에 대하여 고객별 주문 도서의 총 수량을 구하시오. 단, 두 권 이상 구매한 고객만 구하시오.
-- select custid, count(*) as '도서수량' from Orders where saleprice >= 8000 group by custid having count(*) >= 2;

-- 가격이 8000원 이상인 도서를 구매한 고객에 대하여 고객별 주문 도서의 총 수량을 구하시오. 단, 두 권 이상 구매한 고객만 구하시오.
-- select custid, count(*) as 도서수량 from Orders where saleprice >= 8000 group by custid having count(*) >= 2;

-- 고객과 고객의 주문에 관한 데이터를 모두 보이시오.
-- select * from Customer, Orders where Customer.custid = Orders.custid;

-- 고객과 고객의 주문에 관한 데이터를 고객별로 정렬하여 보이시오.
-- select * from Customer, Orders where Customer.custid = Orders.custid order by Customer.custid;

-- 고객의 이름과 고객이 주문한 도서의 판매가격을 검색하시오.
-- select name, saleprice from Customer, Orders where Customer.custid = Orders.custid;

-- 고객별로 주문한 모든 도서의 총 판매액을 구하고, 고객별로 정렬하시오.
-- select name, sum(saleprice) from Customer, Orders where Customer.custid = Orders.custid group by Customer.name order by Customer.name;

-- 고객의 이름과 고객이 주문한 도서의 이름을 구하시오.
-- select Customer.name, Book.bookname from Customer, Orders, Book where Customer.custid = Orders.custid and Orders.bookid = Book.bookid;

-- 가격이 20000원인 도서를 주문한 고객의 이름과 도서의 이름을 구하시오.
-- select Customer.name, Book.bookname from Customer, Book where Book.price = 20000;

-- 가격이 20000원인 도서를 주문한 고객의 이름과 도서의 이름을 구하시오.
-- select Customer.name, Book.bookname from Customer, Orders, Book where Customer.custid = Orders.custid and Orders.bookid = Book.bookid and Book.price = 20000;

-- 도서를 구매하지 않은 고객을 포함하여 고객의 이름과 고객이 주문한 도서의 판매가격을 구하시오.
-- select Customer.name, saleprice from Customer left outer join Orders on Customer.custid = Orders.custid;

-- 가장 비싼 도서의 이름을 구하시오.
-- select bookname from Book where price = (select max(price) from Book);

-- 가장 비싼 도서의 이름을 구하시오.
-- select bookname from Book where price = (select max(price) from Book);

-- 도서를 구매한 적이 있는 고객의 이름을 검색하시오.
-- select name from Customer where custid in (select custid from Orders);

-- 도서를 구매한 적이 있는 고객의 이름을 검색하시오.
-- select name from Customer where custid in (select custid from Orders);

-- 대한미디어에서 출판한 도서를 구매한 고객의 이름을 보이시오.
-- select name from Customer where custid in (select custid from Orders where bookid in (select bookid from Book where publisher = '대한미디어'));

-- 출판사별로 출판사의 평균 도서 가격보다 비싼 도서를 구하시오.
-- select b1.bookname from Book b1 where b1.price > (select avg(b2.price) from Book b2 where b2.publisher = b1.publisher);

-- 출판사별로 출판사의 평균 도서 가격보다 비싼 도서를 구하시오.
-- select b1.bookname from Book b1 where b1.price > (select avg(b2.price) from Book b2 where b2.publisher = b1.publisher);

-- 대한민국에서 거주하는 고객의 이름과 도서를 주문한 고객의 이름을 보이시오.
-- select name from Customer where address like '대한민국%' union select name from Customer where custid in (select custid from Orders);

-- 주문이 있는 고객의 이름과 주소를 보이시오
-- select name, address from Customer cs where exists (select * from Orders od where cs.custid = od.custid);

-- 다음과 같은 속성을 가진 NewBook 테이블을 생성하시오.
-- create table NewBook( bookid integer, bookname varchar(20), publisher varchar(20), price integer);

-- 다음과 같은 속성을 가진 NewCustomer 테이블을 생성하시오.
-- create table NewCustomer ( custid integer primary key, name varchar(40), address varchar(40), phone varchar(30));

-- 다음과 같은 속성을 가진 NewOrders 테이블을 생성하시오.
-- create table NewOrders ( orderid integer, custid integer not null, bookid integer not null, saleprice integer, orderdate date, primary key(orderid),
-- foreign key(custid) references NewCustomer(custid) on delete cascade);

-- NewBook 테이블에 varchar(13)의 자료형을 가진 isbn 속성을 추가하시오.
-- alter table NewBook add isbn VARCHAR(13);

-- NewBook 테이블의 isbn 속성의 데이터 타입을 integer형으로 변경하시오.
-- alter table NewBook modify isbn integer;

-- NewBook 테이블의 isbn 속성을 삭제하시오.
-- alter table NewBook drop column isbn;

-- NewBook 테이블의 bookid 속성에 not null 제액조건을 적용하시오.
-- alter table NewBook modify bookid integer not null;

-- NewBook 테이블의 bookid 속성을 기본 키로 설정하시오.
-- alter table NewBook add primary key(bookid);

-- NewBook 테이블을 삭제하시오.
-- drop table NewBook;

-- NewCustomer 테이블을 삭제하시오.
-- drop table NewOrders;
-- drop table NewCustomer;