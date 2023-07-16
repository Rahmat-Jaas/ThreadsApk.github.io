package com.facebook.redex;

import X.AnonymousClass00U;
import X.AnonymousClass0hL;
import X.AnonymousClass10I;
import X.AnonymousClass17S;
import X.AnonymousClass22M;
import X.AnonymousClass3Zy;
import X.AnonymousClass5rY;
import X.C04220Ms;
import X.C10650ih;
import X.C15430rJ;
import X.C16430t3;
import X.C18180wK;
import X.C18480xG;
import X.C22781Zl;
import X.C25529DnJ;
import X.C33745Htj;
import X.C69794Ai;
import X.C86074wE;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.activity.ComponentActivity;
import androidx.fragment.app.Fragment;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1200000_I2;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape1S0200000_I2_1;
import com.instagram.model.venue.Venue;
import java.io.File;
import java.util.List;

public class IDxHDelegateShape496S0100000_1_I2 implements C33745Htj {
    public Object A00;
    public final int A01;

    public IDxHDelegateShape496S0100000_1_I2(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void BNY(Intent intent) {
        Object value;
        AnonymousClass17S r10;
        Intent intent2 = intent;
        switch (this.A01) {
            case 0:
                if (intent2.getAction() != null) {
                    Uri A012 = C15430rJ.A01(intent2.getAction());
                    if (A012.getScheme() == null) {
                        A012 = C15430rJ.A01(AnonymousClass00U.A0L("file://", intent2.getAction()));
                    }
                    new C18480xG(A012, (C69794Ai) this.A00, 1).execute(new Void[0]);
                    return;
                }
                return;
            case 3:
                C04220Ms.A0B(intent2, 0);
                String action = intent2.getAction();
                if (action != null) {
                    File file = new File(action);
                    C86074wE r4 = ((AnonymousClass10I) ((C22781Zl) this.A00).A03.getValue()).A04;
                    do {
                        value = r4.getValue();
                        r10 = (AnonymousClass17S) value;
                    } while (!r4.ADi(value, AnonymousClass17S.A00(new KtCSuperShape0S1200000_I2((Object) new AnonymousClass5rY(file), r10.A00.A01, (String) null, 13), (KtCSuperShape1S0200000_I2_1) null, (AnonymousClass22M) null, r10, (Venue) null, (String) null, (String) null, (String) null, (List) null, 959, false, false)));
                    return;
                }
                return;
            default:
                return;
        }
    }

    public final void Cv8(File file, int i) {
        switch (this.A01) {
            case 0:
                C69794Ai r3 = (C69794Ai) this.A00;
                Context requireContext = r3.A02.requireContext();
                if (r3.A02 != null) {
                    File A05 = AnonymousClass0hL.A05(requireContext);
                    r3.A04 = A05;
                    AnonymousClass3Zy.A03(r3.A02, A05, 2);
                    return;
                }
                return;
            case 1:
            case 2:
            case 4:
            case 5:
                C04220Ms.A0B(file, 0);
                AnonymousClass3Zy.A02((Activity) this.A00, file, i);
                return;
            default:
                return;
        }
    }

    public final void CvN(Intent intent, int i) {
        Fragment fragment;
        switch (this.A01) {
            case 0:
                C69794Ai r2 = (C69794Ai) this.A00;
                Context context = r2.A02.getContext();
                if (context != null && C25529DnJ.A02.A03(context, intent)) {
                    fragment = r2.A02;
                    break;
                } else {
                    return;
                }
                break;
            case 1:
            case 2:
            case 4:
                C04220Ms.A0B(intent, 0);
                C10650ih.A08((Activity) this.A00, intent, i);
                return;
            case 3:
                C04220Ms.A0B(intent, 0);
                fragment = (Fragment) this.A00;
                Context context2 = fragment.getContext();
                if (context2 == null || !C25529DnJ.A02.A03(context2, intent)) {
                    return;
                }
            case 5:
                C04220Ms.A0B(intent, 0);
                C16430t3.A00((Activity) this.A00, intent, i);
                return;
            case 6:
                ((ComponentActivity) this.A00).startActivityForResult(intent, i, C18180wK.A06());
                return;
            default:
                return;
        }
        C10650ih.A0E(intent, fragment, i);
    }
}
