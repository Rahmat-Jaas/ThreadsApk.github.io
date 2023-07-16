package com.instagram.debug.devoptions.igds.compose;

import X.AnonymousClass006;
import X.AnonymousClass00J;
import X.AnonymousClass00U;
import X.AnonymousClass0YM;
import X.AnonymousClass0YY;
import X.AnonymousClass0ZU;
import X.AnonymousClass0wJ;
import X.AnonymousClass3W9;
import X.AnonymousClass4VZ;
import X.AnonymousClass4u2;
import X.AnonymousClass5MW;
import X.AnonymousClass5MX;
import X.AnonymousClass5MY;
import X.AnonymousClass6QR;
import X.AnonymousClass72M;
import X.AnonymousClass74X;
import X.AnonymousClass7GN;
import X.AnonymousClass7Hw;
import X.AnonymousClass7J3;
import X.AnonymousClass7KP;
import X.AnonymousClass7KV;
import X.AnonymousClass7W3;
import X.AnonymousClass7WO;
import X.AnonymousClass7WR;
import X.AnonymousClass7WY;
import X.AnonymousClass84Y;
import X.C04220Ms;
import X.C04530Oa;
import X.C06750aI;
import X.C123327Wm;
import X.C14030oh;
import X.C144678it;
import X.C146288ly;
import X.C147178nW;
import X.C147188nY;
import X.C147268p4;
import X.C147368pE;
import X.C34640IcN;
import X.C63813iO;
import X.C82034oy;
import X.C98236Es;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.ComposeView;
import com.instagram.barcelona.R;
import com.instagram.service.session.UserSession;
import java.util.List;
import java.util.Set;

public final class IgdsSegmentedPillsComposeExamplesFragment extends C34640IcN implements C82034oy {
    public static final int $stable = 8;
    public final List DEMO_PILLS = C06750aI.A17(new AnonymousClass5MW("Hello", 6), new AnonymousClass5MW("World", 6), new AnonymousClass5MW("5", 6), new AnonymousClass5MW("Disabled", 4), new AnonymousClass5MY((Integer) null, "Left Icon", R.drawable.instagram_chevron_down_outline_16, 28), new AnonymousClass5MX("Icon description", R.drawable.instagram_chevron_down_outline_16, 12), new AnonymousClass5MX("Disabled icon", R.drawable.instagram_chevron_down_outline_16, 8), new AnonymousClass5MY(AnonymousClass006.A01, "Right Icon", R.drawable.instagram_chevron_down_outline_16, 24));
    public final C04530Oa userSession$delegate = AnonymousClass3W9.A00(this);

    public void configureActionBar(AnonymousClass4u2 r2) {
        C04220Ms.A0B(r2, 0);
        AnonymousClass4u2.A07(r2, 2131825251);
    }

    public String getModuleName() {
        return "igds_segmented_pills_compose_examples";
    }

    private final UserSession getUserSession() {
        return AnonymousClass0wJ.A0X(this.userSession$delegate);
    }

    /* access modifiers changed from: private */
    public final void showToast(Context context, C144678it r4) {
        String str;
        if (r4 instanceof AnonymousClass5MW) {
            str = ((AnonymousClass5MW) r4).A00;
        } else if (r4 instanceof AnonymousClass5MX) {
            str = ((AnonymousClass5MX) r4).A01;
        } else if (r4 instanceof AnonymousClass5MY) {
            str = ((AnonymousClass5MY) r4).A02;
        } else {
            throw AnonymousClass4VZ.A00();
        }
        C63813iO.A0B(context, AnonymousClass00U.A0L("Clicked ", str));
    }

    /* access modifiers changed from: private */
    public final void ClickableSegmentedPillsDemo(C147188nY r9, int i) {
        r9.Cvd(-2071619877);
        AnonymousClass7Hw.A04(r9, (Modifier) null, this.DEMO_PILLS, new IgdsSegmentedPillsComposeExamplesFragment$ClickableSegmentedPillsDemo$1(this, C147188nY.A0T(r9)), (AnonymousClass0YY) null, 8, 12);
        C147178nW AKE = r9.AKE();
        if (AKE != null) {
            AnonymousClass7WO.A00(AKE, new IgdsSegmentedPillsComposeExamplesFragment$ClickableSegmentedPillsDemo$2(this, i));
        }
    }

    /* access modifiers changed from: private */
    public final void MultiselectSegmentedPillsDemo(C147188nY r12, int i) {
        C147188nY r3 = r12;
        r12.Cvd(-697579730);
        AnonymousClass7W3 r2 = (AnonymousClass7W3) r3;
        Object A13 = r2.A13();
        if (A13 == AnonymousClass7GN.A00) {
            A13 = AnonymousClass7WR.A00(r2, AnonymousClass84Y.A00);
        }
        C147368pE r1 = (C147368pE) A13;
        IgdsSegmentedPillsComposeExamplesFragment$MultiselectSegmentedPillsDemo$1 igdsSegmentedPillsComposeExamplesFragment$MultiselectSegmentedPillsDemo$1 = new IgdsSegmentedPillsComposeExamplesFragment$MultiselectSegmentedPillsDemo$1(this, r1);
        AnonymousClass7Hw.A02((LazyListState) null, r3, Modifier.A00, this.DEMO_PILLS, (Set) r1.getValue(), igdsSegmentedPillsComposeExamplesFragment$MultiselectSegmentedPillsDemo$1, (AnonymousClass0YY) null, 24648, 40);
        C147178nW AKE = r12.AKE();
        if (AKE != null) {
            AnonymousClass7WO.A00(AKE, new IgdsSegmentedPillsComposeExamplesFragment$MultiselectSegmentedPillsDemo$2(this, i));
        }
    }

    public static final Set MultiselectSegmentedPillsDemo$lambda$5(C147368pE r0) {
        return (Set) r0.getValue();
    }

    /* access modifiers changed from: private */
    public final void RegularSegmentedPillsDemo(C147188nY r8, int i) {
        r8.Cvd(-1910393963);
        AnonymousClass7Hw.A03(r8, (Modifier) null, this.DEMO_PILLS, (AnonymousClass0YY) null, 8, 6);
        C147178nW AKE = r8.AKE();
        if (AKE != null) {
            AnonymousClass7WO.A00(AKE, new IgdsSegmentedPillsComposeExamplesFragment$RegularSegmentedPillsDemo$1(this, i));
        }
    }

    /* access modifiers changed from: private */
    public final void SelectableSegmentedPillsDemo(C147188nY r12, int i) {
        C147188nY r3 = r12;
        r12.Cvd(286318699);
        AnonymousClass7W3 r2 = (AnonymousClass7W3) r3;
        Object A13 = r2.A13();
        if (A13 == AnonymousClass7GN.A00) {
            A13 = AnonymousClass7WR.A00(r2, (Object) null);
        }
        C147368pE r1 = (C147368pE) A13;
        AnonymousClass7Hw.A00((LazyListState) null, r3, (Modifier) null, (C144678it) r1.getValue(), this.DEMO_PILLS, new IgdsSegmentedPillsComposeExamplesFragment$SelectableSegmentedPillsDemo$1(this, r1), (AnonymousClass0YY) null, 8, 56);
        C147178nW AKE = r12.AKE();
        if (AKE != null) {
            AnonymousClass7WO.A00(AKE, new IgdsSegmentedPillsComposeExamplesFragment$SelectableSegmentedPillsDemo$2(this, i));
        }
    }

    public static final C144678it SelectableSegmentedPillsDemo$lambda$2(C147368pE r0) {
        return (C144678it) r0.getValue();
    }

    public static final /* synthetic */ Set access$MultiselectSegmentedPillsDemo$lambda$5(C147368pE r0) {
        return (Set) r0.getValue();
    }

    public static final /* synthetic */ C144678it access$SelectableSegmentedPillsDemo$lambda$2(C147368pE r0) {
        return (C144678it) r0.getValue();
    }

    public static final /* synthetic */ C144678it access$toggle(IgdsSegmentedPillsComposeExamplesFragment igdsSegmentedPillsComposeExamplesFragment, C144678it r1, C144678it r2) {
        if (C04220Ms.A0I(r1, r2)) {
            return null;
        }
        return r2;
    }

    /* access modifiers changed from: private */
    public final Set toggle(Set set, C144678it r4) {
        Set A0b = AnonymousClass00J.A0b(set);
        if (!A0b.remove(r4)) {
            A0b.add(r4);
        }
        return AnonymousClass00J.A0c(A0b);
    }

    public final void SegmentedPillsShowcase(C147188nY r10, int i) {
        r10.Cvd(-1704800833);
        C147268p4 A01 = AnonymousClass7J3.A01((float) 8);
        C123327Wm A00 = Modifier.A00(r10);
        C146288ly A002 = AnonymousClass72M.A00(A01, r10, AnonymousClass7KV.A02);
        Object A0p = C147188nY.A0p(r10);
        Object A0n = C147188nY.A0n(r10);
        Object A0m = C147188nY.A0m(r10);
        AnonymousClass0ZU r2 = AnonymousClass74X.A00;
        AnonymousClass0YM A003 = C98236Es.A00(A00);
        AnonymousClass7W3 r1 = (AnonymousClass7W3) r10;
        C147188nY.A0w(r10, r1, r2);
        AnonymousClass7W3.A0a(r10, r1, A002, A0p);
        AnonymousClass7KP.A07(r10, A0n, A0m, A003);
        r10.Cvb(-1637980919);
        ComposeShowcaseComponentsKt.ShowcaseSectionHeader("No Selection", r10, 6);
        RegularSegmentedPillsDemo(r10, 8);
        ComposeShowcaseComponentsKt.ShowcaseSectionHeader("Clickable Pills", r10, 6);
        ClickableSegmentedPillsDemo(r10, 8);
        ComposeShowcaseComponentsKt.ShowcaseSectionHeader("Single Selection", r10, 6);
        SelectableSegmentedPillsDemo(r10, 8);
        ComposeShowcaseComponentsKt.ShowcaseSectionHeader("Multiselect", r10, 6);
        MultiselectSegmentedPillsDemo(r10, 8);
        AnonymousClass7W3.A0f(r1);
        C147178nW AKE = r10.AKE();
        if (AKE != null) {
            AnonymousClass7WO.A00(AKE, new IgdsSegmentedPillsComposeExamplesFragment$SegmentedPillsShowcase$2(this, i));
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C14030oh.A02(-2142438803);
        ComposeView A00 = AnonymousClass6QR.A00(this, AnonymousClass7WY.A00(new IgdsSegmentedPillsComposeExamplesFragment$onCreateView$1(this), 2092823330));
        C14030oh.A09(-53994686, A02);
        return A00;
    }

    public static final void MultiselectSegmentedPillsDemo$lambda$6(C147368pE r0, Set set) {
        r0.CrC(set);
    }

    public static final void SelectableSegmentedPillsDemo$lambda$3(C147368pE r0, C144678it r1) {
        r0.CrC(r1);
    }

    private final C144678it toggle(C144678it r2, C144678it r3) {
        if (C04220Ms.A0I(r2, r3)) {
            return null;
        }
        return r3;
    }

    public UserSession getSession() {
        return AnonymousClass0wJ.A0X(this.userSession$delegate);
    }
}
