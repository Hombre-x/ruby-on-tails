# Ruby on Tails
*A quasi tail-call optimiser for Ruby*

## How to use it

First of all, design your tail recursive function and put the soft keyword 
`rec` to let the compiler know that it is a tail-recursive function:

```ruby
def factorial(n)
  # Don't forget the rec keyword!
  def rec tailfactorial(n, acc)
    if n < 0
      return 0 - 1
    elsif n == 0
      return acc
    else
      return tailfactorial(n - 1, acc * n)
    end
  end

  return tailfactorial(n, 1) # Call the clojure

end
```
Then, place your code inside the `program.rb` located in the `src/main/resources` folder.
    
Finally, run `Main.kt` using `gradlew` or your IDE, and run the generated code in an [online Ruby interpreter](https://www.jdoodle.com/execute-ruby-online) or in your local machine.

```bash
$ ./gradlew run
```

---

## Examples: 

These are some examples of tail-recursive functions written in Ruby that you can use: 

### Nth Fibonacci number:

```ruby
def fibonacci(n)
  def rec tailfibonacci(n, prev, curr)
    if n == 0
      return prev
    elsif n == 1
      return curr
    else
      return tailfibonacci(n - 1, curr, prev + curr)
    end
  end

  return tailfibonacci(n, 0, 1)
end
```

### Sum of the first n natural numbers:
```ruby
def sum(n)
  def rec tailsum(n, acc)
    if n == 0
      return acc
    else
      return tailsum(n - 1, acc + n)
    end
  end

  return tailsum(n, 0)
end
```

