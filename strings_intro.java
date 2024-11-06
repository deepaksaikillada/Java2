package com.company;

public class strings_intro {
    public static void main(String[] args){
        String s="I love Java"; //for single line sentence we stored it in double quotes " ";
        System.out.println(s);
        //
        System.out.println(s.charAt(2));  //prints l
        System.out.println(s.charAt(1));  //prints empty space
        System.out.println(s.charAt(7));  //prints J


        //for multiple line sentences like paragraphs we store it in triple quotes or(triple double inverted commas)
        // """ """
        String s1= """
                Java is a multi-platform, object-oriented, and network-centric language that can be used as a platform in itself. 
                It is a fast, secure, reliable programming language for coding everything from 
                mobile apps and enterprise software to big data applications and server-side technologies
                """;
        System.out.println(s1);
        //
        /* below s2 contains full info of Java*/
        String s2= """
                What is Java?
                Java is a widely-used programming language for coding web applications. It has been a popular choice among developers for over two decades, with millions of Java applications in use today. Java is a multi-platform, object-oriented, and network-centric language that can be used as a platform in itself. It is a fast, secure, reliable programming language for coding everything from mobile apps and enterprise software to big data applications and server-side technologies.
                                
                What is Java programming language used for?
                What is Java programming language used for?\s
                Because Java is a free-to-use and a versatile language, it builds localized and distributed software. Some common uses of Java include:
                                
                1.     Game Development
                Many popular mobile, computer, and video games are built in Java. Even modern games that integrate advanced technology like machine learning or virtual reality are built with Java technology.
                                
                2.     Cloud computing
                Java is often referred to as WORA – Write Once and Run Anywhere, making it perfect for decentralized cloud-based applications. Cloud providers choose Java language to run programs on a wide range of underlying platforms.
                                
                3.     Big Data
                Java is used for data processing engines that can work with complex data sets and massive amounts of real-time data.
                                
                4.     Artificial Intelligence
                Java is a powerhouse of machine learning libraries. Its stability and speed make it perfect for artificial intelligence application development like natural language processing and deep learning.
                                
                5.     Internet of Things
                Java has been used to program sensors and hardware in edge devices that can connect independently to the internet.
                                
                Why is Java such a popular choice among modern-day software developers?
                Java is popular because it has been designed for ease of use. Some reasons developers continue to choose Java over other programming languages include:
                                
                High quality learning resources
                Java has been around for a long time, so many learning resources are available for new programmers. Detailed documentation, comprehensive books, and courses support developers through the learning curve. In addition, beginners can start writing code in Core Java before moving to Advanced Java.
                                
                Inbuilt functions and libraries
                When using Java, developers don’t need to write every new function from scratch. Instead, Java provides a rich ecosystem of in-built functions and libraries to develop a range of applications.\s
                                
                Active community support
                Java has many active users and a community that can support developers when they face coding challenges. The Java platform software is also maintained and updated regularly.
                                
                High-quality development tools
                Java offers various tools to support automated editing, debugging, testing, deployment, and change management. These tools make Java programming time and cost-efficient.
                                
                Platform Independent
                Java code can run on any underlying platform like Windows, Linux, iOS, or Android without rewriting. This makes it especially powerful in today’s environment, where we want to run applications on multiple devices.
                                
                Security
                Users can download untrusted Java code over a network and run it in a secure environment in which it cannot do any harm. Untrusted code cannot infect the host system with a virus nor can it read or write files from the hard drive. The security levels and restrictions in Java are also highly configurable.
                                
                How does Java work?
                All programming languages are a means to communicate with machines. Machine hardware only responds to electronic communication. High-level programming languages like Java act as a bridge between human language and hardware language. To use Java, a developer needs to understand two things:
                                
                1. Java language and APIs
                This is the front-end communication between the developer and the Java platform.
                                
                2. Java Virtual Machine
                This is the back-end communication between the Java platform and the underlying hardware. Let’s look at each of these in detail below.
                                
                What is Java API?
                Java defines the syntax and semantics of the Java programming language. This includes the basic vocabulary and rules used to write algorithms such as primitive data types, if/else blocks, loops, etc.
                                
                APIs are important software components bundled with the Java Platform. These are pre-written Java programs that can plug and play existing functionality into your own code. For example, you could use Java APIs to get the date and time, perform mathematical operations, or manipulate text.\s
                                
                Any Java application code written by a developer will typically combine new and pre-existing code from Java APIs and Java libraries.
                                
                What is Java Virtual Machine?
                The Java Virtual Machine acts as an additional abstraction layer between the Java platform and the underlying machine hardware. Java source code can run only on those machines that have JVM installed on them. The answer to why the Java Virtual Machine is needed lies in the history of programming.
                                
                The history of programming
                When natural programming languages were first developed, they fell into two broad categories, depending on how they communicated with the underlying hardware.
                                
                Compilers: The complete program is written in natural English-like syntax with compilers, and the language then compiles (or translates) the entire code into machine code. The compiled code is then run on the hardware.
                Interpreters: With interpreters, every high-level code statement is interpreted into machine code on the fly.  Written statements are run immediately by the hardware before looking at the next statement.
                The Java runtime environment
                The Java program was the first language to combine both methods above using a Java Virtual Machine (JVM). The Java code compiler is called the Java Virtual Machine. Any Java file is first compiled into bytecode. Java bytecode can only run in the JVM. The JVM then interprets the bytecode to run it on the underlying hardware platform. So if the application is running on a Windows machine, the JVM will interpret it for Windows. But if it is running on an open-source platform like Linux, the JVM will interpret it for Linux.\s
                                
                How to program in Java
                To begin programming in Java, you need to install a Java Edition on your system. There are four main Java editions:\s
                                
                Java Standard Edition (Java SE)
                Java Enterprise Edition (Java EE)
                Java Micro Edition (Java ME)
                What is Java SE?
                Java Standard Edition is the core Java programming platform. It contains all of the libraries and APIs that any programmer needs for java development. Open Java Development Kit(OpenJDK) is the free and open source implementation of Java SE.
                                
                Amazon Corretto is a no cost, multiplatform, production-ready distribution of OpenJDK. It can be used as a drop-in replacement for many Java SE distributions and comes with no-cost, long term support from Amazon. It lets you run the same environment in the cloud, on premises, and on your local machine.
                                
                What is AWS SDK for Java?
                AWS SDK for Java simpliﬁes uses of AWS Services by providing a set of libraries that are consistent and familiar for Java developers. It supports higher-level abstractions for simplified development. AWS-focused open-source Java libraries are available along with code examples and a Java API reference guide.
                                
                The SDK code examples contain Java code examples and real-world use cases for AWS services to help accelerate the development of your applications. In addition, the Java API reference guide describes the API operations for the latest version of the AWS SDK for Java. The reference guide also provides sample requests, responses, and errors for the supported web services protocols.
                                
                Get started with AWS SDK for Java at the developer guide or visit the AWS Java Developer Center.
                """;
        System.out.println(s2);
    }
}
