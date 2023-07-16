package X;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.facebook.systrace.Systrace;
import com.instagram.quickpromotion.intf.QuickPromotionSlot;
import com.instagram.quickpromotion.intf.QuickPromotionSurface;
import com.instagram.quickpromotion.intf.Trigger;
import com.instagram.quickpromotion.sdk.InstagramQpSdkModule;
import com.instagram.service.session.UserSession;
import java.util.AbstractCollection;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import kotlin.coroutines.jvm.internal.KtSLambdaShape0S0901000_I2;
import kotlin.jvm.internal.KtLambdaShape95S0100000_I2_75;

/* renamed from: X.4Gs  reason: invalid class name and case insensitive filesystem */
public abstract class C70894Gs implements C84844tx, C84374t2 {
    public C57483Bf A00;
    public C61563Ua A01 = ((C61563Ua) C61563Ua.A03.getValue());
    public InstagramQpSdkModule A02;
    public AnonymousClass3YC A03 = AnonymousClass3YC.A03;
    public final Context A04;
    public final C11630kW A05;
    public final C70764Ga A06;
    public final AnonymousClass3GL A07;
    public final C84384t3 A08;
    public final C84574tR A09;
    public final QuickPromotionSlot A0A;
    public final C83714rr A0B;
    public final AnonymousClass39L A0C;
    public final AnonymousClass3UV A0D;
    public final UserSession A0E;
    public final AnonymousClass3F2 A0F;
    public final Set A0G = C18200wM.A0u();
    public final C04560Oe A0H;

    public static boolean A00(C70894Gs r22, Map map, Set set, boolean z) {
        C57483Bf r1;
        HashMap hashMap;
        C70894Gs r13 = r22;
        Set set2 = set;
        if (!z) {
            C61833Vz A002 = C36622Sa.A00();
            UserSession userSession = r13.A0E;
            QuickPromotionSlot quickPromotionSlot = r13.A0A;
            if (A002.A0B(quickPromotionSlot, r13.A0D, userSession)) {
                C84574tR r3 = r13.A09;
                r3.ANA("qp_canceled", "cool_down");
                r3.ANC();
                r13.A06.Bdp((String) null, quickPromotionSlot.toString(), set2, true);
                return false;
            }
        }
        C70764Ga r12 = r13.A06;
        QuickPromotionSlot quickPromotionSlot2 = r13.A0A;
        r12.Bdp((String) null, quickPromotionSlot2.toString(), set2, false);
        AnonymousClass3UU r8 = new AnonymousClass3UU(map);
        if (!r8.A01.isEmpty()) {
            r8.A00 = C18210wN.A1W(z);
        }
        Set A003 = r13.A0F.A00(set2);
        if (!A003.isEmpty()) {
            EnumMap enumMap = new EnumMap(QuickPromotionSurface.class);
            for (C40337Lct lct : M5W.A01(quickPromotionSlot2)) {
                EnumSet enumSet = lct.A01;
                C04220Ms.A06(enumSet);
                HashSet A0u = C18200wM.A0u();
                for (Object next : A003) {
                    if (enumSet.contains(next)) {
                        A0u.add(next);
                    }
                }
                QuickPromotionSurface quickPromotionSurface = lct.A00;
                C04220Ms.A06(quickPromotionSurface);
                enumMap.put(quickPromotionSurface, A0u);
            }
            AnonymousClass3YC r0 = r13.A03;
            UserSession userSession2 = r13.A0E;
            C04220Ms.A0B(userSession2, 0);
            AnonymousClass3TF A004 = r0.A00(userSession2);
            if (A004 == null) {
                r1 = new C57483Bf(enumMap, AnonymousClass4To.A00(), enumMap);
            } else if (A004.A05) {
                r1 = new C57483Bf(enumMap, enumMap, AnonymousClass4To.A00());
            } else {
                HashMap A0y = AnonymousClass0wJ.A0y();
                HashMap A0y2 = AnonymousClass0wJ.A0y();
                Iterator A0z = AnonymousClass0wJ.A0z(enumMap);
                while (A0z.hasNext()) {
                    Map.Entry A0o = C18180wK.A0o(A0z);
                    Object key = A0o.getKey();
                    for (Object next2 : (Set) A0o.getValue()) {
                        C04220Ms.A0B(key, 0);
                        C04220Ms.A0B(next2, 1);
                        if (!A004.A01.contains(key) || (!A004.A02.contains(next2) && !A004.A03.contains(next2))) {
                            hashMap = A0y2;
                        } else {
                            hashMap = A0y;
                        }
                        Object obj = hashMap.get(key);
                        if (obj == null) {
                            obj = C18200wM.A0u();
                            hashMap.put(key, obj);
                        }
                        ((AbstractCollection) obj).add(next2);
                    }
                }
                r1 = new C57483Bf(enumMap, A0y, A0y2);
            }
            Map map2 = r1.A03;
            if (map2.isEmpty()) {
                C567738m r32 = new C567738m(r13.A04, userSession2);
                C84574tR r2 = r13.A09;
                r2.ANG("legacy_fetch");
                C84384t3 r14 = r13.A08;
                C84384t3 r02 = r14;
                C567738m r15 = r32;
                QuickPromotionSlot quickPromotionSlot3 = quickPromotionSlot2;
                r02.B4r(r15, r2, quickPromotionSlot3, r8, enumMap, r13.A0B.BF6());
                return true;
            }
            C84574tR r7 = r13.A09;
            r7.ANG("sdk_fetch");
            InstagramQpSdkModule instagramQpSdkModule = r13.A02;
            Context context = r13.A04;
            C83224qz r33 = (C83224qz) r13.A0H.get();
            C57213Ae r23 = new C57213Ae(r1, r8, r13);
            C04220Ms.A0B(context, 1);
            C18190wL.A1S(r7, 4, r33);
            InstagramQpSdkModule.A05.add(r7);
            E5N A0J = C18250wR.A0J((AnonymousClass0gW) null, 3);
            AnonymousClass3UU r152 = r8;
            C25237DiI.A00((Integer) null, (C27952Ew2) null, new KtSLambdaShape0S0901000_I2(r152, map2, instagramQpSdkModule, A0J, context, userSession2, r7, r33, r23, (C146958n9) null, 4), AnonymousClass7Ja.A04(A0J.AHN(2020389652, 3), r33), 3);
            return true;
        }
        return false;
    }

    public final void A03(C28291u0 r10, UserSession userSession, Integer num) {
        C28291u0 r5;
        AnonymousClass29L r4;
        C04220Ms.A0B(userSession, 0);
        String valueOf = String.valueOf(r10.A06.A00);
        AnonymousClass18L r42 = new AnonymousClass18L(r10);
        AnonymousClass3YD A002 = AnonymousClass3O4.A00(userSession, valueOf);
        C58413Fm r7 = new C58413Fm(C13330nS.A02(userSession));
        int intValue = num.intValue();
        if (intValue == 1) {
            r5 = r42.A01;
            String str = r5.A0D;
            C04220Ms.A06(str);
            AnonymousClass3YD.A01(A002, str, "primaryActionCount", "primaryActionTime", (String) null);
            r4 = AnonymousClass29L.PRIMARY;
        } else if (intValue == 2) {
            r5 = r42.A01;
            String str2 = r5.A0D;
            C04220Ms.A06(str2);
            AnonymousClass3YD.A01(A002, str2, "secondaryActionCount", "secondaryActionTime", (String) null);
            r4 = AnonymousClass29L.SECONDARY;
        } else if (intValue == 3) {
            r5 = r42.A01;
            String str3 = r5.A0D;
            C04220Ms.A06(str3);
            AnonymousClass3YD.A01(A002, str3, "dismissActionCount", "dismissActionTime", "lastDismissForSurface");
            r4 = AnonymousClass29L.DISMISS;
        } else {
            return;
        }
        AnonymousClass0A3 r2 = (AnonymousClass0A3) r7.A02.invoke(r7.A00);
        if (AnonymousClass0wJ.A1U(r2)) {
            String str4 = r5.A0D;
            C04220Ms.A06(str4);
            r2.A0S("promotion_id", AnonymousClass0wJ.A0d(str4));
            r2.A0S("context_surface_id", AnonymousClass0wJ.A0d(valueOf));
            r2.A0O(r4, "action_type");
            String str5 = r5.A0C;
            if (str5 == null) {
                str5 = "";
            }
            r2.A0T("plain_instance_log_data", str5);
            r2.A0V("extra_client_data", (Map) null);
            r2.Bb4();
        }
    }

    public final void A05(Set set) {
        this.A09.ANI(set, "ad_hoc_trigger");
        A00(this, (Map) null, set, false);
    }

    public final synchronized void Bwn(Map map) {
        this.A09.ANE("onError");
        this.A00 = null;
        this.A06.Bc0((String) null, this.A0A.toString(), map);
    }

    public final synchronized void C9I() {
        Map map;
        C57483Bf r2 = this.A00;
        if (r2 == null || r2.A00.isEmpty()) {
            C84574tR r1 = this.A09;
            r1.ANG("no promotion available");
            r1.ANC();
            if (r2 != null) {
                map = r2.A01;
            } else {
                map = null;
            }
            this.A06.BdF((String) null, this.A0A.toString(), map);
            this.A0G.clear();
            this.A07.A00();
            this.A00 = null;
            C550831r.A00();
        } else {
            CDd(new AnonymousClass3VC(false), r2.A02);
        }
    }

    public final void CDd(AnonymousClass3VC r2, Map map) {
        CDe((AnonymousClass3UU) null, r2, map);
    }

    public synchronized void CEB(C81644o8 r13) {
        AnonymousClass268 A012;
        Set set = this.A0G;
        C28291u0 r132 = (C28291u0) r13;
        if (!set.contains(r132.A0D)) {
            set.add(r132.A0D);
            AnonymousClass3UV r5 = this.A0D;
            QuickPromotionSurface quickPromotionSurface = r132.A06;
            Map map = r5.A01;
            map.remove(quickPromotionSurface);
            map.put(quickPromotionSurface, C18200wM.A0c());
            r5.A00 = quickPromotionSurface;
            UserSession userSession = this.A0E;
            C28161tl A013 = AnonymousClass3WS.A01(userSession);
            QuickPromotionSlot quickPromotionSlot = this.A0A;
            String name = quickPromotionSlot.name();
            String obj = r5.toString();
            C04220Ms.A0B(name, 0);
            C18180wK.A0v(C28161tl.A02(A013), AnonymousClass00U.A0L(name, "_qp_slot_impression_data"), obj);
            C04220Ms.A0B(userSession, 0);
            String valueOf = String.valueOf(r132.A06.A00);
            AnonymousClass18L r0 = new AnonymousClass18L(r132);
            AnonymousClass3YD A002 = AnonymousClass3O4.A00(userSession, valueOf);
            C13330nS A022 = C13330nS.A02(userSession);
            AnonymousClass4Xz r9 = AnonymousClass4Xz.A00;
            C28291u0 r6 = r0.A01;
            String str = r6.A0D;
            C04220Ms.A06(str);
            AnonymousClass3YD.A01(A002, str, "impressionCount", "lastImpressionTime", "lastImpressionForSurface");
            USLEBaseShape0S0000000 uSLEBaseShape0S0000000 = (USLEBaseShape0S0000000) r9.invoke(A022);
            if (AnonymousClass0wJ.A1U(uSLEBaseShape0S0000000)) {
                String str2 = r6.A0D;
                C04220Ms.A06(str2);
                uSLEBaseShape0S0000000.A0S("promotion_id", AnonymousClass0wJ.A0d(str2));
                uSLEBaseShape0S0000000.A0S("context_surface_id", AnonymousClass0wJ.A0d(valueOf));
                String str3 = r6.A0C;
                if (str3 == null) {
                    str3 = "";
                }
                uSLEBaseShape0S0000000.A0T("plain_instance_log_data", str3);
                uSLEBaseShape0S0000000.A0V("extra_client_data", (Map) null);
                uSLEBaseShape0S0000000.Bb4();
            }
            this.A08.BQn(r132, quickPromotionSlot);
            Context context = this.A04;
            C28221tt r1 = r132.A08;
            AnonymousClass3CQ r02 = r1.A01;
            AnonymousClass3CQ r4 = r1.A02;
            if (r02 == null || !(AnonymousClass268.A0S == (A012 = AnonymousClass268.A01(r02.A03, EnumSet.allOf(AnonymousClass268.class))) || AnonymousClass268.A0T == A012)) {
                if (r4 != null) {
                    AnonymousClass268 A014 = AnonymousClass268.A01(r4.A03, EnumSet.allOf(AnonymousClass268.class));
                    if (AnonymousClass268.A0S != A014) {
                        if (AnonymousClass268.A0T == A014) {
                        }
                    }
                }
            }
            C37743K2d.A00(userSession).A01(context);
        }
    }

    public final void A01() {
        if (!(this instanceof C28311u3)) {
            A02(new AnonymousClass3UU());
        }
    }

    public final void A02(AnonymousClass3UU r7) {
        try {
            if (Systrace.A0F(1)) {
                C13930oX.A01("onScreenLoadTriggered", -886822871);
            }
            QuickPromotionSlot quickPromotionSlot = this.A0A;
            C04220Ms.A0B(quickPromotionSlot, 0);
            Set<Trigger> set = (Set) M5W.A00.get(quickPromotionSlot);
            if (set == null || set.isEmpty()) {
                C10450iM.A03("IG-QP", "onScreenLoadTriggered() was called but is not valid for this slot.");
            } else {
                this.A09.ANI(set, "screen_load_trigger");
                for (Trigger trigger : set) {
                    trigger.A00 = r7;
                }
                A00(this, r7.A01, set, false);
            }
        } finally {
            if (Systrace.A0F(1)) {
                C13930oX.A00(-802228270);
            }
        }
    }

    public final void A04(Map map) {
        A02(new AnonymousClass3UU(map));
    }

    public final void C9K(C81644o8 r3, boolean z) {
        Integer num;
        C28291u0 r32 = (C28291u0) r3;
        if (r32.A08.A02 != null) {
            UserSession userSession = this.A0E;
            if (z) {
                num = AnonymousClass006.A0N;
            } else {
                num = AnonymousClass006.A0C;
            }
            A03(r32, userSession, num);
            this.A08.BQn(r32, this.A0A);
            C82914qT r0 = this.A07.A08;
            if (r0 != null) {
                r0.ACu();
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:199:0x01f9 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x01fb A[Catch:{ all -> 0x0114 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void CDe(X.AnonymousClass3UU r31, X.AnonymousClass3VC r32, java.util.Map r33) {
        /*
            r30 = this;
            r1 = r30
            monitor-enter(r1)
            X.4tR r5 = r1.A09     // Catch:{ all -> 0x04a0 }
            java.lang.String r0 = "promotion_available"
            r5.ANG(r0)     // Catch:{ all -> 0x04a0 }
            java.util.Set r0 = r1.A0G     // Catch:{ all -> 0x04a0 }
            r0.clear()     // Catch:{ all -> 0x04a0 }
            X.3GL r2 = r1.A07     // Catch:{ all -> 0x04a0 }
            X.4qT r0 = r2.A08     // Catch:{ all -> 0x04a0 }
            if (r0 == 0) goto L_0x0018
            r0.ACu()     // Catch:{ all -> 0x04a0 }
        L_0x0018:
            X.4Ga r0 = r1.A06     // Catch:{ all -> 0x04a0 }
            r29 = r0
            r7 = 0
            com.instagram.quickpromotion.intf.QuickPromotionSlot r0 = r1.A0A     // Catch:{ all -> 0x04a0 }
            r28 = r0
            java.lang.String r19 = r28.toString()     // Catch:{ all -> 0x04a0 }
            r10 = r32
            r11 = r33
            r3 = r29
            r0 = r19
            r3.BdJ(r10, r7, r0, r11)     // Catch:{ all -> 0x04a0 }
            java.lang.String r0 = "clash_manage_in_progress"
            r5.ANG(r0)     // Catch:{ all -> 0x04a0 }
            X.3UV r0 = r1.A0D     // Catch:{ all -> 0x04a0 }
            com.instagram.quickpromotion.intf.QuickPromotionSurface r3 = r0.A00     // Catch:{ all -> 0x04a0 }
            X.39L r0 = r1.A0C     // Catch:{ all -> 0x04a0 }
            X.4TU r9 = new X.4TU     // Catch:{ all -> 0x04a0 }
            r9.<init>(r3, r0)     // Catch:{ all -> 0x04a0 }
            int r0 = r10.A00     // Catch:{ all -> 0x04a0 }
            java.util.ArrayList r17 = X.C18240wQ.A0k(r0)     // Catch:{ all -> 0x04a0 }
            java.util.Map r0 = r10.A02     // Catch:{ all -> 0x04a0 }
            java.util.Set r0 = r0.keySet()     // Catch:{ all -> 0x04a0 }
            java.util.ArrayList r15 = X.C18200wM.A0s(r0)     // Catch:{ all -> 0x04a0 }
            X.3Bf r8 = r1.A00     // Catch:{ all -> 0x04a0 }
            if (r8 == 0) goto L_0x005b
            java.util.List r3 = r8.A00     // Catch:{ all -> 0x04a0 }
            r0 = r17
            r0.addAll(r3)     // Catch:{ all -> 0x04a0 }
        L_0x005b:
            r1.A00 = r7     // Catch:{ all -> 0x04a0 }
            boolean r0 = r10.A01     // Catch:{ all -> 0x04a0 }
            java.util.Iterator r14 = r15.iterator()     // Catch:{ all -> 0x04a0 }
            if (r0 == 0) goto L_0x007b
        L_0x0065:
            boolean r0 = r14.hasNext()     // Catch:{ all -> 0x04a0 }
            if (r0 == 0) goto L_0x0118
            java.lang.Object r0 = r14.next()     // Catch:{ all -> 0x04a0 }
            com.instagram.quickpromotion.intf.QuickPromotionSurface r0 = (com.instagram.quickpromotion.intf.QuickPromotionSurface) r0     // Catch:{ all -> 0x04a0 }
            java.util.List r3 = r10.A00(r0)     // Catch:{ all -> 0x04a0 }
            r0 = r17
            r0.addAll(r3)     // Catch:{ all -> 0x04a0 }
            goto L_0x0065
        L_0x007b:
            boolean r0 = r14.hasNext()     // Catch:{ all -> 0x04a0 }
            if (r0 == 0) goto L_0x0118
            java.lang.Object r6 = r14.next()     // Catch:{ all -> 0x04a0 }
            com.instagram.quickpromotion.intf.QuickPromotionSurface r6 = (com.instagram.quickpromotion.intf.QuickPromotionSurface) r6     // Catch:{ all -> 0x04a0 }
            java.lang.Object r4 = r11.get(r6)     // Catch:{ all -> 0x04a0 }
            java.util.Set r4 = (java.util.Set) r4     // Catch:{ all -> 0x04a0 }
            r3 = 1
            X.3Ua r13 = r1.A01     // Catch:{ all -> 0x04a0 }
            if (r4 != 0) goto L_0x0096
            java.util.Set r4 = java.util.Collections.emptySet()     // Catch:{ all -> 0x04a0 }
        L_0x0096:
            int r0 = r6.A00     // Catch:{ all -> 0x04a0 }
            java.lang.String r24 = java.lang.Integer.toString(r0)     // Catch:{ all -> 0x04a0 }
            android.content.Context r12 = r1.A04     // Catch:{ all -> 0x04a0 }
            com.instagram.service.session.UserSession r0 = r1.A0E     // Catch:{ all -> 0x04a0 }
            r26 = 0
            r22 = r31
            r21 = r12
            r23 = r0
            r25 = r4
            r20 = r13
            X.1Pw r4 = r20.A00(r21, r22, r23, r24, r25, r26)     // Catch:{ all -> 0x04a0 }
            java.util.List r6 = r10.A00(r6)     // Catch:{ all -> 0x04a0 }
            X.C04220Ms.A0B(r6, r3)     // Catch:{ all -> 0x04a0 }
            X.4a6 r0 = X.C74244a6.A00     // Catch:{ all -> 0x04a0 }
            X.3H6 r3 = new X.3H6     // Catch:{ all -> 0x04a0 }
            r3.<init>(r0)     // Catch:{ all -> 0x04a0 }
            java.util.ArrayList r12 = X.AnonymousClass0wJ.A0v()     // Catch:{ all -> 0x04a0 }
            java.util.Iterator r13 = r6.iterator()     // Catch:{ all -> 0x04a0 }
        L_0x00c6:
            boolean r0 = r13.hasNext()     // Catch:{ all -> 0x04a0 }
            if (r0 == 0) goto L_0x00e1
            java.lang.Object r6 = r13.next()     // Catch:{ all -> 0x04a0 }
            X.4o8 r6 = (X.C81644o8) r6     // Catch:{ all -> 0x04a0 }
            boolean r0 = r6 instanceof X.C28291u0     // Catch:{ all -> 0x04a0 }
            if (r0 == 0) goto L_0x00c6
            X.1u0 r6 = (X.C28291u0) r6     // Catch:{ all -> 0x04a0 }
            X.18L r0 = new X.18L     // Catch:{ all -> 0x04a0 }
            r0.<init>(r6)     // Catch:{ all -> 0x04a0 }
            r12.add(r0)     // Catch:{ all -> 0x04a0 }
            goto L_0x00c6
        L_0x00e1:
            boolean r0 = r12.isEmpty()     // Catch:{ all -> 0x04a0 }
            if (r0 == 0) goto L_0x00ef
            X.0ZV r4 = X.AnonymousClass0ZV.A00     // Catch:{ all -> 0x04a0 }
        L_0x00e9:
            r0 = r17
            r0.addAll(r4)     // Catch:{ all -> 0x04a0 }
            goto L_0x007b
        L_0x00ef:
            r3.A02(r12)     // Catch:{ all -> 0x04a0 }
            monitor-enter(r3)     // Catch:{ all -> 0x04a0 }
            com.google.common.collect.ImmutableList r0 = r3.A00     // Catch:{ all -> 0x0114 }
            java.util.List r0 = r3.A01(r4, r0)     // Catch:{ all -> 0x0114 }
            monitor-exit(r3)     // Catch:{ all -> 0x04a0 }
            java.util.ArrayList r4 = X.AnonymousClass0wJ.A0w(r0)     // Catch:{ all -> 0x04a0 }
            java.util.Iterator r3 = r0.iterator()     // Catch:{ all -> 0x04a0 }
        L_0x0102:
            boolean r0 = r3.hasNext()     // Catch:{ all -> 0x04a0 }
            if (r0 == 0) goto L_0x00e9
            java.lang.Object r0 = r3.next()     // Catch:{ all -> 0x04a0 }
            X.18L r0 = (X.AnonymousClass18L) r0     // Catch:{ all -> 0x04a0 }
            X.1u0 r0 = r0.A01     // Catch:{ all -> 0x04a0 }
            r4.add(r0)     // Catch:{ all -> 0x04a0 }
            goto L_0x0102
        L_0x0114:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x04a0 }
            goto L_0x029e
        L_0x0118:
            r0 = r17
            java.util.Collections.sort(r0, r9)     // Catch:{ all -> 0x04a0 }
            java.util.Set r16 = java.util.Collections.emptySet()     // Catch:{ all -> 0x04a0 }
            if (r8 == 0) goto L_0x0129
            java.util.Map r0 = r8.A01     // Catch:{ all -> 0x04a0 }
            java.util.Collection r16 = r0.values()     // Catch:{ all -> 0x04a0 }
        L_0x0129:
            r11 = r29
            r12 = r10
            r13 = r7
            r14 = r19
            r11.Bbi(r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x04a0 }
            com.instagram.service.session.UserSession r9 = r1.A0E     // Catch:{ all -> 0x04a0 }
            android.content.Context r6 = r1.A04     // Catch:{ all -> 0x04a0 }
            X.0kW r0 = r1.A05     // Catch:{ all -> 0x04a0 }
            r26 = r0
            r8 = 0
            r2.A0B = r8     // Catch:{ all -> 0x04a0 }
            X.4rq r0 = r2.A07     // Catch:{ all -> 0x04a0 }
            if (r0 == 0) goto L_0x0144
            r0.C9n(r7)     // Catch:{ all -> 0x04a0 }
        L_0x0144:
            java.util.HashSet r4 = X.C18200wM.A0u()     // Catch:{ all -> 0x04a0 }
            java.util.HashSet r3 = X.C18200wM.A0u()     // Catch:{ all -> 0x04a0 }
            java.util.Iterator r16 = r17.iterator()     // Catch:{ all -> 0x04a0 }
            r18 = 0
        L_0x0152:
            boolean r0 = r16.hasNext()     // Catch:{ all -> 0x04a0 }
            if (r0 == 0) goto L_0x039b
            java.lang.Object r0 = r16.next()     // Catch:{ all -> 0x04a0 }
            X.4o8 r0 = (X.C81644o8) r0     // Catch:{ all -> 0x04a0 }
            r12 = r0
            X.1u0 r12 = (X.C28291u0) r12     // Catch:{ all -> 0x04a0 }
            com.instagram.quickpromotion.intf.QuickPromotionSurface r11 = r12.A06     // Catch:{ all -> 0x04a0 }
            com.instagram.quickpromotion.intf.QuickPromotionSurface r10 = com.instagram.quickpromotion.intf.QuickPromotionSurface.MEGAPHONE     // Catch:{ all -> 0x04a0 }
            if (r10 == r11) goto L_0x0365
            com.instagram.quickpromotion.intf.QuickPromotionSurface r10 = com.instagram.quickpromotion.intf.QuickPromotionSurface.BARCELONA_MEGAPHONE     // Catch:{ all -> 0x04a0 }
            if (r10 == r11) goto L_0x0365
            com.instagram.quickpromotion.intf.QuickPromotionSurface r13 = com.instagram.quickpromotion.intf.QuickPromotionSurface.TOOLTIP     // Catch:{ all -> 0x04a0 }
            if (r13 != r11) goto L_0x0200
            r11 = r0
            X.1tz r11 = (X.C28281tz) r11     // Catch:{ all -> 0x04a0 }
            X.4rq r10 = r2.A07     // Catch:{ all -> 0x04a0 }
            r12 = 1
            if (r10 == 0) goto L_0x0190
            java.util.Map r10 = r2.A0C     // Catch:{ all -> 0x04a0 }
            java.lang.Object r13 = r10.get(r13)     // Catch:{ all -> 0x04a0 }
            X.47H r13 = (X.AnonymousClass47H) r13     // Catch:{ all -> 0x04a0 }
            if (r13 != 0) goto L_0x0192
            java.lang.String r13 = "QPSurfaceValidator required for tooltip but was not provided. promotion id: "
            java.lang.String r12 = r11.A0D     // Catch:{ all -> 0x04a0 }
            java.lang.String r10 = " will be skipped."
            java.lang.String r12 = X.AnonymousClass00U.A0V(r13, r12, r10)     // Catch:{ all -> 0x04a0 }
            java.lang.String r10 = "IG-QP"
            X.C10450iM.A03(r10, r12)     // Catch:{ all -> 0x04a0 }
        L_0x0190:
            r12 = 0
            goto L_0x01a3
        L_0x0192:
            boolean r10 = r13.A04(r11)     // Catch:{ all -> 0x04a0 }
            if (r10 == 0) goto L_0x0190
            boolean r10 = r13.A03(r11)     // Catch:{ all -> 0x04a0 }
            if (r10 == 0) goto L_0x01b5
            X.4rq r10 = r2.A07     // Catch:{ all -> 0x04a0 }
            r10.CPN(r11)     // Catch:{ all -> 0x04a0 }
        L_0x01a3:
            java.lang.Integer r22 = X.AnonymousClass006.A0Y     // Catch:{ all -> 0x04a0 }
            r25 = r12 ^ 1
            java.lang.String r24 = r28.toString()     // Catch:{ all -> 0x04a0 }
            r20 = r29
            r21 = r11
            r23 = r7
            r20.BcG(r21, r22, r23, r24, r25)     // Catch:{ all -> 0x04a0 }
            goto L_0x01f7
        L_0x01b5:
            X.3Vz r10 = X.C36622Sa.A00()     // Catch:{ all -> 0x04a0 }
            X.44Y r13 = r10.A02(r9)     // Catch:{ all -> 0x04a0 }
            X.C04220Ms.A0B(r11, r8)     // Catch:{ all -> 0x04a0 }
            com.instagram.quickpromotion.intf.QPTooltipAnchor r15 = r11.A00     // Catch:{ all -> 0x04a0 }
            com.instagram.service.session.UserSession r10 = r13.A00     // Catch:{ all -> 0x04a0 }
            X.0nS r13 = X.C13330nS.A01(r13, r10)     // Catch:{ all -> 0x04a0 }
            java.lang.String r10 = "ig_qp_tooltip_no_anchor"
            X.0A2 r13 = X.AnonymousClass0wJ.A0M(r13, r10)     // Catch:{ all -> 0x04a0 }
            r10 = 1409(0x581, float:1.974E-42)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r14 = X.C18180wK.A0I(r13, r10)     // Catch:{ all -> 0x04a0 }
            if (r15 == 0) goto L_0x01da
            java.lang.String r13 = r15.A00     // Catch:{ all -> 0x04a0 }
            if (r13 != 0) goto L_0x01dc
        L_0x01da:
            java.lang.String r13 = "unknown"
        L_0x01dc:
            java.lang.String r10 = "anchor_name"
            r14.A0T(r10, r13)     // Catch:{ all -> 0x04a0 }
            java.lang.String r13 = r11.A0D     // Catch:{ all -> 0x04a0 }
            java.lang.String r10 = "promotion_id"
            r14.A0T(r10, r13)     // Catch:{ all -> 0x04a0 }
            r14.Bb4()     // Catch:{ all -> 0x04a0 }
            boolean r10 = r2.A0B     // Catch:{ all -> 0x04a0 }
            if (r10 != 0) goto L_0x0190
            r2.A0B = r12     // Catch:{ all -> 0x04a0 }
            X.4rq r10 = r2.A07     // Catch:{ all -> 0x04a0 }
            r10.C9n(r11)     // Catch:{ all -> 0x04a0 }
            goto L_0x0190
        L_0x01f7:
            if (r12 == 0) goto L_0x01fb
            goto L_0x0386
        L_0x01fb:
            r3.add(r0)     // Catch:{ all -> 0x04a0 }
            goto L_0x0152
        L_0x0200:
            com.instagram.quickpromotion.intf.QuickPromotionSurface r10 = com.instagram.quickpromotion.intf.QuickPromotionSurface.INTERSTITIAL     // Catch:{ all -> 0x04a0 }
            if (r10 != r11) goto L_0x025f
            X.4qR r11 = r2.A05     // Catch:{ all -> 0x04a0 }
            if (r11 == 0) goto L_0x0222
            java.lang.String r10 = r9.getUserId()     // Catch:{ all -> 0x04a0 }
            r11.C3B(r6, r0, r1, r10)     // Catch:{ all -> 0x04a0 }
        L_0x020f:
            java.lang.Integer r12 = X.AnonymousClass006.A0j     // Catch:{ all -> 0x04a0 }
            java.lang.String r14 = r28.toString()     // Catch:{ all -> 0x04a0 }
            r10 = r29
            r11 = r0
            r13 = r7
            r15 = r8
            r10.BcG(r11, r12, r13, r14, r15)     // Catch:{ all -> 0x04a0 }
            r4.add(r0)     // Catch:{ all -> 0x04a0 }
            goto L_0x0399
        L_0x0222:
            X.3Vz r11 = X.C36622Sa.A00()     // Catch:{ all -> 0x04a0 }
            r10 = r26
            r11.A09(r6, r10, r0, r1)     // Catch:{ all -> 0x04a0 }
            X.C36622Sa.A00()     // Catch:{ all -> 0x04a0 }
            r10 = 2
            X.C04220Ms.A0B(r6, r10)     // Catch:{ all -> 0x04a0 }
            X.AnonymousClass2T6.A00(r6, r0, r1)     // Catch:{ all -> 0x04a0 }
            X.3Vz r11 = X.C36622Sa.A00()     // Catch:{ all -> 0x04a0 }
            r10 = r28
            r11.A0A(r6, r0, r10, r9)     // Catch:{ all -> 0x04a0 }
            X.C36622Sa.A00()     // Catch:{ all -> 0x04a0 }
            X.3Gy r6 = r12.A09     // Catch:{ all -> 0x04a0 }
            java.lang.String r11 = r6.A00     // Catch:{ all -> 0x04a0 }
            int r10 = r11.hashCode()     // Catch:{ all -> 0x04a0 }
            r6 = -731794263(0xffffffffd461b4a9, float:-3.87759446E12)
            if (r10 != r6) goto L_0x020f
            java.lang.String r6 = "instagram_direct_launcher"
            boolean r6 = r11.equals(r6)     // Catch:{ all -> 0x04a0 }
            if (r6 == 0) goto L_0x020f
            r1.CEB(r0)     // Catch:{ all -> 0x04a0 }
            java.lang.Integer r6 = X.AnonymousClass006.A01     // Catch:{ all -> 0x04a0 }
            r1.CE9(r0, r6, r7)     // Catch:{ all -> 0x04a0 }
            goto L_0x020f
        L_0x025f:
            com.instagram.quickpromotion.intf.QuickPromotionSurface r10 = com.instagram.quickpromotion.intf.QuickPromotionSurface.MESSAGE_FOOTER     // Catch:{ all -> 0x04a0 }
            if (r10 != r11) goto L_0x0274
            java.lang.Integer r12 = X.AnonymousClass006.A01     // Catch:{ all -> 0x04a0 }
            r15 = 1
            r10 = r29
            r11 = r0
            r13 = r7
            r14 = r19
            r10.BcG(r11, r12, r13, r14, r15)     // Catch:{ all -> 0x04a0 }
        L_0x026f:
            r3.add(r0)     // Catch:{ all -> 0x04a0 }
            goto L_0x0152
        L_0x0274:
            com.instagram.quickpromotion.intf.QuickPromotionSurface r10 = com.instagram.quickpromotion.intf.QuickPromotionSurface.FLOATING_BANNER     // Catch:{ all -> 0x04a0 }
            if (r10 != r11) goto L_0x028f
            X.35e r10 = r2.A04     // Catch:{ all -> 0x04a0 }
            if (r10 == 0) goto L_0x02b0
            com.instagram.profile.fragment.UserDetailFragment r13 = r10.A00     // Catch:{ all -> 0x04a0 }
            androidx.coordinatorlayout.widget.CoordinatorLayout r11 = r13.A05     // Catch:{ all -> 0x04a0 }
            r10 = 2131300669(0x7f09113d, float:1.8219374E38)
            android.view.ViewGroup r12 = X.C18220wO.A0J(r11, r10)     // Catch:{ all -> 0x04a0 }
            X.7s9 r11 = r13.A0V     // Catch:{ all -> 0x04a0 }
            X.1u4 r10 = r13.A0U     // Catch:{ all -> 0x04a0 }
            r11.A01(r12, r0, r10)     // Catch:{ all -> 0x04a0 }
            goto L_0x02ae
        L_0x028f:
            com.instagram.quickpromotion.intf.QuickPromotionSurface r10 = com.instagram.quickpromotion.intf.QuickPromotionSurface.RTC_PEEK     // Catch:{ all -> 0x04a0 }
            if (r10 != r11) goto L_0x02cb
            X.35x r10 = r2.A09     // Catch:{ all -> 0x04a0 }
            if (r10 == 0) goto L_0x029f
            java.lang.String r2 = "getValue"
            java.lang.NullPointerException r0 = new java.lang.NullPointerException     // Catch:{ all -> 0x04a0 }
            r0.<init>(r2)     // Catch:{ all -> 0x04a0 }
        L_0x029e:
            throw r0     // Catch:{ all -> 0x04a0 }
        L_0x029f:
            java.lang.Integer r12 = X.AnonymousClass006.A0N     // Catch:{ all -> 0x04a0 }
            r15 = 1
            java.lang.String r14 = r28.toString()     // Catch:{ all -> 0x04a0 }
            r10 = r29
            r11 = r0
            r13 = r7
            r10.BcG(r11, r12, r13, r14, r15)     // Catch:{ all -> 0x04a0 }
            goto L_0x026f
        L_0x02ae:
            r10 = 1
            goto L_0x02b1
        L_0x02b0:
            r10 = 0
        L_0x02b1:
            java.lang.Integer r22 = X.AnonymousClass006.A0C     // Catch:{ all -> 0x04a0 }
            r25 = r10 ^ 1
            java.lang.String r24 = r28.toString()     // Catch:{ all -> 0x04a0 }
            r20 = r29
            r21 = r0
            r23 = r7
            r20.BcG(r21, r22, r23, r24, r25)     // Catch:{ all -> 0x04a0 }
            if (r10 == 0) goto L_0x02c6
            goto L_0x038a
        L_0x02c6:
            r3.add(r0)     // Catch:{ all -> 0x04a0 }
            goto L_0x0152
        L_0x02cb:
            com.instagram.quickpromotion.intf.QuickPromotionSurface r10 = com.instagram.quickpromotion.intf.QuickPromotionSurface.REELS_MIDCARD     // Catch:{ all -> 0x04a0 }
            if (r10 != r11) goto L_0x02ed
            X.AKf r10 = r2.A00     // Catch:{ all -> 0x04a0 }
            boolean r10 = X.AnonymousClass0wJ.A1W(r10)
            java.lang.Integer r22 = X.AnonymousClass006.A0u     // Catch:{ all -> 0x04a0 }
            r25 = r10 ^ 1
            r20 = r29
            r21 = r0
            r23 = r7
            r24 = r19
            r20.BcG(r21, r22, r23, r24, r25)     // Catch:{ all -> 0x04a0 }
            if (r10 == 0) goto L_0x02e8
            goto L_0x038e
        L_0x02e8:
            r3.add(r0)     // Catch:{ all -> 0x04a0 }
            goto L_0x0152
        L_0x02ed:
            com.instagram.quickpromotion.intf.QuickPromotionSurface r10 = com.instagram.quickpromotion.intf.QuickPromotionSurface.BOTTOMSHEET     // Catch:{ all -> 0x04a0 }
            if (r10 != r11) goto L_0x0152
            X.38Q r11 = r2.A01     // Catch:{ all -> 0x04a0 }
            if (r11 == 0) goto L_0x034b
            X.E6r r10 = r11.A01     // Catch:{ all -> 0x04a0 }
            com.instagram.service.session.UserSession r10 = r10.A04     // Catch:{ all -> 0x04a0 }
            r20 = r10
            X.Icf r10 = r11.A00     // Catch:{ all -> 0x04a0 }
            androidx.fragment.app.FragmentActivity r13 = r10.getActivity()     // Catch:{ all -> 0x04a0 }
            java.lang.String r10 = "null cannot be cast to non-null type android.app.Activity"
            X.C04220Ms.A0C(r13, r10)     // Catch:{ all -> 0x04a0 }
            r10 = 3
            X.C04220Ms.A0B(r13, r10)     // Catch:{ all -> 0x04a0 }
            java.lang.String r14 = X.AnonymousClass3WT.A00(r12)     // Catch:{ IOException -> 0x030f }
            goto L_0x032a
        L_0x030f:
            r14 = move-exception
            java.lang.String r11 = "QPBottomsheetController"
            r15 = 1
            java.lang.String r10 = r12.A0D     // Catch:{ all -> 0x04a0 }
            java.lang.Object[] r10 = new java.lang.Object[]{r10}     // Catch:{ all -> 0x04a0 }
            java.lang.Object[] r12 = java.util.Arrays.copyOf(r10, r15)     // Catch:{ all -> 0x04a0 }
            java.lang.String r10 = "Error parsing QuickPromotion for bottomsheet: %s"
            java.lang.String r10 = java.lang.String.format(r10, r12)     // Catch:{ all -> 0x04a0 }
            X.C04220Ms.A06(r10)     // Catch:{ all -> 0x04a0 }
            X.AnonymousClass0LU.A0E(r11, r10, r14)     // Catch:{ all -> 0x04a0 }
            r14 = 0
        L_0x032a:
            X.1d5 r12 = new X.1d5     // Catch:{ all -> 0x04a0 }
            r12.<init>()     // Catch:{ all -> 0x04a0 }
            android.os.Bundle r11 = X.C18180wK.A06()     // Catch:{ all -> 0x04a0 }
            java.lang.String r15 = "MAIN_FEED"
            java.lang.String r10 = "promotion_slot"
            r11.putString(r10, r15)     // Catch:{ all -> 0x04a0 }
            java.lang.String r10 = "quick_promotion"
            r11.putString(r10, r14)     // Catch:{ all -> 0x04a0 }
            r12.setArguments(r11)     // Catch:{ all -> 0x04a0 }
            X.Jj9 r10 = X.C18210wN.A0L(r20)     // Catch:{ all -> 0x04a0 }
            X.C18200wM.A16(r13, r12, r10)     // Catch:{ all -> 0x04a0 }
            r10 = 1
            goto L_0x034c
        L_0x034b:
            r10 = 0
        L_0x034c:
            java.lang.Integer r22 = X.AnonymousClass006.A15     // Catch:{ all -> 0x04a0 }
            r25 = r10 ^ 1
            java.lang.String r24 = r28.toString()     // Catch:{ all -> 0x04a0 }
            r20 = r29
            r21 = r0
            r23 = r7
            r20.BcG(r21, r22, r23, r24, r25)     // Catch:{ all -> 0x04a0 }
            if (r10 == 0) goto L_0x0360
            goto L_0x0392
        L_0x0360:
            r3.add(r0)     // Catch:{ all -> 0x04a0 }
            goto L_0x0152
        L_0x0365:
            X.4qS r10 = r2.A06     // Catch:{ all -> 0x04a0 }
            if (r10 == 0) goto L_0x036e
            r10.C6x(r0)     // Catch:{ all -> 0x04a0 }
            r10 = 1
            goto L_0x036f
        L_0x036e:
            r10 = 0
        L_0x036f:
            java.lang.Integer r22 = X.AnonymousClass006.A00     // Catch:{ all -> 0x04a0 }
            r25 = r10 ^ 1
            r20 = r29
            r21 = r0
            r23 = r7
            r24 = r19
            r20.BcG(r21, r22, r23, r24, r25)     // Catch:{ all -> 0x04a0 }
            if (r10 == 0) goto L_0x0381
            goto L_0x0396
        L_0x0381:
            r3.add(r0)     // Catch:{ all -> 0x04a0 }
            goto L_0x0152
        L_0x0386:
            r4.add(r0)     // Catch:{ all -> 0x04a0 }
            goto L_0x0399
        L_0x038a:
            r4.add(r0)     // Catch:{ all -> 0x04a0 }
            goto L_0x0399
        L_0x038e:
            r4.add(r0)     // Catch:{ all -> 0x04a0 }
            goto L_0x0399
        L_0x0392:
            r4.add(r0)     // Catch:{ all -> 0x04a0 }
            goto L_0x0399
        L_0x0396:
            r4.add(r0)     // Catch:{ all -> 0x04a0 }
        L_0x0399:
            r18 = 1
        L_0x039b:
            java.lang.String r0 = "log_resolution"
            r5.ANG(r0)     // Catch:{ all -> 0x04a0 }
            X.3Vz r0 = X.C36622Sa.A00()     // Catch:{ all -> 0x04a0 }
            X.44Y r12 = r0.A02(r9)     // Catch:{ all -> 0x04a0 }
            java.util.Iterator r17 = r17.iterator()     // Catch:{ all -> 0x04a0 }
        L_0x03ac:
            boolean r0 = r17.hasNext()     // Catch:{ all -> 0x04a0 }
            java.lang.String r11 = "resolution"
            if (r0 == 0) goto L_0x047a
            java.lang.Object r10 = r17.next()     // Catch:{ all -> 0x04a0 }
            X.4o8 r10 = (X.C81644o8) r10     // Catch:{ all -> 0x04a0 }
            boolean r0 = r3.contains(r10)     // Catch:{ all -> 0x04a0 }
            if (r0 == 0) goto L_0x0400
            X.C04220Ms.A0B(r10, r8)     // Catch:{ all -> 0x04a0 }
            com.instagram.service.session.UserSession r0 = r12.A00     // Catch:{ all -> 0x04a0 }
            X.0nS r6 = X.C13330nS.A01(r12, r0)     // Catch:{ all -> 0x04a0 }
            java.lang.String r0 = "ig_qp_skipped"
            X.0A2 r6 = X.AnonymousClass0wJ.A0M(r6, r0)     // Catch:{ all -> 0x04a0 }
            r0 = 1406(0x57e, float:1.97E-42)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r9 = X.C18180wK.A0I(r6, r0)     // Catch:{ all -> 0x04a0 }
            r13 = r10
            X.1u0 r13 = (X.C28291u0) r13     // Catch:{ all -> 0x04a0 }
            com.instagram.quickpromotion.intf.QuickPromotionSurface r0 = r13.A06     // Catch:{ all -> 0x04a0 }
            int r0 = r0.A00     // Catch:{ all -> 0x04a0 }
            java.lang.Integer r14 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x04a0 }
            java.lang.String r6 = "surface_id"
            X.0A2 r0 = r9.A00     // Catch:{ all -> 0x04a0 }
            r0.A6J(r6, r14)     // Catch:{ all -> 0x04a0 }
            java.lang.String r6 = r13.A0D     // Catch:{ all -> 0x04a0 }
            java.lang.String r0 = "promotion_id"
            r9.A0T(r0, r6)     // Catch:{ all -> 0x04a0 }
            r9.Bb4()     // Catch:{ all -> 0x04a0 }
            java.lang.String r0 = "skip"
            r5.AND(r10, r11, r0)     // Catch:{ all -> 0x04a0 }
            java.lang.String r9 = r13.A0D     // Catch:{ all -> 0x04a0 }
            boolean r6 = r13.A0K     // Catch:{ all -> 0x04a0 }
            java.lang.String r0 = "client_promotion_skipped"
        L_0x03fc:
            r12.A01(r0, r9, r6)     // Catch:{ all -> 0x04a0 }
            goto L_0x03ac
        L_0x0400:
            boolean r0 = r4.contains(r10)     // Catch:{ all -> 0x04a0 }
            if (r0 == 0) goto L_0x0414
            java.lang.String r0 = "success"
            r5.ANF(r10, r11, r0)     // Catch:{ all -> 0x04a0 }
            X.1u0 r10 = (X.C28291u0) r10     // Catch:{ all -> 0x04a0 }
            java.lang.String r9 = r10.A0D     // Catch:{ all -> 0x04a0 }
            boolean r6 = r10.A0K     // Catch:{ all -> 0x04a0 }
            java.lang.String r0 = "client_promotion_selected"
            goto L_0x03fc
        L_0x0414:
            java.util.Iterator r16 = r4.iterator()     // Catch:{ all -> 0x04a0 }
        L_0x0418:
            boolean r0 = r16.hasNext()     // Catch:{ all -> 0x04a0 }
            if (r0 == 0) goto L_0x03ac
            java.lang.Object r15 = r16.next()     // Catch:{ all -> 0x04a0 }
            X.4o8 r15 = (X.C81644o8) r15     // Catch:{ all -> 0x04a0 }
            X.C18200wM.A1S(r15, r10)     // Catch:{ all -> 0x04a0 }
            com.instagram.service.session.UserSession r0 = r12.A00     // Catch:{ all -> 0x04a0 }
            X.0nS r6 = X.C13330nS.A01(r12, r0)     // Catch:{ all -> 0x04a0 }
            java.lang.String r0 = "ig_qp_clash"
            X.0A2 r6 = X.AnonymousClass0wJ.A0M(r6, r0)     // Catch:{ all -> 0x04a0 }
            r0 = 1405(0x57d, float:1.969E-42)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r9 = X.C18180wK.A0I(r6, r0)     // Catch:{ all -> 0x04a0 }
            r13 = r10
            X.1u0 r13 = (X.C28291u0) r13     // Catch:{ all -> 0x04a0 }
            com.instagram.quickpromotion.intf.QuickPromotionSurface r0 = r13.A06     // Catch:{ all -> 0x04a0 }
            int r0 = r0.A00     // Catch:{ all -> 0x04a0 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x04a0 }
            java.lang.String r0 = "suppressed_surface_id"
            X.0A2 r14 = r9.A00     // Catch:{ all -> 0x04a0 }
            r14.A6J(r0, r6)     // Catch:{ all -> 0x04a0 }
            java.lang.String r6 = r13.A0D     // Catch:{ all -> 0x04a0 }
            java.lang.String r0 = "suppressed_promotion_id"
            r9.A0T(r0, r6)     // Catch:{ all -> 0x04a0 }
            X.1u0 r15 = (X.C28291u0) r15     // Catch:{ all -> 0x04a0 }
            com.instagram.quickpromotion.intf.QuickPromotionSurface r0 = r15.A06     // Catch:{ all -> 0x04a0 }
            int r0 = r0.A00     // Catch:{ all -> 0x04a0 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x04a0 }
            java.lang.String r0 = "surface_id"
            r14.A6J(r0, r6)     // Catch:{ all -> 0x04a0 }
            java.lang.String r6 = r15.A0D     // Catch:{ all -> 0x04a0 }
            java.lang.String r0 = "promotion_id"
            r9.A0T(r0, r6)     // Catch:{ all -> 0x04a0 }
            r9.Bb4()     // Catch:{ all -> 0x04a0 }
            java.lang.String r0 = "suppressed"
            r5.AND(r10, r11, r0)     // Catch:{ all -> 0x04a0 }
            java.lang.String r9 = r13.A0D     // Catch:{ all -> 0x04a0 }
            boolean r6 = r13.A0K     // Catch:{ all -> 0x04a0 }
            java.lang.String r0 = "client_promotion_suppressed"
            r12.A01(r0, r9, r6)     // Catch:{ all -> 0x04a0 }
            goto L_0x0418
        L_0x047a:
            java.lang.String r0 = "not_resolved"
            r5.ANA(r11, r0)     // Catch:{ all -> 0x04a0 }
            r5.ANC()     // Catch:{ all -> 0x04a0 }
            X.4rq r3 = r2.A07     // Catch:{ all -> 0x04a0 }
            if (r3 == 0) goto L_0x048f
            boolean r0 = r2.A0B     // Catch:{ all -> 0x04a0 }
            if (r0 == 0) goto L_0x048f
            if (r18 == 0) goto L_0x048f
            r3.C9n(r7)     // Catch:{ all -> 0x04a0 }
        L_0x048f:
            X.35B r0 = r2.A02     // Catch:{ all -> 0x04a0 }
            if (r0 == 0) goto L_0x0499
            X.E6r r0 = r0.A00     // Catch:{ all -> 0x04a0 }
            X.C26272E6r.A00(r0)     // Catch:{ all -> 0x04a0 }
            throw r7     // Catch:{ all -> 0x04a0 }
        L_0x0499:
            if (r18 != 0) goto L_0x049e
            r2.A00()     // Catch:{ all -> 0x04a0 }
        L_0x049e:
            monitor-exit(r1)
            return
        L_0x04a0:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C70894Gs.CDe(X.3UU, X.3VC, java.util.Map):void");
    }

    public void CE9(C81644o8 r8, Integer num, Map map) {
        AnonymousClass3CQ r2;
        C82914qT r0;
        C28291u0 r82 = (C28291u0) r8;
        Integer num2 = AnonymousClass006.A01;
        C28221tt r02 = r82.A08;
        if (num == num2) {
            r2 = r02.A01;
        } else {
            r2 = r02.A02;
        }
        if (r2 != null) {
            A03(r82, this.A0E, r2.A01);
            String str = r2.A03;
            if (!(str == null || map == null)) {
                Matcher matcher = AnonymousClass308.A00.matcher(str);
                StringBuffer stringBuffer = new StringBuffer();
                while (matcher.find()) {
                    String group = matcher.group(1);
                    if (map.containsKey(group)) {
                        matcher.appendReplacement(stringBuffer, "");
                        stringBuffer.append(C18220wO.A0r(group, map));
                    } else {
                        throw C18190wL.A0a(AnonymousClass00U.A0L("Unknown token ", group));
                    }
                }
                matcher.appendTail(stringBuffer);
                str = stringBuffer.toString();
            }
            C83714rr r1 = this.A0B;
            C82924qU AlJ = r1.AlJ(AnonymousClass268.A01(str, r1.BF6()));
            if (AlJ == null) {
                StringBuilder A0s = C18190wL.A0s("No action handler for url: ");
                A0s.append(str);
                A0s.append("; slot: ");
                C10450iM.A03("IG-QP", C18200wM.A0m(this.A0A, A0s));
                C82914qT r03 = this.A07.A08;
                if (r03 != null) {
                    r03.ACu();
                }
            } else if (str != null) {
                try {
                    Uri A002 = C15430rJ.A00(new C16390sy(), str, false);
                    if (A002 != null) {
                        Bundle A062 = C18180wK.A06();
                        if (map != null) {
                            Iterator A0z = AnonymousClass0wJ.A0z(map);
                            while (A0z.hasNext()) {
                                Map.Entry A0o = C18180wK.A0o(A0z);
                                A062.putString(C18200wM.A0p(A0o), C18230wP.A0u(A0o));
                            }
                        }
                        AlJ.BN1(A002, A062);
                    }
                } catch (IllegalArgumentException unused) {
                    StringBuilder A0s2 = C18190wL.A0s("Cannot parse url: ");
                    A0s2.append(str);
                    A0s2.append("; slot: ");
                    C10450iM.A03("IG-QP", C18200wM.A0m(this.A0A, A0s2));
                }
            }
            this.A08.BQn(r82, this.A0A);
            if (r2.A04 && (r0 = this.A07.A08) != null) {
                r0.ACu();
            }
        }
    }

    public void CEA(C81644o8 r4) {
        C28291u0 r42 = (C28291u0) r4;
        AnonymousClass3CQ r2 = r42.A08.A00;
        if (r2 == null) {
            r2 = new AnonymousClass3CQ();
            r2.A01 = AnonymousClass006.A0N;
            r2.A04 = true;
        }
        A03(r42, this.A0E, r2.A01);
        this.A08.BQn(r42, this.A0A);
        C82914qT r0 = this.A07.A08;
        if (r0 != null) {
            r0.ACu();
        }
    }

    public C70894Gs(Context context, C11630kW r7, C70764Ga r8, AnonymousClass3GL r9, C84384t3 r10, C84574tR r11, QuickPromotionSlot quickPromotionSlot, C83714rr r13, UserSession userSession, C04560Oe r15) {
        AnonymousClass39L r1;
        synchronized (AnonymousClass39L.class) {
            r1 = AnonymousClass39L.A02;
            if (r1 == null) {
                r1 = new AnonymousClass39L(new QuickPromotionSurface[]{QuickPromotionSurface.MEGAPHONE, QuickPromotionSurface.BARCELONA_MEGAPHONE, QuickPromotionSurface.TOOLTIP, QuickPromotionSurface.INTERSTITIAL});
                AnonymousClass39L.A02 = r1;
            }
        }
        this.A0C = r1;
        this.A04 = context;
        this.A0E = userSession;
        this.A05 = r7;
        this.A0A = quickPromotionSlot;
        this.A08 = r10;
        this.A0B = r13;
        this.A07 = r9;
        C28161tl A012 = AnonymousClass3WS.A01(userSession);
        String name = quickPromotionSlot.name();
        C04220Ms.A0B(name, 0);
        this.A0D = new AnonymousClass3UV(C18200wM.A0h(A012.A00, AnonymousClass00U.A0L(name, "_qp_slot_impression_data")));
        this.A0F = new AnonymousClass3F2(new C560935t(userSession));
        this.A06 = r8;
        this.A02 = (InstagramQpSdkModule) userSession.A01(InstagramQpSdkModule.class, new KtLambdaShape95S0100000_I2_75(userSession, 14));
        this.A09 = r11;
        this.A0H = r15;
    }
}
