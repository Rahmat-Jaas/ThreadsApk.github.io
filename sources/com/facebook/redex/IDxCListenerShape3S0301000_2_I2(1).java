package com.facebook.redex;

import X.AnonymousClass0wJ;
import X.AnonymousClass7IM;
import X.C14030oh;
import X.C18180wK;
import X.C18210wN;
import X.C86124wJ;
import X.C86144wL;
import X.I17;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import androidx.fragment.app.Fragment;
import com.facebook.browser.lite.extensions.autofill.model.AutofillData;
import com.facebook.browser.lite.ipc.BrowserLiteJSBridgeCall;
import com.instagram.barcelona.R;
import com.instagram.common.ui.base.IgLinearLayout;
import java.util.ArrayList;
import java.util.Iterator;

public class IDxCListenerShape3S0301000_2_I2 implements View.OnClickListener {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public final int A04;

    public IDxCListenerShape3S0301000_2_I2(int i, int i2, Object obj, Object obj2, Object obj3) {
        this.A04 = i2;
        this.A03 = obj2;
        this.A01 = obj;
        this.A02 = obj3;
        this.A00 = i;
    }

    public final void onClick(View view) {
        int A05;
        int i;
        if (this.A04 != 0) {
            A05 = C14030oh.A05(1292741968);
            Fragment fragment = (Fragment) this.A03;
            EditText editText = (EditText) this.A01;
            IgLinearLayout igLinearLayout = (IgLinearLayout) this.A02;
            int i2 = this.A00;
            editText.setText("");
            AnonymousClass7IM r2 = AnonymousClass7IM.A00;
            AnonymousClass7IM.A00(fragment.requireContext(), editText, i2, false);
            r2.A03(igLinearLayout, i2, false);
            Drawable drawable = fragment.requireContext().getDrawable(R.drawable.comment_poll_option_row_hint_background);
            if (drawable != null) {
                igLinearLayout.setBackground(drawable);
                i = -1737810393;
            } else {
                throw AnonymousClass0wJ.A0b();
            }
        } else {
            A05 = C14030oh.A05(1458300770);
            Bundle A06 = C18180wK.A06();
            A06.putParcelable("BrowserLiteIntent.EXTRA_AUTOFILL_REQUEST_AUTOFILL_JS_BRIDGE_CALL", (BrowserLiteJSBridgeCall) this.A03);
            A06.putString("BrowserLiteIntent.EXTRA_AUTOFILL_EDIT_AUTOFILL_ENTRY_REQUEST_SOURCE", "autofill_request_fragment");
            ArrayList A0v = AnonymousClass0wJ.A0v();
            Iterator A0y = C86144wL.A0y(this.A01);
            while (A0y.hasNext()) {
                C18210wN.A1O(((AutofillData) A0y.next()).A01(), A0v);
            }
            A06.putStringArrayList("BrowserLiteIntent.EXTRA_AUTOFILL_ENTRY_JSON_STRINGS", A0v);
            A06.putInt(I17.A00(71), this.A00);
            C86124wJ.A1D(A06, this.A02);
            i = 1251987646;
        }
        C14030oh.A0C(i, A05);
    }
}
