package X;

/* renamed from: X.3Gz  reason: invalid class name and case insensitive filesystem */
public final class C58743Gz {
    public final AnonymousClass3YD A00;
    public final String A01;

    public C58743Gz(AnonymousClass3YD r1, String str) {
        this.A01 = str;
        this.A00 = r1;
    }

    public final int A00(Integer num) {
        AnonymousClass3YD r2;
        Integer num2;
        int intValue = num.intValue();
        if (intValue == 0) {
            r2 = this.A00;
            num2 = AnonymousClass006.A00;
        } else if (intValue == 1) {
            r2 = this.A00;
            num2 = AnonymousClass006.A01;
        } else if (intValue == 2) {
            r2 = this.A00;
            num2 = AnonymousClass006.A0C;
        } else if (intValue != 3) {
            return 0;
        } else {
            r2 = this.A00;
            num2 = AnonymousClass006.A0N;
        }
        return r2.A02(num2, this.A01);
    }

    public final long A01(Integer num) {
        AnonymousClass3YD r3;
        Integer num2;
        String str;
        int intValue = num.intValue();
        if (intValue == 0) {
            r3 = this.A00;
            num2 = AnonymousClass006.A00;
        } else if (intValue == 1) {
            r3 = this.A00;
            num2 = AnonymousClass006.A01;
        } else if (intValue == 2) {
            r3 = this.A00;
            num2 = AnonymousClass006.A0C;
        } else if (intValue != 3) {
            return 0;
        } else {
            r3 = this.A00;
            num2 = AnonymousClass006.A0N;
        }
        String str2 = this.A01;
        int intValue2 = num2.intValue();
        if (intValue2 == 0) {
            str = "lastImpressionTime";
        } else if (intValue2 == 1) {
            str = "primaryActionTime";
        } else if (intValue2 != 2) {
            str = "dismissActionTime";
        } else {
            str = "secondaryActionTime";
        }
        return C18180wK.A05(r3.A00, AnonymousClass3YD.A00(r3, str2, str));
    }
}
