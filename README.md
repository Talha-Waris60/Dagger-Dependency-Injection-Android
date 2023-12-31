# Dagger-Dependency-Injection-Android
We will briefly discuss dependency injection with dagger here.
### Dependency Injection
Classes often required references or objects of other classes. These required classes are called dependencies. `For example`, a Car class might need a reference or object of an Engine class.  
In this example car class is dependent on having an instance of the engine class to run.
### There are three ways for a class to get an object it needs:  
##### 1) The class is responsible for creating and managing its own objects independently.
##### 2) Retrieve it from an external source when needed. In Android APIs, certain funtions, like Context getters and getSystemService(), work using this approach.
##### 3) Pass the required objects as parameters. When constructing the class or calling functions that need specific objects or references, the app can provide these dependencies.
The third option is dependency injection! With this approach you take the dependencies of a class and provide them to class, instead of a class creating or getting its own dependencies.
### There are two major ways to do dependency injection in android:
##### 1) Constructor Injection: You pass the dependency of class to its constructor.
##### 2) Field Injection: Certain Android framework classes such as activities and fragments are instantiated by the system, so constructor injection is not possible.  With field injection, dependencies are instantiated after the class is created.   
e.g  lateinit var engine: Engine
### Automated dependency injection
There are libraries that solve the problem of manually creating, providing and managing the dependencies by automating the process of creating and providing dependencies.   
They fit into two categories  
##### 1) Reflection-based solutions that connect dependencies at runtime.
##### 2) Static solutions that generate the code to connect dependencies at compile time.
### Alternatives to dependency injection
An alternative to dependency injection is using a service locator. The service locator reduce the tight connection between classes and their specific dependencies. We create a class known as the service locator that creates and stores dependencies and then provides those dependencies on demand.   
`object ServiceLocator {  
     // Store the dependency  
    fun getEngine(): Engine = Engine()  
}  

class Car {  
    private val engine = ServiceLocator.getEngine()  
    fun start() {  
        engine.start()  
    }  
}`     
The service locator pattern is different from dependency injection in the way the dependencies are consumed. In service locator pattern, classes have control and ask for objects to be injected, While in dependency injection, the app has control and proactively injects the required objects.
### Dagger
Dagger is a popular dependency injection library for Java, Kotlin, and Android that is maintained by Google. Dagger use DI to manage and create the dependencies of graph for you. Dagger automatically generates code that mimics tha code you have written with hands. Because the code is generated at compile time, it's traceable and more performant than other reflection-based solutions.
#### Benefits of dagger
##### 1) Generating the AppContainer code that you manually implemented in the manual DI.
##### 2) Create factories for the classes available in application class.
##### 3) Deciding whether to reuse a dependency or create a new instance through the use of scopes
##### 4) Creating containers for specific flows e.g you have login flow that require dependencies for login dagger create a container and constructs the dependencies inside this container and provides you on demand. 
Dagger automatically does all of this at build or compile time as long as you declare dependencies of a class and generate code that you would have written manually. By putting `@inject` annonatation to class constructor Dagger knows how to create the instance of class.
### Dagger Components
Dagger creates a dependency graph for your project, helping it to determine where to obtain dependencies when they are needed for injection. To set this up, create an interface and annotate it with `@Component`. This tells Dagger to generate a container with all the required dependencies, forming a graph of objects. Inside this container, you define functions that return instances of the classes you need.
### Scoping with Dagger
We can use scope annotations to control the lifetime of an object with the lifetime of its associated component. This means that the same instance of a dependency is used every time when any class of that type requested.



















