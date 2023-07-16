package com.instagram.debug.devoptions.section.appversion;

import X.AnonymousClass0Jc;
import X.AnonymousClass0TJ;
import X.AnonymousClass0wJ;
import X.AnonymousClass31M;
import X.AnonymousClass3RL;
import X.AnonymousClass4MA;
import X.C04220Ms;
import X.C18230wP;
import X.C61433Tk;
import X.C63803iN;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.barcelona.R;
import com.instagram.debug.devoptions.section.intf.DeveloperOptionsSection;
import com.instagram.service.session.UserSession;
import java.util.ArrayList;
import java.util.List;

public final class AppVersionOptions implements DeveloperOptionsSection {
    public final Context context;
    public final int titleRes = 2131824994;

    public AppVersionOptions(Context context2) {
        C04220Ms.A0B(context2, 1);
        this.context = context2;
    }

    public List getItems(UserSession userSession, FragmentActivity fragmentActivity) {
        int i;
        boolean A1Z = AnonymousClass0wJ.A1Z(userSession, fragmentActivity);
        String A00 = AnonymousClass3RL.A00(this.context);
        C04220Ms.A06(A00);
        AnonymousClass4MA A01 = AnonymousClass4MA.A01((View.OnClickListener) null, A00);
        ArrayList A0v = AnonymousClass0wJ.A0v();
        A0v.add(A01);
        C61433Tk r6 = AnonymousClass31M.A00;
        if (C63803iN.A0E(AnonymousClass0TJ.A05, userSession, 36321889882217551L)) {
            long j = AnonymousClass0Jc.A00(this.context).A00;
            long A06 = C18230wP.A06();
            int intValue = C61433Tk.A00(j, A06).intValue();
            if (intValue != 0) {
                i = R.color.igds_creation_tools_yellow;
                if (intValue != A1Z) {
                    i = R.color.igds_error_or_destructive;
                }
            } else {
                i = R.color.igds_success;
            }
            AnonymousClass4MA r1 = new AnonymousClass4MA((CharSequence) r6.A01(this.context, j, A06), i);
            r1.A03 = new AppVersionOptions$getItems$1(fragmentActivity, userSession);
            A0v.add(r1);
        }
        return A0v;
    }

    public Integer getTitleRes() {
        return Integer.valueOf(this.titleRes);
    }

    public /* synthetic */ boolean isEnabled(UserSession userSession) {
        return true;
    }
}
