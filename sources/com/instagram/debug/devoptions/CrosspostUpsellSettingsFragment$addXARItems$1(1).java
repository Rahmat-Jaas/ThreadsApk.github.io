package com.instagram.debug.devoptions;

import X.AnonymousClass0OU;
import X.AnonymousClass0YP;
import X.AnonymousClass0wJ;
import X.AnonymousClass2QB;
import X.C14030oh;
import X.C146958n9;
import X.C25237DiI;
import X.C27952Ew2;
import X.C39142Kno;
import X.C63813iO;
import X.C73874Uq;
import X.C83224qz;
import X.D0E;
import android.view.View;
import com.instagram.incentiveplatform.api.IncentivePlatformApi;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

public final class CrosspostUpsellSettingsFragment$addXARItems$1 implements View.OnClickListener {
    public final /* synthetic */ CrosspostUpsellSettingsFragment this$0;

    @DebugMetadata(c = "com.instagram.debug.devoptions.CrosspostUpsellSettingsFragment$addXARItems$1$1", f = "CrosspostUpsellSettingsFragment.kt", i = {}, l = {252}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.instagram.debug.devoptions.CrosspostUpsellSettingsFragment$addXARItems$1$1  reason: invalid class name */
    public final class AnonymousClass1 extends C39142Kno implements AnonymousClass0YP {
        public int label;

        public final C146958n9 create(Object obj, C146958n9 r4) {
            return new AnonymousClass1(r4);
        }

        public final Object invoke(C83224qz r3, C146958n9 r4) {
            return new AnonymousClass1(r4).invokeSuspend(Unit.A00);
        }

        public final Object invokeSuspend(Object obj) {
            D0E d0e = D0E.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                AnonymousClass0OU.A00(obj);
                IncentivePlatformApi A00 = AnonymousClass2QB.A00(AnonymousClass0wJ.A0X(CrosspostUpsellSettingsFragment.this.userSession$delegate));
                this.label = 1;
                if (A00.A03(this, true, false) == d0e) {
                    return d0e;
                }
            } else if (i == 1) {
                AnonymousClass0OU.A00(obj);
            } else {
                throw AnonymousClass0wJ.A0a();
            }
            return Unit.A00;
        }
    }

    public CrosspostUpsellSettingsFragment$addXARItems$1(CrosspostUpsellSettingsFragment crosspostUpsellSettingsFragment) {
        this.this$0 = crosspostUpsellSettingsFragment;
    }

    public final void onClick(View view) {
        int A05 = C14030oh.A05(-576382356);
        C73874Uq r2 = C73874Uq.A00;
        final CrosspostUpsellSettingsFragment crosspostUpsellSettingsFragment = this.this$0;
        C25237DiI.A00((Integer) null, (C27952Ew2) null, new AnonymousClass1((C146958n9) null), r2, 3);
        C63813iO.A03(this.this$0.getContext(), (String) null, 2131825405, 1);
        C14030oh.A0C(2132396889, A05);
    }
}
