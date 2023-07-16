package X;

import android.content.Context;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;

/* renamed from: X.6Vi  reason: invalid class name and case insensitive filesystem */
public final class C102476Vi {
    public static final void A00(IgdsBottomButtonLayout igdsBottomButtonLayout, C110156lD r5) {
        C04220Ms.A0B(igdsBottomButtonLayout, 0);
        Context context = igdsBottomButtonLayout.getContext();
        igdsBottomButtonLayout.setPrimaryAction(context.getString(r5.A00), r5.A02);
        igdsBottomButtonLayout.setPrimaryButtonEnabled(false);
        igdsBottomButtonLayout.setSecondaryAction(context.getString(r5.A01), C86134wK.A0P(r5, 168));
    }
}
