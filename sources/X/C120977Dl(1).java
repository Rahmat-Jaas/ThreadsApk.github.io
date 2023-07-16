package X;

import com.facebook.redex.IDxSCallbackShape852S0100000_2_I2;
import java.util.Collections;
import java.util.Map;
import java.util.Set;

/* renamed from: X.7Dl  reason: invalid class name and case insensitive filesystem */
public final class C120977Dl {
    public String A00;
    public final C107416gi A01;
    public final Object A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final Map A07;
    public final Set A08;

    public static C120977Dl A01(AnonymousClass7HL r5, Object obj, String str, Map map, Set set) {
        return A00(new IDxSCallbackShape852S0100000_2_I2(r5, 1), obj, str, (String) null, (String) null, (String) null, (String) null, map, set);
    }

    public static C120977Dl A00(C143698hA r1, Object obj, String str, String str2, String str3, String str4, String str5, Map map, Set set) {
        Set unmodifiableSet;
        Set unmodifiableSet2;
        if (set == null) {
            unmodifiableSet = Collections.emptySet();
        } else {
            unmodifiableSet = Collections.unmodifiableSet(set);
        }
        C107416gi A002 = C116986xw.A00(r1, unmodifiableSet);
        if (set == null) {
            unmodifiableSet2 = Collections.emptySet();
        } else {
            unmodifiableSet2 = Collections.unmodifiableSet(set);
        }
        return new C120977Dl(A002, obj, str, str2, str3, str4, str5, map, unmodifiableSet2);
    }

    public C120977Dl(C107416gi r1, Object obj, String str, String str2, String str3, String str4, String str5, Map map, Set set) {
        this.A03 = str;
        this.A02 = obj;
        this.A08 = set;
        this.A01 = r1;
        this.A07 = map;
        this.A04 = str2;
        this.A05 = str3;
        this.A06 = str4;
        this.A00 = str5;
    }
}
