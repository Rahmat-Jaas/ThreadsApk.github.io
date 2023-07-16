package X;

import android.view.View;
import com.instagram.barcelona.R;

/* renamed from: X.3T9  reason: invalid class name */
public final class AnonymousClass3T9 {
    public boolean A00 = true;
    public final int A01;
    public final View.OnClickListener A02;
    public final String A03;
    public final String A04;

    public AnonymousClass3T9(String str, View.OnClickListener onClickListener) {
        this.A03 = str;
        this.A04 = null;
        this.A01 = -1;
        this.A02 = onClickListener;
    }

    public AnonymousClass3T9(View.OnClickListener onClickListener, String str, String str2) {
        this.A03 = str;
        this.A04 = str2;
        this.A01 = R.color.igds_primary_button;
        this.A02 = onClickListener;
    }
}
