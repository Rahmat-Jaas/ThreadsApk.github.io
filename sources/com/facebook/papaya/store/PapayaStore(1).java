package com.facebook.papaya.store;

import X.AnonymousClass00U;
import X.AnonymousClass01V;
import X.AnonymousClass0wJ;
import X.AnonymousClass685;
import X.C04220Ms;
import X.C130027nt;
import X.C132537u4;
import X.C142138dv;
import X.C15020qa;
import X.C18180wK;
import X.C18200wM;
import X.C18230wP;
import X.C30954Gc6;
import X.C973168w;
import X.C97356Ba;
import com.facebook.common.dextricks.OdexSchemeArtXdex;
import com.facebook.jni.HybridData;
import com.facebook.quicklog.EventBuilder;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.RegularImmutableMap;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.File;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicInteger;

public final class PapayaStore {
    public static final AtomicInteger sSequenceId = new AtomicInteger(1);
    public final C142138dv mEventListener;
    public final HybridData mHybridData;

    public static native HybridData initHybrid(String str, String str2, ScheduledExecutorService scheduledExecutorService, Map map, String str3, Long l);

    private native void nativeCleanup(Callback callback);

    private native void nativeErase(Query query, Callback callback);

    private native void nativeEraseAll(Callback callback);

    private native void nativeNormalize(Callback callback);

    private native void nativeRead(Query query, Callback callback);

    private native void nativeRegisterProperty(long j, int i, long j2, String str, Callback callback);

    private native void nativeRegisterRecord(long j, Set set, long j2, String str, Callback callback);

    private native void nativeWrite(long j, Map map, String str, long j2, Callback callback);

    static {
        C15020qa.A0A("papaya-store");
    }

    public PapayaStore(String str, String str2, ScheduledExecutorService scheduledExecutorService, Map map, String str3, Long l, C142138dv r19) {
        C142138dv r5 = r19;
        this.mHybridData = initHybrid(str, str2, scheduledExecutorService, map, str3, l);
        this.mEventListener = r5;
        if (r19 != null) {
            File file = new File(str, AnonymousClass00U.A0L(str2, ".db"));
            AnonymousClass685 r6 = AnonymousClass685.INIT;
            ImmutableMap of = ImmutableMap.of("size_kb", String.valueOf(file.length() / OdexSchemeArtXdex.STATE_MIXED_ATTEMPTED), "db_name", str2);
            C132537u4 r52 = (C132537u4) r5;
            C04220Ms.A0B(of, 1);
            EventBuilder markEventBuilder = r52.A00.markEventBuilder(C132537u4.A00(r6), "INIT");
            Iterator A0z = AnonymousClass0wJ.A0z(of);
            while (A0z.hasNext()) {
                Map.Entry A0o = C18180wK.A0o(A0z);
                markEventBuilder.annotate(C18200wM.A0p(A0o), C18230wP.A0u(A0o));
            }
            markEventBuilder.annotate("data_namespace", r52.A01);
            markEventBuilder.report();
        }
    }

    private void notifyListener(AnonymousClass685 r8, Map map, ListenableFuture listenableFuture) {
        if (this.mEventListener != null) {
            int incrementAndGet = sSequenceId.incrementAndGet();
            C132537u4 r6 = (C132537u4) this.mEventListener;
            AnonymousClass0wJ.A1M(r8, 0, map);
            int A00 = C132537u4.A00(r8);
            AnonymousClass01V r3 = r6.A00;
            r3.markerStart(A00, incrementAndGet, false);
            Iterator A0z = AnonymousClass0wJ.A0z(map);
            while (A0z.hasNext()) {
                Map.Entry A0o = C18180wK.A0o(A0z);
                r3.markerAnnotate(A00, incrementAndGet, C18200wM.A0p(A0o), C18230wP.A0u(A0o));
            }
            r3.markerAnnotate(A00, incrementAndGet, "data_namespace", r6.A01);
            C30954Gc6.A03(new C130027nt(r8, this, incrementAndGet), listenableFuture, C97356Ba.A01);
        }
    }

    public ListenableFuture read(Query query) {
        Callback callback = new Callback();
        nativeRead(query, callback);
        ListenableFuture A00 = C97356Ba.A00(callback);
        notifyListener(AnonymousClass685.READ, RegularImmutableMap.A02, A00);
        return A00;
    }

    public ListenableFuture registerProperty(long j, C973168w r14, long j2, String str) {
        Callback callback = new Callback();
        nativeRegisterProperty(j, r14.A00, j2, "", callback);
        ListenableFuture A00 = C97356Ba.A00(callback);
        notifyListener(AnonymousClass685.REGISTER_PROPERTY, RegularImmutableMap.A02, A00);
        return A00;
    }

    public ListenableFuture registerRecord(long j, ImmutableSet immutableSet, long j2, String str) {
        Callback callback = new Callback();
        nativeRegisterRecord(j, immutableSet, j2, "", callback);
        ListenableFuture A00 = C97356Ba.A00(callback);
        notifyListener(AnonymousClass685.REGISTER_RECORD, ImmutableMap.of("record_id", String.valueOf(j)), A00);
        return A00;
    }

    public ListenableFuture write(long j, ImmutableMap immutableMap, String str, long j2) {
        String str2 = str;
        Callback callback = new Callback();
        if (str == null) {
            str2 = "";
        }
        nativeWrite(j, immutableMap, str2, j2, callback);
        ListenableFuture A00 = C97356Ba.A00(callback);
        notifyListener(AnonymousClass685.WRITE, ImmutableMap.of("record_id", String.valueOf(j)), A00);
        return A00;
    }
}
