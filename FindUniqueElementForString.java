class FindUniqueElementForString {
    public static void main(String[] args) {
        String[] name= {"Ram","Shyam","Raju","Krishna","Rahul","Krishna","Manoj","Ram",};

        System.out.println("Unique elements are:");

        for (int i = 0; i < name.length; i++) {
            boolean isUnique = true;

            for (int j = 0; j < name.length; j++) {
                // अगर same element मिला और position भी same नहीं है
                if (name[i]==(name[j]) && i != j){
            isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                System.out.println(name[i]);
            }
        }
    }
}
