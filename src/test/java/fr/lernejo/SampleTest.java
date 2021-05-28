package fr.lernejo;

import org.assertj.core.api.Assertions;

class SampleTest {
    private final Sample sample = new Sample();
    void add_test(){
        int result = sample.op(Sample.Operation.ADD, 1,2 );

        Assertions.assertThat(result).isEqualTo(3);
    }

    void facto_test()
    {
        int fact = sample.fact(4);
        Assertions.assertThat(fact).isEqualTo(24);
    }

}


