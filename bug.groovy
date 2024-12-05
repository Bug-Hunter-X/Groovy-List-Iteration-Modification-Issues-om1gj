```groovy
def myMethod(List<String> list) {
  list.eachWithIndex { item, index ->
    println "Item at index $index: $item"
    if (index == 2) {
      list.remove(index) // Modifying the list while iterating
    }
  }
}

List<String> myList = ['a', 'b', 'c', 'd']
myMethod(myList)
```