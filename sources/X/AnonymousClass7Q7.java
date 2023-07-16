package X;

import android.text.InputFilter;
import android.text.Spanned;

/* renamed from: X.7Q7  reason: invalid class name */
public final class AnonymousClass7Q7 implements InputFilter {
    public final /* synthetic */ AnonymousClass3HX A00;
    public final /* synthetic */ C127397h3 A01;
    public final /* synthetic */ C109326jp A02;

    public AnonymousClass7Q7(AnonymousClass3HX r1, C127397h3 r2, C109326jp r3) {
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = r1;
    }

    public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        String obj = spanned.toString();
        StringBuffer stringBuffer = new StringBuffer(obj);
        stringBuffer.replace(i3, i4, charSequence.toString());
        C63893iY A0S = C86154wM.A0S(C86124wJ.A0d(obj), stringBuffer.toString(), 1);
        if (AnonymousClass3WF.A02(C122047Jt.A03(this.A00, this.A01, A0S, this.A02))) {
            return null;
        }
        return spanned.subSequence(i3, i4);
    }
}
