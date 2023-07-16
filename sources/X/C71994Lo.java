package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.redex.IDxCBackShape392S0100000_1_I2;
import com.instagram.service.session.UserSession;

/* renamed from: X.4Lo  reason: invalid class name and case insensitive filesystem */
public final class C71994Lo implements C21659By5 {
    public final /* synthetic */ long A00;
    public final /* synthetic */ Context A01;
    public final /* synthetic */ Drawable A02;
    public final /* synthetic */ Fragment A03;
    public final /* synthetic */ AnonymousClass37X A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ boolean A06;
    public final /* synthetic */ FragmentActivity A07;
    public final /* synthetic */ C10300i6 A08;
    public final /* synthetic */ UserSession A09;

    public final void Bmq() {
    }

    public C71994Lo(Context context, Drawable drawable, Fragment fragment, FragmentActivity fragmentActivity, AnonymousClass37X r5, C10300i6 r6, UserSession userSession, String str, long j, boolean z) {
        this.A09 = userSession;
        this.A03 = fragment;
        this.A06 = z;
        this.A01 = context;
        this.A07 = fragmentActivity;
        this.A08 = r6;
        this.A02 = drawable;
        this.A00 = j;
        this.A05 = str;
        this.A04 = r5;
    }

    public final void Bmo() {
        UserSession userSession = this.A09;
        long A052 = C63043bN.A01.A05(userSession);
        if (A052 > 0 && (this.A03 instanceof C156929Py) && !this.A06) {
            C63733iD A012 = C63733iD.A01();
            Context context = this.A01;
            C63733iD.A07(context, A012, 2131836607);
            ImageView imageView = E2V.A03(this.A07).A0P;
            C04220Ms.A0B(imageView, 0);
            A012.A0K = true;
            A012.A04 = imageView;
            String string = context.getString(2131826643);
            C04220Ms.A0B(string, 0);
            A012.A0D = string;
            A012.A07 = new IDxCBackShape392S0100000_1_I2(this, 14);
            A012.A03 = this.A02;
            A012.A0E(AnonymousClass22b.ICON);
            A012.A0I = true;
            A012.A0C();
            A012.A0F = context.getString(2131836606);
            C63733iD.A09(C38040KHr.A01, A012);
        } else if (this.A06 && A052 > 0 && this.A00 == 0) {
            AnonymousClass3Zz.A02(this.A01, this.A07, this.A08, userSession, this.A05, A052);
        }
        if ((this.A03 instanceof C156929Py) || this.A00 == 0 || A052 == 0) {
            C696349j.A03(userSession).A0L();
        }
        AnonymousClass37X r0 = this.A04;
        if (r0 != null) {
            C109326jp r2 = r0.A01;
            C61043Rr.A00(r0.A00, C63893iY.A01, r2);
        }
    }
}
