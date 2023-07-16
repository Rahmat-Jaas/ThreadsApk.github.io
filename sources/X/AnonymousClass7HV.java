package X;

import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import com.facebook.pando.TreeJNI;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.7HV  reason: invalid class name */
public final class AnonymousClass7HV {
    public static final Handler A0L = AnonymousClass0wJ.A0F();
    public int A00;
    public C113856sH A01;
    public AnonymousClass7A1 A02 = new AnonymousClass7A1();
    public C110936mW A03;
    public C127397h3 A04;
    public Map A05 = Collections.emptyMap();
    public boolean A06;
    public C121997Jj A07;
    public C144538if A08;
    public Object A09 = C86144wL.A0d();
    public WeakReference A0A = C86144wL.A0w((Object) null);
    public boolean A0B = false;
    public boolean A0C = false;
    public final Runnable A0D = new C135657zq(this);
    public final List A0E = AnonymousClass0wJ.A0v();
    public final List A0F = AnonymousClass0wJ.A0v();
    public final List A0G = AnonymousClass0wJ.A0v();
    public final AnonymousClass73X A0H;
    public final C142478ev A0I;
    public final List A0J = AnonymousClass0wJ.A0v();
    public final Map A0K = AnonymousClass0wJ.A0y();

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v11, resolved type: java.util.HashMap} */
    /* JADX WARNING: type inference failed for: r15v3, types: [java.util.Map] */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x01c9 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x01b7 A[Catch:{ all -> 0x01ff, all -> 0x0216 }] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x01b8 A[Catch:{ all -> 0x01ff, all -> 0x0216 }] */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x01cf A[Catch:{ all -> 0x01ff, all -> 0x0216 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.util.Pair A00(java.util.List r23) {
        /*
            r22 = this;
            java.lang.String r0 = "Bloks ProcessResources"
            X.C41228M0s.A01(r0)
            java.util.LinkedList r7 = new java.util.LinkedList     // Catch:{ all -> 0x0216 }
            r0 = r23
            r7.<init>(r0)     // Catch:{ all -> 0x0216 }
            java.util.ArrayList r6 = X.AnonymousClass0wJ.A0v()     // Catch:{ all -> 0x0216 }
            r0 = r22
            java.lang.ref.WeakReference r1 = r0.A0A     // Catch:{ all -> 0x0216 }
            java.lang.Object r2 = r1.get()     // Catch:{ all -> 0x0216 }
            X.3HX r2 = (X.AnonymousClass3HX) r2     // Catch:{ all -> 0x0216 }
            r4 = 0
            if (r2 != 0) goto L_0x002c
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r4)     // Catch:{ all -> 0x0216 }
            java.util.ArrayList r0 = X.AnonymousClass0wJ.A0v()     // Catch:{ all -> 0x0216 }
            android.util.Pair r1 = new android.util.Pair     // Catch:{ all -> 0x0216 }
            r1.<init>(r2, r0)     // Catch:{ all -> 0x0216 }
            goto L_0x0212
        L_0x002c:
            X.7A1 r5 = r0.A02     // Catch:{ all -> 0x0216 }
        L_0x002e:
            boolean r1 = r7.isEmpty()     // Catch:{ all -> 0x0216 }
            if (r1 != 0) goto L_0x0204
            java.lang.Object r3 = r7.poll()     // Catch:{ all -> 0x0216 }
            X.7Jj r3 = (X.C121997Jj) r3     // Catch:{ all -> 0x0216 }
            if (r3 == 0) goto L_0x002e
            X.76s r1 = r3.A01     // Catch:{ all -> 0x0216 }
            if (r1 == 0) goto L_0x002e
            X.7h3 r3 = r3.A02     // Catch:{ all -> 0x0216 }
            X.7A1 r12 = r0.A02     // Catch:{ all -> 0x0216 }
            java.util.Map r9 = r1.A05     // Catch:{ all -> 0x0216 }
            boolean r8 = r9.isEmpty()     // Catch:{ all -> 0x0216 }
            if (r8 != 0) goto L_0x006e
            java.util.Map r8 = r12.A03     // Catch:{ all -> 0x0216 }
            java.util.HashMap r15 = X.C86164wN.A0j(r8)     // Catch:{ all -> 0x0216 }
            r15.putAll(r9)     // Catch:{ all -> 0x0216 }
            java.util.Map r14 = r12.A05     // Catch:{ all -> 0x0216 }
            java.util.Map r11 = r12.A06     // Catch:{ all -> 0x0216 }
            java.util.Map r10 = r12.A02     // Catch:{ all -> 0x0216 }
            java.util.Map r9 = r12.A01     // Catch:{ all -> 0x0216 }
            X.6tF r13 = r12.A00     // Catch:{ all -> 0x0216 }
            java.util.Map r8 = r12.A04     // Catch:{ all -> 0x0216 }
            X.7A1 r12 = new X.7A1     // Catch:{ all -> 0x0216 }
            r19 = r8
            r17 = r10
            r18 = r9
            r16 = r11
            r12.<init>(r13, r14, r15, r16, r17, r18, r19)     // Catch:{ all -> 0x0216 }
        L_0x006e:
            r0.A02 = r12     // Catch:{ all -> 0x0216 }
            X.6tF r8 = r1.A00     // Catch:{ all -> 0x0216 }
            if (r8 == 0) goto L_0x00a9
            java.util.Map r10 = r8.A00     // Catch:{ all -> 0x0216 }
            boolean r8 = r10.isEmpty()     // Catch:{ all -> 0x0216 }
            if (r8 != 0) goto L_0x00a9
            X.6tF r8 = r12.A00     // Catch:{ all -> 0x0216 }
            X.C04220Ms.A0B(r8, r4)     // Catch:{ all -> 0x0216 }
            java.util.Map r9 = r8.A00     // Catch:{ all -> 0x0216 }
            java.util.LinkedHashMap r8 = new java.util.LinkedHashMap     // Catch:{ all -> 0x0216 }
            r8.<init>(r9)     // Catch:{ all -> 0x0216 }
            r8.putAll(r10)     // Catch:{ all -> 0x0216 }
            X.6tF r13 = new X.6tF     // Catch:{ all -> 0x0216 }
            r13.<init>(r8)     // Catch:{ all -> 0x0216 }
            java.util.Map r14 = r12.A05     // Catch:{ all -> 0x0216 }
            java.util.Map r15 = r12.A03     // Catch:{ all -> 0x0216 }
            java.util.Map r11 = r12.A06     // Catch:{ all -> 0x0216 }
            java.util.Map r10 = r12.A02     // Catch:{ all -> 0x0216 }
            java.util.Map r9 = r12.A01     // Catch:{ all -> 0x0216 }
            java.util.Map r8 = r12.A04     // Catch:{ all -> 0x0216 }
            X.7A1 r12 = new X.7A1     // Catch:{ all -> 0x0216 }
            r19 = r8
            r17 = r10
            r18 = r9
            r16 = r11
            r12.<init>(r13, r14, r15, r16, r17, r18, r19)     // Catch:{ all -> 0x0216 }
        L_0x00a9:
            r0.A02 = r12     // Catch:{ all -> 0x0216 }
            java.util.List r9 = r1.A03     // Catch:{ all -> 0x0216 }
            boolean r8 = r9.isEmpty()     // Catch:{ all -> 0x0216 }
            if (r8 != 0) goto L_0x00e8
            java.util.Map r8 = r12.A01     // Catch:{ all -> 0x0216 }
            java.util.HashMap r11 = X.C86164wN.A0j(r8)     // Catch:{ all -> 0x0216 }
            java.util.Iterator r10 = r9.iterator()     // Catch:{ all -> 0x0216 }
        L_0x00bd:
            boolean r8 = r10.hasNext()     // Catch:{ all -> 0x0216 }
            if (r8 == 0) goto L_0x00cf
            java.lang.Object r9 = r10.next()     // Catch:{ all -> 0x0216 }
            X.6hu r9 = (X.C108156hu) r9     // Catch:{ all -> 0x0216 }
            java.lang.String r8 = r9.A01     // Catch:{ all -> 0x0216 }
            r11.put(r8, r9)     // Catch:{ all -> 0x0216 }
            goto L_0x00bd
        L_0x00cf:
            java.util.Map r14 = r12.A05     // Catch:{ all -> 0x0216 }
            java.util.Map r15 = r12.A03     // Catch:{ all -> 0x0216 }
            java.util.Map r10 = r12.A06     // Catch:{ all -> 0x0216 }
            java.util.Map r9 = r12.A02     // Catch:{ all -> 0x0216 }
            X.6tF r13 = r12.A00     // Catch:{ all -> 0x0216 }
            java.util.Map r8 = r12.A04     // Catch:{ all -> 0x0216 }
            X.7A1 r12 = new X.7A1     // Catch:{ all -> 0x0216 }
            r19 = r8
            r17 = r9
            r18 = r11
            r16 = r10
            r12.<init>(r13, r14, r15, r16, r17, r18, r19)     // Catch:{ all -> 0x0216 }
        L_0x00e8:
            r0.A02 = r12     // Catch:{ all -> 0x0216 }
            java.util.Map r9 = r1.A06     // Catch:{ all -> 0x0216 }
            if (r9 == 0) goto L_0x0116
            boolean r8 = r9.isEmpty()     // Catch:{ all -> 0x0216 }
            if (r8 != 0) goto L_0x0116
            java.util.Map r8 = r12.A04     // Catch:{ all -> 0x0216 }
            java.util.HashMap r11 = X.C86164wN.A0j(r8)     // Catch:{ all -> 0x0216 }
            r11.putAll(r9)     // Catch:{ all -> 0x0216 }
            java.util.Map r14 = r12.A05     // Catch:{ all -> 0x0216 }
            java.util.Map r15 = r12.A03     // Catch:{ all -> 0x0216 }
            java.util.Map r10 = r12.A06     // Catch:{ all -> 0x0216 }
            java.util.Map r9 = r12.A02     // Catch:{ all -> 0x0216 }
            java.util.Map r8 = r12.A01     // Catch:{ all -> 0x0216 }
            X.6tF r13 = r12.A00     // Catch:{ all -> 0x0216 }
            X.7A1 r12 = new X.7A1     // Catch:{ all -> 0x0216 }
            r19 = r11
            r17 = r9
            r18 = r8
            r16 = r10
            r12.<init>(r13, r14, r15, r16, r17, r18, r19)     // Catch:{ all -> 0x0216 }
        L_0x0116:
            r0.A02 = r12     // Catch:{ all -> 0x0216 }
            java.util.List r8 = r1.A04     // Catch:{ all -> 0x0216 }
            java.util.Iterator r12 = r8.iterator()     // Catch:{ all -> 0x0216 }
            r13 = 0
            r15 = 0
        L_0x0120:
            boolean r8 = r12.hasNext()     // Catch:{ all -> 0x0216 }
            if (r8 == 0) goto L_0x0192
            java.lang.Object r10 = r12.next()     // Catch:{ all -> 0x0216 }
            X.769 r10 = (X.AnonymousClass769) r10     // Catch:{ all -> 0x0216 }
            java.lang.String r9 = r10.A00     // Catch:{ all -> 0x0216 }
            if (r13 == 0) goto L_0x0132
            r8 = r13
            goto L_0x0136
        L_0x0132:
            X.7A1 r8 = r0.A02     // Catch:{ all -> 0x0216 }
            java.util.Map r8 = r8.A05     // Catch:{ all -> 0x0216 }
        L_0x0136:
            boolean r8 = r8.containsKey(r9)     // Catch:{ all -> 0x0216 }
            if (r8 != 0) goto L_0x0149
            if (r13 != 0) goto L_0x0146
            X.7A1 r8 = r0.A02     // Catch:{ all -> 0x0216 }
            java.util.Map r8 = r8.A05     // Catch:{ all -> 0x0216 }
            java.util.HashMap r13 = X.C86164wN.A0j(r8)     // Catch:{ all -> 0x0216 }
        L_0x0146:
            r13.put(r9, r10)     // Catch:{ all -> 0x0216 }
        L_0x0149:
            if (r15 == 0) goto L_0x014d
            r8 = r15
            goto L_0x0151
        L_0x014d:
            X.7A1 r8 = r0.A02     // Catch:{ all -> 0x0216 }
            java.util.Map r8 = r8.A06     // Catch:{ all -> 0x0216 }
        L_0x0151:
            boolean r8 = r8.containsKey(r9)     // Catch:{ all -> 0x0216 }
            if (r8 != 0) goto L_0x0120
            java.lang.String r8 = r10.A01     // Catch:{ all -> 0x0216 }
            X.8ij r16 = X.AnonymousClass7K7.A02(r2, r8)     // Catch:{ all -> 0x0216 }
            if (r16 == 0) goto L_0x01e1
            if (r3 == 0) goto L_0x0162
            goto L_0x0164
        L_0x0162:
            r11 = 0
            goto L_0x0166
        L_0x0164:
            java.util.List r11 = r3.A07     // Catch:{ all -> 0x0216 }
        L_0x0166:
            X.7A1 r8 = r0.A02     // Catch:{ all -> 0x0216 }
            X.601 r21 = X.C122047Jt.A01(r2, r8, r11)     // Catch:{ all -> 0x0216 }
            X.73X r8 = r0.A0H     // Catch:{ all -> 0x0216 }
            r17 = r2
            r18 = r0
            r19 = r8
            r20 = r10
            X.6hs r11 = r16.Cr0(r17, r18, r19, r20, r21)     // Catch:{ all -> 0x0216 }
            X.6sH r10 = r0.A01     // Catch:{ all -> 0x0216 }
            java.lang.Runnable r8 = r11.A01     // Catch:{ all -> 0x0216 }
            r10.A01(r8)     // Catch:{ all -> 0x0216 }
            if (r15 != 0) goto L_0x018c
            java.util.HashMap r15 = new java.util.HashMap     // Catch:{ all -> 0x0216 }
            X.7A1 r8 = r0.A02     // Catch:{ all -> 0x0216 }
            java.util.Map r8 = r8.A06     // Catch:{ all -> 0x0216 }
            r15.<init>(r8)     // Catch:{ all -> 0x0216 }
        L_0x018c:
            java.lang.Object r8 = r11.A00     // Catch:{ all -> 0x0216 }
            r15.put(r9, r8)     // Catch:{ all -> 0x0216 }
            goto L_0x0120
        L_0x0192:
            X.7A1 r11 = r0.A02     // Catch:{ all -> 0x0216 }
            if (r13 != 0) goto L_0x019a
            if (r15 == 0) goto L_0x01b3
            java.util.Map r13 = r11.A05     // Catch:{ all -> 0x0216 }
        L_0x019a:
            if (r15 != 0) goto L_0x019e
            java.util.Map r15 = r11.A06     // Catch:{ all -> 0x0216 }
        L_0x019e:
            java.util.Map r14 = r11.A03     // Catch:{ all -> 0x0216 }
            java.util.Map r10 = r11.A02     // Catch:{ all -> 0x0216 }
            java.util.Map r9 = r11.A01     // Catch:{ all -> 0x0216 }
            X.6tF r12 = r11.A00     // Catch:{ all -> 0x0216 }
            java.util.Map r8 = r11.A04     // Catch:{ all -> 0x0216 }
            X.7A1 r11 = new X.7A1     // Catch:{ all -> 0x0216 }
            r18 = r8
            r16 = r10
            r17 = r9
            r11.<init>(r12, r13, r14, r15, r16, r17, r18)     // Catch:{ all -> 0x0216 }
        L_0x01b3:
            r0.A02 = r11     // Catch:{ all -> 0x0216 }
            if (r3 == 0) goto L_0x01b8
            goto L_0x01ba
        L_0x01b8:
            r3 = 0
            goto L_0x01bc
        L_0x01ba:
            java.util.List r3 = r3.A07     // Catch:{ all -> 0x0216 }
        L_0x01bc:
            X.C122047Jt.A01(r2, r11, r3)     // Catch:{ all -> 0x0216 }
            java.util.List r1 = r1.A01     // Catch:{ all -> 0x0216 }
            if (r1 == 0) goto L_0x01cf
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x0216 }
            if (r1 != 0) goto L_0x01cf
            java.lang.String r0 = "Initialize BloksComponentQueryManager"
            X.C41228M0s.A01(r0)     // Catch:{ all -> 0x0216 }
            goto L_0x01ec
        L_0x01cf:
            java.util.ArrayList r1 = X.AnonymousClass0wJ.A0v()     // Catch:{ all -> 0x0216 }
            java.util.Iterator r3 = r1.iterator()     // Catch:{ all -> 0x0216 }
        L_0x01d7:
            boolean r1 = r3.hasNext()     // Catch:{ all -> 0x0216 }
            if (r1 == 0) goto L_0x002e
            r3.next()     // Catch:{ all -> 0x0216 }
            goto L_0x01d7
        L_0x01e1:
            java.lang.String r0 = "Missing variable module with type: "
            java.lang.String r0 = X.AnonymousClass00U.A0L(r0, r8)     // Catch:{ all -> 0x0216 }
            java.lang.RuntimeException r0 = X.C18250wR.A0V(r0)     // Catch:{ all -> 0x0216 }
            goto L_0x0203
        L_0x01ec:
            r0 = 2131297449(0x7f0904a9, float:1.8212843E38)
            java.lang.Object r0 = r2.A00(r0)     // Catch:{ all -> 0x01ff }
            X.8ig r0 = (X.C144548ig) r0     // Catch:{ all -> 0x01ff }
            r0.get()     // Catch:{ all -> 0x01ff }
            java.lang.String r0 = "Attempting to process async components but missing component query store"
            java.lang.RuntimeException r0 = X.C18250wR.A0V(r0)     // Catch:{ all -> 0x01ff }
            throw r0     // Catch:{ all -> 0x01ff }
        L_0x01ff:
            r0 = move-exception
            X.C41228M0s.A00()     // Catch:{ all -> 0x0216 }
        L_0x0203:
            throw r0     // Catch:{ all -> 0x0216 }
        L_0x0204:
            X.7A1 r0 = r0.A02     // Catch:{ all -> 0x0216 }
            if (r0 == r5) goto L_0x0209
            r4 = 1
        L_0x0209:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)     // Catch:{ all -> 0x0216 }
            android.util.Pair r1 = new android.util.Pair     // Catch:{ all -> 0x0216 }
            r1.<init>(r0, r6)     // Catch:{ all -> 0x0216 }
        L_0x0212:
            X.C41228M0s.A00()
            return r1
        L_0x0216:
            r0 = move-exception
            X.C41228M0s.A00()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7HV.A00(java.util.List):android.util.Pair");
    }

    private C127397h3 A01(List list) {
        C41228M0s.A01("Bloks SnapshotComponent");
        C127397h3 r1 = this.A04;
        try {
            if (!list.isEmpty()) {
                r1 = C101106Px.A00(new C130707qd(list), r1);
            }
            return r1;
        } finally {
            C41228M0s.A00();
        }
    }

    public final C113616ro A02(AnonymousClass3HX r4, C144538if r5, Map map) {
        this.A02 = this.A02.A00(map);
        this.A01 = new C113856sH(r4.A00);
        this.A0A = C86144wL.A0w(r4);
        this.A08 = r5;
        Pair A002 = A00(Collections.singletonList(this.A07));
        this.A07 = null;
        if (!((List) A002.second).isEmpty()) {
            this.A04 = A01((List) A002.second);
        }
        synchronized (this.A09) {
            this.A0C = true;
            if (this.A0B) {
                Handler handler = A0L;
                Runnable runnable = this.A0D;
                handler.removeCallbacks(runnable);
                handler.post(runnable);
            }
        }
        return new C113616ro(this.A02, this.A04);
    }

    public final AnonymousClass7A1 A03() {
        AnonymousClass7J1.A03("Tree resources can only be read from the UI Thread");
        AnonymousClass7A1 r0 = this.A02;
        Map map = this.A05;
        if (map == null) {
            return r0;
        }
        return new AnonymousClass7A1(r0.A00, r0.A05, r0.A03, map, r0.A02, r0.A01, r0.A04);
    }

    public final C127397h3 A04() {
        if (this.A06) {
            C30967GcS.A02("BloksTreeManager", "Trying to access a tree on a destroyed BloksTreeManager");
        }
        AnonymousClass7J1.A03("Tree operations are only supported from the UI Thread");
        return A01(this.A0J);
    }

    public final void A06() {
        boolean z;
        if (!this.A06) {
            AnonymousClass7J1.A03("Tree operations are only supported from the UI Thread");
            List list = this.A0G;
            boolean z2 = false;
            if (!list.isEmpty()) {
                ArrayList A0s = C18200wM.A0s(list);
                list.clear();
                Pair A002 = A00(A0s);
                z = AnonymousClass0wJ.A1X(A002.first);
                this.A0J.addAll((Collection) A002.second);
            } else {
                z = false;
            }
            C41228M0s.A01("Bloks ModelMutation");
            List list2 = this.A0J;
            C127397h3 A012 = A01(list2);
            boolean z3 = true;
            if (this.A04 != A012) {
                z2 = true;
            }
            boolean z4 = z2 | z;
            this.A04 = A012;
            list2.clear();
            C41228M0s.A00();
            Map map = this.A0K;
            if (!map.isEmpty()) {
                this.A02 = this.A02.A01(map);
                map.clear();
            } else {
                z3 = z4;
            }
            C144538if r3 = this.A08;
            if (r3 != null && z3) {
                r3.C99(new C113616ro(this.A02, this.A04));
            }
        }
    }

    public final void A07(C121997Jj r3, Map map) {
        AnonymousClass7J1.A03("Tree operations are only supported from the UI Thread");
        this.A0J.addAll((Collection) A00(Collections.singletonList(r3)).second);
        HashMap A0j = C86164wN.A0j(this.A05);
        if (r3.A01.A04 != null) {
            A0j.putAll(this.A02.A06);
        }
        if (map != null) {
            A0j.putAll(map);
        }
        if (!A0j.isEmpty()) {
            this.A05 = A0j;
        }
    }

    public final void A08(C114806tv r4) {
        if (this.A06) {
            C30967GcS.A02("BloksTreeManager", "Trying to enqueue variable update on a destroyed BloksTreeManager");
            return;
        }
        AnonymousClass7J1.A03("Tree operations are only supported from the UI Thread");
        AnonymousClass326.A05.incrementAndGet();
        this.A0K.put(r4.A01, r4.A00);
        synchronized (this.A09) {
            if (!this.A0C) {
                this.A0B = true;
                return;
            }
            Handler handler = A0L;
            Runnable runnable = this.A0D;
            handler.removeCallbacks(runnable);
            handler.post(runnable);
        }
    }

    public final void A09(C110936mW r8) {
        String str;
        String str2;
        AnonymousClass7J1.A03("Committing Variables and Bound tree is only supported from the UI Thread");
        this.A03 = r8;
        this.A05 = r8.A06;
        AnonymousClass3HX r6 = (AnonymousClass3HX) this.A0A.get();
        for (C106976fw r0 : this.A0E) {
            Object obj = this.A05.get(r0.A01);
            if (obj instanceof TreeJNI) {
                ((TreeJNI) obj).maybeUpdateActiveFields();
            }
        }
        if (r6 != null) {
            for (C109256ji r1 : r8.A03) {
                C127397h3 r02 = r1.A01;
                Object A042 = AnonymousClass7K7.A04(r6, r02);
                if (A042 == null) {
                    str = "BloksTreeManager";
                    str2 = "Binding was targeting a controller but the returned controller was null";
                } else {
                    int i = r02.A03;
                    int i2 = r1.A00;
                    Object obj2 = r1.A02;
                    if (i == 13688) {
                        C130697qc r4 = (C130697qc) A042;
                        if (obj2 == null) {
                            str = "ViewTransformsBindControllerOverride";
                            str2 = "Trying to set null value for a view transform property";
                        } else {
                            r4.Chx((AnonymousClass3HX) null, obj2, i2);
                        }
                    } else {
                        throw C18190wL.A0a(String.format("No implementation bound to key: %s", C18210wN.A1X(i)));
                    }
                }
                C30967GcS.A02(str, str2);
            }
        }
    }

    public final void A0A(C144588ik r3, C111556ns r4) {
        if (this.A06) {
            C30967GcS.A02("BloksTreeManager", "Trying to enqueue update operation on a destroyed BloksTreeManager");
            return;
        }
        AnonymousClass7J1.A03("Tree operations are only supported from the UI Thread");
        this.A0J.add(new Pair(r3, r4));
    }

    public final void A0B(String str, Object obj) {
        AnonymousClass82V r2 = new AnonymousClass82V(this, obj, str);
        if (Looper.getMainLooper() == Looper.myLooper()) {
            r2.run();
        } else {
            A0L.post(r2);
        }
    }

    public AnonymousClass7HV(C121997Jj r2, AnonymousClass73X r3, C142478ev r4) {
        this.A04 = r2.A02;
        this.A07 = r2;
        this.A0H = r3;
        this.A0I = r4;
    }

    public final void A05() {
        if (AnonymousClass7J1.A04()) {
            int i = this.A00;
            if (i > 0) {
                int i2 = i - 1;
                this.A00 = i2;
                if (i2 == 0 && this.A0J.size() > 0) {
                    A06();
                    return;
                }
                return;
            }
            throw C18180wK.A0a("Negative recursion level.");
        }
    }
}
