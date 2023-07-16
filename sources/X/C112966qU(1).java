package X;

import com.facebook.papaya.store.Property;
import com.facebook.papaya.store.Record;
import com.google.common.collect.ImmutableMap;

/* renamed from: X.6qU  reason: invalid class name and case insensitive filesystem */
public final class C112966qU {
    public final C109716kU A00;
    public final ImmutableMap.Builder A01 = new ImmutableMap.Builder();
    public final ImmutableMap.Builder A02 = new ImmutableMap.Builder();
    public final ImmutableMap.Builder A03 = new ImmutableMap.Builder();
    public final ImmutableMap.Builder A04 = new ImmutableMap.Builder();
    public final ImmutableMap.Builder A05 = new ImmutableMap.Builder();
    public final ImmutableMap.Builder A06 = new ImmutableMap.Builder();

    public final C1198977m A00() {
        C109716kU r7 = this.A00;
        ImmutableMap build = this.A01.build();
        ImmutableMap.Builder builder = r7.A03;
        builder.put(-10L, new Property(-10, (Object) build, C973168w.MAPPED_FLOAT));
        builder.put(-9L, new Property(-9, (Object) this.A03.build(), C973168w.MAPPED_INT));
        builder.put(-11L, new Property(-11, (Object) this.A05.build(), C973168w.MAPPED_STRING));
        builder.put(-14L, new Property(-14, (Object) this.A02.build(), C973168w.MAPPED_FLOAT_LIST));
        builder.put(-13L, new Property(-13, (Object) this.A04.build(), C973168w.MAPPED_INT_LIST));
        builder.put(-15L, new Property(-15, (Object) this.A06.build(), C973168w.MAPPED_STRING_LIST));
        String str = r7.A02;
        Long l = r7.A01;
        l.getClass();
        return new C1198977m(new Record(str, l.longValue(), builder.build(), r7.A00));
    }

    public C112966qU(long j) {
        C109716kU r1 = new C109716kU();
        this.A00 = r1;
        r1.A01 = Long.valueOf(j);
    }
}
