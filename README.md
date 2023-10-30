
# Spring Boot Azure AD Auth Example

This is a sample Spring Boot application that demonstrates how to integrate Azure Active Directory authentication.

## Prerequisites

Before running this application, make sure you have the following:

- Azure AD tenant ID
- Azure AD client ID
- Azure AD client secret

## Configuration

Open the `application.yml` file located in the `src/main/resources` directory and update the following properties:



Replace `<YOUR TENANT ID>`, `<YOUR CLIENT ID>`, and `<YOUR CLIENT SECRET>` with your actual Azure AD credentials.

## Running the Application

To run the application, execute the following command:



The application will start on port 9191. You can access the login page by navigating to `http://localhost:9191/api/login`.

## References

For more information on how to configure Spring Boot with Azure Active Directory, refer to my [blog](https://blog.nashtechglobal.com/secure-your-spring-boot-application-with-azure-active-directory-a-comprehensive-guide/).
