# smtpMail

This is a basic app for sending mail using **gmail oauth credentials**, and  **mailchimp**.

#### Deployment
The following are the steps to deploy the app:
- Create your google oauth authorization credentials using steps from this link 
[Create authorization credentials](https://developers.google.com/identity/protocols/oauth2/web-server#creatingcred)

- Ensure the port in your redirect_uri matches the `socket.port` value in your `application.properties`

- Your `server.port` value should be different from your `socket.port` value. Check my `application.properties` for giude.

- Download the credentials. Rename the file as _`credentials.json`_

- Save the file in your project folder in this part `src/main/resources/credentials.json`

- Start the app.

- From [postman](https://www.postman.com/), make a post to http://localhost:8081/mail/. Change the port to your server.port value.

- Your post should contain the following fields `to, subject, body`

Your `server.port` value should be different from your `socket.port` value. Check my `application.properties` for giude.

