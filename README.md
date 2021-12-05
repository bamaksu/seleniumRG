Untuk test case automation website Ruang Guru Saya menggunakan selenium webdriver.

Tools yg sy gunakan:
- Inteliij
- Selenium
- chromedriver
- Maven

Berikut Langkah Pengerjaannya
1. Buat Project baru menggunakan Inteliij lalu pilih maven.
![image](https://user-images.githubusercontent.com/93593694/144734113-88efc91e-3a88-4542-bb8d-fbe5c048ebc1.png)

2. Buka pom.xml. nya lalu tambahkan dependencynya yg kita butuhkan untuk test, sourcenya bisa diambil di websitenya maven repository
![image](https://user-images.githubusercontent.com/93593694/144734475-05db7ef5-8c46-44d3-91f6-0493a85b3a07.png)

3. Download chromdriver sesuai versi browser chrome yg sudah kita install
4. Buat Package baru di src/test/java berinama "driver"
5. copy dan paste chromedriver yg sudah di download di paste ke package yg sudah diberinama "driver"
6. Buat package satu lg di src/test/java dan berinama "testRun"
7. Buat Java class di package "testRun" dan berinama "search.java" sesuai case yg akan kita test
8. untuk automationnya sciptnya sy menggunakan seleniumwebdriver untuk menjalankan scenario testcase searchnya
9. Berikut scrip nya
<img width="1059" alt="Screenshot at Dec 05 12-47-19" src="https://user-images.githubusercontent.com/93593694/144735681-43ec86e3-3702-47a0-96c7-3cad26e441aa.png">
10. Di comment sudah ada keterangan, script ini untuk apa saja.
11. Run Secenario test nya
12. Selesai
