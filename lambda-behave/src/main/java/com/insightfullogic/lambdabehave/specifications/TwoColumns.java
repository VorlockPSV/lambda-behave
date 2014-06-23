package com.insightfullogic.lambdabehave.specifications;

/**
 * TwoColumns represents a two column table of data.
 */
public interface TwoColumns<F, S> {

    /**
     * Add another pair of elements to the column.
     *
     * @param first the first element to add.
     * @param second the second element to add.
     * @return this the fluent builder object
     */
    TwoColumns<F, S> and(F first, S second);

    /**
     * Specify the actual behaviour.
     *
     * @param description a human readable description of the behaviour you're expecting.
     * @param specification a function which describes in code the expected behaviour.
     */
    void toShow(String description, TwoColumnDataSpecification<F, S> specification);
}
