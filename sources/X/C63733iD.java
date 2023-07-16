package X;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.facebook.redex.IDxCBackShape392S0100000_1_I2;
import com.instagram.barcelona.R;
import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.3iD  reason: invalid class name and case insensitive filesystem */
public final class C63733iD {
    public int A00;
    public int A01;
    public int A02;
    public Drawable A03;
    public View A04;
    public ImageUrl A05;
    public ImageUrl A06;
    public C39777Kzl A07;
    public AnonymousClass22b A08 = AnonymousClass22b.NONE;
    public C306022c A09 = C306022c.DEFAULT;
    public CharSequence A0A;
    public Integer A0B;
    public Integer A0C = AnonymousClass006.A00;
    public String A0D;
    public String A0E;
    public String A0F;
    public boolean A0G = C63173fJ.A05(AnonymousClass0TJ.A05, 18313938118650237L);
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;

    public static C63733iD A03(Context context) {
        C63733iD r1 = new C63733iD();
        r1.A0A = context.getString(2131829182);
        r1.A0F = context.getString(2131829180);
        r1.A0C();
        r1.A02 = 0;
        r1.A0E(AnonymousClass22b.NONE);
        return r1;
    }

    public final void A0D(Drawable drawable, int i) {
        C04220Ms.A0B(drawable, 0);
        this.A03 = drawable;
        drawable.setColorFilter(i, PorterDuff.Mode.SRC_ATOP);
    }

    public final void A0E(AnonymousClass22b r2) {
        C04220Ms.A0B(r2, 0);
        this.A08 = r2;
    }

    public final void A0F(C306022c r2) {
        C04220Ms.A0B(r2, 0);
        this.A09 = r2;
    }

    public static C63733iD A00() {
        C63733iD r1 = new C63733iD();
        r1.A0F(C306022c.DEFAULT);
        return r1;
    }

    public static C63733iD A01() {
        return new C63733iD();
    }

    public static C63733iD A02() {
        C63733iD r1 = new C63733iD();
        r1.A0F(C306022c.ERROR);
        return r1;
    }

    public static AnonymousClass3TR A04(C63733iD r1, Object obj, int i) {
        r1.A07 = new IDxCBackShape392S0100000_1_I2(obj, i);
        AnonymousClass3TR A0B2 = r1.A0B();
        C38040KHr.A01.CWx(new H4Q(A0B2));
        return A0B2;
    }

    public final AnonymousClass3TR A0B() {
        CharSequence charSequence = this.A0A;
        if (charSequence == null) {
            throw C18180wK.A0a("Required value was null.");
        } else if (!this.A0I || this.A07 != null) {
            C306022c r4 = this.A09;
            C306022c r3 = C306022c.ERROR;
            if ((r4 == r3 || r4 == C306022c.SUCCESS) && this.A08 != AnonymousClass22b.NONE) {
                throw C18180wK.A0a("Check failed.");
            }
            if (r4 == r3) {
                C10450iM.A03("igds_snackbar_error_style_missing_category", String.valueOf(charSequence));
            }
            if (this.A08 == AnonymousClass22b.NONE || this.A06 != null || this.A03 != null || this.A0B != null) {
                return new AnonymousClass3TR(this);
            }
            throw C18180wK.A0a("Check failed.");
        } else {
            throw C18180wK.A0a("Required value was null.");
        }
    }

    public static void A05(Context context, Drawable drawable, C63733iD r3) {
        r3.A0D(drawable, context.getColor(R.color.igds_icon_on_color));
    }

    public static void A06(Context context, Drawable drawable, C63733iD r2, int i) {
        r2.A0F = context.getString(i);
        r2.A03 = drawable;
        r2.A0E(AnonymousClass22b.ICON);
    }

    public static void A07(Context context, C63733iD r1, int i) {
        r1.A0A = context.getString(i);
    }

    public static void A08(Fragment fragment, C63733iD r1, int i) {
        r1.A0A = fragment.getString(i);
    }

    public static void A09(C38040KHr kHr, C63733iD r3) {
        kHr.CWx(new H4Q(r3.A0B()));
    }

    public static void A0A(C63733iD r2) {
        C38040KHr.A01.CWx(new H4Q(r2.A0B()));
    }

    public final void A0C() {
        this.A01 = AnonymousClass3WL.A00();
    }
}
