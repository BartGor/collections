# Kolekcje 

## W jaki sposób wygląda hierarchia interfejsów związana z kolekcjami?
* Na szczycie hierarchi interfejsów znajduje się Collection.
* Pochodne interfejsy Collection to: List, Set, Queue, Deque.
*Interfejs Map nie znajduje się w powyższej hierarhii.
* Iterfejs SortedSet, SortedMap imożliwiają przechowywanie posortowanch 
kolekcji.
## Jakie są podstawowe implementacje poszczególnych interfejsów?
*Implementacjami interfejsi List są: ArrayList, LinkedList
*Implementacjami interfejsi Set są: HashSet, TreeSet, LinkedHashSet
*Implementacjami interfejsi Queue są: LinkedList    
*Implementacjami interfejsi Deque są: LinkedList
*Implementacjami interfejsi Map są: HashMap, TreeMap, LinkedHashMap


## W których kolekcjach elementy są sortowane i w jaki sposób?
*Interfejsy SortedMap i SortedSet umożliwiają przechowiranie kolekcji uporządkowanych.Wykorzystyywany
jest naturalny porządek obiektów (compareTo) lub można wskazać Comparator Implermentacjami są TreeSe i TreeMap

## Implementacje interfejsu List – złożoność operacji
*Klasa ArrayList wykorzystuje wewnęreznie implementację tablicową
*KlasaLinkrdList wykorzystuje implementację dowiązaniową
* Różnice pojawiają się podczas wykonywania operacjii:odczytywanie



## Napisać aplikację wykorzystującą różne implementacje List i sprawdzić różnice w operacjach dodawania na początek listy, usuwania z początku listy, przeglądania całej listy
*Zaimplementować metody;
dodawanie n elementow na poczatek listy
usuwanie n elementow z poczatku list
odczytywanie wszystkich n elementow listy

Metody przyjmują parametr typu List<Integet>
*porownac czas wykonania powyzszych metod dla LinkedList i arrayList.
## Napisać operacje wykorzystującą różne implementacje Set i sprawdzić różnice w operacjach dodawania do zbioru

## Do których kolekcji można wstawiać wartości null?