package net.focik.addresses.domain.exceptions;

public class AddressDoesNotExistException extends ObjectDoesNotExistException{
    public AddressDoesNotExistException(Long id) {
        super("Address with id = " + id + " does not exist");
    }
}
