package X;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.widget.EditText;
import com.instagram.barcelona.R;
import com.instagram.ui.text.textwatchers.IDxWAdapterShape193S0100000_1_I2;

/* renamed from: X.3G5  reason: invalid class name */
public final class AnonymousClass3G5 {
    public AnonymousClass354 A00;
    public boolean A01;
    public boolean A02;
    public final Drawable A03;
    public final Drawable A04;
    public final EditText A05;
    public final EditText A06;

    public final boolean A00() {
        String A0n = AnonymousClass0wJ.A0n(this.A06);
        String A0n2 = AnonymousClass0wJ.A0n(this.A05);
        if (TextUtils.isEmpty(A0n) || TextUtils.isEmpty(A0n2)) {
            return false;
        }
        return true;
    }

    public AnonymousClass3G5(Resources resources, EditText editText, EditText editText2) {
        this.A06 = editText;
        this.A05 = editText2;
        this.A03 = resources.getDrawable(R.drawable.profile_glyph_password);
        this.A04 = resources.getDrawable(R.drawable.profile_glyph_password_red);
        EditText editText3 = this.A06;
        C18210wN.A10(editText3, 6, this);
        editText3.addTextChangedListener(new IDxWAdapterShape193S0100000_1_I2(this, 2));
        EditText editText4 = this.A05;
        C18210wN.A10(editText4, 7, this);
        editText4.addTextChangedListener(new IDxWAdapterShape193S0100000_1_I2(this, 3));
    }
}
