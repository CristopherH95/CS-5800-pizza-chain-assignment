# Pizza Chain Assignment

This repository contains a builder pattern implementation for homework #2 of CS-5800 (Advanced Software Engineering).
The implementation details can be found in the `pizza` package, and a driver program can be found under the
`driver` package. An example of the program's output can be found in `output.png`. Essentially, the driver program
runs through two tests:

1. Create 3 pizzas from a single pizza chain.
2. Create 2 pizzas for each pizza chain.

## Build & Run

To build with Maven, simply navigate to the project root in the command line and run:

```shell
mvn package
```

Alternatively, IDEs such as IntelliJ should be able to build the source files using their standard build utilities.

Once built, the project can be run using the `driver` package:

```shell
java -cp ./target/pizza-chain-1.0-SNAPSHOT.jar driver.Main
```
