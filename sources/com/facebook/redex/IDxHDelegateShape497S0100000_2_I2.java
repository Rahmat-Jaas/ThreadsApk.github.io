package com.facebook.redex;

import X.AnonymousClass56W;
import X.AnonymousClass5xV;
import X.AnonymousClass5xW;
import X.C04220Ms;
import X.C105546db;
import X.C10650ih;
import X.C109546kB;
import X.C25529DnJ;
import X.C33745Htj;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import androidx.fragment.app.Fragment;
import com.instagram.barcelona.mainactivity.BarcelonaActivity;
import java.io.File;

public class IDxHDelegateShape497S0100000_2_I2 implements C33745Htj {
    public Object A00;
    public final int A01;

    public IDxHDelegateShape497S0100000_2_I2(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void BNY(Intent intent) {
        String str;
        AnonymousClass56W r0;
        C105546db r02;
        switch (this.A01) {
            case 0:
                C04220Ms.A0B(intent, 0);
                String action = intent.getAction();
                if (action != null && (r02 = (C105546db) ((BarcelonaActivity) this.A00).A04.getValue()) != null) {
                    r02.A00.CrC(action);
                    return;
                }
                return;
            case 1:
                C04220Ms.A0B(intent, 0);
                str = intent.getAction();
                if (str != null) {
                    r0 = AnonymousClass5xV.A00((AnonymousClass5xV) this.A00);
                    break;
                } else {
                    return;
                }
            case 2:
                C04220Ms.A0B(intent, 0);
                str = intent.getAction();
                if (str != null) {
                    r0 = (AnonymousClass56W) ((AnonymousClass5xW) this.A00).A06.getValue();
                    break;
                } else {
                    return;
                }
            default:
                return;
        }
        r0.A0H(str);
    }

    public final void CvN(Intent intent, int i) {
        Activity activity;
        switch (this.A01) {
            case 0:
                C04220Ms.A0B(intent, 0);
                C25529DnJ dnJ = C25529DnJ.A02;
                activity = (Activity) this.A00;
                if (!dnJ.A03(activity, intent)) {
                    return;
                }
                break;
            case 3:
                C04220Ms.A0B(intent, 0);
                activity = ((C109546kB) this.A00).A00;
                break;
            default:
                C04220Ms.A0B(intent, 0);
                Fragment fragment = (Fragment) this.A00;
                Context context = fragment.getContext();
                if (context != null && C25529DnJ.A02.A03(context, intent)) {
                    C10650ih.A0E(intent, fragment, i);
                    return;
                }
                return;
        }
        C10650ih.A08(activity, intent, i);
    }

    public final /* synthetic */ void Cv8(File file, int i) {
    }
}
