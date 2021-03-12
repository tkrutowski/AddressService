package net.focik.addresses.domain.exceptions;

public class AddressAlreadyExistsException extends ObjectAlreadyExistException {
    public AddressAlreadyExistsException(Long id) {
        super("Address with id: " + id + " already exists.");
    }
}
