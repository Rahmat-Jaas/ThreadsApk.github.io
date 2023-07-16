package X;

import android.content.Context;
import android.widget.ImageView;
import com.instagram.ui.widget.spinner.SpinnerImageView;

/* renamed from: X.19X  reason: invalid class name */
public final class AnonymousClass19X extends C90925fJ {
    public final int A00;

    public final AnonymousClass7H0 A0P(AnonymousClass39P r3, int i, int i2) {
        C04220Ms.A0B(r3, 0);
        Context context = r3.A00.A04;
        C04220Ms.A06(context);
        return C18220wO.A0Q(new SpinnerImageView(context), i, i2);
    }

    public final /* bridge */ /* synthetic */ Object AFU(Context context) {
        C04220Ms.A0B(context, 0);
        return new SpinnerImageView(context);
    }

    public AnonymousClass19X(int i) {
        super(AnonymousClass006.A01);
        this.A00 = i;
    }

    public final /* bridge */ /* synthetic */ void A0Q(Context context, Object obj, Object obj2) {
        ImageView imageView = (ImageView) obj;
        C04220Ms.A0B(imageView, 1);
        imageView.setImageResource(this.A00);
    }

    public final /* bridge */ /* synthetic */ void A0R(Context context, Object obj, Object obj2) {
    }
}
