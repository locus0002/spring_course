package vlac.sauce.first_assignment.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import vlac.sauce.first_assignment.models.Address;
import vlac.sauce.first_assignment.models.Author;
import vlac.sauce.first_assignment.models.Book;
import vlac.sauce.first_assignment.models.Publisher;
import vlac.sauce.first_assignment.repositories.AddressRepository;
import vlac.sauce.first_assignment.repositories.AuthorRepository;
import vlac.sauce.first_assignment.repositories.BookRepository;
import vlac.sauce.first_assignment.repositories.PublisherRepository;

@Component
public class BootStrapData implements CommandLineRunner {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;
    private final AddressRepository addressRepository;
    private final PublisherRepository publisherRepository;
    
    
    public BootStrapData(AuthorRepository authorRepository, BookRepository bookRepository,
            AddressRepository addressRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.addressRepository = addressRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        
        Author jhon = new Author("Jhon", "Kanzebak");
        Author patrick = new Author("Patrick", "Graham");
        Book ai = new Book("Artificial Intelligence", "123SDF");
        Book cplusplus = new Book("C++ Reference", "67DG");

        Address newAddress = new Address(
            "addres line 1",
            "city",
            "state",
            "07845");
        Publisher newPublisher = new Publisher("Nintendo");
        newPublisher.setAddress(newAddress);
        publisherRepository.save(newPublisher);

        jhon.getBooks().add(ai);
        patrick.getBooks().add(cplusplus);
        ai.getAuthors().add(jhon);
        cplusplus.getAuthors().add(patrick);

        
        newPublisher.getBooks().add(ai);
        ai.setPublisher(newPublisher);

        authorRepository.save(jhon);
        authorRepository.save(patrick);
        bookRepository.save(ai);
        publisherRepository.save(newPublisher);

        newPublisher.getBooks().add(cplusplus);
        cplusplus.setPublisher(newPublisher);
        bookRepository.save(cplusplus);
        publisherRepository.save(newPublisher);

        System.out.println("Number of books: " + bookRepository.count());
        System.out.println("Number of authors: " + authorRepository.count());
        System.out.println("Number of address: " + addressRepository.count());
        System.out.println("Number of publishers: " + publisherRepository.count());
        System.out.println("Books by newpublisher: " + newPublisher.getBooks().size());
        
    }
    
}
