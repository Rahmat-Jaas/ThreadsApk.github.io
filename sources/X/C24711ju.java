package X;

import android.content.res.Resources;
import android.view.View;
import com.facebook.redex.IDxCListenerShape201S0100000_1_I2;
import com.instagram.business.ui.BusinessNavBar;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;

/* renamed from: X.1ju  reason: invalid class name and case insensitive filesystem */
public final class C24711ju extends C19819BBt {
    public BusinessNavBar A00;
    public C84264sr A01;
    public IgdsBottomButtonLayout A02;
    public boolean A03;
    public String A04;

    public final void A00() {
        this.A03 = false;
        BusinessNavBar businessNavBar = this.A00;
        if (businessNavBar != null) {
            businessNavBar.setShowProgressBarOnPrimaryButton(false);
        } else {
            IgdsBottomButtonLayout igdsBottomButtonLayout = this.A02;
            if (igdsBottomButtonLayout != null) {
                igdsBottomButtonLayout.setPrimaryActionIsLoading(false);
            }
        }
        this.A01.AJV();
    }

    public final void A01() {
        this.A03 = true;
        BusinessNavBar businessNavBar = this.A00;
        if (businessNavBar != null) {
            businessNavBar.setShowProgressBarOnPrimaryButton(true);
        } else {
            IgdsBottomButtonLayout igdsBottomButtonLayout = this.A02;
            if (igdsBottomButtonLayout != null) {
                igdsBottomButtonLayout.setPrimaryActionIsLoading(true);
            }
        }
        this.A01.AHz();
    }

    public final void onDestroyView() {
        this.A01 = null;
        this.A00 = null;
        this.A02 = null;
    }

    public final void A02(boolean z) {
        BusinessNavBar businessNavBar = this.A00;
        if (businessNavBar != null) {
            businessNavBar.setPrimaryButtonEnabled(z);
            return;
        }
        IgdsBottomButtonLayout igdsBottomButtonLayout = this.A02;
        if (igdsBottomButtonLayout != null) {
            igdsBottomButtonLayout.setPrimaryButtonEnabled(z);
        }
    }

    public final void A03(boolean z) {
        String str;
        BusinessNavBar businessNavBar = this.A00;
        if (businessNavBar != null) {
            businessNavBar.A03.setVisibility(C18190wL.A00(z ? 1 : 0));
            businessNavBar.A00();
            return;
        }
        IgdsBottomButtonLayout igdsBottomButtonLayout = this.A02;
        if (igdsBottomButtonLayout != null) {
            if (z) {
                str = this.A04;
            } else {
                str = null;
            }
            igdsBottomButtonLayout.setSecondaryActionText(str);
        }
    }

    public final void Bsd(View view) {
        IDxCListenerShape201S0100000_1_I2 A0H = C18190wL.A0H(this, 219);
        IDxCListenerShape201S0100000_1_I2 A0H2 = C18190wL.A0H(this, 220);
        BusinessNavBar businessNavBar = this.A00;
        if (businessNavBar != null) {
            businessNavBar.setPrimaryButtonOnclickListeners(A0H);
            this.A00.setSecondaryButtonOnclickListeners(A0H2);
            return;
        }
        IgdsBottomButtonLayout igdsBottomButtonLayout = this.A02;
        if (igdsBottomButtonLayout != null) {
            igdsBottomButtonLayout.setPrimaryActionOnClickListener(A0H);
            this.A02.setSecondaryActionOnClickListener(A0H2);
        }
    }

    public C24711ju(C84264sr r4, IgdsBottomButtonLayout igdsBottomButtonLayout, int i, int i2) {
        this.A01 = r4;
        this.A02 = igdsBottomButtonLayout;
        Resources resources = igdsBottomButtonLayout.getResources();
        igdsBottomButtonLayout.setPrimaryActionText(resources.getString(i));
        boolean z = false;
        if (i2 != -1) {
            z = true;
            this.A04 = resources.getString(i2);
        }
        A03(z);
    }

    public C24711ju(BusinessNavBar businessNavBar, C84264sr r5, int i, int i2) {
        this.A01 = r5;
        this.A00 = businessNavBar;
        businessNavBar.setPrimaryButtonText(i);
        BusinessNavBar businessNavBar2 = this.A00;
        if (i2 != -1) {
            businessNavBar2.setSecondaryButtonText(i2);
            return;
        }
        businessNavBar2.A03.setVisibility(8);
        businessNavBar2.A00();
    }
}
