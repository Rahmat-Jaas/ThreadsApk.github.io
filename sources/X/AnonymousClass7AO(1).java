package X;

import android.os.Bundle;
import com.facebook.redex.IDxSequenceShape670S0100000_I2;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.7AO  reason: invalid class name */
public class AnonymousClass7AO {
    public static final Map A07 = C18220wO.A0y();
    public int A00;
    public AnonymousClass593 A01;
    public String A02;
    public Map A03 = C18220wO.A0y();
    public final C002100y A04 = new C002100y();
    public final String A05;
    public final List A06 = AnonymousClass0wJ.A0v();

    public final void A02(AnonymousClass7EZ r8) {
        C04220Ms.A0B(r8, 0);
        Map A0E = AnonymousClass4WJ.A0E(this.A03);
        LinkedHashMap A0y = C18220wO.A0y();
        Iterator A0z = AnonymousClass0wJ.A0z(A0E);
        while (A0z.hasNext()) {
            Map.Entry A0o = C18180wK.A0o(A0z);
            C115106uW r1 = (C115106uW) A0o.getValue();
            if (!r1.A03 && !r1.A02) {
                C18210wN.A1Q(A0y, A0o);
            }
        }
        Set keySet = A0y.keySet();
        ArrayList A0v = AnonymousClass0wJ.A0v();
        for (Object next : keySet) {
            List list = r8.A05;
            Collection<C106936fs> values = r8.A06.values();
            ArrayList A0v2 = AnonymousClass0wJ.A0v();
            for (C106936fs r0 : values) {
                C000300e.A0r(r0.A01, A0v2);
            }
            C18240wQ.A1N(next, A0v, AnonymousClass00J.A0V(A0v2, list).contains(next) ? 1 : 0);
        }
        if (A0v.isEmpty()) {
            this.A06.add(r8);
            return;
        }
        StringBuilder A0s = C18190wL.A0s("Deep link ");
        A0s.append(r8.A04);
        A0s.append(" can't be used to open destination ");
        A0s.append(this);
        throw C18190wL.A0a(C86104wH.A0x(A0v, ".\nFollowing required arguments are missing: ", A0s));
    }

    public boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (obj == null || !(obj instanceof AnonymousClass7AO)) {
            return false;
        }
        List list = this.A06;
        AnonymousClass7AO r11 = (AnonymousClass7AO) obj;
        boolean A1T = AnonymousClass0wJ.A1T(AnonymousClass00J.A0d(list, r11.A06).size(), list.size());
        C002100y r2 = this.A04;
        int A012 = r2.A01();
        C002100y r4 = r11.A04;
        if (A012 == r4.A01()) {
            Iterator it = AnonymousClass8bL.A09(new C012705x(r2)).iterator();
            while (true) {
                if (!it.hasNext()) {
                    Iterator it2 = AnonymousClass8bL.A09(new C012705x(r4)).iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            z = true;
                            break;
                        }
                        it2.next();
                        if (r2.A03((Object) null) < 0) {
                            break;
                        }
                    }
                } else {
                    it.next();
                    if (r4.A03((Object) null) < 0) {
                        break;
                    }
                }
            }
        } else {
            z = false;
        }
        Map map = this.A03;
        int size = AnonymousClass4WJ.A0E(map).size();
        Map map2 = r11.A03;
        if (size == AnonymousClass4WJ.A0E(map2).size()) {
            Set entrySet = AnonymousClass4WJ.A0E(map).entrySet();
            C04220Ms.A0B(entrySet, 0);
            Iterator it3 = new IDxSequenceShape670S0100000_I2(entrySet, 1).iterator();
            while (true) {
                if (!it3.hasNext()) {
                    Set entrySet2 = AnonymousClass4WJ.A0E(map2).entrySet();
                    C04220Ms.A0B(entrySet2, 0);
                    Iterator it4 = new IDxSequenceShape670S0100000_I2(entrySet2, 1).iterator();
                    while (true) {
                        if (!it4.hasNext()) {
                            z2 = true;
                            break;
                        }
                        Map.Entry A0o = C18180wK.A0o(it4);
                        if (AnonymousClass4WJ.A0E(map).containsKey(A0o.getKey())) {
                            if (!C04220Ms.A0I(AnonymousClass4WJ.A0E(map).get(A0o.getKey()), A0o.getValue())) {
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                } else {
                    Map.Entry A0o2 = C18180wK.A0o(it3);
                    if (AnonymousClass4WJ.A0E(map2).containsKey(A0o2.getKey())) {
                        if (!C04220Ms.A0I(AnonymousClass4WJ.A0E(map2).get(A0o2.getKey()), A0o2.getValue())) {
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
        }
        z2 = false;
        return this.A00 == r11.A00 && C04220Ms.A0I(this.A02, r11.A02) && A1T && z && z2;
    }

    public AnonymousClass7AO(C114586tX r3) {
        this.A05 = C1200478h.A01.A00(r3.getClass());
    }

    public final Bundle A00(Bundle bundle) {
        boolean z;
        if (bundle == null && this.A03.isEmpty()) {
            return null;
        }
        Bundle A062 = C18180wK.A06();
        Map map = this.A03;
        Iterator A0z = AnonymousClass0wJ.A0z(map);
        while (A0z.hasNext()) {
            Map.Entry A0o = C18180wK.A0o(A0z);
            String A0p = C18200wM.A0p(A0o);
            C115106uW r2 = (C115106uW) A0o.getValue();
            C04220Ms.A0B(A0p, 0);
            if (r2.A02) {
                r2.A00.A03(A062, r2.A01, A0p);
            }
        }
        if (bundle == null) {
            return A062;
        }
        A062.putAll(bundle);
        Iterator A0z2 = AnonymousClass0wJ.A0z(map);
        while (A0z2.hasNext()) {
            Map.Entry A0o2 = C18180wK.A0o(A0z2);
            String A0p2 = C18200wM.A0p(A0o2);
            C115106uW r1 = (C115106uW) A0o2.getValue();
            C04220Ms.A0B(A0p2, 0);
            if (r1.A03 || !A062.containsKey(A0p2) || A062.get(A0p2) != null) {
                try {
                    r1.A00.A00(A062, A0p2);
                    z = true;
                    continue;
                } catch (ClassCastException unused) {
                    z = false;
                    continue;
                }
            } else {
                z = false;
                continue;
            }
            if (!z) {
                throw C18190wL.A0a(AnonymousClass00U.A0h("Wrong argument type for '", A0p2, "' in argument bundle. ", r1.A00.A02(), " expected."));
            }
        }
        return A062;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0052, code lost:
        if (r0.equals((java.lang.Object) null) == false) goto L_0x0054;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C134777yK A01(X.C112346pQ r23) {
        /*
            r22 = this;
            r6 = r22
            java.util.List r1 = r6.A06
            boolean r0 = r1.isEmpty()
            r5 = 0
            if (r0 == 0) goto L_0x000c
            return r5
        L_0x000c:
            java.util.Iterator r18 = r1.iterator()
            r4 = r5
        L_0x0011:
            boolean r0 = r18.hasNext()
            if (r0 == 0) goto L_0x0188
            java.lang.Object r3 = r18.next()
            X.7EZ r3 = (X.AnonymousClass7EZ) r3
            r21 = r23
            r0 = r21
            android.net.Uri r9 = r0.A00
            if (r9 == 0) goto L_0x0185
            java.util.Map r0 = r6.A03
            java.util.Map r8 = X.AnonymousClass4WJ.A0E(r0)
            r2 = 1
            X.0Oa r0 = r3.A08
            java.lang.Object r1 = r0.getValue()
            java.util.regex.Pattern r1 = (java.util.regex.Pattern) r1
            if (r1 == 0) goto L_0x0182
            java.lang.String r0 = r9.toString()
            java.util.regex.Matcher r14 = r1.matcher(r0)
            if (r14 == 0) goto L_0x0182
            boolean r0 = r14.matches()
            if (r0 != 0) goto L_0x006b
            r7 = r5
        L_0x0047:
            r0 = r21
            java.lang.String r0 = r0.A01
            if (r0 == 0) goto L_0x0054
            boolean r0 = r0.equals(r5)
            r2 = 1
            if (r0 != 0) goto L_0x0055
        L_0x0054:
            r2 = 0
        L_0x0055:
            if (r7 != 0) goto L_0x005a
            if (r2 != 0) goto L_0x005a
            goto L_0x0011
        L_0x005a:
            X.7yK r1 = new X.7yK
            boolean r0 = r3.A01
            r1.<init>(r7, r6, r0, r2)
            if (r4 == 0) goto L_0x0069
            int r0 = r1.compareTo(r4)
            if (r0 <= 0) goto L_0x0011
        L_0x0069:
            r4 = r1
            goto L_0x0011
        L_0x006b:
            android.os.Bundle r7 = X.C18180wK.A06()
            java.util.List r13 = r3.A05
            int r12 = r13.size()
            r11 = 0
        L_0x0076:
            if (r11 >= r12) goto L_0x00a4
            java.lang.String r10 = X.C18190wL.A0p(r13, r11)
            int r11 = r11 + 1
            java.lang.String r0 = r14.group(r11)
            java.lang.String r15 = android.net.Uri.decode(r0)
            java.lang.Object r0 = r8.get(r10)
            X.6uW r0 = (X.C115106uW) r0
            X.C04220Ms.A06(r15)     // Catch:{ IllegalArgumentException -> 0x00a2 }
            if (r0 == 0) goto L_0x009e
            X.7A8 r1 = r0.A00     // Catch:{ IllegalArgumentException -> 0x00a2 }
            X.C04220Ms.A0B(r10, r2)     // Catch:{ IllegalArgumentException -> 0x00a2 }
            java.lang.Object r0 = r1.A01(r15)     // Catch:{ IllegalArgumentException -> 0x00a2 }
            r1.A03(r7, r0, r10)     // Catch:{ IllegalArgumentException -> 0x00a2 }
            goto L_0x0076
        L_0x009e:
            r7.putString(r10, r15)     // Catch:{ IllegalArgumentException -> 0x00a2 }
            goto L_0x0076
        L_0x00a2:
            r7 = r5
            goto L_0x0047
        L_0x00a4:
            boolean r0 = r3.A02
            if (r0 == 0) goto L_0x0157
            java.util.Map r0 = r3.A06
            r20 = r0
            java.util.Iterator r17 = X.C18220wO.A0x(r20)
        L_0x00b0:
            boolean r0 = r17.hasNext()
            if (r0 == 0) goto L_0x0157
            java.lang.String r1 = X.C18180wK.A0k(r17)
            r0 = r20
            java.lang.Object r12 = r0.get(r1)
            X.6fs r12 = (X.C106936fs) r12
            java.lang.String r10 = r9.getQueryParameter(r1)
            boolean r0 = r3.A03
            if (r0 == 0) goto L_0x00db
            java.lang.String r11 = X.C18190wL.A0n(r9)
            r0 = 63
            java.lang.String r1 = X.AnonymousClass8bP.A0U(r11, r0)
            boolean r0 = X.C04220Ms.A0I(r1, r11)
            if (r0 != 0) goto L_0x00db
            r10 = r1
        L_0x00db:
            if (r10 == 0) goto L_0x00f5
            X.C04220Ms.A0A(r12)
            java.lang.String r1 = r12.A00
            r0 = 32
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r1, r0)
            java.util.regex.Matcher r11 = r0.matcher(r10)
            boolean r0 = r11.matches()
            if (r0 != 0) goto L_0x00f6
            r7 = r5
            goto L_0x0047
        L_0x00f5:
            r11 = r5
        L_0x00f6:
            android.os.Bundle r10 = X.C18180wK.A06()
            X.C04220Ms.A0A(r12)     // Catch:{ IllegalArgumentException -> 0x00b0 }
            java.util.List r0 = r12.A01     // Catch:{ IllegalArgumentException -> 0x00b0 }
            r19 = r0
            int r16 = r19.size()     // Catch:{ IllegalArgumentException -> 0x00b0 }
            r12 = 0
        L_0x0106:
            r0 = r16
            if (r12 >= r0) goto L_0x0152
            if (r11 == 0) goto L_0x010d
            goto L_0x010f
        L_0x010d:
            r14 = r5
            goto L_0x0119
        L_0x010f:
            int r0 = r12 + 1
            java.lang.String r14 = r11.group(r0)     // Catch:{ IllegalArgumentException -> 0x00b0 }
            if (r14 != 0) goto L_0x0119
            java.lang.String r14 = ""
        L_0x0119:
            r0 = r19
            java.lang.String r13 = X.C18190wL.A0p(r0, r12)     // Catch:{ IllegalArgumentException -> 0x00b0 }
            java.lang.Object r1 = r8.get(r13)     // Catch:{ IllegalArgumentException -> 0x00b0 }
            X.6uW r1 = (X.C115106uW) r1     // Catch:{ IllegalArgumentException -> 0x00b0 }
            if (r14 == 0) goto L_0x014f
            java.lang.StringBuilder r15 = X.C18200wM.A0r()     // Catch:{ IllegalArgumentException -> 0x00b0 }
            r0 = 123(0x7b, float:1.72E-43)
            r15.append(r0)     // Catch:{ IllegalArgumentException -> 0x00b0 }
            r15.append(r13)     // Catch:{ IllegalArgumentException -> 0x00b0 }
            java.lang.String r0 = X.C18190wL.A0o(r15)     // Catch:{ IllegalArgumentException -> 0x00b0 }
            boolean r0 = r14.equals(r0)     // Catch:{ IllegalArgumentException -> 0x00b0 }
            if (r0 != 0) goto L_0x014f
            if (r1 == 0) goto L_0x014c
            X.7A8 r1 = r1.A00     // Catch:{ IllegalArgumentException -> 0x00b0 }
            X.C04220Ms.A0B(r13, r2)     // Catch:{ IllegalArgumentException -> 0x00b0 }
            java.lang.Object r0 = r1.A01(r14)     // Catch:{ IllegalArgumentException -> 0x00b0 }
            r1.A03(r10, r0, r13)     // Catch:{ IllegalArgumentException -> 0x00b0 }
            goto L_0x014f
        L_0x014c:
            r10.putString(r13, r14)     // Catch:{ IllegalArgumentException -> 0x00b0 }
        L_0x014f:
            int r12 = r12 + 1
            goto L_0x0106
        L_0x0152:
            r7.putAll(r10)     // Catch:{ IllegalArgumentException -> 0x00b0 }
            goto L_0x00b0
        L_0x0157:
            java.util.Iterator r8 = X.AnonymousClass0wJ.A0z(r8)
        L_0x015b:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x0047
            java.util.Map$Entry r0 = X.C18180wK.A0o(r8)
            java.lang.String r2 = X.C18200wM.A0p(r0)
            java.lang.Object r1 = r0.getValue()
            X.6uW r1 = (X.C115106uW) r1
            if (r1 == 0) goto L_0x015b
            boolean r0 = r1.A03
            if (r0 != 0) goto L_0x015b
            boolean r0 = r1.A02
            if (r0 != 0) goto L_0x015b
            boolean r0 = r7.containsKey(r2)
            if (r0 != 0) goto L_0x015b
            r7 = r5
            goto L_0x0047
        L_0x0182:
            r7 = r5
            goto L_0x0047
        L_0x0185:
            r7 = r5
            goto L_0x0047
        L_0x0188:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7AO.A01(X.6pQ):X.7yK");
    }

    public int hashCode() {
        int A072 = (this.A00 * 31) + C18220wO.A07(this.A02);
        for (AnonymousClass7EZ r0 : this.A06) {
            A072 = ((A072 * 31) + C18220wO.A07(r0.A04)) * 31 * 31;
        }
        C012705x r1 = new C012705x(this.A04);
        if (r1.hasNext()) {
            r1.next();
            throw C18210wN.A0W("getDestinationId");
        }
        Map map = this.A03;
        Iterator A0s = C86154wM.A0s(AnonymousClass4WJ.A0E(map));
        while (A0s.hasNext()) {
            String A0k = C18180wK.A0k(A0s);
            A072 = AnonymousClass0wJ.A07(A0k, A072 * 31) + C18230wP.A05(AnonymousClass4WJ.A0E(map).get(A0k));
        }
        return A072;
    }

    public final void A03(String str) {
        Object obj;
        String str2;
        if (AnonymousClass8bQ.A0m(str)) {
            String A0L = AnonymousClass00U.A0L("android-app://androidx.navigation/", str);
            this.A00 = A0L.hashCode();
            A02(new AnonymousClass7EZ(A0L));
            List list = this.A06;
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                String str3 = ((AnonymousClass7EZ) obj).A04;
                String str4 = this.A02;
                if (str4 != null) {
                    str2 = AnonymousClass00U.A0L("android-app://androidx.navigation/", str4);
                } else {
                    str2 = "";
                }
                if (C04220Ms.A0I(str3, str2)) {
                    break;
                }
            }
            C03940Lk.A00(list).remove(obj);
            this.A02 = str;
            return;
        }
        throw C18190wL.A0a("Cannot have an empty route");
    }

    public String toString() {
        StringBuilder A0r = C18200wM.A0r();
        A0r.append(C18210wN.A0e(this));
        A0r.append("(");
        A0r.append("0x");
        A0r.append(Integer.toHexString(this.A00));
        A0r.append(")");
        String str = this.A02;
        if (str != null && !AnonymousClass8bQ.A0n(str)) {
            A0r.append(" route=");
            A0r.append(this.A02);
        }
        return C18190wL.A0n(A0r);
    }
}
