package com.instagram.direct.fragment.thread.actionbar;

import X.AnonymousClass0wJ;
import X.AnonymousClass51E;
import X.C108176hw;
import X.C11630kW;
import X.C86154wM;
import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import com.instagram.common.typedurl.ImageUrl;
import java.util.ArrayList;
import java.util.List;

public class GroupThreadCoPresenceAvatarView extends FrameLayout {
    public final Context A00;
    public final AnonymousClass51E A01;
    public final AnonymousClass51E A02;
    public final AnonymousClass51E A03;
    public final AnonymousClass51E A04;
    public final List A05;

    private void setupAvatar(C11630kW r8, AnonymousClass51E r9, int i, int i2, int i3, int i4, int i5, ImageUrl imageUrl) {
        Context context = this.A00;
        int A012 = (int) C86154wM.A01(context, i);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(A012, A012);
        layoutParams.setMargins((int) C86154wM.A01(context, i2), (int) C86154wM.A01(context, i3), (int) C86154wM.A01(context, i4), (int) C86154wM.A01(context, i5));
        r9.setLayoutParams(layoutParams);
        r9.setAvatarUrl(imageUrl, r8);
        r9.setBottomBadge(A012);
    }

    public GroupThreadCoPresenceAvatarView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A00 = context;
        AnonymousClass51E r7 = new AnonymousClass51E(context);
        this.A01 = r7;
        AnonymousClass51E r6 = new AnonymousClass51E(context);
        this.A02 = r6;
        AnonymousClass51E r5 = new AnonymousClass51E(context);
        this.A03 = r5;
        AnonymousClass51E r4 = new AnonymousClass51E(context);
        this.A04 = r4;
        addView(r7);
        addView(r6);
        addView(r5);
        addView(r4);
        ArrayList A0v = AnonymousClass0wJ.A0v();
        this.A05 = A0v;
        A0v.add(new C108176hw(r7.animate(), r7));
        A0v.add(new C108176hw(r6.animate(), r6));
        A0v.add(new C108176hw(r5.animate(), r5));
        A0v.add(new C108176hw((ViewPropertyAnimator) null, r4));
    }

    public GroupThreadCoPresenceAvatarView(Context context) {
        this(context, (AttributeSet) null);
    }

    public GroupThreadCoPresenceAvatarView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
