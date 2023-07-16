package X;

import android.animation.LayoutTransition;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ScrollView;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.redex.IDxCListenerShape41S0300000_1_I2;
import com.instagram.barcelona.R;
import com.instagram.common.ui.base.IgLinearLayout;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.base.IgView;
import com.instagram.ui.widget.progressbutton.ProgressButton;

/* renamed from: X.3tz  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C65643tz implements ViewTreeObserver.OnScrollChangedListener {
    public final /* synthetic */ ScrollView A00;
    public final /* synthetic */ C23111bw A01;

    public /* synthetic */ C65643tz(ScrollView scrollView, C23111bw r2) {
        this.A01 = r2;
        this.A00 = scrollView;
    }

    public final void onScrollChanged() {
        AnonymousClass3IZ r0;
        View A0E;
        View.OnClickListener iDxCListenerShape41S0300000_1_I2;
        C10300i6 r3;
        String str;
        AnonymousClass2AF r1;
        String str2;
        C23111bw r5 = this.A01;
        ScrollView scrollView = this.A00;
        r5.A01.cancel();
        r5.A00.cancel();
        if (!AnonymousClass3UT.A00(r5.A04).A00 && scrollView.getScrollY() > 0) {
            AnonymousClass3UT.A00(r5.A04).A00 = true;
            AnonymousClass3IZ r12 = r5.A03;
            if (r12 instanceof C27391sR) {
                boolean A1W = C18180wK.A1W(r12.A01.A00);
                r3 = r12.A00;
                str = r12.A02;
                if (A1W) {
                    AnonymousClass0wJ.A1N(r3, str);
                    r1 = AnonymousClass2AF.A0K;
                } else {
                    AnonymousClass0wJ.A1N(r3, str);
                    r1 = AnonymousClass2AF.A0T;
                }
                str2 = null;
            } else {
                boolean z = r12 instanceof C27341sM;
                r3 = r12.A00;
                str = r12.A02;
                AnonymousClass0wJ.A1N(r3, str);
                r1 = AnonymousClass2AF.A0X;
                str2 = null;
                if (z) {
                }
            }
            C63003bJ.A00(r1, r3, str, str2);
        }
        if (r5.A06(scrollView)) {
            View view = (View) scrollView.getParent();
            if (view != null) {
                if (r5 instanceof C27371sP) {
                    if (r5.A01().A01()) {
                        A0E = (ProgressButton) C18180wK.A0E(view, R.id.registrationButton);
                        iDxCListenerShape41S0300000_1_I2 = C18190wL.A0H(r5, 574);
                    } else {
                        A0E = C18180wK.A0E(view, R.id.continueButton);
                        iDxCListenerShape41S0300000_1_I2 = new IDxCListenerShape41S0300000_1_I2(49, (Object) r5, (Object) r5.A01(), (Object) view);
                    }
                    A0E.setOnClickListener(iDxCListenerShape41S0300000_1_I2);
                    r0 = r5.A03;
                } else if (r5 instanceof C27351sN) {
                    C27351sN r11 = (C27351sN) r5;
                    r11.A03.A00();
                    IgTextView igTextView = (IgTextView) C18180wK.A0E(view, R.id.hint_text);
                    IgLinearLayout igLinearLayout = (IgLinearLayout) C18180wK.A0E(view, R.id.hint_wrapper);
                    IgView igView = (IgView) C18180wK.A0E(view, R.id.hint_divider);
                    IgLinearLayout igLinearLayout2 = (IgLinearLayout) C18180wK.A0E(view, R.id.signupContent);
                    igLinearLayout2.setLayoutTransition(new LayoutTransition());
                    igTextView.animate().translationY((float) igTextView.getHeight()).alpha(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER).setListener(new C18270wU(igTextView, r11));
                    igLinearLayout.animate().alpha(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER).translationY((float) igLinearLayout.getHeight()).setListener(new C18280wV(igLinearLayout, igLinearLayout2, igView, (IgView) C18180wK.A0E(view, R.id.divider), r11));
                } else if (r5 instanceof C27411sT) {
                    C27411sT r2 = (C27411sT) r5;
                    if (r2 instanceof C27401sS) {
                        AnonymousClass0wJ.A16(C18180wK.A0E(view, R.id.pinnedRegistrationButton), 574, r2);
                        r0 = r2.A03;
                    } else {
                        AnonymousClass0wJ.A16((ProgressButton) C18180wK.A0E(view, R.id.registrationButton), 574, r2);
                        r0 = r2.A03;
                    }
                } else {
                    r0 = r5.A03;
                }
                r0.A00();
            }
            AnonymousClass3UT.A00(r5.A04).A01 = true;
        }
    }
}
