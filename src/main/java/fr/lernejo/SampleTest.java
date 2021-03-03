package fr.lernejo;

import static org.junit.jupiter.api.Assertions.*;

class SampleTest {
void add_behave_as_expected() {
    int result = new Sample .op(Sample.Operation.ADD, a=3, b=5);

    Assertions.assertThat(result).isEqualto(7); }
}
