---
name: scaffold
description: Create skeleton solution code and test specs for S-99 Scala problems
user_invocable: true
---

# Scaffold S-99 Problem

The user will specify which problem number(s) to scaffold (e.g. `/scaffold 21` or `/scaffold 21-25`).

## Section-to-package mapping

Each section of S-99 maps to its own package under `solutions`:

| Section               | Problems    | Package              | Source path                                    |
|-----------------------|-------------|----------------------|------------------------------------------------|
| Working with lists    | P01–P28     | `solutions.lists`    | `src/{main,test}/scala/solutions/lists/`       |
| Arithmetic            | P31–P41     | `solutions.arithmetic` | `src/{main,test}/scala/solutions/arithmetic/` |
| Logic and Codes       | P46–P50     | `solutions.logic`    | `src/{main,test}/scala/solutions/logic/`       |
| Binary Trees          | P55–P69     | `solutions.binarytrees` | `src/{main,test}/scala/solutions/binarytrees/` |
| Multiway Trees        | P70C–P73    | `solutions.multiwaytrees` | `src/{main,test}/scala/solutions/multiwaytrees/` |
| Graphs                | P80–P89     | `solutions.graphs`   | `src/{main,test}/scala/solutions/graphs/`      |
| Miscellaneous         | P90–P99     | `solutions.misc`     | `src/{main,test}/scala/solutions/misc/`        |

Determine the correct section from the problem number and place files in the corresponding package.

## Steps

1. **Look up the problem**: Fetch the problem description from https://aperiodic.net/pip/scala/s-99/ to get the exact problem statement, examples, and expected input/output types.

2. **Create the skeleton solution file** at `src/main/scala/solutions/{section}/Problem{NN}.scala`:
   - Package must match the section (see table above)
   - Include the problem description as a scaladoc comment
   - Include the example from the problem page
   - Define an `object Problem{NN}` with the appropriate method signature
   - Use `???` as the method body
   - Keep the method signature generic with type parameter `[A]` where appropriate
   - Create the package directory if it doesn't exist yet

3. **Create the test spec file** at `src/test/scala/solutions/{section}/Problem{NN}Spec.scala`:
   - Package must match the section (see table above)
   - Use ScalaTest `AnyFlatSpec with Matchers`
   - Include a test case using the exact example from the problem page
   - Include an empty list/collection edge case test where applicable
   - Include at least one additional meaningful test case
   - Each spec class should be named `Problem{NN}Spec`

4. **Verify**: Run `sbt "Test / compile"` to ensure everything compiles.

## Style guidelines

- Follow the existing code style in the repository
- Method names should match those given in the problem description (e.g. `last`, `penultimate`, `encode`, etc.)
- Use `Symbol` literals in tests when the problem examples use them
- Keep test descriptions concise using FlatSpec's `should/in` syntax
