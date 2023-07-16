package X;

import android.os.Bundle;
import android.view.View;
import java.util.Collection;

/* renamed from: X.1do  reason: invalid class name and case insensitive filesystem */
public final class C23421do extends AnonymousClass9NU {
    public static final String __redex_internal_original_name = "FanClubMemberListSortingOptionsFragment";
    public final C04530Oa A00 = C62373Zc.A01(this, 48);

    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C04220Ms.A0B(view, 0);
        super.onViewCreated(view, bundle);
        A00(this, AnonymousClass006.A00);
    }

    public static final void A00(C23421do r6, Integer num) {
        C304721l r5 = C304721l.LOADED;
        Integer num2 = AnonymousClass006.A00;
        boolean z = true;
        AnonymousClass48L r3 = new AnonymousClass48L(num2, C18180wK.A1Z(num, num2));
        Integer num3 = AnonymousClass006.A01;
        AnonymousClass48L r2 = new AnonymousClass48L(num3, C18180wK.A1Z(num, num3));
        Integer num4 = AnonymousClass006.A0C;
        if (num != num4) {
            z = false;
        }
        r6.updateUi(r5, C06750aI.A17(r3, r2, new AnonymousClass48L(num4, z)));
    }

    public final Collection getDefinitions() {
        return C18180wK.A0n(new C24761ka(this));
    }

    public final AnonymousClass7Dm getRecyclerConfigBuilder() {
        return configBuilder(C139868Pp.A00);
    }

    public final /* bridge */ /* synthetic */ C10300i6 getSession() {
        return AnonymousClass0wJ.A0U(this.A00);
    }
}
