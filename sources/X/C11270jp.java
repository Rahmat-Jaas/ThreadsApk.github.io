package X;

import ch.boye.httpclientandroidlib.cookie.ClientCookie;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: X.0jp  reason: invalid class name and case insensitive filesystem */
public final class C11270jp {
    public C11390k1 A00;
    public String A01;
    public String A02;
    public String A03;
    public C11210jj A04;
    public String A05;
    public String A06;
    public Map A07 = new HashMap();
    public Set A08 = new HashSet();

    private void A00() {
        int i;
        MMo A082 = C18987Aon.A00.A08(this.A02);
        C40318LcR A0g = A082.A0g();
        C40318LcR lcR = C40318LcR.START_OBJECT;
        if (A0g == lcR) {
            while (true) {
                A082.A0h();
                C40318LcR A0f = A082.A0f();
                if (A0f != C40318LcR.END_OBJECT) {
                    String A0o = A082.A0o();
                    if (A0o != null) {
                        if ("funnel_analytics".equals(A0o)) {
                            A082.A0x();
                        } else if ("blacklist".equals(A0o)) {
                            A01(A082);
                        } else if ("perf".equals(A0o)) {
                            A02(A082);
                        } else if (A0f == lcR) {
                            A09(A082, A0o);
                        } else {
                            A082.A0p();
                            Map map = this.A07;
                            String A0p = A082.A0p();
                            try {
                                i = Integer.parseInt(A0p);
                            } catch (NumberFormatException unused) {
                                C10450iM.A03("MarauderResponse", AnonymousClass00U.A0L("Invalid sample rate format. Expected: int, received: ", A0p));
                                i = 0;
                            }
                            map.put(A0o, Integer.valueOf(i));
                        }
                    }
                } else {
                    return;
                }
            }
        }
    }

    private void A02(MMo mMo) {
        String str = this.A03;
        if ("v3".equals(str)) {
            A03(mMo);
        } else if ("v6".equals(str)) {
            A04(mMo);
        } else if ("v7".equals(str)) {
            A05(mMo);
        } else {
            A09(mMo, "perf");
        }
    }

    public static void A06(MMo mMo, C11210jj r4, String str) {
        String str2 = null;
        if (ClientCookie.VERSION_ATTR.equals(str)) {
            if (mMo.A0f() != C40318LcR.VALUE_NULL) {
                str2 = mMo.A0p();
            }
            r4.A07 = str2;
        } else if ("checksum".equals(str)) {
            if (mMo.A0f() != C40318LcR.VALUE_NULL) {
                str2 = mMo.A0p();
            }
            r4.A00 = str2;
        } else if ("sampling".equals(str)) {
            if (mMo.A0f() != C40318LcR.VALUE_NULL) {
                str2 = mMo.A0p();
            }
            r4.A05 = str2;
        } else if ("metadata".equals(str)) {
            if (mMo.A0f() != C40318LcR.VALUE_NULL) {
                str2 = mMo.A0p();
            }
            r4.A03 = str2;
        }
    }

    public static void A07(MMo mMo, C11210jj r4, String str) {
        String str2 = null;
        if (ClientCookie.VERSION_ATTR.equals(str)) {
            if (mMo.A0f() != C40318LcR.VALUE_NULL) {
                str2 = mMo.A0p();
            }
            r4.A07 = str2;
        } else if ("checksum".equals(str)) {
            if (mMo.A0f() != C40318LcR.VALUE_NULL) {
                str2 = mMo.A0p();
            }
            r4.A00 = str2;
        } else if ("sampling".equals(str)) {
            if (mMo.A0f() != C40318LcR.VALUE_NULL) {
                str2 = mMo.A0p();
            }
            r4.A05 = str2;
        } else if ("metadata".equals(str)) {
            if (mMo.A0f() != C40318LcR.VALUE_NULL) {
                str2 = mMo.A0p();
            }
            r4.A03 = str2;
        } else if ("sampling_method".equals(str)) {
            if (mMo.A0f() != C40318LcR.VALUE_NULL) {
                str2 = mMo.A0p();
            }
            r4.A06 = str2;
        } else if ("pivots".equals(str)) {
            if (mMo.A0f() != C40318LcR.VALUE_NULL) {
                str2 = mMo.A0p();
            }
            r4.A04 = str2;
        } else if ("event_blocklist".equals(str)) {
            if (mMo.A0f() != C40318LcR.VALUE_NULL) {
                str2 = mMo.A0p();
            }
            r4.A02 = str2;
        }
    }

    public static void A08(MMo mMo, C11210jj r4, String str) {
        String str2 = null;
        if (ClientCookie.VERSION_ATTR.equals(str)) {
            if (mMo.A0f() != C40318LcR.VALUE_NULL) {
                str2 = mMo.A0p();
            }
            r4.A07 = str2;
        } else if ("checksum".equals(str)) {
            if (mMo.A0f() != C40318LcR.VALUE_NULL) {
                str2 = mMo.A0p();
            }
            r4.A00 = str2;
        } else if ("sampling".equals(str)) {
            if (mMo.A0f() != C40318LcR.VALUE_NULL) {
                str2 = mMo.A0p();
            }
            r4.A05 = str2;
        } else if ("metadata".equals(str)) {
            if (mMo.A0f() != C40318LcR.VALUE_NULL) {
                str2 = mMo.A0p();
            }
            r4.A03 = str2;
        } else if ("sampling_method".equals(str)) {
            if (mMo.A0f() != C40318LcR.VALUE_NULL) {
                str2 = mMo.A0p();
            }
            r4.A06 = str2;
        } else if ("pivots".equals(str)) {
            if (mMo.A0f() != C40318LcR.VALUE_NULL) {
                str2 = mMo.A0p();
            }
            r4.A04 = str2;
        } else if ("event_blocklist".equals(str)) {
            if (mMo.A0f() != C40318LcR.VALUE_NULL) {
                str2 = mMo.A0p();
            }
            r4.A02 = str2;
        } else if ("crash_resiliency".equals(str)) {
            if (mMo.A0f() != C40318LcR.VALUE_NULL) {
                str2 = mMo.A0p();
            }
            r4.A01 = str2;
        }
    }

    public final void A0A() {
        MMo A082 = C18987Aon.A00.A08(this.A01);
        A082.A0g();
        this.A00 = C11360jy.parseFromJson(A082);
        String str = this.A02;
        if (str != null && !str.equals("")) {
            A00();
        }
    }

    private void A01(MMo mMo) {
        while (true) {
            mMo.A0h();
            if (mMo.A0f() != C40318LcR.END_ARRAY) {
                mMo.A0p();
                this.A08.add(mMo.A0p());
            } else {
                return;
            }
        }
    }

    private void A03(MMo mMo) {
        mMo.A0g();
        this.A04 = new C11210jj();
        while (mMo.A0f() != C40318LcR.END_OBJECT) {
            String A0o = mMo.A0o();
            mMo.A0g();
            A06(mMo, this.A04, A0o);
            mMo.A0x();
            mMo.A0g();
        }
    }

    private void A04(MMo mMo) {
        mMo.A0g();
        this.A04 = new C11210jj();
        while (mMo.A0f() != C40318LcR.END_OBJECT) {
            String A0o = mMo.A0o();
            mMo.A0g();
            A07(mMo, this.A04, A0o);
            mMo.A0x();
            mMo.A0g();
        }
    }

    private void A05(MMo mMo) {
        mMo.A0g();
        this.A04 = new C11210jj();
        while (mMo.A0f() != C40318LcR.END_OBJECT) {
            String A0o = mMo.A0o();
            mMo.A0g();
            A08(mMo, this.A04, A0o);
            mMo.A0x();
            mMo.A0g();
        }
    }

    private void A09(MMo mMo, String str) {
        int i;
        int i2;
        while (true) {
            mMo.A0h();
            C40318LcR A0f = mMo.A0f();
            if (A0f != C40318LcR.END_OBJECT) {
                String A0o = mMo.A0o();
                if ("*".equals(A0o)) {
                    mMo.A0p();
                    Map map = this.A07;
                    String A0p = mMo.A0p();
                    try {
                        i2 = Integer.parseInt(A0p);
                    } catch (NumberFormatException unused) {
                        C10450iM.A03("MarauderResponse", AnonymousClass00U.A0L("Invalid sample rate format. Expected: int, received: ", A0p));
                        i2 = 0;
                    }
                    map.put(str, Integer.valueOf(i2));
                } else {
                    String A0V = AnonymousClass00U.A0V(str, ":", A0o);
                    if (A0f == C40318LcR.START_OBJECT) {
                        A09(mMo, A0V);
                    } else {
                        mMo.A0p();
                        Map map2 = this.A07;
                        String A0p2 = mMo.A0p();
                        try {
                            i = Integer.parseInt(A0p2);
                        } catch (NumberFormatException unused2) {
                            C10450iM.A03("MarauderResponse", AnonymousClass00U.A0L("Invalid sample rate format. Expected: int, received: ", A0p2));
                            i = 0;
                        }
                        map2.put(A0V, Integer.valueOf(i));
                    }
                }
            } else {
                return;
            }
        }
    }
}
