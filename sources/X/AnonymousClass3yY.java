package X;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;

/* renamed from: X.3yY  reason: invalid class name */
public final class AnonymousClass3yY implements C39804L0x {
    public final C25828Dsm A00;

    public final C39804L0x CnL(DialogInterface.OnClickListener onClickListener, CharSequence charSequence) {
        this.A00.A0b((DialogInterface.OnClickListener) null, charSequence.toString());
        return this;
    }

    public final Dialog AEr() {
        return this.A00.A0G();
    }

    public final C39804L0x Cn2(CharSequence charSequence) {
        this.A00.A0p(charSequence);
        return this;
    }

    public final C39804L0x Co8(DialogInterface.OnClickListener onClickListener, CharSequence charSequence) {
        this.A00.A0c(onClickListener, charSequence.toString());
        return this;
    }

    public final C39804L0x Cqa(CharSequence charSequence) {
        this.A00.A02 = charSequence.toString();
        return this;
    }

    public AnonymousClass3yY(Context context) {
        this.A00 = C18190wL.A0W(context);
    }
}
