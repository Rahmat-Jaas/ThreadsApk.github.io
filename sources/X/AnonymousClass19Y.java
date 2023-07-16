package X;

import android.content.Context;
import com.instagram.ui.widget.spinner.SpinnerImageView;

/* renamed from: X.19Y  reason: invalid class name */
public final class AnonymousClass19Y extends C90925fJ {
    public final int A00;
    public final AnonymousClass69F A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass19Y(AnonymousClass69F r2, int i) {
        super(AnonymousClass006.A01);
        C04220Ms.A0B(r2, 2);
        this.A00 = i;
        this.A01 = r2;
    }

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

    public final /* bridge */ /* synthetic */ void A0Q(Context context, Object obj, Object obj2) {
        SpinnerImageView spinnerImageView = (SpinnerImageView) obj;
        C04220Ms.A0B(spinnerImageView, 1);
        spinnerImageView.setImageResource(this.A00);
        spinnerImageView.setLoadingStatus(this.A01);
    }

    public final /* bridge */ /* synthetic */ void A0R(Context context, Object obj, Object obj2) {
    }
}
