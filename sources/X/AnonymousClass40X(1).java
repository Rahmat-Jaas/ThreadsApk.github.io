package X;

import com.google.common.collect.ImmutableMap;

/* renamed from: X.40X  reason: invalid class name */
public final class AnonymousClass40X implements C81984oq {
    public final AnonymousClass32V A00;

    public final ImmutableMap ABC() {
        ImmutableMap.Builder builder = new ImmutableMap.Builder();
        builder.put("currentTimeEpochMillis", String.valueOf(this.A00.A00.A00));
        ImmutableMap build = builder.build();
        C04220Ms.A06(build);
        return build;
    }

    public AnonymousClass40X(AnonymousClass32V r1) {
        this.A00 = r1;
    }
}
