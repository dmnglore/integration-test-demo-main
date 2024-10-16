# integration-test-demo-main
 sample integration testing codebase using H2 
 
 pull mysql image from  docker and run in docker 
 provide same hostport in optional settings, add environment variable - MYSQL_ROOT_PASSWOD = password
 check in cmd using docker ps- a to confirm database is running successfully.
 open workbench and create new connection with below configuration
 connectionname=craftdb
 hostname=localhost,port=3306
 username=root
 password=password
 
 create a database craftdb -> create database craftdb, use craftdb
 run the test cases
 to open h2 console( make sure contextLoads is enabled in testcase otherwise will not be able to launch h2-console.
  -> localhost:8072/h2-console
  search for log ->2024-10-16T06:44:13.248+05:30  INFO 11112 --- [           main] o.s.b.a.h2.H2ConsoleAutoConfiguration    : H2 console available at '/h2-console'. Database available at 'jdbc:h2:mem:dea90c79-5946-4969-9dc4-c45f3ddfd1f4'
  
  copy jdbc url(jdbc:h2:mem:dea90c79-5946-4969-9dc4-c45f3ddfd1f4') and paste in jdbcurl of h2-console and connect and verify the results
