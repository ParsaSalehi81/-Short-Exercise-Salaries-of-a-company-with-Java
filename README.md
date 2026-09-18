# Worker Salary Management

This is a simple Java program for managing workers and their salaries.

For each worker, the program stores:

* Name
* Base salary
* Complement

The total salary of a worker is calculated by adding the base salary and the complement. The program can also display all the workers with their salary information and calculate the global salary cost of the company.

## How it works

The program has two main classes:

* `Worker` represents one worker and stores their information.
* `Company` keeps the list of workers and calculates the total salary of all of them.

`Main` creates some example workers and prints the results.

## Additional Questions

### Is the design ready for changes in how the total salary is calculated?

Yes. The calculation is kept inside the `calculateTotalSalary()` method in the `Worker` class.

Right now the calculation is simply:

`base salary + complement`

If the calculation changes later, for example if taxes need to be included, the calculation can be changed in this method without having to change the rest of the program.

### What happens if the company has fewer than 100 workers?

The workers are stored using an `ArrayList` instead of an array with 100 fixed positions.

This means there are no unused spaces to manage. If the company has 20 workers, the list contains 20 workers. If it has 100 or more, the list can grow as needed.

## Running the program

Compile the program:

`javac Main.java`

Then run it:

`java Main`
