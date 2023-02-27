package vasilkov.lab1.controller;



import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.tomcat.util.net.openssl.ciphers.Authentication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import vasilkov.lab1.controller.authenticationHttpMes.AuthenticationRequest;
import vasilkov.lab1.controller.authenticationHttpMes.AuthenticationResponse;
import vasilkov.lab1.entity.UserEntity;
import vasilkov.lab1.exeption.UserAlreadyExistException;
import vasilkov.lab1.service.AuthenticationService;
import vasilkov.lab1.service.UserService;

@Slf4j
@RestController
@RequestMapping("/api/v1/auth")
@RequiredArgsConstructor
public class AutheticationController {

    @Autowired
    private UserService userService;

    private final AuthenticationService service;

    @PostMapping("/registration")
    public ResponseEntity<AuthenticationResponse> register(@RequestBody RegisterRequest request){
        //todo переписать
        return ResponseEntity.ok(service.register(request));
    }
    @PostMapping("/authenticate")
    public ResponseEntity<AuthenticationResponse> register(@RequestBody AuthenticationRequest request){
        //todo переписать
        return ResponseEntity.ok(service.authenticate(request));
    }


    @PostMapping("/singup")
    public ResponseEntity<?> registrationUser(@RequestBody UserEntity user){
        try{
            userService.registration(user);
            return ResponseEntity.ok("Пользователь успешно добавлен");
        } catch (UserAlreadyExistException e){
            return ResponseEntity.badRequest().body(e.getMessage());
        } catch (Exception e){
            return ResponseEntity.badRequest().body("Произошла ошибка");
        }
    }

    @GetMapping("/singin")
    public ResponseEntity<?> loginInUser(){
        try{
            return ResponseEntity.ok("200");
        } catch (Exception e){
            return ResponseEntity.badRequest().body("500");
        }
    }

    @PostMapping("/logout")
    public ResponseEntity<?> logoutUser() {

        return ResponseEntity.ok("Log out successful!");
    }

}
