class Reverse{
     

    public void reverse(String a){

        char text[] = a.toCharArray();
        int length = 0;

        for (int i = 0; i < text.length; i++) {
            length++;
        }

        char b[] = new char[length] ; //stack
        int blength = b.length;

        
        for (int i = 0; i < blength; i++) {
            b[i] = text[i];
                                //enque
        }

        for (int j = blength-1; j >=0 ; j--) {
            char temp = b[j];
            System.out.print(temp); //deque
        }
            
    }
    public static void main(String[] args) {
        Reverse ob = new Reverse();
        ob.reverse("6501245");
    }
}