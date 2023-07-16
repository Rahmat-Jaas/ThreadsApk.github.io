package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.instagram.igds.components.mediabutton.IgdsMediaButton;

/* renamed from: X.2Lh  reason: invalid class name and case insensitive filesystem */
public final class C34892Lh {
    public static final IgdsMediaButton A00(Context context, Integer num) {
        int generateViewId;
        C04220Ms.A0B(context, 0);
        IgdsMediaButton igdsMediaButton = new IgdsMediaButton(context, (AttributeSet) null, 0);
        igdsMediaButton.setSize(C308423e.LARGE);
        igdsMediaButton.setButtonStyle(AnonymousClass25V.CREATION_FLOW);
        igdsMediaButton.setLayoutParams(new C39909L6z(-2, -2));
        if (num != null) {
            generateViewId = num.intValue();
        } else {
            generateViewId = View.generateViewId();
        }
        igdsMediaButton.setId(generateViewId);
        return igdsMediaButton;
    }
}
