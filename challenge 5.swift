let animals = ["Great Auk", "Dodo", "Stellar's Sea Cow", "Hawaiian Tree Snail"]
for animal in animals {
    print(animal)
}

var animalIterator = animals.makeIterator()
while let animal = animalIterator.next() {
    print(animal)
}