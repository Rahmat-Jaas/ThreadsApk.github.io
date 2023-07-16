package com.instagram.fanclub.inapp;

import X.AnonymousClass006;
import X.AnonymousClass0OU;
import X.AnonymousClass0YP;
import X.AnonymousClass68V;
import X.C146958n9;
import X.C18220wO;
import X.C18230wP;
import X.C18250wR;
import X.C22153CJj;
import X.C25238DiJ;
import X.C39142Kno;
import X.C62113Xe;
import X.C86054wC;
import X.D0E;
import androidx.fragment.app.FragmentActivity;
import com.instagram.user.model.User;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.KtLambdaShape69S0100000_I2_49;
import org.json.JSONArray;
import org.json.JSONObject;

@DebugMetadata(c = "com.instagram.fanclub.inapp.FanClubInAppPurchasesInteractor$purchaseItem$1", f = "FanClubInAppPurchasesInteractor.kt", i = {}, l = {76}, m = "invokeSuspend", n = {}, s = {})
public final class FanClubInAppPurchasesInteractor$purchaseItem$1 extends C39142Kno implements AnonymousClass0YP {
    public int A00;
    public /* synthetic */ Object A01;
    public final /* synthetic */ FragmentActivity A02;
    public final /* synthetic */ C62113Xe A03;
    public final /* synthetic */ User A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FanClubInAppPurchasesInteractor$purchaseItem$1(FragmentActivity fragmentActivity, C62113Xe r3, User user, String str, String str2, String str3, C146958n9 r8) {
        super(2, r8);
        this.A03 = r3;
        this.A04 = user;
        this.A02 = fragmentActivity;
        this.A07 = str;
        this.A05 = str2;
        this.A06 = str3;
    }

    public final C146958n9 create(Object obj, C146958n9 r10) {
        FanClubInAppPurchasesInteractor$purchaseItem$1 fanClubInAppPurchasesInteractor$purchaseItem$1 = new FanClubInAppPurchasesInteractor$purchaseItem$1(this.A02, this.A03, this.A04, this.A07, this.A05, this.A06, r10);
        fanClubInAppPurchasesInteractor$purchaseItem$1.A01 = obj;
        return fanClubInAppPurchasesInteractor$purchaseItem$1;
    }

    public final Object invokeSuspend(Object obj) {
        D0E d0e = D0E.COROUTINE_SUSPENDED;
        if (this.A00 != 0) {
            AnonymousClass0OU.A00(obj);
        } else {
            AnonymousClass0OU.A00(obj);
            C86054wC r3 = (C86054wC) this.A01;
            C62113Xe r2 = this.A03;
            User user = this.A04;
            r2.A03.A04(AnonymousClass006.A0u, (String) null, (String) null, "INSTAGRAM_FAN_SUBS", user.getId());
            FragmentActivity fragmentActivity = this.A02;
            String str = this.A07;
            AnonymousClass68V r10 = AnonymousClass68V.ITEM_TYPE_INAPP;
            JSONObject A0y = C18230wP.A0y();
            String str2 = this.A06;
            JSONArray A0i = C18250wR.A0i();
            A0i.put(Long.parseLong(str2));
            A0y.put("receiver_id", A0i);
            A0y.put("payee_id", user.getId());
            A0y.put("payer_id", r2.A02.getUserId());
            C62113Xe.A00(fragmentActivity, new C22153CJj(r10, str, A0y.toString(), this.A05, (String) null, (Map) null, 2024), r2, r3);
            KtLambdaShape69S0100000_I2_49 A0f = C18250wR.A0f(r2, 35);
            this.A00 = 1;
            if (C25238DiJ.A00(this, A0f, r3) == d0e) {
                return d0e;
            }
        }
        return Unit.A00;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((FanClubInAppPurchasesInteractor$purchaseItem$1) C18220wO.A10(obj2, obj, this)).invokeSuspend(Unit.A00);
    }
}
