use madang;

-- 3-1. 모든 도서의 이름과 가격을 검색하시오.
-- select bookname, price from Book;

-- 3-2. 모든 도서의 도서번호, 도서이름, 출판사, 가격을 검색하시오.
-- select bookid, bookname, publisher, price from Book;

-- 3-3. 도서 테이블에 있는 모든 출판사를 검색하시오.
-- select publisher from Book;

-- 3-4. 가격이 20000원 미만인 도서를 검색하시오.
-- select * from Book where price < 20000;

-- 3-5. 가격이 10000원 이상 20000원 이하인 도서를 검색하시오.
-- select * from Book where price between 10000 and 20000;

-- 3-6. 출판사가 '굿스포츠' 혹은 '대한미디어'인 도서를 검색하시오.
-- select * from Book where publisher in ('굿스포츠', '대한미디어');

-- 3-7. '축구의 역사'를 출간한 출판사를 검색하시오.
-- select bookname, publisher from Book where bookname like '축구의 역사';

-- 3-8. 도서이름에 '축구'가 포함된 출판사를 검색하시오.
-- select bookname, publisher from Book where bookname like '%축구%';

-- 3-9. 도서이름의 왼쪽 두 번째 위치에 '구'라는 문자열을 갖는 도서를 검색하시오.
-- select bookname from Book where bookname like '_구%';

-- 3-9. 도서이름의 왼쪽 두 번째 위치에 '구'라는 문자열을 갖는 도서를 검색하시오.
-- select * from Book where bookname like '_구%';

-- 3-10. 축구에 관한 도서 중 가격이 20000원 이상인 도서를 검색하시오.
-- select * from Book where bookname like '%축구%' and price >= 20000;

-- 3-11. 출판사가 '굿스포츠' 혹은 '대한미디어'인 도서를 검색하시오.
-- select * from Book where publisher like '굿스포츠' or publisher like '대한미디어';

-- 3-12. 도서를 이름순으로 검색하시오.
-- select * from Book order by bookname;

-- 3-13. 도서를 가격순으로 검색하고, 가격이 같으면 이름순으로 검색하시오.
-- select * from Book order by price, bookname;

-- 3-14. 도서를 가격의 내림차순으로 검색하시오. 만약 가격이 같다면 출판사의 오름차순으로 출력하시오.
-- select * from Book order by price desc, publisher;

-- 3-15. 고객이 주문한 도서의 총 판매액을 구하시오.
-- select sum(price) from Book;

-- 3-16. 2번 김연아 고객이 주문한 도서의 총 판매액을 구하시오.
-- select sum(saleprice) as '총판매액' from Orders where custid = 2;

-- 3-17. 고객이 주문한 도서의 총 판매액, 평균값, 최저가, 최고가를 구하시오.
-- select sum(saleprice), avg(saleprice), min(saleprice), max(saleprice) from Orders;

-- 3-18. 마당서점의 도서 판매 건수를 구하시오.
-- select count(orderid) from Orders;

-- 3-18. 마당서점의 도서 판매 건수를 구하시오.
-- select count(*) from Orders;

-- 3-19. 고객별로 주문한 도서의 총 수량과 총 판매액을 구하시오.
-- select custid, count(*) as '총수량', sum(saleprice) as '총판매액' from Orders group by custid;

-- 3-19. 고객별로 주문한 도서의 총 수량과 총 판매액을 구하시오.
-- select custid, count(*) as '총수량', sum(saleprice) as '총판매액' from Orders group by custid;

-- 3-20. 가격이 8000원 이상인 도서를 구매한 고객에 대하여 고객별 주문 도서의 총 수량을 구하시오.
--       단, 두권 이상 구매한 고객만 구하시오.
-- select custid, count(*) as '수량' from Orders where saleprice >= 8000 group by custid having count(*) >= 2;

-- 3-20. 가격이 8000원 이상인 도서를 구매한 고객에 대하여 고객별 주문 도서의 총 수량을 구하시오. 단, 두권 이상 구매한 고객만 구하시오.
-- select custid, count(*) as '수량' from Orders where saleprice >= 8000 group by custid having count(*) >= 2;

-- 3-21. 고객과 고객의 주문에 관한 데이터를 모두 보이시오.
-- select * from Customer, Orders where Customer.custid = Orders.custid;

-- 3-21. 고객과 고객의 주문에 관한 데이터를 모두 보이시오.
-- select * from Customer, Orders where Customer.custid = Orders.custid;

-- 3-22. 고객과 고객의 주문에 관한 데이터를 고객별로 정렬하여 보이시오.
-- select * from Customer, Orders where Customer.custid = Orders.custid order by Customer.custid;

-- 3-23. 고객의 이름과 고객이 주문한 도서의 판매가격을 검색하시오.
-- select Customer.name, sum(saleprice) from Customer, Orders where Customer.custid = Orders.custid group by Customer.name;

-- 3-23. 고객의 이름과 고객이 주문한 도서의 판매가격을 검색하시오.
-- select name, saleprice from Customer, Orders where Customer.custid = Orders.custid;

-- 3-24. 고객별로 주문한 모든 도서의 총 판매액을 구하고, 고객별로 정렬하시오.
-- select name, sum(saleprice) from Customer, Orders where Customer.custid = Orders.custid group by Customer.name order by Customer.name;

-- 3-25. 고객의 이름과 고객이 주문한 도서의 이름을 구하시오.
-- select Customer.name, Book.bookname from Customer, Book, Orders where Customer.custid = Orders.custid and Orders.bookid = Book.bookid;

-- 3-25. 고객의 이름과 고객이 주문한 도서의 이름을 구하시오.
-- select Customer.name, Book.bookname from Customer, Book, Orders where Customer.custid = Orders.custid and Orders.bookid = Book.bookid;

-- 3-26. 가격이 20000원인 도서를 주문한 고객의 이름과 도서의 이름을 구하시오.
-- select Customer.name, Book.bookname from Customer, Orders, Book where Customer.custid = Orders.custid and Orders.bookid = Book.bookid and Book.price = 20000;

-- 3-26. 가격이 20000원인 도서를 주문한 고객의 이름과 도서의 이름을 구하시오.
-- select Customer.name, Book.bookname from Customer, Orders, Book where Customer.custid = Orders.custid and Orders.bookid = Book.bookid and Book.price = 20000;

-- 3-27. 도서를 구매하지 않은 고객을 포함하여 고객의 이름과 고객이 주문한 도서의 판매가격을 구하시오.
-- select Customer.name, saleprice from Customer left outer join Orders on Customer.custid = Orders.custid;

-- 3-27. 도서를 구매하지 않은 고객을 포함하여 고객의 이름과 고객이 주문한 도서의 판매가격을 구하시오.
-- select Customer.name, saleprice from Customer left outer join Orders on Customer.custid = Orders.custid;

-- 3-28. 가장 비싼 도서의 이름을 보이시오.
-- select bookname from Book where price = (select max(price) from Book);

-- 3-28. 가장 비싼 도서의 이름을 보이시오.
-- select bookname from Book where price = (select max(price) from Book);

-- 3-29. 도서를 구매한 적이 있는 고객의 이름을 검색하시오.
-- select name from Customer where custid in (select custid from Orders);

-- 3-29. 도서를 구매한 적이 있는 고객의 이름을 검색하시오.
-- select name from Customer where custid in (select custid from Orders);

-- 3-30. 대한미디어에서 출판한 도서를 구매한 고객의 이름을 보이시오.
-- select name from Customer where custid in (select custid from Orders where bookid in (select bookid from Book where publisher like '대한미디어'));

-- 3-30. 대한미디어에서 출판한 도서를 구매한 고객의 이름을 보이시오.
-- select name from Customer where custid in (select custid from Orders where bookid in (select bookid from Book where publisher like '대한미디어'));

-- 3-31. 출판사별로 출판사의 평균 도서 가격보다 비싼 도서를 구하시오.
-- select b1.bookname from Book b1 where b1.price > (select avg(b2.price) from Book b2 where b2.publisher = b1.publisher);

-- 3-31. 출판사별로 출판사의 평균 도서 가격보다 비싼 도서를 구하시오.
-- select b1.bookname from Book b1 where b1.price > (select avg(b2.price) from Book b2 where b2.publisher = b1.publisher);

-- 3-32. 대한민국에서 거주하는 고객의 이름과 도서를 주문한 고객의 이름을 보이시오.
-- select name from Customer where address like '대한민국%' union select name from Customer where custid in (select custid from Orders);

-- 3-32. 대한민국에서 거주하는 고객의 이름과 도서를 주문한 고객의 이름을 보이시오.
-- select name from Customer where address like '대한민국%' union select name from Customer where custid in (select custid from Orders);

-- 3-33. 주문이 있는 고객의 이름과 주소를 보이시오.
-- select name, address from Customer cs where exists (select * from Orders od where cs.custid = od.custid);

-- 3-33. 주문이 있는 고객의 이름과 주소를 보이시오.
-- select name, address from Customer cs where exists (select * from Orders od where cs.custid = od.custid);

-- 4-1. -78과 +78의 절댓값을 구하시오.
-- select abs(-78), abs(+78);

-- 4-2. 4.875를 소수 첫째 자리까지 반올림한 값을 구하시오.
-- select round(4.875, 1);

-- 4-3. 고객별 평균 주문 금액을 백원 단위로 반올림한 값을 구하시오.
-- select custid, round(avg(saleprice), -2) from Orders group by custid;

-- 4-3. 고객별 평균 주문 금액을 백원 단위로 반올림한 값을 구하시오.
-- select custid, round(sum(saleprice)/count(*), -2) from Orders group by custid;

-- 4-4. 도서제목에 야구가 포함된 도서를 농구로 변경한 후 도서 목록을 보이시오.
-- select replace(bookname, '야구', '농구')bookname from Book;

-- 4-4. 도서제목에 야구가 포함된 도서를 농구로 변경한 후 도서 목록을 보이시오.
-- select replace(bookname, '야구', '농구')bookname from Book;

-- 4-5. 굿스포츠에서 출판한 도서의 제목과 제목의 문자 수, 바이트 수를 보이시오.
-- select bookname, char_length(bookname), length(bookname) from Book where publisher like '굿스포츠';

-- 4-5. 굿스포츠에서 출판한 도서의 제목과 제목의 문자 수, 바이트 수를 보이시오.
-- select bookname, char_length(bookname), length(bookname) from Book where publisher like '굿스포츠';

-- 4-6. 마당서점의 고객 중에서 같은 성을 가진 사람이 몇 명이나 되는지 성별 인원수를 구하시오.
-- select substr(name, 1, 1), count(*) from Customer group by substr(name, 1, 1);

-- 4-6. 마당서점의 고객 중에서 같은 성을 가진 사람이 몇 명이나 되는지 성별 인원수를 구하시오.
-- select substr(name, 1, 1), count(*) from Customer group by substr(name, 1, 1);

-- 4-7. 마당서점은 주문일로부터 10일 후 매출을 확정한다. 각 주문의 확정일자를 구하시오.
-- select orderdate, adddate(orderdate, interval 10 day) from Orders;

-- 4-7. 마당서점은 주문일로부터 10일 후 매출을 확정한다. 각 주문의 확정일자를 구하시오.
-- select orderdate, adddate(orderdate, interval 10 day) from Orders;

-- 4-8. 마당서점이 2014년7월7일에 주문받은 도서의 주문번호, 주문일, 고객번호, 도서번호를 모두 보이시오. 단, 주문일은 '%Y-%m-%d' 형태로 표시한다.
-- select orderid, str_to_date(orderdate, '%Y-%m-%d'), custid, bookid from Orders where orderdate = date_format('20140707', '%Y-%m-%d');