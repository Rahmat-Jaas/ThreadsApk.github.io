package com.instagram.debug.devoptions.section.channels;

import X.AnonymousClass0wJ;
import X.AnonymousClass2SO;
import X.C04220Ms;
import X.C14030oh;
import X.C18180wK;
import X.C18200wM;
import X.C18220wO;
import android.content.SharedPreferences;
import android.view.View;
import com.instagram.service.session.UserSession;
import java.util.Iterator;
import java.util.Map;

public final class ChannelOptions$getItems$3 implements View.OnClickListener {
    public final /* synthetic */ UserSession $userSession;

    public ChannelOptions$getItems$3(UserSession userSession) {
        this.$userSession = userSession;
    }

    public final void onClick(View view) {
        int A05 = C14030oh.A05(1719698073);
        SharedPreferences sharedPreferences = AnonymousClass2SO.A00(this.$userSession).A00;
        Map<String, ?> all = sharedPreferences.getAll();
        SharedPreferences.Editor edit = sharedPreferences.edit();
        Iterator A0z = AnonymousClass0wJ.A0z(all);
        while (A0z.hasNext()) {
            String A0p = C18200wM.A0p(C18180wK.A0o(A0z));
            C04220Ms.A04(A0p);
            if (C18220wO.A1V("direct_share_message_nux_first_timestamp", 1, A0p) || C18220wO.A1V("direct_share_message_nux_count", 1, A0p)) {
                edit.remove(A0p);
            }
        }
        edit.apply();
        C14030oh.A0C(354076712, A05);
    }
}
