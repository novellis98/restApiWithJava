package com.example.firstRestApi.user;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.stereotype.Component;



@Component
public class UserDaoService {
private static List<User> users = new ArrayList<>();
private static int usersCount = 0;
static {
	users.add(new User(++usersCount, "Adam", LocalDate.now().minusYears(30)));
	users.add(new User(++usersCount, "Jana", LocalDate.now().minusYears(25)));
	users.add(new User(++usersCount, "Simon", LocalDate.now().minusYears(34)));
}
public List<User> findAll(){
	return users;
}

public User save(User user) {
	user.setId(++usersCount);
	users.add(user);
	return user;
}
public User findOne(int id) {
Predicate<? super User> predicate = user -> user.getId().equals(id); 
return users.stream().filter(predicate).findFirst().orElse(null);
}
public void deleteById(int id) {
Predicate<? super User> predicate = user -> user.getId().equals(id); 
users.removeIf(predicate);
}
}
