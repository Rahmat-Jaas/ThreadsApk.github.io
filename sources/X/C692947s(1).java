package X;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* renamed from: X.47s  reason: invalid class name and case insensitive filesystem */
public final class C692947s implements C82414pa {
    public final C82414pa A00;

    public final Object AKb(C63893iY r9, C105926eD r10, C110486ll r11) {
        String str = r10.A00;
        int i = 0;
        switch (str.hashCode()) {
            case -1882328740:
                if (str.equals("bk.action.f32.Sqrt")) {
                    Object A0B = C63893iY.A0B(r9, 0);
                    A0B.getClass();
                    return AnonymousClass3WF.A00(Math.sqrt(((Number) A0B).doubleValue()));
                }
                break;
            case -1666855539:
                if (str.equals("bk.action.string.ToUpperCase")) {
                    return C18190wL.A0q(r9.A00, 0).toUpperCase(Locale.ROOT);
                }
                break;
            case -1225336055:
                if (str.equals("bk.action.string.Contains")) {
                    Object A0B2 = C63893iY.A0B(r9, 0);
                    A0B2.getClass();
                    Object A0B3 = C63893iY.A0B(r9, 1);
                    A0B3.getClass();
                    return Boolean.valueOf(((String) A0B2).contains((String) A0B3));
                }
                break;
            case -965327084:
                if (str.equals("bk.action.string.Join")) {
                    List list = r9.A00;
                    String A0q = C18190wL.A0q(list, 0);
                    list.get(1);
                    List list2 = (List) list.get(1);
                    if (A0q != null) {
                        StringBuilder A0r = C18200wM.A0r();
                        while (i < list2.size()) {
                            String A0p = C18190wL.A0p(list2, i);
                            if (A0p != null) {
                                A0r.append(A0p);
                                if (i < list2.size() - 1) {
                                    A0r.append(A0q);
                                }
                                i++;
                            } else {
                                throw C18190wL.A0a("element must not be null");
                            }
                        }
                        return A0r.toString();
                    }
                    throw C18190wL.A0a("delimeter must not be null");
                }
                break;
            case 944474301:
                if (str.equals("bk.action.map.Filter")) {
                    Object A0B4 = C63893iY.A0B(r9, 0);
                    A0B4.getClass();
                    Object A0B5 = C63893iY.A0B(r9, 1);
                    A0B5.getClass();
                    C105916eC r7 = (C105916eC) A0B5;
                    HashMap A0y = AnonymousClass0wJ.A0y();
                    Iterator A0z = AnonymousClass0wJ.A0z((Map) A0B4);
                    while (A0z.hasNext()) {
                        Map.Entry A0o = C18180wK.A0o(A0z);
                        AnonymousClass3VO A002 = AnonymousClass3VO.A00();
                        A002.A03(A0o.getKey(), 0);
                        try {
                            if (AnonymousClass3WF.A02(AnonymousClass70N.A00(C63893iY.A04(A002, A0o.getValue(), 1), r11, r7.A00))) {
                                C18210wN.A1Q(A0y, A0o);
                            }
                        } catch (AnonymousClass6C9 e) {
                            throw new RuntimeException(e);
                        }
                    }
                    return A0y;
                }
                break;
            case 975567453:
                if (str.equals("bk.action.string.ValueOfNumberInBase")) {
                    Object A0B6 = C63893iY.A0B(r9, 0);
                    A0B6.getClass();
                    long A08 = C18190wL.A08(A0B6);
                    Object A0B7 = C63893iY.A0B(r9, 1);
                    A0B7.getClass();
                    long A04 = (long) AnonymousClass0wJ.A04(A0B7);
                    if (A04 >= 2 && A04 <= 36) {
                        return Long.toString(A08, (int) A04);
                    }
                    throw C18190wL.A0a("radix parameter of string.ValueOfNumberInBase must be between 2 and 36");
                }
                break;
            case 1377663097:
                if (str.equals("bk.action.map.Keys")) {
                    Object A0B8 = C63893iY.A0B(r9, 0);
                    A0B8.getClass();
                    return C18200wM.A0s(((Map) A0B8).keySet());
                }
                break;
            case 1395153511:
                if (str.equals("bk.action.map.Values")) {
                    Object A0B9 = C63893iY.A0B(r9, 0);
                    A0B9.getClass();
                    return C18200wM.A0s(((Map) A0B9).values());
                }
                break;
            case 1740388232:
                if (str.equals("bk.action.f32.Log")) {
                    Object A0B10 = C63893iY.A0B(r9, 0);
                    A0B10.getClass();
                    return AnonymousClass3WF.A00(Math.log(((Number) A0B10).doubleValue()));
                }
                break;
            case 1740392092:
                if (str.equals("bk.action.f32.Pow")) {
                    Object A0B11 = C63893iY.A0B(r9, 0);
                    A0B11.getClass();
                    double doubleValue = ((Number) A0B11).doubleValue();
                    Object A0B12 = C63893iY.A0B(r9, 1);
                    A0B12.getClass();
                    return AnonymousClass3WF.A00(Math.pow(doubleValue, ((Number) A0B12).doubleValue()));
                }
                break;
            case 1867263777:
                if (str.equals("bk.action.string.StartsWith")) {
                    List list3 = r9.A00;
                    return Boolean.valueOf(C18190wL.A0q(list3, 0).startsWith(C18190wL.A0q(list3, 1)));
                }
                break;
            case 1890080876:
                if (str.equals("bk.action.string.ToLowerCase")) {
                    return C18190wL.A0q(r9.A00, 0).toLowerCase(Locale.ROOT);
                }
                break;
        }
        C82414pa r0 = this.A00;
        if (r0 != null) {
            return r0.AKb(r9, r10, r11);
        }
        throw new AnonymousClass4VX(AnonymousClass00U.A0L("unknown function ", str));
    }

    public C692947s(C82414pa r1) {
        this.A00 = r1;
    }
}
