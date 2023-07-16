package X;

import androidx.compose.ui.Modifier;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S3200000_I2;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S4440000_I2;
import com.instagram.api.schemas.LineType;
import com.instagram.common.typedurl.ImageUrl;
import kotlin.Unit;
import kotlin.jvm.internal.KtLambdaShape168S0100000_I2_1;

/* renamed from: X.8Z3  reason: invalid class name */
public final class AnonymousClass8Z3 extends C02220Ah implements AnonymousClass0YM {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C146628mY A01;
    public final /* synthetic */ C146638ma A02;
    public final /* synthetic */ C89935Hp A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ AnonymousClass0YY A05;
    public final /* synthetic */ AnonymousClass0YP A06;
    public final /* synthetic */ boolean A07;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass8Z3(C146628mY r2, C146638ma r3, C89935Hp r4, String str, AnonymousClass0YY r6, AnonymousClass0YP r7, int i, boolean z) {
        super(3);
        this.A02 = r3;
        this.A03 = r4;
        this.A00 = i;
        this.A04 = str;
        this.A05 = r6;
        this.A06 = r7;
        this.A01 = r2;
        this.A07 = z;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        C147188nY r9 = (C147188nY) obj2;
        int A042 = AnonymousClass0wJ.A04(obj3);
        C04220Ms.A0B(obj, 0);
        if ((A042 & 81) != 16 || !r9.BCM()) {
            C146638ma r5 = this.A02;
            C89935Hp r4 = this.A03;
            boolean A10 = C147188nY.A10(r9, r5, r4, 511388516);
            AnonymousClass7W3 r3 = (AnonymousClass7W3) r9;
            Object A13 = r3.A13();
            if (A10 || A13 == AnonymousClass7GN.A00) {
                A13 = AnonymousClass7W3.A0E(r3, r5, r4, 18);
            }
            AnonymousClass0ZU A08 = AnonymousClass7W3.A08(r3, A13, false);
            String str = this.A04;
            boolean A102 = C147188nY.A10(r9, r5, str, 511388516);
            Object A132 = r3.A13();
            if (A102 || A132 == AnonymousClass7GN.A00) {
                A132 = AnonymousClass7W3.A0N(r3, r5, str, 17);
            }
            AnonymousClass0ZU A082 = AnonymousClass7W3.A08(r3, A132, false);
            boolean A0z = C147188nY.A0z(r9, r5, 1157296644);
            Object A133 = r3.A13();
            if (A0z || A133 == AnonymousClass7GN.A00) {
                A133 = C86164wN.A0w(r5, 31);
                r3.A14(A133);
            }
            AnonymousClass7W3.A0w(r3, false);
            AnonymousClass0YM r7 = (AnonymousClass0YM) A133;
            AnonymousClass0YY r52 = this.A05;
            boolean A103 = C147188nY.A10(r9, r52, str, 511388516);
            Object A134 = r3.A13();
            if (A103 || A134 == AnonymousClass7GN.A00) {
                A134 = AnonymousClass7W3.A0N(r3, r52, str, 18);
            }
            AnonymousClass0ZU A083 = AnonymousClass7W3.A08(r3, A134, false);
            AnonymousClass0YP r1 = this.A06;
            boolean A0z2 = C147188nY.A0z(r9, r1, 1157296644);
            Object A135 = r3.A13();
            if (A0z2 || A135 == AnonymousClass7GN.A00) {
                A135 = new KtLambdaShape168S0100000_I2_1(r1, 8);
                r3.A14(A135);
            }
            AnonymousClass7W3.A0w(r3, false);
            C146628mY r32 = this.A01;
            C970267q BIh = r32.BIh();
            KtCSuperShape0S4440000_I2 ktCSuperShape0S4440000_I2 = (KtCSuperShape0S4440000_I2) r32;
            String str2 = r4.A07;
            ImageUrl imageUrl = r4.A04;
            String str3 = r4.A0A;
            boolean z = r4.A0F;
            double d = r4.A00;
            String str4 = r4.A05;
            int i = r4.A02;
            int i2 = r4.A01;
            AnonymousClass8s2 r17 = r4.A0D;
            boolean z2 = r4.A0G;
            AnonymousClass8s2 r14 = r4.A0C;
            KtCSuperShape0S3200000_I2 ktCSuperShape0S3200000_I2 = r4.A03;
            boolean z3 = r4.A0E;
            boolean z4 = this.A07;
            String str5 = r4.A06;
            AnonymousClass8s2 r42 = r4.A0B;
            boolean z5 = ktCSuperShape0S4440000_I2.A0A;
            C100326Mw.A00(r9, (Modifier) null, ktCSuperShape0S3200000_I2, (LineType) ktCSuperShape0S4440000_I2.A01, BIh, imageUrl, str2, str3, str4, str5, A08, A082, A083, (AnonymousClass0YP) A135, r7, r17, r14, r42, d, i, i2, 0, 0, ((this.A00 >> 9) & 14) | 512, 16777216, z, z2, z3, z4, z5);
        } else {
            r9.CuJ();
        }
        return Unit.A00;
    }
}
