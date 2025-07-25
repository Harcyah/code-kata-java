package com.harcyah.kata.exercism.custom_set;

import lombok.EqualsAndHashCode;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

@EqualsAndHashCode
public class CustomSet<T> {

    private final Map<Integer, T> values;

    public CustomSet() {
        values = new HashMap<>();
    }

    public CustomSet(List<T> elements) {
        values = elements.stream().collect(Collectors.toMap(T::hashCode, Function.identity()));
    }

    public boolean isEmpty() {
        return values.isEmpty();
    }

    public boolean contains(T element) {
        return values.containsKey(element.hashCode());
    }

    public boolean isDisjoint(CustomSet<T> another) {
        for (Integer key : this.values.keySet()) {
            if (another.values.containsKey(key)) {
                return false;
            }
        }
        return true;
    }

    public boolean isSubset(CustomSet<T> another) {
        return this.values.keySet().containsAll(another.values.keySet());
    }

    public void add(T element) {
        values.put(element.hashCode(), element);
    }

    public CustomSet<T> getIntersection(CustomSet<T> another) {
        CustomSet<T> intersection = new CustomSet<>();
        for (Map.Entry<Integer, T> entry : this.values.entrySet()) {
            if (another.values.containsKey(entry.getKey())) {
                intersection.values.put(entry.getKey(), entry.getValue());
            }
        }
        return intersection;
    }

    public CustomSet<T> getDifference(CustomSet<T> another) {
        CustomSet<T> union = new CustomSet<>();
        union.values.putAll(this.values);
        union.values.keySet().removeAll(another.values.keySet());
        return union;
    }

    public CustomSet<T> getUnion(CustomSet<T> another) {
        CustomSet<T> union = new CustomSet<>();
        union.values.putAll(this.values);
        union.values.putAll(another.values);
        return union;
    }

}
