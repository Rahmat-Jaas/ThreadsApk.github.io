package X;

import com.google.common.collect.ImmutableMap;

/* renamed from: X.40a  reason: invalid class name and case insensitive filesystem */
public final class C677040a implements C81984oq {
    public final long A00;
    public final long A01;
    public final long A02;

    public final ImmutableMap ABC() {
        ImmutableMap.Builder builder = new ImmutableMap.Builder();
        builder.put("startTimeEpochMillis", String.valueOf(this.A02));
        builder.put("endTimeEpochMillis", String.valueOf(this.A01));
        builder.put("clientTimeInEpochMillis", String.valueOf(this.A00));
        ImmutableMap build = builder.build();
        C04220Ms.A06(build);
        return build;
    }

    public C677040a(long j, long j2, long j3) {
        this.A02 = j;
        this.A01 = j2;
        this.A00 = j3;
    }
}
