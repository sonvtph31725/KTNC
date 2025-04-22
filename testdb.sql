create
database testDB;

use
testDB;


create table KhachHang
(
    maKhachHang int not null identity(1,1) primary key,
    hoVaTenLot  nvarchar(50) not null,
    Ten         nvarchar(50) not null,
    diaChi      nvarchar(255),
    Email       varchar(50),
    dienThoai   varchar(10)
);

create table SanPham
(
    maSanPham int   not null identity(1,1) primary key,
    moTa      nvarchar(255),
    soLuong   int   not null,
    donGia    money not null,
    tenSP     nvarchar(50) not null
);

create table HoaDon
(
    maHoaDon    int not null identity(1,1) primary key,
    ngayMuaHang date,
    maKhachHang int,
    trangThai   nvarchar
);

create table HoaDonChiTiet
(
    maHoaDonChiTiet int not null identity(1,1) primary key,
    maHoaDon        int,
    maSanPham       int,
    soLuong         int
);

create table testbang
(
    ma  int identity(1,1) primary key not null,
    ten char not null,
);

-- Insert data into KhachHang
INSERT INTO KhachHang (hoVaTenLot, Ten, diaChi, Email, dienThoai)
VALUES (N'Nguyễn Văn', N'A', N'123 Lê Lợi, Hà Nội', 'nguyenvana@gmail.com', '0901234567'),
       (N'Trần Thị', N'B', N'456 Trần Hưng Đạo, TP.HCM', 'tranthib@gmail.com', '0912345678'),
       (N'Phạm Công', N'C', N'789 Lý Thường Kiệt, Đà Nẵng', 'phamcongc@gmail.com', '0923456789'),
       (N'Lê Thị', N'D', N'101 Nguyễn Huệ, Cần Thơ', 'lethid@gmail.com', '0934567890'),
       (N'Hoàng Văn', N'E', N'202 Hai Bà Trưng, Huế', 'hoangvane@gmail.com', '0945678901');

-- Insert data into SanPham
INSERT INTO SanPham (moTa, soLuong, donGia, tenSP)
VALUES (N'Sản phẩm A', 100, 50000, N'Sản phẩm A'),
       (N'Sản phẩm B', 200, 60000, N'Sản phẩm B'),
       (N'Sản phẩm C', 150, 70000, N'Sản phẩm C'),
       (N'Sản phẩm D', 300, 80000, N'Sản phẩm D'),
       (N'Sản phẩm E', 250, 90000, N'Sản phẩm E');

-- Insert data into HoaDon
INSERT INTO HoaDon (ngayMuaHang, maKhachHang, trangThai)
VALUES ('2024-01-01', 1, N'Chờ xử lý'),
       ('2024-02-01', 2, N'Đã xử lý'),
       ('2024-03-01', 3, N'Hoàn thành'),
       ('2024-04-01', 4, N'Hủy bỏ'),
       ('2024-05-01', 5, N'Chờ xử lý');

-- Insert data into HoaDonChiTiet
INSERT INTO HoaDonChiTiet (maHoaDon, maSanPham, soLuong)
VALUES (1, 1, 2),
       (2, 2, 3),
       (3, 3, 1),
       (4, 4, 5),
       (5, 5, 4);

-- Insert data into testbang
INSERT INTO testbang (ten)
VALUES ('A'),
       ('B'),
       ('C'),
       ('D'),
       ('E');


SELECT *
FROM SanPham
--chọn tất trong bảng--
--HIỂN THỊ MÃ VÀ MÔ TẢ , TÊN SẢN PHẨM
SELECT maSanPham, moTa, tenSP
FROM SanPham --chọn dữ liệu từ bảng

SELECT Ten, dienThoai, diaChi, Email
FROM KhachHang

SELECT Ten AS 'Họ và tên', dienThoai AS 'DẾ'
FROM KhachHang

--
SELECT DISTINCT moTa
FROM SanPham

SELECT TOP 2 *
FROM KhachHang

SELECT *
FROM SanPham
WHERE moTa = N'Còn hàng'

SELECT *
FROM SanPham
WHERE maSanPham = 10

SELECT *
FROM SanPham
WHERE soLuong = 100
  and moTa = N'Còn hàng'

--DÙNG LIKE 

--VD: hiển thị dữ liệu nhân viên có tên bắt đầu là S

SELECT Ten
FROM KhachHang
WHERE Ten LIKE 'S%' USE testDB

alter table KhachHang
    add TenNV NVARCHAR(50)

SELECT Ten
from KhachHang
WHERE Ten LIKE '___G%'

SELECT dienThoai
FROM KhachHang
WHERE dienThoai LIKE '12%'

SELECT Ten
FROM KhachHang
WHERE Ten LIKE N'sơn%'

SELECT *
from KhachHang
WHERE hoVaTenLot IN (N'LÊ V?N', N'SƠN', N'THÁI BÌNH', 'SONLE@GMAIL.COM', '123456793');

SELECT *
from KhachHang
WHERE hoVaTenLot IN (N'VŨ THÀNH', N'SƠN', N'THÁI BÌNH', 'SONVTPH31725@GMAIL.COM', '0877777777');

SELECT COUNT(Ten)
from KhachHang
where Ten = N'SÁNG'

SELECT *
from USE COM2012_KieuMai
---------------------------------------------------

SELECT COUNT(*) 'SỐ LƯỢNG'
FROM NHANVIEN
WHERE GIOITINH = 'NỮ'
  AND IDCV IN (SELECT ID FROM CHUCVU WHERE TEN = N'Nguyễn Văn A')


---------------------------------------------------

    USE LAB05

select *
from HoaDonChiTiet
SELECT COUNT(DISTINCT maSanPham)
FROM HoaDonChiTiet
GROUP BY maHoaDon
ORDER BY COUNT(DISTINCT maSanPham) ASC


SELECT (KH.hoVaTenLot + ' ' + Ten)   AS HOVATEN,
       Email,
       dienThoai,
       maHoaDon,
       trangThai,
       SUM(sp.DONGIA * HDCT.soLuong) AS TONGTIEN
FROM KhachHang KH
         JOIN HoaDon HD ON KH.maKhachHang = HD.maKhachHang
         JOIN HoaDonChiTiet HDCT ON HD.maHoaDon = HDCT.maHoaDon
         JOIN SanPham SP ON HDCT.maSanPham = SP.maSanPham
WHERE trangThai = N'Chưa thanh toán'
group by KH.hoVaTenLot, Email, dienThoai, HD.maHoaDon, trangThai,
         USE LABso5

SELECT (KH.hoVaTenLot + '' + Ten)    AS HOVATEN,
       Email,
       dienThoai,
       HD.maHoaDon,
       trangThai,
       SUM(sp.DONGIA * HDCT.soLuong) AS TONGTIEN
FROM KhachHang KH
         JOIN HoaDon HD ON KH.maKhachHang = HD.maKhachHang
         JOIN HoaDonChiTiet HDCT ON HD.maHoaDon = HDCT.maHoaDon
         JOIN SanPham SP ON HDCT.maSanPham = SP.maSanPham
WHERE trangThai = N'Chưa thanh toán'
group by KH.hoVaTenLot, Email, dienThoai, HD.maHoaDon, trangThai;

SELECT *
FROM KhachHang
WHERE maKhachHang NOT IN (
    SELECT DISTINCT MAHOADON
    FROM HoaDon
    WHERE YEAR (ngayMuaHang) >= 2016
    )

SELECT *
FROM HoaDon HD
         JOIN KhachHang KH ON KH.maKhachHang = HD.maKhachHang

SELECT HDCT.maSanPham, tenSP, SUM(HDCT.soLuong)
FROM HoaDonChiTiet HDCT
         JOIN HoaDon HD ON HDCT.maHoaDon = HD.maHoaDon
         JOIN SanPham SP ON SP.maSanPham = HDCT.maSanPham
WHERE YEAR (ngayMuaHang) = 2016 AND MONTH (ngayMuaHang) = 12
GROUP BY HDCT.maSanPham, tenSP
ORDER BY SUM (HDCT.soLuong) DESC


SELECT TOP 5
    KH.maKhachHang,
       KH.hoVaTenLot + ' ' + KH.Ten  AS HoTen,
       SUM(SP.donGia * HDCT.soLuong) AS TongSoTien
FROM KhachHang KH
         INNER JOIN HoaDon HD ON KH.maKhachHang = HD.maKhachHang
         INNER JOIN HoaDonChiTiet HDCT ON HD.maHoaDon = HDCT.maHoaDon
         INNER JOIN SanPham SP ON HDCT.maSanPham = SP.maSanPham
WHERE
    YEAR (HD.ngayMuaHang) = 2016
GROUP BY
    KH.maKhachHang,
    KH.hoVaTenLot,
    KH.Ten
ORDER BY
    TongSoTien DESC;

WITH AveragePurchase AS (
    SELECT AVG(TotalQuantity) AS AvgQuantity
    FROM (
             SELECT SP.maSanPham, SUM(HDCT.soLuong) AS TotalQuantity
             FROM SanPham SP
                      INNER JOIN HoaDonChiTiet HDCT ON SP.maSanPham = HDCT.maSanPham
             GROUP BY SP.maSanPham
         ) AS SubQuery
),
     ProductPurchase AS (
         SELECT SP.tenSP, SUM(HDCT.soLuong) AS TotalQuantity
         FROM SanPham SP
                  INNER JOIN HoaDonChiTiet HDCT ON SP.maSanPham = HDCT.maSanPham
         GROUP BY SP.tenSP
     )
SELECT PP.tenSP, PP.TotalQuantity
FROM ProductPurchase PP,
     AveragePurchase AP
WHERE PP.TotalQuantity < AP.AvgQuantity;

select SP.tenSP, SUM(HDCT.soLuong)
from HoaDonChiTiet HDCT
         JOIN SanPham SP ON SP.maSanPham = HDCT.maSanPham
GROUP BY


