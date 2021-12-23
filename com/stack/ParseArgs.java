package com.stack;

import com.stack.exceptions.TooFewCmdLineArgsException;

public class ParseArgs {
    String[] toParse;
    public ParseArgs(String args[]){
        if (args.length<1)
            throw new TooFewCmdLineArgsException();
        else
            toParse=args;
    }
    public String getArgsForOpt(String opt){
        int index=indexLookup(opt);
        return (index==-1)?null:toParse[++index];
    }
    private int indexLookup(String opt){
        for (int i=0;i<toParse.length;i++){
            if (toParse[i].equals(opt)) return i;
        }
        return -1;
    }
}
