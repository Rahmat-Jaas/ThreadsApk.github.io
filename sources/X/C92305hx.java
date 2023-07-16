package X;

import android.content.Context;
import com.facebookpay.form.view.BaseAutoCompleteTextView;

/* renamed from: X.5hx  reason: invalid class name and case insensitive filesystem */
public final class C92305hx extends C93675qs implements C143538gu {
    public C91955hM A00;
    public final C143158gC A01 = C86114wI.A0Q(this, 67);

    /* access modifiers changed from: private */
    public String[] getOptions() {
        int[] iArr = this.A00.A02;
        int length = iArr.length;
        String[] strArr = new String[length];
        for (int i = 0; i < length; i++) {
            strArr[i] = getResources().getString(iArr[i]);
        }
        return strArr;
    }

    public void setViewModel(C91955hM r4) {
        this.A00 = r4;
        setHint((CharSequence) getResources().getString(r4.A00));
        BaseAutoCompleteTextView baseAutoCompleteTextView = this.A04;
        baseAutoCompleteTextView.setText(this.A00.A02[0]);
        setDescendantFocusability(393216);
        C86104wH.A1C(baseAutoCompleteTextView, 20, this);
        baseAutoCompleteTextView.setLongClickable(false);
    }

    public C92305hx(Context context) {
        super(context);
    }

    public final void onAttachedToWindow() {
        int A06 = C14030oh.A06(-1395454848);
        super.onAttachedToWindow();
        this.A00.A05.A0E(this.A01);
        C14030oh.A0D(447354695, A06);
    }

    public final void onDetachedFromWindow() {
        int A06 = C14030oh.A06(1144223234);
        super.onDetachedFromWindow();
        this.A00.A05.A0F(this.A01);
        C14030oh.A0D(-1547237695, A06);
    }
}
