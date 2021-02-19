package net.focik.addresses.domain.exceptions;

public class AddressDoesNotExistException extends ObjectDoesNotExistException{
    public AddressDoesNotExistException(Integer id) {
        super("Address with id = " + id + " does not exist");
    }
}
