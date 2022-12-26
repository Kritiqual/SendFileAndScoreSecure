# SendFileAndScoreSecure
Đây là repo bài tập lớn của Nhóm 16

# Cài đặt
1. Clone repo này
2. Cài đặt Netbeans IDE
3. Cài đặt SQL Server
- Lưu ý: Hãy sửa lại PASSWORD trong file `nơi-chứa-thư-mục-clone/src/main/java/SFaS/controller/SigninController.java` tương ứng
4. Cài đặt jdbc cho sql server
- Hướng dẫn bật tab Projects:
    > Bấm `Ctrl + 1` hoặc `Windows > Projects`

- Trong tab `Projects`, mục `Dependencies`:
    > Nếu đã có `mssql-jdbc-...jar` thì không cần tiếp tục

- Cài đặt:
    > Trong file `nơi-chứa-thư-mục-clone/pom.xml`:
    >
    > Có thể sửa lại như sau:
    > ```
    > <?xml version="1.0" encoding="UTF-8"?>
    > <project xmlns="http://maven.apache.org/POM/4.0.0"
    >     xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
    >     xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
    >     <modelVersion>4.0.0</modelVersion>
    >     <groupId>n10.SFaS</groupId>
    >     <artifactId>SendFileAndScoreSecure</artifactId>
    >     <version>1.0-SNAPSHOT</version>
    >     <packaging>jar</packaging>
    >     <dependencies>
    >         <dependency>
    >             <groupId>com.microsoft.sqlserver</groupId>
    >             <artifactId>mssql-jdbc</artifactId>
    >             <version>11.2.1.jre18</version>
    >         </dependency>
    >     </dependencies>
    >     <properties>
    >         <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
    >         <maven.compiler.source>19</maven.compiler.source>
    >         <maven.compiler.target>19</maven.compiler.target>
    >         <exec.mainClass>SFaS.SendFileAndScoreSecure</exec.mainClass>
    >     </properties>
    > </project>
    > ```
    >
    > Chuột phải vào `mssql-jdbc-...jar` > Chọn `Manually install artifacts` > Bấm vào `Browse` > Tìm dến `nơi-chứa-thư-mục-clone/lib` > Chọn file `mssql-jdbc-...jar` > Chọn `Install locally`

- Chạy chương trình:
    > Bấm 'F6'
