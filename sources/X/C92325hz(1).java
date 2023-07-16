package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import com.facebook.redex.IDxCListenerShape203S0100000_2_I2;
import com.facebook.redex.IDxObjectShape237S0100000_2_I2;
import com.facebook.redex.IDxObjectShape283S0100000_2_I2;
import com.facebook.redex.IDxObserverShape211S0100000_2_I2;
import com.facebookpay.form.view.BaseAutoCompleteTextView;
import com.fbpay.theme.FBPayIcon;
import com.instagram.barcelona.R;

/* renamed from: X.5hz  reason: invalid class name and case insensitive filesystem */
public class C92325hz extends C93675qs implements C143538gu {
    public int A00;
    public int A01;
    public int A02;
    public FrameLayout A03;
    public C92005hR A04;
    public final TextWatcher A05 = new IDxObjectShape283S0100000_2_I2(this, 0);
    public final View.OnFocusChangeListener A06 = new AnonymousClass7RS(this);
    public final View.OnKeyListener A07 = new AnonymousClass7RV(this);
    public final C143158gC A08 = new IDxObserverShape211S0100000_2_I2(this, 71);
    public final C143158gC A09 = new IDxObserverShape211S0100000_2_I2(this, 73);
    public final C143158gC A0A = C86114wI.A0Q(new IDxObserverShape211S0100000_2_I2(this, 72), 275);
    public final C143158gC A0B = new IDxObserverShape211S0100000_2_I2(this, 76);
    public final C143158gC A0C = new IDxObserverShape211S0100000_2_I2(this, 68);
    public final C143158gC A0D = new IDxObserverShape211S0100000_2_I2(this, 74);
    public final C143158gC A0E = new IDxObserverShape211S0100000_2_I2(this, 70);
    public final C143158gC A0F = new IDxObserverShape211S0100000_2_I2(this, 75);
    public final C143158gC A0G = new IDxObserverShape211S0100000_2_I2(this, 69);

    public static void A05(C92325hz r6) {
        BaseAutoCompleteTextView baseAutoCompleteTextView = r6.A04;
        boolean hasFocus = baseAutoCompleteTextView.hasFocus();
        Integer A0d = C18220wO.A0d();
        if (hasFocus || baseAutoCompleteTextView.getText().length() > 0) {
            r6.setPadding(r6.getPaddingLeft(), r6.A01, r6.getPaddingRight(), r6.A00);
            AnonymousClass7IS.A03(r6.A02, A0d, A0d, A0d, A0d);
            return;
        }
        r6.setPadding(r6.getPaddingLeft(), r6.A01 - r6.A02, r6.getPaddingRight(), r6.A00 + r6.A02);
        AnonymousClass7IS.A03(r6.A02, A0d, A0d, Integer.valueOf(r6.A02), A0d);
    }

    public static void A06(C92325hz r4, AnonymousClass75V r5) {
        Drawable drawable;
        IDxCListenerShape203S0100000_2_I2 iDxCListenerShape203S0100000_2_I2;
        boolean z;
        if (!Boolean.TRUE.equals(r4.A04.A07.A08())) {
            if (r5 == null) {
                r4.A02.setVisibility(8);
                z = false;
            } else {
                FBPayIcon fBPayIcon = r5.A00;
                Integer num = r5.A01;
                if (fBPayIcon != null) {
                    int i = fBPayIcon.A01;
                    if (i == 42) {
                        z = true;
                    } else {
                        drawable = AnonymousClass7Kz.A0G().A04(r4.getContext(), i, fBPayIcon.A00);
                        iDxCListenerShape203S0100000_2_I2 = C86134wK.A0P(r4, 22);
                    }
                } else if (num != null) {
                    drawable = r4.getContext().getDrawable(num.intValue());
                    drawable.getClass();
                    iDxCListenerShape203S0100000_2_I2 = null;
                } else {
                    return;
                }
                r4.A0V(drawable, iDxCListenerShape203S0100000_2_I2, Integer.valueOf(R.dimen.asset_search_icon_width));
                return;
            }
            r4.setShowLoadingSpinner(z);
        }
    }

    private String getAccessibilityHint() {
        int i = this.A04.A03;
        if (i != 0) {
            return getResources().getString(i);
        }
        return "";
    }

    private String getAccessibilityLabel() {
        int i = this.A04.A04;
        if (i != 0) {
            return getResources().getString(i);
        }
        return getExistingHint();
    }

    /* access modifiers changed from: private */
    public String getExistingError() {
        if (this.A04.A0M() != 0) {
            return getResources().getString(this.A04.A0M());
        }
        if (this.A04.A0N() != null) {
            return this.A04.A0N();
        }
        return "";
    }

    /* access modifiers changed from: private */
    public String getExistingHint() {
        C92005hR r0 = this.A04;
        int i = r0.A05;
        if (i != 0) {
            return getResources().getString(i);
        }
        String str = r0.A0O;
        if (str == null) {
            return "";
        }
        return str;
    }

    public C92005hR getViewModel() {
        return this.A04;
    }

    public void setViewModel(C92005hR r5) {
        int i;
        this.A04 = r5;
        this.A06 = r5.A0P;
        setId(View.generateViewId());
        BaseAutoCompleteTextView baseAutoCompleteTextView = this.A04;
        baseAutoCompleteTextView.setId(this.A04.A03);
        baseAutoCompleteTextView.setText((String) AnonymousClass7Ih.A0C(this.A04));
        switch (this.A04.A0M.intValue()) {
            case 1:
                i = 4099;
                break;
            case 2:
                i = 2;
                break;
            case 3:
                i = 1;
                break;
            case 4:
                i = 4097;
                break;
            case 6:
                i = 33;
                break;
            default:
                i = 3;
                break;
        }
        baseAutoCompleteTextView.setInputType(i);
        String str = this.A04.A0N;
        if (str != null) {
            baseAutoCompleteTextView.setAutofillHints(new String[]{str});
            baseAutoCompleteTextView.setImportantForAutofill(1);
        }
        baseAutoCompleteTextView.A02 = new IDxObjectShape237S0100000_2_I2(this, 2);
        baseAutoCompleteTextView.A03 = new IDxObjectShape237S0100000_2_I2(this, 1);
        setEnabled(this.A04.A08);
        A04(this);
        if (this.A04.A0R) {
            baseAutoCompleteTextView.requestFocus();
            InputMethodManager A0F2 = C86134wK.A0F(this);
            if (A0F2 != null) {
                A0F2.showSoftInput(baseAutoCompleteTextView, 1);
            }
        }
        if (this.A04.A0P) {
            A0U();
            Context context = getContext();
            int A002 = (int) C117006xy.A00(context, R.attr.fbpay_condensed_input_field_vertical_padding);
            int A003 = (int) C117006xy.A00(context, R.attr.fbpay_condensed_input_field_horizontal_padding);
            setPadding(A003, A002, A003, A002);
        }
        this.A03 = (FrameLayout) baseAutoCompleteTextView.getParent();
        this.A01 = getPaddingTop();
        this.A00 = getPaddingBottom();
        if (this.A03 != null) {
            this.A02 = (int) C117006xy.A00(getContext(), R.attr.fbpay_input_field_vertical_adjust_padding);
            A05(this);
        }
        setOnClickListener(C86134wK.A0P(this, 21));
        baseAutoCompleteTextView.addTextChangedListener(this.A05);
        baseAutoCompleteTextView.setOnFocusChangeListener(this.A06);
        baseAutoCompleteTextView.setOnKeyListener(this.A07);
    }

    public C92325hz(Context context) {
        super(context);
    }

    public static void A04(C92325hz r6) {
        String accessibilityLabel = r6.getAccessibilityLabel();
        BaseAutoCompleteTextView baseAutoCompleteTextView = r6.A04;
        if (!TextUtils.isEmpty(baseAutoCompleteTextView.getText())) {
            accessibilityLabel = TextUtils.join(", ", new Object[]{accessibilityLabel, baseAutoCompleteTextView.getText()});
        }
        C116836xd.A00(baseAutoCompleteTextView, false, AnonymousClass006.A0Y, r6.getAccessibilityHint(), accessibilityLabel);
    }

    /* access modifiers changed from: private */
    public String getAccessibilityHintWithError() {
        String A0L;
        String accessibilityHint = getAccessibilityHint();
        if (this.A04.A0L() == 0) {
            return accessibilityHint;
        }
        boolean isEmpty = accessibilityHint.isEmpty();
        Resources resources = getResources();
        int A0L2 = this.A04.A0L();
        Object[] objArr = new Object[1];
        if (isEmpty) {
            A0L = "";
        } else {
            A0L = AnonymousClass00U.A0L(", ", accessibilityHint);
        }
        objArr[0] = A0L;
        return resources.getString(A0L2, objArr);
    }

    public void onAttachedToWindow() {
        int A062 = C14030oh.A06(265752293);
        super.onAttachedToWindow();
        this.A04.A07.A0E(this.A0F);
        this.A04.A0E.A0E(this.A0B);
        this.A04.A0C.A0E(this.A0C);
        this.A04.A0F.A0E(this.A0G);
        this.A04.A08.A0E(this.A08);
        this.A04.A09.A0E(this.A09);
        this.A04.A0D.A0E(this.A0D);
        this.A04.A06.A0E(this.A0E);
        this.A04.A0A.A0E(this.A0A);
        C14030oh.A0D(1964128704, A062);
    }

    public void onDetachedFromWindow() {
        int A062 = C14030oh.A06(1985265656);
        super.onDetachedFromWindow();
        this.A04.A07.A0F(this.A0F);
        this.A04.A0E.A0F(this.A0B);
        this.A04.A0C.A0F(this.A0C);
        this.A04.A0F.A0F(this.A0G);
        this.A04.A08.A0F(this.A08);
        this.A04.A09.A0F(this.A09);
        this.A04.A0D.A0F(this.A0D);
        this.A04.A06.A0F(this.A0E);
        this.A04.A0A.A0F(this.A0A);
        C14030oh.A0D(-491614000, A062);
    }
}
