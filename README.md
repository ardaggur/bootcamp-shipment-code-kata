### Shipment Code Kata

We have a shipment application that decides what the shipment size should be on basket. There are products on a basket, and each has a shipment size such as **SMALL**, **MEDIUM**, **LARGE** and **X_LARGE**.\
The rule is that you should determine the basket shipment size depending on how many products you have in which shipment size on your basket.

### Rules
* You have a threshold value while determining the basket shipment size, **it's three**, which means if all the products of three or more have the same shipment size, then you should specify the basket size as one upper shipment size.
* If the count of the products on the basket is less than three, you should determine the basket shipment size as the largest one among them.
* If the count of the products on the basket is more than three and you don't have three of the same shipment size, you should determine the basket shipment size as the largest one among them.
* If the count of the products on the basket is three or more and all of them are **X_LARGE**, you should determine the basket shipment size as **X_LARGE**.

### Shipment Sizes
| Types |
| ---------- |
| SMALL      |
| MEDIUM     |
| LARGE      |
| X_LARGE    |

### Examples
| Product | Product | Product | Product | Product | Basket |
| ------- | ------- | ------- | ------- | ------- | ------ |
| SMALL   | SMALL   |         |         |         | SMALL  |
| SMALL   | SMALL   | SMALL   |         |         | MEDIUM |
| SMALL   | SMALL   | MEDIUM  |         |         | MEDIUM |
| SMALL   | SMALL   | LARGE   |         |         | LARGE  |
| SMALL   | SMALL   | SMALL   | SMALL   |         | MEDIUM |
| SMALL   | SMALL   | SMALL   | LARGE   |         | MEDIUM |
| SMALL   | SMALL   | SMALL   | SMALL   | SMALL   | MEDIUM |
| SMALL   | SMALL   | MEDIUM  | MEDIUM  | LARGE   | LARGE  |
| SMALL   | MEDIUM  |         |         |         | MEDIUM |
| SMALL   | MEDIUM  | MEDIUM  |         |         | MEDIUM |
| MEDIUM  | MEDIUM  |         |         |         | MEDIUM |
| MEDIUM  | MEDIUM  | MEDIUM  |         |         | LARGE  |
| MEDIUM  | MEDIUM  | MEDIUM  | MEDIUM  |         | LARGE  |
| MEDIUM  | LARGE   |         |         |         | LARGE  |
| MEDIUM  | MEDIUM  | LARGE   |         |         | LARGE  |
| MEDIUM  | LARGE   | LARGE   |         |         | LARGE  |
| X_LARGE | X_LARGE | X_LARGE |         |         | X_LARGE|
| LARGE   | LARGE   | LARGE   |         |         | X_LARGE|

### Expectation
We have written all the test cases above in the project. We would like you to write just the production code.\
**Pay attention to the code is understandable and expandable easily while writing it**, good luck coders :blush:

### Tech Stack
 * Java 11
 * Gradle
 * jUnit5 and Mockito
