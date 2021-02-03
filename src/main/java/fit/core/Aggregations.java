package fit.core;

import java.util.Collection;

public class Aggregations {
  private Aggregations() {
    throw new IllegalStateException("Utilitary class");
  }

  public static int sum(Collection<Integer> coll) {
    return coll.stream()
      .reduce(0, Integer::sum);
  }
}
