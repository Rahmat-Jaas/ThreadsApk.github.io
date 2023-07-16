package X;

import android.content.Context;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.ui.Modifier;
import com.facebook.common.dextricks.DalvikInternals;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0210000_I2;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2000000_I2;
import java.util.Collection;
import kotlin.Unit;
import kotlin.jvm.internal.KtLambdaShape36S0100000_I2_16;
import kotlin.jvm.internal.KtLambdaShape8S0400000_I2;

/* renamed from: X.8Ty  reason: invalid class name and case insensitive filesystem */
public final class C140318Ty extends C02220Ah implements AnonymousClass0YP {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Context A01;
    public final /* synthetic */ LazyListState A02;
    public final /* synthetic */ C147368pE A03;
    public final /* synthetic */ C147368pE A04;
    public final /* synthetic */ C81784oM A05;
    public final /* synthetic */ AnonymousClass75b A06;
    public final /* synthetic */ C882757k A07;
    public final /* synthetic */ C304621k A08;
    public final /* synthetic */ AnonymousClass0ZU A09;
    public final /* synthetic */ AnonymousClass0ZU A0A;
    public final /* synthetic */ AnonymousClass0ZU A0B;
    public final /* synthetic */ AnonymousClass0YY A0C;
    public final /* synthetic */ C83224qz A0D;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C140318Ty(Context context, LazyListState lazyListState, C147368pE r4, C147368pE r5, C81784oM r6, AnonymousClass75b r7, C882757k r8, C304621k r9, AnonymousClass0ZU r10, AnonymousClass0ZU r11, AnonymousClass0ZU r12, AnonymousClass0YY r13, C83224qz r14, int i) {
        super(2);
        this.A04 = r4;
        this.A08 = r9;
        this.A07 = r8;
        this.A00 = i;
        this.A03 = r5;
        this.A0B = r10;
        this.A05 = r6;
        this.A06 = r7;
        this.A02 = lazyListState;
        this.A0D = r14;
        this.A0C = r13;
        this.A0A = r11;
        this.A09 = r12;
        this.A01 = context;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        Boolean bool;
        C970867w r4;
        C147188nY r0 = (C147188nY) obj;
        if ((AnonymousClass0wJ.A04(obj2) & 11) != 2 || !r0.BCM()) {
            C147368pE r56 = this.A03;
            KtCSuperShape0S2000000_I2 ktCSuperShape0S2000000_I2 = (KtCSuperShape0S2000000_I2) r56.getValue();
            r0.Cvb(299415985);
            if (ktCSuperShape0S2000000_I2 != null) {
                C882757k r6 = this.A07;
                String str = ktCSuperShape0S2000000_I2.A01;
                boolean A0z = C147188nY.A0z(r0, r56, 1157296644);
                AnonymousClass7W3 r9 = (AnonymousClass7W3) r0;
                Object A13 = r9.A13();
                if (A0z || A13 == AnonymousClass7GN.A00) {
                    A13 = AnonymousClass7W3.A0K(r9, r56, 1);
                }
                AnonymousClass0ZU A092 = AnonymousClass7W3.A09(r9, A13, false);
                boolean A12 = C147188nY.A12(r0, ktCSuperShape0S2000000_I2, C147188nY.A10(r0, r56, r6, 1618982084));
                Object A132 = r9.A13();
                if (A12 || A132 == AnonymousClass7GN.A00) {
                    A132 = C86154wM.A15(ktCSuperShape0S2000000_I2, r6, r56, 43);
                    r9.A14(A132);
                }
                C122107Kg.A0C(r0, str, A092, AnonymousClass7W3.A09(r9, A132, false), 0);
            }
            AnonymousClass7W3 A042 = AnonymousClass7W3.A04(r0, false);
            C123327Wm r92 = Modifier.A00;
            Modifier A022 = AnonymousClass7FI.A02(r92);
            AnonymousClass0ZU r12 = this.A0B;
            int i = this.A00;
            C81784oM r54 = this.A05;
            AnonymousClass75b r53 = this.A06;
            LazyListState lazyListState = this.A02;
            C147368pE r15 = this.A04;
            C304621k r51 = this.A08;
            C882757k r50 = this.A07;
            C83224qz r44 = this.A0D;
            AnonymousClass0YY r49 = this.A0C;
            AnonymousClass0ZU r48 = this.A0A;
            AnonymousClass0ZU r47 = this.A09;
            Context context = this.A01;
            C145058jl A0V = C147188nY.A0V(r0);
            C142878fk r24 = AnonymousClass7KV.A02;
            C146288ly A002 = AnonymousClass72M.A00(A0V, r0, r24);
            AnonymousClass534 A0a = C147188nY.A0a(r0);
            Object AEA = r0.AEA(A0a);
            AnonymousClass534 r8 = AnonymousClass7DE.A07;
            Object AEA2 = r0.AEA(r8);
            AnonymousClass534 r7 = AnonymousClass7DE.A0B;
            Object AEA3 = r0.AEA(r7);
            AnonymousClass0ZU r62 = AnonymousClass74X.A00;
            AnonymousClass0YM A003 = C98236Es.A00(A022);
            C147188nY.A0w(r0, A042, r62);
            A042.A0T = false;
            AnonymousClass0YP r5 = AnonymousClass74X.A03;
            AnonymousClass0YP A004 = AnonymousClass7Ak.A00(r0, A002, AEA, r5);
            AnonymousClass0YP r42 = AnonymousClass74X.A02;
            AnonymousClass0YP A012 = AnonymousClass7Ak.A01(r0, AEA2, r42);
            Integer A052 = AnonymousClass7KP.A05(r0, AEA3, A012, A003);
            r0.Cvb(2058660585);
            AnonymousClass7V5 r20 = AnonymousClass7V5.A00;
            r0.Cvb(1805345009);
            AnonymousClass698 r32 = AnonymousClass698.Cancel;
            AnonymousClass54z r19 = AnonymousClass7Kq.A02;
            Modifier Cx6 = r92.Cx6(r19);
            boolean A0z2 = C147188nY.A0z(r0, r12, 1157296644);
            Object A133 = A042.A13();
            if (A0z2 || A133 == AnonymousClass7GN.A00) {
                A133 = new KtLambdaShape36S0100000_I2_16(r12, 2);
                A042.A14(A133);
            }
            C147188nY r30 = r0;
            AnonymousClass6M2.A00(r30, Cx6, r32, AnonymousClass7W3.A08(A042, A133, false), AnonymousClass7JR.A01(r0, r54, 18, -1181331469), (AnonymousClass0YP) null, 3462, 112, false, false);
            AnonymousClass54z r14 = AnonymousClass7Kq.A01;
            Modifier Cx62 = r92.Cx6(r14);
            C146288ly A072 = AnonymousClass7KV.A07(r0, false);
            Object A0s = C147188nY.A0s(r0, A0a);
            Object AEA4 = r0.AEA(r8);
            Object AEA5 = r0.AEA(r7);
            AnonymousClass0YM A005 = C98236Es.A00(Cx62);
            C147188nY.A0w(r0, A042, r62);
            A042.A0T = false;
            AnonymousClass7Ak.A02(r0, A072, r5);
            AnonymousClass7Ak.A02(r0, A0s, A004);
            AnonymousClass7Ak.A02(r0, AEA4, r42);
            AnonymousClass7KP.A06(r0, AEA5, A052, A012, A005);
            AnonymousClass7V3 r16 = AnonymousClass7V3.A00;
            Modifier A032 = Modifier.A03(r0, r92, r14, -12438485);
            C146288ly A0f = C147188nY.A0f(A0V, r0, r24);
            Object A0s2 = C147188nY.A0s(r0, A0a);
            Object AEA6 = r0.AEA(r8);
            Object AEA7 = r0.AEA(r7);
            AnonymousClass0YM A006 = C98236Es.A00(A032);
            C147188nY.A0w(r0, A042, r62);
            A042.A0T = false;
            AnonymousClass7Ak.A02(r0, A0f, r5);
            AnonymousClass7Ak.A02(r0, A0s2, A004);
            AnonymousClass7Ak.A02(r0, AEA6, r42);
            AnonymousClass7KP.A06(r0, AEA7, A052, A012, A006);
            Modifier A033 = Modifier.A03(r0, r92, r19, 1589609333);
            long A007 = AnonymousClass7KB.A00(r0);
            AnonymousClass6M3.A00(r30, A033, AnonymousClass6Y5.A00, AnonymousClass7JR.A00(r0, new KtLambdaShape8S0400000_I2(1, r54, r51, r44, lazyListState), 50949987), AnonymousClass7JR.A00(r0, C86164wN.A0w(lazyListState, 39), -743186077), 0, 1794102, 8, A007, 0);
            LazyListState lazyListState2 = lazyListState;
            LazyListState lazyListState3 = lazyListState2;
            C147188nY r322 = r0;
            C115696vl.A00(C115676vj.A01(lazyListState2, r0), (C145048jk) null, (C145068jm) null, lazyListState3, r322, (C141758cu) null, Modifier.A06(r20.DB5(r92, 1.0f, true), r19), new AnonymousClass8Jx(context, r56, r54, r53, r50, r48, r47, r49, r44, i), 12582912, 60, false, true);
            if (((AnonymousClass5Hg) C147188nY.A0u(r0, r54, -318924457)).A06) {
                boolean A0z3 = C147188nY.A0z(r0, r15, 1157296644);
                Object A134 = A042.A13();
                if (A0z3 || A134 == AnonymousClass7GN.A00) {
                    A134 = AnonymousClass7W3.A0K(A042, r15, 3);
                }
                AnonymousClass0ZU A082 = AnonymousClass7W3.A08(A042, A134, false);
                C86094wG r3 = (C86094wG) r50.A06.get(r51);
                if (r3 != null) {
                    bool = Boolean.valueOf(C18190wL.A1a((Collection) ((KtCSuperShape0S0210000_I2) ((C555833u) r3.getValue()).A00).A01));
                } else {
                    bool = null;
                }
                boolean A1Z = C18190wL.A1Z(bool, true);
                int ordinal = r51.ordinal();
                if (ordinal == 0 || ordinal == 1) {
                    r4 = C970867w.None;
                } else if (ordinal == 2) {
                    r4 = ((AnonymousClass5Hg) r54.getValue()).A00;
                } else {
                    throw AnonymousClass4VZ.A00();
                }
                C122107Kg.A02(r0, r92.Cx6(r19), r4, r51, A082, DalvikInternals.IOPRIO_BACKGROUND, 0, A1Z);
            }
            AnonymousClass7W3.A0w(A042, false);
            AnonymousClass7W3.A0v(A042, true);
            C117716z8.A00(r0, AnonymousClass7KV.A01(r16, r92), r53, 6, 0);
            AnonymousClass7W3.A0v(A042, true);
            AnonymousClass7W3.A0v(A042, true);
            if (C86104wH.A1X(r15)) {
                boolean A0z4 = C147188nY.A0z(r0, r15, 1157296644);
                Object A135 = A042.A13();
                if (A0z4 || A135 == AnonymousClass7GN.A00) {
                    A135 = AnonymousClass7W3.A0K(A042, r15, 4);
                }
                AnonymousClass0ZU A093 = AnonymousClass7W3.A09(A042, A135, false);
                boolean A122 = C147188nY.A12(r0, r15, C147188nY.A10(r0, r51, r50, 1618982084));
                Object A136 = A042.A13();
                if (A122 || A136 == AnonymousClass7GN.A00) {
                    A136 = C86154wM.A15(r51, r50, r15, 44);
                    A042.A14(A136);
                }
                C122107Kg.A0B(r0, r51, A093, AnonymousClass7W3.A09(A042, A136, false), 0);
            }
        } else {
            r0.CuJ();
        }
        return Unit.A00;
    }
}
