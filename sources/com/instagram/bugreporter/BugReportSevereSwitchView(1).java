package com.instagram.bugreporter;

import X.AnonymousClass1w9;
import X.AnonymousClass3EX;
import X.AnonymousClass4Lh;
import X.C04220Ms;
import X.C18180wK;
import X.C18200wM;
import X.C18210wN;
import X.C18220wO;
import X.C37032Jj9;
import X.C37383Jqm;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import com.facebook.redex.IDxCListenerShape70S0200000_1_I2;
import com.instagram.igds.components.switchbutton.IgSwitch;
import com.instagram.service.session.UserSession;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class BugReportSevereSwitchView extends RelativeLayout {
    public IgSwitch A00;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public BugReportSevereSwitchView(Context context) {
        this(context, (AttributeSet) null, 0);
        C04220Ms.A0B(context, 1);
    }

    public final boolean A01(AnonymousClass3EX r8, UserSession userSession, boolean z) {
        C37032Jj9 A0L = C18210wN.A0L(userSession);
        A0L.A0J = new AnonymousClass4Lh(this, z);
        C37383Jqm A002 = A0L.A00();
        IDxCListenerShape70S0200000_1_I2 A0R = C18200wM.A0R(this, r8, 28);
        IDxCListenerShape70S0200000_1_I2 A0R2 = C18200wM.A0R(this, r8, 27);
        Bundle A06 = C18180wK.A06();
        A06.putBoolean("SevereBugDescriptionBottomSheetFragment.ARGUMENT_INCLUDE_BUTTONS", z);
        AnonymousClass1w9 r1 = new AnonymousClass1w9();
        r1.setArguments(A06);
        r1.A00 = A0R2;
        r1.A01 = A0R;
        C37383Jqm.A00(A00(this), r1, A002);
        return true;
    }

    public static final Activity A00(BugReportSevereSwitchView bugReportSevereSwitchView) {
        for (Context context = bugReportSevereSwitchView.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
        }
        throw C18180wK.A0a("Unable to get activity");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BugReportSevereSwitchView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C04220Ms.A0B(context, 1);
    }

    public /* synthetic */ BugReportSevereSwitchView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, C18210wN.A0D(attributeSet, i2), C18220wO.A00(i2, i));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public BugReportSevereSwitchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C04220Ms.A0B(context, 1);
    }
}
