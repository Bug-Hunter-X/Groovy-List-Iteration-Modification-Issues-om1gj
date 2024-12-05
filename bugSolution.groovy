```groovy
def myMethod(List<String> list) {
  // Create a copy to avoid modification issues
  def newList = new ArrayList<>(list)
  
  newList.eachWithIndex { item, index ->
    println "Item at index $index: $item"
    if (index == 2) {
      newList.remove(index)
    }
  }
}

List<String> myList = ['a', 'b', 'c', 'd']
myMethod(myList)

//Alternative solution using iterator

def myMethod2(List<String> list){
    def iter = list.iterator()
    while(iter.hasNext()){
        def item = iter.next()
        println item
        if(item == "c") iter.remove()
    }
}
myList = ['a','b','c','d']
myMethod2(myList)
```