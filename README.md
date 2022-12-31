# SendFileAndScoreSecure
Đây là repo bài tập lớn của Nhóm 16

# Cài đặt môi trường
1. Clone hoặc tải xuống repo này, có thể tải xuống thư mục Downloads

2. Cài đặt:
- [JDK](https://download.oracle.com/java/19/latest/jdk-19_windows-x64_bin.exe)
- [Netbeans IDE](https://netbeans.apache.org/download/nb16/index.html)
- [SQL Server](https://learn.microsoft.com/en-us/sql/database-engine/install-windows/install-sql-server?view=sql-server-ver16)

3. Mở project bằng Netbeans
- Ngay khi mở projects lên thông thường sẽ có sẵn mssql-jdbc
    > Kiểm tra trong tab Projects (bấm `Ctrl + 1`) > trong mục Dependencies > Có file mssql-...jar là oke
- Sửa lại PASSWORD trong file SigninController.java bằng password vừa tạo từ bước 2

3. Nếu chưa có, cài đặt jdbc cho sql server:
- Chuột phải mục Dependencies > Chọn `Download Declared Dependencies`

4. Chạy chương trình:
- Khởi chạy SQL Server và chay file SFaS.sql
- Chạy project
    > Run > Run project
