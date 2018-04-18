#Answers for Lab 7

#Malka Bracha

1. They enable the method to run recursively. This way, the same code doesn't have to keep on being written, but it can call itself. They are called by another method and then they run until they hit the base and then pop back out.

2. They need to have arguments so that they can run recursively again and again. The method calls itself and passes it the last number plus one so that it can go through the list to see when it comes to the end.

3. PopulateList, populateFifoList, and ReverseLines.printReverse all have a O(n) time, because each of them go through the method as many times as there are items in the collection. For extra space, ReverseLines.printReverse is O(n) because it creates a new line each time. The other two methods are also O(n) because they make an array of size n.

4. All of these methods can be written as while loops. They just need to be set up to process each thing in the collection and then move on the the next one.