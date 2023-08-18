package com.epam.mjc.generics;

import java.util.ArrayList;
import java.util.List;

public class Generics {
    //TODO: Refactor Method-1
    public <T> List<List<? super T>> boxingMethod(T t) {

        List<? super T> firstList = new ArrayList<>();
        firstList.add(t);

        List<List<? super T>> secondList = new ArrayList<>();
        secondList.add(firstList);

        return secondList;
    }

    //TODO: Refactor Method-2
    public <T> Object genericMethod(T data) {
        return data;
    }

    //TODO: Refactor Method-3
    public <T> void cloneMethod(List<? super T> consumer, List<? extends T> producer) {
        consumer.addAll(producer);
    }

}
