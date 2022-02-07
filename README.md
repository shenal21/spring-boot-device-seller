# Spring Boot Device Seller

## EndPoints 

### Sign-Up

````
POST /api/authentication/sign-up HTTP/1.1
Host: localhost:8080
Content-Type: application/json
Content-Length: 76

{
"name":"admin",
"username":"admin",
"password":"admin"
}
````

### Sign-In
````
POST /api/authentication/sign-in HTTP/1.1
Host: localhost:8080
Content-Type: application/json
Content-Length: 53

{
"username":"admin",
"password":"admin"
}
````
### Change- Role 
````
PUT /api/user/change/ADMIN HTTP/1.1
Host: localhost:8080
Authorization: Bearer eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJhZG1pbiIsInJvbGVzIjoiUk9MRV9BRE1JTiIsInVzZXJJZCI6NCwiZXhwIjoxNjQzOTU2NTAwfQ.G2GBmmRcR2nA9_iPEVImgBCYcRZWl5iH-I37Vwph5u0l5L99p9VCjfISexI845RCyRCawltCQvf-0w4yfTK2OQ

````
### Save - Device
````
POST /api/device HTTP/1.1
Host: localhost:8080
Authorization: Bearer eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJhZG1pbiIsInJvbGVzIjoiUk9MRV9BRE1JTiIsInVzZXJJZCI6NCwiZXhwIjoxNjQzOTU2NTAwfQ.G2GBmmRcR2nA9_iPEVImgBCYcRZWl5iH-I37Vwph5u0l5L99p9VCjfISexI845RCyRCawltCQvf-0w4yfTK2OQ
Content-Type: application/json
Content-Length: 104

{
    "name":"device-2",
    "description":"desc-2",
    "price": 2.0,
    "deviceType":"DESKTOP"
}

````
### Get-All-Devices

````
GET /api/device HTTP/1.1
Host: localhost:8080

````
### Delete-Device

````
DELETE /api/device/8 HTTP/1.1
Host: localhost:8080
Authorization: Bearer eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJhZG1pbiIsInJvbGVzIjoiUk9MRV9BRE1JTiIsInVzZXJJZCI6NCwiZXhwIjoxNjQzOTU2NTAwfQ.G2GBmmRcR2nA9_iPEVImgBCYcRZWl5iH-I37Vwph5u0l5L99p9VCjfISexI845RCyRCawltCQvf-0w4yfTK2OQ
````
### Save-Purchase
````

POST /api/purchase HTTP/1.1
Host: localhost:8080
Authorization: Bearer eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJhZG1pbiIsInJvbGVzIjoiUk9MRV9BRE1JTiIsInVzZXJJZCI6NCwiZXhwIjoxNjQzOTU2NTAwfQ.G2GBmmRcR2nA9_iPEVImgBCYcRZWl5iH-I37Vwph5u0l5L99p9VCjfISexI845RCyRCawltCQvf-0w4yfTK2OQ

{
    "userId":"4",
    "deviceId":"9",
    "price":"2.0",
    "color":"blue"
}

````

### Get-All-Purchase
````
GET /api/purchase HTTP/1.1
Authorization: Bearer eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJhZG1pbiIsInJvbGVzIjoiUk9MRV9BRE1JTiIsInVzZXJJZCI6NCwiZXhwIjoxNjQzOTU2NTAwfQ.G2GBmmRcR2nA9_iPEVImgBCYcRZWl5iH-I37Vwph5u0l5L99p9VCjfISexI845RCyRCawltCQvf-0w4yfTK2OQ
````