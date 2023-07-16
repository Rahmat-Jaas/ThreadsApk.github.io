package com.facebook.redex;

import X.C09860go;
import X.C130697qc;
import X.C19460Awh;
import X.C86154wM;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.EditText;
import com.facebook.forker.Process;

public class IDxDListenerShape160S0200000_2_I2 implements ViewTreeObserver.OnPreDrawListener {
    public Object A00;
    public Object A01;
    public final int A02;

    public IDxDListenerShape160S0200000_2_I2(int i, Object obj, Object obj2) {
        this.A02 = i;
        this.A00 = obj2;
        this.A01 = obj;
    }

    public final boolean onPreDraw() {
        View view;
        int height;
        switch (this.A02) {
            case 0:
                EditText editText = (EditText) this.A01;
                editText.getViewTreeObserver().removeOnPreDrawListener(this);
                editText.setSelection(editText.length());
                return true;
            case 1:
                C130697qc r4 = (C130697qc) this.A00;
                if (r4.A0D && r4.A0B == (view = (View) this.A01)) {
                    float width = (float) view.getWidth();
                    float f = r4.A09;
                    view.setTranslationX(C86154wM.A00(r4.A0H ? 1 : 0, f, width, f));
                    float height2 = (float) view.getHeight();
                    float f2 = r4.A0A;
                    view.setTranslationY(C86154wM.A00(r4.A0I ? 1 : 0, f2, height2, f2));
                    if (r4.A0E) {
                        float width2 = (float) view.getWidth();
                        float f3 = r4.A02;
                        view.setPivotX(C86154wM.A00(r4.A0F ? 1 : 0, f3, width2, f3));
                        float height3 = (float) view.getHeight();
                        float f4 = r4.A03;
                        view.setPivotY(C86154wM.A00(r4.A0G ? 1 : 0, f4, height3, f4));
                    }
                }
                ((View) this.A01).getViewTreeObserver().removeOnPreDrawListener(this);
                return true;
            default:
                View view2 = (View) this.A01;
                view2.getViewTreeObserver().removeOnPreDrawListener(this);
                if (!(view2.getParent() instanceof ViewGroup)) {
                    return false;
                }
                View view3 = (View) view2.getParent();
                view2.measure(View.MeasureSpec.makeMeasureSpec(view3.getMeasuredWidth(), Process.WAIT_RESULT_TIMEOUT), 0);
                int measuredHeight = (view2.getMeasuredHeight() - view2.getPaddingBottom()) - view2.getPaddingTop();
                C19460Awh awh = (C19460Awh) this.A00;
                if (0 >= measuredHeight) {
                    C09860go.A0V(view2, (-measuredHeight) >> 1);
                }
                if (awh.A0H) {
                    height = Math.max(0, view2.getMeasuredHeight());
                } else {
                    height = view3.getHeight();
                }
                C09860go.A0O(view2, height);
                return false;
        }
    }
}
