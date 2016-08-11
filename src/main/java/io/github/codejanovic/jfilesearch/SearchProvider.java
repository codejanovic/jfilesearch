package io.github.codejanovic.jfilesearch;

import java.util.Iterator;
import java.util.stream.Stream;

public interface SearchProvider<T> {
    Stream<T> stream();
    Iterator<T> iterator();
}