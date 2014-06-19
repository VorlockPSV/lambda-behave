package com.insightfullogic.lambdabehave.impl.specifications;

import com.insightfullogic.lambdabehave.impl.Specifier;
import com.insightfullogic.lambdabehave.specifications.Column;
import com.insightfullogic.lambdabehave.specifications.ColumnDataSpecification;

import java.util.ArrayList;
import java.util.List;

public class ValueBuilder<T> implements Column<T> {

    private final List<T> values;
    private final Specifier specifier;

    public ValueBuilder(T value, Specifier specifier) {
        this.specifier = specifier;
        values = new ArrayList<>();
        values.add(value);
    }

    @Override
    public ValueBuilder<T> and(T value) {
        values.add(value);
        return this;
    }

    @Override
    public void toShow(String descriptionFormat, ColumnDataSpecification<T> specification) {
        values.forEach(value -> {
            String description = String.format(descriptionFormat, value);
            specifier.specifyBehaviour(description, value, specification);
        });
    }
}