package X;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.KeyEvent;
import android.view.View;
import android.widget.PopupWindow;
import com.facebook.redex.IDxCListenerShape333S0100000_2_I2;

/* renamed from: X.51x  reason: invalid class name and case insensitive filesystem */
public final class C873151x extends PopupWindow {
    public int A00;
    public View A01;
    public AnonymousClass0ZU A02;
    public AnonymousClass0ZU A03;
    public AnonymousClass0ZU A04;
    public final View.OnLayoutChangeListener A05 = new IDxCListenerShape333S0100000_2_I2(this, 0);

    public C873151x(Context context) {
        super(context);
        setContentView(new LLH(context));
        setInputMethodMode(2);
        setBackgroundDrawable(new ColorDrawable(0));
        setAnimationStyle(0);
        setFocusable(true);
        setOutsideTouchable(true);
    }

    public final void A01(View view, int i, int i2) {
        if (!isShowing()) {
            this.A01 = view;
            this.A00 = view.getResources().getConfiguration().orientation;
            View view2 = this.A01;
            if (view2 != null) {
                View rootView = view2.getRootView();
                View.OnLayoutChangeListener onLayoutChangeListener = this.A05;
                rootView.removeOnLayoutChangeListener(onLayoutChangeListener);
                view2.getRootView().addOnLayoutChangeListener(onLayoutChangeListener);
                super.showAtLocation(view, 0, i, i2);
                return;
            }
            throw C18190wL.A0a("Required value was null.");
        }
    }

    public final void showAsDropDown(View view) {
    }

    public final void showAsDropDown(View view, int i, int i2) {
    }

    public final void showAsDropDown(View view, int i, int i2, int i3) {
    }

    public final void showAtLocation(View view, int i, int i2, int i3) {
    }

    public final void A00() {
        if (isShowing()) {
            super.dismiss();
            View view = this.A01;
            if (view != null) {
                view.getRootView().removeOnLayoutChangeListener(this.A05);
                this.A01 = null;
                this.A00 = 0;
                View contentView = getContentView();
                C04220Ms.A0C(contentView, "null cannot be cast to non-null type com.facebook.rendercore.RenderTreeHostView");
                ((LLH) contentView).setRenderTree((AnonymousClass7Di) null);
                this.A04 = null;
                this.A02 = null;
                this.A03 = null;
                return;
            }
            throw C18190wL.A0a("Required value was null.");
        }
    }

    public final void dismiss() {
        AnonymousClass0ZU r0;
        if (getContentView().getKeyDispatcherState().isTracking(new KeyEvent(0, 4))) {
            r0 = this.A02;
        } else {
            r0 = this.A04;
        }
        if (r0 != null) {
            r0.invoke();
        }
    }
}
