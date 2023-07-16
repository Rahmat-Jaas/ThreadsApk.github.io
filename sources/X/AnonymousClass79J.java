package X;

import com.google.common.collect.ImmutableMap;
import java.util.Arrays;

/* renamed from: X.79J  reason: invalid class name */
public final class AnonymousClass79J {
    public static final AnonymousClass79J A01 = new AnonymousClass79J(new int[]{2});
    public static final ImmutableMap A02;
    public static final AnonymousClass79J A03 = new AnonymousClass79J(new int[]{2, 5, 6});
    public final int[] A00;

    static {
        ImmutableMap.Builder builder = new ImmutableMap.Builder();
        builder.put(5, 6);
        builder.put(17, 6);
        builder.put(7, 6);
        builder.put(18, 6);
        builder.put(6, 8);
        builder.put(8, 8);
        builder.put(14, 8);
        A02 = builder.build();
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof AnonymousClass79J) && Arrays.equals(this.A00, ((AnonymousClass79J) obj).A00);
        }
        return true;
    }

    public final int hashCode() {
        return (Arrays.hashCode(this.A00) * 31) + 8;
    }

    public final String toString() {
        return AnonymousClass00U.A06(8, "AudioCapabilities[maxChannelCount=", ", supportedEncodings=", Arrays.toString(this.A00), "]");
    }

    public AnonymousClass79J(int[] iArr) {
        int[] copyOf = Arrays.copyOf(iArr, iArr.length);
        this.A00 = copyOf;
        Arrays.sort(copyOf);
    }
}
