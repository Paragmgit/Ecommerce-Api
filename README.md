# Ecommerce-Api
* This project store the data of user ecommerse website system 
## Framwork and Language use in this Project
* Springboot 
* java
## Dependencies
* Spring Web
* h2 Database
* hibernate
* lombok
* jpa
* spring dev tools 
## Flow of project
* Create three layers model , service , controller, repository.
* In model layer create four classes first one is user class second product class third address class fourth one is order class .
* In controller layer to performe CRUD operatiom by http request.
* In service layer write a business logic of CRUD operation.
* In repository layer exteds jpsRepositor.
## Constraints:
* user model will have-
* UserId
* username
* email
* password
* phoneNumber
* product model will have-
* productId
* name
* price
* description
* category
* brand
* address model will have-
* addressId
* addressname
* landmark
* phoneNo
* zipcode
* state
* userId forgin key mapping
* order model will have-
* orderId
* userid forignkey mapping
* productid forignkey mapping
* addressid forignkey mapping
* productQuntity
## Endpoints to provided :
* get order by id
* get order by productid
* delete product by id
* Get all product
* Get product base on category
