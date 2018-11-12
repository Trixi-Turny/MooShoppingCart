## Shopping cart web service

The web service allows to pretend a shopping cart experience by calling different endpoints to achieve some operations. 

Operations implemented:
 - add item to basket
 - show cart
 - empty cart
 
 
 To run the project via the terminal please ensure you have the following:
  - Maven installed and `mvn -` command shows the maven home and location of java jdk 
  - Java installed and `java -version` command  shows version of java
  
  - navigate to root folder of project  - in this case inside directory called `MooShoppingCart`
  - install dependencies via `mvn install`
  
  - create jar file via `mvn package` command. The jar file will be created in `target` folder as `backend-coding-test-0.0.1-SNAPSHOT.jar`
 
  - navigate to `target/` directory
  - run jar file via `java -jar backend-coding-test-0.0.1-SNAPSHOT.jar`
  
   - you should see the server starting on localhost:4567 
   
   - you can test the application by calling: 
   `http://localhost:4567/cart/` - to see current contents of cart
   `http://localhost:4567/cart/<stringOfYourChoice>` e.g: http://localhost:4567/cart/124 - to add item to cart  - it should return the cart contents every time a new item is added
   `http://localhost:4567/empty/` - to clear the cart - and see the empty cart
   
   #Architecture
   
   The architecture has been very slightly extended to cater for an Item object or a list of Item objects that the cart can hold. 
   In a real life scenario this could be further extended with interfaces, abstract classes and so on as appropriate.
   
   Basic test cases has been written to test fundamental functionlity within the Models. 
   
   Tests could be extended to mock the endpoints and test the responses. 
   
  
   
   
   
   
   