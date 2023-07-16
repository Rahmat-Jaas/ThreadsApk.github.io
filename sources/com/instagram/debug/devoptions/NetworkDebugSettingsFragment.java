package com.instagram.debug.devoptions;

import X.AnonymousClass0YY;
import X.AnonymousClass0wJ;
import X.AnonymousClass1fC;
import X.AnonymousClass4MA;
import X.AnonymousClass4u2;
import X.C04220Ms;
import X.C09120et;
import X.C10300i6;
import X.C14030oh;
import X.C18180wK;
import X.C18190wL;
import X.C18200wM;
import X.C18220wO;
import X.C18240wQ;
import X.C18250wR;
import X.C18720xk;
import X.C23411dm;
import X.C27900EvB;
import X.C63273h9;
import X.C63613hu;
import X.C82034oy;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.View;
import com.instagram.barcelona.R;
import com.instagram.debug.network.DebugNetworkShapingServerOverrideHelper;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class NetworkDebugSettingsFragment extends C23411dm implements C82034oy {
    public static final Companion Companion = new Companion();
    public C10300i6 session;

    private final AnonymousClass4MA createMultiChoiceMenuItem(CharSequence charSequence, String[] strArr, Object[] objArr, int i, Object obj, AnonymousClass0YY r18) {
        Object obj2;
        String[] strArr2 = strArr;
        Object[] objArr2 = objArr;
        AnonymousClass0wJ.A1N(objArr, strArr);
        int min = Math.min(objArr.length, strArr.length);
        ArrayList A0k = C18240wQ.A0k(min);
        for (int i2 = 0; i2 < min; i2++) {
            A0k.add(C18180wK.A0p(objArr[i2], strArr[i2]));
        }
        Iterator it = A0k.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it.next();
            if (C04220Ms.A0I(((Pair) obj2).A00, obj)) {
                break;
            }
        }
        Pair pair = (Pair) obj2;
        int i3 = i;
        AnonymousClass0YY r7 = r18;
        if (pair == null) {
            pair = C18180wK.A0p(objArr[i], strArr[i]);
            r7.invoke(pair.A00);
        }
        Object obj3 = pair.A00;
        AnonymousClass4MA A01 = AnonymousClass4MA.A01((View.OnClickListener) null, Companion.createMultiChoiceLabel(charSequence, (String) pair.A01, C18180wK.A1Z(obj3, objArr[i])));
        C27900EvB APJ = getScrollingViewProxy().APJ();
        C04220Ms.A0C(APJ, "null cannot be cast to non-null type com.instagram.ui.menu.SimplePreferenceAdapter");
        A01.A03 = new NetworkDebugSettingsFragment$createMultiChoiceMenuItem$onClickListener$1(this, strArr2, i3, r7, objArr2, A01, charSequence, (AnonymousClass1fC) APJ);
        return A01;
    }

    public void configureActionBar(AnonymousClass4u2 r2) {
        C04220Ms.A0B(r2, 0);
        AnonymousClass4u2.A08(r2, "Network Debug Settings");
    }

    public String getModuleName() {
        return "network_debug_settings";
    }

    public void onViewCreated(View view, Bundle bundle) {
        View view2 = view;
        C04220Ms.A0B(view2, 0);
        super.onViewCreated(view2, bundle);
        C09120et A0X = C18190wL.A0X();
        ArrayList A0v = AnonymousClass0wJ.A0v();
        if (DebugNetworkShapingServerOverrideHelper.getSleepPerChunkOverride(getSession()) > 0) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append("Settings are being overridden by server.\nSee fburl.com/IGBuildEmpathy for details.");
            spannableStringBuilder.setSpan(new C18720xk(requireContext().getColor(R.color.igds_error_or_destructive)), 0, 82, 18);
            C23411dm.A01(spannableStringBuilder, A0v);
        }
        C63273h9.A02(A0v);
        C63613hu.A01("Network Shaping", A0v);
        A0v.add(createMultiChoiceMenuItem("Delay Per Data Chunk (ms)", new String[]{"0 (no delay)", "100", "200", "300", "500", "1,000 (very slow)"}, new Integer[]{0, 100, 200, 300, 500, 1000}, 0, Integer.valueOf(AnonymousClass0wJ.A04(C18220wO.A0f(A0X.A0b))), new NetworkDebugSettingsFragment$onViewCreated$1(A0X, this)));
        setItems(A0v);
    }

    public void setSession(C10300i6 r2) {
        C04220Ms.A0B(r2, 0);
        this.session = r2;
    }

    public final class Companion {
        /* access modifiers changed from: private */
        public final CharSequence createMultiChoiceLabel(CharSequence charSequence, String str, boolean z) {
            String str2;
            StringBuilder A0r = C18200wM.A0r();
            A0r.append(charSequence);
            A0r.append(":\n\t");
            A0r.append(str);
            if (z) {
                str2 = " (default)";
            } else {
                str2 = " (overridden)";
            }
            return C18180wK.A0i(str2, A0r);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public Companion() {
        }
    }

    public C10300i6 getSession() {
        C10300i6 r0 = this.session;
        if (r0 != null) {
            return r0;
        }
        C18250wR.A0l();
        throw null;
    }

    public void onCreate(Bundle bundle) {
        int A02 = C14030oh.A02(812831238);
        super.onCreate(bundle);
        setSession(C18200wM.A0V(this));
        C14030oh.A09(492874252, A02);
    }
}
