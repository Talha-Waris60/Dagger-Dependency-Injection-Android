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










