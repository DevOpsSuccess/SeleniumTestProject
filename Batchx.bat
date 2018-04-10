cd E:\Build_Project\SeleniumTestProject
set ProjectPath=E:\Build_Project\SeleniumTestProject
echo %ProjectPath%
set classpath=%ProjectPath%\bin;%ProjectPath%\lib\*
echo %classpath%
java org.testng.TestNG %ProjectPath%\TestNg_Sample.xml