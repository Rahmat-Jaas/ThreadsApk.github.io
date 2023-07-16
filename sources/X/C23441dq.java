package X;

import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.LifecycleCoroutineScopeImpl;
import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.instagram.barcelona.R;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.KtSLambdaShape5S0401000_I2_1;
import kotlin.jvm.internal.KtLambdaShape69S0100000_I2_49;

/* renamed from: X.1dq  reason: invalid class name and case insensitive filesystem */
public final class C23441dq extends AnonymousClass9NU implements C82034oy {
    public static final String __redex_internal_original_name = "SubscribedAndRecommendedCreatorListFragment";
    public AnonymousClass495 A00;
    public final C04530Oa A01 = C62373Zc.A01(this, 5);
    public final C04530Oa A02 = C80644m9.A00(this);
    public final C04530Oa A03;
    public final AnonymousClass42D A04;

    public final void configureActionBar(AnonymousClass4u2 r2) {
        C04220Ms.A0B(r2, 0);
        AnonymousClass4u2.A07(r2, 2131836322);
    }

    public final String getModuleName() {
        return "subscribed_creator_list_fragment";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C04220Ms.A0B(view, 0);
        super.onViewCreated(view, bundle);
        AnonymousClass061 r3 = AnonymousClass061.STARTED;
        AnonymousClass066 viewLifecycleOwner = getViewLifecycleOwner();
        LifecycleCoroutineScopeImpl A002 = AnonymousClass067.A00(viewLifecycleOwner);
        C25237DiI.A00((Integer) null, (C27952Ew2) null, new KtSLambdaShape5S0401000_I2_1(r3, this, view, viewLifecycleOwner, (C146958n9) null, 20), A002, 3);
        C18190wL.A1E(getRecyclerView(), this, 1);
    }

    public static final void A00(C23441dq r5, User user, Integer num) {
        String str;
        String id = user.getId();
        C04220Ms.A0B(id, 0);
        ArrayList<AnonymousClass198> A0v = AnonymousClass0wJ.A0v();
        for (Object next : (Iterable) ((C195610i) r5.A03.getValue()).A07.getValue()) {
            if (next instanceof AnonymousClass198) {
                A0v.add(next);
            }
        }
        int i = 0;
        for (AnonymousClass198 r0 : A0v) {
            if (!C04220Ms.A0I(r0.A06.getId(), id)) {
                i++;
            } else if (i >= 0) {
                AnonymousClass495 r3 = r5.A00;
                if (r3 == null) {
                    C18240wQ.A0p();
                    throw null;
                }
                String A0q = C18200wM.A0q(r5.A01);
                C04220Ms.A06(A0q);
                String id2 = user.getId();
                long j = (long) i;
                C04220Ms.A0B(id2, 3);
                USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(r3.A00, "fan_club_subscription_list_action"), 611);
                C18230wP.A1H(A0I, "subscriber_list");
                if (C18240wQ.A05(A0I, num, "origin", A0q) != 0) {
                    str = "tap_subscribe";
                } else {
                    str = "tap_username";
                }
                C18210wN.A1A(A0I, str);
                C18250wR.A0x(A0I, AnonymousClass0wJ.A0d(id2));
                A0I.A0S("position", Long.valueOf(j));
                A0I.Bb4();
                return;
            } else {
                return;
            }
        }
    }

    public final Collection getDefinitions() {
        return C06750aI.A17(new AnonymousClass1l1(this, this.A04, this, AnonymousClass0wJ.A0X(this.A02)), new AnonymousClass1kK(), new AnonymousClass1kJ(), new C34935Ii2((C0Q) (C195610i) this.A03.getValue(), (int) R.layout.fan_club_empty_view));
    }

    public final AnonymousClass7Dm getRecyclerConfigBuilder() {
        return configBuilder(C139828Pl.A00);
    }

    public final /* bridge */ /* synthetic */ C10300i6 getSession() {
        return AnonymousClass0wJ.A0U(this.A02);
    }

    public C23441dq() {
        KtLambdaShape69S0100000_I2_49 A0f = C18250wR.A0f(this, 9);
        C04530Oa A012 = AnonymousClass0OY.A01(AnonymousClass006.A0C, C18250wR.A0f(C18250wR.A0f(this, 6), 7));
        this.A03 = C18220wO.A0M(C18250wR.A0f(A012, 8), A0f, C18250wR.A0d(A012, (Object) null, 39), C18210wN.A0l(C195610i.class));
        this.A04 = new AnonymousClass42D(this);
    }

    public final void onCreate(Bundle bundle) {
        int A022 = C14030oh.A02(1159835317);
        super.onCreate(bundle);
        this.A00 = AnonymousClass2O7.A00(AnonymousClass0wJ.A0X(this.A02));
        C14030oh.A09(163626943, A022);
    }

    public final void onResume() {
        int A022 = C14030oh.A02(-2104821865);
        super.onResume();
        C04530Oa r5 = this.A03;
        ((C195610i) r5.getValue()).Bas();
        C195610i r1 = (C195610i) r5.getValue();
        if (!r1.A00) {
            r1.A00 = true;
            C25237DiI.A00((Integer) null, (C27952Ew2) null, C18240wQ.A0n(r1, (C146958n9) null, 21), AnonymousClass3J5.A00(r1), 3);
        }
        ((C195610i) r5.getValue()).A02.A08.D7t(Unit.A00);
        C14030oh.A09(217731030, A022);
    }
}
