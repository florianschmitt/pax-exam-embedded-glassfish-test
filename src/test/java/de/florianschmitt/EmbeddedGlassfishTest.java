package de.florianschmitt;

import static org.junit.Assert.assertTrue;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.ops4j.pax.exam.Configuration;
import static org.ops4j.pax.exam.CoreOptions.junitBundles;
import static org.ops4j.pax.exam.CoreOptions.options;
import org.ops4j.pax.exam.Option;
import org.ops4j.pax.exam.junit.PaxExam;

/**
 *
 * @author fschmitt
 */
@RunWith(PaxExam.class)
public class EmbeddedGlassfishTest {

    @Configuration
    public Option[] config() {
        return options(junitBundles());
    }

    @Test
    public void testTrue() {
        assertTrue("asdf".equals("asdf"));
    }

    @Test
    public void testFalse() {
        assertTrue("asdf".equals("not-asdf"));
    }
}
