package X;

import androidx.compose.ui.Alignment;
import kotlin.jvm.internal.KtLambdaShape0S0100200_I2;
import kotlin.jvm.internal.KtLambdaShape4S0100100_I2;

/* renamed from: X.52Z  reason: invalid class name */
public final class AnonymousClass52Z extends AnonymousClass7XV {
    public Alignment A00;
    public final C81784oM A01;
    public final C81784oM A02;
    public final C81784oM A03;
    public final C112586pr A04;
    public final C112586pr A05;
    public final AnonymousClass0YY A06 = C86144wL.A16(this, 13);

    public final C146098ld Bg3(C147578pZ r23, C147618pd r24, long j) {
        long j2;
        C147578pZ r2 = r23;
        C147618pd r5 = r24;
        boolean A1Z = AnonymousClass0wJ.A1Z(r5, r2);
        C123657Xy Bg4 = r2.Bg4(j);
        long A002 = AnonymousClass7FV.A00(Bg4.A01, Bg4.A00);
        long j3 = ((C114336t4) this.A05.A00(this.A06, new KtLambdaShape4S0100100_I2(A002, this, A1Z ? 1 : 0)).getValue()).A00;
        long j4 = ((C121127Eg) this.A04.A00(AnonymousClass8Ki.A00, new KtLambdaShape4S0100100_I2(A002, this, 2)).getValue()).A00;
        Alignment alignment = this.A00;
        if (alignment != null) {
            Alignment alignment2 = alignment;
            j2 = alignment2.A88(AnonymousClass69J.Ltr, A002, j3);
        } else {
            j2 = C121127Eg.A01;
        }
        return C147618pd.A00(r5, new KtLambdaShape0S0100200_I2(Bg4, 0, j2, j4), C86104wH.A07(j3), C86104wH.A08(j3));
    }

    public AnonymousClass52Z(C112586pr r2, C112586pr r3, C81784oM r4, C81784oM r5, C81784oM r6) {
        AnonymousClass0wJ.A1O(r2, r3);
        AnonymousClass0wJ.A1R(r4, r5);
        this.A05 = r2;
        this.A04 = r3;
        this.A02 = r4;
        this.A03 = r5;
        this.A01 = r6;
    }
}
