package X;

import android.text.SpannableStringBuilder;

/* renamed from: X.0xX  reason: invalid class name and case insensitive filesystem */
public final class C18630xX extends SpannableStringBuilder {
    public final /* synthetic */ C18610xU A00;
    public final /* synthetic */ CharSequence A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C18630xX(C18610xU r1, CharSequence charSequence, CharSequence charSequence2) {
        super(charSequence);
        this.A00 = r1;
        this.A01 = charSequence2;
    }

    public final void setSpan(Object obj, int i, int i2, int i3) {
        Object obj2;
        try {
            super.setSpan(obj, i, i2, i3);
        } catch (IndexOutOfBoundsException e) {
            C14090on A002 = C10770iu.A00();
            StringBuilder A0s = C18190wL.A0s("setSpan out of boundary: start = ");
            A0s.append(i);
            A0s.append(" end = ");
            A0s.append(i2);
            A0s.append(" length = ");
            CharSequence charSequence = this.A01;
            if (charSequence != null) {
                obj2 = Integer.valueOf(charSequence.length());
            } else {
                obj2 = "null";
            }
            C14100oo ABJ = A002.ABJ(C18200wM.A0m(obj2, A0s), 245701013);
            ABJ.Ciu(e);
            ABJ.report();
        }
    }
}
