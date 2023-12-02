class AutoboxingUnboxing {
    public static void main(String[] args) {
        // Autoboxing: int to Integer
        int primitiveInt = 42;
        Integer wrappedInt = primitiveInt;

        // Autoboxing: Integer to String
        Integer integerObj = 123;
        String strFromInteger = integerObj.toString();

        // String to int (unboxing)
        String str = "456";
        int intFromString = Integer.parseInt(str);

        // int to String (boxing)
        int intToBox = 789;
        String strFromInt = Integer.toString(intToBox);

        // Unboxing: Integer to int
        Integer wrapped = 1000;
        int unwrapped = wrapped;

        // Print the results
        System.out.println("Autoboxing: int to Integer: " + wrappedInt);
        System.out.println("Autoboxing: Integer to String: " + strFromInteger);
        System.out.println("String to int (unboxing): " + intFromString);
        System.out.println("int to String (boxing): " + strFromInt);
        System.out.println("Unboxing: Integer to int: " + unwrapped);
    }
}
