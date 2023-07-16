package X;

import com.facebook.papaya.store.PapayaStore;
import com.facebook.papaya.store.Record;
import com.google.common.collect.ImmutableMap;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Map;

/* renamed from: X.77m  reason: invalid class name and case insensitive filesystem */
public final class C1198977m {
    public static final ImmutableMap A02;
    public final Record A00;
    public final ImmutableMap A01;

    static {
        ImmutableMap.Builder builder = new ImmutableMap.Builder();
        builder.put(-9L, C973168w.MAPPED_INT);
        builder.put(-10L, C973168w.MAPPED_FLOAT);
        builder.put(-11L, C973168w.MAPPED_STRING);
        builder.put(-13L, C973168w.MAPPED_INT_LIST);
        builder.put(-14L, C973168w.MAPPED_FLOAT_LIST);
        builder.put(-15L, C973168w.MAPPED_STRING_LIST);
        A02 = builder.build();
    }

    public C1198977m(Record record) {
        ImmutableMap immutableMap = A02;
        this.A00 = record;
        this.A01 = immutableMap;
    }

    public final ListenableFuture A00(PapayaStore papayaStore, long j) {
        ImmutableMap immutableMap = this.A01;
        C1366783w it = immutableMap.entrySet().iterator();
        while (true) {
            PapayaStore papayaStore2 = papayaStore;
            long j2 = j;
            if (it.hasNext()) {
                Map.Entry A0o = C18180wK.A0o(it);
                papayaStore2.registerProperty(C18190wL.A08(A0o.getKey()), (C973168w) A0o.getValue(), j2, "");
            } else {
                Record record = this.A00;
                papayaStore2.registerRecord(record.mId, immutableMap.keySet(), j2, "");
                return papayaStore2.write(record.mId, record.mPropertyMap, record.mName, record.mTimestamp);
            }
        }
    }
}
