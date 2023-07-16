package X;

import android.view.View;

/* renamed from: X.3Cc  reason: invalid class name and case insensitive filesystem */
public final class C57693Cc {
    public final View.OnClickListener A00;
    public final AnonymousClass24V A01;
    public final Integer A02;
    public final String A03;
    public final String A04;

    public /* synthetic */ C57693Cc(View.OnClickListener onClickListener, AnonymousClass24V r4, Integer num, String str, String str2, int i) {
        str2 = (i & 4) != 0 ? null : str2;
        num = (i & 8) != 0 ? null : num;
        r4 = (i & 256) != 0 ? AnonymousClass24V.TYPE_UNKNOWN : r4;
        onClickListener = (i & 1024) != 0 ? null : onClickListener;
        C04220Ms.A0B(str, 1);
        C04220Ms.A0B(r4, 9);
        this.A04 = str;
        this.A03 = str2;
        this.A02 = num;
        this.A01 = r4;
        this.A00 = onClickListener;
    }
}
