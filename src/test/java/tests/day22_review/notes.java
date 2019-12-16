package tests.day22_review;

public class notes {
    /*
    Today is 12/13/2019
    Review:
        Operations with excel files:
        To connect java code with excel files we use Apache POI library. It's an open source library, means that it's free.
        Since we cannot open excel file without special decoding, we have to use library that can do it for us.
#To open excel file, we need to do few things:
#first of all, open file through FileInputStream
         FileInputStream instream = new FileInputStream("path/to/the/file.xlsx");

#Then, we have to use workbook, to create object of excel file.
        Workbook workbook = WorkbookFactory.create(instream);
         * Creates the appropriate HSSFWorkbook / XSSFWorkbook from the given InputStream.

We use WorkbookFactory, because it can open both type of excel files .xls (old) and .xlsx (new).
    workbook = excel file
# Next step is to open spread sheet, because excel file can have multiple spreadsheets. It's like book can have many pages.
Sheet workSheet = workbook.getSheet("name_off_sheet");
#Then, since excel file it's a table, and table consists of rows and cells, we need open Row first.
Row row = workSheet.getRow(0);
#Every row consists of cells, to get data from row, we need to use Cell
Cell cell = row.getCell(1);
#######################
Because it was my interview question, that's why I started from this.
workbook -> worksheet -> row -> cell
#######################
In test automation, excel files are very popular for storing test data. If we combine excel file with data provider we can do data driven testing. To do so, we have open some file, and return info as 2D array.
We use DataProvider only to execute same test many times with different data sets.
DataProvider is not required to use along with apache poi. It was our tests case, that requires to login many times with different credentials. As many rows in excel spreadsheet, as many times same test will be executed.
java.lang.IllegalArgumentException: Keys to send should be a not null CharSequence
If you are trying to read data from map, and key name is wrong, you will get null.
Then, if you are trying to use sendKeys() with null, you will get:
java.lang.IllegalArgumentException: Keys to send should be a not null CharSequence
#######################################
One of interview questions is:
Tell me about your framework?
- tools that I use
- design patterns (Page Object Model)
- packages that I have
For TestNG we have video, and for cucumber framework we will have later another story. Since in your resume you will have cucumber or protractor or appium as current project, I don't concentrate on testng framework.
###How to create framework from scratch?
IT's all about tools and design patterns that you want to apply.
Tools: Java, Maven, Selenium WebDriver (for mobile it's appium, for angular applications people use Protractor)
Design Patterns: Page Object Model, Singleton Driver
How do you report: as of now, we use extent report
What type of framework would you choose:
Data Driven + Page Object (Modular) = Hybrid framework.
To start:
- We create maven project
- then we create packages like: pages, tests, utilities, db
- add dependencies
- add driver class, browser utils, config reader...
- add configuration.properties file
- create test base and page base classes
- create login page class
- create smoke test.xml file
Everything complex consists of simple things. Don't be scared of big and complex frameworks.
Most popular questions:
Tell me about yourself
Tell me about your project
Tell me about your day-to-day activity
Tell me about your role and responsibilities
Tell me about your framework
Tell me about your team
Tell me about tools that you use
Usually people ask based on your answers
If you don't know answer: Sorry but I didn't have a chance to work with this, but I am willing to learn!!!
I am super quick learner
Positive thinker
Team player
Cross-functional

     */
}
