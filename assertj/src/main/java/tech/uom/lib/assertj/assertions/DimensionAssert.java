package tech.uom.lib.assertj.assertions;

import javax.measure.Dimension;

/**
 * {@link Dimension} specific assertions - Generated by CustomAssertionGenerator.
 *
 * Although this class is not final to allow Soft assertions proxy, if you wish to extend it, 
 * extend {@link AbstractDimensionAssert} instead.
 */
@javax.annotation.Generated(value="assertj-assertions-generator")
public class DimensionAssert extends AbstractDimensionAssert<DimensionAssert, Dimension> {

  /**
   * Creates a new <code>{@link DimensionAssert}</code> to make assertions on actual Dimension.
   * @param actual the Dimension we want to make assertions on.
   */
  public DimensionAssert(Dimension actual) {
    super(actual, DimensionAssert.class);
  }

  /**
   * An entry point for DimensionAssert to follow AssertJ standard <code>assertThat()</code> statements.<br>
   * With a static import, one can write directly: <code>assertThat(myDimension)</code> and get specific assertion with code completion.
   * @param actual the Dimension we want to make assertions on.
   * @return a new <code>{@link DimensionAssert}</code>
   */
  @org.assertj.core.util.CheckReturnValue
  public static DimensionAssert assertThat(Dimension actual) {
    return new DimensionAssert(actual);
  }
}