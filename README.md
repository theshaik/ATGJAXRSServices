# ATGJAXRSServices

A demo ATG Module to create ATG JAX-RS endpoints.
The module contains:
1. Java code and configuration to create end point
2. Build scripts to create jersey class loader
3. Swagger documentation
4. Configuration to define api context-rott

##Building the module
Execute the ant script build target.
It will compile and build the module under <ATG-dir>

## Deploy the module
Create the ear file using runAssembler command

````
runAssembler -jboss ATGJAXRSServices.ear -m ATGJAXRSServices
````
Deploy the ear on any jboss, weblogic or websphere application server. The assumption is atg db and datasource configurations are set.

##Accessing the end points
http://localhost:8080/api/v1/demo/users/123

## Swagger documentation
http://localhost:8080/api/swagger/index.html

## Details about creating the end point
http://shaik-tech.blogspot.com/2018/05/atg-jax-rs-creating-end-point.html
