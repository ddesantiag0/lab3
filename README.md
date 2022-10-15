# Lab3

```
Part 1:
```


     import java.io.IOException;
     import java.net.URI;
     import java.util.ArrayList;
     import java.util.Arrays;

      class Handler implements URLHandler {
        // The one bit of state on the server: a number that will be manipulated by
        // various requests.
        ArrayList<String> words = new ArrayList<String>();
        ArrayList<String> lookup = new ArrayList<String>();

        public String handleRequest(URI url) {
  
           words.clear();
           lookup.clear();

           if (url.getPath().equals("/")) {
               return String.format("Search Engine Activated");

            } else {
               System.out.println("Path: " + url.getPath());
               if (url.getPath().contains("/add")) {
                    String[] parameters = url.getQuery().split("=");
                    words.add(parameters[1]);
                       return String.format("Word added", parameters[1]);

               }
               if (url.getPath().contains("/search")) {
                 String[] parameters = url.getQuery().split("=");

                     for (int i = 0; i < words.size(); i++) {
                         if (words.get(i).contains(parameters[1])) {
                            lookup.add(words.get(i));
                         }
                      }
                      return String.format(Arrays.toString(lookup.toArray()));

                 }
              }
              return "404 Not Found!";
           }
       }


        class SearchEngine {
           public static void main(String[] args) throws IOException {
               if(args.length == 0){
               System.out.println("Missing port number, try any number between 1024 to 49151");
               return;
            }
            int val = Integer.parseInt(args[0]);
          Server.start(val, new Handler());
       }
     }

Which methods in your code are called
What the values of the relevant arguments to those methods are, and the values of any relevant fields of the class
If those values change, how they change by the time the request is done processing

![Image](./LAB3REPORT2.png)


In this screenshot, I have the server being started giving us the link, "http://localhost:5069" in the terminal. The first method in my code that is being called is handleRequest and the argument "URI url". The url is the localhost:5069 link that was provided in the terminal. This particular screenshot was made when it was reading the line, and determining if there is the "/" it will print out "Search Engine Activated". The link is empty and doesn't have anything but the server with the server number I had chosen in the terminal. If the URL link were to change values, like "/add?s" or "/search?s" it would create different outputs depending on the input, in less than seconds.

![Image](./
