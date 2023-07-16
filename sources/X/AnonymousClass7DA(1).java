package X;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.view.ViewParent;
import androidx.compose.ui.platform.AndroidComposeView;
import com.facebook.redex.IDxSProviderShape515S0100000_2_I2;
import com.instagram.barcelona.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.internal.KtLambdaShape18S0301000_I2;
import kotlin.jvm.internal.KtLambdaShape2S1110000_I2;

/* renamed from: X.7DA  reason: invalid class name */
public final class AnonymousClass7DA {
    public static final AnonymousClass534 A00;
    public static final AnonymousClass534 A01 = AnonymousClass533.A00(AnonymousClass8Ff.A00);
    public static final AnonymousClass534 A02 = AnonymousClass533.A00(AnonymousClass8Fg.A00);
    public static final AnonymousClass534 A03 = AnonymousClass533.A00(AnonymousClass8Fh.A00);
    public static final AnonymousClass534 A04 = AnonymousClass533.A00(AnonymousClass8Fi.A00);
    public static final AnonymousClass534 A05 = AnonymousClass533.A00(AnonymousClass8Fj.A00);

    public static final void A00(C147188nY r20, AndroidComposeView androidComposeView, AnonymousClass0YP r22, int i) {
        String str;
        LinkedHashMap linkedHashMap;
        boolean z;
        AndroidComposeView androidComposeView2 = androidComposeView;
        AnonymousClass0YP r18 = r22;
        boolean A1Z = AnonymousClass0wJ.A1Z(androidComposeView2, r18);
        C147188nY r2 = r20;
        r2.Cvd(1396852028);
        Context context = androidComposeView2.getContext();
        AnonymousClass7W3 A0Z = C147188nY.A0Z(r2, -492369756);
        Object A13 = A0Z.A13();
        Object obj = AnonymousClass7GN.A00;
        if (A13 == obj) {
            A13 = C86104wH.A0I(AnonymousClass7WP.A00, C86114wI.A0B(context), "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.neverEqualPolicy>");
            A0Z.A14(A13);
        }
        AnonymousClass7W3.A0w(A0Z, false);
        C81784oM r10 = (C81784oM) A13;
        boolean A0y = C147188nY.A0y(r2, r10);
        Object A132 = A0Z.A13();
        if (A0y || A132 == obj) {
            A132 = C86154wM.A10(r10, 43);
            A0Z.A14(A132);
        }
        androidComposeView2.setConfigurationChangeObserver(AnonymousClass7W3.A0B(A0Z, A132, false));
        Object A0r = C147188nY.A0r(r2, A0Z, -492369756);
        if (A0r == obj) {
            C04220Ms.A06(context);
            A0r = new AnonymousClass7YY(context);
            A0Z.A14(A0r);
        }
        AnonymousClass7W3.A0w(A0Z, false);
        C106836fh viewTreeOwners = androidComposeView2.getViewTreeOwners();
        if (viewTreeOwners != null) {
            Object A0r2 = C147188nY.A0r(r2, A0Z, -492369756);
            if (A0r2 == obj) {
                C15750rp r6 = viewTreeOwners.A01;
                ViewParent parent = androidComposeView2.getParent();
                C04220Ms.A0C(parent, C28174Ezk.A00(3));
                View view = (View) parent;
                Object tag = view.getTag(R.id.compose_view_saveable_id_tag);
                if (!(tag instanceof String) || (str = (String) tag) == null) {
                    str = String.valueOf(view.getId());
                }
                C04220Ms.A0B(str, 0);
                String A0N = AnonymousClass00U.A0N("SaveableStateRegistry", str, ':');
                AnonymousClass070 savedStateRegistry = r6.getSavedStateRegistry();
                Bundle A002 = savedStateRegistry.A00(A0N);
                if (A002 != null) {
                    linkedHashMap = C18220wO.A0y();
                    Iterator A0t = C86134wK.A0t(A002.keySet());
                    while (A0t.hasNext()) {
                        String A0k = C18180wK.A0k(A0t);
                        ArrayList parcelableArrayList = A002.getParcelableArrayList(A0k);
                        C04220Ms.A0C(parcelableArrayList, "null cannot be cast to non-null type java.util.ArrayList<kotlin.Any?>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.Any?> }");
                        C04220Ms.A04(A0k);
                        linkedHashMap.put(A0k, parcelableArrayList);
                    }
                } else {
                    linkedHashMap = null;
                }
                C65853w5 r14 = new C65853w5(linkedHashMap, AnonymousClass8M3.A00);
                try {
                    savedStateRegistry.A03(new IDxSProviderShape515S0100000_2_I2(r14, 0), A0N);
                    z = true;
                } catch (IllegalArgumentException unused) {
                    z = false;
                }
                A0r2 = new C123247Wa(r14, new KtLambdaShape2S1110000_I2(savedStateRegistry, A0N, 0, z));
                A0Z.A14(A0r2);
            }
            AnonymousClass7W3.A0w(A0Z, false);
            AnonymousClass7K5.A04(r2, Unit.A00, C86154wM.A10(A0r2, 44));
            C04220Ms.A06(context);
            Configuration configuration = (Configuration) r10.getValue();
            r2.Cvb(-485908294);
            Object A0r3 = C147188nY.A0r(r2, A0Z, -492369756);
            if (A0r3 == obj) {
                A0r3 = new C104196bO();
                A0Z.A14(A0r3);
            }
            AnonymousClass7W3.A0w(A0Z, false);
            C104196bO r5 = (C104196bO) A0r3;
            Object A0r4 = C147188nY.A0r(r2, A0Z, -492369756);
            Configuration configuration2 = A0r4;
            if (A0r4 == obj) {
                Configuration configuration3 = new Configuration();
                if (configuration != null) {
                    configuration3.setTo(configuration);
                }
                A0Z.A14(configuration3);
                configuration2 = configuration3;
            }
            AnonymousClass7W3.A0w(A0Z, false);
            Configuration configuration4 = (Configuration) configuration2;
            Object A0r5 = C147188nY.A0r(r2, A0Z, -492369756);
            if (A0r5 == obj) {
                A0r5 = new AnonymousClass7LP(configuration4, r5);
                A0Z.A14(A0r5);
            }
            AnonymousClass7W3.A0w(A0Z, false);
            AnonymousClass7K5.A04(r2, r5, C86164wN.A11(context, A0r5, 13));
            AnonymousClass7W3.A0w(A0Z, false);
            AnonymousClass534 r1 = A00;
            Object value = r10.getValue();
            C04220Ms.A06(value);
            AnonymousClass7DS[] r12 = {AnonymousClass7DS.A00(r1, value, A1Z), AnonymousClass7DS.A00(A01, context, A1Z), AnonymousClass7DS.A00(A03, viewTreeOwners.A00, A1Z), AnonymousClass7DS.A00(A04, viewTreeOwners.A01, A1Z), AnonymousClass7DS.A00(C102686Wd.A00, A0r2, A1Z), AnonymousClass7DS.A00(A05, androidComposeView2, A1Z), AnonymousClass7DS.A00(A02, r5, A1Z)};
            int i2 = i;
            AnonymousClass0YP r8 = r18;
            AndroidComposeView androidComposeView3 = androidComposeView2;
            AnonymousClass7JR.A05(r2, new KtLambdaShape18S0301000_I2(i2, 9, r8, androidComposeView3, A0r), r12, 1471621628);
            C147178nW AKE = r2.AKE();
            if (AKE != null) {
                C147178nW.A04(AKE, androidComposeView3, r8, i2, 24);
                return;
            }
            return;
        }
        throw C18180wK.A0a("Called when the ViewTreeOwnersAvailability is not yet in Available state");
    }

    static {
        AnonymousClass7WP r2 = AnonymousClass7WP.A00;
        C04220Ms.A0C(r2, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.neverEqualPolicy>");
        A00 = new AnonymousClass532(r2, AnonymousClass8Fe.A00);
    }

    public static final void A01(String str) {
        throw C18180wK.A0a(AnonymousClass00U.A0V("CompositionLocal ", str, " not present"));
    }
}
