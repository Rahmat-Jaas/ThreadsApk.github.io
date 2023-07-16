package X;

import android.content.Context;
import android.os.Bundle;
import android.util.Pair;
import android.util.SparseArray;
import com.facebook.redex.IDxObserverShape298S0200000_1_I2;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.3bW  reason: invalid class name and case insensitive filesystem */
public final class C63113bW {
    public C84684tg A00 = null;
    public C84304sv A01 = null;
    public C82364pV A02 = null;
    public final C58833Hl A03;
    public final C685844n A04;
    public final C66843yQ A05;
    public final C81914ob A06;
    public final C81364nf A07;
    public final AtomicLong A08 = new AtomicLong();
    public final AtomicReference A09 = new AtomicReference(AnonymousClass3SZ.A02);
    public final AtomicReference A0A = new AtomicReference();
    public final AnonymousClass3FZ A0B;

    public static C66843yQ A01(Bundle bundle) {
        if (bundle == null) {
            return new C66843yQ((SparseArray) null, (C83284r8) null, (C83284r8) null, (Object) null, (String) null, (String) null, (HashMap) null, AnonymousClass0wJ.A0v(), (Map) null, (Map) null, (Map) null, -1, 0, -1, -1, false, false);
        }
        C66843yQ A012 = C66843yQ.A01(bundle);
        if (A012 != null) {
            return A012;
        }
        throw C18190wL.A0a("BloksSurfaceProps is missing from Fragment argument.");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002f, code lost:
        r1 = r0.A02();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A06() {
        /*
            r5 = this;
            r4 = 0
            X.3yQ r0 = r5.A05
            java.lang.Object r1 = r0.A07
            boolean r0 = r1 instanceof X.C127397h3
            if (r0 == 0) goto L_0x003e
            X.7h3 r1 = (X.C127397h3) r1
            if (r1 == 0) goto L_0x003e
            boolean r0 = X.C63763iI.A0D(r1)
            if (r0 == 0) goto L_0x003e
            X.6jp r3 = X.C63763iI.A05(r1)
            if (r3 == 0) goto L_0x003e
            X.3VO r2 = X.AnonymousClass3VO.A00()
            X.44n r1 = r5.A04
            X.7Ez r0 = r1.A01
            if (r0 == 0) goto L_0x005e
            X.3HX r0 = r0.A02()
        L_0x0027:
            X.3iY r2 = X.C63893iY.A05(r2, r0, r4)
            X.7Ez r0 = r1.A01
            if (r0 == 0) goto L_0x003e
            X.3HX r1 = r0.A02()
            X.7HV r0 = X.AnonymousClass7K7.A01(r1)
            if (r0 == 0) goto L_0x003e
            X.7h3 r0 = r0.A04
            X.C122047Jt.A03(r1, r0, r2, r3)
        L_0x003e:
            X.4sv r0 = r5.A01
            if (r0 == 0) goto L_0x0045
            r0.destroy()
        L_0x0045:
            r2 = 0
            r5.A01 = r2
            X.44n r1 = r5.A04
            X.7Ez r0 = r1.A01
            if (r0 == 0) goto L_0x0051
            r0.A03()
        L_0x0051:
            r1.A01 = r2
            java.util.concurrent.atomic.AtomicReference r0 = r1.A0B
            r0.set(r2)
            java.util.concurrent.atomic.AtomicReference r0 = r5.A0A
            r0.set(r2)
            return
        L_0x005e:
            r0 = 0
            goto L_0x0027
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63113bW.A06():void");
    }

    public static C63113bW A00(Context context, SparseArray sparseArray, C66843yQ r10, C121997Jj r11, C83454rP r12, C81364nf r13) {
        SparseArray clone = r10.A04.clone();
        for (int i = 0; i < sparseArray.size(); i++) {
            clone.put(sparseArray.keyAt(i), sparseArray.valueAt(i));
        }
        Map map = r10.A0E;
        int i2 = r10.A00;
        HashMap A0y = AnonymousClass0wJ.A0y();
        if (map != null) {
            A0y.putAll(map);
        }
        String valueOf = String.valueOf(i2);
        A0y.put("ttrc_instance_id", valueOf);
        Map map2 = r10.A0D;
        HashMap A0y2 = AnonymousClass0wJ.A0y();
        if (map2 != null) {
            A0y2.putAll(map2);
        }
        A0y2.put("ttrc_instance_id", valueOf);
        return new C63113bW(new C685844n(context, clone, r11, r12, A0y, A0y2), r10, r13);
    }

    public static String A02(String str, int i) {
        String str2;
        if (i == 0 || i == 2) {
            str2 = "cc_";
        } else {
            str2 = "nc_";
        }
        return AnonymousClass00U.A0L(str2, str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00c9, code lost:
        if (r1 != 2) goto L_0x00cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00e2, code lost:
        if (r6.A03 < r7.A05.A02) goto L_0x00e4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00e4, code lost:
        r14.ABT(r6.A02, "bloks_query", true, r19);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00ed, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A03(X.C63113bW r20, X.C84684tg r21, X.AnonymousClass3SZ r22) {
        /*
            r7 = r20
            X.4ob r0 = r7.A06
            long r19 = r0.now()
            r8 = r22
            X.3Ci r6 = r8.A01
            boolean r0 = r6.A05
            r14 = r21
            if (r0 == 0) goto L_0x00c1
            java.util.HashMap r9 = X.AnonymousClass0wJ.A0y()
            r12 = 0
            java.lang.String r1 = "gql_server_end"
            long r4 = r6.A04
            int r0 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1))
            if (r0 <= 0) goto L_0x0027
            java.lang.Long r0 = java.lang.Long.valueOf(r4)
            r9.put(r1, r0)
        L_0x0027:
            long r2 = r6.A03
            int r0 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
            if (r0 <= 0) goto L_0x0034
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            r9.put(r1, r0)
        L_0x0034:
            java.util.Iterator r10 = X.AnonymousClass0wJ.A0z(r9)
        L_0x0038:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x0052
            java.util.Map$Entry r0 = X.C18180wK.A0o(r10)
            java.lang.String r9 = X.C18200wM.A0p(r0)
            java.lang.Object r0 = r0.getValue()
            long r0 = X.C18190wL.A08(r0)
            r14.Bey(r9, r0)
            goto L_0x0038
        L_0x0052:
            java.util.HashMap r9 = X.AnonymousClass0wJ.A0y()
            java.lang.String r1 = ""
            int r0 = r1.length()
            if (r0 <= 0) goto L_0x0067
            r0 = 631(0x277, float:8.84E-43)
            java.lang.String r0 = X.I17.A00(r0)
            r9.put(r0, r1)
        L_0x0067:
            int r0 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1))
            if (r0 <= 0) goto L_0x008b
            long r0 = r6.A01
            r10 = -1
            int r4 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r4 == 0) goto L_0x007c
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "disk_cache_response_time_ms"
            r9.put(r0, r1)
        L_0x007c:
            long r0 = r6.A00
            int r4 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r4 == 0) goto L_0x008b
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "disk_cache_read_latency_ms"
            r9.put(r0, r1)
        L_0x008b:
            int r0 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
            if (r0 <= 0) goto L_0x00a7
            r0 = 0
            java.lang.String r2 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "parsed_bytes"
            r9.put(r0, r2)
            java.lang.String r1 = java.lang.String.valueOf(r12)
            java.lang.String r0 = "additive_parse_time"
            r9.put(r0, r1)
            java.lang.String r0 = "network_attempts"
            r9.put(r0, r2)
        L_0x00a7:
            java.util.Iterator r2 = X.AnonymousClass0wJ.A0z(r9)
        L_0x00ab:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x00c1
            java.util.Map$Entry r0 = X.C18180wK.A0o(r2)
            java.lang.String r1 = X.C18200wM.A0p(r0)
            java.lang.String r0 = X.C18230wP.A0u(r0)
            r14.Beu(r1, r0)
            goto L_0x00ab
        L_0x00c1:
            int r1 = r8.A00
            r8 = 1
            java.lang.String r5 = "bloks_query"
            if (r1 == 0) goto L_0x00cf
            r0 = 2
            if (r1 == r0) goto L_0x00e4
        L_0x00cb:
            r14.BhX(r5, r8)
            return
        L_0x00cf:
            java.util.concurrent.atomic.AtomicLong r0 = r7.A08
            long r0 = r0.get()
            java.lang.String r2 = "prefetched_data_ready_at"
            r14.Bet(r2, r0)
            long r3 = r6.A03
            X.3yQ r0 = r7.A05
            long r1 = r0.A02
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x00cb
        L_0x00e4:
            long r15 = r6.A02
            r17 = r5
            r18 = r8
            r14.ABT(r15, r17, r18, r19)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63113bW.A03(X.3bW, X.4tg, X.3SZ):void");
    }

    /* JADX INFO: finally extract failed */
    public final Pair A04(Context context) {
        boolean z;
        try {
            C685844n r4 = this.A04;
            LLF llf = new LLF(context);
            r4.A00 = llf;
            C121247Ez r0 = r4.A01;
            if (r0 != null) {
                z = true;
                r0.A06(llf);
            } else {
                z = false;
                if (r4.A0A.compareAndSet(false, true)) {
                    C555933v r2 = r4.A06;
                    if (r2 == null) {
                        C685844n.A00(r4, 0);
                    } else {
                        C685844n.A00(r4, 1);
                        C685844n.A01(r4, (C24551ja) r2, 2, 3);
                    }
                }
            }
            Pair create = Pair.create(r4.A00, Boolean.valueOf(z));
            C84304sv r02 = this.A01;
            if (r02 != null) {
                r02.Cc5(r4);
                IDxObserverShape298S0200000_1_I2 iDxObserverShape298S0200000_1_I2 = new IDxObserverShape298S0200000_1_I2(0, this, r4);
                this.A02 = iDxObserverShape298S0200000_1_I2;
                this.A01.A6p(iDxObserverShape298S0200000_1_I2);
            }
            return create;
        } catch (Throwable th) {
            C84304sv r03 = this.A01;
            if (r03 != null) {
                C685844n r22 = this.A04;
                r03.Cc5(r22);
                IDxObserverShape298S0200000_1_I2 iDxObserverShape298S0200000_1_I22 = new IDxObserverShape298S0200000_1_I2(0, this, r22);
                this.A02 = iDxObserverShape298S0200000_1_I22;
                this.A01.A6p(iDxObserverShape298S0200000_1_I22);
            }
            throw th;
        }
    }

    public final Throwable A05() {
        C555933v r1 = (C555933v) this.A0A.get();
        if (r1 instanceof AnonymousClass1jY) {
            return ((AnonymousClass1jY) r1).A00;
        }
        return null;
    }

    public final void A07() {
        try {
            C82364pV r1 = this.A02;
            if (r1 != null) {
                C84304sv r0 = this.A01;
                if (r0 != null) {
                    r0.Cc5(r1);
                }
                this.A02 = null;
            }
        } finally {
            C84684tg r02 = this.A00;
            if (r02 != null) {
                r02.BaZ("BloksSurfaceController_onDestroyView");
            }
        }
    }

    public final boolean A08(Context context, C81854oV r13) {
        boolean z;
        C84684tg A002;
        if (this.A00 == null) {
            C58833Hl r6 = this.A03;
            AnonymousClass3FZ r5 = this.A0B;
            C66843yQ r7 = this.A05;
            boolean z2 = r7.A0F;
            int i = r7.A01;
            int i2 = r7.A00;
            long j = r7.A02;
            if (z2) {
                A002 = r5.A00(i, i2, j);
            } else {
                String str = r7.A08;
                A002 = r5.A00(i, i2, j);
                if (str != null) {
                    A002.Beu("app_id", str);
                }
                Map map = r7.A0C;
                if (map != null) {
                    Iterator A0z = AnonymousClass0wJ.A0z(map);
                    while (A0z.hasNext()) {
                        Map.Entry A0o = C18180wK.A0o(A0z);
                        C63223h1.A01(A002, A0o.getValue(), C18200wM.A0p(A0o));
                    }
                }
                for (C567138g r3 : r7.A0B) {
                    boolean z3 = false;
                    int andSet = C35082Ima.A02.getAndSet(0);
                    if (andSet > 0) {
                        z3 = true;
                    }
                    A002.Bev("prefetch_checkout_info_attempt", z3);
                    A002.Bes("prefetch_attempt_count", andSet);
                    A002.Beu("ttrc_touch_up_module", r3.A01);
                }
            }
            this.A00 = A002;
            A002.Bey("surface_core_created_at", r6.A00);
        }
        C84684tg r32 = this.A00;
        C66843yQ r52 = this.A05;
        String str2 = r52.A08;
        if (str2 == null || r52.A0G) {
            r32.A7g("initial_content_step");
        } else {
            r32.A7I("bloks_query", TimeUnit.SECONDS, r52.A03);
        }
        if (this.A01 == null) {
            if (r52.A0G || str2 == null) {
                z = false;
                C685844n r0 = this.A04;
                r0.A0B.set(new C66853yR(this, r13, r32));
                return z;
            }
            HashMap hashMap = r52.A0A;
            Context context2 = context;
            this.A01 = M4x.A00(context2, this.A07, str2, r52.A09, hashMap, 0);
        }
        z = true;
        C685844n r02 = this.A04;
        r02.A0B.set(new C66853yR(this, r13, r32));
        return z;
    }

    public C63113bW(C685844n r4, C66843yQ r5, C81364nf r6) {
        AnonymousClass3FZ r0 = AnonymousClass794.A00().A01;
        this.A0B = r0;
        C81914ob r02 = r0.A00;
        this.A06 = r02;
        this.A04 = r4;
        this.A05 = r5;
        this.A07 = r6;
        this.A03 = new C58833Hl(r02.now());
    }
}
