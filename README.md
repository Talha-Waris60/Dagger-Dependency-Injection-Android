# Dagger-Dependency-Injection-Android
We will briefly discuss dependency injection with dagger here.
### Dependency Injection
Classes often required references or objects of other classes. These required classes are called dependencies. `For example`, a Car class might need a reference or object of an Engine class.  
In this example car class is dependent on having an instance of the Engine class to run.
### There are three ways for a class to get an object it needs:  
1) The class is responsible for creating and managing its own objects independently.
2) Retrieve it from an external source when needed. In Android APIs, certain funtions, like Context getters and getSystemService(), work using this approach.
3) Pass the required objects as parameters. When constructing the class or calling functions that need specific objects or refrences, the app can provide these dependencies.
