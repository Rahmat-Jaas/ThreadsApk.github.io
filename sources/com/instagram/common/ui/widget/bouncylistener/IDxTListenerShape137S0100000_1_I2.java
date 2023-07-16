package com.instagram.common.ui.widget.bouncylistener;

import X.BF4;
import X.C04220Ms;
import X.C18240wQ;
import android.view.View;
import com.instagram.igds.components.search.InlineSearchBox;

public class IDxTListenerShape137S0100000_1_I2 extends BF4 {
    public Object A00;
    public final int A01;

    public IDxTListenerShape137S0100000_1_I2(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final boolean COg(View view) {
        switch (this.A01) {
            case 0:
                C18240wQ.A1G(this.A00);
                return false;
            case 1:
                C04220Ms.A0B(view, 0);
                if (view.isEnabled()) {
                    view.performHapticFeedback(3);
                    ((InlineSearchBox) this.A00).A01();
                    break;
                } else {
                    return false;
                }
            default:
                C04220Ms.A0B(view, 0);
                if (view.isEnabled()) {
                    view.performHapticFeedback(3);
                    ((View.OnClickListener) this.A00).onClick(view);
                    break;
                } else {
                    return false;
                }
        }
        return true;
    }
}
