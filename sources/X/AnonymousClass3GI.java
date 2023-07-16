package X;

import android.text.TextUtils;
import java.util.List;

/* renamed from: X.3GI  reason: invalid class name */
public final class AnonymousClass3GI {
    public AnonymousClass3FV A00;
    public AnonymousClass3Gy A01;
    public Integer A02;
    public String A03;
    public String A04;
    public String A05;
    public List A06;
    public List A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;

    public final String toString() {
        String join;
        StringBuilder A0s = C18190wL.A0s("{ QPNode: ");
        A0s.append(this.A03);
        A0s.append(':');
        A0s.append(this.A05);
        A0s.append(':');
        A0s.append(this.A02);
        A0s.append(':');
        A0s.append(this.A09);
        A0s.append(':');
        A0s.append(this.A04);
        A0s.append(':');
        A0s.append(this.A07);
        A0s.append(':');
        A0s.append(this.A0A);
        A0s.append(':');
        A0s.append('[');
        List list = this.A07;
        String str = null;
        if (list == null) {
            join = null;
        } else {
            join = TextUtils.join(" : ", list);
        }
        A0s.append(join);
        A0s.append(':');
        A0s.append('[');
        List list2 = this.A06;
        if (list2 != null) {
            str = TextUtils.join(" : ", list2);
        }
        A0s.append(str);
        A0s.append("] contextual_filters");
        A0s.append(this.A00);
        return C18180wK.A0i("] }", A0s);
    }
}
