package X;

import com.google.common.collect.ImmutableSet;
import com.google.common.collect.RegularImmutableSet;
import com.instagram.quickpromotion.intf.Trigger;
import java.util.Iterator;

/* renamed from: X.40S  reason: invalid class name */
public final class AnonymousClass40S implements C83324rC {
    public final String DB3() {
        return "client_parameters";
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0034, code lost:
        if (X.C18190wL.A1a(r2) != false) goto L_0x0036;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.AnonymousClass3DC A00(com.google.common.collect.ImmutableSet r3, java.lang.String r4) {
        /*
            if (r4 == 0) goto L_0x0042
            int r0 = r4.length()
            if (r0 == 0) goto L_0x0042
            java.util.HashSet r2 = X.C18200wM.A0u()
            java.util.regex.Pattern r0 = X.AnonymousClass308.A00
            java.util.regex.Matcher r1 = r0.matcher(r4)
        L_0x0012:
            boolean r0 = r1.find()
            if (r0 == 0) goto L_0x0021
            r0 = 1
            java.lang.String r0 = r1.group(r0)
            r2.add(r0)
            goto L_0x0012
        L_0x0021:
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L_0x0042
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L_0x0036
            r2.removeAll(r3)
            boolean r0 = X.C18190wL.A1a(r2)
            if (r0 == 0) goto L_0x0042
        L_0x0036:
            java.lang.String r1 = "failingParameters"
            X.40Z r0 = new X.40Z
            r0.<init>(r2, r1)
            X.3DC r0 = X.AnonymousClass3W5.A01(r0)
            return r0
        L_0x0042:
            X.3DC r0 = X.AnonymousClass3W5.A00()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass40S.A00(com.google.common.collect.ImmutableSet, java.lang.String):X.3DC");
    }

    public final AnonymousClass3DC A8q(AnonymousClass3DQ r6, C81224nO r7) {
        C26743EUq eUq;
        String str;
        String str2;
        C677440f r2;
        C677440f r0;
        String str3;
        boolean A1Y = AnonymousClass0wJ.A1Y(r7, r6);
        ImmutableSet immutableSet = r6.A05;
        if (!immutableSet.isEmpty()) {
            HND A00 = HND.A00(immutableSet);
            Iterator it = ((Iterable) A00.A00.A05(A00)).iterator();
            if (it.hasNext()) {
                eUq = C18220wO.A0R(it.next());
            } else {
                eUq = AnonymousClass5rZ.A00;
            }
            Object A04 = eUq.A04();
            A04.getClass();
            AnonymousClass3UU r02 = ((Trigger) A04).A00;
            if (r02 != null) {
                ImmutableSet keySet = r02.A01.keySet();
                C04220Ms.A0B(keySet, A1Y ? 1 : 0);
                C28221tt r3 = ((AnonymousClass18L) r7).A03.A00;
                C28251tw r03 = r3.A09;
                if (r03 != null) {
                    str = r03.A00;
                } else {
                    str = null;
                }
                C28231tu r04 = r3.A03;
                if (r04 != null) {
                    str2 = r04.A00;
                } else {
                    str2 = null;
                }
                Iterator it2 = C06750aI.A17(str, str2).iterator();
                while (it2.hasNext()) {
                    AnonymousClass3DC A002 = A00(keySet, C18180wK.A0k(it2));
                    if (!A002.A08) {
                        return A002;
                    }
                }
                AnonymousClass3CQ r05 = r3.A01;
                if (r05 != null) {
                    r2 = new C677440f(r05);
                } else {
                    r2 = null;
                }
                AnonymousClass3CQ r1 = r3.A02;
                if (r1 != null) {
                    r0 = new C677440f(r1);
                } else {
                    r0 = null;
                }
                for (C81234nP r06 : C06750aI.A17(r2, r0)) {
                    if (r06 != null) {
                        AnonymousClass3CQ r22 = ((C677440f) r06).A00;
                        C28251tw r07 = r22.A00;
                        if (r07 != null) {
                            str3 = r07.A00;
                        } else {
                            str3 = null;
                        }
                        Iterator it3 = C06750aI.A17(str3, r22.A03).iterator();
                        while (it3.hasNext()) {
                            AnonymousClass3DC A003 = A00(keySet, C18180wK.A0k(it3));
                            if (!A003.A08) {
                                return A003;
                            }
                        }
                        continue;
                    }
                }
                return AnonymousClass3W5.A00();
            }
        }
        C04220Ms.A06(RegularImmutableSet.A03);
        return AnonymousClass3W5.A00();
    }
}
