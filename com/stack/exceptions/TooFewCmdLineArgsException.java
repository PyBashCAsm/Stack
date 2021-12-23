package com.stack.exceptions;

public class TooFewCmdLineArgsException extends CmdLineException {
    public TooFewCmdLineArgsException(){
        super("Stack needs at least 1 arguement to work with");
    }
}
