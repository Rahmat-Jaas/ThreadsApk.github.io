package X;

import android.content.Context;
import androidx.compose.ui.Modifier;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0100000_I2;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.IDxRImplShape194S0000000_1_I2;
import kotlin.jvm.internal.KtLambdaShape10S0300000_I2;
import kotlin.jvm.internal.KtLambdaShape42S0200000_I2_3;

/* renamed from: X.8as  reason: invalid class name and case insensitive filesystem */
public final class C141388as extends C02220Ah implements AnonymousClass0YC {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Context A01;
    public final /* synthetic */ C147368pE A02;
    public final /* synthetic */ C81784oM A03;
    public final /* synthetic */ AnonymousClass75b A04;
    public final /* synthetic */ C882757k A05;
    public final /* synthetic */ List A06;
    public final /* synthetic */ AnonymousClass0ZU A07;
    public final /* synthetic */ AnonymousClass0ZU A08;
    public final /* synthetic */ AnonymousClass0YY A09;
    public final /* synthetic */ C83224qz A0A;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C141388as(Context context, C147368pE r3, C81784oM r4, AnonymousClass75b r5, C882757k r6, List list, AnonymousClass0ZU r8, AnonymousClass0ZU r9, AnonymousClass0YY r10, C83224qz r11, int i) {
        super(4);
        this.A06 = list;
        this.A05 = r6;
        this.A09 = r10;
        this.A02 = r3;
        this.A00 = i;
        this.A08 = r8;
        this.A07 = r9;
        this.A03 = r4;
        this.A01 = context;
        this.A0A = r11;
        this.A04 = r5;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        int i2;
        C141678cb r1 = (C141678cb) obj;
        int A042 = AnonymousClass0wJ.A04(obj2);
        C147188nY r15 = (C147188nY) obj3;
        int A043 = AnonymousClass0wJ.A04(obj4);
        C04220Ms.A0B(r1, 0);
        int i3 = 4;
        if ((A043 & 14) == 0) {
            i = A043 | C147188nY.A0F(r15, r1);
        } else {
            i = A043;
        }
        if ((A043 & 112) == 0) {
            i |= C147188nY.A04(r15, A042);
        }
        if ((i & 731) != 146 || !r15.BCM()) {
            int i4 = i & 14;
            C304621k r7 = (C304621k) this.A06.get(A042);
            r15.Cvb(-219109005);
            if ((i4 & 14) == 0) {
                if (!r15.ACY(r1)) {
                    i3 = 2;
                }
                i2 = i4 | i3;
            } else {
                i2 = i4;
            }
            if ((i4 & 112) == 0) {
                i2 |= C147188nY.A08(r15, r7);
            }
            if ((i2 & 731) != 146 || !r15.BCM()) {
                C882757k r10 = this.A05;
                IDxRImplShape194S0000000_1_I2 iDxRImplShape194S0000000_1_I2 = new IDxRImplShape194S0000000_1_I2(r10, 0);
                C81784oM r2 = this.A03;
                Object obj5 = ((AnonymousClass5Hg) r2.getValue()).A04.get(r7);
                if (obj5 != null) {
                    KtCSuperShape0S0100000_I2 ktCSuperShape0S0100000_I2 = (KtCSuperShape0S0100000_I2) obj5;
                    boolean z = ((AnonymousClass5Hg) r2.getValue()).A06;
                    String str = ((AnonymousClass5Hg) r2.getValue()).A03;
                    Modifier A002 = C97936Dn.A00(r1, Modifier.A00);
                    KtLambdaShape10S0300000_I2 A0y = C86154wM.A0y(this.A01, r10, r7, 42);
                    AnonymousClass0YY r12 = this.A09;
                    KtLambdaShape42S0200000_I2_3 ktLambdaShape42S0200000_I2_3 = new KtLambdaShape42S0200000_I2_3(10, (Object) this.A0A, (Object) this.A04);
                    r15.Cvb(1157296644);
                    C147368pE r11 = this.A02;
                    boolean ACY = r15.ACY(r11);
                    AnonymousClass7W3 r22 = (AnonymousClass7W3) r15;
                    Object A13 = r22.A13();
                    if (ACY || A13 == AnonymousClass7GN.A00) {
                        A13 = AnonymousClass7W3.A0D(r22, r11, 49);
                    }
                    AnonymousClass0YY A0A2 = AnonymousClass7W3.A0A(r22, A13, false);
                    boolean A10 = C147188nY.A10(r15, r10, r7, 511388516);
                    Object A132 = r22.A13();
                    if (A10 || A132 == AnonymousClass7GN.A00) {
                        A132 = AnonymousClass7W3.A0E(r22, r7, r10, 49);
                    }
                    AnonymousClass0ZU A082 = AnonymousClass7W3.A08(r22, A132, false);
                    boolean A102 = C147188nY.A10(r15, r10, r7, 511388516);
                    Object A133 = r22.A13();
                    if (A102 || A133 == AnonymousClass7GN.A00) {
                        A133 = C86164wN.A0y(r7, r10, 0);
                        r22.A14(A133);
                    }
                    AnonymousClass0ZU A092 = AnonymousClass7W3.A09(r22, A133, false);
                    AnonymousClass0ZU r23 = this.A08;
                    AnonymousClass0ZU r13 = this.A07;
                    int i5 = this.A00;
                    int i6 = i5 << 9;
                    AnonymousClass0YY r25 = r12;
                    KtLambdaShape42S0200000_I2_3 ktLambdaShape42S0200000_I2_32 = ktLambdaShape42S0200000_I2_3;
                    IDxRImplShape194S0000000_1_I2 iDxRImplShape194S0000000_1_I22 = iDxRImplShape194S0000000_1_I2;
                    String str2 = str;
                    AnonymousClass0ZU r222 = r23;
                    AnonymousClass0ZU r232 = r13;
                    C304621k r18 = r7;
                    KtCSuperShape0S0100000_I2 ktCSuperShape0S0100000_I22 = ktCSuperShape0S0100000_I2;
                    C122107Kg.A01(r15, A002, ktCSuperShape0S0100000_I22, r18, str2, A082, A092, r222, r232, A0y, r25, ktLambdaShape42S0200000_I2_32, A0A2, iDxRImplShape194S0000000_1_I22, ((i5 >> 6) & 112) | (i6 & 29360128) | (i6 & 234881024) | ((i2 << 24) & 1879048192), 0, 0, z);
                } else {
                    throw C18190wL.A0a("Required value was null.");
                }
            } else {
                r15.CuJ();
            }
            AnonymousClass7W3.A0z(r15, false);
        } else {
            r15.CuJ();
        }
        return Unit.A00;
    }
}
