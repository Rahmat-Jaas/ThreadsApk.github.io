package X;

import android.content.Context;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.facebook.graphql.calls.GQLCallInputCInputShape1S0000000;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.instagram.service.session.UserSession;

/* renamed from: X.3yy  reason: invalid class name and case insensitive filesystem */
public final class C67163yy implements CallerContextable {
    public static final CallerContext A00 = CallerContext.A00(C67163yy.class);
    public static final String __redex_internal_original_name = "FacebookUnpublishedPageFetcher";

    public static final void A00(Context context, AnonymousClass06E r8, C63873iU r9, UserSession userSession) {
        C04220Ms.A0B(userSession, 1);
        CallerContext callerContext = A00;
        if (C61853Wb.A00(callerContext, userSession, "ig_unpublished_fb_page_fetcher") != null) {
            C67463zb A002 = C67463zb.A00();
            GQLCallInputCInputShape1S0000000 gQLCallInputCInputShape1S0000000 = new GQLCallInputCInputShape1S0000000();
            GraphQlCallInput.A05(gQLCallInputCInputShape1S0000000, "PUBLISHED", "publish_mode");
            GraphQlCallInput.A05(gQLCallInputCInputShape1S0000000, C18180wK.A0e(), "client_mutation_id");
            String A17 = AnonymousClass0wJ.A0Y(userSession).A17();
            if (A17 != null) {
                GraphQlCallInput.A05(gQLCallInputCInputShape1S0000000, A17, "page_id");
            }
            String A02 = C35692Ol.A00(userSession).A02(callerContext, "ig_unpublished_fb_page_fetcher_account_id");
            if (A02 != null) {
                GraphQlCallInput.A05(gQLCallInputCInputShape1S0000000, A02, "actor_id");
            }
            C67463zb.A01(gQLCallInputCInputShape1S0000000, A002);
            AnonymousClass7Ko.A0B(true);
            C32165H8c A0X = C18220wO.A0X(C67473zc.A00(A002, C204914w.class, "PageSetVisibility"), C61853Wb.A00(callerContext, userSession, "ig_unpublished_fb_page_fetcher"));
            A0X.A00 = r9;
            C31155GhB.A01(context, r8, A0X);
        }
    }
}
