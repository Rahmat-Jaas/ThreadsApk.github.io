package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.0vw  reason: invalid class name and case insensitive filesystem */
public final class C18020vw {
    public final AnonymousClass0IB A00;
    public final C12440lu A01;
    public final C04560Oe A02;

    public static C17960vq A02(MIS mis, String str) {
        C12390lo r6 = new C12390lo();
        C12390lo r5 = new C12390lo();
        MMo A08 = mis.A08(str);
        if (A08.A0g() == C40318LcR.START_OBJECT) {
            A08.A0h();
            long j = 0;
            while (A08.A0f() != C40318LcR.END_OBJECT) {
                String A0o = A08.A0o();
                if ("*".equals(A0o)) {
                    j = A08.A0u().longValue();
                } else {
                    A08(r6, r5, A08, A0o);
                }
                A08.A0h();
            }
            return new C12200lV(r6, r5, j);
        }
        throw new IllegalArgumentException();
    }

    public static C17970vr A03(AnonymousClass0IB r5, MIS mis, String str, String str2) {
        C12380ln r4 = new C12380ln();
        C12380ln r3 = new C12380ln();
        C12380ln r2 = new C12380ln();
        int A002 = A00(r5, r4, r3, mis, str);
        A07(r2, mis, str2);
        return new C17970vr(r4, r3, r2, A002);
    }

    public C18020vw(AnonymousClass0IB r1, C12440lu r2, C04560Oe r3) {
        this.A02 = r3;
        this.A00 = r1;
        this.A01 = r2;
    }

    public static int A00(AnonymousClass0IB r7, C04730Ow r8, C04730Ow r9, MIS mis, String str) {
        MMo A08 = mis.A08(str);
        if (A08.A0g() == C40318LcR.START_OBJECT) {
            A08.A0h();
            int i = 0;
            while (A08.A0f() != C40318LcR.END_OBJECT) {
                String A0o = A08.A0o();
                if ("*".equals(A0o)) {
                    long A0a = A08.A0a();
                    if (A0a > 2147483647L) {
                        r7.CuW("IMPACT_LEGACY_FAIL_HARDER::qpl", "We do not support 64 bit integer samples/metadata, change code to support it");
                    }
                    i = (int) A0a;
                } else {
                    A06(r7, r8, r9, A08, A0o);
                }
                A08.A0h();
            }
            return i;
        }
        throw new IllegalArgumentException();
    }

    public static C17950vp A01(MIS mis, String str) {
        MMo A08 = mis.A08(str);
        if (A08.A0g() == C40318LcR.START_ARRAY) {
            ArrayList arrayList = new ArrayList();
            while (A08.A0g() != C40318LcR.END_ARRAY) {
                arrayList.add(Integer.valueOf(A08.A0X()));
            }
            int[] iArr = new int[arrayList.size()];
            for (int i = 0; i < arrayList.size(); i++) {
                iArr[i] = ((Number) arrayList.get(i)).intValue();
            }
            return new C17950vp(iArr);
        }
        throw new IllegalArgumentException("Unsupported format for eventBlocklist: expecting array of integers");
    }

    public static C17990vt A04(MIS mis, String str) {
        MMo A08 = mis.A08(str);
        C40318LcR A0g = A08.A0g();
        C40318LcR lcR = C40318LcR.START_OBJECT;
        if (A0g == lcR) {
            C17990vt r4 = new C17990vt();
            while (true) {
                C40318LcR A0g2 = A08.A0g();
                C40318LcR lcR2 = C40318LcR.END_OBJECT;
                if (A0g2 == lcR2) {
                    return r4;
                }
                String A0o = A08.A0o();
                if (A08.A0g() == lcR) {
                    int parseInt = Integer.parseInt(A0o);
                    C17980vs r2 = new C17980vs();
                    r4.A00.put(parseInt, r2);
                    while (A08.A0g() != lcR2) {
                        r2.put(A08.A0o(), Integer.valueOf(A08.A0Z()));
                    }
                } else {
                    throw new IllegalArgumentException("Invalid value of pivotHost: expecting dict[string => int]");
                }
            }
        } else {
            throw new IllegalArgumentException("Unsupported format for pivots: expecting dict[int => dict[string => int]]");
        }
    }

    public static C12220lX A05(MIS mis, String str) {
        MMo A08 = mis.A08(str);
        C40318LcR A0g = A08.A0g();
        C40318LcR lcR = C40318LcR.START_OBJECT;
        if (A0g == lcR) {
            C18030vz r6 = null;
            while (true) {
                C40318LcR A0g2 = A08.A0g();
                C40318LcR lcR2 = C40318LcR.END_OBJECT;
                if (A0g2 != lcR2) {
                    if (A08.A0f() == C40318LcR.FIELD_NAME) {
                        try {
                            int parseInt = Integer.parseInt(A08.A0o());
                            if (A08.A0g() == lcR) {
                                String[] strArr = null;
                                String[] strArr2 = null;
                                while (A08.A0g() != lcR2) {
                                    String A0o = A08.A0o();
                                    if (A0o.equals("points")) {
                                        strArr2 = A09(A08);
                                    } else if (A0o.equals("annotations")) {
                                        strArr = A09(A08);
                                    } else {
                                        StringBuilder sb = new StringBuilder("Invalid content of the marker config in crash resiliency: only annotations or points are allowed at ");
                                        sb.append(A08.A0d());
                                        throw new IllegalArgumentException(sb.toString());
                                    }
                                }
                                if (r6 == null) {
                                    r6 = new C18030vz();
                                }
                                r6.A00(strArr, strArr2, parseInt);
                            } else {
                                StringBuilder sb2 = new StringBuilder("Invalid value of crashResiliency: expecting dict[?annotations => vec[string], ?points => vec[string]] at ");
                                sb2.append(A08.A0d());
                                throw new IllegalArgumentException(sb2.toString());
                            }
                        } catch (NumberFormatException unused) {
                            StringBuilder sb3 = new StringBuilder("Invalid format of crashResiliency: each key should be an integer (markerId) at ");
                            sb3.append(A08.A0d());
                            throw new IllegalArgumentException(sb3.toString());
                        }
                    } else {
                        StringBuilder sb4 = new StringBuilder("Unsupported format for crashResiliency: expecting field name at ");
                        sb4.append(A08.A0d());
                        throw new IllegalArgumentException(sb4.toString());
                    }
                } else if (r6 == null) {
                    return null;
                } else {
                    AnonymousClass0Jz r2 = r6.A00;
                    C12400lq r1 = (C12400lq) r2;
                    r1.A00 = true;
                    r1.size();
                    return new C12220lX(r2);
                }
            }
        } else {
            StringBuilder sb5 = new StringBuilder("Unsupported format for crashResiliency: expecting object at ");
            sb5.append(A08.A0d());
            throw new IllegalArgumentException(sb5.toString());
        }
    }

    public static void A06(AnonymousClass0IB r9, C04730Ow r10, C04730Ow r11, MMo mMo, String str) {
        int i;
        short parseShort = Short.parseShort(str);
        if (mMo.A0f().A02()) {
            i = mMo.A0U();
        } else {
            mMo.A0h();
            i = -1;
            while (mMo.A0f() != C40318LcR.END_OBJECT) {
                String A0o = mMo.A0o();
                long A0a = mMo.A0a();
                if (A0a > 2147483647L) {
                    r9.CuW("qpl", "We do not support 64 bit integer samples/metadata, change code to support it");
                }
                int i2 = (int) A0a;
                if ("*".equals(A0o)) {
                    i = i2;
                } else {
                    r11.put((parseShort << 16) | Short.parseShort(A0o), i2);
                }
                mMo.A0h();
            }
        }
        if (i != -1) {
            r10.put(parseShort, i);
        }
    }

    public static void A07(C04730Ow r8, MIS mis, String str) {
        MMo A08 = mis.A08(str);
        if (A08.A0g() != C40318LcR.START_OBJECT) {
            throw new IllegalArgumentException();
        }
        while (true) {
            A08.A0h();
            C40318LcR A0f = A08.A0f();
            C40318LcR lcR = C40318LcR.END_OBJECT;
            if (A0f != lcR) {
                short parseShort = Short.parseShort(A08.A0o());
                while (true) {
                    A08.A0h();
                    if (A08.A0f() != lcR) {
                        short parseShort2 = (parseShort << 16) | Short.parseShort(A08.A0o());
                        A08.A0h();
                        int i = 1;
                        while (A08.A0f() != lcR) {
                            String A0o = A08.A0o();
                            if (A0o.hashCode() == 3575610 && A0o.equals("type")) {
                                i = A08.A0U();
                            }
                            A08.A0h();
                        }
                        if (i == 3) {
                            r8.put(parseShort2, i);
                        }
                    }
                }
            } else {
                return;
            }
        }
    }

    public static void A08(AnonymousClass0K1 r9, AnonymousClass0K1 r10, MMo mMo, String str) {
        long j;
        short parseShort = Short.parseShort(str);
        if (mMo.A0f().A02()) {
            j = (long) mMo.A0U();
        } else {
            mMo.A0h();
            j = -1;
            while (mMo.A0f() != C40318LcR.END_OBJECT) {
                String A0o = mMo.A0o();
                long longValue = mMo.A0u().longValue();
                if ("*".equals(A0o)) {
                    j = longValue;
                } else {
                    r10.put((parseShort << 16) | Short.parseShort(A0o), longValue);
                }
                mMo.A0h();
            }
        }
        if (j != -1) {
            r9.put(parseShort, j);
        }
    }

    public static String[] A09(MMo mMo) {
        if (mMo.A0g() == C40318LcR.START_ARRAY) {
            ArrayList arrayList = null;
            while (mMo.A0g() != C40318LcR.END_ARRAY) {
                if (mMo.A0f() == C40318LcR.VALUE_STRING) {
                    String A0q = mMo.A0q();
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(A0q);
                } else {
                    StringBuilder sb = new StringBuilder("expecting array of strings at ");
                    sb.append(mMo.A0d());
                    throw new IllegalArgumentException(sb.toString());
                }
            }
            if (arrayList == null) {
                return null;
            }
            return (String[]) arrayList.toArray(new String[0]);
        }
        StringBuilder sb2 = new StringBuilder("Unsupported format: expecting array of strings at ");
        sb2.append(mMo.A0d());
        throw new IllegalArgumentException(sb2.toString());
    }

    public final C18000vu A0A(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        C17970vr r6;
        AnonymousClass0IB r3;
        C17960vq r5;
        C17990vt r7;
        C17950vp r4;
        C12220lX r8 = null;
        if (!"v7".equals(str)) {
            return null;
        }
        try {
            r3 = this.A00;
            r6 = A03(r3, (MIS) this.A02.get(), str2, str3);
        } catch (IOException | NullPointerException | NumberFormatException e) {
            r3 = this.A00;
            r3.CuY("qpl", "failed to read sampling config", e);
            r6 = new C17970vr((C04730Ow) null, (C04730Ow) null, (C04730Ow) null, 0);
        }
        try {
            r5 = A02((MIS) this.A02.get(), str4);
        } catch (IOException | NullPointerException | NumberFormatException e2) {
            r3.CuY("qpl", "failed to read metadata config", e2);
            r5 = null;
        }
        try {
            r7 = A04((MIS) this.A02.get(), str5);
        } catch (IOException | IllegalArgumentException | NullPointerException e3) {
            r3.CuY("qpl", "failed to read pivots mapping", e3);
            r7 = null;
        }
        try {
            r4 = A01((MIS) this.A02.get(), str6);
        } catch (IOException | IllegalArgumentException | NullPointerException e4) {
            r3.CuY("qpl", "failed to read event blocklist", e4);
            r4 = new C17950vp(new int[0]);
        }
        String str10 = str9;
        if (str9 != null) {
            try {
                r8 = A05((MIS) this.A02.get(), str10);
            } catch (IOException | IllegalArgumentException | NullPointerException e5) {
                r3.CuY("qpl", "failed to read crash resiliency config", e5);
            }
        }
        return new C18000vu(r4, r5, r6, r7, r8, str8, str7);
    }
}
