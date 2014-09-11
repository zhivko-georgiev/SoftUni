##Java Collections Basics

1. Sort Array of Numbers - Write a program to **enter a number n** and **n integer numbers and sort and print them**. Keep the numbers in array of integers: **int[]**.

2. Sequences of Equal Strings - Write a program that **enters an array of strings** and finds in it **all sequences of equal elements**. The input strings are given as a single line, separated by a space. Note: the count of the input strings is not explicitly specified, so you might need to read the first input line as a string and split it by a space.

3. Largest Sequence of Equal Strings - Write a program that **enters an array of strings** and finds in it **the largest sequence of equal elements**. If several sequences have the same longest length, print the **leftmost** of them. The input strings are given as a single line, separated by a space.

4. Longest Increasing Sequence - Write a program to **find all increasing sequences** inside an array of integers. The integers are given in a single line,separated by a space. Print the sequences in the order of their appearance in the input array, each at a single line. Separate the sequence elements by a space. Find also **the longest increasing sequence** and print it at the last line. If several sequences have the same longest length, print the leftmost of them.

5. Count All Words - Write a program to **count the number of words** in given sentence. Use any non-letter character as word separator.

6. Count Specified Word - Write a program to **find how many times a word appears in given text**. The text is given at the first input line. The target word is given at the second input line. The output is an integer number. Please ignore the character casing. Consider that any non-letter character is a word separator.

7. Count Substring Occurrences - Write a program to **find how many times given string appears in given text as substring**. The text is given at the first input line. The search string is given at the second input line. The output is an integer number. Please ignore the character casing.

8. Extract Emails - Write a program to **extract all email addresses from given text**. The text comes at the first input line. Print the emails in the output, each at a separate line. Emails are considered to be in format **<user>@<host>**, where:
    * <**user**> is a sequence of letters and digits, where '.', '-' and '\_' can appear between them. Examples of valid users: **"stephan", "mike03", "s.johnson", "st_steward", "softuni-bulgaria", "12345". Examples of invalid users: ''--123", ".....", "nakov_-", "_steve", ".info"**.
    * <**host**> is a sequence of at least two words, separated by dots '.'. Each word is sequence of letters and can have hyphens '-' between the letters. Examples of hosts: **"softuni.bg", "software-university.com", "intoprogramming.info", "mail.softuni.org". Examples of invalid hosts: "helloworld", ".unknown.soft.", "invalid-host-", "invalid-"**.
    * Example of **valid emails**: info@softuni-bulgaria.org, kiki@hotmail.co.uk, no-reply@github.com, s.peterson@mail.uu.net, info-bg@software-university.software.academy.

9. Combine Lists of Letters - Write a program that **reads two lists of letters l1 and l2 and combines them**: appends all letters **c** from **l2** to the end of **l1**, but only when c does not appear in l1. Print the obtained combined list. All lists are given as sequence of letters separated by a single space, each at a separate line. Use **ArrayList<Character>** of chars to keep the input and output lists.

10. Extract All Unique Words - At the first line at the console you are given a piece of **text. Extract all words from it** and print them in **alphabetical order**. Consider each non-letter character as word separator. Take the repeating words only once. Ignore the character casing. Print the result words in a single line, separated by spaces.

11. Most Frequent Word - Write a program to **find the most frequent word** in a text and print it, as well as **how many times it appears** in format "**word -> count**". Consider any non-letter character as a word separator. Ignore the character casing. If several words have the same maximal frequency, print all of them in alphabetical order.

12. Cards Frequencies - We are given a sequence of **N playing cards** from a standard deck. The input consists of several cards (face + suit), separated by a space. Write a program to calculate and print at the console the frequency of each card face in format "**card_face -> frequency**". The frequency is calculated by the formula **appearances / N** and is expressed in percentages with exactly 2 digits after the decimal point. The card faces with their frequency should be printed in the order of the card face's first appearance in the input. The same card can appear multiple times in the input, but it's face should be listed only once in the output.
