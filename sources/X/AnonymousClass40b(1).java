package X;

import com.google.common.collect.ImmutableMap;

/* renamed from: X.40b  reason: invalid class name */
public final class AnonymousClass40b implements C81984oq {
    public final long A00;
    public final long A01;
    public final long A02;

    public final ImmutableMap ABC() {
        ImmutableMap.Builder builder = new ImmutableMap.Builder();
        long j = this.A02;
        builder.put("ttlInMillis", String.valueOf(j));
        long j2 = this.A01;
        builder.put("clientTimeInEpochMillis", String.valueOf(j2));
        long j3 = this.A00;
        builder.put("fetchTimeInEpochMillis", String.valueOf(j3));
        builder.put("deltaSinceFetchInMillis", String.valueOf((j2 - j3) - j));
        ImmutableMap build = builder.build();
        C04220Ms.A06(build);
        return build;
    }

    public AnonymousClass40b(long j, long j2, long j3) {
        this.A02 = j;
        this.A01 = j2;
        this.A00 = j3;
    }
}
