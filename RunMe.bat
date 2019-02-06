set projectlocation = D:\selenium_edureka\MercuryTours
cd %projectlocation%
set classpath = %projectlocation%\bin;%projectlocation%\Jars\*
java org.testng.TestNG %projectlocation%\testng.xml
pause