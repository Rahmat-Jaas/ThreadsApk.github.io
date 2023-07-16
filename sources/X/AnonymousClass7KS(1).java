package X;

import androidx.compose.ui.Modifier;
import ch.boye.httpclientandroidlib.HttpStatus;
import com.instagram.barcelona.R;
import com.instagram.common.typedurl.SimpleImageUrl;
import kotlin.coroutines.jvm.internal.KtSLambdaShape15S0100000_I2_4;
import kotlin.jvm.internal.IDxRImplShape181S0000000_1_I2;
import kotlin.jvm.internal.KtLambdaShape1S1302000_I2;

/* renamed from: X.7KS  reason: invalid class name */
public final class AnonymousClass7KS {
    public static final void A04(C147188nY r26, Modifier modifier, C146348m5 r28, String str, AnonymousClass0ZU r30, int i, int i2) {
        int i3;
        Modifier modifier2 = modifier;
        C147188nY r14 = r26;
        r14.Cvd(1901481082);
        int i4 = i2;
        int i5 = i;
        String str2 = str;
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = C147188nY.A0F(r14, str2) | i;
        } else {
            i3 = i5;
        }
        C146348m5 r5 = r28;
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= C147188nY.A0G(r14, r5);
        }
        int i6 = i2 & 4;
        if (i6 != 0) {
            i3 |= 384;
        } else if ((i5 & 896) == 0) {
            i3 |= C147188nY.A0H(r14, modifier2);
        }
        AnonymousClass0ZU r9 = r30;
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i5 & 7168) == 0) {
            i3 |= C147188nY.A0C(r14, r9);
        }
        if ((i3 & 5851) != 1170 || !r14.BCM()) {
            if (i6 != 0) {
                modifier2 = Modifier.A00;
            }
            long AEL = r5.AEL(true);
            AnonymousClass7W3 r8 = (AnonymousClass7W3) r14;
            C147258p3 r13 = (C147258p3) AnonymousClass7GN.A01(r8, r8.A13());
            Modifier A00 = C1190273f.A00(r13, modifier2, 0.3f, true);
            r14.AEA(AnonymousClass6YT.A00);
            AnonymousClass0ZU r17 = r9;
            AnonymousClass70T.A00((AnonymousClass79L) null, (C142668fO) null, r13, r14, A00, AnonymousClass7D5.A00, r17, AnonymousClass7JR.A00(r14, new AnonymousClass8R7(r28, str, i3, AEL), -2074531051), 819462144 | ((i3 >> 9) & 14), 288, r5.AA7(false), C121657He.A04(C86154wM.A0G(AEL), AnonymousClass7KE.A03(AEL), AnonymousClass7KE.A02(AEL), AnonymousClass7KE.A01(AEL), 1.0f), false);
        } else {
            r14.CuJ();
        }
        C147178nW AKE = r14.AKE();
        if (AKE != null) {
            AKE.D9d(new KtLambdaShape1S1302000_I2(r9, r5, modifier2, str2, i5, i4, 8));
        }
    }

    public static final AnonymousClass68N A00(Integer num) {
        switch (num.intValue()) {
            case 0:
                return AnonymousClass68N.ADMIN;
            case 1:
                return AnonymousClass68N.FOLLOW;
            case 2:
                return AnonymousClass68N.FOLLOW_BACK;
            case 3:
                return AnonymousClass68N.FOLLOWING;
            case 4:
                return AnonymousClass68N.JOIN;
            case 5:
            case 6:
                return AnonymousClass68N.LOADING;
            case 7:
                return AnonymousClass68N.REQUESTED;
            case 8:
                return AnonymousClass68N.UNBLOCK;
            default:
                return AnonymousClass68N.UNKNOWN;
        }
    }

    public static final void A01(C147188nY r8, int i) {
        r8.Cvd(91266913);
        if (i != 0 || !r8.BCM()) {
            C123327Wm A01 = Modifier.A01(r8);
            C146288ly A00 = C120767Cj.A00(r8, AnonymousClass7KV.A0E, false);
            Object A0p = C147188nY.A0p(r8);
            Object A0n = C147188nY.A0n(r8);
            Object A0m = C147188nY.A0m(r8);
            AnonymousClass0ZU r1 = AnonymousClass74X.A00;
            AnonymousClass0YM A002 = C98236Es.A00(A01);
            AnonymousClass7W3 r2 = (AnonymousClass7W3) r8;
            C147188nY.A0w(r8, r2, r1);
            AnonymousClass7W3.A0a(r8, r2, A00, A0p);
            AnonymousClass7KP.A07(r8, A0n, A0m, A002);
            AnonymousClass7KV.A08(AnonymousClass7V3.A00, r8, A01, -129737369);
            AnonymousClass7W3.A0f(r2);
        } else {
            r8.CuJ();
        }
        C147178nW AKE = r8.AKE();
        if (AKE != null) {
            C147178nW.A00(AKE, i, 11);
        }
    }

    public static final void A02(C147188nY r21, int i) {
        C147188nY r5 = r21;
        r5.Cvd(1389930026);
        int i2 = i;
        if (i != 0 || !r5.BCM()) {
            String A01 = AnonymousClass7JS.A01(r5, 2131831704);
            C121807If A012 = AnonymousClass7J9.A01(r5);
            AnonymousClass7I9.A02(r5, AnonymousClass7K4.A06(Modifier.A00, (float) 28, 12), A012, (C114236su) null, (C134817yQ) null, C121117Ee.A01(3), A01, 0, 0, 0, 48, 0, 1976, AnonymousClass7KB.A03(r5), 0, false);
        } else {
            r5.CuJ();
        }
        C147178nW AKE = r5.AKE();
        if (AKE != null) {
            C147178nW.A00(AKE, i2, 12);
        }
    }

    public static final void A06(C147188nY r44, String str, String str2, int i) {
        int i2;
        C147188nY r13 = r44;
        r13.Cvd(-295768106);
        int i3 = i;
        String str3 = str;
        if ((i & 14) == 0) {
            i2 = C147188nY.A0F(r13, str3) | i;
        } else {
            i2 = i3;
        }
        String str4 = str2;
        if ((i & 112) == 0) {
            i2 |= C147188nY.A0G(r13, str4);
        }
        if ((i2 & 91) != 18 || !r13.BCM()) {
            C123327Wm r6 = Modifier.A00;
            float f = (float) 32;
            Modifier A05 = AnonymousClass7K4.A05(r6, f, f, f, (float) 64);
            C146288ly A00 = AnonymousClass72M.A00(C147188nY.A0V(r13), r13, AnonymousClass7KV.A00);
            Object A0p = C147188nY.A0p(r13);
            Object A0n = C147188nY.A0n(r13);
            Object A0m = C147188nY.A0m(r13);
            AnonymousClass0ZU r2 = AnonymousClass74X.A00;
            AnonymousClass0YM A002 = C98236Es.A00(A05);
            AnonymousClass7W3 r1 = (AnonymousClass7W3) r13;
            C147188nY.A0w(r13, r1, r2);
            AnonymousClass7W3.A0a(r13, r1, A00, A0p);
            AnonymousClass7KP.A07(r13, A0n, A0m, A002);
            r13.Cvb(-497584564);
            float f2 = (float) 0;
            C1190173e.A00(r13, AnonymousClass7Kq.A0F(AnonymousClass7K4.A05(r6, f2, f2, f2, (float) 16), 96), AnonymousClass6QP.A00(r13, R.drawable.empty_state_follow), (String) null, 440, 8, 0);
            C121807If r15 = C120537Bh.A02(r13).A05;
            String str5 = str3;
            AnonymousClass7I9.A02(r13, AnonymousClass7K4.A05(r6, f2, f2, f2, (float) 14), r15, (C114236su) null, (C134817yQ) null, C121117Ee.A01(3), str5, 0, 0, 0, (i2 & 14) | 48, 0, 1976, AnonymousClass7KB.A02(r13), 0, false);
            C147188nY r30 = r13;
            String str6 = str4;
            AnonymousClass7I9.A02(r30, (Modifier) null, AnonymousClass7J9.A02(r13), (C114236su) null, (C134817yQ) null, C121117Ee.A01(3), str6, 0, 0, 0, (i2 >> 3) & 14, 0, 1978, AnonymousClass7KB.A03(r13), 0, false);
            AnonymousClass7W3.A0f(r1);
        } else {
            r13.CuJ();
        }
        C147178nW AKE = r13.AKE();
        if (AKE != null) {
            AnonymousClass7WO.A00(AKE, new C140058Qw(str3, str4, i3));
        }
    }

    public static final void A07(C147188nY r12, AnonymousClass0ZU r13, int i) {
        int i2;
        r12.Cvd(1830023035);
        AnonymousClass0ZU r10 = r13;
        if ((i & 14) == 0) {
            i2 = C147188nY.A09(r12, r13) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) != 2 || !r12.BCM()) {
            C123327Wm A01 = Modifier.A01(r12);
            C146288ly A00 = C120767Cj.A00(r12, AnonymousClass7KV.A0E, false);
            Object A0p = C147188nY.A0p(r12);
            Object A0n = C147188nY.A0n(r12);
            Object A0m = C147188nY.A0m(r12);
            AnonymousClass0ZU r1 = AnonymousClass74X.A00;
            AnonymousClass0YM A002 = C98236Es.A00(A01);
            AnonymousClass7W3 r3 = (AnonymousClass7W3) r12;
            C147188nY.A0w(r12, r3, r1);
            AnonymousClass7W3.A0a(r12, r3, A00, A0p);
            AnonymousClass7KP.A07(r12, A0n, A0m, A002);
            AnonymousClass7V3 r4 = AnonymousClass7V3.A00;
            r12.Cvb(-982155595);
            Object A012 = AnonymousClass7GN.A01(r3, C147188nY.A0r(r12, r3, -492369756));
            AnonymousClass7W3.A0w(r3, false);
            C147258p3 r6 = (C147258p3) A012;
            boolean A1X = C86104wH.A1X(C97866Dg.A00(r6, r12));
            int i3 = R.drawable.loadmore_icon_refresh;
            if (A1X) {
                i3 = R.drawable.loadmore_icon_refresh_pressed;
            }
            C86114wI.A17(r12, AnonymousClass7HZ.A00((C142668fO) null, r6, AnonymousClass7KV.A01(r4, A01), (AnonymousClass799) null, (String) null, r10, true), AnonymousClass6QP.A00(r12, i3), AnonymousClass7JS.A01(r12, 2131834950));
            AnonymousClass7W3.A0v(r3, true);
        } else {
            r12.CuJ();
        }
        C147178nW AKE = r12.AKE();
        if (AKE != null) {
            C147178nW.A01(AKE, r13, i, 13);
        }
    }

    public static final void A08(C147188nY r3, AnonymousClass0ZU r4, int i) {
        int i2;
        r3.Cvd(761101151);
        if ((i & 14) == 0) {
            i2 = C147188nY.A09(r3, r4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) != 2 || !r3.BCM()) {
            A0A(r4, AnonymousClass7JS.A01(r3, 2131835377), r3, (i2 << 3) & 112);
        } else {
            r3.CuJ();
        }
        C147178nW AKE = r3.AKE();
        if (AKE != null) {
            C147178nW.A01(AKE, r4, i, 14);
        }
    }

    public static final void A09(C147188nY r3, AnonymousClass0ZU r4, int i, int i2) {
        int i3;
        r3.Cvd(601430834);
        if ((i2 & 14) == 0) {
            i3 = C147188nY.A03(r3, i) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 112) == 0) {
            i3 |= C147188nY.A0A(r3, r4);
        }
        if ((i3 & 91) != 18 || !r3.BCM()) {
            A0A(r4, AnonymousClass7JS.A03(r3, C18210wN.A1X(i), 2131835378), r3, i3 & 112);
        } else {
            r3.CuJ();
        }
        C147178nW AKE = r3.AKE();
        if (AKE != null) {
            C147178nW.A03(AKE, r4, i, i2, 14);
        }
    }

    public static final void A0A(AnonymousClass0ZU r21, String str, C147188nY r23, int i) {
        int i2;
        C147188nY r7 = r23;
        r7.Cvd(985968683);
        int i3 = i;
        String str2 = str;
        if ((i & 14) == 0) {
            i2 = C147188nY.A0F(r7, str2) | i;
        } else {
            i2 = i3;
        }
        AnonymousClass0ZU r1 = r21;
        if ((i & 112) == 0) {
            i2 |= C147188nY.A0A(r7, r1);
        }
        if ((i2 & 91) != 18 || !r7.BCM()) {
            Modifier A03 = AnonymousClass7HZ.A03(Modifier.A00, r1, false);
            C04220Ms.A0B(A03, 0);
            AnonymousClass7I9.A02(r7, AnonymousClass7Kq.A05(AnonymousClass7K4.A06(AnonymousClass7Kq.A06(Modifier.A04(A03), (float) 48), (float) 16, 12)), AnonymousClass7J9.A02(r7), (C114236su) null, (C134817yQ) null, (C121117Ee) null, str2, 0, 1, 2, (i2 & 14) | 805306368, 6, HttpStatus.SC_GATEWAY_TIMEOUT, AnonymousClass7KB.A04(r7), 0, false);
        } else {
            r7.CuJ();
        }
        C147178nW AKE = r7.AKE();
        if (AKE != null) {
            C147178nW.A06(AKE, r1, str2, i3, 11);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v29, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v63, resolved type: X.8K5} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v3, resolved type: X.8K5} */
    /* JADX WARNING: type inference failed for: r0v30 */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x018d, code lost:
        if (r0 == X.AnonymousClass7GN.A00) goto L_0x018f;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A03(X.C147188nY r50, androidx.compose.ui.Modifier r51, com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape1S0100000_I2_1 r52, X.AnonymousClass0ZU r53, X.AnonymousClass0ZU r54, X.AnonymousClass0YY r55, X.AnonymousClass0YP r56, X.AnonymousClass0YP r57, X.AnonymousClass0YP r58, X.AnonymousClass0YP r59, X.AnonymousClass0YP r60, X.AnonymousClass0YP r61, X.AnonymousClass0YP r62, X.AnonymousClass0YP r63, X.AnonymousClass0YC r64, int r65, int r66) {
        /*
            r0 = -41931768(0xfffffffffd802c08, float:-2.1296226E37)
            r10 = r50
            r10.Cvd(r0)
            r6 = r65
            r0 = r65 & 14
            if (r0 != 0) goto L_0x01db
            r0 = r52
            int r0 = X.C147188nY.A0F(r10, r0)
            r17 = r65 | r0
        L_0x0016:
            r0 = r65 & 112(0x70, float:1.57E-43)
            r3 = 32
            r39 = r51
            if (r0 != 0) goto L_0x0026
            r0 = r39
            int r0 = X.C147188nY.A0G(r10, r0)
            r17 = r17 | r0
        L_0x0026:
            r0 = r6 & 896(0x380, float:1.256E-42)
            r2 = 256(0x100, float:3.59E-43)
            r7 = r64
            if (r0 != 0) goto L_0x0034
            int r0 = X.C147188nY.A0B(r10, r7)
            r17 = r17 | r0
        L_0x0034:
            r0 = r6 & 7168(0x1c00, float:1.0045E-41)
            r1 = 2048(0x800, float:2.87E-42)
            r48 = r56
            if (r0 != 0) goto L_0x0044
            r0 = r48
            int r0 = X.C147188nY.A0C(r10, r0)
            r17 = r17 | r0
        L_0x0044:
            r0 = 57344(0xe000, float:8.0356E-41)
            r0 = r0 & r65
            r49 = r55
            if (r0 != 0) goto L_0x0055
            r0 = r49
            int r0 = X.C147188nY.A0D(r10, r0)
            r17 = r17 | r0
        L_0x0055:
            r0 = 458752(0x70000, float:6.42848E-40)
            r0 = r0 & r65
            r47 = r57
            if (r0 != 0) goto L_0x0065
            r0 = r47
            int r0 = X.C147188nY.A0E(r10, r0)
            r17 = r17 | r0
        L_0x0065:
            r0 = 3670016(0x380000, float:5.142788E-39)
            r0 = r0 & r65
            r46 = r58
            if (r0 != 0) goto L_0x0079
            r0 = r46
            boolean r0 = r10.ACa(r0)
            int r0 = X.C86104wH.A01(r0)
            r17 = r17 | r0
        L_0x0079:
            r0 = 29360128(0x1c00000, float:7.052966E-38)
            r0 = r0 & r65
            r45 = r59
            if (r0 != 0) goto L_0x008d
            r0 = r45
            boolean r0 = r10.ACa(r0)
            int r0 = X.C86104wH.A04(r0)
            r17 = r17 | r0
        L_0x008d:
            r0 = 234881024(0xe000000, float:1.5777218E-30)
            r0 = r0 & r65
            r15 = r60
            if (r0 != 0) goto L_0x009f
            boolean r0 = r10.ACa(r15)
            int r0 = X.C86104wH.A03(r0)
            r17 = r17 | r0
        L_0x009f:
            r0 = 1879048192(0x70000000, float:1.58456325E29)
            r0 = r0 & r65
            r14 = r61
            if (r0 != 0) goto L_0x00b1
            boolean r0 = r10.ACa(r14)
            int r0 = X.C86104wH.A02(r0)
            r17 = r17 | r0
        L_0x00b1:
            r5 = r66
            r0 = r66 & 14
            r9 = r62
            if (r0 != 0) goto L_0x01d8
            int r0 = X.C147188nY.A09(r10, r9)
            r12 = r66 | r0
        L_0x00bf:
            r0 = r66 & 112(0x70, float:1.57E-43)
            r8 = r63
            if (r0 != 0) goto L_0x00ce
            boolean r0 = r10.ACa(r8)
            if (r0 != 0) goto L_0x00cd
            r3 = 16
        L_0x00cd:
            r12 = r12 | r3
        L_0x00ce:
            r0 = r5 & 896(0x380, float:1.256E-42)
            r51 = r53
            if (r0 != 0) goto L_0x00df
            r0 = r51
            boolean r0 = r10.ACa(r0)
            if (r0 != 0) goto L_0x00de
            r2 = 128(0x80, float:1.794E-43)
        L_0x00de:
            r12 = r12 | r2
        L_0x00df:
            r0 = r5 & 7168(0x1c00, float:1.0045E-41)
            r50 = r54
            if (r0 != 0) goto L_0x00f0
            r0 = r50
            boolean r0 = r10.ACa(r0)
            if (r0 != 0) goto L_0x00ef
            r1 = 1024(0x400, float:1.435E-42)
        L_0x00ef:
            r12 = r12 | r1
        L_0x00f0:
            r0 = 1533916891(0x5b6db6db, float:6.6910621E16)
            r1 = r17 & r0
            r0 = 306783378(0x12492492, float:6.3469493E-28)
            if (r1 != r0) goto L_0x0137
            r1 = r12 & 5851(0x16db, float:8.199E-42)
            r0 = 1170(0x492, float:1.64E-42)
            if (r1 != r0) goto L_0x0137
            boolean r0 = r10.BCM()
            if (r0 == 0) goto L_0x0137
            r10.CuJ()
        L_0x0109:
            X.8nW r1 = r10.AKE()
            if (r1 == 0) goto L_0x0136
            X.8U9 r0 = new X.8U9
            r16 = r14
            r17 = r9
            r18 = r8
            r19 = r7
            r20 = r6
            r21 = r5
            r5 = r0
            r6 = r39
            r7 = r52
            r8 = r51
            r9 = r50
            r10 = r49
            r11 = r48
            r12 = r47
            r13 = r46
            r14 = r45
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            X.AnonymousClass7WO.A00(r1, r0)
        L_0x0136:
            return
        L_0x0137:
            r4 = 0
            r0 = 3
            androidx.compose.foundation.lazy.LazyListState r3 = X.C97946Do.A00(r10, r4, r0)
            r0 = 23598336(0x1681500, float:4.2626737E-38)
            X.C101196Qg.A00(r3, r10, r0, r4)
            r0 = 36
            float r1 = (float) r0
            r33 = 0
            float r0 = (float) r4
            X.7V9 r2 = new X.7V9
            r2.<init>(r0, r0, r0, r1)
            r13 = 13
            r44 = 1
            r18 = r52
            r19 = r7
            r20 = r48
            r21 = r47
            r22 = r46
            r23 = r49
            r24 = r51
            r25 = r45
            r26 = r14
            r27 = r9
            r28 = r8
            r29 = r15
            r30 = r50
            java.lang.Object[] r16 = new java.lang.Object[]{r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30}
            r0 = -568225417(0xffffffffde219177, float:-2.91055434E18)
            r10.Cvb(r0)
            r11 = 0
            r1 = 0
        L_0x0178:
            r0 = r16[r11]
            boolean r1 = X.C147188nY.A12(r10, r0, r1)
            int r11 = r11 + 1
            if (r11 < r13) goto L_0x0178
            r11 = r10
            X.7W3 r11 = (X.AnonymousClass7W3) r11
            java.lang.Object r0 = r11.A13()
            if (r1 != 0) goto L_0x018f
            java.lang.Object r1 = X.AnonymousClass7GN.A00
            if (r0 != r1) goto L_0x01b5
        L_0x018f:
            X.8K5 r0 = new X.8K5
            r18 = r0
            r19 = r52
            r20 = r51
            r21 = r50
            r22 = r49
            r23 = r48
            r24 = r47
            r25 = r46
            r26 = r45
            r27 = r14
            r28 = r9
            r29 = r8
            r30 = r15
            r31 = r7
            r32 = r12
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32)
            r11.A14(r0)
        L_0x01b5:
            X.AnonymousClass7W3.A0w(r11, r4)
            X.0YY r0 = (X.AnonymousClass0YY) r0
            r11 = 12583296(0xc00180, float:1.7632953E-38)
            int r1 = r17 >> 3
            r41 = r1 & 14
            r41 = r41 | r11
            r42 = 120(0x78, float:1.68E-43)
            r34 = r33
            r35 = r2
            r36 = r3
            r37 = r10
            r38 = r33
            r40 = r0
            r43 = r4
            X.C115696vl.A01(r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44)
            goto L_0x0109
        L_0x01d8:
            r12 = r5
            goto L_0x00bf
        L_0x01db:
            r17 = r6
            goto L_0x0016
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7KS.A03(X.8nY, androidx.compose.ui.Modifier, com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape1S0100000_I2_1, X.0ZU, X.0ZU, X.0YY, X.0YP, X.0YP, X.0YP, X.0YP, X.0YP, X.0YP, X.0YP, X.0YP, X.0YC, int, int):void");
    }

    public static final void A05(C147188nY r33, AnonymousClass3CI r34, Integer num, String str, String str2, String str3, String str4, String str5, AnonymousClass0YP r41, int i, int i2, boolean z, boolean z2, boolean z3) {
        int i3;
        int i4;
        C147188nY r6 = r33;
        r6.Cvd(-399059426);
        int i5 = i;
        int i6 = 4;
        if ((i & 14) == 0) {
            i3 = C147188nY.A0F(r6, str) | i;
        } else {
            i3 = i5;
        }
        String str6 = str2;
        if ((i & 112) == 0) {
            i3 |= C147188nY.A0G(r6, str6);
        }
        String str7 = str3;
        if ((i5 & 896) == 0) {
            i3 |= C147188nY.A0H(r6, str7);
        }
        String str8 = str4;
        if ((i5 & 7168) == 0) {
            i3 |= C147188nY.A0I(r6, str8);
        }
        boolean z4 = z;
        if ((i & 57344) == 0) {
            i3 |= C147188nY.A0P(r6, z4);
        }
        boolean z5 = z2;
        if ((458752 & i) == 0) {
            i3 |= C147188nY.A0Q(r6, z5);
        }
        boolean z6 = z3;
        if ((3670016 & i) == 0) {
            i3 |= C86104wH.A01(r6.ACZ(z6) ? 1 : 0);
        }
        Integer num2 = num;
        if ((i & 29360128) == 0) {
            i3 |= C86104wH.A04(r6.ACY(num2) ? 1 : 0);
        }
        String str9 = str5;
        if ((i & 234881024) == 0) {
            i3 |= C86104wH.A03(r6.ACY(str9) ? 1 : 0);
        }
        AnonymousClass3CI r5 = r34;
        if ((i & 1879048192) == 0) {
            i3 |= C86104wH.A02(r6.ACY(r5) ? 1 : 0);
        }
        int i7 = i2;
        AnonymousClass0YP r35 = r41;
        if ((i2 & 14) == 0) {
            if (!r6.ACa(r35)) {
                i6 = 2;
            }
            i4 = i2 | i6;
        } else {
            i4 = i7;
        }
        if ((i3 & 1533916891) == 306783378 && (i4 & 11) == 2 && r6.BCM()) {
            r6.CuJ();
        } else {
            SimpleImageUrl A0K = C18250wR.A0K(str);
            float f = (float) 16;
            float f2 = (float) 0;
            float f3 = (float) 56;
            AnonymousClass5I7 r2 = new AnonymousClass5I7(new AnonymousClass7V9(f, f2, f, f2), (float) 72, f3, f3);
            boolean A0z = C147188nY.A0z(r6, r5, 1157296644);
            AnonymousClass7W3 r0 = (AnonymousClass7W3) r6;
            Object A13 = r0.A13();
            if (A0z || A13 == AnonymousClass7GN.A00) {
                A13 = new IDxRImplShape181S0000000_1_I2(r5, 8);
                r0.A14(A13);
            }
            int i8 = i3 << 3;
            C121747Hv.A00(r6, (Modifier) null, A0K, (C146798ms) null, r2, str6, str7, str8, AnonymousClass7W3.A08(r0, A13, false), (AnonymousClass0YY) null, AnonymousClass7JR.A00(r6, new C140888Yw(r5, num2, r35, i3, i4, z4), 324722811), C86144wL.A04(i3 & 112, i8 & 7168, i8, 57344) | (i8 & 29360128) | ((i3 << 9) & 234881024), 3072, 5220, false, false, z6, z5);
            boolean A0z2 = C147188nY.A0z(r6, r5, 1157296644);
            Object A132 = r0.A13();
            if (A0z2 || A132 == AnonymousClass7GN.A00) {
                A132 = new KtSLambdaShape15S0100000_I2_4(r5, (C146958n9) null, 20);
                r0.A14(A132);
            }
            AnonymousClass7W3.A0b(r6, r0, A132, str9, false);
        }
        C147178nW AKE = r6.AKE();
        if (AKE != null) {
            AnonymousClass7WO.A00(AKE, new C140268To(r5, num2, str, str6, str7, str8, str9, r35, i5, i7, z4, z5, z6));
        }
    }
}
