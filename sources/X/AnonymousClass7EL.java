package X;

import com.fbpay.hub.form.params.FormDialogParams;
import com.fbpay.hub.form.params.FormLogEvents;
import com.fbpay.hub.form.params.FormParams;
import com.fbpay.logging.FBPayLoggerData;
import com.google.common.collect.ImmutableList;

/* renamed from: X.7EL  reason: invalid class name */
public final class AnonymousClass7EL {
    public FormDialogParams A00;
    public FormLogEvents A01;
    public FBPayLoggerData A02;
    public ImmutableList A03;
    public String A04;
    public String A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final ImmutableList.Builder A09;
    public final String A0A;
    public final String A0B;

    public AnonymousClass7EL(String str, String str2) {
        this.A09 = C86164wN.A0Q();
        this.A06 = 3;
        this.A08 = 0;
        this.A0B = str;
        this.A0A = str2;
        this.A07 = 2131827690;
    }

    public static FormParams A00(C109806ke r1, AnonymousClass7EL r2, int i) {
        r1.A02 = i;
        r1.A01 = 2131827691;
        r2.A00 = new FormDialogParams(r1);
        return r2.A01();
    }

    public final FormParams A01() {
        ImmutableList build = this.A09.build();
        this.A03 = build;
        AnonymousClass7Ko.A0D(C18250wR.A1K(build), "Provide at least one cell params");
        return new FormParams(this);
    }

    public AnonymousClass7EL(int i, int i2, String str, int i3) {
        this.A09 = C86164wN.A0Q();
        this.A06 = i;
        this.A08 = i2;
        this.A0B = null;
        this.A0A = str;
        this.A07 = i3;
    }
}
