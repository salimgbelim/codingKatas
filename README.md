Requirements

# Kata 1 :

## Create a simple String calculator with a method int Add(string numbers)

* The method can take 0, 1 or 2 numbers, and will return their sum (for an empty string it will return 0) for example “” or “1” or “1,2”
* Allow the Add method to handle an unknown amount of numbers
* Allow the Add method to handle new lines between numbers (instead of commas).
* The following input is ok: “1\n2,3” (will equal 6)
* Support different delimiters
* To change a delimiter, the beginning of the string will contain a separate line that looks like this: “//[delimiter]\n[numbers…]” for example “//;\n1;2” should return three where the default delimiter is ‘;’ .
* The first line is optional. All existing scenarios should still be supported
* Calling Add with a negative number will throw an exception “negatives not allowed” – and the negative that was passed. If there are multiple negatives, show all of them in the exception message stop here if you are a beginner.
* Numbers bigger than 1000 should be ignored, so adding 2 + 1001 = 2
* Delimiters can be of any length with the following format: “//[delimiter]\n” for example: “//[—]\n1—2—3” should return 6
* Allow multiple delimiters like this: “//[delim1][delim2]\n” for example “//[-][%]\n1-2%3” should return 6.
* Make sure you can also handle multiple delimiters with length longer than one char


# Kata 2 :

## Bank transfer Kata

* Write some code to transfer a specified amount of money from one bank account (the payer) to another (the payee)
* Write some code to keep a record of the transfer for both bank accounts in a transaction history
* Write some code to query a bank account's transaction history for any bank transfers to or from a specific account

# Kata 3 :

##  FizzBuzz Kata
Write some code that will generate a string of integers, starting at 1 and going up to 100, all separated by commas.
Substitute any integer which is divisible by 3 with "Fizz",
and any integer which is divisible by 5 with "Buzz", and any integer divisible by 3 and 5 with "FizzBuzz".

1
2
Fizz
4
Buzz
Fizz
7
8
Fizz
Buzz
11
Fizz
13
14
FizzBuzz
16
17
Fizz
19
Buzz
... etc up to 100

# Kata 4 :

## FizzBuzzWhiz Kata
Same as FizzBuzz but substitute prime numbers with "Whiz"

Write some code that will generate a string of integers, starting at 1 and going up to 100, all separated by commas.
Substitute any integer which is divisible by 3 with "Fizz", and any integer which is divisible by 5 with "Buzz",
and any integer divisible by 3 and 5 with "FizzBuzz".

1
Whiz
FizzWhiz
4
BuzzWhiz
Fizz
Whiz
8
Fizz
Buzz
Whiz
The smallest twenty-five prime numbers (all the prime numbers under 100) are:

2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97

# Kata 5 :

## Word Counter Kata

A method that, given a delimited string,
returns a collection of all of the unique words in it and the count of how many times they occurred.
Start off with a space between words, but later other delimiters wil be added.

Example input:

"boom,bang,boom"
Which would produce the following result:

boom, 2
bang, 1