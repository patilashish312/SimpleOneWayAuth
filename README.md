 # SimpleOneWayAuth
 
 This code demonstrate simple one way authentication between client & server.
 
 ### Basic idea: 
 - Server has created public key & shared details (key, password ) with client.
 - In our case, server is simple spring boot application running with port `8083`.
 - Client is simple SOAP UI tool which will call server GET endpoint : `https://localhost:8083/testCurrencies`
 - Server shared `caservercert1.jks` with SOAP UI. 
 - SOAPUI configured `SSL Settings` via `Preference` something like below
 
 ![image](https://user-images.githubusercontent.com/35179165/164501813-3e94d96f-f3f8-4d0d-bb9b-b3517423d6ef.png)
 
 - Once server cert is configured, we can hit exposed endpoint, considering spring boot code is running on `localhost:8083`
 
 ### TO-DO:
 Extend this idea & create another spring boot application which will act as client instead of SOAPUI. 
