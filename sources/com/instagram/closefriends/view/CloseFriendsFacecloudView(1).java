package com.instagram.closefriends.view;

import X.AnonymousClass006;
import X.AnonymousClass0wJ;
import X.C04220Ms;
import X.C06750aI;
import X.C09860go;
import X.C18210wN;
import X.C25812DsR;
import X.C27927Evd;
import X.C86134wK;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class CloseFriendsFacecloudView extends FrameLayout implements C27927Evd {
    public static final List A03 = C06750aI.A17(120, 20, 240, 300, 180, 60, 330, 210, 45, 255);
    public static final List A04 = C06750aI.A17(110, 110, 130, 110, 130, 130, 90, 90, 90, 90);
    public static final List A05 = C06750aI.A17(62, 52, 36, 36, 36, 62, 36, 36, 36, 36);
    public Integer A00;
    public final C25812DsR A01;
    public final List A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CloseFriendsFacecloudView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C04220Ms.A0B(context, 1);
        this.A02 = AnonymousClass0wJ.A0v();
        C25812DsR A0O = C86134wK.A0O();
        A0O.A0A(0.0d);
        A0O.A08();
        A0O.A0E(this);
        this.A01 = A0O;
        this.A00 = AnonymousClass006.A00;
    }

    public final void CLf(C25812DsR dsR) {
    }

    public final void CLg(C25812DsR dsR) {
        C04220Ms.A0B(dsR, 0);
        if (this.A00 == AnonymousClass006.A01) {
            this.A00 = AnonymousClass006.A0C;
            C09860go.A00(getContext(), 3.0f);
            Iterator it = this.A02.iterator();
            if (it.hasNext()) {
                it.next();
                throw C18210wN.A0W("isAnimated");
            }
        }
    }

    public final void CLh(C25812DsR dsR) {
    }

    public final void CLi(C25812DsR dsR) {
        C04220Ms.A0B(dsR, 0);
        if (this.A00 == AnonymousClass006.A01) {
            getWidth();
            getHeight();
            Iterator it = this.A02.iterator();
            if (it.hasNext()) {
                it.next();
                throw C18210wN.A0W("isAnimated");
            }
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CloseFriendsFacecloudView(Context context) {
        this(context, (AttributeSet) null);
        C04220Ms.A0B(context, 1);
    }

    public /* synthetic */ CloseFriendsFacecloudView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, C18210wN.A0D(attributeSet, i));
    }
}
