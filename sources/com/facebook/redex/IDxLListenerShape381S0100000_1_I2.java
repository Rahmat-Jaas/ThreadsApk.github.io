package com.facebook.redex;

import X.AnonymousClass1bD;
import X.AnonymousClass7Ko;
import X.C04220Ms;
import X.C19554AyF;
import X.C22302CTd;
import android.view.ViewTreeObserver;
import android.view.inputmethod.InputMethodManager;
import com.instagram.igds.components.search.InlineSearchBox;

public class IDxLListenerShape381S0100000_1_I2 implements ViewTreeObserver.OnGlobalLayoutListener {
    public Object A00;
    public final int A01;

    public IDxLListenerShape381S0100000_1_I2(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void onGlobalLayout() {
        switch (this.A01) {
            case 0:
                C22302CTd cTd = (C22302CTd) this.A00;
                cTd.getRecyclerView().getViewTreeObserver().removeOnGlobalLayoutListener(this);
                C19554AyF ayF = C19554AyF.A01;
                AnonymousClass7Ko.A07(ayF, "Error! Trying to access ReelsPlugin without an instance!");
                if (ayF.A08(cTd.requireActivity()) != null) {
                    C04220Ms.A0E("delegate");
                    throw null;
                }
                return;
            case 1:
                InlineSearchBox inlineSearchBox = (InlineSearchBox) this.A00;
                inlineSearchBox.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                if (inlineSearchBox.isAttachedToWindow()) {
                    inlineSearchBox.A03();
                    return;
                }
                return;
            default:
                AnonymousClass1bD r3 = (AnonymousClass1bD) this.A00;
                r3.A00.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                InputMethodManager inputMethodManager = (InputMethodManager) r3.getRootActivity().getSystemService("input_method");
                if (inputMethodManager != null) {
                    inputMethodManager.showSoftInput(r3.A00, 0);
                    return;
                }
                return;
        }
    }
}
