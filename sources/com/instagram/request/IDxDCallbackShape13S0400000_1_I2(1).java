package com.instagram.request;

import X.AnonymousClass0wJ;
import X.AnonymousClass3XX;
import X.AnonymousClass3iG;
import X.AnonymousClass9UH;
import X.C10300i6;
import X.C11630kW;
import X.C12560m7;
import X.C14030oh;
import X.C18180wK;
import X.C18220wO;
import X.C21751Sa;
import X.C21771Sc;
import X.C63673i6;
import X.C63813iO;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.model.venue.Venue;
import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;
import java.util.HashMap;

public class IDxDCallbackShape13S0400000_1_I2 extends AnonymousClass9UH {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public final int A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IDxDCallbackShape13S0400000_1_I2(C12560m7 r1, Object obj, Object obj2, Object obj3, Object obj4, int i) {
        super(r1);
        this.A04 = i;
        this.A03 = obj4;
        this.A00 = obj2;
        this.A01 = obj3;
        this.A02 = obj;
    }

    public final void onFail(AnonymousClass3XX r13) {
        int A032;
        int i;
        if (this.A04 != 0) {
            A032 = C14030oh.A03(378499206);
            C63673i6.A09((C11630kW) this.A00, (C10300i6) this.A03, ((Venue) this.A01).getId(), "map_share_sheet", "system_share_sheet", r13.A01);
            C63813iO.A0E(C18220wO.A0A(this.A02), "share_location_failed");
            i = -2125110836;
        } else {
            A032 = C14030oh.A03(2023211796);
            UserSession userSession = (UserSession) this.A01;
            C11630kW r2 = (C11630kW) this.A00;
            AnonymousClass3iG.A09((Fragment) this.A02, r2, userSession, (User) this.A03, r13.A01);
            i = -1452154194;
        }
        C14030oh.A0A(i, A032);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A032;
        int i;
        if (this.A04 != 0) {
            A032 = C14030oh.A03(-455156519);
            C21751Sa r14 = (C21751Sa) obj;
            int A033 = C14030oh.A03(666802091);
            Bundle A06 = C18180wK.A06();
            A06.putString("android.intent.extra.TEXT", r14.A00);
            String str = r14.A00;
            FragmentActivity activity = ((Fragment) this.A02).getActivity();
            Venue venue = (Venue) this.A01;
            String id = venue.getId();
            C11630kW r7 = (C11630kW) this.A00;
            UserSession userSession = (UserSession) this.A03;
            HashMap A0y = AnonymousClass0wJ.A0y();
            A0y.put("url", str);
            A0y.put("media_id", id);
            AnonymousClass3iG.A03(activity, A06, r7, userSession, "share_to_system_sheet", A0y);
            C63673i6.A0A(r7, userSession, venue.getId(), "map_share_sheet", "system_share_sheet", str);
            C14030oh.A0A(-1899769672, A033);
            i = -1602142142;
        } else {
            A032 = C14030oh.A03(-354754076);
            C21771Sc r142 = (C21771Sc) obj;
            int A034 = C14030oh.A03(-26258341);
            Bundle A062 = C18180wK.A06();
            A062.putString("android.intent.extra.TEXT", r142.A00);
            String str2 = r142.A00;
            UserSession userSession2 = (UserSession) this.A01;
            AnonymousClass3iG.A08(A062, (Fragment) this.A02, (C11630kW) this.A00, userSession2, (User) this.A03, str2);
            C14030oh.A0A(-886472805, A034);
            i = -996092644;
        }
        C14030oh.A0A(i, A032);
    }
}
