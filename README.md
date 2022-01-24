# http-auth-spring-angular
Demo app with basic http authentication with Spring Security and Angular

Based on a tutorial here: https://spring.io/guides/tutorials/spring-security-and-angular-js/

And a repo found here: https://github.com/fabio-blanco/spring-boot-angular-security

I'll be setting another app based on this, in a while.

## Notes

Angular 13, Spring Boot 2.6.3

I serve the client side from static files, where the client-app is build with ng build. These security configurations work atm, so basicly could be put to production. Although I wouldnt say the app is secure as it is.

I have two environment variables set globally in the client sides environment.
