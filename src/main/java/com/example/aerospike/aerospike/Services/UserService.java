package com.example.aerospike.aerospike.Services;

import com.example.aerospike.aerospike.Objects.User;
import com.example.aerospike.aerospike.Repositories.AerospikeUserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class UserService {

    AerospikeUserRepository aerospikeUserRepository;

    public Optional<User> readUserById(int id) {
        return aerospikeUserRepository.findById(id);
    }

    public void addUser(User user) {
        aerospikeUserRepository.save(user);
    }

    public void removeUserById(int id) {
        aerospikeUserRepository.deleteById(id);
    }

}
