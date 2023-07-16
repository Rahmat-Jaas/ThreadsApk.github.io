package X;

import com.facebook.common.locale.Country;
import com.facebookpay.form.cell.logging.FormCellLoggingEvents;
import com.google.common.collect.ImmutableList;

/* renamed from: X.5hO  reason: invalid class name and case insensitive filesystem */
public final class C91975hO extends AnonymousClass7Ih {
    public boolean A00 = false;
    public final int A01;
    public final ImmutableList A02;
    public final String A03;
    public final boolean A04;
    public final Country A05;

    public C91975hO(Country country, FormCellLoggingEvents formCellLoggingEvents, ImmutableList immutableList, String str, int i, int i2, int i3, boolean z, boolean z2, boolean z3) {
        super(formCellLoggingEvents, i, i2, z, z2);
        this.A03 = str;
        this.A01 = i3;
        this.A05 = country;
        this.A05.A0H(country);
        this.A02 = immutableList;
        this.A04 = z3;
        this.A04.put(i2, country);
    }
}
