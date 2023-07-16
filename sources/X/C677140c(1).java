package X;

import com.google.common.collect.ImmutableMap;

/* renamed from: X.40c  reason: invalid class name and case insensitive filesystem */
public final class C677140c implements C81984oq {
    public AnonymousClass373 A00;
    public AnonymousClass373 A01;
    public AnonymousClass373 A02;
    public AnonymousClass373 A03;

    public final ImmutableMap ABC() {
        ImmutableMap.Builder builder = new ImmutableMap.Builder();
        AnonymousClass373 r2 = this.A01;
        if (r2 != null) {
            builder.put("impressionCount", String.valueOf(r2.A00));
            builder.put("impressionLimit", String.valueOf(r2.A01));
        }
        AnonymousClass373 r22 = this.A02;
        if (r22 != null) {
            builder.put("primaryActionCount", String.valueOf(r22.A00));
            builder.put("primaryActionLimit", String.valueOf(r22.A01));
        }
        AnonymousClass373 r23 = this.A03;
        if (r23 != null) {
            builder.put("secondaryActionCount", String.valueOf(r23.A00));
            builder.put("secondaryActionLimit", String.valueOf(r23.A01));
        }
        AnonymousClass373 r24 = this.A00;
        if (r24 != null) {
            builder.put("dismissActionCount", String.valueOf(r24.A00));
            builder.put("dismissActionLimit", String.valueOf(r24.A01));
        }
        ImmutableMap build = builder.build();
        C04220Ms.A06(build);
        return build;
    }
}
