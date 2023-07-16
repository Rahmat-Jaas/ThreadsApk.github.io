package X;

import android.view.View;
import com.instagram.barcelona.R;
import com.instagram.common.typedurl.ImageUrl;
import java.util.List;

/* renamed from: X.3Iu  reason: invalid class name and case insensitive filesystem */
public final class C58963Iu {
    public View A00;
    public C10300i6 A01;
    public C85914vy A02;
    public C63613hu A03;
    public boolean A04;
    public final List A05 = AnonymousClass0wJ.A0v();

    public final void A07(String str) {
        this.A03 = new C63613hu((CharSequence) null, str, (CharSequence) null);
    }

    public final void A0A(String str, String str2) {
        this.A03 = new C63613hu(str, str2, (CharSequence) null);
    }

    public final void A00(int i) {
        this.A03 = new C63613hu(i);
    }

    public final void A01(View.OnClickListener onClickListener, int i) {
        this.A05.add(new C63063bP(onClickListener, 1.0f, i, (int) R.color.igds_error_or_destructive));
    }

    public final void A02(View.OnClickListener onClickListener, int i) {
        this.A05.add(new C63063bP(onClickListener, 1.0f, i, (int) R.color.igds_primary_button));
    }

    public final void A03(View.OnClickListener onClickListener, int i) {
        this.A05.add(new C63063bP(onClickListener, 1.0f, i, (int) R.color.igds_primary_text));
    }

    public final void A04(View.OnClickListener onClickListener, String str, int i) {
        this.A05.add(new C63063bP(onClickListener, str, 1.0f, R.color.igds_primary_text, 0, 0, i));
    }

    public final void A05(ImageUrl imageUrl) {
        C63613hu r0 = this.A03;
        if (r0 != null && imageUrl != null) {
            r0.A09 = imageUrl;
        }
    }

    public final void A06(String str) {
        this.A03 = new C63613hu((CharSequence) str);
    }

    public final void A08(String str, View.OnClickListener onClickListener) {
        this.A05.add(new C63063bP(onClickListener, str, R.color.igds_error_or_destructive));
    }

    public final void A09(String str, View.OnClickListener onClickListener) {
        this.A05.add(new C63063bP(onClickListener, str, R.color.igds_primary_text));
    }

    public C58963Iu(C10300i6 r2) {
        this.A01 = r2;
    }
}
