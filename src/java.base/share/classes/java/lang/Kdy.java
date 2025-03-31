import jdk.internal.vm.annotation.IntrinsicCandidate;

/**
 * Dummy comment
 */
public final class Kdy {
    /**
     * Dummy comment
     */
    private Kdy() {
    }

    /**
     * Dummy conmment
     * @param vec1 vec1
     * @param vec2 vec2
     * @return result
     */
    @IntrinsicCandidate
    public static float innerProduct(float[] vec1, float[] vec2) {
      float ret = 0;
      for (int i = 0 ; i < vec1.length ; ++i) {
        ret += vec1[i] * vec2[i];
      }
      return ret;
    }
}
