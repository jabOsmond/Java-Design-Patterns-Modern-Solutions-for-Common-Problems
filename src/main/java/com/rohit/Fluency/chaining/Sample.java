package com.rohit.Fluency.chaining;

class Mailer{
    public Mailer from(String addr){System.out.println("from..."); return this;}
    public Mailer to(String addr){System.out.println("to..."); return this;}
    public Mailer subject(String subject){System.out.println("subject..."); return this;}
    public Mailer body(String body){System.out.println("body..."); return this;}
    public Mailer send(){System.out.println("send..."); return this;}
}

------->>>>>
import java.util.Collection;
import java.util.List;
import static java.util.Arrays.asList;

public class AVLTreeTest {
    // Other parts of the class...

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return asList(new Object[][] {
            // Test case 0: AVL Tree with nodes [30, 20, 10, 40, 50]
            { 0, List.of(30, 20, 10, 40, 50) },
            
            // Test case 1: AVL Tree with nodes [10, 20, 30, 40, 50]
            { 1, List.of(10, 20, 30, 40, 50) },
            
            // Test case 2: AVL Tree with nodes [50, 40, 30, 20, 10]
            { 2, List.of(50, 40, 30, 20, 10) },
            
            // Test case 3: AVL Tree with nodes [10, 30, 20, 40, 50]
            { 3, List.of(10, 30, 20, 40, 50) }
        });
    }
}



------->>>>>

import java.util.Collection;
import java.util.List;
import static java.util.Arrays.asList;

public class AVLTreeTest {
    // Other parts of the class...

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return asList(new Object[][] {
            // Test case 0: AVL Tree with nodes [30, 20, 10, 40, 50]
            { 0, List.of(30, 20, 10, 40, 50) },
            
            // Test case 1: AVL Tree with nodes [10, 20, 30, 40, 50]
            { 1, List.of(10, 20, 30, 40, 50) },
            
            // Test case 2: AVL Tree with nodes [50, 40, 30, 20, 10]
            { 2, List.of(50, 40, 30, 20, 10) },
            
            // Test case 3: AVL Tree with nodes [10, 30, 20, 40, 50]
            { 3, List.of(10, 30, 20, 40, 50) }
        });
    }
}
------->>>>>
public class Sample {
    public static void main(String[] args) {
    new Mailer()
        .from("anpch@example.com")
        .to("anpch@example.com")
        .subject("test")
        .body("test")
        .send();
    }
}
//Cascade method pattern

