package com.instagram.debug.devoptions;

import X.AnonymousClass0YY;
import X.C04220Ms;
import X.C14030oh;
import X.C18190wL;
import X.C34622Kg;
import android.content.Context;
import android.view.View;
import com.instagram.casper.IgSignalsCasper;
import com.instagram.service.session.UserSession;
import kotlin.Unit;

public final class PublicDeveloperOptions$addMainOptions$6 implements View.OnClickListener {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ UserSession $userSession;

    public PublicDeveloperOptions$addMainOptions$6(UserSession userSession, Context context) {
        this.$userSession = userSession;
        this.$context = context;
    }

    public final void onClick(final View view) {
        int A05 = C14030oh.A05(-1198534873);
        IgSignalsCasper A00 = C34622Kg.A00(this.$context, this.$userSession);
        final UserSession userSession = this.$userSession;
        final Context context = this.$context;
        A00.A07(new AnonymousClass0YY() {
            public final void invoke(long j) {
                PublicDeveloperOptions publicDeveloperOptions = PublicDeveloperOptions.INSTANCE;
                UserSession userSession = UserSession.this;
                Context context = context;
                View view = view;
                C04220Ms.A05(view);
                publicDeveloperOptions.showCasperResult(userSession, context, view, j);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke(C18190wL.A08(obj));
                return Unit.A00;
            }
        });
        C14030oh.A0C(-365619946, A05);
    }
}
