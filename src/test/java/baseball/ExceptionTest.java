package baseball;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static camp.nextstep.edu.missionutils.test.Assertions.*;
import static org.assertj.core.api.Assertions.*;

import static baseball.Exception.*;

public class ExceptionTest {
    @Test
    void 숫자가_3자리가_아닌_경우_예외_테스트() {
        assertSimpleTest(() ->
                assertThatThrownBy(() -> isOverThreeDigit(Arrays.asList(1,2,3,4)))
                        .isInstanceOf(IllegalArgumentException.class)
        );
    }
}
