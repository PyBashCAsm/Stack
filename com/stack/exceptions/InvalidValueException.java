package com.stack.exceptions;

public class InvalidValueException extends SyntaxException {
    public InvalidValueException(String val,String ins){
        super(val+" is not a valid argument for the Instruction "+ins);
    }
}
