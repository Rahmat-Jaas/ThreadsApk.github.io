package com.instagram.common.bloks.component.textinput;

import X.AnonymousClass0wJ;
import X.C111326n9;
import X.C130777qk;
import X.C142458et;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.EditText;
import com.instagram.barcelona.R;

public class BloksEditText extends EditText {
    public C142458et A00;
    public final int A01;

    public static BloksEditText A00(Context context) {
        try {
            BloksEditText bloksEditText = new BloksEditText(context, (AttributeSet) null);
            bloksEditText.setBackgroundResource(17170445);
            return bloksEditText;
        } catch (NullPointerException e) {
            String message = e.getMessage();
            if (message != null && message.contains("ConstantState.newDrawable")) {
                return (BloksEditText) AnonymousClass0wJ.A0H(LayoutInflater.from(context), (ViewGroup) null, R.layout.bloks_edit_text);
            }
            throw e;
        }
    }

    public int getDefaultShadowColor() {
        return this.A01;
    }

    public BloksEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A01 = getShadowColor();
    }

    public final void onSelectionChanged(int i, int i2) {
        super.onSelectionChanged(i, i2);
        C142458et r0 = this.A00;
        if (r0 != null) {
            int selectionStart = getSelectionStart();
            int selectionEnd = getSelectionEnd();
            C111326n9 r02 = ((C130777qk) r0).A00;
            r02.A0K = selectionStart;
            r02.A0J = selectionEnd;
        }
    }

    public void setOnSelectionChangedListener(C142458et r1) {
        this.A00 = r1;
    }

    public BloksEditText(Context context) {
        this(context, (AttributeSet) null);
    }
}
