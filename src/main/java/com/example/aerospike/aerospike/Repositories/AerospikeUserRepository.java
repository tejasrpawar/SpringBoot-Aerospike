package com.example.aerospike.aerospike.Repositories;

import com.example.aerospike.aerospike.Objects.User;
import org.springframework.data.aerospike.repository.AerospikeRepository;
import org.springframework.data.repository.CrudRepository;

public interface AerospikeUserRepository extends AerospikeRepository<User, Integer>, CrudRepository<User, Integer> {
}