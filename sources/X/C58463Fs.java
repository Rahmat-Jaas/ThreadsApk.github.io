package X;

import android.content.Context;
import com.facebook.redex.IDxRCheckerShape619S0100000_1_I2;
import com.instagram.igds.components.form.IgFormField;
import com.instagram.ui.text.textwatchers.IDxWAdapterShape193S0100000_1_I2;

/* renamed from: X.3Fs  reason: invalid class name and case insensitive filesystem */
public final class C58463Fs {
    public Context A00;
    public AnonymousClass353 A01;
    public boolean A02;
    public final IgFormField A03;
    public final IgFormField A04;

    public final String A00() {
        Context context;
        int i;
        IgFormField igFormField = this.A04;
        String A0i = C18200wM.A0i(igFormField);
        String A0i2 = C18200wM.A0i(this.A03);
        if (AnonymousClass0hA.A01(A0i) < 6 || AnonymousClass0hA.A01(A0i2) < 6) {
            context = igFormField.getContext();
            i = 2131832179;
        } else if (A0i.equals(A0i2)) {
            return null;
        } else {
            context = igFormField.getContext();
            i = 2131832184;
        }
        return context.getString(i);
    }

    public C58463Fs(Context context, IgFormField igFormField, IgFormField igFormField2) {
        this.A00 = context;
        this.A04 = igFormField;
        this.A03 = igFormField2;
        igFormField.setRuleChecker(new IDxRCheckerShape619S0100000_1_I2(this, 0));
        igFormField.A00.addTextChangedListener(new IDxWAdapterShape193S0100000_1_I2(this, 4));
        IgFormField igFormField3 = this.A03;
        igFormField3.setRuleChecker(new IDxRCheckerShape619S0100000_1_I2(this, 1));
        igFormField3.A00.addTextChangedListener(new IDxWAdapterShape193S0100000_1_I2(this, 5));
    }
}
