# Pdf-Generator
Generates pdf based on a given format below.

Basic Payload:<br/>
```
{
  "seller": "XYZ Pvt. Ltd.",
  "sellerGstin": "29AABBCCDD121ZD",
  "sellerAddress": "New Delhi, India",
  "buyer": "Vedant Computers",
  "buyerGstin": "29AABBCCDD131ZD",
  "buyerAddress": "New Delhi, India",
  "items": [
    {
    "name": "Product 1",
    "quantity": "12 Nos",
    "rate": 123.00,
    "amount": 1476.00
    }
   ]
}

```

Uses Flying Saucer to generate pdf dynamically and saves it to the location as given in application.properties by default it is set to **D drive**.<br/>

I did my best for doing frontend but the output came different below are the sucessfull tested endpoints and response.<br/>
<hr/>

**RestEndpoints:** localhost:8080/ both for get and post(with post please send the requested body)
![Screenshot (466)](https://user-images.githubusercontent.com/96864350/222975160-2123abb8-b254-4fe6-8a90-07ce4ff3843a.png)

The output is the bill and also it gets saved at your default location the bill is as shown below.
![Screenshot (467)](https://user-images.githubusercontent.com/96864350/222975291-ce64ea10-57a7-41ce-ac6c-74dcf1383290.png)
