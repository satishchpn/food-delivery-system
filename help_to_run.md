# food-delivery-system
Food Delivery System Application based on Spring Boot & Micro Services.

Technlogy and Component Used
----------------------------
1. Java
2. Spring Boot
3. Spring Cloud
4. H2 db is used to store the data
5. Feign Client to communicate between the services
6. Spring Cloud for API Gateway(Single entry point for the application)
7. Spring Cloud for Load Balancing , Circuit Breaker and Fallback Mechanism
8. Spring Cloud Config to keep common properties of the application at one place
9. Swagger is enabled for each of the MicroServices Clinet
10. Git Url is used for Cloud config 



#Steps To Run The Application
===================================
> Download the Repo
> Start Each Services one by one and do the operations


#Registry Server
http://localhost:8761/

#Config Server
http://localhost:9093/

#Gateway Server
http://localhost:8080/

#Restaurant Client
http://localhost:9090/
http://localhost:8080/restaurants/h2-console/
http://localhost:8080/restaurants/swagger-ui.html


#Order Client
http://localhost:9091/
http://localhost:8080/orders/h2-console
http://localhost:8080/orders/swagger-ui.html

#Payment Client
http://localhost:9092/
http://localhost:8080/payments/h2-console
http://localhost:8080/payments/swagger-ui.html


#Steps(Open Swagger of Each service through mentioned URL)
----------------------------------------------------------

1. Add Restaurant data through save API of restaurant-service(Use Sample restaurant.json attached)
2. See Data either through h2-console/findAll API of restaurant-service
3. Place order using above restaurant passing to order-service Place Order API(Use Sample order.json attached)
4. See Order details using findAll API of order-service
5. After success of above API Update the order status through  Process Order Event API of order-service(Use Sample process_order.json attached) passing order      	id of particular order

#Entities Involved & RelationShip
> Restaurant Client
	> Restaurant (Having Restaurant details)
	> MenuItem (Having All the menu details)
	> Restaurant one to many MenuItem

> Order Client
	> Order (Having Order details)
	> OrderItem (Having All the Item details for particular order)
	> OrderEvent(Having Order Event Details for particular order) 
	> Order one to many OrderItem
	

> Restaurant Client
	> Payment (Having Payment details for particular Order)
	> CardInfo (Having Credit/ Debit Card Details)
	> Payment one to one Card Info
