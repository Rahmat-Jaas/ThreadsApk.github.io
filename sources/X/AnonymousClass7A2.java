package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.view.View;
import android.widget.ImageView;
import com.facebook.redex.IDxCListenerShape465S0100000_2_I2;
import com.instagram.barcelona.R;
import java.lang.ref.WeakReference;

/* renamed from: X.7A2  reason: invalid class name */
public abstract class AnonymousClass7A2 {
    public float A00;
    public Context A01;
    public Drawable A02;
    public View.OnAttachStateChangeListener A03 = new IDxCListenerShape465S0100000_2_I2(this, 3);
    public String A04;
    public String A05;
    public WeakReference A06;
    public boolean A07;
    public boolean A08;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AnonymousClass7A2)) {
            return false;
        }
        return this.A05.equals(((AnonymousClass7A2) obj).A05);
    }

    public final int hashCode() {
        return 589 + this.A05.hashCode();
    }

    public AnonymousClass7A2(Context context, String str, String str2) {
        this.A05 = str;
        this.A04 = str2;
        this.A01 = context;
    }

    public static void A00(View view) {
        if (view.getTag(R.id.fbpay_image_loader) instanceof AnonymousClass7A2) {
            AnonymousClass7A2 r2 = (AnonymousClass7A2) view.getTag(R.id.fbpay_image_loader);
            View view2 = (View) r2.A06.get();
            if (view2 != null) {
                view2.removeOnAttachStateChangeListener(r2.A03);
            }
        }
        view.setTag(R.id.fbpay_image_loader, (Object) null);
    }

    public final void A01(Drawable drawable) {
        C002801h.A03(C18180wK.A1Z(Looper.myLooper(), Looper.getMainLooper()));
        ImageView imageView = (ImageView) this.A06.get();
        if (imageView != null && equals(imageView.getTag(R.id.fbpay_image_loader))) {
            imageView.setImageDrawable(drawable);
        }
    }

    public final void A02(ImageView imageView) {
        C002801h.A03(C18180wK.A1Z(Looper.myLooper(), Looper.getMainLooper()));
        this.A06 = C86144wL.A0w(imageView);
        A00(imageView);
        imageView.setTag(R.id.fbpay_image_loader, this);
        imageView.addOnAttachStateChangeListener(this.A03);
        A01(this.A02);
        C92895kC r3 = (C92895kC) this;
        C37030Jj7 A0A = C37744K2e.A01().A0A(C18250wR.A0K(r3.A05), r3.A04);
        A0A.A02(r3.A00);
        A0A.A00().CYj();
    }
}
