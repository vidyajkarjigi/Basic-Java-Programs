 class TextBuilder
 {
     String text = " ";

     TextBuilder add(String part)
     {
         text  += part;
         return this;
     }

     public static void main(String[] args) {
         TextBuilder t = new TextBuilder();
         t.add("Hello").add(" ").add("World");
         System.out.println(t.text);
     }

 }
