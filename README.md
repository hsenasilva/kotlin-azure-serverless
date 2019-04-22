# kotlin-azure-serverless
Sample Kotlin project with maven and Azure Functions

Install Azure CLI

run: az login

mvn clean install

mvn clean kotlin:compile package

mvn azure-functions:run

mvn azure-functions:deploy
