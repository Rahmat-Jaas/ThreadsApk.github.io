package com.facebook.redex;

import X.AnonymousClass0wJ;
import X.AnonymousClass3WS;
import X.C08410dK;
import X.C18180wK;
import X.C18200wM;
import X.C18240wQ;
import X.C28161tl;
import X.C39786Kzv;
import android.content.SharedPreferences;
import com.instagram.service.session.UserSession;

public class IDxPOperatorShape121S0000000_1_I2 implements C39786Kzv {
    public final int A00;

    public IDxPOperatorShape121S0000000_1_I2(int i) {
        this.A00 = i;
    }

    public final void ADH(UserSession userSession) {
        String str;
        int i = this.A00;
        SharedPreferences.Editor A03 = C28161tl.A03(userSession);
        switch (i) {
            case 0:
                str = "recent_effect_searches";
                break;
            case 1:
                str = "recent_hashtag_searches_with_ts";
                break;
            case 2:
                str = "recent_keyword_searches_with_ts";
                break;
            case 3:
                str = "recent_map_hashtag_searches_with_ts";
                break;
            case 4:
                str = "recent_map_query_searches_with_ts";
                break;
            case 5:
                str = "recent_map_location_searches_with_ts";
                break;
            case 6:
                str = "recent_place_searces";
                break;
            case 7:
                str = "recent_shopping_product_keywords_with_ts";
                break;
            case 8:
                str = "recent_shopping_seller_accounts_with_ts";
                break;
            case 9:
                str = "recent_tagged_users";
                break;
            default:
                str = "recent_user_searches_with_ts";
                break;
        }
        C18180wK.A0u(A03, str);
    }

    public final String Ajy(UserSession userSession) {
        C08410dK r0;
        switch (this.A00) {
            case 0:
                r0 = AnonymousClass3WS.A00(userSession).A0B;
                break;
            case 1:
                r0 = AnonymousClass3WS.A00(userSession).A0C;
                break;
            case 2:
                r0 = AnonymousClass3WS.A00(userSession).A0D;
                break;
            case 3:
                r0 = AnonymousClass3WS.A00(userSession).A0E;
                break;
            case 4:
                r0 = AnonymousClass3WS.A00(userSession).A0G;
                break;
            case 5:
                r0 = AnonymousClass3WS.A00(userSession).A0F;
                break;
            case 6:
                r0 = AnonymousClass3WS.A00(userSession).A0H;
                break;
            case 7:
                r0 = AnonymousClass3WS.A00(userSession).A0I;
                break;
            case 8:
                r0 = AnonymousClass3WS.A00(userSession).A0J;
                break;
            case 9:
                r0 = AnonymousClass3WS.A00(userSession).A0M;
                break;
            default:
                r0 = AnonymousClass3WS.A00(userSession).A0L;
                break;
        }
        return C18200wM.A0j(r0);
    }

    public final void Cg1(UserSession userSession, String str) {
        C08410dK r0;
        int i = this.A00;
        AnonymousClass0wJ.A1N(userSession, str);
        switch (i) {
            case 0:
                r0 = AnonymousClass3WS.A01(userSession).A0B;
                break;
            case 1:
                r0 = AnonymousClass3WS.A01(userSession).A0C;
                break;
            case 2:
                r0 = AnonymousClass3WS.A01(userSession).A0D;
                break;
            case 3:
                r0 = AnonymousClass3WS.A01(userSession).A0E;
                break;
            case 4:
                r0 = AnonymousClass3WS.A01(userSession).A0G;
                break;
            case 5:
                r0 = AnonymousClass3WS.A01(userSession).A0F;
                break;
            case 6:
                r0 = AnonymousClass3WS.A01(userSession).A0H;
                break;
            case 7:
                r0 = AnonymousClass3WS.A01(userSession).A0I;
                break;
            case 8:
                r0 = AnonymousClass3WS.A01(userSession).A0J;
                break;
            case 9:
                r0 = AnonymousClass3WS.A01(userSession).A0M;
                break;
            default:
                r0 = AnonymousClass3WS.A01(userSession).A0L;
                break;
        }
        C18240wQ.A1D(r0, str);
    }
}
