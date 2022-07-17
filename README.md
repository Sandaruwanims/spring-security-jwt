# spring-security-jwt
Authentication and authorization for a spring boot app with jwt

## how to use
1. Sent a http POST request which contains correct username/password in request body to obtain jwt.
```
  http://localhost:8080/authenticate
  
  {
    "username": "test",
    "password": "test123"
  }
```
2. After that to access *http://localhost:8080/hello*, use the received jwt in Authorization header.
   (Add value with Bearer prefix)
```
Authorization: Bearer jwt
```
