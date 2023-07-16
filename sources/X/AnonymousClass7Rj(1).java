package X;

import android.content.Context;
import android.content.res.Resources;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import ch.boye.httpclientandroidlib.HttpStatus;
import com.facebook.rebound.IDxSListenerShape89S0100000_2_I2;

/* renamed from: X.7Rj  reason: invalid class name */
public final class AnonymousClass7Rj implements View.OnTouchListener {
    public Integer A00 = AnonymousClass006.A0N;
    public final View A01;
    public final AnonymousClass099 A02;
    public final GestureDetector A03;
    public final C25812DsR A04;

    public static void A00(AnonymousClass7Rj r6, double d) {
        double d2;
        int i;
        View view = r6.A01;
        float translationY = view.getTranslationY();
        C25812DsR dsR = r6.A04;
        dsR.A09((double) translationY);
        if (r6.A00 == AnonymousClass006.A00) {
            dsR.A0E(new IDxSListenerShape89S0100000_2_I2(r6, 1));
            dsR.A0B(d);
            Resources resources = r6.A02.requireActivity().getResources();
            int identifier = resources.getIdentifier(AnonymousClass000.A00(HttpStatus.SC_NOT_ACCEPTABLE), "dimen", "android");
            if (identifier > 0) {
                i = resources.getDimensionPixelSize(identifier);
            } else {
                i = 150;
            }
            d2 = (double) (i + view.getHeight());
        } else {
            dsR.A0B(d);
            d2 = 0.0d;
        }
        dsR.A0A(d2);
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        Integer num;
        double d;
        if (!this.A03.onTouchEvent(motionEvent)) {
            if (motionEvent.getAction() != 1 || (num = this.A00) == AnonymousClass006.A0N) {
                return false;
            }
            if (num == AnonymousClass006.A0C) {
                d = -2000.0d;
            } else {
                d = 2000.0d;
            }
            A00(this, d);
        }
        return true;
    }

    public AnonymousClass7Rj(Context context, View view, AnonymousClass099 r6) {
        this.A02 = r6;
        this.A01 = view;
        C25812DsR A022 = COK.A00().A02();
        A022.A06 = true;
        this.A04 = A022;
        A022.A0E(new IDxSListenerShape89S0100000_2_I2(this, 0));
        this.A03 = new GestureDetector(context, new AnonymousClass508(this));
    }
}
