package X;

import androidx.compose.animation.core.MutableTransitionState;
import androidx.compose.ui.Modifier;
import com.facebook.common.dextricks.DalvikInternals;
import com.facebook.forker.Process;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.KtLambdaShape0S1402000_I2;
import kotlin.jvm.internal.KtLambdaShape1S0502000_I2;
import kotlin.jvm.internal.KtLambdaShape9S0401000_I2;

/* renamed from: X.6vg  reason: invalid class name and case insensitive filesystem */
public final class C115646vg {
    public static final void A00(C147218oz r22, C115556vT r23, C147188nY r24, Modifier modifier, AnonymousClass0YY r26, AnonymousClass0YM r27, int i, int i2) {
        int i3;
        AnonymousClass0YY r11 = r26;
        C147218oz r18 = r22;
        Modifier modifier2 = modifier;
        C115556vT r13 = r23;
        C04220Ms.A0B(r13, 0);
        AnonymousClass0YM r19 = r27;
        C04220Ms.A0B(r19, 4);
        C147188nY r12 = r24;
        r12.Cvd(679005231);
        int i4 = i2;
        int i5 = i;
        if ((i2 & Process.WAIT_RESULT_TIMEOUT) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = C147188nY.A0F(r12, r13) | i;
        } else {
            i3 = i5;
        }
        int i6 = i2 & 1;
        if (i6 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= C147188nY.A0G(r12, modifier2);
        }
        int i7 = i2 & 2;
        if (i7 != 0) {
            i3 |= 128;
        }
        int i8 = i2 & 4;
        if (i8 != 0) {
            i3 |= 3072;
        } else if ((i5 & 7168) == 0) {
            i3 |= C147188nY.A0I(r12, r11);
        }
        if ((i2 & 8) != 0) {
            i3 |= DalvikInternals.IOPRIO_BACKGROUND;
        } else if ((57344 & i) == 0) {
            i3 |= C147188nY.A0J(r12, r19);
        }
        if (i7 == 2 && (46811 & i3) == 9362 && r12.BCM()) {
            r12.CuJ();
        } else {
            if (i6 != 0) {
                modifier2 = Modifier.A00;
            }
            if (i7 != 0) {
                r18 = C122747Tr.A00(AnonymousClass6aT.A00, 2, 300, 0);
            }
            if (i8 != 0) {
                r11 = C77604h5.A00;
            }
            AnonymousClass7W3 A0Z = C147188nY.A0Z(r12, -492369756);
            Object A13 = A0Z.A13();
            Object obj = AnonymousClass7GN.A00;
            AnonymousClass84D r6 = A13;
            if (A13 == obj) {
                AnonymousClass84D r62 = new AnonymousClass84D();
                r62.add(MutableTransitionState.A00(r13));
                A0Z.A14(r62);
                r6 = r62;
            }
            AnonymousClass7W3.A0w(A0Z, false);
            AnonymousClass84D r63 = (AnonymousClass84D) r6;
            Object A0r = C147188nY.A0r(r12, A0Z, -492369756);
            if (A0r == obj) {
                A0r = C18220wO.A0y();
                A0Z.A14(A0r);
            }
            AnonymousClass7W3.A0w(A0Z, false);
            Map map = (Map) A0r;
            r12.Cvb(-1621449213);
            Object A00 = MutableTransitionState.A00(r13);
            C147368pE r2 = r13.A06;
            if (C86124wJ.A1Y(r2, A00) && (r63.size() != 1 || !C86124wJ.A1Y(r2, r63.get(0)))) {
                boolean A0y = C147188nY.A0y(r12, r13);
                Object A132 = A0Z.A13();
                if (A0y || A132 == obj) {
                    A132 = C86144wL.A16(r13, 4);
                    A0Z.A14(A132);
                }
                C000300e.A0v(AnonymousClass7W3.A0B(A0Z, A132, false), r63);
                map.clear();
            }
            if (!map.containsKey(AnonymousClass7W3.A06(A0Z, r2))) {
                Iterator it = r63.iterator();
                int i9 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else if (!C04220Ms.A0I(r11.invoke(it.next()), r11.invoke(r2.getValue()))) {
                        i9++;
                    } else if (i9 != -1) {
                        r63.set(i9, r2.getValue());
                    }
                }
                r63.add(r2.getValue());
                map.clear();
                int size = r63.size();
                for (int i10 = 0; i10 < size; i10++) {
                    Object obj2 = r63.get(i10);
                    map.put(obj2, AnonymousClass7JR.A00(r12, new KtLambdaShape9S0401000_I2(r13, r18, obj2, r27, i3, 0), -1426421288));
                }
            }
            C146288ly A07 = AnonymousClass7KV.A07(r12, false);
            Object A0p = C147188nY.A0p(r12);
            Object A0n = C147188nY.A0n(r12);
            Object A0m = C147188nY.A0m(r12);
            AnonymousClass0ZU r25 = AnonymousClass74X.A00;
            AnonymousClass0YM A002 = C98236Es.A00(modifier2);
            int A01 = C86114wI.A01((((i3 >> 3) & 14) << 3) & 112);
            C147188nY.A0w(r12, A0Z, r25);
            AnonymousClass7W3.A0a(r12, A0Z, A07, A0p);
            AnonymousClass7KP.A08(r12, A0n, A0m, A002, A01);
            r12.Cvb(-2137368960);
            if (((A01 >> 9) & 14 & 11) != 2 || !r12.BCM()) {
                r12.Cvb(-1621447954);
                int size2 = r63.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    Object obj3 = r63.get(i11);
                    r12.CvO(-450541366, r11.invoke(obj3));
                    AnonymousClass0YP r1 = (AnonymousClass0YP) map.get(obj3);
                    if (r1 != null) {
                        r1.invoke(r12, 0);
                    }
                    AnonymousClass7W3.A0w(A0Z, false);
                }
                AnonymousClass7W3.A0w(A0Z, false);
            } else {
                r12.CuJ();
            }
            AnonymousClass7W3.A0v(A0Z, true);
        }
        C147178nW AKE = r12.AKE();
        if (AKE != null) {
            AKE.D9d(new KtLambdaShape1S0502000_I2(r13, modifier2, r18, r11, r19, i5, i4, 0));
        }
    }

    public static final void A01(C147218oz r16, C147188nY r17, Modifier modifier, Object obj, String str, AnonymousClass0YM r21, int i, int i2) {
        int i3;
        String str2 = str;
        C147218oz r11 = r16;
        Modifier modifier2 = modifier;
        AnonymousClass0YM r12 = r21;
        C04220Ms.A0B(r12, 4);
        C147188nY r2 = r17;
        r2.Cvd(-310686752);
        int i4 = i2;
        Object obj2 = obj;
        int i5 = i;
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = C147188nY.A0F(r2, obj2) | i;
        } else {
            i3 = i5;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= C147188nY.A0G(r2, modifier2);
        }
        int i7 = i2 & 4;
        if (i7 != 0) {
            i3 |= 128;
        }
        int i8 = i2 & 8;
        if (i8 != 0) {
            i3 |= 3072;
        } else if ((i5 & 7168) == 0) {
            i3 |= C147188nY.A0I(r2, str2);
        }
        if ((i2 & 16) != 0) {
            i3 |= DalvikInternals.IOPRIO_BACKGROUND;
        } else if ((i & 57344) == 0) {
            i3 |= C147188nY.A0J(r2, r12);
        }
        if (i7 == 4 && (46811 & i3) == 9362 && r2.BCM()) {
            r2.CuJ();
        } else {
            if (i6 != 0) {
                modifier2 = Modifier.A00;
            }
            if (i7 != 0) {
                r11 = C122747Tr.A00(AnonymousClass6aT.A00, 2, 300, 0);
            }
            if (i8 != 0) {
                str2 = "Crossfade";
            }
            A00(r11, AnonymousClass7FH.A02(r2, obj2, str2, (i3 & 8) | (i3 & 14) | ((i3 >> 6) & 112), 0), r2, modifier2, (AnonymousClass0YY) null, r21, (i3 & 112) | 512 | (i3 & 57344), 4);
        }
        C147178nW AKE = r2.AKE();
        if (AKE != null) {
            AKE.D9d(new KtLambdaShape0S1402000_I2(obj2, modifier2, r11, r12, str2, i5, i4, 0));
        }
    }
}
