package X;

import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2002000_I2;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.RegularImmutableMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* renamed from: X.4Bq  reason: invalid class name and case insensitive filesystem */
public final class C69964Bq implements C27989Ewd {
    public float A00;
    public Map A01;
    public Map A02;
    public final float A03;
    public final int A04;
    public final Object A05;
    public final C23934D1w A06;

    private final void A00(List list) {
        synchronized (this.A05) {
            ImmutableMap.Builder builder = new ImmutableMap.Builder();
            ImmutableMap.Builder builder2 = new ImmutableMap.Builder();
            int size = list.size();
            for (int i = 0; i < size; i++) {
                List A07 = C81074n3.A07(C18190wL.A0p(list, i), InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, 0);
                if (A07.size() == 3) {
                    String A0p = C18190wL.A0p(A07, 0);
                    builder.put(A0p, Float.valueOf(Float.parseFloat(C18190wL.A0p(A07, 1))));
                    builder2.put(A0p, Float.valueOf(Float.parseFloat(C18190wL.A0p(A07, 2))));
                } else if (A07.size() == 1) {
                    this.A00 = Float.parseFloat(C18190wL.A0p(A07, 0));
                }
            }
            ImmutableMap build = builder.build();
            C04220Ms.A06(build);
            this.A02 = build;
            ImmutableMap build2 = builder2.build();
            C04220Ms.A06(build2);
            this.A01 = build2;
        }
    }

    public final List AMl(String str, boolean z, boolean z2) {
        float f;
        String str2;
        float f2 = this.A03;
        boolean z3 = false;
        if (f2 < 1.0f) {
            synchronized (this.A05) {
                String A012 = C60973Ri.A00.A01(C60973Ri.A05.A01(AnonymousClass8bP.A0L(C60973Ri.A03.A01(C18190wL.A0r(Locale.ROOT, str), " ")).toString(), " "), "0");
                Map map = this.A01;
                C04220Ms.A0B(map, 2);
                ArrayList A0v = AnonymousClass0wJ.A0v();
                List A013 = C120707Cc.A01(A012);
                int i = 1;
                while (true) {
                    ArrayList A0v2 = AnonymousClass0wJ.A0v();
                    int size = (A013.size() - i) + 1;
                    for (int i2 = 0; i2 < size; i2++) {
                        int i3 = i2 + i;
                        StringBuilder A0r = C18200wM.A0r();
                        for (int i4 = i2; i4 < i3; i4++) {
                            if (i4 > i2) {
                                str2 = " ";
                            } else {
                                str2 = "";
                            }
                            C18240wQ.A1P(str2, C18190wL.A0p(A013, i4), A0r);
                        }
                        A0v2.add(C18190wL.A0n(A0r));
                    }
                    A0v.addAll(A0v2);
                    if (i == 3) {
                        break;
                    }
                    i++;
                }
                LinkedHashMap A0y = C18220wO.A0y();
                Iterator it = A0v.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    if (map.containsKey(next)) {
                        Object obj = A0y.get(next);
                        if (obj == null) {
                            obj = Float.valueOf(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
                            A0y.put(next, obj);
                        }
                        C18180wK.A1T(next, A0y, C18240wQ.A00(obj) + ((float) 1));
                    }
                }
                LinkedHashMap A0y2 = C18220wO.A0y();
                Iterator A0u = C18190wL.A0u(A0y);
                while (A0u.hasNext()) {
                    Map.Entry A0o = C18180wK.A0o(A0u);
                    Object key = A0o.getKey();
                    float A002 = C18240wQ.A00(A0o.getValue());
                    Object obj2 = map.get(key);
                    if (obj2 == null) {
                        obj2 = Float.valueOf(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
                    }
                    C18180wK.A1T(key, A0y2, A002 * C18240wQ.A00(obj2));
                }
                if (A0y2.size() >= this.A04) {
                    Iterator A0z = AnonymousClass0wJ.A0z(A0y2);
                    float f3 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
                    float f4 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
                    while (A0z.hasNext()) {
                        Map.Entry A0o2 = C18180wK.A0o(A0z);
                        Object key2 = A0o2.getKey();
                        float A003 = C18240wQ.A00(A0o2.getValue());
                        Float f5 = (Float) this.A02.get(key2);
                        if (f5 != null) {
                            f4 += f5.floatValue() * A003;
                            f3 += (float) Math.pow((double) A003, (double) 2);
                        }
                    }
                    if (f3 != BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
                        f4 /= (float) Math.sqrt((double) f3);
                    }
                    float f6 = f4 + this.A00;
                    if (f6 >= BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
                        f = 1.0f / (((float) Math.exp((double) (-f6))) + 1.0f);
                    } else {
                        float exp = (float) Math.exp((double) f6);
                        f = exp / (exp + 1.0f);
                    }
                    if (f > f2) {
                        z3 = true;
                    }
                }
            }
        }
        if (z3) {
            return C18180wK.A0n(new KtCSuperShape0S2002000_I2());
        }
        return AnonymousClass0ZV.A00;
    }

    public final int Ay9() {
        return 0;
    }

    public final int AyC() {
        return 0;
    }

    public final C23934D1w BEH() {
        return this.A06;
    }

    public final void Cx5() {
        A00(AnonymousClass0ZV.A00);
    }

    public C69964Bq(float f, int i) {
        this.A03 = f;
        this.A04 = i;
        this.A06 = C23934D1w.A07;
        this.A05 = new Object();
        ImmutableMap immutableMap = RegularImmutableMap.A02;
        C04220Ms.A06(immutableMap);
        this.A02 = immutableMap;
        this.A01 = immutableMap;
    }

    public final void D9S(List list, List list2, List list3) {
        A00(list3);
    }

    public final void Cqz(List list) {
        A00(list);
    }

    public C69964Bq() {
        this(1.0f, 0);
    }
}
