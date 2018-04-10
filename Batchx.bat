cd E:\Eclipse\SeleniumTestProject
set ProjectPath=E:\Eclipse\SeleniumTestProject
echo %ProjectPath%
set classpath=%ProjectPath%\bin;%ProjectPath%\lib\*
echo %classpath%
java org.testng.TestNG %ProjectPath%\TestNg_Sample.xml