package com.facebook.redex;

import X.AnonymousClass0TJ;
import X.AnonymousClass1wX;
import X.AnonymousClass3GB;
import X.AnonymousClass3J5;
import X.AnonymousClass4Q0;
import X.AnonymousClass5z3;
import X.C146958n9;
import X.C18180wK;
import X.C18200wM;
import X.C18210wN;
import X.C25237DiI;
import X.C27930Evg;
import X.C27952Ew2;
import X.C29131wm;
import X.C62793ak;
import X.C63803iN;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.instagram.arp.profilepicture.repository.EditAvatarProfilePictureRepository;
import kotlin.coroutines.jvm.internal.KtSLambdaShape22S0201000_I2_8;
import kotlin.coroutines.jvm.internal.KtSLambdaShape4S0101000_I2_1;

public class IDxEListenerShape509S0100000_1_I2 implements C27930Evg {
    public Object A00;
    public final int A01;

    public IDxEListenerShape509S0100000_1_I2(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void Blz() {
        View view;
        switch (this.A01) {
            case 0:
                EditAvatarProfilePictureRepository editAvatarProfilePictureRepository = ((AnonymousClass3GB) this.A00).A04;
                editAvatarProfilePictureRepository.A0C.CrC(AnonymousClass5z3.A00);
                C25237DiI.A00((Integer) null, (C27952Ew2) null, new KtSLambdaShape4S0101000_I2_1(editAvatarProfilePictureRepository, (C146958n9) null, 4), editAvatarProfilePictureRepository.A09, 3);
                return;
            case 1:
                C29131wm r4 = (C29131wm) this.A00;
                if (C63803iN.A05(AnonymousClass0TJ.A05, r4.A03, 36319446045889708L).booleanValue() && (view = r4.mView) != null) {
                    view.post(new AnonymousClass4Q0(this));
                    return;
                }
                return;
            default:
                return;
        }
    }

    public final void Bm0() {
        if (2 - this.A01 == 0) {
            C18180wK.A12((Fragment) this.A00);
        }
    }

    public final /* synthetic */ void Bm1() {
    }

    public final void Bm2() {
        switch (this.A01) {
            case 0:
                EditAvatarProfilePictureRepository editAvatarProfilePictureRepository = ((AnonymousClass3GB) this.A00).A04;
                editAvatarProfilePictureRepository.A0C.CrC(AnonymousClass5z3.A00);
                C25237DiI.A00((Integer) null, (C27952Ew2) null, new KtSLambdaShape4S0101000_I2_1(editAvatarProfilePictureRepository, (C146958n9) null, 4), editAvatarProfilePictureRepository.A09, 3);
                return;
            case 1:
                throw C18210wN.A0W("userSession");
            default:
                C62793ak A0N = C18200wM.A0N(((AnonymousClass1wX) this.A00).A06);
                C25237DiI.A00((Integer) null, (C27952Ew2) null, new KtSLambdaShape22S0201000_I2_8((C146958n9) null, (Object) A0N, 16), AnonymousClass3J5.A00(A0N), 3);
                return;
        }
    }
}
