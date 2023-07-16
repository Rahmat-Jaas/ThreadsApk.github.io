package com.instagram.debug.devoptions;

import X.AnonymousClass0OU;
import X.AnonymousClass0YP;
import X.AnonymousClass0gW;
import X.AnonymousClass0wJ;
import X.AnonymousClass1jA;
import X.AnonymousClass1jB;
import X.AnonymousClass3WK;
import X.AnonymousClass4VZ;
import X.AnonymousClass7Ja;
import X.C14030oh;
import X.C146958n9;
import X.C18250wR;
import X.C25237DiI;
import X.C27952Ew2;
import X.C39142Kno;
import X.C49382rI;
import X.C62903b6;
import X.C63233h2;
import X.C679041a;
import X.C83224qz;
import X.D0E;
import android.view.View;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;
import com.instagram.service.session.UserSession;
import com.instagram.share.facebook.graphql.CXPResetNoticeUserMutationResponseImpl;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

public final class CrosspostUpsellSettingsFragment$addServerCXPNoticeItems$1 implements View.OnClickListener {
    public final /* synthetic */ CrosspostUpsellSettingsFragment this$0;

    @DebugMetadata(c = "com.instagram.debug.devoptions.CrosspostUpsellSettingsFragment$addServerCXPNoticeItems$1$1", f = "CrosspostUpsellSettingsFragment.kt", i = {}, l = {82}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.instagram.debug.devoptions.CrosspostUpsellSettingsFragment$addServerCXPNoticeItems$1$1  reason: invalid class name */
    public final class AnonymousClass1 extends C39142Kno implements AnonymousClass0YP {
        public int label;

        public final C146958n9 create(Object obj, C146958n9 r4) {
            return new AnonymousClass1(r4);
        }

        public final Object invoke(C83224qz r3, C146958n9 r4) {
            return new AnonymousClass1(r4).invokeSuspend(Unit.A00);
        }

        public final Object invokeSuspend(Object obj) {
            Object obj2 = obj;
            D0E d0e = D0E.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                AnonymousClass0OU.A00(obj2);
                UserSession A0X = AnonymousClass0wJ.A0X(CrosspostUpsellSettingsFragment.this.userSession$delegate);
                this.label = 1;
                ((C679041a) C49382rI.A00(A0X).A01).A00.clear();
                obj2 = AnonymousClass3WK.A01(A0X).A06(new PandoGraphQLRequest(C63233h2.A01(), "CXPResetNoticeUserMutation", GraphQlCallInput.A00().A07(), GraphQlCallInput.A00().A07(), CXPResetNoticeUserMutationResponseImpl.class, true, (PandoRealtimeInfoJNI) null, 0, (String) null, "xcxp_reset_notice_user").setFreshCacheAgeMs(0).setMaxToleratedCacheAgeMs(0), this);
                if (obj2 == d0e) {
                    return d0e;
                }
            } else if (i == 1) {
                AnonymousClass0OU.A00(obj2);
            } else {
                throw AnonymousClass0wJ.A0a();
            }
            if (obj2 instanceof AnonymousClass1jA) {
                obj2 = C62903b6.A03();
            } else if (!(obj2 instanceof AnonymousClass1jB)) {
                throw AnonymousClass4VZ.A00();
            }
            if ((obj2 instanceof AnonymousClass1jA) || (obj2 instanceof AnonymousClass1jB)) {
                return Unit.A00;
            }
            throw AnonymousClass4VZ.A00();
        }
    }

    public CrosspostUpsellSettingsFragment$addServerCXPNoticeItems$1(CrosspostUpsellSettingsFragment crosspostUpsellSettingsFragment) {
        this.this$0 = crosspostUpsellSettingsFragment;
    }

    public final void onClick(View view) {
        int A05 = C14030oh.A05(-1425968687);
        C83224qz A03 = AnonymousClass7Ja.A03(C18250wR.A0J((AnonymousClass0gW) null, 3).BQy(375068099, 3));
        final CrosspostUpsellSettingsFragment crosspostUpsellSettingsFragment = this.this$0;
        C25237DiI.A00((Integer) null, (C27952Ew2) null, new AnonymousClass1((C146958n9) null), A03, 3);
        C14030oh.A0C(820052897, A05);
    }
}
