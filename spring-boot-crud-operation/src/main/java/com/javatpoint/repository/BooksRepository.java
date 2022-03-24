package com.javatpoint.repository;
//repository that extends CrudRepository
import org.springframework.data.mongodb.repository.MongoRepository;
import com.javatpoint.model.Books;
public interface BooksRepository extends MongoRepository<Books, Integer>
{
}


 
 