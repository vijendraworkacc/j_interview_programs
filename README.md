🚀 Java Core Practice Programs

A curated collection of core Java practice programs designed to strengthen problem-solving skills and prepare for technical interviews.
Covers data structures, algorithms, object-oriented concepts, and frequently asked coding challenges to build efficiency, clarity, and confidence in Java. 💪☕

✅ Recommended Revision Sequence

🧠 Phase 1: Core Logic Warm-up
•	🔢 CheckIfPrimeBF
•	🔢 ArmstrongBF
•	🔁 ReverseNumberInteger
•	🔁 ReverseNumberString
•	🔄 PalindromeBF
•	🌀 FibonacciBF
•	🔍 MysteryOfRepeatingDecimalBF

📦 Phase 2: Array Creation & Matrix Basics
•	📊 CreatingArrayOfContinuousIntegerNumbers
•	📊 CreatingArrayOfContinuousWrapperIntegerNumbers
•	🎲 CreatingArrayOfRandomIntegerNumbers
•	🎲 CreatingArrayOfRandomDoubleNumbers
•	🔤 CreatingArrayOfCharacter
•	🔡 CreatingArrayOfSingleCharacterStrings
•	🧮 CreatingMatrix2D
•	🧮 CreatingMatrix3D
•	🧮 CreatingMatrix5D
•	🪞 CreatingIdentityMatrix2D
•	🎯 CreatingRandomNumberMatrix2D

🔄 Phase 3: Array Transformations & Flattening
•	🔀 Matrix2DToArray1D
•	🔀 Matrix5DToArray1D
•	🔀 ObjectMatrix5DToArray1D
•	🧩 UnknownDArrayTo1D

⚙️ Phase 4: Array Manipulation & Algorithms
•	⬅️ LeftRotateArray
•	➡️ RightRotateArray
•	📈 MaxSumSubArray
•	📍 MaxSumSubArrayIndicesBF
•	🏆 KLargestInArray
•	🧹 RemoveDuplicatesInArray
•	❓ SmallestMissingPositive
•	🌧️ TrappingRainwaterProblemBF

📊 Phase 5: Frequency & Grouping Problems
•	📊 FrequencyOfElementsInArrayToMap
•	🧩 FrequencyOfElementsInArrayGroupingBy
•	🔗 FrequencyOfElementsInArrayMerge
•	♻️ OnlyDuplicatesInArrayGroupingBy
•	✨ OnlyKeepUniqueInArrayGroupingBy
•	🔄 ElementArrangementInArray
•	☎️ HowManyTimesNumInPhoneNumberBF

🔤 Phase 6: String & Substring Problems
•	🔠 Anagram
•	🔍 FirstNonRepeatingCharacter
•	📖 CharacterCountInSequence
•	🚫 LongestNonRepeatingCharacterSubStringBF
•	💎 LongestPalindromicSubStringBF
•	📈 LongestIncreasingSubSequenceBF
•	🎓 BestAverageMarksBF

🧩 LeetCode – String Practice Set
1.	🔥 Longest Substring Without Repeating Characters
2.	💎 Longest Palindromic Substring
3.	🔤 Longest Substring with At Most Two Distinct Characters
4.	🔤 Longest Substring with At Most K Distinct Characters
5.	🧵 Substring with Concatenation of All Words
6.	🪟 Minimum Window Substring
7.	🔁 Repeated Substring Pattern
8.	💖 Count Palindromic Substrings
9.	🔄 Longest Repeating Character Replacement
10.	🔍 Find All Anagrams in a String
11.	✅ Valid Anagram
12.	🧩 Group Anagrams
13.	🔠 Longest Common Prefix
14.	🔎 Implement strStr()
15.	🔄 Valid Palindrome
16.	🏛️ Roman to Integer
17.	🔢 String to Integer (atoi)
18.	🔐 Decode Ways
19.	🧩 Palindrome Partitioning
20.	🔁 Reverse Words in a String

🔍 Phase 7: Sorting & Searching Algorithms
•	🔄 BubbleSortAlgo
•	🔎 BinarySearchAlgo
•	🧮 SortByBitsInBinary
•	🔗 MergeTwoSortedArraysBF
•	📊 MedianOfTwoSortedArraysBF
•	🔢 NextGreatestCombinationOfNumberBF

🧠 Phase 8: Matrix & Advanced Recursion
•	🧮 CreatingMatrix2D
•	🧮 CreatingMatrix3D
•	🧮 CreatingMatrix5D
•	🔀 Matrix2DToArray1D
•	🔀 Matrix5DToArray1D
•	🔀 ObjectMatrix5DToArray1D
•	🧩 UnknownDArrayTo1D

🔗 Phase 9: Combined Logic & Practice
•	📍 MaxSumSubArrayIndicesBF
•	📊 MedianOfTwoSortedArraysBF
•	🔢 NextGreatestCombinationOfNumberBF
•	🧮 SortByBitsInBinary
•	✨ OnlyKeepUniqueInArrayGroupingBy
•	🔄 ElementArrangementInArray

------------------------------------------------------------------------------------

📘 JAVA STREAM API NOTES

🚀 STREAM CREATION

🔹 Basic Stream Creation
•	🟢 Stream.empty()
•	🟢 Stream.of(T value)
•	🟢 Stream.of(T... values)
•	🟢 Stream.ofNullable(T value) (Java 9+)
•	🟢 Stream.builder()
•	🟢 Stream.concat(Stream<? extends T> a, Stream<? extends T> b)
•	🟢 Arrays.stream(T[] array)
•	🟢 Arrays.stream(T[] array, int startInclusive, int endExclusive)

♾️ Infinite / Iterative Streams
•	🔁 Stream.generate(Supplier<? extends T> s)

🔢 Primitive Stream Creation

IntStream / LongStream / DoubleStream
•	🔢 IntStream.of(int... values)
•	🔢 LongStream.of(long... values)
•	🔢 DoubleStream.of(double... values)
•	🔢 IntStream.range(startInclusive, endExclusive)
•	🔢 IntStream.rangeClosed(startInclusive, endInclusive)
•	🔢 LongStream.range(startInclusive, endExclusive)
•	🔢 LongStream.rangeClosed(startInclusive, endInclusive)
•	🔢 Arrays.stream(int[] / long[] / double[])
•	🔢 Arrays.stream(array, start, end)
•	🎲 Random.ints(...) / longs(...) / doubles(...)

🔄 INTERMEDIATE OPERATIONS

🔁 Transformations
•	🔧 map(Function<T, R>)
•	🔧 mapToInt(ToIntFunction<T>)
•	🔧 mapToLong(ToLongFunction<T>)
•	🔧 mapToDouble(ToDoubleFunction<T>)
•	🔄 flatMap(Function<T, Stream<R>>)
•	🔄 flatMapToInt(...)
•	🔄 flatMapToLong(...)
•	🔄 flatMapToDouble(...)
•	🧠 mapMulti(...) (Java 16+)

🎯 Filter / Slice
•	🧹 filter(Predicate<T>)
•	🧹 distinct()
•	✂️ limit(long maxSize)
•	⏭️ skip(long n)
•	⏳ takeWhile(Predicate<T>) (Java 9+)
•	⏳ dropWhile(Predicate<T>) (Java 9+)

🔀 Sort / Inspect
•	🔃 sorted()
•	🔃 sorted(Comparator<T>)
•	👀 peek(Consumer<T>)

📦 Boxing / Bridging
•	📦 boxed() (primitive → object stream)
•	🔄 mapToObj(...)
•	🔄 asIntStream() / asLongStream() / asDoubleStream()

⚙️ Parallel / Ordering Controls
•	⚡ parallel()
•	🧵 sequential()
•	🔀 unordered()

🧨 TERMINAL OPERATIONS

▶️ Consumption
•	▶️ forEach(Consumer<T>)
•	▶️ forEachOrdered(Consumer<T>)

➕ Reduction
•	➕ reduce(identity, accumulator)
•	➕ reduce(accumulator)
•	➕ reduce(identity, accumulator, combiner)

📊 Aggregation / Finding
•	📊 count()
•	📉 min(Comparator<T>)
•	📈 max(Comparator<T>)
•	✅ anyMatch(Predicate<T>)
•	✅ allMatch(Predicate<T>)
•	❌ noneMatch(Predicate<T>)
•	🔍 findFirst()
•	🎯 findAny()

🧺 COLLECTORS

🗺️ Map Collectors
•	🗺️ toMap(keyMapper, valueMapper)
•	🗺️ toMap(keyMapper, valueMapper, mergeFunction)
•	🗺️ toMap(keyMapper, valueMapper, mergeFunction, mapSupplier)
•	🔒 toUnmodifiableMap(...) (Java 10+)
•	⚡ toConcurrentMap(...)

🔗 Joining
•	🔗 joining()
•	🔗 joining(delimiter)
•	🔗 joining(delimiter, prefix, suffix)

🔢 Counting / Sum / Average / Statistics
•	🔢 counting()
•	➕ summingInt / summingLong / summingDouble
•	📉 averagingInt / averagingLong / averagingDouble
•	📊 summarizingInt / summarizingLong / summarizingDouble

🧩 Grouping
•	🧩 groupingBy(classifier)
•	🧩 groupingBy(classifier, downstream)
•	🧩 groupingBy(classifier, mapFactory, downstream)

⚖️ Partitioning
•	⚖️ partitioningBy(predicate)
•	⚖️ partitioningBy(predicate, downstream)

🪄 Collecting And Then
•	🪄 collectingAndThen(downstream, finisher)

✅ END OF NOTES
