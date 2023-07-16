package X;

import android.os.Bundle;
import com.instagram.service.session.UserSession;

/* renamed from: X.1dQ  reason: invalid class name */
public abstract class AnonymousClass1dQ extends C34640IcN implements C21735BzM, C81414nk {
    public static final String __redex_internal_original_name = "CrosspostingUpsellBottomSheetFragment";
    public int A00;
    public AnonymousClass2AC A01;
    public UserSession A02;
    public C83844s5 A03;
    public boolean A04;

    public final boolean isScrolledToTop() {
        return false;
    }

    public final /* synthetic */ void onBottomSheetClosed() {
    }

    public final /* synthetic */ void onBottomSheetPositionChanged(int i, int i2) {
    }

    /* renamed from: A02 */
    public final UserSession getSession() {
        UserSession userSession = this.A02;
        if (userSession != null) {
            return userSession;
        }
        C18210wN.A0m();
        throw null;
    }

    public void onCreate(Bundle bundle) {
        String string;
        int i;
        boolean z;
        int A022 = C14030oh.A02(-365145206);
        super.onCreate(bundle);
        this.A02 = C18180wK.A0W(this, AnonymousClass0RA.A0C);
        Bundle bundle2 = this.mArguments;
        if (bundle2 == null || (string = bundle2.getString("args_entrypoint")) == null) {
            IllegalStateException A0b = AnonymousClass0wJ.A0b();
            C14030oh.A09(-173023513, A022);
            throw A0b;
        }
        AnonymousClass2AC valueOf = AnonymousClass2AC.valueOf(string);
        C04220Ms.A0B(valueOf, 0);
        this.A01 = valueOf;
        Bundle bundle3 = this.mArguments;
        if (bundle3 != null) {
            i = bundle3.getInt("args_num_of_views");
        } else {
            i = -1;
        }
        this.A00 = i;
        Bundle bundle4 = this.mArguments;
        if (bundle4 != null) {
            z = bundle4.getBoolean("args_is_after_fbc");
        } else {
            z = false;
        }
        this.A04 = z;
        C14030oh.A09(1830939840, A022);
    }
}
