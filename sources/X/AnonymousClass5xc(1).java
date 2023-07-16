package X;

import android.os.Bundle;
import android.view.View;
import com.facebook.redex.IDxLDelegateShape339S0100000_2_I2;
import com.instagram.appreciation.analytics.creator.CreatorLoggingData;
import com.instagram.barcelona.R;
import java.util.Collection;
import kotlin.coroutines.jvm.internal.KtSLambdaShape8S0301000_I2;
import kotlin.jvm.internal.KtLambdaShape27S0100000_I2_7;

/* renamed from: X.5xc  reason: invalid class name */
public final class AnonymousClass5xc extends AnonymousClass9NU implements C82424pb, C21659By5, C82034oy {
    public static final String __redex_internal_original_name = "AppreciationCreatorInsightsFragment";
    public final C04530Oa A00 = AnonymousClass0OY.A02(new KtLambdaShape27S0100000_I2_7(this, 37));
    public final C04530Oa A01 = AnonymousClass3W9.A00(this);
    public final C04530Oa A02;

    public final void Bmq() {
    }

    public final void configureActionBar(AnonymousClass4u2 r3) {
        C04220Ms.A0B(r3, 0);
        AnonymousClass4u2.A07(r3, 2131821420);
        C25764Drc drc = new C25764Drc();
        drc.A05 = R.drawable.instagram_info_pano_outline_24;
        drc.A04 = 2131821370;
        drc.A0C = C86134wK.A0P(this, 80);
        r3.A7Q(new C25435DlZ(drc));
    }

    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C04220Ms.A0B(view, 0);
        super.onViewCreated(view, bundle);
        getRecyclerView().A11(new C150728wn(getRecyclerView().A0H, new IDxLDelegateShape339S0100000_2_I2(this, 0), C19064Aq3.A0C));
        AnonymousClass061 r7 = AnonymousClass061.STARTED;
        AnonymousClass066 viewLifecycleOwner = getViewLifecycleOwner();
        C25237DiI.A00((Integer) null, (C27952Ew2) null, new KtSLambdaShape8S0301000_I2((Object) this, (Object) viewLifecycleOwner, (Object) r7, (C146958n9) null, 45), AnonymousClass067.A00(viewLifecycleOwner), 3);
        AnonymousClass066 viewLifecycleOwner2 = getViewLifecycleOwner();
        C25237DiI.A00((Integer) null, (C27952Ew2) null, new KtSLambdaShape8S0301000_I2((Object) this, (Object) viewLifecycleOwner2, (Object) r7, (C146958n9) null, 46), AnonymousClass067.A00(viewLifecycleOwner2), 3);
    }

    public final Collection getDefinitions() {
        AnonymousClass1lO[] r4;
        AnonymousClass1lO r0;
        char c = 1;
        if (C63803iN.A0E(AnonymousClass0TJ.A05, ((AnonymousClass57S) this.A02.getValue()).A04, 36321434616077082L)) {
            r4 = new AnonymousClass1lO[4];
            r4[0] = new AnonymousClass60S(requireActivity(), AnonymousClass0wJ.A0X(this.A01), new KtLambdaShape27S0100000_I2_7(this, 34));
            r4[1] = new AnonymousClass606();
            r4[2] = new AnonymousClass60D(new KtLambdaShape27S0100000_I2_7(this, 35));
            c = 3;
            r0 = new AnonymousClass60N(this, this);
        } else {
            r4 = new AnonymousClass1lO[2];
            r4[0] = new AnonymousClass60S(requireActivity(), AnonymousClass0wJ.A0X(this.A01), new KtLambdaShape27S0100000_I2_7(this, 36));
            r0 = new AnonymousClass606();
        }
        r4[c] = r0;
        return C06750aI.A17(r4);
    }

    public final AnonymousClass7Dm getRecyclerConfigBuilder() {
        return configBuilder(C78344iH.A00);
    }

    public final /* bridge */ /* synthetic */ C10300i6 getSession() {
        return AnonymousClass0wJ.A0U(this.A01);
    }

    public AnonymousClass5xc() {
        KtLambdaShape27S0100000_I2_7 ktLambdaShape27S0100000_I2_7 = new KtLambdaShape27S0100000_I2_7(this, 41);
        C04530Oa A012 = AnonymousClass0OY.A01(AnonymousClass006.A0C, new KtLambdaShape27S0100000_I2_7(new KtLambdaShape27S0100000_I2_7(this, 38), 39));
        this.A02 = C18220wO.A0M(new KtLambdaShape27S0100000_I2_7(A012, 40), ktLambdaShape27S0100000_I2_7, C86154wM.A11((Object) null, A012, 43), C18210wN.A0l(AnonymousClass57S.class));
    }

    public final void Bmo() {
        CreatorLoggingData A002 = AnonymousClass6LK.A00(requireArguments());
        ((C122027Jo) this.A00.getValue()).A08(Boolean.valueOf(A002.A01), Boolean.valueOf(A002.A02), AnonymousClass006.A1L, A002.A00);
    }

    public final boolean onBackPressed() {
        CreatorLoggingData A002 = AnonymousClass6LK.A00(requireArguments());
        ((C122027Jo) this.A00.getValue()).A08(Boolean.valueOf(A002.A01), Boolean.valueOf(A002.A02), AnonymousClass006.A1C, A002.A00);
        return false;
    }
}
