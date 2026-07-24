# OAuthExample

A basic example project demonstrating **Google OAuth 2.0 login** using Spring Boot and Spring Security. Built as a learning/reference project — pushed and committed via IntelliJ IDEA.

## Tech Stack

- **Java 17**
- **Spring Boot 4.1.0**
- **Spring Security OAuth2 Client** (`spring-boot-starter-security-oauth2-client`)
- **Spring Web MVC** (`spring-boot-starter-webmvc`)
- **Maven** (with Maven Wrapper)

## Project Structure

```
OAuthExample/
├── .mvn/wrapper/        # Maven wrapper files
├── src/
│   └── main/
│       ├── java/...     # Application source (includes HelloController)
│       └── resources/   # application.properties / templates
├── mvnw / mvnw.cmd       # Maven wrapper scripts
└── pom.xml
```

## Prerequisites

- JDK 17+
- A Google Cloud project with OAuth 2.0 credentials (Client ID & Client Secret)

## Google OAuth Setup

1. Go to the [Google Cloud Console](https://console.cloud.google.com/) → **APIs & Services → Credentials**.
2. Create an **OAuth 2.0 Client ID** (Application type: *Web application*).
3. Add the following as an **Authorized redirect URI**:
   ```
   http://localhost:8080/login/oauth2/code/google
   ```
4. Copy the generated **Client ID** and **Client Secret**.

## Configuration

Add your credentials to `src/main/resources/application.properties`:

```properties
spring.security.oauth2.client.registration.google.client-id=YOUR_GOOGLE_CLIENT_ID
spring.security.oauth2.client.registration.google.client-secret=YOUR_GOOGLE_CLIENT_SECRET
```

> ⚠️ Never commit real client secrets to version control. Consider using environment variables or a `.gitignore`-d properties file for local secrets.

## Running the App

Using the Maven wrapper:

```bash
./mvnw spring-boot:run
```

On Windows:

```bash
mvnw.cmd spring-boot:run
```

The app will start on `http://localhost:8080`. Visiting a protected route will redirect you to Google's login/consent screen; after successful login you'll be redirected back into the app.

## Notes

- This is a **basic/learning example**, not production-ready — no persistence, error handling, or token refresh logic beyond Spring Security's defaults.
- Intended purpose: understand the OAuth2 Authorization Code flow with Google as the provider, using Spring Security's built-in OAuth2 login support.

## License

No license specified — personal learning project.
