package com.codedifferently;


public class BandManager {
    private final WuMember[] wuMemberArray;

    public BandManager(WuMember[] wuMemberArray) {
        this.wuMemberArray = wuMemberArray;
    }

    public String whileLoop() {
        String result = "";
        // create a `counter`
        int counter = 0;
        while (counter < wuMemberArray.length) {
            result += wuMemberArray[counter].toString();
            counter++;
        }

        return result;
    }



    public String forLoop() {
        String result = "";
        for (int x = 0; x < wuMemberArray.length; x++) {
            result += wuMemberArray[x].toString();
        }

                // use `counter` to identify the `current Person` in the array
                // get `string Representation` of `currentPerson`
                // append `stringRepresentation` to `result` variable
            // end loop

        return result;
    }



    public String forEachLoop() {
        String result = "";

        for (WuMember wuMember : wuMemberArray){
            result += wuMember.toString();
        }

        // identify array's type
        // identify array's variable-name

        // use the above discoveries to declare for-each-loop signature
            // begin loop
                // get `string Representation` of `currentPerson`
                // append `stringRepresentation` to `result` variable
            // end loop

        return result;
    }


    public WuMember[] getwuMemberArray() {
        return wuMemberArray;
    }
}
